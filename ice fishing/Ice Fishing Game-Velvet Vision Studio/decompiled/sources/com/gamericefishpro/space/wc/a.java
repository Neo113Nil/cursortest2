package com.gamericefishpro.space.wc;

import android.content.Context;
import android.content.pm.PackageManager;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.vc.c;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.common.AndroidUtils;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    public static final C0066a Companion = new C0066a(null);
    private static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private static final int HMS_AVAILABLE_SUCCESSFUL = 0;
    private static final String HMS_CORE_SERVICES_PACKAGE = "com.huawei.hwid";
    private static final String PREFER_HMS_METADATA_NAME = "com.onesignal.preferHMS";
    private final f _applicationService;

    /* JADX INFO: renamed from: com.gamericefishpro.space.wc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0066a {
        public /* synthetic */ C0066a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0066a() {
        }
    }

    public a(f _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
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

    private final boolean isHMSCoreInstalledAndEnabled() throws IllegalAccessException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            Object objInvoke = cls.getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(cls.getMethod("getInstance", null).invoke(null, null), this._applicationService.getAppContext());
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue() == 0;
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

    @Override // com.gamericefishpro.space.vc.c
    public com.gamericefishpro.space.vc.a getDeviceType() {
        if (supportsADM()) {
            return com.gamericefishpro.space.vc.a.Fire;
        }
        boolean supportsHMS = getSupportsHMS();
        boolean zSupportsGooglePush = supportsGooglePush();
        if (zSupportsGooglePush && supportsHMS) {
            return AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), PREFER_HMS_METADATA_NAME) ? com.gamericefishpro.space.vc.a.Huawei : com.gamericefishpro.space.vc.a.Android;
        }
        if (zSupportsGooglePush) {
            return com.gamericefishpro.space.vc.a.Android;
        }
        if (supportsHMS) {
            return com.gamericefishpro.space.vc.a.Huawei;
        }
        if (isGMSInstalledAndEnabled()) {
            return com.gamericefishpro.space.vc.a.Android;
        }
        return isHMSCoreInstalledAndEnabledFallback() ? com.gamericefishpro.space.vc.a.Huawei : com.gamericefishpro.space.vc.a.Android;
    }

    @Override // com.gamericefishpro.space.vc.c
    public boolean getHasAllHMSLibrariesForPushKit() {
        return hasHMSAGConnectLibrary() && hasHMSPushKitLibrary();
    }

    @Override // com.gamericefishpro.space.vc.c
    public boolean getHasFCMLibrary() {
        try {
            u uVar = FirebaseMessaging.k;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.gamericefishpro.space.vc.c
    public com.gamericefishpro.space.vc.b getJetpackLibraryStatus() {
        return !AndroidUtils.INSTANCE.hasNotificationManagerCompat() ? com.gamericefishpro.space.vc.b.MISSING : com.gamericefishpro.space.vc.b.OK;
    }

    @Override // com.gamericefishpro.space.vc.c
    public boolean getSupportsHMS() {
        if (hasHMSAvailabilityLibrary() && getHasAllHMSLibrariesForPushKit()) {
            return isHMSCoreInstalledAndEnabled();
        }
        return false;
    }

    @Override // com.gamericefishpro.space.vc.c
    public boolean isAndroidDeviceType() {
        return getDeviceType() == com.gamericefishpro.space.vc.a.Android;
    }

    @Override // com.gamericefishpro.space.vc.c
    public boolean isFireOSDeviceType() {
        return getDeviceType() == com.gamericefishpro.space.vc.a.Fire;
    }

    @Override // com.gamericefishpro.space.vc.c
    public boolean isGMSInstalledAndEnabled() {
        return packageInstalledAndEnabled(GOOGLE_PLAY_SERVICES_PACKAGE);
    }

    @Override // com.gamericefishpro.space.vc.c
    public boolean isHuaweiDeviceType() {
        return getDeviceType() == com.gamericefishpro.space.vc.a.Huawei;
    }

    @Override // com.gamericefishpro.space.vc.c
    public boolean supportsGooglePush() {
        if (getHasFCMLibrary()) {
            return isGMSInstalledAndEnabled();
        }
        return false;
    }
}
