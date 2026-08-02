package ru.yandex.taxi.delivery.ui.form;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ad5;
import defpackage.b6i;
import defpackage.bgq0;
import defpackage.bli;
import defpackage.bvf0;
import defpackage.d770;
import defpackage.die0;
import defpackage.dke;
import defpackage.e4a0;
import defpackage.eki;
import defpackage.elb0;
import defpackage.ffx;
import defpackage.gbi;
import defpackage.gci;
import defpackage.gni;
import defpackage.hei;
import defpackage.hvi;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.iai;
import defpackage.j73;
import defpackage.jji0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jvi;
import defpackage.k3i;
import defpackage.k9i;
import defpackage.kki;
import defpackage.lv90;
import defpackage.lx4;
import defpackage.m950;
import defpackage.mai;
import defpackage.mvi;
import defpackage.n4u0;
import defpackage.nji0;
import defpackage.nti;
import defpackage.nvi;
import defpackage.oep0;
import defpackage.ovi;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.rft0;
import defpackage.tje;
import defpackage.tuh;
import defpackage.vmn0;
import defpackage.vsi;
import defpackage.wai;
import defpackage.wiq0;
import defpackage.wth;
import defpackage.x8;
import defpackage.y5i;
import defpackage.yai;
import defpackage.ysi;
import defpackage.yvf0;
import defpackage.zai;
import defpackage.zmi;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.interactors.h;
import ru.yandex.taxi.delivery.interactors.p;

/* loaded from: classes5.dex */
public final class e extends ad5 {
    public final ru.yandex.taxi.delivery.extracted_delivery_form.interactors.a A;
    public final hvi B;
    public final yvf0 C;
    public final k9i D;
    public final rft0 E;
    public final yvf0 F;
    public final kki G;
    public final gbi H;
    public final y5i I;
    public final yvf0 J;
    public final eki K;
    public final zmi L;
    public final mai M;
    public final nti N;
    public final gci O;
    public final hei P;
    public final jji0 Q;
    public final nji0 R;
    public final ru.yandex.taxi.logistics.photocomment.b S;
    public final jvi T;
    public final yvf0 U;
    public final p V;
    public final wiq0 W;
    public final yvf0 Z;
    public final tuh a0;
    public final yvf0 b0;
    public final iai c0;
    public final h d0;
    public final ru.yandex.taxi.delivery.interactors.b e0;
    public final gni f0;
    public final d770 g0;
    public final vmn0 h0;
    public final k3i i0;
    public final elb0 j0;
    public final vsi k0;
    public final oep0 l0;
    public final n0 m0;
    public final i3y n0;
    public final r0 o0;
    public boolean p0;
    public final bli x;
    public final ovi y;
    public final mvi z;

    public e(bli bliVar, ovi oviVar, mvi mviVar, ru.yandex.taxi.delivery.extracted_delivery_form.interactors.a aVar, hvi hviVar, yvf0 yvf0Var, k9i k9iVar, rft0 rft0Var, yvf0 yvf0Var2, kki kkiVar, gbi gbiVar, y5i y5iVar, yvf0 yvf0Var3, eki ekiVar, zmi zmiVar, mai maiVar, nti ntiVar, gci gciVar, hei heiVar, jji0 jji0Var, nji0 nji0Var, ru.yandex.taxi.logistics.photocomment.b bVar, jvi jviVar, yvf0 yvf0Var4, p pVar, wiq0 wiq0Var, yvf0 yvf0Var5, tuh tuhVar, yvf0 yvf0Var6, iai iaiVar, h hVar, ru.yandex.taxi.delivery.interactors.b bVar2, gni gniVar, d770 d770Var, vmn0 vmn0Var, k3i k3iVar, elb0 elb0Var, vsi vsiVar, oep0 oep0Var) {
        super(wai.class);
        this.x = bliVar;
        this.y = oviVar;
        this.z = mviVar;
        this.A = aVar;
        this.B = hviVar;
        this.C = yvf0Var;
        this.D = k9iVar;
        this.E = rft0Var;
        this.F = yvf0Var2;
        this.G = kkiVar;
        this.H = gbiVar;
        this.I = y5iVar;
        this.J = yvf0Var3;
        this.K = ekiVar;
        this.L = zmiVar;
        this.M = maiVar;
        this.N = ntiVar;
        this.O = gciVar;
        this.P = heiVar;
        this.Q = jji0Var;
        this.R = nji0Var;
        this.S = bVar;
        this.T = jviVar;
        this.U = yvf0Var4;
        this.V = pVar;
        this.W = wiq0Var;
        this.Z = yvf0Var5;
        this.a0 = tuhVar;
        this.b0 = yvf0Var6;
        this.c0 = iaiVar;
        this.d0 = hVar;
        this.e0 = bVar2;
        this.f0 = gniVar;
        this.g0 = d770Var;
        this.h0 = vmn0Var;
        this.i0 = k3iVar;
        this.j0 = elb0Var;
        this.k0 = vsiVar;
        this.l0 = oep0Var;
        this.m0 = ffx.c(0, 0, null, 7);
        this.n0 = kotlin.a.a(new yai(this, 0));
        this.o0 = bvf0.c(Boolean.TRUE);
        this.p0 = true;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ((wai) Dg()).hideKeyboard();
        this.S.m = null;
        super.Cg();
    }

