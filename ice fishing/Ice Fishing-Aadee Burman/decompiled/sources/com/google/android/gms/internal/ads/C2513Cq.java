package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayDeque;
import t2.C5037e;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2513Cq implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24247f;

    public /* synthetic */ C2513Cq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f24242a = i;
        this.f24243b = obj;
        this.f24244c = obj2;
        this.f24245d = obj3;
        this.f24246e = obj4;
        this.f24247f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // com.google.android.gms.internal.ads.BD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final N3.a a(Object obj) {
        C3054cw c3054cw;
        boolean z3;
        XC xc;
        InterfaceC4074vu interfaceC4074vu;
        switch (this.f24242a) {
            case 0:
                Uri uri = (Uri) this.f24244c;
                Yt yt = (Yt) this.f24245d;
                St st = (St) this.f24246e;
                Ut ut = (Ut) this.f24247f;
                C2530Dq c2530Dq = (C2530Dq) this.f24243b;
                c2530Dq.getClass();
                try {
                    Intent intent = (Intent) new com.bumptech.glide.manager.o().b().f39362n;
                    intent.setData(uri);
                    C5037e c5037e = new C5037e(intent, null);
                    C3467kg c3467kg = new C3467kg();
                    C3793qi c3793qi = (C3793qi) c2530Dq.f24468c;
                    C3739pi c3739pi = new C3739pi(c3793qi.f33311b, c3793qi.f33314c, new C3481ku(yt, st, (String) null), new S0.s(14, new C3481ku(c2530Dq, c3467kg, st), (Object) null));
                    c3467kg.b(new AdOverlayInfoParcel(c5037e, null, (C2762Rk) c3739pi.f33093Q0.f(), null, new C5110a(0, 0, false, false), null, null, ut.f28004b));
                    ((Rt) c2530Dq.f24470e).c(2, 3);
                    return QC.c(c3739pi.T());
                } catch (Throwable th) {
                    int i = u2.z.f41319b;
                    v2.i.d("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            default:
                T8 t82 = (T8) this.f24243b;
                S0.e eVar = (S0.e) this.f24244c;
                C3804qt c3804qt = (C3804qt) this.f24245d;
                InterfaceC4289zt interfaceC4289zt = (InterfaceC4289zt) this.f24246e;
                InterfaceC3633nk interfaceC3633nk = (InterfaceC3633nk) this.f24247f;
                C3911st c3911st = (C3911st) obj;
                if (c3911st != null) {
                    t82.getClass();
                    InterfaceC4289zt interfaceC4289zt2 = c3804qt.f33430a;
                    S0.e eVar2 = c3804qt.f33431b;
                    q2.c1 c1Var = c3804qt.f33432c;
                    String str = c3804qt.f33433d;
                    RD rd = c3804qt.f33434e;
                    q2.i1 i1Var = c3804qt.f33435f;
                    InterfaceC4074vu interfaceC4074vu2 = c3911st.f34161a;
                    C3804qt c3804qt2 = new C3804qt(interfaceC4289zt2, eVar2, c1Var, str, rd, i1Var, interfaceC4074vu2);
                    C4020uu c4020uu = c3911st.f34163c;
                    if (c4020uu != null) {
                        t82.f27699x = null;
                        C3918t c3918t = (C3918t) t82.f27697v;
                        synchronized (c3918t) {
                            ((ArrayDeque) c3918t.f34180w).add(c3804qt2);
                        }
                        return t82.n(c4020uu, eVar);
                    }
                    C3918t c3918t2 = (C3918t) t82.f27697v;
                    synchronized (c3918t2) {
                        c3918t2.f34177n = 2;
                        synchronized (c3918t2) {
                            try {
                                c3054cw = (C3054cw) c3918t2.f34181x;
                                z3 = c3054cw == null;
                            } finally {
                            }
                        }
                        if (xc == null) {
                            t82.f27699x = null;
                            return QC.t(xc, new C4164xc(11, t82), (RD) t82.f27700y);
                        }
                        synchronized (c3918t2) {
                            ((ArrayDeque) c3918t2.f34180w).add(c3804qt2);
                        }
                        eVar = new S0.e((InterfaceC4235yt) eVar.f2782v, c3911st.f34162b, 19, false);
                    }
                    if (z3) {
                        xc = null;
                    } else {
                        synchronized (c3054cw) {
                            try {
                                if (!c3054cw.f29645b && !c3054cw.f29644a && (interfaceC4074vu = ((C3804qt) c3054cw.f29646c).f33436g) != null && interfaceC4074vu.equals(interfaceC4074vu2)) {
                                    c3054cw.f29644a = true;
                                    xc = (XC) c3054cw.f29647d;
                                }
                                xc = null;
                            } finally {
                            }
                        }
                    }
                    if (xc == null) {
                    }
                }
                N3.a t6 = ((S0.c) t82.f27695n).t(eVar, interfaceC4289zt, interfaceC3633nk);
                t82.f27699x = interfaceC3633nk;
                return t6;
        }
    }
}
