package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.om, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3712om implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33724n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3873rm f33725u;

    public /* synthetic */ RunnableC3712om(C3873rm c3873rm, int i) {
        this.f33724n = i;
        this.f33725u = c3873rm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2637Jb interfaceC2637Jb = null;
        switch (this.f33724n) {
            case 0:
                C3873rm c3873rm = this.f33725u;
                c3873rm.f34503n.L();
                C4089vm c4089vm = c3873rm.f34502m;
                synchronized (c4089vm) {
                    try {
                        InterfaceC4084vh interfaceC4084vh = c4089vm.i;
                        if (interfaceC4084vh != null) {
                            interfaceC4084vh.destroy();
                            c4089vm.i = null;
                        }
                        InterfaceC4084vh interfaceC4084vh2 = c4089vm.f35493j;
                        if (interfaceC4084vh2 != null) {
                            interfaceC4084vh2.destroy();
                            c4089vm.f35493j = null;
                        }
                        InterfaceC4084vh interfaceC4084vh3 = c4089vm.f35494k;
                        if (interfaceC4084vh3 != null) {
                            interfaceC4084vh3.destroy();
                            c4089vm.f35494k = null;
                        }
                        P3.a aVar = c4089vm.f35496m;
                        if (aVar != null) {
                            aVar.cancel(false);
                            c4089vm.f35496m = null;
                        }
                        C3490kg c3490kg = c4089vm.f35497n;
                        if (c3490kg != null) {
                            c3490kg.cancel(false);
                            c4089vm.f35497n = null;
                        }
                        c4089vm.f35495l = null;
                        c4089vm.f35505v.clear();
                        c4089vm.f35506w.clear();
                        c4089vm.f35486b = null;
                        c4089vm.f35487c = null;
                        c4089vm.f35488d = null;
                        c4089vm.f35489e = null;
                        c4089vm.f35492h = null;
                        c4089vm.f35498o = null;
                        c4089vm.f35499p = null;
                        c4089vm.f35500q = null;
                        c4089vm.f35502s = null;
                        c4089vm.f35503t = null;
                        c4089vm.f35504u = null;
                    } finally {
                    }
                }
                return;
            default:
                C3873rm c3873rm2 = this.f33725u;
                c3873rm2.getClass();
                try {
                    C4089vm c4089vm2 = c3873rm2.f34502m;
                    int q8 = c4089vm2.q();
                    C2495Am c2495Am = c3873rm2.f34506q;
                    if (q8 == 1) {
                        C2569Fb c2569Fb = c2495Am.f24510a;
                        if (c2569Fb != null) {
                            c3873rm2.l();
                            InterfaceC2501Bb interfaceC2501Bb = (InterfaceC2501Bb) c3873rm2.f34507r.f();
                            Parcel F02 = c2569Fb.F0();
                            AbstractC3411j8.e(F02, interfaceC2501Bb);
                            c2569Fb.d1(F02, 1);
                            return;
                        }
                        return;
                    }
                    if (q8 == 2) {
                        C2552Eb c2552Eb = c2495Am.f24511b;
                        if (c2552Eb != null) {
                            c3873rm2.l();
                            InterfaceC2484Ab interfaceC2484Ab = (InterfaceC2484Ab) c3873rm2.f34508s.f();
                            Parcel F03 = c2552Eb.F0();
                            AbstractC3411j8.e(F03, interfaceC2484Ab);
                            c2552Eb.d1(F03, 1);
                            return;
                        }
                        return;
                    }
                    if (q8 == 3) {
                        String g9 = c4089vm2.g();
                        if (g9 != null) {
                            interfaceC2637Jb = (InterfaceC2637Jb) c2495Am.f24515f.getOrDefault(g9, null);
                        }
                        if (interfaceC2637Jb != null) {
                            if (c4089vm2.h() != null) {
                                c3873rm2.e("Google", true);
                            }
                            interfaceC2637Jb.g2((InterfaceC2535Db) c3873rm2.f34511v.f());
                            return;
                        }
                        return;
                    }
                    if (q8 == 6) {
                        InterfaceC2705Nb interfaceC2705Nb = c2495Am.f24512c;
                        if (interfaceC2705Nb != null) {
                            c3873rm2.l();
                            interfaceC2705Nb.B3((InterfaceC2756Qb) c3873rm2.f34509t.f());
                            return;
                        }
                        return;
                    }
                    if (q8 != 7) {
                        int i = w2.z.f41712b;
                        x2.i.c("Wrong native template id!");
                        return;
                    }
                    C2638Jc c2638Jc = c2495Am.f24514e;
                    if (c2638Jc != null) {
                        InterfaceC2587Gc interfaceC2587Gc = (InterfaceC2587Gc) c3873rm2.f34510u.f();
                        Parcel F04 = c2638Jc.F0();
                        AbstractC3411j8.e(F04, interfaceC2587Gc);
                        c2638Jc.d1(F04, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e9) {
                    int i4 = w2.z.f41712b;
                    x2.i.d("RemoteException when notifyAdLoad is called", e9);
                    return;
                }
        }
    }
}
