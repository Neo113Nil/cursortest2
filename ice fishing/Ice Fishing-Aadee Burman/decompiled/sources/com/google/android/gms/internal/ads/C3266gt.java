package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4920z0;
import q2.InterfaceC4904r0;

/* renamed from: com.google.android.gms.internal.ads.gt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3266gt implements InterfaceC4172xk, InterfaceC2728Pk, InterfaceC4181xt, t2.l, InterfaceC2795Tk, InterfaceC2490Bk, InterfaceC2542El {

    /* renamed from: n, reason: collision with root package name */
    public final C3751pu f30669n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f30670u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f30671v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f30672w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f30673x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f30674y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f30675z = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public final AtomicReference f30667A = new AtomicReference();

    /* renamed from: B, reason: collision with root package name */
    public C3266gt f30668B = null;

    public C3266gt(C3751pu c3751pu) {
        this.f30669n = c3751pu;
    }

    @Override // t2.l
    public final void H3(int i) {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.H3(i);
            return;
        }
        Object obj = this.f30674y.get();
        if (obj == null) {
            return;
        }
        try {
            ((t2.l) obj).H3(i);
        } catch (RemoteException e9) {
            int i6 = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i9 = u2.z.f41319b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void J() {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.J();
            return;
        }
        Object obj = this.f30672w.get();
        if (obj == null) {
            return;
        }
        try {
            ((R8) obj).e();
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41319b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // t2.l
    public final void L1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void M() {
    }

    @Override // t2.l
    public final void M0() {
    }

    @Override // t2.l
    public final void Q2() {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.Q2();
        } else {
            AbstractC2639Kg.j(this.f30674y, C3586mr.f32600D);
        }
    }

    @Override // t2.l
    public final void R1() {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.R1();
        } else {
            AbstractC2639Kg.j(this.f30674y, C3586mr.f32599C);
        }
    }

    @Override // t2.l
    public final void S1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2795Tk
    public final void a(q2.g1 g1Var) {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.a(g1Var);
            return;
        }
        Object obj = this.f30675z.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4904r0) obj).p1(g1Var);
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41319b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2490Bk
    public final void b(C4920z0 c4920z0) {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.b(c4920z0);
            return;
        }
        Object obj = this.f30672w.get();
        if (obj == null) {
            return;
        }
        try {
            ((R8) obj).M2(c4920z0);
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41319b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    public final void c(BinderC3310hj binderC3310hj) {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.c(binderC3310hj);
            return;
        }
        Object obj = this.f30670u.get();
        if (obj == null) {
            return;
        }
        try {
            ((P8) obj).O0(binderC3310hj);
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41319b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    public final void d() {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.d();
            return;
        }
        C4178xq c4178xq = this.f30669n.f33160a;
        if (c4178xq != null) {
            C3918t c3918t = (C3918t) c4178xq.f35055u;
            synchronized (c3918t) {
                c3918t.f34177n = 1;
                c3918t.f();
            }
        }
        if (this.f30671v.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e9) {
                int i = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41319b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj = this.f30672w.get();
        if (obj != null) {
            try {
                ((R8) obj).F();
            } catch (RemoteException e11) {
                int i9 = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i10 = u2.z.f41319b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj2 = this.f30667A.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((Hv) obj2).a();
        } catch (RemoteException e13) {
            int i11 = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i12 = u2.z.f41319b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // t2.l
    public final void f1() {
    }

    @Override // t2.l
    public final void g() {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.g();
            return;
        }
        Object obj = this.f30674y.get();
        if (obj != null) {
            try {
                ((t2.l) obj).g();
            } catch (RemoteException e9) {
                int i = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41319b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        AtomicReference atomicReference = this.f30672w;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((R8) obj2).A();
            } catch (RemoteException e11) {
                int i9 = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i10 = u2.z.f41319b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((R8) obj3).d();
        } catch (RemoteException e13) {
            int i11 = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i12 = u2.z.f41319b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // t2.l
    public final void h1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Pk
    public final void l() {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.l();
        } else {
            AbstractC2639Kg.j(this.f30673x, C3586mr.f32598B);
        }
    }

    @Override // t2.l
    public final void t1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final void v(C4920z0 c4920z0) {
        C3266gt c3266gt = this.f30668B;
        if (c3266gt != null) {
            c3266gt.v(c4920z0);
            return;
        }
        AtomicReference atomicReference = this.f30670u;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((P8) obj).G(c4920z0);
            } catch (RemoteException e9) {
                int i = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41319b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((P8) obj2).x(c4920z0.f40210n);
        } catch (RemoteException e11) {
            int i9 = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            int i10 = u2.z.f41319b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // t2.l
    public final void w0() {
    }
}
