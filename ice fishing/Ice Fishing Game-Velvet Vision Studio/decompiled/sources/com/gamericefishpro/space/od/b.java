package com.gamericefishpro.space.od;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.md.c;
import com.gamericefishpro.space.md.d;
import com.gamericefishpro.space.mi.h;
import com.gamericefishpro.space.vh.i;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String TAG = "OneSignal";
    private static f applicationService;
    public static final b INSTANCE = new b();
    private static final CopyOnWriteArraySet<com.gamericefishpro.space.md.b> logListeners = new CopyOnWriteArraySet<>();
    private static c logLevel = c.WARN;
    private static c visualLogLevel = c.NONE;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends i implements Function1 {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ c $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, String str, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$level = cVar;
            this.$finalFullMessage = str;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new a(this.$level, this.$finalFullMessage, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            f applicationService = b.INSTANCE.getApplicationService();
            Activity current = applicationService != null ? applicationService.getCurrent() : null;
            if (current != null) {
                new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
            }
            return Unit.a;
        }
    }

    private b() {
    }

    public static final boolean atLogLevel(c level) {
        Intrinsics.checkNotNullParameter(level, "level");
        return level.compareTo(visualLogLevel) < 1 || level.compareTo(logLevel) < 1;
    }

    private final void callLogListeners(c cVar, String str, Throwable th) {
        CopyOnWriteArraySet<com.gamericefishpro.space.md.b> copyOnWriteArraySet = logListeners;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Iterator<com.gamericefishpro.space.md.b> it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            new d(cVar, str);
            throw null;
        }
    }

    public static final void debug(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(c.DEBUG, message, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(c.ERROR, message, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(c.FATAL, message, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    public static final c getLogLevel() {
        return logLevel;
    }

    public static final c getVisualLogLevel() {
        return visualLogLevel;
    }

    public static final void info(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(c.INFO, message, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(c level, String message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        log(level, message, null);
    }

    private final void logToLogcat(c cVar, String str, Throwable th) {
        if (cVar.compareTo(logLevel) >= 1) {
            return;
        }
        int i = com.gamericefishpro.space.od.a.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i == 4) {
            Log.w(TAG, str, th);
        } else if (i == 5 || i == 6) {
            Log.e(TAG, str, th);
        }
    }

    public static final void setLogLevel(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        logLevel = cVar;
    }

    public static final void setVisualLogLevel(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        visualLogLevel = cVar;
    }

    private final void showVisualLogging(c cVar, String str, Throwable th) {
        if (cVar.compareTo(visualLogLevel) >= 1) {
            return;
        }
        try {
            String strC = h.c(str + '\n');
            if (th != null) {
                String str2 = strC + th.getMessage();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                strC = str2 + stringWriter;
            }
            com.gamericefishpro.space.ic.b.suspendifyOnMain(new a(cVar, strC, null));
        } catch (Throwable th2) {
            Log.e(TAG, "Error showing logging message.", th2);
        }
    }

    public static final void verbose(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(c.VERBOSE, message, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(c.WARN, message, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final void addListener(com.gamericefishpro.space.md.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        logListeners.add(listener);
    }

    public final f getApplicationService() {
        return applicationService;
    }

    public final void removeListener(com.gamericefishpro.space.md.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        logListeners.remove(listener);
    }

    public final void setApplicationService(f fVar) {
        applicationService = fVar;
    }

    public static final void log(c level, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = "[" + Thread.currentThread().getName() + "] " + message;
        b bVar = INSTANCE;
        bVar.logToLogcat(level, str, th);
        bVar.showVisualLogging(level, str, th);
        bVar.callLogListeners(level, str, th);
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }
}
