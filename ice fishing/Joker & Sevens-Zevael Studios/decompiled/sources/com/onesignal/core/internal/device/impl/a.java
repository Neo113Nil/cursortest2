package com.onesignal.core.internal.device.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.common.AndroidUtils;
import d8.v;
import pc.j;
import q8.f;
import v8.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements c {
    public static final C0016a Companion = new C0016a(null);
    private static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private static final int HMS_AVAILABLE_SUCCESSFUL = 0;
    private static final String HMS_CORE_SERVICES_PACKAGE = "com.huawei.hwid";
    private static final String PREFER_HMS_METADATA_NAME = "com.onesignal.preferHMS";
    private final f _applicationService;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.device.impl.a$a, reason: collision with other inner class name */
    public static final class C0016a {
        public /* synthetic */ C0016a(pc.f fVar) {
            this();
        }

        private C0016a() {
        }
    }

    public a(f fVar) {
        j.e(fVar, "_applicationService");
        this._applicationService = fVar;
    }

    private final boolean hasHMSAGConnectLibrary() {
        try {
            Class.forName("com.huawei.agconnect.config.AGConnectServicesConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSAvailabilityLibrary() {
        try {
            Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSPushKitLibrary() {
        try {
            Class.forName("com.huawei.hms.aaid.HmsInstanceId");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isHMSCoreInstalledAndEnabled() {
        try {
            Class<?> cls = Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            Object invoke = cls.getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(cls.getMethod("getInstance", null).invoke(null, null), this._applicationService.getAppContext());
            j.c(invoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) invoke).intValue() == 0;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isHMSCoreInstalledAndEnabledFallback() {
        return packageInstalledAndEnabled(HMS_CORE_SERVICES_PACKAGE);
    }

    private final boolean packageInstalledAndEnabled(String str) {
        try {
            return this._applicationService.getAppContext().getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private final boolean supportsADM() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // v8.c
    public v8.a getDeviceType() {
        if (supportsADM()) {
            return v8.a.Fire;
        }
        boolean supportsHMS = getSupportsHMS();
        boolean supportsGooglePush = supportsGooglePush();
        if (supportsGooglePush && supportsHMS) {
            return AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), PREFER_HMS_METADATA_NAME) ? v8.a.Huawei : v8.a.Android;
        }
        return supportsGooglePush ? v8.a.Android : supportsHMS ? v8.a.Huawei : isGMSInstalledAndEnabled() ? v8.a.Android : isHMSCoreInstalledAndEnabledFallback() ? v8.a.Huawei : v8.a.Android;
    }

    @Override // v8.c
    public boolean getHasAllHMSLibrariesForPushKit() {
        return hasHMSAGConnectLibrary() && hasHMSPushKitLibrary();
    }

    @Override // v8.c
    public boolean getHasFCMLibrary() {
        try {
            v vVar = FirebaseMessaging.f1457k;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // v8.c
    public v8.b getJetpackLibraryStatus() {
        return !AndroidUtils.INSTANCE.hasNotificationManagerCompat() ? v8.b.MISSING : v8.b.OK;
    }

    @Override // v8.c
    public boolean getSupportsHMS() {
        if (hasHMSAvailabilityLibrary() && getHasAllHMSLibrariesForPushKit()) {
            return isHMSCoreInstalledAndEnabled();
        }
        return false;
    }

    @Override // v8.c
    public boolean isAndroidDeviceType() {
        return getDeviceType() == v8.a.Android;
    }

    @Override // v8.c
    public boolean isFireOSDeviceType() {
        return getDeviceType() == v8.a.Fire;
    }

    @Override // v8.c
    public boolean isGMSInstalledAndEnabled() {
        return packageInstalledAndEnabled(GOOGLE_PLAY_SERVICES_PACKAGE);
    }

    @Override // v8.c
    public boolean isHuaweiDeviceType() {
        return getDeviceType() == v8.a.Huawei;
    }

    @Override // v8.c
    public boolean supportsGooglePush() {
        if (getHasFCMLibrary()) {
            return isGMSInstalledAndEnabled();
        }
        return false;
    }
}
