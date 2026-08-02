package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class rax {
    public static final rax b;
    public static final rax c;
    public final Throwable a;

    static {
        if (tjx.d) {
            c = null;
            b = null;
        } else {
            c = new rax(null);
            b = new rax(null);
        }
    }

    public rax(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
