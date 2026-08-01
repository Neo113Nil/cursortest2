package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.nm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3635nm implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32762n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3797qm f32763u;

    public /* synthetic */ RunnableC3635nm(C3797qm c3797qm, int i) {
        this.f32762n = i;
        this.f32763u = c3797qm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2617Jb interfaceC2617Jb = null;
        switch (this.f32762n) {
            case 0:
                C3797qm c3797qm = this.f32763u;
                c3797qm.f33403n.M();
                C4012um c4012um = c3797qm.f33402m;
                synchronized (c4012um) {
                    try {
                        InterfaceC4061vh interfaceC4061vh = c4012um.i;
                        if (interfaceC4061vh != null) {
                            interfaceC4061vh.destroy();
                            c4012um.i = null;
                        }
                        InterfaceC4061vh interfaceC4061vh2 = c4012um.f34572j;
                        if (interfaceC4061vh2 != null) {
                            interfaceC4061vh2.destroy();
                            c4012um.f34572j = null;
                        }
                        InterfaceC4061vh interfaceC4061vh3 = c4012um.f34573k;
                        if (interfaceC4061vh3 != null) {
                            interfaceC4061vh3.destroy();
                            c4012um.f34573k = null;
                        }
                        N3.a aVar = c4012um.f34575m;
                        if (aVar != null) {
                            aVar.cancel(false);
                            c4012um.f34575m = null;
                        }
                        C3467kg c3467kg = c4012um.f34576n;
                        if (c3467kg != null) {
                            c3467kg.cancel(false);
                            c4012um.f34576n = null;
                        }
                        c4012um.f34574l = null;
                        c4012um.f34584v.clear();
                        c4012um.f34585w.clear();
                        c4012um.f34565b = null;
                        c4012um.f34566c = null;
                        c4012um.f34567d = null;
                        c4012um.f34568e = null;
                        c4012um.f34571h = null;
                        c4012um.f34577o = null;
                        c4012um.f34578p = null;
                        c4012um.f34579q = null;
                        c4012um.f34581s = null;
                        c4012um.f34582t = null;
                        c4012um.f34583u = null;
                    } finally {
                    }
                }
                return;
            default:
                C3797qm c3797qm2 = this.f32763u;
                c3797qm2.getClass();
                try {
                    C4012um c4012um2 = c3797qm2.f33402m;
                    int q8 = c4012um2.q();
                    C4282zm c4282zm = c3797qm2.f33406q;
                    if (q8 == 1) {
                        C2549Fb c2549Fb = c4282zm.f35444a;
                        if (c2549Fb != null) {
                            c3797qm2.l();
                            InterfaceC2481Bb interfaceC2481Bb = (InterfaceC2481Bb) c3797qm2.f33407r.f();
                            Parcel H02 = c2549Fb.H0();
                            AbstractC3388j8.e(H02, interfaceC2481Bb);
                            c2549Fb.f1(H02, 1);
                            return;
                        }
                        return;
                    }
                    if (q8 == 2) {
                        C2532Eb c2532Eb = c4282zm.f35445b;
                        if (c2532Eb != null) {
                            c3797qm2.l();
                            InterfaceC2464Ab interfaceC2464Ab = (InterfaceC2464Ab) c3797qm2.f33408s.f();
                            Parcel H03 = c2532Eb.H0();
                            AbstractC3388j8.e(H03, interfaceC2464Ab);
                            c2532Eb.f1(H03, 1);
                            return;
                        }
                        return;
                    }
                    if (q8 == 3) {
                        String g4 = c4012um2.g();
                        if (g4 != null) {
                            interfaceC2617Jb = (InterfaceC2617Jb) c4282zm.f35449f.getOrDefault(g4, null);
                        }
                        if (interfaceC2617Jb != null) {
                            if (c4012um2.h() != null) {
                                c3797qm2.e("Google", true);
                            }
                            interfaceC2617Jb.n2((InterfaceC2515Db) c3797qm2.f33411v.f());
                            return;
                        }
                        return;
                    }
                    if (q8 == 6) {
                        InterfaceC2685Nb interfaceC2685Nb = c4282zm.f35446c;
                        if (interfaceC2685Nb != null) {
                            c3797qm2.l();
                            interfaceC2685Nb.G3((InterfaceC2736Qb) c3797qm2.f33409t.f());
                            return;
                        }
                        return;
                    }
                    if (q8 != 7) {
                        int i = u2.z.f41322b;
                        v2.i.c("Wrong native template id!");
                        return;
                    }
                    C2618Jc c2618Jc = c4282zm.f35448e;
                    if (c2618Jc != null) {
                        InterfaceC2567Gc interfaceC2567Gc = (InterfaceC2567Gc) c3797qm2.f33410u.f();
                        Parcel H04 = c2618Jc.H0();
                        AbstractC3388j8.e(H04, interfaceC2567Gc);
                        c2618Jc.f1(H04, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e9) {
                    int i6 = u2.z.f41322b;
                    v2.i.d("RemoteException when notifyAdLoad is called", e9);
                    return;
                }
        }
    }
}
