package X7;

import S7.AbstractC0399q;
import S7.AbstractC0402u;
import S7.AbstractC0406y;
import S7.C0398p;
import S7.E;
import S7.P;
import S7.q0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.AbstractC5091i;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class h extends E implements B7.d, InterfaceC5267d {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3833A = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC0402u f3834w;

    /* renamed from: x, reason: collision with root package name */
    public final B7.c f3835x;

    /* renamed from: y, reason: collision with root package name */
    public Object f3836y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f3837z;

    public h(AbstractC0402u abstractC0402u, B7.c cVar) {
        super(-1);
        this.f3834w = abstractC0402u;
        this.f3835x = cVar;
        this.f3836y = a.f3822c;
        this.f3837z = a.l(cVar.getContext());
    }

    @Override // S7.E
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0399q) {
            ((AbstractC0399q) obj).getClass();
            throw null;
        }
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        B7.c cVar = this.f3835x;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        return this.f3835x.getContext();
    }

    @Override // S7.E
    public final Object i() {
        Object obj = this.f3836y;
        this.f3836y = a.f3822c;
        return obj;
    }

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        B7.c cVar = this.f3835x;
        InterfaceC5272i context = cVar.getContext();
        Throwable a9 = AbstractC5091i.a(obj);
        Object c0398p = a9 == null ? obj : new C0398p(a9, false);
        AbstractC0402u abstractC0402u = this.f3834w;
        if (abstractC0402u.z()) {
            this.f3836y = c0398p;
            this.f2914v = 0;
            abstractC0402u.p(context, this);
            return;
        }
        P a10 = q0.a();
        if (a10.f2932v >= 4294967296L) {
            this.f3836y = c0398p;
            this.f2914v = 0;
            a10.B(this);
            return;
        }
        a10.D(true);
        try {
            InterfaceC5272i context2 = cVar.getContext();
            Object m4 = a.m(context2, this.f3837z);
            try {
                cVar.resumeWith(obj);
                while (a10.F()) {
                }
            } finally {
                a.g(context2, m4);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3834w + ", " + AbstractC0406y.v(this.f3835x) + ']';
    }

    @Override // S7.E
    public final InterfaceC5267d d() {
        return this;
    }
}
