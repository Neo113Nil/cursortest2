package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4039uq implements InterfaceC3662nq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35356a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f35357b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f35358c;

    public /* synthetic */ C4039uq(int i, Context context, Object obj) {
        this.f35356a = i;
        this.f35357b = context;
        this.f35358c = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3662nq
    public final Object a(Yt yt, St st, C3500kq c3500kq) {
        switch (this.f35356a) {
            case 0:
                C2590Gf c2590Gf = new C2590Gf(st, (InterfaceC2741Pd) c3500kq.f32421b, m2.b.APP_OPEN_AD);
                C3504ku c3504ku = new C3504ku(yt, st, c3500kq.f32420a);
                S0.s sVar = new S0.s(16, c2590Gf, (Object) null);
                N6.i iVar = new N6.i(st.f28390a0, 3);
                C3492ki c3492ki = (C3492ki) this.f35358c;
                C3332hi c3332hi = c3492ki.f32312c;
                C3492ki c3492ki2 = c3492ki.f32315d;
                C3385ii c3385ii = new C3385ii(c3332hi, c3492ki2, c3504ku, sVar, iVar);
                C3266gN c3266gN = c3385ii.f31846A0;
                c2590Gf.f25833x = (C2527Ck) c3266gN.f();
                ((BinderC2584Fq) c3500kq.f32422c).V3(new BinderC3341hr((C3925sk) c3385ii.f31850F0.f(), (C2562El) c3385ii.f31852H0.f(), (C2527Ck) c3266gN.f(), (C2595Gk) c3385ii.f31848D0.f(), (C2646Jk) c3385ii.f31853I0.f(), (C3388il) c3492ki2.f32323f1.f(), (C2782Rk) c3385ii.f31855K0.f(), (C2698Ml) c3385ii.f31856L0.f(), (C3281gl) c3385ii.f31857M0.f(), (C2493Ak) c3385ii.f31859O0.f()));
                return c3385ii.T();
            case 1:
                C2590Gf c2590Gf2 = new C2590Gf(st, (InterfaceC2741Pd) c3500kq.f32421b, m2.b.INTERSTITIAL);
                C3504ku c3504ku2 = new C3504ku(yt, st, c3500kq.f32420a);
                S0.s sVar2 = new S0.s(16, c2590Gf2, (Object) null);
                C3816qi c3816qi = (C3816qi) this.f35358c;
                C3332hi c3332hi2 = c3816qi.f34093b;
                C3816qi c3816qi2 = c3816qi.f34096c;
                C3762pi c3762pi = new C3762pi(c3332hi2, c3816qi2, c3504ku2, sVar2);
                C3266gN c3266gN2 = c3762pi.f33906z0;
                c2590Gf2.f25833x = (C2527Ck) c3266gN2.f();
                ((BinderC2584Fq) c3500kq.f32422c).V3(new BinderC3341hr((C3925sk) c3762pi.f33871E0.f(), (C2562El) c3762pi.f33874H0.f(), (C2527Ck) c3266gN2.f(), (C2595Gk) c3762pi.C0.f(), (C2646Jk) c3762pi.f33875I0.f(), (C3388il) c3816qi2.f34110g1.f(), (C2782Rk) c3762pi.f33878L0.f(), (C2698Ml) c3762pi.f33879M0.f(), (C3281gl) c3762pi.f33880N0.f(), (C2493Ak) c3762pi.f33882P0.f()));
                return c3762pi.T();
            default:
                C2590Gf c2590Gf3 = new C2590Gf(st, (InterfaceC2741Pd) c3500kq.f32421b, m2.b.REWARDED);
                C3504ku c3504ku3 = new C3504ku(yt, st, c3500kq.f32420a);
                C2530Cn c2530Cn = new C2530Cn(c2590Gf3, null, 0);
                C3923si c3923si = (C3923si) this.f35358c;
                C3332hi c3332hi3 = c3923si.f34827c;
                C3923si c3923si2 = c3923si.f34830d;
                C3869ri c3869ri = new C3869ri(c3332hi3, c3923si2, c3504ku3, c2530Cn);
                C3266gN c3266gN3 = c3869ri.f34462z0;
                c2590Gf3.f25833x = (C2527Ck) c3266gN3.f();
                ((BinderC2584Fq) c3500kq.f32422c).V3(new BinderC3287gr((C3925sk) c3869ri.f34426E0.f(), (C2562El) c3869ri.f34428G0.f(), (C2527Ck) c3266gN3.f(), (C2595Gk) c3869ri.C0.f(), (C2646Jk) c3869ri.f34429H0.f(), (C2493Ak) c3869ri.f34436O0.f(), (C3388il) c3923si2.f34849j1.f(), (C2698Ml) c3869ri.f34433L0.f(), (C2782Rk) c3869ri.f34432K0.f(), (C2647Jl) c3869ri.f34438Q0.f(), (C3281gl) c3869ri.f34434M0.f()));
                return c3869ri.T();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3662nq
    public final void b(Yt yt, St st, C3500kq c3500kq) {
        switch (this.f35356a) {
            case 0:
                try {
                    InterfaceC2741Pd interfaceC2741Pd = (InterfaceC2741Pd) c3500kq.f32421b;
                    interfaceC2741Pd.x2(st.f28388Z);
                    interfaceC2741Pd.K3(st.f28384U, st.f28429v.toString(), ((C3075cu) yt.f29532a.f32643u).f30393d, new Y2.b(this.f35357b), new BinderC3985tq(c3500kq), (InterfaceC3864rd) c3500kq.f32422c);
                    return;
                } catch (RemoteException e9) {
                    w2.z.l("Remote exception loading an app open RTB ad", e9);
                    throw new C3290gu(e9);
                }
            case 1:
                try {
                    InterfaceC2741Pd interfaceC2741Pd2 = (InterfaceC2741Pd) c3500kq.f32421b;
                    interfaceC2741Pd2.x2(st.f28388Z);
                    interfaceC2741Pd2.O2(st.f28384U, st.f28429v.toString(), ((C3075cu) yt.f29532a.f32643u).f30393d, new Y2.b(this.f35357b), new BinderC2669Kq(this, c3500kq), (InterfaceC3864rd) c3500kq.f32422c);
                    return;
                } catch (RemoteException e10) {
                    w2.z.l("Remote exception loading a interstitial RTB ad", e10);
                    throw new C3290gu(e10);
                }
            default:
                try {
                    InterfaceC2741Pd interfaceC2741Pd3 = (InterfaceC2741Pd) c3500kq.f32421b;
                    interfaceC2741Pd3.x2(st.f28388Z);
                    C3075cu c3075cu = (C3075cu) yt.f29532a.f32643u;
                    int i = c3075cu.f30404p.f2062u;
                    IInterface iInterface = c3500kq.f32422c;
                    Context context = this.f35357b;
                    JSONObject jSONObject = st.f28429v;
                    if (i == 3) {
                        interfaceC2741Pd3.e1(st.f28384U, jSONObject.toString(), c3075cu.f30393d, new Y2.b(context), new BinderC3072cr(this, c3500kq), (InterfaceC3864rd) iInterface);
                    } else {
                        interfaceC2741Pd3.z2(st.f28384U, jSONObject.toString(), c3075cu.f30393d, new Y2.b(context), new BinderC3072cr(this, c3500kq), (InterfaceC3864rd) iInterface);
                    }
                    return;
                } catch (RemoteException e11) {
                    w2.z.l("Remote exception loading a rewarded RTB ad", e11);
                    return;
                }
        }
    }
}
