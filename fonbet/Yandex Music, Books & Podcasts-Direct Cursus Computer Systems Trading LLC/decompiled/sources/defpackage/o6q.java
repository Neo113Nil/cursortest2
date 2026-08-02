package defpackage;

import com.yandex.music.shared.player.IllegalArgumentPlaybackException;
import com.yandex.music.shared.player.IllegalStatePlaybackException;
import com.yandex.music.shared.player.NullPointerPlaybackException;
import com.yandex.music.shared.player.UnexpectedPlaybackException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o6q {
    public final kv6 a;
    public final xol b;
    public final rn5 c;
    public final ynf d;
    public final tcl e;
    public final x0q f;
    public volatile v2q g;

    public o6q(kv6 kv6Var, xol xolVar, rn5 rn5Var, ynf ynfVar, tcl tclVar) {
        tclVar.getClass();
        this.a = kv6Var;
        this.b = xolVar;
        this.c = rn5Var;
        this.d = ynfVar;
        this.e = tclVar;
        this.f = y0q.b(0, 0, null, 7);
        m6q m6qVar = new m6q(this);
        n6q n6qVar = new n6q(this);
        mal.a();
        kv6Var.j0(n6qVar);
        kv6Var.c1(m6qVar);
    }

    public static UnexpectedPlaybackException a(RuntimeException runtimeException, int i) {
        UnexpectedPlaybackException nullPointerPlaybackException;
        UnexpectedPlaybackException unexpectedPlaybackException;
        if (runtimeException instanceof IllegalStateException) {
            unexpectedPlaybackException = new IllegalStatePlaybackException((IllegalStateException) runtimeException, i);
        } else {
            int i2 = 0;
            if (runtimeException instanceof IllegalArgumentException) {
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) runtimeException;
                StackTraceElement[] stackTrace = illegalArgumentException.getStackTrace();
                stackTrace.getClass();
                int length = stackTrace.length;
                while (i2 < length) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    stackTraceElement.getClass();
                    if (Intrinsics.d(stackTraceElement.getClassName(), vq1.class.getCanonicalName()) || Intrinsics.d(stackTraceElement.getClassName(), qih.class.getCanonicalName())) {
                        nullPointerPlaybackException = new IllegalArgumentPlaybackException(illegalArgumentException, i);
                        unexpectedPlaybackException = nullPointerPlaybackException;
                        break;
                    }
                    i2++;
                }
                unexpectedPlaybackException = null;
            } else {
                if (runtimeException instanceof NullPointerException) {
                    NullPointerException nullPointerException = (NullPointerException) runtimeException;
                    StackTraceElement[] stackTrace2 = nullPointerException.getStackTrace();
                    stackTrace2.getClass();
                    int length2 = stackTrace2.length;
                    while (i2 < length2) {
                        StackTraceElement stackTraceElement2 = stackTrace2[i2];
                        stackTraceElement2.getClass();
                        if (Intrinsics.d(stackTraceElement2.getClassName(), vq1.class.getCanonicalName()) || Intrinsics.d(stackTraceElement2.getClassName(), dvt.class.getCanonicalName())) {
                            nullPointerPlaybackException = new NullPointerPlaybackException(nullPointerException, i);
                            unexpectedPlaybackException = nullPointerPlaybackException;
                            break;
                        }
                        i2++;
                    }
                }
                unexpectedPlaybackException = null;
            }
        }
        if (unexpectedPlaybackException != null) {
            return unexpectedPlaybackException;
        }
        throw runtimeException;
    }
}
