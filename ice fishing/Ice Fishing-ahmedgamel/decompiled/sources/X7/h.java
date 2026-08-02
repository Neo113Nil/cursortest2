package X7;

import S7.AbstractC0403q;
import S7.AbstractC0406u;
import S7.AbstractC0410y;
import S7.C0402p;
import S7.E;
import S7.P;
import S7.q0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.AbstractC5083i;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class h extends E implements B7.d, InterfaceC5240d {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3788A = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC0406u f3789w;

    /* renamed from: x, reason: collision with root package name */
    public final B7.c f3790x;

    /* renamed from: y, reason: collision with root package name */
    public Object f3791y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f3792z;

    public h(AbstractC0406u abstractC0406u, B7.c cVar) {
        super(-1);
        this.f3789w = abstractC0406u;
        this.f3790x = cVar;
        this.f3791y = a.f3777c;
        this.f3792z = a.l(cVar.getContext());
    }

    @Override // S7.E
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0403q) {
            ((AbstractC0403q) obj).getClass();
            throw null;
        }
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        B7.c cVar = this.f3790x;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        return this.f3790x.getContext();
    }

    @Override // S7.E
    public final Object i() {
        Object obj = this.f3791y;
        this.f3791y = a.f3777c;
        return obj;
    }

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        B7.c cVar = this.f3790x;
        InterfaceC5245i context = cVar.getContext();
        Throwable a9 = AbstractC5083i.a(obj);
        Object c0402p = a9 == null ? obj : new C0402p(a9, false);
        AbstractC0406u abstractC0406u = this.f3789w;
        if (abstractC0406u.z()) {
            this.f3791y = c0402p;
            this.f2997v = 0;
            abstractC0406u.p(context, this);
            return;
        }
        P a10 = q0.a();
        if (a10.f3015v >= 4294967296L) {
            this.f3791y = c0402p;
            this.f2997v = 0;
            a10.B(this);
            return;
        }
        a10.D(true);
        try {
            InterfaceC5245i context2 = cVar.getContext();
            Object m9 = a.m(context2, this.f3792z);
            try {
                cVar.resumeWith(obj);
                while (a10.F()) {
                }
            } finally {
                a.g(context2, m9);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3789w + ", " + AbstractC0410y.v(this.f3790x) + ']';
    }

    @Override // S7.E
    public final InterfaceC5240d d() {
        return this;
    }
}
