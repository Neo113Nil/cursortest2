package Q0;

import L0.AbstractC0061t;
import L0.AbstractC0064w;
import L0.B;
import L0.C0056n;
import L0.C0057o;
import L0.I;
import L0.i0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t0.AbstractC0249d;

/* loaded from: classes.dex */
public final class h extends B implements x0.c, v0.d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f882l = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0061t f883h;

    /* renamed from: i, reason: collision with root package name */
    public final x0.b f884i;

    /* renamed from: j, reason: collision with root package name */
    public Object f885j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f886k;

    public h(AbstractC0061t abstractC0061t, x0.b bVar) {
        super(-1);
        this.f883h = abstractC0061t;
        this.f884i = bVar;
        this.f885j = AbstractC0068a.f871c;
        this.f886k = AbstractC0068a.m(bVar.j());
    }

    @Override // L0.B
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0057o) {
            ((C0057o) obj).f673b.i(cancellationException);
        }
    }

    @Override // v0.d
    public final void c(Object obj) {
        x0.b bVar = this.f884i;
        v0.i j2 = bVar.j();
        Throwable a2 = AbstractC0249d.a(obj);
        Object c0056n = a2 == null ? obj : new C0056n(a2, false);
        AbstractC0061t abstractC0061t = this.f883h;
        if (abstractC0061t.d()) {
            this.f885j = c0056n;
            this.f610g = 0;
            abstractC0061t.c(j2, this);
            return;
        }
        I a3 = i0.a();
        if (a3.f619g >= 4294967296L) {
            this.f885j = c0056n;
            this.f610g = 0;
            u0.b bVar2 = a3.f621i;
            if (bVar2 == null) {
                bVar2 = new u0.b();
                a3.f621i = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        a3.j(true);
        try {
            v0.i j3 = bVar.j();
            Object n2 = AbstractC0068a.n(j3, this.f886k);
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
        x0.b bVar = this.f884i;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f884i.j();
    }

    @Override // L0.B
    public final Object m() {
        Object obj = this.f885j;
        this.f885j = AbstractC0068a.f871c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f883h + ", " + AbstractC0064w.k(this.f884i) + ']';
    }

    @Override // L0.B
    public final v0.d f() {
        return this;
    }
}
