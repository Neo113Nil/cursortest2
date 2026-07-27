package P0;

import K0.AbstractC0043t;
import K0.AbstractC0046w;
import K0.B;
import K0.C0038n;
import K0.C0039o;
import K0.I;
import K0.i0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h extends B implements x0.c, v0.d {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f873m = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0043t f874i;

    /* renamed from: j, reason: collision with root package name */
    public final x0.b f875j;

    /* renamed from: k, reason: collision with root package name */
    public Object f876k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f877l;

    public h(AbstractC0043t abstractC0043t, x0.b bVar) {
        super(-1);
        this.f874i = abstractC0043t;
        this.f875j = bVar;
        this.f876k = AbstractC0068a.f862c;
        this.f877l = AbstractC0068a.m(bVar.j());
    }

    @Override // K0.B
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0039o) {
            ((C0039o) obj).f525b.i(cancellationException);
        }
    }

    @Override // v0.d
    public final void c(Object obj) {
        x0.b bVar = this.f875j;
        v0.i j2 = bVar.j();
        Throwable a2 = t0.d.a(obj);
        Object c0038n = a2 == null ? obj : new C0038n(a2, false);
        AbstractC0043t abstractC0043t = this.f874i;
        if (abstractC0043t.d()) {
            this.f876k = c0038n;
            this.f462h = 0;
            abstractC0043t.c(j2, this);
            return;
        }
        I a3 = i0.a();
        if (a3.f471h >= 4294967296L) {
            this.f876k = c0038n;
            this.f462h = 0;
            u0.b bVar2 = a3.f473j;
            if (bVar2 == null) {
                bVar2 = new u0.b();
                a3.f473j = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        a3.j(true);
        try {
            v0.i j3 = bVar.j();
            Object n2 = AbstractC0068a.n(j3, this.f877l);
            try {
                bVar.c(obj);
                while (a3.l()) {
                }
            } finally {
                AbstractC0068a.h(j3, n2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // x0.c
    public final x0.c h() {
        x0.b bVar = this.f875j;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f875j.j();
    }

    @Override // K0.B
    public final Object m() {
        Object obj = this.f876k;
        this.f876k = AbstractC0068a.f862c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f874i + ", " + AbstractC0046w.k(this.f875j) + ']';
    }

    @Override // K0.B
    public final v0.d f() {
        return this;
    }
}
