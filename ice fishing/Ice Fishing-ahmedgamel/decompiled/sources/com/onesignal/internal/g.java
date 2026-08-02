package com.onesignal.internal;

import F5.m;
import I0.j;
import I7.l;
import I7.p;
import I7.q;
import I7.r;
import N3.C;
import android.content.Context;
import com.onesignal.internal.e;
import u7.InterfaceC5079e;

/* loaded from: classes2.dex */
public final class g implements com.onesignal.common.modeling.g {
    private I5.a anrDetector;
    private final r anrDetectorFactory;
    private final Context context;
    private F5.a crashHandler;
    private final q crashHandlerFactory;
    private com.onesignal.internal.d currentConfig;
    private final I7.a featureManagerProvider;
    private final Object lock;
    private final InterfaceC5079e logger$delegate;
    private final I7.a loggerFactory;
    private final InterfaceC5079e platformProvider$delegate;
    private final p platformProviderFactory;
    private F5.e remoteTelemetry;
    private final l remoteTelemetryFactory;

    public static final class a extends kotlin.jvm.internal.i implements q {
        public static final a INSTANCE = new a();

        public a() {
            super(3);
        }

        @Override // I7.q
        public final F5.a invoke(Context ctx, F5.c log, I7.a fm) {
            kotlin.jvm.internal.h.e(ctx, "ctx");
            kotlin.jvm.internal.h.e(log, "log");
            kotlin.jvm.internal.h.e(fm, "fm");
            return com.onesignal.debug.internal.crash.a.INSTANCE.createCrashHandler(ctx, log, fm);
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements r {
        public static final b INSTANCE = new b();

        public b() {
            super(4);
        }

        public final I5.a invoke(F5.f pp, F5.c log, long j6, long j9) {
            kotlin.jvm.internal.h.e(pp, "pp");
            kotlin.jvm.internal.h.e(log, "log");
            return com.onesignal.debug.internal.crash.e.createAnrDetector(pp, log, j6, j9);
        }

        @Override // I7.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((F5.f) obj, (F5.c) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue());
        }
    }

    public static final class c extends kotlin.jvm.internal.i implements l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // I7.l
        public final F5.e invoke(F5.f pp) {
            kotlin.jvm.internal.h.e(pp, "pp");
            return new m(pp, new j(6, pp), new n4.c(7, pp));
        }
    }

    public static final class d extends kotlin.jvm.internal.i implements p {
        public static final d INSTANCE = new d();

        public d() {
            super(2);
        }

        @Override // I7.p
        public final com.onesignal.debug.internal.logging.otel.android.c invoke(Context ctx, I7.a fm) {
            kotlin.jvm.internal.h.e(ctx, "ctx");
            kotlin.jvm.internal.h.e(fm, "fm");
            return com.onesignal.debug.internal.logging.otel.android.e.createAndroidOtelPlatformProvider(ctx, fm);
        }
    }

    public static final class e extends kotlin.jvm.internal.i implements I7.a {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.debug.internal.logging.otel.android.a invoke() {
            return new com.onesignal.debug.internal.logging.otel.android.a();
        }
    }

