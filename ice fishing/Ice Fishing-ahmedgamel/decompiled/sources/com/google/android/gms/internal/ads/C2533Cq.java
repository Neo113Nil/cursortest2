package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayDeque;
import v2.C5101e;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2533Cq implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24992f;

    public /* synthetic */ C2533Cq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f24987a = i;
        this.f24988b = obj;
        this.f24989c = obj2;
        this.f24990d = obj3;
        this.f24991e = obj4;
        this.f24992f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // com.google.android.gms.internal.ads.BD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final P3.a a(Object obj) {
        C3130dw c3130dw;
        boolean z6;
        XC xc;
        InterfaceC4097vu interfaceC4097vu;
        switch (this.f24987a) {
            case 0:
                Uri uri = (Uri) this.f24989c;
                Yt yt = (Yt) this.f24990d;
                St st = (St) this.f24991e;
                Ut ut = (Ut) this.f24992f;
                C2550Dq c2550Dq = (C2550Dq) this.f24988b;
                c2550Dq.getClass();
                try {
                    Intent intent = (Intent) new com.bumptech.glide.manager.n().b().f26916u;
                    intent.setData(uri);
                    C5101e c5101e = new C5101e(intent, null);
                    C3490kg c3490kg = new C3490kg();
                    C3816qi c3816qi = (C3816qi) c2550Dq.f25229c;
                    C3762pi c3762pi = new C3762pi(c3816qi.f34093b, c3816qi.f34096c, new C3504ku(yt, st, (String) null), new S0.s(16, new C3504ku(c2550Dq, c3490kg, st), (Object) null));
                    c3490kg.b(new AdOverlayInfoParcel(c5101e, null, (C2782Rk) c3762pi.f33878L0.f(), null, new C5189a(0, 0, false, false), null, null, ut.f28801b));
                    ((Rt) c2550Dq.f25231e).c(2, 3);
                    return QC.c(c3762pi.T());
                } catch (Throwable th) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            default:
                T8 t82 = (T8) this.f24988b;
                S0.e eVar = (S0.e) this.f24989c;
                C3827qt c3827qt = (C3827qt) this.f24990d;
                InterfaceC4312zt interfaceC4312zt = (InterfaceC4312zt) this.f24991e;
                InterfaceC3656nk interfaceC3656nk = (InterfaceC3656nk) this.f24992f;
                C3934st c3934st = (C3934st) obj;
                if (c3934st != null) {
                    t82.getClass();
                    InterfaceC4312zt interfaceC4312zt2 = c3827qt.f34197a;
                    S0.e eVar2 = c3827qt.f34198b;
                    s2.c1 c1Var = c3827qt.f34199c;
                    String str = c3827qt.f34200d;
                    RD rd = c3827qt.f34201e;
                    s2.i1 i1Var = c3827qt.f34202f;
                    InterfaceC4097vu interfaceC4097vu2 = c3934st.f34947a;
                    C3827qt c3827qt2 = new C3827qt(interfaceC4312zt2, eVar2, c1Var, str, rd, i1Var, interfaceC4097vu2);
                    C4043uu c4043uu = c3934st.f34949c;
                    if (c4043uu != null) {
                        t82.f28482x = null;
                        C3941t c3941t = (C3941t) t82.f28480v;
                        synchronized (c3941t) {
                            ((ArrayDeque) c3941t.f34966w).add(c3827qt2);
                        }
                        return t82.n(c4043uu, eVar);
                    }
                    C3941t c3941t2 = (C3941t) t82.f28480v;
                    synchronized (c3941t2) {
                        c3941t2.f34963n = 2;
                        synchronized (c3941t2) {
                            try {
                                c3130dw = (C3130dw) c3941t2.f34967x;
                                z6 = c3130dw == null;
                            } finally {
                            }
                        }
                        if (xc == null) {
                            t82.f28482x = null;
                            return QC.t(xc, new C4187xc(11, t82), (RD) t82.f28483y);
                        }
                        synchronized (c3941t2) {
                            ((ArrayDeque) c3941t2.f34966w).add(c3827qt2);
                        }
                        eVar = new S0.e((InterfaceC4258yt) eVar.f2909v, c3934st.f34948b, 22, false);
                    }
                    if (z6) {
                        xc = null;
                    } else {
                        synchronized (c3130dw) {
                            try {
                                if (!c3130dw.f30650b && !c3130dw.f30649a && (interfaceC4097vu = ((C3827qt) c3130dw.f30651c).f34203g) != null && interfaceC4097vu.equals(interfaceC4097vu2)) {
                                    c3130dw.f30649a = true;
                                    xc = (XC) c3130dw.f30652d;
                                }
                                xc = null;
                            } finally {
                            }
                        }
                    }
                    if (xc == null) {
                    }
                }
                P3.a k9 = ((S0.c) t82.f28478n).k(eVar, interfaceC4312zt, interfaceC3656nk);
                t82.f28482x = interfaceC3656nk;
                return k9;
        }
    }
}
