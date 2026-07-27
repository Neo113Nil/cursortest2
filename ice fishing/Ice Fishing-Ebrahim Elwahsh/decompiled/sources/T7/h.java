package T7;

import O7.AbstractC0392q;
import O7.AbstractC0395u;
import O7.AbstractC0399y;
import O7.C0391p;
import O7.E;
import O7.P;
import O7.q0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.AbstractC4940i;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class h extends E implements x7.d, InterfaceC5133d {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3139A = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC0395u f3140w;

    /* renamed from: x, reason: collision with root package name */
    public final AbstractC5219c f3141x;

    /* renamed from: y, reason: collision with root package name */
    public Object f3142y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f3143z;

    public h(AbstractC0395u abstractC0395u, AbstractC5219c abstractC5219c) {
        super(-1);
        this.f3140w = abstractC0395u;
        this.f3141x = abstractC5219c;
        this.f3142y = a.f3128c;
        this.f3143z = a.l(abstractC5219c.getContext());
    }

    @Override // O7.E
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0392q) {
            ((AbstractC0392q) obj).getClass();
            throw null;
        }
    }

    @Override // x7.d
    public final x7.d getCallerFrame() {
        AbstractC5219c abstractC5219c = this.f3141x;
        if (abstractC5219c != null) {
            return abstractC5219c;
        }
        return null;
    }

    @Override // v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        return this.f3141x.getContext();
    }

    @Override // O7.E
    public final Object i() {
        Object obj = this.f3142y;
        this.f3142y = a.f3128c;
        return obj;
    }

    @Override // v7.InterfaceC5133d
    public final void resumeWith(Object obj) {
        AbstractC5219c abstractC5219c = this.f3141x;
        InterfaceC5138i context = abstractC5219c.getContext();
        Throwable a9 = AbstractC4940i.a(obj);
        Object c0391p = a9 == null ? obj : new C0391p(a9, false);
        AbstractC0395u abstractC0395u = this.f3140w;
        if (abstractC0395u.z()) {
            this.f3142y = c0391p;
            this.f2550v = 0;
            abstractC0395u.p(context, this);
            return;
        }
        P a10 = q0.a();
        if (a10.f2568v >= 4294967296L) {
            this.f3142y = c0391p;
            this.f2550v = 0;
            a10.B(this);
            return;
        }
        a10.D(true);
        try {
            InterfaceC5138i context2 = abstractC5219c.getContext();
            Object m8 = a.m(context2, this.f3143z);
            try {
                abstractC5219c.resumeWith(obj);
                while (a10.F()) {
                }
            } finally {
                a.g(context2, m8);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3140w + ", " + AbstractC0399y.v(this.f3141x) + ']';
    }

    @Override // O7.E
    public final InterfaceC5133d c() {
        return this;
    }
}
