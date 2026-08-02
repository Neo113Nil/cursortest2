package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class rhp {
    public static final w2f b;
    public final AtomicReference a = new AtomicReference();

    static {
        w2f p = saf.p();
        p.g(null);
        b = p;
    }

    public final void a() {
        r2f r2fVar;
        AtomicReference atomicReference = this.a;
        r2f r2fVar2 = (r2f) atomicReference.get();
        w2f w2fVar = b;
        if (r2fVar2 == w2fVar || (r2fVar = (r2f) atomicReference.getAndSet(w2fVar)) == null || r2fVar == w2fVar) {
            return;
        }
        r2fVar.g(null);
    }

    public final r2f b(s9f s9fVar) {
        s9fVar.getClass();
        return (r2f) this.a.get();
    }

    public final void c(r2f r2fVar) {
        while (true) {
            AtomicReference atomicReference = this.a;
            r2f r2fVar2 = (r2f) atomicReference.get();
            if (r2fVar2 == b) {
                if (r2fVar != null) {
                    r2fVar.g(null);
                    return;
                }
                return;
            } else {
                while (!atomicReference.compareAndSet(r2fVar2, r2fVar)) {
                    if (atomicReference.get() != r2fVar2) {
                        break;
                    }
                }
                if (r2fVar2 != null) {
                    r2fVar2.g(null);
                    return;
                }
                return;
            }
        }
    }

    public final void d(s9f s9fVar, r2f r2fVar) {
        s9fVar.getClass();
        if (r2fVar == null) {
            a();
        } else {
            c(r2fVar);
        }
    }
}
