package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4920z0;
import q2.InterfaceC4904r0;

/* loaded from: classes2.dex */
public final class Jt implements G2.a, InterfaceC2643Kk, InterfaceC4172xk, InterfaceC4010uk, InterfaceC2490Bk, InterfaceC2795Tk, InterfaceC4181xt, InterfaceC2542El {

    /* renamed from: n, reason: collision with root package name */
    public final C3751pu f25780n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f25781u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f25782v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f25783w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f25784x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f25785y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f25786z = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public final AtomicReference f25777A = new AtomicReference();

    /* renamed from: B, reason: collision with root package name */
    public final AtomicReference f25778B = new AtomicReference();

    /* renamed from: C, reason: collision with root package name */
    public final Jt f25779C = null;

    public Jt(C3751pu c3751pu) {
        this.f25780n = c3751pu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void A() {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.A();
            return;
        }
        C4178xq c4178xq = this.f25780n.f33160a;
        if (c4178xq != null) {
            C3918t c3918t = (C3918t) c4178xq.f35055u;
            synchronized (c3918t) {
                c3918t.f34177n = 1;
                c3918t.f();
            }
        }
        Object obj = this.f25783w.get();
        if (obj != null) {
            try {
                ((InterfaceC3574mf) obj).e();
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f25784x.get();
        if (obj2 != null) {
            try {
                C2869Ye c2869Ye = (C2869Ye) obj2;
                c2869Ye.f1(c2869Ye.H0(), 4);
            } catch (RemoteException e11) {
                int i9 = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i10 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f25778B.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((Hv) obj3).a();
        } catch (RemoteException e13) {
            int i11 = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i12 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void D() {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.D();
            return;
        }
        AtomicReference atomicReference = this.f25783w;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC3574mf) obj).d();
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f25784x.get();
        if (obj2 != null) {
            try {
                C2869Ye c2869Ye = (C2869Ye) obj2;
                c2869Ye.f1(c2869Ye.H0(), 2);
            } catch (RemoteException e11) {
                int i9 = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i10 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((InterfaceC3574mf) obj3).j();
        } catch (RemoteException e13) {
            int i11 = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i12 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void J() {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.J();
        } else {
            AbstractC2639Kg.j(this.f25783w, C3586mr.f32601E);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void M() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2795Tk
    public final void a(q2.g1 g1Var) {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.a(g1Var);
            return;
        }
        Object obj = this.f25777A.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4904r0) obj).p1(g1Var);
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2490Bk
    public final void b(C4920z0 c4920z0) {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.b(c4920z0);
            return;
        }
        AtomicReference atomicReference = this.f25783w;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC3574mf) obj).K0(c4920z0);
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((InterfaceC3574mf) obj2).D(c4920z0.f40213n);
        } catch (RemoteException e11) {
            int i9 = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            int i10 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // G2.a
    public final void c() {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.c();
        } else {
            AbstractC2639Kg.j(this.f25781u, C3586mr.f32602F);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void d() {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.d();
            return;
        }
        Object obj = this.f25784x.get();
        if (obj == null) {
            return;
        }
        try {
            C2869Ye c2869Ye = (C2869Ye) obj;
            c2869Ye.f1(c2869Ye.H0(), 3);
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void e() {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.e();
            return;
        }
        Object obj = this.f25784x.get();
        if (obj == null) {
            return;
        }
        try {
            C2869Ye c2869Ye = (C2869Ye) obj;
            c2869Ye.f1(c2869Ye.H0(), 8);
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.h();
            return;
        }
        Object obj = this.f25782v.get();
        if (obj != null) {
            try {
                ((InterfaceC3790qf) obj).d();
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f25784x.get();
        if (obj2 == null) {
            return;
        }
        try {
            C2869Ye c2869Ye = (C2869Ye) obj2;
            c2869Ye.f1(c2869Ye.H0(), 1);
        } catch (RemoteException e11) {
            int i9 = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            int i10 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void t(BinderC2821Ve binderC2821Ve, String str, String str2) {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.t(binderC2821Ve, str, str2);
            return;
        }
        Object obj = this.f25783w.get();
        int i = binderC2821Ve.f28215u;
        String str3 = binderC2821Ve.f28214n;
        if (obj != null) {
            try {
                ((InterfaceC3574mf) obj).o1(new BinderC4059vf(str3, i));
            } catch (RemoteException e9) {
                int i6 = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i9 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f25785y.get();
        if (obj2 != null) {
            try {
                C3843rf c3843rf = (C3843rf) obj2;
                BinderC4059vf binderC4059vf = new BinderC4059vf(str3, i);
                Parcel H02 = c3843rf.H0();
                AbstractC3388j8.e(H02, binderC4059vf);
                H02.writeString(str);
                H02.writeString(str2);
                c3843rf.f1(H02, 2);
            } catch (RemoteException e11) {
                int i10 = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i11 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f25784x.get();
        if (obj3 != null) {
            try {
                C2869Ye c2869Ye = (C2869Ye) obj3;
                Parcel H03 = c2869Ye.H0();
                AbstractC3388j8.e(H03, binderC2821Ve);
                c2869Ye.f1(H03, 5);
            } catch (RemoteException e13) {
                int i12 = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e13);
            } catch (NullPointerException e14) {
                int i13 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
            }
        }
        Object obj4 = this.f25786z.get();
        if (obj4 == null) {
            return;
        }
        try {
            C2853Xe c2853Xe = (C2853Xe) obj4;
            Parcel H04 = c2853Xe.H0();
            AbstractC3388j8.e(H04, binderC2821Ve);
            H04.writeString(str);
            H04.writeString(str2);
            c2853Xe.f1(H04, 2);
        } catch (RemoteException e15) {
            int i14 = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e15);
        } catch (NullPointerException e16) {
            int i15 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e16);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final void v(C4920z0 c4920z0) {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.v(c4920z0);
            return;
        }
        AtomicReference atomicReference = this.f25782v;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC3790qf) obj).a(c4920z0);
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        int i9 = c4920z0.f40213n;
        if (obj2 != null) {
            try {
                ((InterfaceC3790qf) obj2).v(i9);
            } catch (RemoteException e11) {
                int i10 = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i11 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f25784x.get();
        if (obj3 == null) {
            return;
        }
        try {
            C2869Ye c2869Ye = (C2869Ye) obj3;
            Parcel H02 = c2869Ye.H0();
            H02.writeInt(i9);
            c2869Ye.f1(H02, 7);
        } catch (RemoteException e13) {
            int i12 = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e13);
        } catch (NullPointerException e14) {
            int i13 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void z() {
        Jt jt = this.f25779C;
        if (jt != null) {
            jt.z();
            return;
        }
        Object obj = this.f25784x.get();
        if (obj == null) {
            return;
        }
        try {
            C2869Ye c2869Ye = (C2869Ye) obj;
            c2869Ye.f1(c2869Ye.H0(), 6);
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }
}
