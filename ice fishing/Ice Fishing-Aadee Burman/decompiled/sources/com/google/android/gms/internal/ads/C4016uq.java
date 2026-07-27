package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4016uq implements InterfaceC3639nq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34593a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f34594b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34595c;

    public /* synthetic */ C4016uq(int i, Context context, Object obj) {
        this.f34593a = i;
        this.f34594b = context;
        this.f34595c = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3639nq
    public final Object a(Yt yt, St st, C3477kq c3477kq) {
        switch (this.f34593a) {
            case 0:
                C2570Gf c2570Gf = new C2570Gf(st, (InterfaceC2721Pd) c3477kq.f31639b, k2.b.APP_OPEN_AD);
                C3481ku c3481ku = new C3481ku(yt, st, c3477kq.f31638a);
                S0.s sVar = new S0.s(14, c2570Gf, (Object) null);
                N6.i iVar = new N6.i(st.f27607a0, 3);
                C3469ki c3469ki = (C3469ki) this.f34595c;
                C3309hi c3309hi = c3469ki.f31535c;
                C3469ki c3469ki2 = c3469ki.f31538d;
                C3362ii c3362ii = new C3362ii(c3309hi, c3469ki2, c3481ku, sVar, iVar);
                C3243gN c3243gN = c3362ii.f31079F0;
                c2570Gf.f25045x = (C2507Ck) c3243gN.f();
                ((BinderC2564Fq) c3477kq.f31640c).V3(new BinderC3318hr((C3902sk) c3362ii.f31084K0.f(), (C2525Dl) c3362ii.f31086M0.f(), (C2507Ck) c3243gN.f(), (C2575Gk) c3362ii.f31082I0.f(), (C2626Jk) c3362ii.f31087N0.f(), (C3365il) c3469ki2.f31546f1.f(), (C2762Rk) c3362ii.f31089P0.f(), (C2661Ll) c3362ii.f31090Q0.f(), (C3258gl) c3362ii.f31091R0.f(), (C2473Ak) c3362ii.f31093T0.f()));
                return c3362ii.T();
            case 1:
                C2570Gf c2570Gf2 = new C2570Gf(st, (InterfaceC2721Pd) c3477kq.f31639b, k2.b.INTERSTITIAL);
                C3481ku c3481ku2 = new C3481ku(yt, st, c3477kq.f31638a);
                S0.s sVar2 = new S0.s(14, c2570Gf2, (Object) null);
                C3793qi c3793qi = (C3793qi) this.f34595c;
                C3309hi c3309hi2 = c3793qi.f33311b;
                C3793qi c3793qi2 = c3793qi.f33314c;
                C3739pi c3739pi = new C3739pi(c3309hi2, c3793qi2, c3481ku2, sVar2);
                C3243gN c3243gN2 = c3739pi.f33081E0;
                c2570Gf2.f25045x = (C2507Ck) c3243gN2.f();
                ((BinderC2564Fq) c3477kq.f31640c).V3(new BinderC3318hr((C3902sk) c3739pi.f33086J0.f(), (C2525Dl) c3739pi.f33089M0.f(), (C2507Ck) c3243gN2.f(), (C2575Gk) c3739pi.f33084H0.f(), (C2626Jk) c3739pi.f33090N0.f(), (C3365il) c3793qi2.f33328g1.f(), (C2762Rk) c3739pi.f33093Q0.f(), (C2661Ll) c3739pi.f33094R0.f(), (C3258gl) c3739pi.f33095S0.f(), (C2473Ak) c3739pi.f33098U0.f()));
                return c3739pi.T();
            default:
                C2570Gf c2570Gf3 = new C2570Gf(st, (InterfaceC2721Pd) c3477kq.f31639b, k2.b.REWARDED);
                C3481ku c3481ku3 = new C3481ku(yt, st, c3477kq.f31638a);
                C2493Bn c2493Bn = new C2493Bn(c2570Gf3, null, 0);
                C3900si c3900si = (C3900si) this.f34595c;
                C3309hi c3309hi3 = c3900si.f34061c;
                C3900si c3900si2 = c3900si.f34064d;
                C3846ri c3846ri = new C3846ri(c3309hi3, c3900si2, c3481ku3, c2493Bn);
                C3243gN c3243gN3 = c3846ri.f33653E0;
                c2570Gf3.f25045x = (C2507Ck) c3243gN3.f();
                ((BinderC2564Fq) c3477kq.f31640c).V3(new BinderC3264gr((C3902sk) c3846ri.f33658J0.f(), (C2525Dl) c3846ri.f33660L0.f(), (C2507Ck) c3243gN3.f(), (C2575Gk) c3846ri.f33656H0.f(), (C2626Jk) c3846ri.f33661M0.f(), (C2473Ak) c3846ri.f33668T0.f(), (C3365il) c3900si2.f34083j1.f(), (C2661Ll) c3846ri.f33665Q0.f(), (C2762Rk) c3846ri.f33664P0.f(), (C2610Il) c3846ri.f33672V0.f(), (C3258gl) c3846ri.f33666R0.f()));
                return c3846ri.T();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3639nq
    public final void b(Yt yt, St st, C3477kq c3477kq) {
        switch (this.f34593a) {
            case 0:
                try {
                    InterfaceC2721Pd interfaceC2721Pd = (InterfaceC2721Pd) c3477kq.f31639b;
                    interfaceC2721Pd.B2(st.f27605Z);
                    interfaceC2721Pd.z2(st.f27601U, st.f27646v.toString(), ((C3052cu) yt.f28753a.f31863u).f29623d, new W2.b(this.f34594b), new BinderC3962tq(c3477kq), (InterfaceC3841rd) c3477kq.f31640c);
                    return;
                } catch (RemoteException e9) {
                    u2.z.l("Remote exception loading an app open RTB ad", e9);
                    throw new C3267gu(e9);
                }
            case 1:
                try {
                    InterfaceC2721Pd interfaceC2721Pd2 = (InterfaceC2721Pd) c3477kq.f31639b;
                    interfaceC2721Pd2.B2(st.f27605Z);
                    interfaceC2721Pd2.t3(st.f27601U, st.f27646v.toString(), ((C3052cu) yt.f28753a.f31863u).f29623d, new W2.b(this.f34594b), new BinderC2649Kq(this, c3477kq), (InterfaceC3841rd) c3477kq.f31640c);
                    return;
                } catch (RemoteException e10) {
                    u2.z.l("Remote exception loading a interstitial RTB ad", e10);
                    throw new C3267gu(e10);
                }
            default:
                try {
                    InterfaceC2721Pd interfaceC2721Pd3 = (InterfaceC2721Pd) c3477kq.f31639b;
                    interfaceC2721Pd3.B2(st.f27605Z);
                    C3052cu c3052cu = (C3052cu) yt.f28753a.f31863u;
                    int i = c3052cu.f29634p.f1974u;
                    IInterface iInterface = c3477kq.f31640c;
                    Context context = this.f34594b;
                    JSONObject jSONObject = st.f27646v;
                    if (i == 3) {
                        interfaceC2721Pd3.w1(st.f27601U, jSONObject.toString(), c3052cu.f29623d, new W2.b(context), new BinderC3049cr(this, c3477kq), (InterfaceC3841rd) iInterface);
                    } else {
                        interfaceC2721Pd3.k3(st.f27601U, jSONObject.toString(), c3052cu.f29623d, new W2.b(context), new BinderC3049cr(this, c3477kq), (InterfaceC3841rd) iInterface);
                    }
                    return;
                } catch (RemoteException e11) {
                    u2.z.l("Remote exception loading a rewarded RTB ad", e11);
                    return;
                }
        }
    }
}
