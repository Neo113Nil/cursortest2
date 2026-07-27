package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4927z0;
import q2.InterfaceC4911r0;

/* loaded from: classes2.dex */
public final class Jt implements F2.a, InterfaceC2608Ik, InterfaceC4131wk, InterfaceC3915sk, InterfaceC2472Ak, InterfaceC2761Rk, InterfaceC4248yt, InterfaceC2524Dl {

    /* renamed from: n, reason: collision with root package name */
    public final C3818qu f25840n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f25841u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f25842v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f25843w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f25844x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f25845y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f25846z = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public final AtomicReference f25837A = new AtomicReference();

    /* renamed from: B, reason: collision with root package name */
    public final AtomicReference f25838B = new AtomicReference();

    /* renamed from: C, reason: collision with root package name */
    public final Jt f25839C = null;

    public Jt(C3818qu c3818qu) {
        this.f25840n = c3818qu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void C() {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.C();
        } else {
            AbstractC3194fG.h(this.f25843w, Dr.f24579D);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void E() {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.E();
            return;
        }
        C2478Aq c2478Aq = this.f25840n.f33909a;
        if (c2478Aq != null) {
            C3877s c3877s = (C3877s) c2478Aq.f23905u;
            synchronized (c3877s) {
                c3877s.f34149n = 1;
                c3877s.f();
            }
        }
        Object obj = this.f25843w.get();
        if (obj != null) {
            try {
                ((Cif) obj).f();
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj2 = this.f25844x.get();
        if (obj2 != null) {
            try {
                C2823Ve c2823Ve = (C2823Ve) obj2;
                c2823Ve.G0(c2823Ve.A0(), 4);
            } catch (RemoteException e10) {
                int i9 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i10 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f25838B.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((Jv) obj3).a();
        } catch (RemoteException e12) {
            int i11 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i12 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void F() {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.F();
            return;
        }
        AtomicReference atomicReference = this.f25843w;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((Cif) obj).c();
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj2 = this.f25844x.get();
        if (obj2 != null) {
            try {
                C2823Ve c2823Ve = (C2823Ve) obj2;
                c2823Ve.G0(c2823Ve.A0(), 2);
            } catch (RemoteException e10) {
                int i9 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i10 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((Cif) obj3).h();
        } catch (RemoteException e12) {
            int i11 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i12 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void L() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2761Rk
    public final void a(q2.h1 h1Var) {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.a(h1Var);
            return;
        }
        Object obj = this.f25837A.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4911r0) obj).v1(h1Var);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2472Ak
    public final void b(C4927z0 c4927z0) {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.b(c4927z0);
            return;
        }
        AtomicReference atomicReference = this.f25843w;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((Cif) obj).C0(c4927z0);
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((Cif) obj2).A(c4927z0.f40122n);
        } catch (RemoteException e10) {
            int i9 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i10 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void c() {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.c();
            return;
        }
        Object obj = this.f25844x.get();
        if (obj == null) {
            return;
        }
        try {
            C2823Ve c2823Ve = (C2823Ve) obj;
            c2823Ve.G0(c2823Ve.A0(), 3);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // F2.a
    public final void d() {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.d();
        } else {
            AbstractC3194fG.h(this.f25841u, Dr.f24580E);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.e();
            return;
        }
        Object obj = this.f25842v.get();
        if (obj != null) {
            try {
                ((InterfaceC3587mf) obj).c();
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj2 = this.f25844x.get();
        if (obj2 == null) {
            return;
        }
        try {
            C2823Ve c2823Ve = (C2823Ve) obj2;
            c2823Ve.G0(c2823Ve.A0(), 1);
        } catch (RemoteException e10) {
            int i9 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i10 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void f() {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.f();
            return;
        }
        Object obj = this.f25844x.get();
        if (obj == null) {
            return;
        }
        try {
            C2823Ve c2823Ve = (C2823Ve) obj;
            c2823Ve.G0(c2823Ve.A0(), 8);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void i(BinderC2772Se binderC2772Se, String str, String str2) {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.i(binderC2772Se, str, str2);
            return;
        }
        Object obj = this.f25843w.get();
        int i = binderC2772Se.f27579u;
        String str3 = binderC2772Se.f27578n;
        if (obj != null) {
            try {
                ((Cif) obj).O2(new BinderC3910sf(str3, i));
            } catch (RemoteException e6) {
                int i4 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i9 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj2 = this.f25845y.get();
        if (obj2 != null) {
            try {
                C3641nf c3641nf = (C3641nf) obj2;
                BinderC3910sf binderC3910sf = new BinderC3910sf(str3, i);
                Parcel A02 = c3641nf.A0();
                AbstractC3241g8.e(A02, binderC3910sf);
                A02.writeString(str);
                A02.writeString(str2);
                c3641nf.G0(A02, 2);
            } catch (RemoteException e10) {
                int i10 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i11 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f25844x.get();
        if (obj3 != null) {
            try {
                C2823Ve c2823Ve = (C2823Ve) obj3;
                Parcel A03 = c2823Ve.A0();
                AbstractC3241g8.e(A03, binderC2772Se);
                c2823Ve.G0(A03, 5);
            } catch (RemoteException e12) {
                int i12 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                int i13 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        Object obj4 = this.f25846z.get();
        if (obj4 == null) {
            return;
        }
        try {
            C2806Ue c2806Ue = (C2806Ue) obj4;
            Parcel A04 = c2806Ue.A0();
            AbstractC3241g8.e(A04, binderC2772Se);
            A04.writeString(str);
            A04.writeString(str2);
            c2806Ue.G0(A04, 2);
        } catch (RemoteException e14) {
            int i14 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e14);
        } catch (NullPointerException e15) {
            int i15 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e15);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final void v(C4927z0 c4927z0) {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.v(c4927z0);
            return;
        }
        AtomicReference atomicReference = this.f25842v;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC3587mf) obj).a(c4927z0);
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj2 = atomicReference.get();
        int i9 = c4927z0.f40122n;
        if (obj2 != null) {
            try {
                ((InterfaceC3587mf) obj2).s(i9);
            } catch (RemoteException e10) {
                int i10 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i11 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f25844x.get();
        if (obj3 == null) {
            return;
        }
        try {
            C2823Ve c2823Ve = (C2823Ve) obj3;
            Parcel A02 = c2823Ve.A0();
            A02.writeInt(i9);
            c2823Ve.G0(A02, 7);
        } catch (RemoteException e12) {
            int i12 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i13 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void x() {
        Jt jt = this.f25839C;
        if (jt != null) {
            jt.x();
            return;
        }
        Object obj = this.f25844x.get();
        if (obj == null) {
            return;
        }
        try {
            C2823Ve c2823Ve = (C2823Ve) obj;
            c2823Ve.G0(c2823Ve.A0(), 6);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }
}
