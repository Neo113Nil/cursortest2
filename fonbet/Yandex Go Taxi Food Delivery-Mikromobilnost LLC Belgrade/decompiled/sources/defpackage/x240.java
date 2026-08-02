package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.semantics.f;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto;
import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$start$1;
import com.yandex.go.navigator.domain.v;
import com.yandex.go.navigator.permission.NavigatorPermissionRequestRouter$ExitListener$State;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import defpackage.agd;
import defpackage.bgd;
import defpackage.bi40;
import defpackage.bt40;
import defpackage.bts;
import defpackage.ct40;
import defpackage.did;
import defpackage.dt40;
import defpackage.et40;
import defpackage.fao;
import defpackage.fid;
import defpackage.ge40;
import defpackage.hi40;
import defpackage.is40;
import defpackage.ks40;
import defpackage.mb01;
import defpackage.o430;
import defpackage.oi40;
import defpackage.p640;
import defpackage.sls;
import defpackage.sqb1;
import defpackage.ss40;
import defpackage.t130;
import defpackage.td40;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.vqb1;
import defpackage.w940;
import defpackage.wls;
import defpackage.wyy0;
import defpackage.xfd;
import defpackage.xqb1;
import defpackage.z0a0;
import defpackage.zpn;
import defpackage.zq5;
import defpackage.zs40;
import defpackage.zy11;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorModalView;
import ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutUiStateRepository$uiStateFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutUiStateRepository$uiStateFlow$$inlined$flatMapLatest$2;
import ru.yandex.taxi.masstransit.trains.checkout.actionpopup.b;
import ru.yandex.taxi.masstransit.trains.checkout.i;
import ru.yandex.taxi.masstransit.trains.checkout.r;
import ru.yandex.taxi.masstransit.trains.checkout.tariff.c;
import ru.yandex.taxi.masstransit.trains.schedule.d;

