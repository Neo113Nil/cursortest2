package ru.yandex.taxi.logistics.deliveries;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.coroutines.b;
import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.dto.response.q1;
import com.yandex.go.dto.response.s;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.TurboButton;
import com.yandex.go.shortcuts.dto.response.t1;
import com.yandex.go.shortcuts.dto.response.z2;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.delivery.AddressDeliveryInfo;
import com.yandex.go.taxi.order.models.api.preorder.delivery.RouteDeliveryInfo;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import defpackage.a7t0;
import defpackage.abf0;
import defpackage.adc;
import defpackage.arv0;
import defpackage.bgq0;
import defpackage.c4r0;
import defpackage.d0l0;
import defpackage.dab1;
import defpackage.die0;
import defpackage.e4a0;
import defpackage.e5y0;
import defpackage.egz;
import defpackage.evu0;
import defpackage.ezs;
import defpackage.fse0;
import defpackage.hc00;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.ic00;
import defpackage.ijv0;
import defpackage.j73;
import defpackage.jaq0;
import defpackage.jc00;
import defpackage.jjv0;
import defpackage.jl40;
import defpackage.k9s0;
import defpackage.kc00;
import defpackage.l8i;
import defpackage.lse0;
import defpackage.lv90;
import defpackage.m950;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pzt0;
import defpackage.qke;
import defpackage.t8i;
import defpackage.tse;
import defpackage.uki;
import defpackage.ut90;
import defpackage.vpe0;
import defpackage.wt90;
import defpackage.y5i;
import defpackage.yqv0;
import defpackage.yvf0;
import defpackage.zaf0;
import defpackage.ziv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class a {
    public final tse a;
    public final g b;
    public final jjv0 c;
    public final arv0 d;
    public final y5i e;
    public final wt90 f;
    public final yvf0 g;
    public final jc00 h;
    public final jaq0 i;
    public final abf0 j;
    public final c4r0 k;
    public final yvf0 l;
    public final e m;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.domain.g n;
    public final t8i o;
    public final l8i p;
    public final oep0 q;
    public pzt0 r;

    public a(tse tseVar, g gVar, jjv0 jjv0Var, arv0 arv0Var, y5i y5iVar, wt90 wt90Var, yvf0 yvf0Var, jc00 jc00Var, jaq0 jaq0Var, abf0 abf0Var, c4r0 c4r0Var, yvf0 yvf0Var2, e eVar, com.yandex.go.mainscreen.superapp.impl.foundation.domain.g gVar2, t8i t8iVar, l8i l8iVar, oep0 oep0Var) {
        this.a = tseVar;
        this.b = gVar;
        this.c = jjv0Var;
        this.d = arv0Var;
        this.e = y5iVar;
        this.f = wt90Var;
        this.g = yvf0Var;
        this.h = jc00Var;
        this.i = jaq0Var;
        this.j = abf0Var;
        this.k = c4r0Var;
        this.l = yvf0Var2;
        this.m = eVar;
        this.n = gVar2;
        this.o = t8iVar;
        this.p = l8iVar;
        this.q = oep0Var;
    }

    public static Address a(AddressDeliveryInfo addressDeliveryInfo, Address address) {
        if (addressDeliveryInfo == null || address == null) {
            return address;
        }
        bgq0 bgq0Var = addressDeliveryInfo.a;
        String str = addressDeliveryInfo.b;
        if (str == null) {
            str = address.J1();
        }
        String str2 = addressDeliveryInfo.c;
        if (str2 == null) {
            str2 = address.H1();
        }
        String str3 = addressDeliveryInfo.d;
        if (str3 == null) {
            str3 = address.n0();
        }
        String str4 = addressDeliveryInfo.e;
        if (str4 == null) {
            str4 = address.e2();
        }
        String str5 = addressDeliveryInfo.f;
        if (str5 == null) {
            str5 = address.e0();
        }
        AddressDTO address2 = address.getAddress();
        if (str == null) {
            str = address2.c;
        }
        if (str2 == null) {
            str2 = address2.r;
        }
        String str6 = str2;
        if (str3 == null) {
            str3 = address2.t;
        }
        String str7 = str3;
        if (str4 == null) {
            str4 = address2.q;
        }
        String str8 = str4;
        if (str5 == null) {
            str5 = address2.s;
        }
        return new PlainAddress(address, AddressDTO.g(address2, null, null, str, null, null, null, null, null, null, null, null, str8, str6, str5, str7, bgq0Var, 31522811));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(uki ukiVar, boolean z) {
        ProductMode$Taxi productMode$Taxi;
        Object obj;
        boolean z2;
        String str;
        boolean z3;
        ut90 ut90Var;
        pzt0 pzt0Var;
        r0 r0Var;
        Object value;
        List list;
        Preorder preorder;
        pzt0 pzt0Var2 = this.r;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        String str2 = (ukiVar == null || (preorder = ukiVar.b) == null) ? null : preorder.O.a;
        if (ukiVar == null || str2 == null || evu0.J(str2)) {
            ic00 ic00Var = ((kc00) this.h).a;
            ic00Var.getClass();
            if (ic00Var instanceof hc00) {
                return;
            }
            e5y0.f((e5y0) this.g.get(), "show orders from delivery preorder");
            return;
        }
        Preorder preorder2 = ukiVar.b;
        RouteDeliveryInfo routeDeliveryInfo = preorder2.H;
        Address a = a(routeDeliveryInfo != null ? routeDeliveryInfo.a : null, preorder2.G.h());
        RouteDeliveryInfo routeDeliveryInfo2 = preorder2.H;
        AddressDeliveryInfo addressDeliveryInfo = (routeDeliveryInfo2 == null || (list = routeDeliveryInfo2.b) == null || list.isEmpty()) ? null : (AddressDeliveryInfo) kotlin.collections.a.Z(list);
        ArrayList arrayList = new ArrayList(preorder2.G.b);
        Address a2 = a(addressDeliveryInfo, (Address) kotlin.collections.a.b0(arrayList));
        if (a2 != null) {
            if (!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(a2);
        }
        ZoneAddress zoneAddress = preorder2.G.a;
        if (a != null) {
            preorder2.l(new d0l0(new ZoneAddress(a, zoneAddress != null ? zoneAddress.b : null), arrayList, preorder2.G.c));
        }
        this.e.p(a != null ? qke.A(a) : null);
        this.e.o(qke.B(arrayList));
        this.i.a.b(str2, ukiVar.e);
        arv0 arv0Var = this.d;
        ezs ezsVar = (ezs) ((zaf0) this.j.a.getValue()).b.getValue();
        if (ezsVar != null && (productMode$Taxi = (ProductMode$Taxi) ((t1) kotlin.collections.a.R(adc.D(ezsVar.b.b, ProductMode$Taxi.class)))) != null) {
            z2 z2Var = TurboButton.Companion;
            List list2 = productMode$Taxi.b.c;
            z2Var.getClass();
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((TurboButton) obj).k, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                        break;
                    }
                }
            }
            TurboButton turboButton = (TurboButton) obj;
            if (turboButton != null) {
                q1 q1Var = turboButton.h;
                z2 = q1Var instanceof Action$SummaryRedirect ? ((Action$SummaryRedirect) q1Var).d : q1Var instanceof s;
                ((a7t0) arv0Var).b(!z2 ? new yqv0(SummaryUiState$Type.TRAP, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY) : new yqv0(SummaryUiState$Type.NORMAL, ""));
                this.k.b(SelectionOrigin.DELIVERY_CANCEL, str2, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, true);
                str = ukiVar.d;
                if (str != null && this.p.e(str2) != null) {
                    t8i t8iVar = this.o;
                    r0Var = t8iVar.a;
                    do {
                        value = r0Var.getValue();
                        ((t8i.a) value).getClass();
                    } while (!r0Var.k(value, new t8i.a(str)));
                    t8iVar.c = null;
                }
                z3 = ukiVar.c;
                e eVar = this.m;
                ru.yandex.taxi.preorder.repositories.g gVar = eVar.c;
                e4a0 b = gVar.b();
                lv90 a3 = gVar.a();
                List A = j73.A(new e4a0[]{b, a3 == null ? a3.a : null});
                ut90Var = eVar.b;
                if (ut90Var.b().b && kotlin.collections.a.G(ut90Var.b().j, str2) && !eVar.a.d(new die0(A, str2))) {
                    this.f.a(z3);
                }
                pzt0Var = this.r;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                if (this.b.e()) {
                    this.r = b.g(this.a, null, null, new DeliveryPreorderRouterImpl$openPreorder$2(this, preorder2, z, null), 3);
                    return;
                } else {
                    c(preorder2, ziv0.a, z);
                    return;
                }
            }
        }
        z2 = false;
        ((a7t0) arv0Var).b(!z2 ? new yqv0(SummaryUiState$Type.TRAP, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY) : new yqv0(SummaryUiState$Type.NORMAL, ""));
        this.k.b(SelectionOrigin.DELIVERY_CANCEL, str2, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, true);
        str = ukiVar.d;
        if (str != null) {
            t8i t8iVar2 = this.o;
            r0Var = t8iVar2.a;
            do {
                value = r0Var.getValue();
                ((t8i.a) value).getClass();
            } while (!r0Var.k(value, new t8i.a(str)));
            t8iVar2.c = null;
        }
        z3 = ukiVar.c;
        e eVar2 = this.m;
        ru.yandex.taxi.preorder.repositories.g gVar2 = eVar2.c;
        e4a0 b2 = gVar2.b();
        lv90 a32 = gVar2.a();
        List A2 = j73.A(new e4a0[]{b2, a32 == null ? a32.a : null});
        ut90Var = eVar2.b;
        if (ut90Var.b().b) {
            this.f.a(z3);
        }
        pzt0Var = this.r;
        if (pzt0Var != null) {
        }
        if (this.b.e()) {
        }
    }

    public final void c(Preorder preorder, ijv0 ijv0Var, boolean z) {
        dab1 dab1Var = dab1.b;
        k9s0 k9s0Var = k9s0.f;
        k9s0 H = egz.H(null, ijv0Var, 3);
        yvf0 yvf0Var = this.l;
        oep0 oep0Var = this.q;
        if (z) {
            ((pep0) oep0Var).f((m950) yvf0Var.get(), new hre0(new vpe0(preorder), new fse0(H), "show payments from delivery", true, dab1Var), hxx.a);
        } else {
            ((pep0) oep0Var).f((m950) yvf0Var.get(), new hre0(new vpe0(preorder), new lse0(H), "show summary from delivery", true, dab1Var), hxx.a);
        }
    }
}
