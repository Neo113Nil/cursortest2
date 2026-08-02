package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class em5 extends AtomicReference implements ka8 {
    private static final long serialVersionUID = -2467358622224974244L;
    public final jm5 a;

    public em5(jm5 jm5Var) {
        this.a = jm5Var;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
    }

    public final boolean b(Throwable th) {
        ka8 ka8Var;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object obj = get();
        ra8 ra8Var = ra8.a;
        if (obj == ra8Var || (ka8Var = (ka8) getAndSet(ra8Var)) == ra8Var) {
            return false;
        }
        try {
            this.a.onError(th);
        } finally {
            if (ka8Var != null) {
                ka8Var.a();
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return k5r.m(em5.class.getSimpleName(), "{", super.toString(), "}");
    }
}
