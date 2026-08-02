package defpackage;

import android.os.Handler;
import android.widget.ImageView;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.semantics.f;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g;
import com.yandex.go.superapp.order.multi.old.view.OrderStackViewPresenter$subscribeToQueueAvailability$$inlined$safeCollectIn$1;
import com.yandex.go.superapp.orders.known.KnownOrder;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.queue.interactor.QueueAvailabilityInteractorImpl$orderHasQueueFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import com.yandex.go.zone.model.Zone;
import com.yandex.passport.api.d1;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.payment.sdk.nfcscanner.NfcResult;
import com.yandex.payment.sdk.ui.newbind.NewBindFragment;
import com.yandex.payment.sdk.ui.view.card.CardInputViewImpl;
import com.yandex.plus.core.network.error.NetworkException;
import com.yandex.plus.core.network.okhttp.call.c;
import com.yandex.xplat.payment.sdk.NspkMembersSource;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.partnerselection.api.PartnerWithAction$Status;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.OperationStatusView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.ui.orders.card.base.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class zl50 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zl50(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$4;
        zy11 render$lambda$1$lambda$0;
        int i = 10;
        Object[] objArr = 0;
        int i2 = 0;
        switch (this.a) {
            case 0:
                fm50 fm50Var = (fm50) this.c;
                sls slsVar = (sls) this.b;
                if (((am3) obj) instanceof zl3) {
                    b00 b00Var = fm50Var.A;
                    ((Handler) b00Var.a.get()).post(new uz(i2, b00Var));
                }
                slsVar.invoke();
                return zy11.a;
            case 1:
                tm50 tm50Var = (tm50) this.c;
                sls slsVar2 = (sls) this.b;
                if (((am3) obj) instanceof zl3) {
                    b00 b00Var2 = tm50Var.x;
                    ((Handler) b00Var2.a.get()).post(new uz(i2, b00Var2));
                }
                slsVar2.invoke();
                return zy11.a;
            case 2:
                return (NetworkException) ((wls) this.c).invoke((Throwable) obj, (jt50) this.b);
            case 3:
                pzt0 pzt0Var = (pzt0) this.c;
                y6f0 y6f0Var = (y6f0) this.b;
                pzt0Var.a(null);
                ((x6f0) y6f0Var).d((s8e) obj);
                return zy11.a;
            case 4:
                onViewCreated$lambda$4 = NewBindFragment.onViewCreated$lambda$4((CardInputViewImpl) this.c, (NewBindFragment) this.b, (NfcResult) obj);
                return onViewCreated$lambda$4;
            case 5:
                gd60.f((gd60) this.c, (HashSet) this.b);
                return zy11.a;
            case 6:
                dt20 dt20Var = (dt20) this.c;
                NspkMembersSource nspkMembersSource = (NspkMembersSource) this.b;
                ArrayList arrayList = ((ol60) obj).a;
                int i3 = jl60.a[nspkMembersSource.ordinal()];
                if (i3 == 1) {
                    dt20Var.c = arrayList;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    dt20Var.x = arrayList;
                }
                return arrayList;
            case 7:
                mnq0 mnq0Var = (mnq0) obj;
                String p = g8e.p(((co60) this.c).e, " ", ((hoy0) ((oz40) this.b).getValue()).a.b);
                hk2 hk2Var = new hk2(0);
                hk2Var.d(p);
                f.t(mnq0Var, hk2Var.i());
                f.n(mnq0Var, 0);
                return zy11.a;
            case 8:
                lv60 lv60Var = (lv60) this.c;
                o oVar = (o) this.b;
                o.a aVar = (o.a) obj;
                boolean z = lv60Var.c;
                float f = lv60Var.a;
                if (z) {
                    o.a.o(aVar, oVar, aVar.f0(f), aVar.f0(lv60Var.b));
                } else {
                    aVar.g(oVar, aVar.f0(f), aVar.f0(lv60Var.b), 0.0f);
                }
                return zy11.a;
            case 9:
                ov60 ov60Var = (ov60) this.c;
                o oVar2 = (o) this.b;
                o.a aVar2 = (o.a) obj;
                long j = ((z5w) ov60Var.a.invoke(aVar2)).a;
                if (ov60Var.b) {
                    o.a.q(aVar2, oVar2, (int) (j >> 32), (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                } else {
                    o.a.x(aVar2, oVar2, (int) (j >> 32), (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, 12);
                }
                return zy11.a;
            case 10:
                return ((kw60) ((c) this.c).f).a((jt50) this.b, (Throwable) obj);
            case 11:
                m370 m370Var = (m370) this.c;
                qze qzeVar = (qze) this.b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                jjb jjbVar = m370Var.N;
                if (jjbVar != null) {
                    ((wls) qzeVar.w).invoke(jjbVar.b.a, bool);
                }
                return zy11.a;
            case 12:
                render$lambda$1$lambda$0 = OperationStatusView.render$lambda$1$lambda$0((v361) this.c, (tls) this.b, ((Boolean) obj).booleanValue());
                return render$lambda$1$lambda$0;
            case 13:
                ln70 ln70Var = (ln70) this.c;
                sm70 sm70Var = (sm70) this.b;
                ImageView imageView = (ImageView) obj;
                hic hicVar = ln70Var.d;
                if (hicVar != null) {
                    ((a) hicVar).a(imageView, sm70Var.b.intValue());
                }
                return zy11.a;
            case 14:
                ((h5y0) obj).n1(new tzx0((ynv0) this.c), (Preorder) this.b);
                return zy11.a;
            case 15:
                com.yandex.go.taxi.order.controller.a aVar3 = (com.yandex.go.taxi.order.controller.a) this.c;
                epq0 epq0Var = (epq0) this.b;
                Zone zone = (Zone) obj;
                TaxiOrder b = aVar3.c.b();
                if (b.K()) {
                    ((ru.yandex.taxi.requirements.analytics.a) aVar3.C.get()).a(zone, b.b.x);
                    TariffOrderFlow tariffOrderFlow = b.b.P;
                    String str = b.b.V;
                    String x = b.x();
                    if (tariffOrderFlow == null) {
                        tariffOrderFlow = TariffOrderFlow.TAXI_FLOW;
                    }
                    b.b.x = aVar3.B.e(zone, new kb5(str, x, (wu1) null, tariffOrderFlow, b.b.O.c, 32), b.b.x);
                    ci70 ci70Var = aVar3.A;
                    List<b580> list = b.b.x;
                    if (!list.isEmpty()) {
                        for (b580 b580Var : list) {
                            if (cvu0.x(b580Var.a, "childchair", false)) {
                                List list2 = b580Var.e;
                                if (!list2.isEmpty()) {
                                    fob fobVar = ci70Var.i;
                                    String X = kotlin.collections.a.X(kotlin.collections.a.w0(list2), "+", null, null, null, 62);
                                    fobVar.getClass();
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("options", X);
                                    fobVar.a.a("ChildChairRequirement", hashMap, 1, new HashMap());
                                }
                            }
                        }
                    }
                }
                aVar3.g(new cjm0(22, zone.a, epq0Var));
                aVar3.N = false;
                return zy11.a;
            case 16:
                com.yandex.go.taxi.order.controller.a aVar4 = (com.yandex.go.taxi.order.controller.a) this.c;
                Runnable runnable = (Runnable) this.b;
                aVar4.c.b().T(DriveState.CANCELLED);
                aVar4.c.b().O(false);
                TaxiOrder b2 = aVar4.c.b();
                b2.getClass();
                synchronized (b2) {
                    TaxiOrderLocalData taxiOrderLocalData = b2.l;
                    taxiOrderLocalData.getClass();
                    b2.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -17, 16777215);
                }
                aVar4.h.g(aVar4.c.b());
                aVar4.j("onCanceled");
                aVar4.l(aVar4.H);
                runnable.run();
                return zy11.a;
            case 17:
                return ((t680) this.c).g.a((String) obj, l601.a, new ub60(i, (o4s0) this.b));
            case 18:
                com.yandex.go.superapp.order.multi.old.view.f fVar = (com.yandex.go.superapp.order.multi.old.view.f) this.c;
                ((OrderStackMvpView) fVar.Dg()).h3(((ra80) this.b).b, (OrderStackMvpView.AnimationType) obj);
                pzt0 pzt0Var2 = fVar.m0;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                com.yandex.go.taxi.order.queue.interactor.c cVar = (com.yandex.go.taxi.order.queue.interactor.c) fVar.Z;
                fVar.m0 = tje.N(fVar.Jg(), null, null, new OrderStackViewPresenter$subscribeToQueueAvailability$$inlined$safeCollectIn$1(e.X(e.t(((e0) cVar.a).g), new QueueAvailabilityInteractorImpl$orderHasQueueFlow$$inlined$flatMapLatest$1(null, cVar)), null, fVar), 3);
                return zy11.a;
            case 19:
                String str2 = (String) this.c;
                Collection collection = (Collection) this.b;
                List list3 = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    KnownOrder knownOrder = (KnownOrder) obj2;
                    if (jl40.l(knownOrder.b, str2) && collection.contains(knownOrder.a)) {
                        arrayList2.add(obj2);
                    }
                }
                return !arrayList2.isEmpty() ? Optional.of(kotlin.collections.a.k0(list3, arrayList2)) : Optional.empty();
            case 20:
                com.yandex.go.places.organization.card.impl.domain.interactors.flex.a aVar5 = (com.yandex.go.places.organization.card.impl.domain.interactors.flex.a) this.c;
                String str3 = (String) this.b;
                String str4 = (String) obj;
                try {
                    b bVar = aVar5.f;
                    bVar.m.d(new eac0(bVar, i2), new mxc(Long.parseLong(str3), str4, fxc.b), new mo30(12, bVar), p1j0.a);
                } catch (NumberFormatException e) {
                    jst.e.k(e, "Wrong organizationId format");
                }
                return zy11.a;
            case 21:
                g gVar = (g) this.c;
                String str5 = (String) this.b;
                ti80 ti80Var = ((ne80) obj).a;
                gVar.getClass();
                return Boolean.valueOf(g.Og(ti80Var).equals(str5));
            case 22:
                ((com.yandex.go.places.impl.ui.organizations.recycler.viewholders.images.a) this.c).c0((f65) this.b, ej80.a);
                return zy11.a;
            case 23:
                z590 z590Var = (z590) this.c;
                o oVar3 = (o) this.b;
                o.a aVar6 = (o.a) obj;
                boolean z2 = z590Var.x;
                float f2 = z590Var.a;
                if (z2) {
                    o.a.o(aVar6, oVar3, aVar6.f0(f2), aVar6.f0(z590Var.b));
                } else {
                    aVar6.g(oVar3, aVar6.f0(f2), aVar6.f0(z590Var.b), 0.0f);
                }
                return zy11.a;
            case 24:
                wls wlsVar = (wls) this.c;
                p370 p370Var = (p370) this.b;
                Integer valueOf = Integer.valueOf(((pne0) obj).a);
                s890 s890Var = (s890) p370Var.c;
                wlsVar.invoke(valueOf, Integer.valueOf((s890Var != null ? s890Var : null).b));
                return zy11.a;
            case 25:
                oz40 oz40Var = (oz40) this.c;
                o.a aVar7 = (o.a) obj;
                nk2 nk2Var = new nk2((ArrayList) this.b, 8);
                aVar7.a = true;
                nk2Var.invoke(aVar7);
                aVar7.a = false;
                oz40Var.getValue();
                return zy11.a;
            case 26:
                q990 q990Var = (q990) this.c;
                oz40 oz40Var2 = (oz40) this.b;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                oz40Var2.setValue(bool2);
                q990Var.w.invoke(bool2);
                return zy11.a;
            case 27:
                ug90 ug90Var = (ug90) this.c;
                return Long.valueOf(ug90Var.b.e((oll0) obj, (vg90) this.b));
            case 28:
                dqg dqgVar = (dqg) this.c;
                com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.c cVar2 = (com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.c) this.b;
                bj90 bj90Var = (bj90) obj;
                if (dqgVar instanceof bqg) {
                    cVar2.B.g(((bqg) dqgVar).a, cVar2.H, cVar2.C.getTransferScenario());
                    return bj90.a(bj90Var, null, new s8j0(new FailDataException((ct11) dqgVar)), 11);
                }
                if (!(dqgVar instanceof cqg)) {
                    w511.b();
                    return null;
                }
                cVar2.B.i(cVar2.H, cVar2.C.getTransferScenario());
                zi90 zi90Var = (zi90) ((cqg) dqgVar).a;
                ArrayList arrayList3 = zi90Var.a;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new si90((ti90) it.next(), PartnerWithAction$Status.DEFAULT));
                }
                return bj90.a(bj90Var, null, new r8j0(new fj90(arrayList4, zi90Var.b, ""), objArr == true ? 1 : 0, 14), 11);
            default:
                no90 no90Var = (no90) this.c;
                kj kjVar = (kj) this.b;
                LoginProperties.a aVar8 = (LoginProperties.a) ((d1) obj);
                aVar8.k(no90Var.g);
                if (kjVar != null) {
                    long j2 = kjVar.a;
                    if (j2 > 0) {
                        aVar8.A = no90Var.c(j2);
                    }
                }
                return zy11.a;
        }
    }
}
