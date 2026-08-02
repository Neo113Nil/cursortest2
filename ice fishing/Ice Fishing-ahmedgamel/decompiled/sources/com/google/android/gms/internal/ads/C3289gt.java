package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import s2.C4969z0;
import s2.InterfaceC4953r0;

/* renamed from: com.google.android.gms.internal.ads.gt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3289gt implements InterfaceC4195xk, InterfaceC2748Pk, InterfaceC4204xt, v2.l, InterfaceC2816Tk, InterfaceC2510Bk, InterfaceC2579Fl {

    /* renamed from: n, reason: collision with root package name */
    public final C3774pu f31438n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f31439u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f31440v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f31441w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f31442x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f31443y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f31444z = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public final AtomicReference f31436A = new AtomicReference();

    /* renamed from: B, reason: collision with root package name */
    public C3289gt f31437B = null;

    public C3289gt(C3774pu c3774pu) {
        this.f31438n = c3774pu;
    }

    @Override // v2.l
    public final void C3(int i) {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.C3(i);
            return;
        }
        Object obj = this.f31443y.get();
        if (obj == null) {
            return;
        }
        try {
            ((v2.l) obj).C3(i);
        } catch (RemoteException e9) {
            int i4 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void D() {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.D();
            return;
        }
        Object obj = this.f31441w.get();
        if (obj == null) {
            return;
        }
        try {
            ((R8) obj).e();
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // v2.l
    public final void G1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final void I(C4969z0 c4969z0) {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.I(c4969z0);
            return;
        }
        AtomicReference atomicReference = this.f31439u;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((P8) obj).M(c4969z0);
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((P8) obj2).x(c4969z0.f40512n);
        } catch (RemoteException e11) {
            int i6 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            int i9 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // v2.l
    public final void K0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void L() {
    }

    @Override // v2.l
    public final void N2() {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.N2();
        } else {
            AbstractC2659Kg.j(this.f31443y, C3609mr.f33378D);
        }
    }

    @Override // v2.l
    public final void Q1() {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.Q1();
        } else {
            AbstractC2659Kg.j(this.f31443y, C3609mr.f33377C);
        }
    }

    @Override // v2.l
    public final void S1() {
    }

    public final void a(BinderC3333hj binderC3333hj) {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.a(binderC3333hj);
            return;
        }
        Object obj = this.f31439u.get();
        if (obj == null) {
            return;
        }
        try {
            ((P8) obj).N0(binderC3333hj);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2816Tk
    public final void b(s2.g1 g1Var) {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.b(g1Var);
            return;
        }
        Object obj = this.f31444z.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4953r0) obj).R3(g1Var);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2510Bk
    public final void c(C4969z0 c4969z0) {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.c(c4969z0);
            return;
        }
        Object obj = this.f31441w.get();
        if (obj == null) {
            return;
        }
        try {
            ((R8) obj).n3(c4969z0);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    public final void d() {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.d();
            return;
        }
        C4201xq c4201xq = this.f31438n.f33946a;
        if (c4201xq != null) {
            C3941t c3941t = (C3941t) c4201xq.f35841u;
            synchronized (c3941t) {
                c3941t.f34963n = 1;
                c3941t.f();
            }
        }
        if (this.f31440v.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj = this.f31441w.get();
        if (obj != null) {
            try {
                ((R8) obj).F();
            } catch (RemoteException e11) {
                int i6 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i9 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj2 = this.f31436A.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((Hv) obj2).a();
        } catch (RemoteException e13) {
            int i10 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i11 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // v2.l
    public final void d1() {
    }

    @Override // v2.l
    public final void g() {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.g();
            return;
        }
        Object obj = this.f31443y.get();
        if (obj != null) {
            try {
                ((v2.l) obj).g();
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        AtomicReference atomicReference = this.f31441w;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((R8) obj2).A();
            } catch (RemoteException e11) {
                int i6 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i9 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((R8) obj3).d();
        } catch (RemoteException e13) {
            int i10 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i11 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // v2.l
    public final void h1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2748Pk
    public final void l() {
        C3289gt c3289gt = this.f31437B;
        if (c3289gt != null) {
            c3289gt.l();
        } else {
            AbstractC2659Kg.j(this.f31442x, C3609mr.f33376B);
        }
    }

    @Override // v2.l
    public final void r1() {
    }

    @Override // v2.l
    public final void t0() {
    }
}
