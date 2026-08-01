package com.onesignal.debug.internal.logging;

import B7.h;
import F5.e;
import F5.o;
import I7.l;
import I7.p;
import Q7.k;
import S7.AbstractC0406y;
import S7.F;
import S7.InterfaceC0404w;
import S7.o0;
import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.i;
import u7.v;
import x4.f;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b {
    private static final String TAG = "OneSignal";
    private static f applicationService;
    private static volatile e otelRemoteTelemetry;
    public static final b INSTANCE = new b();
    private static final CopyOnWriteArraySet<M4.b> logListeners = new CopyOnWriteArraySet<>();
    private static volatile l shouldSendLogLevel = c.INSTANCE;
    private static final InterfaceC0404w otelLoggingScope = AbstractC0406y.b(A8.b.r(new o0(), F.f2915a));
    private static M4.c logLevel = M4.c.WARN;
    private static M4.c visualLogLevel = M4.c.NONE;

    public static final class a extends h implements p {
        final /* synthetic */ M4.c $level;
        final /* synthetic */ String $message;
        final /* synthetic */ e $telemetry;
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, M4.c cVar, String str, Throwable th, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$telemetry = eVar;
            this.$level = cVar;
            this.$message = str;
            this.$throwable = th;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new a(this.$telemetry, this.$level, this.$message, this.$throwable, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            try {
                if (i == 0) {
                    com.bumptech.glide.d.k(obj);
                    o oVar = o.f991a;
                    e eVar = this.$telemetry;
                    String name = this.$level.name();
                    String str = this.$message;
                    Throwable th = this.$throwable;
                    String name2 = th != null ? th.getClass().getName() : null;
                    Throwable th2 = this.$throwable;
                    String message = th2 != null ? th2.getMessage() : null;
                    Throwable th3 = this.$throwable;
                    String P8 = th3 != null ? X2.e.P(th3) : null;
                    this.label = 1;
                    if (oVar.a(eVar, name, str, name2, message, P8, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
            } catch (Throwable th4) {
                Log.e("OneSignal", "Failed to log to Otel: " + th4.getMessage(), th4);
            }
            return v.f41353a;
        }
    }

    /* renamed from: com.onesignal.debug.internal.logging.b$b, reason: collision with other inner class name */
    public static final class C0197b extends i implements l {
        public static final C0197b INSTANCE = new C0197b();

        public C0197b() {
            super(1);
        }

        @Override // I7.l
        public final Boolean invoke(M4.c it) {
            kotlin.jvm.internal.h.e(it, "it");
            return Boolean.FALSE;
        }
    }

    public static final class c extends i implements l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // I7.l
        public final Boolean invoke(M4.c it) {
            kotlin.jvm.internal.h.e(it, "it");
            return Boolean.FALSE;
        }
    }

    public static final class d extends h implements l {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ M4.c $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(M4.c cVar, String str, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$level = cVar;
            this.$finalFullMessage = str;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return new d(this.$level, this.$finalFullMessage, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            f applicationService = b.INSTANCE.getApplicationService();
            Activity current = applicationService != null ? applicationService.getCurrent() : null;
            if (current != null) {
                new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((d) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    private b() {
    }

    public static final boolean atLogLevel(M4.c level) {
        kotlin.jvm.internal.h.e(level, "level");
        return level.compareTo(visualLogLevel) < 1 || level.compareTo(logLevel) < 1;
    }

    private final void callLogListeners(M4.c cVar, String str, Throwable th) {
        CopyOnWriteArraySet<M4.b> copyOnWriteArraySet = logListeners;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Iterator<M4.b> it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            new M4.d(cVar, str);
            throw null;
        }
    }

    public static final void debug(String message, Throwable th) {
        kotlin.jvm.internal.h.e(message, "message");
        log(M4.c.DEBUG, message, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String message, Throwable th) {
        kotlin.jvm.internal.h.e(message, "message");
        log(M4.c.ERROR, message, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String message, Throwable th) {
        kotlin.jvm.internal.h.e(message, "message");
        log(M4.c.FATAL, message, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    public static final M4.c getLogLevel() {
        return logLevel;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final M4.c getVisualLogLevel() {
        return visualLogLevel;
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }

    public static final void info(String message, Throwable th) {
        kotlin.jvm.internal.h.e(message, "message");
        log(M4.c.INFO, message, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(M4.c level, String message) {
        kotlin.jvm.internal.h.e(level, "level");
        kotlin.jvm.internal.h.e(message, "message");
        log(level, message, null);
    }

    private final void logToLogcat(M4.c cVar, String str, Throwable th) {
        if (cVar.compareTo(logLevel) >= 1) {
            return;
        }
        switch (com.onesignal.debug.internal.logging.a.$EnumSwitchMapping$0[cVar.ordinal()]) {
            case 1:
                Log.v("OneSignal", str, th);
                break;
            case 2:
                Log.d("OneSignal", str, th);
                break;
            case 3:
                Log.i("OneSignal", str, th);
                break;
            case 4:
                Log.w("OneSignal", str, th);
                break;
            case 5:
            case 6:
                Log.e("OneSignal", str, th);
                break;
        }
    }

    private final void logToOtel(M4.c cVar, String str, Throwable th) {
        e eVar = otelRemoteTelemetry;
        if (eVar == null || cVar == M4.c.NONE || !((Boolean) shouldSendLogLevel.invoke(cVar)).booleanValue()) {
            return;
        }
        AbstractC0406y.o(otelLoggingScope, null, new a(eVar, cVar, str, th, null), 3);
    }

    public static final void setLogLevel(M4.c cVar) {
        kotlin.jvm.internal.h.e(cVar, "<set-?>");
        logLevel = cVar;
    }

    public static /* synthetic */ void setOtelTelemetry$default(b bVar, e eVar, l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = C0197b.INSTANCE;
        }
        bVar.setOtelTelemetry(eVar, lVar);
    }

    public static final void setVisualLogLevel(M4.c cVar) {
        kotlin.jvm.internal.h.e(cVar, "<set-?>");
        visualLogLevel = cVar;
    }

    private final void showVisualLogging(M4.c cVar, String str, Throwable th) {
        if (cVar.compareTo(visualLogLevel) >= 1) {
            return;
        }
        try {
            String H8 = k.H(str + '\n');
            if (th != null) {
                String str2 = H8 + th.getMessage();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                H8 = str2 + stringWriter;
            }
            com.onesignal.common.threading.c.suspendifyOnMain(new d(cVar, H8, null));
        } catch (Throwable th2) {
            Log.e("OneSignal", "Error showing logging message.", th2);
        }
    }

    public static final void verbose(String message, Throwable th) {
        kotlin.jvm.internal.h.e(message, "message");
        log(M4.c.VERBOSE, message, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String message, Throwable th) {
        kotlin.jvm.internal.h.e(message, "message");
        log(M4.c.WARN, message, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final void addListener(M4.b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        logListeners.add(listener);
    }

    public final f getApplicationService() {
        return applicationService;
    }

    public final void removeListener(M4.b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        logListeners.remove(listener);
    }

    public final void setApplicationService(f fVar) {
        applicationService = fVar;
    }

    public final void setOtelTelemetry(e eVar, l shouldSend) {
        kotlin.jvm.internal.h.e(shouldSend, "shouldSend");
        otelRemoteTelemetry = eVar;
        shouldSendLogLevel = shouldSend;
    }

    public static final void log(M4.c level, String message, Throwable th) {
        kotlin.jvm.internal.h.e(level, "level");
        kotlin.jvm.internal.h.e(message, "message");
        String str = "[" + Thread.currentThread().getName() + "] " + message;
        b bVar = INSTANCE;
        bVar.logToLogcat(level, str, th);
        bVar.showVisualLogging(level, str, th);
        bVar.callLogListeners(level, str, th);
        bVar.logToOtel(level, str, th);
    }
}