    public final void Kg() {
        nvi nviVar = (nvi) Mg().getValue();
        if (nviVar != null) {
            if (nviVar.i) {
                nti ntiVar = this.N;
                e4a0 h = ntiVar.a.a.h();
                lv90 e = ntiVar.a.a.e();
                int i = 0;
                if (!ntiVar.b.d(new die0(j73.A(new e4a0[]{h, e != null ? e.a : null}), ntiVar.a.a.O.a))) {
                    nvi nviVar2 = (nvi) Mg().getValue();
                    String str = nviVar2 != null ? nviVar2.j : null;
                    nvi nviVar3 = (nvi) Mg().getValue();
                    String str2 = nviVar3 != null ? nviVar3.m : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str == null) {
                        jst.e.k(new IllegalStateException(), "Can't create delivery via logistics api, empty offerId for delivery_flow. Fallback: create delivery via taxi api");
                        Lg();
                        return;
                    }
                    r0 r0Var = this.o0;
                    Boolean bool = Boolean.FALSE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    tje.N(Jg(), null, null, new DeliveryFormPresenter$createOrder$1(this, str, str2, null), 3).w(new zai(this, i));
                    return;
                }
            }
            Lg();
        }
    }

    public final void Lg() {
        this.x.a.r(new wth(27));
        this.B.a("order_button");
    }

    public final n4u0 Mg() {
        return (n4u0) this.n0.getValue();
    }

    public final void Ng(String str, boolean z) {
        hvi hviVar = this.B;
        wiq0 wiq0Var = hviVar.a;
        lx4 lx4Var = hviVar.b;
        ysi ysiVar = hviVar.c.m;
        if (jl40.l(str, ysiVar != null ? ysiVar.a : null)) {
            i d = ((j) lx4Var).d("DeliveryDetailsCard.AdditionalButtons.DoorToDoorToggle.Tapped");
            d.g("enabled_door_to_door_flg", z);
            pex0 m = ((k) wiq0Var).m();
            d.a.put(ClidProvider.STATE, m != null ? m.b : null);
            d.m();
        } else {
            String str2 = z ? "enable" : BackendConfig.Restrictions.DISABLED;
            i d2 = ((j) lx4Var).d("DeliveryDetailsCard.Switched");
            LinkedHashMap linkedHashMap = d2.a;
            d2.d("switch_name", str);
            linkedHashMap.put("switch_state", str2);
            pex0 m2 = ((k) wiq0Var).m();
            linkedHashMap.put(ClidProvider.STATE, m2 != null ? m2.b : null);
            d2.m();
        }
        p pVar = this.V;
        pVar.b(str, z);
        ((x8) pVar.a).a();
    }

    public final void Og(Integer num, boolean z) {
        String str;
        String str2;
        DeliveryFormStepType deliveryFormStepType = DeliveryFormStepType.DESTINATION;
        eki ekiVar = this.K;
        b6i a = ekiVar.a(deliveryFormStepType);
        String str3 = "";
        if (a == null || (str = a.d) == null) {
            str = "";
        }
        b6i a2 = ekiVar.a(deliveryFormStepType);
        String str4 = a2 != null ? a2.e : null;
        bgq0 bgq0Var = bgq0.f;
        b6i a3 = ekiVar.a(deliveryFormStepType);
        if (a3 != null && (str2 = a3.f) != null) {
            str3 = str2;
        }
        ((pep0) this.l0).f((m950) this.J.get(), iai.a(this.c0, str, str4, deliveryFormStepType, bgq0Var, str3, new yai(this, 1), new dke(25, num, this), null, z, null, 640), hxx.a);
    }
}
