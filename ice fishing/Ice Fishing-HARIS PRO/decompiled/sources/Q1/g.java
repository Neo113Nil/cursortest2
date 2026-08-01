package Q1;

import L1.AbstractC0015p;
import L1.AbstractC0018t;
import L1.AbstractC0022x;
import L1.C0009j;
import L1.C0010k;
import L1.E;
import L1.a0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class g extends AbstractC0022x implements x1.d, v1.d {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f944h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0015p f945d;
    public final x1.c e;

    /* renamed from: f, reason: collision with root package name */
    public Object f946f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f947g;

    public g(AbstractC0015p abstractC0015p, x1.c cVar) {
        super(-1);
        this.f945d = abstractC0015p;
        this.e = cVar;
        this.f946f = a.f935c;
        Object d2 = cVar.h().d(0, w.f975c);
        D1.i.b(d2);
        this.f947g = d2;
    }

    @Override // v1.d
    public final void b(Object obj) {
        x1.c cVar = this.e;
        v1.i h2 = cVar.h();
        Throwable a2 = t1.f.a(obj);
        Object c0009j = a2 == null ? obj : new C0009j(a2, false);
        AbstractC0015p abstractC0015p = this.f945d;
        if (abstractC0015p.g()) {
            this.f946f = c0009j;
            this.f585c = 0;
            abstractC0015p.b(h2, this);
            return;
        }
        E a3 = a0.a();
        if (a3.f529c >= 4294967296L) {
            this.f946f = c0009j;
            this.f585c = 0;
            u1.e eVar = a3.e;
            if (eVar == null) {
                eVar = new u1.e();
                a3.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a3.j(true);
        try {
            v1.i h3 = cVar.h();
            Object k2 = a.k(h3, this.f947g);
            try {
                cVar.b(obj);
                while (a3.k()) {
                }
            } finally {
                a.g(h3, k2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // L1.AbstractC0022x
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0010k) {
            ((C0010k) obj).f567b.g(cancellationException);
        }
    }

    @Override // L1.AbstractC0022x
    public final v1.d d() {
        return this;
    }

    @Override // x1.d
    public final x1.d e() {
        x1.c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // v1.d
    public final v1.i h() {
        return this.e.h();
    }

    @Override // L1.AbstractC0022x
    public final Object j() {
        Object obj = this.f946f;
        this.f946f = a.f935c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f945d + ", " + AbstractC0018t.f(this.e) + ']';
    }
}
