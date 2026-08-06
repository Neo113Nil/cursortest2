package F1;

import A1.AbstractC0018t;
import A1.AbstractC0022x;
import A1.C;
import A1.C0013n;
import A1.C0014o;
import A1.J;
import A1.j0;
import h1.AbstractC0236f;
import i1.C0250g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n1.AbstractC0991b;
import n1.InterfaceC0992c;

/* loaded from: classes.dex */
public final class h extends C implements InterfaceC0992c, l1.d {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f602h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0018t f603d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0991b f604e;

    /* renamed from: f, reason: collision with root package name */
    public Object f605f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f606g;

    public h(AbstractC0018t abstractC0018t, AbstractC0991b abstractC0991b) {
        super(-1);
        this.f603d = abstractC0018t;
        this.f604e = abstractC0991b;
        this.f605f = a.f591c;
        this.f606g = a.l(abstractC0991b.getContext());
    }

    @Override // A1.C
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0014o) {
            ((C0014o) obj).f64b.invoke(cancellationException);
        }
    }

    @Override // n1.InterfaceC0992c
    public final InterfaceC0992c f() {
        AbstractC0991b abstractC0991b = this.f604e;
        if (abstractC0991b != null) {
            return abstractC0991b;
        }
        return null;
    }

    @Override // l1.d
    public final l1.i getContext() {
        return this.f604e.getContext();
    }

    @Override // l1.d
    public final void i(Object obj) {
        AbstractC0991b abstractC0991b = this.f604e;
        l1.i context = abstractC0991b.getContext();
        Throwable a2 = AbstractC0236f.a(obj);
        Object c0013n = a2 == null ? obj : new C0013n(a2, false);
        AbstractC0018t abstractC0018t = this.f603d;
        if (abstractC0018t.n()) {
            this.f605f = c0013n;
            this.f1c = 0;
            abstractC0018t.j(context, this);
            return;
        }
        J a3 = j0.a();
        if (a3.f10c >= 4294967296L) {
            this.f605f = c0013n;
            this.f1c = 0;
            C0250g c0250g = a3.f12e;
            if (c0250g == null) {
                c0250g = new C0250g();
                a3.f12e = c0250g;
            }
            c0250g.addLast(this);
            return;
        }
        a3.q(true);
        try {
            l1.i context2 = abstractC0991b.getContext();
            Object m2 = a.m(context2, this.f606g);
            try {
                abstractC0991b.i(obj);
                while (a3.s()) {
                }
            } finally {
                a.g(context2, m2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // A1.C
    public final Object k() {
        Object obj = this.f605f;
        this.f605f = a.f591c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f603d + ", " + AbstractC0022x.k(this.f604e) + ']';
    }

    @Override // A1.C
    public final l1.d c() {
        return this;
    }
}
