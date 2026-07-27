package com.onesignal.debug.internal.crash;

import I7.p;
import S0.s;
import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.h;
import u7.v;
import z7.C5273j;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class d implements I5.a {
    public static final b Companion = new b(null);
    private static final long MIN_TIME_BETWEEN_ANR_REPORTS_MS = 30000;
    private static final String TAG = "OtelAnrDetector";
    private final long anrThresholdMs;
    private final long checkIntervalMs;
    private final F5.b crashReporter;
    private final AtomicBoolean isMonitoring;
    private final AtomicLong lastAnrReportTime;
    private final AtomicLong lastResponseTime;
    private final F5.c logger;
    private final Handler mainHandler;
    private Runnable mainThreadRunnable;
    private Runnable watchdogRunnable;
    private Thread watchdogThread;

    public static final class a extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message, StackTraceElement[] stackTrace) {
            super(message);
            h.e(message, "message");
            h.e(stackTrace, "stackTrace");
            setStackTrace(stackTrace);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends B7.h implements p {
        final /* synthetic */ a $anrException;
        final /* synthetic */ Thread $mainThread;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Thread thread, a aVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$mainThread = thread;
            this.$anrException = aVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return d.this.new c(this.$mainThread, this.$anrException, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((c) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                F5.b bVar = d.this.crashReporter;
                Thread thread = this.$mainThread;
                a aVar2 = this.$anrException;
                this.label = 1;
                if (((s) bVar).o(thread, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41350a;
        }
    }

    public d(F5.d openTelemetryCrash, F5.c logger, long j6, long j9) {
        h.e(openTelemetryCrash, "openTelemetryCrash");
        h.e(logger, "logger");
        this.logger = logger;
        this.anrThresholdMs = j6;
        this.checkIntervalMs = j9;
        this.crashReporter = new s(2, openTelemetryCrash, logger);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.isMonitoring = new AtomicBoolean(false);
        this.lastResponseTime = new AtomicLong(System.currentTimeMillis());
        this.lastAnrReportTime = new AtomicLong(0L);
    }

    private final void checkForAnr() {
        Runnable runnable = this.mainThreadRunnable;
        if (runnable == null) {
            return;
        }
        this.mainHandler.post(runnable);
        Thread.sleep(this.checkIntervalMs);
        long currentTimeMillis = System.currentTimeMillis() - this.lastResponseTime.get();
        if (currentTimeMillis > this.anrThresholdMs) {
            handleAnrDetected(currentTimeMillis);
        } else {
            handleMainThreadResponsive();
        }
    }

    private final void handleAnrDetected(long j6) {
        long currentTimeMillis = System.currentTimeMillis();
        long j9 = currentTimeMillis - this.lastAnrReportTime.get();
        if (j9 > MIN_TIME_BETWEEN_ANR_REPORTS_MS) {
            this.logger.info("OtelAnrDetector: ⚠️ ANR detected! Main thread unresponsive for " + j6 + "ms");
            this.lastAnrReportTime.set(currentTimeMillis);
            reportAnr(j6);
            return;
        }
        this.logger.debug("OtelAnrDetector: ANR still ongoing (" + j6 + "ms), but already reported recently (" + j9 + "ms ago)");
    }

    private final void handleMainThreadResponsive() {
        if (this.lastAnrReportTime.get() > 0) {
            this.lastAnrReportTime.set(0L);
            this.logger.debug("OtelAnrDetector: Main thread recovered, ready to detect new ANRs");
        }
    }

    private final void reportAnr(long j6) {
        try {
            this.logger.info("OtelAnrDetector: Checking if ANR is OneSignal-related (unresponsive for " + j6 + "ms)");
            Thread thread = Looper.getMainLooper().getThread();
            h.d(thread, "getThread(...)");
            StackTraceElement[] stackTrace = thread.getStackTrace();
            h.b(stackTrace);
            if (!X2.e.J(stackTrace)) {
                this.logger.debug("OtelAnrDetector: ANR is not OneSignal-related, skipping report");
                return;
            }
            this.logger.info("OtelAnrDetector: OneSignal-related ANR detected, reporting...");
            AbstractC0406y.s(C5273j.f42269n, new c(thread, new a("Application Not Responding: Main thread blocked for " + j6 + "ms", stackTrace), null));
            this.logger.info("OtelAnrDetector: ✅ ANR report saved successfully");
        } catch (Throwable th) {
            this.logger.error("OtelAnrDetector: Failed to report ANR: " + th.getMessage() + " - " + th.getClass().getSimpleName());
        }
    }

    private final void setupRunnables() {
        final int i = 0;
        this.mainThreadRunnable = new Runnable(this) { // from class: com.onesignal.debug.internal.crash.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f36956u;

            {
                this.f36956u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        d.setupRunnables$lambda$0(this.f36956u);
                        break;
                    default:
                        d.setupRunnables$lambda$1(this.f36956u);
                        break;
                }
            }
        };
        final int i6 = 1;
        this.watchdogRunnable = new Runnable(this) { // from class: com.onesignal.debug.internal.crash.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f36956u;

            {
                this.f36956u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        d.setupRunnables$lambda$0(this.f36956u);
                        break;
                    default:
                        d.setupRunnables$lambda$1(this.f36956u);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$0(d this$0) {
        h.e(this$0, "this$0");
        this$0.lastResponseTime.set(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRunnables$lambda$1(d this$0) {
        h.e(this$0, "this$0");
        while (this$0.isMonitoring.get()) {
            try {
                this$0.checkForAnr();
            } catch (InterruptedException unused) {
                this$0.logger.info("OtelAnrDetector: Watchdog thread interrupted, stopping ANR detection");
                return;
            } catch (Throwable th) {
                this$0.logger.error("OtelAnrDetector: Error in ANR watchdog: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
        }
    }

    private final void startWatchdogThread() {
        Thread thread = new Thread(this.watchdogRunnable, "OneSignal-ANR-Watchdog");
        this.watchdogThread = thread;
        thread.setDaemon(true);
        Thread thread2 = this.watchdogThread;
        if (thread2 != null) {
            thread2.start();
        }
    }

    @Override // I5.a
    public void start() {
        if (this.isMonitoring.getAndSet(true)) {
            this.logger.warn("OtelAnrDetector: Already monitoring for ANRs, skipping start");
            return;
        }
        this.logger.info("OtelAnrDetector: Starting ANR detection (threshold: " + this.anrThresholdMs + "ms, check interval: " + this.checkIntervalMs + "ms)");
        setupRunnables();
        startWatchdogThread();
        this.logger.info("OtelAnrDetector: ✅ ANR detection started successfully");
    }

    @Override // I5.a
    public void stop() {
        if (!this.isMonitoring.getAndSet(false)) {
            this.logger.warn("OtelAnrDetector: Not monitoring, skipping stop");
            return;
        }
        this.logger.info("OtelAnrDetector: Stopping ANR detection...");
        Thread thread = this.watchdogThread;
        if (thread != null) {
            thread.interrupt();
        }
        this.watchdogThread = null;
        this.watchdogRunnable = null;
        Runnable runnable = this.mainThreadRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.mainThreadRunnable = null;
        this.logger.info("OtelAnrDetector: ✅ ANR detection stopped");
    }

    public /* synthetic */ d(F5.d dVar, F5.c cVar, long j6, long j9, int i, kotlin.jvm.internal.e eVar) {
        this(dVar, cVar, (i & 4) != 0 ? com.anythink.basead.exoplayer.f.f7187a : j6, (i & 8) != 0 ? com.anythink.basead.exoplayer.i.a.f7883f : j9);
    }
}
