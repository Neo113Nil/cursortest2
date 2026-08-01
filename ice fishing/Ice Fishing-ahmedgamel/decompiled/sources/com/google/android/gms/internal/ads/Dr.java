package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.InterfaceC4660d;
import q2.C4920z0;
import q2.InterfaceC4868A;
import q2.InterfaceC4870a;
import q2.InterfaceC4871a0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4915x;

/* loaded from: classes2.dex */
public final class Dr implements InterfaceC4660d, InterfaceC2990bl, InterfaceC2643Kk, InterfaceC4172xk, InterfaceC2524Dk, InterfaceC4870a, InterfaceC4010uk, InterfaceC2795Tk, InterfaceC2490Bk, InterfaceC2542El {

    /* renamed from: C, reason: collision with root package name */
    public final C3153eo f24474C;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f24476n = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f24477u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f24478v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f24479w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f24480x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f24481y = new AtomicBoolean(true);

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f24482z = new AtomicBoolean(false);

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f24472A = new AtomicBoolean(false);

    /* renamed from: B, reason: collision with root package name */
    public final AtomicReference f24473B = new AtomicReference();

    /* renamed from: D, reason: collision with root package name */
    public final ArrayBlockingQueue f24475D = new ArrayBlockingQueue(((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.ha)).intValue());

    public Dr(C3153eo c3153eo) {
        this.f24474C = c3153eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void A() {
        AbstractC2639Kg.j(this.f24476n, C3586mr.f32615x);
        AbstractC2639Kg.j(this.f24480x, C3586mr.f32617z);
        AbstractC2639Kg.j(this.f24473B, C3586mr.f32597A);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void D() {
        Object obj = this.f24476n.get();
        if (obj != null) {
            try {
                ((InterfaceC4915x) obj).e();
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        AtomicReference atomicReference = this.f24480x;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC4871a0) obj2).A();
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
            ((InterfaceC4871a0) obj3).o();
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
        Object obj;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.gc)).booleanValue() && (obj = this.f24476n.get()) != null) {
            try {
                ((InterfaceC4915x) obj).h();
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = this.f24480x.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((InterfaceC4871a0) obj2).d();
        } catch (RemoteException e11) {
            int i9 = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            int i10 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void M() {
        Object obj = this.f24476n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4915x) obj).g();
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void O(Yt yt) {
        this.f24481y.set(true);
        this.f24472A.set(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2795Tk
    public final void a(q2.g1 g1Var) {
        Object obj = this.f24478v.get();
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
        Object obj = this.f24480x.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4871a0) obj).t0(c4920z0);
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    public final synchronized InterfaceC4915x c() {
        return (InterfaceC4915x) this.f24476n.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void e() {
    }

    @Override // l2.InterfaceC4660d
    public final synchronized void f(String str, String str2) {
        if (!this.f24481y.get()) {
            Object obj = this.f24477u.get();
            if (obj != null) {
                try {
                    ((q2.V) obj).u2(str, str2);
                } catch (RemoteException e9) {
                    int i = u2.z.f41322b;
                    v2.i.i("#007 Could not call remote method.", e9);
                } catch (NullPointerException e10) {
                    int i6 = u2.z.f41322b;
                    v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
                }
            }
            return;
        }
        if (!this.f24475D.offer(new Pair(str, str2))) {
            int i9 = u2.z.f41322b;
            v2.i.a("The queue for app events is full, dropping the new event.");
            C3153eo c3153eo = this.f24474C;
            if (c3153eo != null) {
                S0.e a9 = c3153eo.a();
                a9.v(NativeAdvancedJsUtils.f17906p, "dae_action");
                a9.v("dae_name", str);
                a9.v("dae_data", str2);
                a9.y();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final synchronized void h() {
        AbstractC2639Kg.j(this.f24476n, C3586mr.f32613v);
        AbstractC2639Kg.j(this.f24479w, C3586mr.f32616y);
        this.f24472A.set(true);
        o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void i(C2739Qe c2739Qe) {
    }

    public final void n(q2.V v9) {
        this.f24477u.set(v9);
        this.f24482z.set(true);
        o();
    }

    public final void o() {
        if (this.f24482z.get() && this.f24472A.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.f24475D;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f24477u.get();
                if (obj != null) {
                    try {
                        ((q2.V) obj).u2((String) pair.first, (String) pair.second);
                    } catch (RemoteException e9) {
                        int i = u2.z.f41322b;
                        v2.i.i("#007 Could not call remote method.", e9);
                    } catch (NullPointerException e10) {
                        int i6 = u2.z.f41322b;
                        v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f24481y.set(false);
        }
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.gc)).booleanValue() || (obj = this.f24476n.get()) == null) {
            return;
        }
        try {
            ((InterfaceC4915x) obj).h();
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final void v(C4920z0 c4920z0) {
        AtomicReference atomicReference = this.f24476n;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC4915x) obj).G(c4920z0);
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e9);
            } catch (NullPointerException e10) {
                int i6 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC4915x) obj2).x(c4920z0.f40213n);
            } catch (RemoteException e11) {
                int i9 = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e11);
            } catch (NullPointerException e12) {
                int i10 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e12);
            }
        }
        Object obj3 = this.f24479w.get();
        if (obj3 != null) {
            try {
                ((InterfaceC4868A) obj3).P1(c4920z0);
            } catch (RemoteException e13) {
                int i11 = u2.z.f41322b;
                v2.i.i("#007 Could not call remote method.", e13);
            } catch (NullPointerException e14) {
                int i12 = u2.z.f41322b;
                v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e14);
            }
        }
        this.f24481y.set(false);
        this.f24475D.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        AbstractC2639Kg.j(this.f24476n, C3586mr.f32614w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void z() {
        Object obj = this.f24476n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4915x) obj).o();
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41322b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void t(BinderC2821Ve binderC2821Ve, String str, String str2) {
    }
}
