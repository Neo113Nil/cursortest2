package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.c;
import androidx.compose.foundation.text.selection.j;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.due_timetable.presentation.widget.day_selector.DaySelectorItemView;
import com.yandex.go.navigator.incidents.dashboard.DashboardEventsModalView;
import com.yandex.go.taxi.order.details.v1.elements.buttons.o;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.ui.settings.contacts.b;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelLogsView;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.d;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.a;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarFragment;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;
import com.ybsdk.widgets.common.SuggestView$State$Behaviour;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.delivery.ui.form.e;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final /* synthetic */ class tbb implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tbb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0263, code lost:
    
        if (r10 == defpackage.did.a) goto L70;
     */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        llg0 llg0Var;
        llg0 llg0Var2;
        ServerMessageRef r;
        zy11 inputListeners$lambda$1;
        Object invoke;
        zy11 onViewCreated$lambda$14$lambda$13;
        zy11 adapter$lambda$0$1;
        zy11 showDialog$lambda$19;
        Object obj3;
        zy11 onViewCreated$lambda$6$lambda$5;
        zy11 calendarAdapter$lambda$1;
        int i = this.a;
        int i2 = 7;
        c530 c530Var = c530.a;
        int i3 = 0;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                i iVar = (i) obj4;
                ServerMessageRef serverMessageRef = (ServerMessageRef) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                RecyclerView recyclerView = iVar.L;
                long timestamp = serverMessageRef.getTimestamp();
                int childCount = recyclerView.getChildCount();
                while (true) {
                    if (i3 < childCount) {
                        View childAt = recyclerView.getChildAt(i3);
                        if (childAt != null) {
                            Object childViewHolder = recyclerView.getChildViewHolder(childAt);
                            llg0Var = ((childViewHolder instanceof llg0) && (r = (llg0Var2 = (llg0) childViewHolder).r()) != null && r.getTimestamp() == timestamp) ? llg0Var2 : null;
                        }
                        i3++;
                    }
                }
                if (llg0Var != null) {
                    llg0Var.i(new a7b(i2, iVar, serverMessageRef), new sbb(iVar, i4), booleanValue);
                }
                return zy11Var;
            case 1:
                ((d) obj4).H.k((String) obj2);
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                ((rpb) obj4).a((fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                hxb hxbVar = (hxb) obj4;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    fmb1.j(hxbVar.getTitle(), hxbVar.getSubtitle(), btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 4:
                ((a) obj4).c.k((String) obj2);
                return zy11Var;
            case 5:
                inputListeners$lambda$1 = CompositeAddressSearchView.setInputListeners$lambda$1((CompositeAddressSearchView) obj4, (PointType) obj, (String) obj2);
                return inputListeners$lambda$1;
            case 6:
                Integer num = (Integer) obj;
                num.getClass();
                evd evdVar = (evd) obj2;
                wls wlsVar = ((fvd) obj4).c.b;
                return (wlsVar == null || (invoke = wlsVar.invoke(num, evdVar)) == null) ? evdVar.a : invoke;
            case 7:
                ((Integer) obj2).getClass();
                com.yandex.messaging.ui.main.telemessenger.connection.a.a((r5e) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                ((b) obj4).c((fid) obj, vng.O(7));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                c.d((j) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                hsb1.a((qte) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.a aVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.a) obj4;
                String str = (String) obj;
                String str2 = (String) obj2;
                PlusPayCounterOffers plusPayCounterOffers = aVar.F;
                if (plusPayCounterOffers != null) {
                    i0f i0fVar = aVar.C;
                    ind0 a = aVar.c.a.a();
                    PlusPayCounterOffersReason plusPayCounterOffersReason = aVar.E;
                    eu90 eu90Var = ((j0f) i0fVar).a;
                    String d = dio.d(a.a);
                    PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    if (id == null) {
                        id = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
                    ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String a2 = j0f.a(plusPayCounterOffers);
                    String code = plusPayCounterOffersReason.getCode();
                    LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
                    t.put("options_id", arrayList);
                    t.put("target", a2);
                    t.put(CRLReasonCodeExtension.REASON, code);
                    t.put("counter_offer_action_text", str);
                    t.put("counter_offer_action_link", str2);
                    t.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("CounterOffers.Action.Clicked", t);
                }
                aVar.B.a(str2);
                return zy11Var;
            case 12:
                int intValue2 = ((Integer) obj).intValue();
                t7f t7fVar = ((k7f) obj4).a;
                ((o7f) t7fVar.m.get(intValue2 - 1)).b = (String) obj2;
                t7fVar.d();
                return zy11Var;
            case 13:
                onViewCreated$lambda$14$lambda$13 = CreditDepositFragment.onViewCreated$lambda$14$lambda$13((CreditDepositFragment) obj4, (BigDecimal) obj, (SuggestView$State$Behaviour) obj2);
                return onViewCreated$lambda$14$lambda$13;
            case 14:
                adapter$lambda$0$1 = DashboardEventsModalView.adapter$lambda$0$1((DashboardEventsModalView) obj4, (ButtonComponent) obj, (zjg) obj2);
                return adapter$lambda$0$1;
            case 15:
                mjf mjfVar = (mjf) obj4;
                View inflate = ((LayoutInflater) obj).inflate(eth0.due_timetable_item_day_selector, (ViewGroup) obj2, false);
                if (inflate != null) {
                    DaySelectorItemView daySelectorItemView = (DaySelectorItemView) inflate;
                    return new psg(new nzm(daySelectorItemView, 0, daySelectorItemView), mjfVar);
                }
                ny61.t("rootView");
                return null;
            case 16:
                showDialog$lambda$19 = DebugPanelLogsView.showDialog$lambda$19((boolean[]) obj4, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                return showDialog$lambda$19;
            case 17:
                m2v m2vVar = (m2v) obj4;
                fid fidVar2 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String b = vhb1.b(btsVar2, wyh0.m3c_dialog);
                    f530 f530Var = (f530) m2vVar.b;
                    l690 l690Var = cr1.a;
                    f530 p = ljs0.p(f530Var, 280.0f, 0.0f, 560.0f, 0.0f, 10);
                    boolean k = btsVar2.k(b);
                    Object Q = btsVar2.Q();
                    if (!k) {
                        obj3 = Q;
                        break;
                    }
                    wwb wwbVar = new wwb(b, 5);
                    btsVar2.o0(wwbVar);
                    obj3 = wwbVar;
                    f530 k2 = p.k(fnq0.b(c530Var, false, (tls) obj3));
                    z910 d2 = pi6.d(x4c.b, true);
                    int S = cma1.S(btsVar2);
                    r1b0 o = btsVar2.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar2, k2);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, androidx.compose.ui.node.d.f, d2);
                    qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                    wls wlsVar2 = androidx.compose.ui.node.d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar2, S, wlsVar2);
                    }
                    qje.W(btsVar2, androidx.compose.ui.node.d.d, d3);
                    nnm.p(0, (androidx.compose.runtime.internal.a) m2vVar.w, btsVar2, true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                bts btsVar3 = (bts) ((fid) obj);
                btsVar3.e0(666084174);
                String str3 = ((hly0) obj4).b;
                btsVar3.t(false);
                return str3;
            case 19:
                fxh fxhVar = (fxh) obj4;
                fid fidVar3 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar3;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    web1.e(null, null, null, fxhVar.a, null, 0L, null, null, null, 0, false, 0, null, null, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar4, 0, 0, 0, 268435447);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.cost_details.ui.a.c((n2i) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                l2i l2iVar = (l2i) obj4;
                fid fidVar4 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar4;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    sic a3 = qic.a(lr20.c, x4c.G, btsVar5, 0);
                    int hashCode = Long.hashCode(btsVar5.T);
                    r1b0 o2 = btsVar5.o();
                    f530 d4 = androidx.compose.ui.b.d(btsVar5, c530Var);
                    ohd.G1.getClass();
                    sls slsVar2 = androidx.compose.ui.node.d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar2);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, androidx.compose.ui.node.d.f, a3);
                    qje.W(btsVar5, androidx.compose.ui.node.d.e, o2);
                    wls wlsVar3 = androidx.compose.ui.node.d.g;
                    if (btsVar5.S || !jl40.l(btsVar5.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar5, hashCode, wlsVar3);
                    }
                    qje.W(btsVar5, androidx.compose.ui.node.d.d, d4);
                    ru.yandex.taxi.logistics.sdk.cost_details.ui.a.e(l2iVar.a, btsVar5, 0);
                    ru.yandex.taxi.logistics.sdk.cost_details.ui.a.d(l2iVar.b, btsVar5, 0);
                    btsVar5.t(true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 22:
                ((e) obj4).Ng((String) obj, ((Boolean) obj2).booleanValue());
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                he91.a((yxi) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                o oVar = (o) obj4;
                oVar.e.c((String) obj2);
                oVar.c.f((ibk0) obj);
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                y891.a((o9j) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                m1q0 m1q0Var = (m1q0) obj4;
                fid fidVar5 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar5;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    web1.e(null, null, null, m1q0Var.a, null, 0L, null, null, null, 0, false, Integer.MAX_VALUE, null, m1q0Var.b, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar6, 0, 384, 0, 268398583);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 27:
                ViewGroup viewGroup = ((edj) obj4).a;
                return Integer.valueOf(jl40.q(viewGroup.indexOfChild((View) obj), viewGroup.indexOfChild((View) obj2)));
            case 28:
                onViewCreated$lambda$6$lambda$5 = DiffRateCalendarFragment.onViewCreated$lambda$6$lambda$5((DiffRateCalendarFragment) obj4, ((Long) obj).longValue(), (View) obj2);
                return onViewCreated$lambda$6$lambda$5;
            default:
                calendarAdapter$lambda$1 = DiffRateCalendarView.calendarAdapter$lambda$1((DiffRateCalendarView) obj4, (hf7) obj, (View) obj2);
                return calendarAdapter$lambda$1;
        }
    }

    public /* synthetic */ tbb(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
