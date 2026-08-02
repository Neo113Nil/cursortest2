package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import s2.C4969z0;
import s2.InterfaceC4953r0;

/* loaded from: classes2.dex */
public final class Jt implements I2.a, InterfaceC2663Kk, InterfaceC4195xk, InterfaceC4033uk, InterfaceC2510Bk, InterfaceC2816Tk, InterfaceC4204xt, InterfaceC2579Fl {

    /* renamed from: n, reason: collision with root package name */
    public final C3774pu f26532n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f26533u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f26534v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f26535w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f26536x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f26537y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f26538z = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public final AtomicReference f26529A = new AtomicReference();

    /* renamed from: B, reason: collision with root package name */
    public final AtomicReference f26530B = new AtomicReference();

    /* renamed from: C, reason: collision with root package name */
    public final Jt f26531C = null;

    public Jt(C3774pu c3774pu) {
        this.f26532n = c3774pu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void B() {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.B();
            return;
        }
        AtomicReference atomicReference = this.f26535w;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC3597mf) obj).d();
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f26536x.get();
        if (obj2 != null) {
            try {
                C2892Ye c2892Ye = (C2892Ye) obj2;
                c2892Ye.d1(c2892Ye.F0(), 2);
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
            ((InterfaceC3597mf) obj3).j();
        } catch (RemoteException e13) {
            int i10 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i11 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void D() {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.D();
        } else {
            AbstractC2659Kg.j(this.f26535w, C3609mr.f33379E);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final void I(C4969z0 c4969z0) {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.I(c4969z0);
            return;
        }
        AtomicReference atomicReference = this.f26534v;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC3813qf) obj).a(c4969z0);
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        int i6 = c4969z0.f40512n;
        if (obj2 != null) {
            try {
                ((InterfaceC3813qf) obj2).v(i6);
            } catch (RemoteException e11) {
                int i9 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i10 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f26536x.get();
        if (obj3 == null) {
            return;
        }
        try {
            C2892Ye c2892Ye = (C2892Ye) obj3;
            Parcel F02 = c2892Ye.F0();
            F02.writeInt(i6);
            c2892Ye.d1(F02, 7);
        } catch (RemoteException e13) {
            int i11 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i12 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void L() {
    }

    @Override // I2.a
    public final void a() {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.a();
        } else {
            AbstractC2659Kg.j(this.f26533u, C3609mr.f33380F);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2816Tk
    public final void b(s2.g1 g1Var) {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.b(g1Var);
            return;
        }
        Object obj = this.f26529A.get();
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
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.c(c4969z0);
            return;
        }
        AtomicReference atomicReference = this.f26535w;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC3597mf) obj).n1(c4969z0);
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
            ((InterfaceC3597mf) obj2).D(c4969z0.f40512n);
        } catch (RemoteException e11) {
            int i6 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            int i9 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void d() {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.d();
            return;
        }
        Object obj = this.f26536x.get();
        if (obj == null) {
            return;
        }
        try {
            C2892Ye c2892Ye = (C2892Ye) obj;
            c2892Ye.d1(c2892Ye.F0(), 3);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void e() {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.e();
            return;
        }
        Object obj = this.f26536x.get();
        if (obj == null) {
            return;
        }
        try {
            C2892Ye c2892Ye = (C2892Ye) obj;
            c2892Ye.d1(c2892Ye.F0(), 8);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.h();
            return;
        }
        Object obj = this.f26534v.get();
        if (obj != null) {
            try {
                ((InterfaceC3813qf) obj).d();
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f26536x.get();
        if (obj2 == null) {
            return;
        }
        try {
            C2892Ye c2892Ye = (C2892Ye) obj2;
            c2892Ye.d1(c2892Ye.F0(), 1);
        } catch (RemoteException e11) {
            int i6 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            int i9 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void t(BinderC2844Ve binderC2844Ve, String str, String str2) {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.t(binderC2844Ve, str, str2);
            return;
        }
        Object obj = this.f26535w.get();
        int i = binderC2844Ve.f29012u;
        String str3 = binderC2844Ve.f29011n;
        if (obj != null) {
            try {
                ((InterfaceC3597mf) obj).o1(new BinderC4082vf(str3, i));
            } catch (RemoteException e9) {
                int i4 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f26537y.get();
        if (obj2 != null) {
            try {
                C3866rf c3866rf = (C3866rf) obj2;
                BinderC4082vf binderC4082vf = new BinderC4082vf(str3, i);
                Parcel F02 = c3866rf.F0();
                AbstractC3411j8.e(F02, binderC4082vf);
                F02.writeString(str);
                F02.writeString(str2);
                c3866rf.d1(F02, 2);
            } catch (RemoteException e11) {
                int i9 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i10 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f26536x.get();
        if (obj3 != null) {
            try {
                C2892Ye c2892Ye = (C2892Ye) obj3;
                Parcel F03 = c2892Ye.F0();
                AbstractC3411j8.e(F03, binderC2844Ve);
                c2892Ye.d1(F03, 5);
            } catch (RemoteException e13) {
                int i11 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e13);
            } catch (NullPointerException e14) {
                int i12 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
            }
        }
        Object obj4 = this.f26538z.get();
        if (obj4 == null) {
            return;
        }
        try {
            C2876Xe c2876Xe = (C2876Xe) obj4;
            Parcel F04 = c2876Xe.F0();
            AbstractC3411j8.e(F04, binderC2844Ve);
            F04.writeString(str);
            F04.writeString(str2);
            c2876Xe.d1(F04, 2);
        } catch (RemoteException e15) {
            int i13 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e15);
        } catch (NullPointerException e16) {
            int i14 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e16);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void y() {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.y();
            return;
        }
        Object obj = this.f26536x.get();
        if (obj == null) {
            return;
        }
        try {
            C2892Ye c2892Ye = (C2892Ye) obj;
            c2892Ye.d1(c2892Ye.F0(), 6);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void z() {
        Jt jt = this.f26531C;
        if (jt != null) {
            jt.z();
            return;
        }
        C4201xq c4201xq = this.f26532n.f33946a;
        if (c4201xq != null) {
            C3941t c3941t = (C3941t) c4201xq.f35841u;
            synchronized (c3941t) {
                c3941t.f34963n = 1;
                c3941t.f();
            }
        }
        Object obj = this.f26535w.get();
        if (obj != null) {
            try {
                ((InterfaceC3597mf) obj).e();
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f26536x.get();
        if (obj2 != null) {
            try {
                C2892Ye c2892Ye = (C2892Ye) obj2;
                c2892Ye.d1(c2892Ye.F0(), 4);
            } catch (RemoteException e11) {
                int i6 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i9 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f26530B.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((Hv) obj3).a();
        } catch (RemoteException e13) {
            int i10 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i11 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }
}