    public static final class f extends kotlin.jvm.internal.i implements l {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // I7.l
        public final Boolean invoke(M4.c it) {
            kotlin.jvm.internal.h.e(it, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.onesignal.internal.g$g, reason: collision with other inner class name */
    public static final class C0217g extends kotlin.jvm.internal.i implements I7.a {
        public C0217g() {
            super(0);
        }

        @Override // I7.a
        public final F5.c invoke() {
            return (F5.c) g.this.loggerFactory.invoke();
        }
    }

    public static final class h extends kotlin.jvm.internal.i implements I7.a {
        public h() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.debug.internal.logging.otel.android.c invoke() {
            return (com.onesignal.debug.internal.logging.otel.android.c) g.this.platformProviderFactory.invoke(g.this.context, g.this.featureManagerProvider);
        }
    }

    public static final class i extends kotlin.jvm.internal.i implements l {
        final /* synthetic */ M4.c $logLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(M4.c cVar) {
            super(1);
            this.$logLevel = cVar;
        }

        @Override // I7.l
        public final Boolean invoke(M4.c level) {
            kotlin.jvm.internal.h.e(level, "level");
            M4.c cVar = this.$logLevel;
            return Boolean.valueOf(cVar != M4.c.NONE && level.compareTo(cVar) <= 0);
        }
    }

    public g(Context context, I7.a featureManagerProvider, q crashHandlerFactory, r anrDetectorFactory, l remoteTelemetryFactory, p platformProviderFactory, I7.a loggerFactory) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(featureManagerProvider, "featureManagerProvider");
        kotlin.jvm.internal.h.e(crashHandlerFactory, "crashHandlerFactory");
        kotlin.jvm.internal.h.e(anrDetectorFactory, "anrDetectorFactory");
        kotlin.jvm.internal.h.e(remoteTelemetryFactory, "remoteTelemetryFactory");
        kotlin.jvm.internal.h.e(platformProviderFactory, "platformProviderFactory");
        kotlin.jvm.internal.h.e(loggerFactory, "loggerFactory");
        this.context = context;
        this.featureManagerProvider = featureManagerProvider;
        this.crashHandlerFactory = crashHandlerFactory;
        this.anrDetectorFactory = anrDetectorFactory;
        this.remoteTelemetryFactory = remoteTelemetryFactory;
        this.platformProviderFactory = platformProviderFactory;
        this.loggerFactory = loggerFactory;
        this.lock = new Object();
        this.platformProvider$delegate = C.O(new h());
        this.logger$delegate = C.O(new C0217g());
    }

    private final void applyAction(com.onesignal.internal.e eVar, com.onesignal.internal.d dVar) {
        if (eVar instanceof e.b) {
            M4.c logLevel = dVar.getLogLevel();
            if (logLevel == null) {
                logLevel = M4.c.ERROR;
            }
            enableFeatures(logLevel);
        } else if (eVar instanceof e.a) {
            disableFeatures();
        } else if (eVar instanceof e.d) {
            updateLogLevel(((e.d) eVar).getNewLevel());
        } else if (eVar instanceof e.c) {
            com.onesignal.debug.internal.logging.b.debug$default("OneSignal: Otel config unchanged, no action needed", null, 2, null);
        }
        this.currentConfig = dVar;
    }

    private final void disableFeatures() {
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Disabling Otel features", null, 2, null);
        try {
            I5.a aVar = this.anrDetector;
            if (aVar != null) {
                aVar.stop();
            }
            this.anrDetector = null;
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error stopping ANR detector: " + th.getMessage(), th);
        }
        try {
            F5.a aVar2 = this.crashHandler;
            if (aVar2 != null) {
                I5.c cVar = (I5.c) aVar2;
                if (cVar.f1331e) {
                    cVar.f1328b.info("OtelCrashHandler: Unregistering — restoring previous exception handler");
                    Thread.setDefaultUncaughtExceptionHandler(cVar.f1329c);
                    cVar.f1329c = null;
                    cVar.f1331e = false;
                } else {
                    cVar.f1328b.debug("OtelCrashHandler: Not initialized, nothing to unregister");
                }
            }
            this.crashHandler = null;
        } catch (Throwable th2) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error unregistering crash handler: " + th2.getMessage(), th2);
        }
        try {
            com.onesignal.debug.internal.logging.b.INSTANCE.setOtelTelemetry(null, f.INSTANCE);
            Object obj = this.remoteTelemetry;
            if (obj != null) {
                F5.j jVar = (F5.j) obj;
                synchronized (jVar.f1003c) {
                    try {
                        X6.d dVar = jVar.f1004d;
                        if (dVar != null) {
                            dVar.shutdown();
                        }
                    } catch (Throwable unused) {
                    }
                    jVar.f1004d = null;
                }
            }
            this.remoteTelemetry = null;
        } catch (Throwable th3) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Error disabling Otel logging: " + th3.getMessage(), th3);
        }
    }

