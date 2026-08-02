package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n2.InterfaceC4769d;
import s2.C4969z0;
import s2.InterfaceC4917A;
import s2.InterfaceC4919a;
import s2.InterfaceC4920a0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4964x;

/* loaded from: classes2.dex */
public final class Dr implements InterfaceC4769d, InterfaceC3013bl, InterfaceC2663Kk, InterfaceC4195xk, InterfaceC2544Dk, InterfaceC4919a, InterfaceC4033uk, InterfaceC2816Tk, InterfaceC2510Bk, InterfaceC2579Fl {

    /* renamed from: C, reason: collision with root package name */
    public final C3230fo f25235C;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f25237n = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f25238u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f25239v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f25240w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f25241x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f25242y = new AtomicBoolean(true);

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f25243z = new AtomicBoolean(false);

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f25233A = new AtomicBoolean(false);

    /* renamed from: B, reason: collision with root package name */
    public final AtomicReference f25234B = new AtomicReference();

    /* renamed from: D, reason: collision with root package name */
    public final ArrayBlockingQueue f25236D = new ArrayBlockingQueue(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.ha)).intValue());

    public Dr(C3230fo c3230fo) {
        this.f25235C = c3230fo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void B() {
        Object obj = this.f25237n.get();
        if (obj != null) {
            try {
                ((InterfaceC4964x) obj).e();
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        AtomicReference atomicReference = this.f25241x;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC4920a0) obj2).A();
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
            ((InterfaceC4920a0) obj3).o();
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
        Object obj;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.gc)).booleanValue() && (obj = this.f25237n.get()) != null) {
            try {
                ((InterfaceC4964x) obj).h();
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f25241x.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((InterfaceC4920a0) obj2).d();
        } catch (RemoteException e11) {
            int i6 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            int i9 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final void I(C4969z0 c4969z0) {
        AtomicReference atomicReference = this.f25237n;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC4964x) obj).M(c4969z0);
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC4964x) obj2).x(c4969z0.f40512n);
            } catch (RemoteException e11) {
                int i6 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i9 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f25240w.get();
        if (obj3 != null) {
            try {
                ((InterfaceC4917A) obj3).r2(c4969z0);
            } catch (RemoteException e13) {
                int i10 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e13);
            } catch (NullPointerException e14) {
                int i11 = w2.z.f41712b;
                x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
            }
        }
        this.f25242y.set(false);
        this.f25236D.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void L() {
        Object obj = this.f25237n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4964x) obj).g();
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void O(Yt yt) {
        this.f25242y.set(true);
        this.f25233A.set(false);
    }

    public final synchronized InterfaceC4964x a() {
        return (InterfaceC4964x) this.f25237n.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2816Tk
    public final void b(s2.g1 g1Var) {
        Object obj = this.f25239v.get();
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
        Object obj = this.f25241x.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4920a0) obj).U2(c4969z0);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void e() {
    }

    @Override // n2.InterfaceC4769d
    public final synchronized void f(String str, String str2) {
        if (!this.f25242y.get()) {
            Object obj = this.f25238u.get();
            if (obj != null) {
                try {
                    ((s2.V) obj).q2(str, str2);
                } catch (RemoteException e9) {
                    int i = w2.z.f41712b;
                    x2.i.i("#007 Could not call remote method.", e9);
                } catch (NullPointerException e10) {
                    int i4 = w2.z.f41712b;
                    x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
                }
            }
            return;
        }
        if (!this.f25236D.offer(new Pair(str, str2))) {
            int i6 = w2.z.f41712b;
            x2.i.a("The queue for app events is full, dropping the new event.");
            C3230fo c3230fo = this.f25235C;
            if (c3230fo != null) {
                S0.e a9 = c3230fo.a();
                a9.M(NativeAdvancedJsUtils.f18693p, "dae_action");
                a9.M("dae_name", str);
                a9.M("dae_data", str2);
                a9.N();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final synchronized void h() {
        AbstractC2659Kg.j(this.f25237n, C3609mr.f33391v);
        AbstractC2659Kg.j(this.f25240w, C3609mr.f33394y);
        this.f25233A.set(true);
        o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void i(C2759Qe c2759Qe) {
    }

    public final void n(s2.V v9) {
        this.f25238u.set(v9);
        this.f25243z.set(true);
        o();
    }

    public final void o() {
        if (this.f25243z.get() && this.f25233A.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.f25236D;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f25238u.get();
                if (obj != null) {
                    try {
                        ((s2.V) obj).q2((String) pair.first, (String) pair.second);
                    } catch (RemoteException e9) {
                        int i = w2.z.f41712b;
                        x2.i.i("#007 Could not call remote method.", e9);
                    } catch (NullPointerException e10) {
                        int i4 = w2.z.f41712b;
                        x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f25242y.set(false);
        }
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.gc)).booleanValue() || (obj = this.f25237n.get()) == null) {
            return;
        }
        try {
            ((InterfaceC4964x) obj).h();
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        AbstractC2659Kg.j(this.f25237n, C3609mr.f33392w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void y() {
        Object obj = this.f25237n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4964x) obj).o();
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
        AbstractC2659Kg.j(this.f25237n, C3609mr.f33393x);
        AbstractC2659Kg.j(this.f25241x, C3609mr.f33395z);
        AbstractC2659Kg.j(this.f25234B, C3609mr.f33375A);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void t(BinderC2844Ve binderC2844Ve, String str, String str2) {
    }
}
