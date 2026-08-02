package ru.yandex.taxi.delivery.ui.form;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ati;
import defpackage.b6i;
import defpackage.bbi;
import defpackage.bgc;
import defpackage.bpi;
import defpackage.cni;
import defpackage.cpf;
import defpackage.dke;
import defpackage.e991;
import defpackage.ewh;
import defpackage.fki;
import defpackage.fm2;
import defpackage.fnx0;
import defpackage.gbi;
import defpackage.gki;
import defpackage.hei;
import defpackage.hki;
import defpackage.hvi;
import defpackage.hxx;
import defpackage.iai;
import defpackage.io;
import defpackage.jki;
import defpackage.jl40;
import defpackage.jo;
import defpackage.jq;
import defpackage.kki;
import defpackage.l2i;
import defpackage.lr;
import defpackage.m950;
import defpackage.mq;
import defpackage.mvi;
import defpackage.nq;
import defpackage.nuq0;
import defpackage.nvi;
import defpackage.oep0;
import defpackage.oq;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.pq;
import defpackage.qht0;
import defpackage.qq;
import defpackage.r0i;
import defpackage.s1i;
import defpackage.sq;
import defpackage.tbb;
import defpackage.tje;
import defpackage.tp;
import defpackage.up;
import defpackage.vmn0;
import defpackage.vq;
import defpackage.vuh;
import defpackage.w511;
import defpackage.wai;
import defpackage.wls;
import defpackage.x5i;
import defpackage.y5i;
import defpackage.yn5;
import defpackage.ys0;
import defpackage.zii;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.ShowAlertInteractor$AnalyticsTrigger;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.Screen;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DeliveryFormPresenter$subscribeActionBusHandling$1 extends AdaptedFunctionReference implements wls {
    public final void b(lr lrVar) {
        s1i s1iVar;
        l2i l2iVar;
        vuh m;
        fm2 a;
        pex0 pex0Var;
        pex0 pex0Var2;
        ati atiVar;
        nuq0 nuq0Var;
        e eVar = (e) this.receiver;
        ru.yandex.taxi.logistics.photocomment.b bVar = eVar.S;
        oep0 oep0Var = eVar.l0;
        hei heiVar = eVar.P;
        y5i y5iVar = eVar.I;
        gbi gbiVar = eVar.H;
        hvi hviVar = eVar.B;
        if (lrVar instanceof sq) {
            sq sqVar = (sq) lrVar;
            eVar.Ng(sqVar.a, sqVar.b);
            return;
        }
        if (lrVar instanceof jq) {
            vmn0 vmn0Var = eVar.h0;
            Screen screen = Screen.ADDRESS_DETAILS;
            StringBuilder sb = new StringBuilder();
            cni l = eVar.G.a.l();
            sb.append(l.a.d);
            Iterator it = l.b.iterator();
            while (it.hasNext()) {
                sb.append(" " + ((vuh) it.next()).d);
            }
            boolean p = vmn0Var.p(screen, sb.toString(), ShowAlertInteractor$AnalyticsTrigger.DETAILS, new bgc(12));
            i d = ((j) hviVar.b).d("DeliveryDetailsCard.Tapped");
            LinkedHashMap linkedHashMap = d.a;
            linkedHashMap.put("button_name", "order_button");
            pex0 m2 = ((k) hviVar.a).m();
            linkedHashMap.put(ClidProvider.STATE, m2 != null ? m2.b : null);
            d.m();
            ((wai) eVar.Dg()).hideKeyboard();
            if (p) {
                return;
            }
            eVar.f0.b();
            int size = y5iVar.h.size() - 1;
            if (size >= 0 && jl40.l(y5iVar.m(size).a, r0i.d)) {
                eVar.Og(Integer.valueOf(size), true);
                return;
            }
            mvi mviVar = eVar.z;
            k kVar = (k) eVar.W;
            fnx0 n = kVar.n();
            Boolean valueOf = (n == null || (pex0Var2 = n.c) == null || (atiVar = pex0Var2.Z) == null || (nuq0Var = atiVar.d) == null) ? null : Boolean.valueOf(nuq0Var.a);
            if (eVar.i0.b()) {
                a = mviVar.a();
            } else {
                fnx0 n2 = kVar.n();
                if (((n2 == null || (pex0Var = n2.c) == null) ? false : ru.yandex.taxi.tariffs.model.b.i(pex0Var)) || valueOf != null) {
                    if (jl40.l(valueOf, Boolean.TRUE)) {
                        a = mviVar.a();
                    }
                    a = null;
                } else {
                    if (gbiVar.a.p == DeliveryFormType.FULL) {
                        a = mviVar.a();
                    }
                    a = null;
                }
            }
            if (a != null) {
                tje.N(eVar.Jg(), null, null, new DeliveryFormPresenter$showEmptyApartmentPopup$1(a, eVar, null), 3);
                return;
            } else {
                eVar.Kg();
                return;
            }
        }
        if (lrVar instanceof nq) {
            nq nqVar = (nq) lrVar;
            hki hkiVar = nqVar.a;
            gbiVar.getClass();
            b6i c = gbiVar.c(hkiVar.a());
            String str = c.d;
            String str2 = c.e;
            DeliveryFormStepType deliveryFormStepType = c.b;
            y5i y5iVar2 = gbiVar.b.a;
            if (hkiVar instanceof gki) {
                m = ((x5i) y5iVar2.k.getValue()).a.a;
            } else {
                if (!(hkiVar instanceof fki)) {
                    w511.b();
                    return;
                }
                m = y5iVar2.m(((fki) hkiVar).a);
            }
            r0i r0iVar = m.a;
            String str3 = c.f;
            if (nqVar.b) {
                gbiVar.e(hkiVar);
            }
            ((pep0) oep0Var).f((m950) eVar.J.get(), iai.a(eVar.c0, str, str2, deliveryFormStepType, e991.f(r0iVar), str3, new bgc(12), new dke(26, eVar, nqVar), null, false, null, 896), hxx.a);
            hviVar.d(ProxyPassportActivity.KEY_PHONE_NUMBER, hkiVar, y5iVar.h.size());
            return;
        }
        if (lrVar instanceof jo) {
            hki hkiVar2 = ((jo) lrVar).a;
            ((pep0) oep0Var).f((m950) eVar.F.get(), new ewh(hkiVar2, null, 14), hxx.a);
            hviVar.d("address", hkiVar2, gbiVar.d() - 1);
            return;
        }
        if (lrVar instanceof up) {
            up upVar = (up) lrVar;
            DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget = upVar.b;
            String str4 = upVar.c;
            hki hkiVar3 = upVar.a;
            kki kkiVar = gbiVar.b;
            cpf cpfVar = kkiVar.b;
            if (hkiVar3 instanceof gki) {
                switch (jki.a[deliveryPointFocusHolder$FocusTarget.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        y5i.q(kkiVar.a, null, null, null, null, null, str4, null, 223);
                        break;
                    case 3:
                        y5i.q(kkiVar.a, null, null, null, null, str4, null, null, 239);
                        break;
                    case 4:
                        if (!cpfVar.a()) {
                            y5i.q(kkiVar.a, null, null, null, "", null, null, null, 247);
                            y5i.q(kkiVar.a, null, "", null, null, null, null, null, 253);
                        }
                        kkiVar.a();
                        y5i.q(kkiVar.a, null, null, str4, null, null, null, null, 251);
                        break;
                    case 5:
                        if (!cpfVar.a()) {
                            y5i.q(kkiVar.a, null, null, null, "", null, null, null, 247);
                            y5i.q(kkiVar.a, null, null, "", null, null, null, null, 251);
                        }
                        kkiVar.a();
                        y5i.q(kkiVar.a, null, str4, null, null, null, null, null, 253);
                        break;
                    case 6:
                        if (!cpfVar.a()) {
                            y5i.q(kkiVar.a, null, "", null, null, null, null, null, 253);
                            y5i.q(kkiVar.a, null, null, "", null, null, null, null, 251);
                        }
                        kkiVar.a();
                        y5i.q(kkiVar.a, null, null, null, str4, null, null, null, 247);
                        break;
                    default:
                        w511.b();
                        break;
                }
                return;
            }
            if (!(hkiVar3 instanceof fki)) {
                w511.b();
                return;
            }
            int i = ((fki) hkiVar3).a;
            switch (jki.a[deliveryPointFocusHolder$FocusTarget.ordinal()]) {
                case 1:
                    break;
                case 2:
                    y5i.n(kkiVar.a, i, null, null, null, null, null, str4, null, 446);
                    break;
                case 3:
                    y5i.n(kkiVar.a, i, null, null, null, null, str4, null, null, 478);
                    break;
                case 4:
                    if (!cpfVar.a()) {
                        y5i.n(kkiVar.a, i, null, null, null, "", null, null, null, 494);
                        y5i.n(kkiVar.a, i, null, "", null, null, null, null, null, 506);
                    }
                    kkiVar.a();
                    y5i.n(kkiVar.a, i, null, null, str4, null, null, null, null, 502);
                    break;
                case 5:
                    if (!cpfVar.a()) {
                        y5i.n(kkiVar.a, i, null, null, null, "", null, null, null, 494);
                        y5i.n(kkiVar.a, i, null, null, "", null, null, null, null, 502);
                    }
                    kkiVar.a();
                    y5i.n(kkiVar.a, i, null, str4, null, null, null, null, null, 506);
                    break;
                case 6:
                    if (!cpfVar.a()) {
                        y5i.n(kkiVar.a, i, null, "", null, null, null, null, null, 506);
                        y5i.n(kkiVar.a, i, null, null, "", null, null, null, null, 502);
                    }
                    kkiVar.a();
                    y5i.n(kkiVar.a, i, null, null, null, str4, null, null, null, 494);
                    break;
                default:
                    w511.b();
                    break;
            }
            return;
        }
        if (lrVar instanceof tp) {
            tp tpVar = (tp) lrVar;
            int size2 = y5iVar.h.size();
            DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget2 = tpVar.b;
            hki hkiVar4 = tpVar.a;
            switch (bbi.b[deliveryPointFocusHolder$FocusTarget2.ordinal()]) {
                case 1:
                    hviVar.d("entrance", hkiVar4, size2);
                    break;
                case 2:
                    hviVar.d("floor", hkiVar4, size2);
                    break;
                case 3:
                    hviVar.d("comment", hkiVar4, size2);
                    break;
                case 4:
                    hviVar.d("flat", hkiVar4, size2);
                    break;
                case 5:
                    hviVar.d("doorphone", hkiVar4, size2);
                    break;
                case 6:
                    break;
                default:
                    w511.b();
                    break;
            }
            return;
        }
        if (lrVar instanceof vq) {
            bpi bpiVar = ((vq) lrVar).a;
            hviVar.getClass();
            hvi.c(hviVar, "DeliveryDetailsCard.RequirementsBlock.Tapped");
            ((wai) eVar.Dg()).hideKeyboard();
            ((pep0) oep0Var).f((m950) eVar.U.get(), bpiVar, hxx.a);
            return;
        }
        if (lrVar instanceof mq) {
            String str5 = ((mq) lrVar).a;
            i d2 = ((j) hviVar.b).d("DeliveryDetailsCard.PaymentPromo.Tapped");
            LinkedHashMap linkedHashMap2 = d2.a;
            linkedHashMap2.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str5);
            pex0 m3 = ((k) hviVar.a).m();
            linkedHashMap2.put(ClidProvider.STATE, m3 != null ? m3.b : null);
            d2.m();
            eVar.g0.a();
            return;
        }
        boolean l2 = jl40.l(lrVar, io.f);
        zy11 zy11Var = zy11.a;
        if (l2) {
            i d3 = ((j) hviVar.b).d("DeliveryDetailsCard.RequirementsBlock.Tapped");
            LinkedHashMap linkedHashMap3 = d3.a;
            linkedHashMap3.put("button_name", "pay_on_delivery");
            pex0 m4 = ((k) hviVar.a).m();
            linkedHashMap3.put(ClidProvider.STATE, m4 != null ? m4.b : null);
            d3.m();
            ((pep0) oep0Var).f((m950) eVar.Z.get(), zy11Var, hxx.a);
            return;
        }
        if (jl40.l(lrVar, io.c)) {
            hviVar.getClass();
            hvi.c(hviVar, "DeliveryDetailsCard.DetailedPricingInfoButton.Tapped");
            nvi nviVar = (nvi) eVar.Mg().getValue();
            if (nviVar == null || (s1iVar = nviVar.n) == null || (l2iVar = s1iVar.a) == null) {
                return;
            }
            ((wai) eVar.Dg()).hideKeyboard();
            ((pep0) oep0Var).f((m950) eVar.b0.get(), l2iVar, hxx.a);
            return;
        }
        if (jl40.l(lrVar, io.e)) {
            ((wai) eVar.Dg()).hideKeyboard();
            i d4 = ((j) hviVar.b).d("DeliveryDetailsCard.Tapped");
            LinkedHashMap linkedHashMap4 = d4.a;
            linkedHashMap4.put("button_name", DownloadService.KEY_REQUIREMENTS);
            pex0 m5 = ((k) hviVar.a).m();
            linkedHashMap4.put(ClidProvider.STATE, m5 != null ? m5.b : null);
            d4.m();
            ((pep0) oep0Var).f(new yn5(2, (ru.yandex.taxi.delivery.ui.setuprequierements.c) eVar.C.get(), new tbb(22, eVar)), zy11Var, hxx.a);
            return;
        }
        if (jl40.l(lrVar, io.a)) {
            int d5 = gbiVar.d();
            i d6 = ((j) heiVar.b).d("DeliveryDetailsCard.AdditionalButtons.NewPoint.Tapped");
            d6.b(d5, "new_destination_point_num");
            pex0 m6 = ((k) heiVar.a).m();
            d6.a.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, m6 != null ? m6.b : null);
            d6.m();
            eVar.a0.a(new ys0(eVar, y5iVar.h.size(), 3));
            return;
        }
        if (jl40.l(lrVar, io.b)) {
            i d7 = ((j) heiVar.b).d("DeliveryDetailsCard.AdditionalButtons.PointsChange.Tapped");
            pex0 m7 = ((k) heiVar.a).m();
            d7.a.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, m7 != null ? m7.b : null);
            d7.m();
            ((wai) eVar.Dg()).hideKeyboard();
            ((qht0) eVar.E).f(false);
            return;
        }
        if (jl40.l(lrVar, io.d)) {
            ((wai) eVar.Dg()).hideKeyboard();
            zii ziiVar = bVar.b;
            i d8 = ((j) ziiVar.b).d("DeliveryDetailsCard.PhotoComment.MaxPicturesNumNotif.Shown");
            pex0 m8 = ((k) ziiVar.a).m();
            d8.a.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, m8 != null ? m8.b : null);
            d8.m();
            ((pep0) bVar.l).f((m950) bVar.c.get(), zy11Var, hxx.a);
            return;
        }
        if (lrVar instanceof oq) {
            tje.N(eVar.Jg(), null, null, new DeliveryFormPresenter$handleAction$1(eVar, lrVar, null), 3);
            return;
        }
        if (lrVar instanceof pq) {
            pq pqVar = (pq) lrVar;
            bVar.g.c(pqVar.b.b(), pqVar.a);
        } else if (lrVar instanceof qq) {
            tje.N(eVar.Jg(), null, null, new DeliveryFormPresenter$handleAction$2(eVar, lrVar, null), 3);
        } else {
            w511.b();
        }
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        b((lr) obj);
        return zy11.a;
    }
}