/* loaded from: classes6.dex */
public final /* synthetic */ class x240 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x240(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        Object value;
        Object value2;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                n440 n440Var = (n440) ((p440) obj2);
                f.l((mnq0) obj, oyr.q(n440Var.a, " ", n440Var.b, " ", n440Var.c));
                return zy11Var;
            case 1:
                insetsType$lambda$0 = MtStopSelectorModalView.insetsType$lambda$0((MtStopSelectorModalView) obj2, (t1w) obj);
                return insetsType$lambda$0;
            case 2:
                tdu tduVar = ((czy0) obj2).a.a;
                f.l((mnq0) obj, tduVar.a + " " + tduVar.d);
                return zy11Var;
            case 3:
                final p640 p640Var = (p640) obj2;
                final yfd yfdVar = (yfd) obj;
                final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
                final n640 n640Var = new n640(p640Var);
                agd agdVar = (agd) yfdVar;
                agdVar.c = p640Var.I.a(((o640) ((agd) yfdVar).a).a, b);
                agdVar.e = new tls() { // from class: ru.yandex.taxi.masstransit.router.k
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        p640 p640Var2 = p640.this;
                        tje.N(p640Var2.o(), null, null, new MtThreadVariantsModalViewRouter$content$1$1$1(p640Var2, (wyy0) obj3, yfdVar, n640Var, b, null), 3);
                        return zy11.a;
                    }
                };
                agdVar.g = new a(-2081294231, new l0(22, yfdVar, new t130(12, p640Var, yfdVar)), true);
                return zy11Var;
            case 4:
                tyy0 tyy0Var = (tyy0) obj2;
                ((g640) obj).M0(tyy0Var.a, tyy0Var.b, tyy0Var.c);
                return zy11Var;
            case 5:
                n12 n12Var = (n12) obj2;
                yfd yfdVar2 = (yfd) obj;
                ((agd) yfdVar2).e = new t130(15, n12Var, new uk10(n12Var));
                p9d.a.getClass();
                ((agd) yfdVar2).g = p9d.b;
                return zy11Var;
            case 6:
                final b bVar = (b) obj2;
                yfd yfdVar3 = (yfd) obj;
                ((agd) yfdVar3).c = bVar.H.b;
                agd agdVar2 = (agd) yfdVar3;
                agdVar2.e = new tls() { // from class: ru.yandex.taxi.masstransit.trains.checkout.actionpopup.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        b bVar2 = b.this;
                        tje.N(bVar2.o(), null, null, new MtTrainActionPopupModalRouter$content$1$1$1(bVar2, (w940) obj3, null), 3);
                        return zy11.a;
                    }
                };
                q9d.a.getClass();
                agdVar2.g = q9d.b;
                return zy11Var;
            case 7:
                final i iVar = (i) obj2;
                final yfd yfdVar4 = (yfd) obj;
                r U = iVar.U();
                ((agd) yfdVar4).c = e.X(e.X(U.j, new MtTrainCheckoutUiStateRepository$uiStateFlow$$inlined$flatMapLatest$1(null, U)), new MtTrainCheckoutUiStateRepository$uiStateFlow$$inlined$flatMapLatest$2(null, U));
                tls tlsVar = new tls() { // from class: ru.yandex.taxi.masstransit.trains.checkout.g
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        i iVar2 = i.this;
                        tje.N(iVar2.o(), null, null, new MtTrainCheckoutModalRouter$content$1$1$1(iVar2, (td40) obj3, yfdVar4, null), 3);
                        return zy11.a;
                    }
                };
                agd agdVar3 = (agd) yfdVar4;
                agdVar3.e = tlsVar;
                agdVar3.g = new a(-2070782300, new alb0(17, iVar), true);
                return zy11Var;
            case 8:
                final ru.yandex.taxi.masstransit.trains.checkout.conditions.b bVar2 = (ru.yandex.taxi.masstransit.trains.checkout.conditions.b) obj2;
                yfd yfdVar5 = (yfd) obj;
                ((agd) yfdVar5).c = bVar2.H.a;
                agd agdVar4 = (agd) yfdVar5;
                agdVar4.e = new tls() { // from class: ru.yandex.taxi.masstransit.trains.checkout.conditions.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        b bVar3 = b.this;
                        tje.N(bVar3.o(), null, null, new MtTrainConditionsModalRouter$content$1$1$1(bVar3, (ge40) obj3, null), 3);
                        return zy11.a;
                    }
                };
                r9d.a.getClass();
                agdVar4.g = r9d.b;
                return zy11Var;
            case 9:
                final ru.yandex.taxi.masstransit.trains.schedule.e eVar = (ru.yandex.taxi.masstransit.trains.schedule.e) obj2;
                yfd yfdVar6 = (yfd) obj;
                ((agd) yfdVar6).c = eVar.H.b;
                agd agdVar5 = (agd) yfdVar6;
                agdVar5.e = new tls() { // from class: ru.yandex.taxi.masstransit.trains.schedule.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        e eVar2 = e.this;
                        tje.N(eVar2.o(), null, null, new MtTrainScheduleModalRouter$content$1$1$1(eVar2, (mb01) obj3, null), 3);
                        return zy11.a;
                    }
                };
                s9d.a.getClass();
                agdVar5.g = s9d.b;
                return zy11Var;
            case 10:
                final c cVar = (c) obj2;
                yfd yfdVar7 = (yfd) obj;
                ((agd) yfdVar7).c = cVar.H.c;
                agd agdVar6 = (agd) yfdVar7;
                agdVar6.e = new tls() { // from class: ru.yandex.taxi.masstransit.trains.checkout.tariff.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        c cVar2 = c.this;
                        tje.N(cVar2.o(), null, null, new MtTrainTariffModalRouter$content$1$1$1(cVar2, (bi40) obj3, null), 3);
                        return zy11.a;
                    }
                };
                t9d.a.getClass();
                agdVar6.g = t9d.b;
                return zy11Var;
            case 11:
                final hi40 hi40Var = (hi40) obj2;
                yfd yfdVar8 = (yfd) obj;
                ((agd) yfdVar8).c = hi40Var.H.a;
                agd agdVar7 = (agd) yfdVar8;
                agdVar7.e = new tls() { // from class: ru.yandex.taxi.masstransit.trains.schedule.transporttypes.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        hi40 hi40Var2 = hi40.this;
                        tje.N(hi40Var2.o(), null, null, new MtTrainTransportTypesModalRouter$content$1$1$1(hi40Var2, (oi40) obj3, null), 3);
                        return zy11.a;
                    }
                };
                u9d.a.getClass();
                agdVar7.g = u9d.b;
                return zy11Var;
            case 12:
                ((d) obj).n1((na11) obj2);
                return zy11Var;
            case 13:
                xk40 xk40Var = (xk40) obj2;
                f.l((mnq0) obj, ((Object) xk40Var.c) + " " + ((Object) xk40Var.d));
                return zy11Var;
            case 14:
                return (FrameLayout) obj2;
            case 15:
                return (GoFrameLayout) obj2;
            case 16:
                final ks40 ks40Var = (ks40) obj2;
                final yfd yfdVar9 = (yfd) obj;
                final js40 js40Var = new js40(ks40Var);
                final zv20 zv20Var = new zv20(js40Var, (bpw0) ((b4g) ks40Var.J.a.a).get());
                lz6 lz6Var = ((is40) ((agd) yfdVar9).a).e;
                aw40 aw40Var = lz6Var != null ? lz6Var.b : null;
                if (aw40Var == null) {
                    aw40Var = null;
                }
                ft40 ft40Var = ks40Var.Z;
                agd agdVar8 = (agd) yfdVar9;
                is40 is40Var = (is40) agdVar8.a;
                String str = is40Var.a;
                String str2 = is40Var.c;
                String str3 = is40Var.d;
                as40 as40Var = is40Var.f;
                if (as40Var == null) {
                    as40Var = aw40Var != null ? (as40) aw40Var.g : null;
                }
                tpr t = e.t(e.X(com.yandex.go.coroutines.b.d(ft40Var.p, new MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$start$1(zy11Var, null)), new MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(aw40Var != null ? aw40Var.a : 0L, as40Var, ft40Var, null, is40Var.g, is40Var.i, str, str3, str2, aw40Var != null ? (String) aw40Var.c : null, aw40Var != null ? (String) aw40Var.d : null, is40Var.b, ft40Var.d.c().a(), is40Var.h, null)));
                ft40Var.a.getClass();
                agdVar8.c = e.F(t, uyj.a);
                agdVar8.e = new tls() { // from class: com.yandex.go.multimodal_route.ui.detailed_card.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        ks40 ks40Var2 = ks40.this;
                        tje.N(ks40Var2.o(), null, null, new MultimodalRouteDetailedCardRouter$content$1$1$1(ks40Var2, yfdVar9, (zs40) obj3, js40Var, null), 3);
                        return zy11.a;
                    }
                };
                agdVar8.g = new a(1039238655, new bms() { // from class: com.yandex.go.multimodal_route.ui.detailed_card.c
                    @Override // defpackage.bms
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i3;
                        xfd xfdVar = (xfd) obj3;
                        et40 et40Var = (et40) obj4;
                        fid fidVar = (fid) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if ((intValue & 6) == 0) {
                            i3 = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
                        } else {
                            i3 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i3 |= ((bts) fidVar).k(et40Var) ? 32 : 16;
                        }
                        boolean z = true;
                        bts btsVar = (bts) fidVar;
                        boolean V = btsVar.V(i3 & 1, (i3 & 147) != 146);
                        zy11 zy11Var2 = zy11.a;
                        if (!V) {
                            btsVar.Y();
                            return zy11Var2;
                        }
                        int i4 = i3 & 14;
                        boolean z2 = i4 == 4 || ((i3 & 8) != 0 && btsVar.e(xfdVar));
                        Object Q = btsVar.Q();
                        o430 o430Var = did.a;
                        if (z2 || Q == o430Var) {
                            Q = new MultimodalRouteDetailedCardRouter$content$1$2$1$1(xfdVar, null);
                            btsVar.o0(Q);
                        }
                        zpn.e(btsVar, (wls) Q, zy11Var2);
                        boolean z3 = et40Var instanceof bt40;
                        ks40 ks40Var2 = ks40.this;
                        if (z3) {
                            btsVar.e0(1834699350);
                            bt40 bt40Var = (bt40) et40Var;
                            ((bgd) xfdVar).a.invoke(new ss40(bt40Var.d));
                            boolean e = btsVar.e(ks40Var2);
                            Object Q2 = btsVar.Q();
                            if (e || Q2 == o430Var) {
                                MultimodalRouteDetailedCardRouter$content$1$2$3$1 multimodalRouteDetailedCardRouter$content$1$2$3$1 = new MultimodalRouteDetailedCardRouter$content$1$2$3$1(1, ks40Var2, ks40.class, "onAnchoredHeightChanged", "onAnchoredHeightChanged(I)V", 0);
                                btsVar.o0(multimodalRouteDetailedCardRouter$content$1$2$3$1);
                                Q2 = multimodalRouteDetailedCardRouter$content$1$2$3$1;
                            }
                            z0a0 z0a0Var = ks40Var2.N;
                            sqb1.a(bt40Var, zv20Var, ks40Var2.I, (tls) ((tfx) Q2), z0a0Var, ((bgd) xfdVar).a, ((is40) ((agd) yfdVar9).a).e, btsVar, (i3 >> 3) & 14);
                            btsVar.t(false);
                            return zy11Var2;
                        }
                        if (et40Var instanceof ct40) {
                            btsVar.e0(1835240734);
                            fao faoVar = ((ct40) et40Var).a;
                            if (i4 != 4 && ((i3 & 8) == 0 || !btsVar.e(xfdVar))) {
                                z = false;
                            }
                            boolean e2 = btsVar.e(ks40Var2) | z;
                            Object Q3 = btsVar.Q();
                            if (e2 || Q3 == o430Var) {
                                Q3 = new t130(24, xfdVar, ks40Var2);
                                btsVar.o0(Q3);
                            }
                            vqb1.a(faoVar, (tls) Q3, btsVar, 0);
                            btsVar.t(false);
                            return zy11Var2;
                        }
                        if (!(et40Var instanceof dt40)) {
                            btsVar.e0(1835919107);
                            btsVar.t(false);
                            return zy11Var2;
                        }
                        btsVar.e0(-2018991164);
                        if (i4 != 4 && ((i3 & 8) == 0 || !btsVar.e(xfdVar))) {
                            z = false;
                        }
                        Object Q4 = btsVar.Q();
                        if (z || Q4 == o430Var) {
                            Q4 = new zq5(xfdVar, 4);
                            btsVar.o0(Q4);
                        }
                        xqb1.a((sls) Q4, btsVar, 0);
                        btsVar.t(false);
                        return zy11Var2;
                    }
                }, true);
                return zy11Var;
            case 17:
                nu40 nu40Var = (nu40) obj;
                com.yandex.go.multimodal_route.a aVar = nu40Var.a;
                aVar.E((m950) aVar.E.get(), (w711) obj2, new lu40(nu40Var.a, nu40Var.b, i2), hxx.a);
                return zy11Var;
            case 18:
                return Boolean.valueOf(jl40.l(((MultimodalRoutesOrderDto) obj).a, ((MultimodalRoutesOrderDto) obj2).a));
            case 19:
                j250 j250Var = (j250) obj2;
                j250Var.c.setImageBitmap((Bitmap) obj);
                cma1.b(1.0f, j250Var.c);
                return zy11Var;
            case 20:
                ((nc50) obj).b(((rz60) obj2).a);
                return zy11Var;
            case 21:
                ((RoadEventsLayer) obj).addListener(((v) obj2).d);
                return zy11Var;
            case 22:
                ((ce50) obj).I0((NavigatorPermissionRequestRouter$ExitListener$State) obj2);
                return zy11Var;
            case 23:
                com.yandex.go.navigator.alt_select.new_summary.a aVar2 = ((gg50) obj).a;
                aVar2.R(((avj0) aVar2.J).h(kyh0.address_another), new vhu0(new vgu0(0)), ((ne50) obj2).c);
                return zy11Var;
            case 24:
                yi50 yi50Var = (yi50) obj2;
                Address address = (Address) obj;
                r0 r0Var = yi50Var.M.l.a;
                do {
                    value = r0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!r0Var.k(value, Boolean.FALSE));
                ru.yandex.taxi.logistics.ndd_map.router.e eVar2 = yi50Var.M;
                eVar2.j();
                eVar2.k.a();
                li50 li50Var = eVar2.h;
                li50Var.b.c = address;
                li50Var.b(address, null);
                f5v0 f5v0Var = eVar2.f;
                zzs B = address.B();
                r0 r0Var2 = f5v0Var.a;
                do {
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, B));
                eVar2.e.b(AddressResolveRepository.State.LOADING);
                eVar2.N = false;
                eVar2.O = false;
                eVar2.P = false;
                zzs B2 = address.B();
                eVar2.i(B2, new h2r(16, eVar2, B2));
                return zy11Var;
            case 25:
                ru.yandex.taxi.order.map.controller.internal.a aVar3 = (ru.yandex.taxi.order.map.controller.internal.a) obj2;
                Long I = s8o.I((Throwable) obj);
                if (I != null) {
                    aVar3.k.set(I.longValue());
                }
                return zy11Var;
            case 26:
                ((pk50) obj2).N.setLeadTint((ColorStateList) null);
                return zy11Var;
            case 27:
                return Boolean.valueOf(((dn50) obj).a() == ((kb30) obj2));
            case 28:
                hz50 hz50Var = (hz50) obj;
                kfh kfhVar = ((xv50) obj2).a;
                bms bmsVar = kfhVar.d;
                String c = hz50Var.c();
                String h = hz50Var.d().h("X-Request-ID");
                if (h == null) {
                    h = "";
                }
                String h2 = hz50Var.d().h("traceparent");
                bmsVar.invoke(c, h, h2 != null ? h2 : "", kfhVar.a(hz50Var).a.d);
                eoh eohVar = new eoh((yh6) kfhVar.g.b);
                ((nci0) kfhVar.f.newCall(kfhVar.a(hz50Var))).I(new com.yandex.xplat.common.b(eohVar, kfhVar, hz50Var));
                return eohVar.a;
            default:
                return ((vv50) obj2).d((hz50) obj);
        }
    }
}
