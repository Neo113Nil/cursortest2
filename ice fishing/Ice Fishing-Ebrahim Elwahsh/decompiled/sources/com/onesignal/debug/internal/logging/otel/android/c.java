package com.onesignal.debug.internal.logging.otel.android;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.anythink.core.common.v.m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import q7.InterfaceC4936e;
import r7.C4985p;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public final class c implements B5.f {
    private final String apiBaseUrl;
    private final InterfaceC4936e appId$delegate;
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final InterfaceC4936e crashStoragePath$delegate;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final E7.a featureManagerProvider;
    private final E7.a getIsInForeground;
    private final com.onesignal.debug.internal.logging.otel.android.b idResolver;
    private final boolean isOtelExporterLoggingEnabled;
    private final InterfaceC4936e isRemoteLoggingEnabled$delegate;
    private final long minFileAgeForReadMillis;
    private final InterfaceC4936e onesignalId$delegate;
    private final String osBuildId;
    private final String osName;
    private final String osVersion;
    private final InterfaceC4936e pushSubscriptionId$delegate;
    private final InterfaceC4936e remoteLogLevel$delegate;
    private final String sdkBase;
    private final String sdkBaseVersion;
    private final String sdkWrapper;
    private final String sdkWrapperVersion;

    public static final class a extends i implements E7.a {
        public a() {
            super(0);
        }

        @Override // E7.a
        public final String invoke() {
            return c.this.idResolver.resolveAppId();
        }
    }

    public static final class b extends i implements E7.a {
        final /* synthetic */ com.onesignal.debug.internal.logging.otel.android.d $config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.debug.internal.logging.otel.android.d dVar) {
            super(0);
            this.$config = dVar;
        }

        @Override // E7.a
        public final String invoke() {
            String crashStoragePath = this.$config.getCrashStoragePath();
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: Crash logs stored at: " + crashStoragePath, null, 2, null);
            return crashStoragePath;
        }
    }

    /* renamed from: com.onesignal.debug.internal.logging.otel.android.c$c, reason: collision with other inner class name */
    public static final class C0198c extends i implements E7.a {
        public C0198c() {
            super(0);
        }

        @Override // E7.a
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.idResolver.resolveRemoteLoggingEnabled());
        }
    }

    public static final class d extends i implements E7.a {
        public d() {
            super(0);
        }

        @Override // E7.a
        public final String invoke() {
            return c.this.idResolver.resolveOnesignalId();
        }
    }

    public static final class e extends i implements E7.a {
        public e() {
            super(0);
        }

        @Override // E7.a
        public final String invoke() {
            return c.this.idResolver.resolvePushSubscriptionId();
        }
    }

    public static final class f extends i implements E7.a {
        public f() {
            super(0);
        }

        @Override // E7.a
        public final String invoke() {
            try {
                I4.c resolveRemoteLogLevel = c.this.idResolver.resolveRemoteLogLevel();
                if (resolveRemoteLogLevel != null) {
                    return resolveRemoteLogLevel.name();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public c(com.onesignal.debug.internal.logging.otel.android.d config, E7.a featureManagerProvider) {
        h.e(config, "config");
        h.e(featureManagerProvider, "featureManagerProvider");
        this.featureManagerProvider = featureManagerProvider;
        this.appPackageId = config.getAppPackageId();
        this.appVersion = config.getAppVersion();
        Context context = config.getContext();
        this.context = context;
        this.getIsInForeground = config.getGetIsInForeground();
        this.idResolver = new com.onesignal.debug.internal.logging.otel.android.b(context);
        this.sdkBase = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;
        this.sdkBaseVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
        String MANUFACTURER = Build.MANUFACTURER;
        h.d(MANUFACTURER, "MANUFACTURER");
        this.deviceManufacturer = MANUFACTURER;
        String MODEL = Build.MODEL;
        h.d(MODEL, "MODEL");
        this.deviceModel = MODEL;
        this.osName = "Android";
        String RELEASE = Build.VERSION.RELEASE;
        h.d(RELEASE, "RELEASE");
        this.osVersion = RELEASE;
        String ID = Build.ID;
        h.d(ID, "ID");
        this.osBuildId = ID;
        this.sdkWrapper = com.onesignal.common.i.getSdkType();
        this.sdkWrapperVersion = com.onesignal.common.i.getSdkVersion();
        this.appId$delegate = com.bumptech.glide.e.q(new a());
        this.onesignalId$delegate = com.bumptech.glide.e.q(new d());
        this.pushSubscriptionId$delegate = com.bumptech.glide.e.q(new e());
        this.crashStoragePath$delegate = com.bumptech.glide.e.q(new b(config));
        this.minFileAgeForReadMillis = com.anythink.basead.exoplayer.f.f7344a;
        this.isRemoteLoggingEnabled$delegate = com.bumptech.glide.e.q(new C0198c());
        this.remoteLogLevel$delegate = com.bumptech.glide.e.q(new f());
        this.apiBaseUrl = "https://api.onesignal.com/";
    }

    public static /* synthetic */ void getEnabledFeatureFlags$annotations() {
    }

    public static /* synthetic */ void getRemoteLogLevel$annotations() {
    }

    @Override // B5.f
    public String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    @Override // B5.f
    public String getAppId() {
        return (String) this.appId$delegate.getValue();
    }

    @Override // B5.f
    public String getAppIdForHeaders() {
        String appId = getAppId();
        return appId == null ? "" : appId;
    }

    @Override // B5.f
    public String getAppPackageId() {
        return this.appPackageId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r5.intValue() == 200) goto L42;
     */
    @Override // B5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAppState() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Object obj;
        Boolean bool;
        try {
            E7.a aVar = this.getIsInForeground;
            String str = "background";
            if (aVar == null || (bool = (Boolean) aVar.invoke()) == null) {
                Context context = this.context;
                if (context == null) {
                    return m.f16967e;
                }
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) obj).pid == Process.myPid()) {
                            break;
                        }
                    }
                    runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                } else {
                    runningAppProcessInfo = null;
                }
                Integer valueOf = runningAppProcessInfo != null ? Integer.valueOf(runningAppProcessInfo.importance) : null;
                if (valueOf != null && valueOf.intValue() == 100) {
                    return "foreground";
                }
            } else if (bool.booleanValue()) {
                str = "foreground";
            }
            return str;
        } catch (Exception unused) {
            return m.f16967e;
        }
    }

    @Override // B5.f
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // B5.f
    public String getCrashStoragePath() {
        return (String) this.crashStoragePath$delegate.getValue();
    }

    @Override // B5.f
    public String getCurrentThreadName() {
        String name = Thread.currentThread().getName();
        h.d(name, "getName(...)");
        return name;
    }

    @Override // B5.f
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Override // B5.f
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // B5.f
    public List<String> getEnabledFeatureFlags() {
        try {
            return ((z4.e) this.featureManagerProvider.invoke()).enabledFeatureKeys();
        } catch (Throwable unused) {
            return C4985p.f40358n;
        }
    }

    @Override // B5.f
    public Object getInstallId(InterfaceC5133d interfaceC5133d) {
        return this.idResolver.resolveInstallId();
    }

    @Override // B5.f
    public long getMinFileAgeForReadMillis() {
        return this.minFileAgeForReadMillis;
    }

    @Override // B5.f
    public String getOnesignalId() {
        return (String) this.onesignalId$delegate.getValue();
    }

    @Override // B5.f
    public String getOsBuildId() {
        return this.osBuildId;
    }

    @Override // B5.f
    public String getOsName() {
        return this.osName;
    }

    @Override // B5.f
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // B5.f
    public long getProcessUptime() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }

    @Override // B5.f
    public String getPushSubscriptionId() {
        return (String) this.pushSubscriptionId$delegate.getValue();
    }

    @Override // B5.f
    public String getRemoteLogLevel() {
        return (String) this.remoteLogLevel$delegate.getValue();
    }

    @Override // B5.f
    public String getSdkBase() {
        return this.sdkBase;
    }

    @Override // B5.f
    public String getSdkBaseVersion() {
        return this.sdkBaseVersion;
    }

    @Override // B5.f
    public String getSdkWrapper() {
        return this.sdkWrapper;
    }

    @Override // B5.f
    public String getSdkWrapperVersion() {
        return this.sdkWrapperVersion;
    }

    @Override // B5.f
    public boolean isOtelExporterLoggingEnabled() {
        return this.isOtelExporterLoggingEnabled;
    }

    public boolean isRemoteLoggingEnabled() {
        return ((Boolean) this.isRemoteLoggingEnabled$delegate.getValue()).booleanValue();
    }
}
