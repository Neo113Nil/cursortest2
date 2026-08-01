package com.onesignal.debug.internal.logging.otel.android;

import a.AbstractC0422a;
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
import u7.InterfaceC5087e;
import v7.C5135p;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class c implements F5.f {
    private final String apiBaseUrl;
    private final InterfaceC5087e appId$delegate;
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final InterfaceC5087e crashStoragePath$delegate;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final I7.a featureManagerProvider;
    private final I7.a getIsInForeground;
    private final com.onesignal.debug.internal.logging.otel.android.b idResolver;
    private final boolean isOtelExporterLoggingEnabled;
    private final InterfaceC5087e isRemoteLoggingEnabled$delegate;
    private final long minFileAgeForReadMillis;
    private final InterfaceC5087e onesignalId$delegate;
    private final String osBuildId;
    private final String osName;
    private final String osVersion;
    private final InterfaceC5087e pushSubscriptionId$delegate;
    private final InterfaceC5087e remoteLogLevel$delegate;
    private final String sdkBase;
    private final String sdkBaseVersion;
    private final String sdkWrapper;
    private final String sdkWrapperVersion;

    public static final class a extends i implements I7.a {
        public a() {
            super(0);
        }

        @Override // I7.a
        public final String invoke() {
            return c.this.idResolver.resolveAppId();
        }
    }

    public static final class b extends i implements I7.a {
        final /* synthetic */ com.onesignal.debug.internal.logging.otel.android.d $config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.debug.internal.logging.otel.android.d dVar) {
            super(0);
            this.$config = dVar;
        }

        @Override // I7.a
        public final String invoke() {
            String crashStoragePath = this.$config.getCrashStoragePath();
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: Crash logs stored at: " + crashStoragePath, null, 2, null);
            return crashStoragePath;
        }
    }

    /* renamed from: com.onesignal.debug.internal.logging.otel.android.c$c, reason: collision with other inner class name */
    public static final class C0199c extends i implements I7.a {
        public C0199c() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.idResolver.resolveRemoteLoggingEnabled());
        }
    }

    public static final class d extends i implements I7.a {
        public d() {
            super(0);
        }

        @Override // I7.a
        public final String invoke() {
            return c.this.idResolver.resolveOnesignalId();
        }
    }

    public static final class e extends i implements I7.a {
        public e() {
            super(0);
        }

        @Override // I7.a
        public final String invoke() {
            return c.this.idResolver.resolvePushSubscriptionId();
        }
    }

    public static final class f extends i implements I7.a {
        public f() {
            super(0);
        }

        @Override // I7.a
        public final String invoke() {
            try {
                M4.c resolveRemoteLogLevel = c.this.idResolver.resolveRemoteLogLevel();
                if (resolveRemoteLogLevel != null) {
                    return resolveRemoteLogLevel.name();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public c(com.onesignal.debug.internal.logging.otel.android.d config, I7.a featureManagerProvider) {
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
        this.appId$delegate = AbstractC0422a.q(new a());
        this.onesignalId$delegate = AbstractC0422a.q(new d());
        this.pushSubscriptionId$delegate = AbstractC0422a.q(new e());
        this.crashStoragePath$delegate = AbstractC0422a.q(new b(config));
        this.minFileAgeForReadMillis = com.anythink.basead.exoplayer.f.f7187a;
        this.isRemoteLoggingEnabled$delegate = AbstractC0422a.q(new C0199c());
        this.remoteLogLevel$delegate = AbstractC0422a.q(new f());
        this.apiBaseUrl = "https://api.onesignal.com/";
    }

    public static /* synthetic */ void getEnabledFeatureFlags$annotations() {
    }

    public static /* synthetic */ void getRemoteLogLevel$annotations() {
    }

    @Override // F5.f
    public String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    @Override // F5.f
    public String getAppId() {
        return (String) this.appId$delegate.getValue();
    }

    @Override // F5.f
    public String getAppIdForHeaders() {
        String appId = getAppId();
        return appId == null ? "" : appId;
    }

    @Override // F5.f
    public String getAppPackageId() {
        return this.appPackageId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r5.intValue() == 200) goto L42;
     */
    @Override // F5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAppState() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Object obj;
        Boolean bool;
        try {
            I7.a aVar = this.getIsInForeground;
            String str = "background";
            if (aVar == null || (bool = (Boolean) aVar.invoke()) == null) {
                Context context = this.context;
                if (context == null) {
                    return m.f16809e;
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
            return m.f16809e;
        }
    }

    @Override // F5.f
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // F5.f
    public String getCrashStoragePath() {
        return (String) this.crashStoragePath$delegate.getValue();
    }

    @Override // F5.f
    public String getCurrentThreadName() {
        String name = Thread.currentThread().getName();
        h.d(name, "getName(...)");
        return name;
    }

    @Override // F5.f
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Override // F5.f
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // F5.f
    public List<String> getEnabledFeatureFlags() {
        try {
            return ((D4.e) this.featureManagerProvider.invoke()).enabledFeatureKeys();
        } catch (Throwable unused) {
            return C5135p.f41442n;
        }
    }

    @Override // F5.f
    public Object getInstallId(InterfaceC5267d interfaceC5267d) {
        return this.idResolver.resolveInstallId();
    }

    @Override // F5.f
    public long getMinFileAgeForReadMillis() {
        return this.minFileAgeForReadMillis;
    }

    @Override // F5.f
    public String getOnesignalId() {
        return (String) this.onesignalId$delegate.getValue();
    }

    @Override // F5.f
    public String getOsBuildId() {
        return this.osBuildId;
    }

    @Override // F5.f
    public String getOsName() {
        return this.osName;
    }

    @Override // F5.f
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // F5.f
    public long getProcessUptime() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }

    @Override // F5.f
    public String getPushSubscriptionId() {
        return (String) this.pushSubscriptionId$delegate.getValue();
    }

    @Override // F5.f
    public String getRemoteLogLevel() {
        return (String) this.remoteLogLevel$delegate.getValue();
    }

    @Override // F5.f
    public String getSdkBase() {
        return this.sdkBase;
    }

    @Override // F5.f
    public String getSdkBaseVersion() {
        return this.sdkBaseVersion;
    }

    @Override // F5.f
    public String getSdkWrapper() {
        return this.sdkWrapper;
    }

    @Override // F5.f
    public String getSdkWrapperVersion() {
        return this.sdkWrapperVersion;
    }

    @Override // F5.f
    public boolean isOtelExporterLoggingEnabled() {
        return this.isOtelExporterLoggingEnabled;
    }

    public boolean isRemoteLoggingEnabled() {
        return ((Boolean) this.isRemoteLoggingEnabled$delegate.getValue()).booleanValue();
    }
}
