package com.onesignal.debug.internal.logging;

import ac.o;
import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import fc.d;
import g9.c;
import hc.j;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {
    private static final String TAG = "OneSignal";
    private static f applicationService;
    public static final b INSTANCE = new b();
    private static final CopyOnWriteArraySet<g9.b> logListeners = new CopyOnWriteArraySet<>();
    private static c logLevel = c.WARN;
    private static c visualLogLevel = c.NONE;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements oc.c {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ c $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, String str, d dVar) {
            super(1, dVar);
            this.$level = cVar;
            this.$finalFullMessage = str;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return new a(this.$level, this.$finalFullMessage, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            f applicationService = b.INSTANCE.getApplicationService();
            Activity current = applicationService != null ? applicationService.getCurrent() : null;
            if (current != null) {
                new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
            }
            return o.f277a;
        }
    }

    private b() {
    }

    public static final boolean atLogLevel(c cVar) {
        pc.j.e(cVar, "level");
        return cVar.compareTo(visualLogLevel) < 1 || cVar.compareTo(logLevel) < 1;
    }

    private final void callLogListeners(c cVar, String str, Throwable th) {
        CopyOnWriteArraySet<g9.b> copyOnWriteArraySet = logListeners;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Iterator<g9.b> it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            new g9.d(cVar, str);
            throw null;
        }
    }

    public static final void debug(String str, Throwable th) {
        pc.j.e(str, "message");
        log(c.DEBUG, str, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String str, Throwable th) {
        pc.j.e(str, "message");
        log(c.ERROR, str, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String str, Throwable th) {
        pc.j.e(str, "message");
        log(c.FATAL, str, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
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

    public static final void info(String str, Throwable th) {
        pc.j.e(str, "message");
        log(c.INFO, str, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(c cVar, String str) {
        pc.j.e(cVar, "level");
        pc.j.e(str, "message");
        log(cVar, str, null);
    }

    private final void logToLogcat(c cVar, String str, Throwable th) {
        if (cVar.compareTo(logLevel) >= 1) {
            return;
        }
        switch (com.onesignal.debug.internal.logging.a.$EnumSwitchMapping$0[cVar.ordinal()]) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Log.v(TAG, str, th);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                Log.d(TAG, str, th);
                break;
            case 3:
                Log.i(TAG, str, th);
                break;
            case 4:
                Log.w(TAG, str, th);
                break;
            case 5:
            case 6:
                Log.e(TAG, str, th);
                break;
        }
    }

    public static final void setLogLevel(c cVar) {
        pc.j.e(cVar, "<set-?>");
        logLevel = cVar;
    }

    public static final void setVisualLogLevel(c cVar) {
        pc.j.e(cVar, "<set-?>");
        visualLogLevel = cVar;
    }

    private final void showVisualLogging(c cVar, String str, Throwable th) {
        if (cVar.compareTo(visualLogLevel) >= 1) {
            return;
        }
        try {
            String m10 = xc.c.m(str + '\n');
            if (th != null) {
                String str2 = m10 + th.getMessage();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                m10 = str2 + stringWriter;
            }
            com.onesignal.common.threading.b.suspendifyOnMain(new a(cVar, m10, null));
        } catch (Throwable th2) {
            Log.e(TAG, "Error showing logging message.", th2);
        }
    }

    public static final void verbose(String str, Throwable th) {
        pc.j.e(str, "message");
        log(c.VERBOSE, str, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String str, Throwable th) {
        pc.j.e(str, "message");
        log(c.WARN, str, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final void addListener(g9.b bVar) {
        pc.j.e(bVar, "listener");
        logListeners.add(bVar);
    }

    public final f getApplicationService() {
        return applicationService;
    }

    public final void removeListener(g9.b bVar) {
        pc.j.e(bVar, "listener");
        logListeners.remove(bVar);
    }

    public final void setApplicationService(f fVar) {
        applicationService = fVar;
    }

    public static final void log(c cVar, String str, Throwable th) {
        pc.j.e(cVar, "level");
        pc.j.e(str, "message");
        String str2 = "[" + Thread.currentThread().getName() + "] " + str;
        b bVar = INSTANCE;
        bVar.logToLogcat(cVar, str2, th);
        bVar.showVisualLogging(cVar, str2, th);
        bVar.callLogListeners(cVar, str2, th);
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }
}