    private final void enableFeatures(M4.c cVar) {
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Enabling Otel features at level " + cVar, null, 2, null);
        try {
            startCrashHandler();
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to start crash handler: " + th.getMessage(), th);
        }
        try {
            startAnrDetector();
        } catch (Throwable th2) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to start ANR detector: " + th2.getMessage(), th2);
        }
        try {
            startOtelLogging(cVar);
        } catch (Throwable th3) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to start Otel logging: " + th3.getMessage(), th3);
        }
    }

    private final F5.c getLogger() {
        return (F5.c) this.logger$delegate.getValue();
    }

    private final com.onesignal.debug.internal.logging.otel.android.c getPlatformProvider() {
        return (com.onesignal.debug.internal.logging.otel.android.c) this.platformProvider$delegate.getValue();
    }

    private final com.onesignal.internal.d readCurrentCachedConfig() {
        return new com.onesignal.internal.d(getPlatformProvider().isRemoteLoggingEnabled(), M4.c.Companion.fromString(getPlatformProvider().getRemoteLogLevel()));
    }

    private final void startAnrDetector() {
        if (this.anrDetector != null) {
            return;
        }
        I5.a aVar = (I5.a) this.anrDetectorFactory.invoke(getPlatformProvider(), getLogger(), Long.valueOf(com.anythink.basead.exoplayer.f.f7973a), Long.valueOf(com.anythink.basead.exoplayer.i.a.f8669f));
        aVar.start();
        this.anrDetector = aVar;
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: ANR detector started", null, 2, null);
    }

    private final void startCrashHandler() {
        if (this.crashHandler != null) {
            return;
        }
        F5.a aVar = (F5.a) this.crashHandlerFactory.invoke(this.context, getLogger(), this.featureManagerProvider);
        I5.c cVar = (I5.c) aVar;
        if (cVar.f1331e) {
            cVar.f1328b.warn("OtelCrashHandler already initialized, skipping");
        } else {
            cVar.f1328b.info("OtelCrashHandler: Setting up uncaught exception handler...");
            cVar.f1329c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(cVar);
            cVar.f1331e = true;
            cVar.f1328b.info("OtelCrashHandler: ✅ Successfully initialized and registered as default uncaught exception handler");
        }
        this.crashHandler = aVar;
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Crash handler initialized — logs at: " + getPlatformProvider().getCrashStoragePath(), null, 2, null);
    }

    private final void startOtelLogging(M4.c cVar) {
        Object obj = this.remoteTelemetry;
        if (obj != null) {
            F5.j jVar = (F5.j) obj;
            synchronized (jVar.f1003c) {
                try {
                    X6.d dVar = jVar.f1004d;
                    if (dVar != null) {
                        dVar.shutdown();
                    }
                } catch (Throwable unused) {
                }
                jVar.f1004d = null;
            }
        }
        F5.e eVar = (F5.e) this.remoteTelemetryFactory.invoke(getPlatformProvider());
        this.remoteTelemetry = eVar;
        com.onesignal.debug.internal.logging.b.INSTANCE.setOtelTelemetry(eVar, new i(cVar));
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Otel logging active at level " + cVar, null, 2, null);
    }

    private final void updateLogLevel(M4.c cVar) {
        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Updating Otel log level to " + cVar, null, 2, null);
        try {
            startOtelLogging(cVar);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to update Otel log level: " + th.getMessage(), th);
        }
    }

    public final void initializeFromCachedConfig() {
        if (!com.onesignal.debug.internal.crash.f.INSTANCE.isSupported()) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: Device SDK < 26, Otel not supported — skipping all Otel features", null, 2, null);
            return;
        }
        try {
            com.onesignal.internal.d readCurrentCachedConfig = readCurrentCachedConfig();
            synchronized (this.lock) {
                applyAction(com.onesignal.internal.f.INSTANCE.evaluate(this.currentConfig, readCurrentCachedConfig), readCurrentCachedConfig);
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to initialize Otel from cached config: " + th.getMessage(), th);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
    }

    public final void subscribeToConfigStore(com.onesignal.core.internal.config.c configModelStore) {
        kotlin.jvm.internal.h.e(configModelStore, "configModelStore");
        configModelStore.subscribe((com.onesignal.common.modeling.g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (tag.equals("HYDRATE") && com.onesignal.debug.internal.crash.f.INSTANCE.isSupported()) {
            try {
                com.onesignal.internal.d dVar = new com.onesignal.internal.d(model.getRemoteLoggingParams().isEnabled(), model.getRemoteLoggingParams().getLogLevel());
                synchronized (this.lock) {
                    applyAction(com.onesignal.internal.f.INSTANCE.evaluate(this.currentConfig, dVar), dVar);
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to refresh Otel from remote config: " + th.getMessage(), th);
            }
        }
    }

    public /* synthetic */ g(Context context, I7.a aVar, q qVar, r rVar, l lVar, p pVar, I7.a aVar2, int i4, kotlin.jvm.internal.e eVar) {
        this(context, aVar, (i4 & 4) != 0 ? a.INSTANCE : qVar, (i4 & 8) != 0 ? b.INSTANCE : rVar, (i4 & 16) != 0 ? c.INSTANCE : lVar, (i4 & 32) != 0 ? d.INSTANCE : pVar, (i4 & 64) != 0 ? e.INSTANCE : aVar2);
    }
}
