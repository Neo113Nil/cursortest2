package dd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yc.h0;
import yc.s0;
import yc.u1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends h0 implements hc.d, fc.d {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1854n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: j, reason: collision with root package name */
    public final yc.u f1855j;

    /* renamed from: k, reason: collision with root package name */
    public final hc.c f1856k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1857l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1858m;

    public h(yc.u uVar, hc.c cVar) {
        super(-1);
        this.f1855j = uVar;
        this.f1856k = cVar;
        this.f1857l = a.f1841c;
        this.f1858m = a.k(cVar.getContext());
    }

    @Override // yc.h0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof yc.q) {
            throw null;
        }
    }

    @Override // hc.d
    public final hc.d getCallerFrame() {
        hc.c cVar = this.f1856k;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // fc.d
    public final fc.i getContext() {
        return this.f1856k.getContext();
    }

    @Override // yc.h0
    public final Object h() {
        Object obj = this.f1857l;
        this.f1857l = a.f1841c;
        return obj;
    }

    @Override // fc.d
    public final void resumeWith(Object obj) {
        hc.c cVar = this.f1856k;
        fc.i context = cVar.getContext();
        Throwable a6 = ac.l.a(obj);
        Object pVar = a6 == null ? obj : new yc.p(a6, false);
        yc.u uVar = this.f1855j;
        if (uVar.y()) {
            this.f1857l = pVar;
            this.f8853i = 0;
            uVar.w(context, this);
            return;
        }
        s0 a8 = u1.a();
        if (a8.f8901i >= 4294967296L) {
            this.f1857l = pVar;
            this.f8853i = 0;
            a8.A(this);
            return;
        }
        a8.C(true);
        try {
            fc.i context2 = cVar.getContext();
            Object l10 = a.l(context2, this.f1858m);
            try {
                cVar.resumeWith(obj);
                while (a8.E()) {
                }
            } finally {
                a.f(context2, l10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1855j + ", " + yc.a0.x(this.f1856k) + ']';
    }

    @Override // yc.h0
    public final fc.d c() {
        return this;
    }
}
