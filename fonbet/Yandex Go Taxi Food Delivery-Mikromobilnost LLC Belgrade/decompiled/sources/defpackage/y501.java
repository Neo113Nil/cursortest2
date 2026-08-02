package defpackage;

import com.yandex.go.places.models.data.mappers.f;
import com.yandex.go.transfer_requirement.transferapi.TransferApi;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import com.ybsdk.feature.transfer.internal.network.TransfersApi;
import com.ybsdk.rconfig.configs.TransfersContactsFuzzySearchConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.DeliveryStateApi;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.b;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.NeuroPostcardApi;
import ru.yandex.taxi.map_common.map.q;
import ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.e;
import ru.yandex.taxi.masstransit.trains.search.d;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class y501 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public y501(nwf nwfVar, f2b f2bVar) {
        this.a = 2;
        this.b = f2bVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ds0((jwh) ((jbg) xvf0Var).get());
            case 1:
                return (DeliveryStateApi) ((t0k0) ((jbg) xvf0Var).get()).b(DeliveryStateApi.class);
            case 2:
                return (b) i5m.a((f2b) xvf0Var).get();
            case 3:
                return (m5i) ((hbg) xvf0Var).b.w;
            case 4:
                String str = ((g701) ((hbg) xvf0Var).b.b).a;
                q5z.i(str);
                return str;
            case 5:
                return (NeuroPostcardApi) ((t0k0) ((gbg) xvf0Var).get()).b(NeuroPostcardApi.class);
            case 6:
                return new d901((q) ((qcz0) xvf0Var).get());
            case 7:
                return new la01((l7x0) ((w5g) xvf0Var).get());
            case 8:
                return new d((c) ((r3g) xvf0Var).get());
            case 9:
                ((nbg) xvf0Var).get();
                return new pe01();
            case 10:
                return new sb6((AppAnalyticsReporter) ((nbg) xvf0Var).get());
            case 11:
                return (bta0) ((cta0) xvf0Var).get();
            case 12:
                TransactionsApi transactionsApi = (TransactionsApi) ((t0k0) ((nbg) xvf0Var).get()).b(TransactionsApi.class);
                q5z.i(transactionsApi);
                return transactionsApi;
            case 13:
                return new ih01((pho) ((pbg) xvf0Var).get());
            case 14:
                return (TransfersApi) ((t0k0) ((hag) xvf0Var).get()).b(TransfersApi.class);
            case 15:
                return new hd30(2, (e6g) ((rz2) xvf0Var).get());
            case 16:
                return new bo5(i5m.a((pbg) xvf0Var));
            case 17:
                TransferApi transferApi = (TransferApi) ((on2) ((y0g) xvf0Var).get()).a(GoApiName.TaxiV4, TransferApi.class);
                q5z.i(transferApi);
                return transferApi;
            case 18:
                return new gdb0((w530) ((qbg) xvf0Var).get());
            case 19:
                ((hag) xvf0Var).get();
                return new xr01();
            case 20:
                return new us01((w530) ((hag) xvf0Var).get());
            case 21:
                return new eg01((gdb0) ((y501) xvf0Var).get());
            case 22:
                TransfersContactsFuzzySearchConfig transfersContactsFuzzySearchConfig = (TransfersContactsFuzzySearchConfig) ((qu01) ((ro01) ((qbg) xvf0Var).get())).b.d(com.ybsdk.rconfig.configs.c.a).getData();
                boolean isEnabled = transfersContactsFuzzySearchConfig.isEnabled();
                int minQueryLen = transfersContactsFuzzySearchConfig.getName().getMinQueryLen();
                List<TransfersContactsFuzzySearchConfig.Rule> maxDistanceRules = transfersContactsFuzzySearchConfig.getName().getMaxDistanceRules();
                ArrayList arrayList = new ArrayList(tcc.n(maxDistanceRules, 10));
                for (TransfersContactsFuzzySearchConfig.Rule rule : maxDistanceRules) {
                    arrayList.add(new go01(rule.getMinLen(), rule.getMaxDistance()));
                }
                do01 do01Var = new do01(minQueryLen, a.x0(arrayList, new zu01()));
                int minQueryLen2 = transfersContactsFuzzySearchConfig.getPhone().getMinQueryLen();
                List<TransfersContactsFuzzySearchConfig.Rule> maxDistanceRules2 = transfersContactsFuzzySearchConfig.getPhone().getMaxDistanceRules();
                ArrayList arrayList2 = new ArrayList(tcc.n(maxDistanceRules2, 10));
                for (TransfersContactsFuzzySearchConfig.Rule rule2 : maxDistanceRules2) {
                    arrayList2.add(new go01(rule2.getMinLen(), rule2.getMaxDistance()));
                }
                return new ho01(isEnabled, do01Var, new fo01(minQueryLen2, a.x0(arrayList2, new av01())), new eo01(transfersContactsFuzzySearchConfig.getNormalization().getNeighborsSubstitutionCost(), transfersContactsFuzzySearchConfig.getNormalization().getRegularSubstitutionCost(), transfersContactsFuzzySearchConfig.getNormalization().getDigitSubstitutionCost(), transfersContactsFuzzySearchConfig.getNormalization().getEnableLatinCyrillicLookalikes()), transfersContactsFuzzySearchConfig.getSwapCost());
            case 23:
                return new com.ybsdk.feature.transfer.version2.internal.screens.a((csl) ((qbg) xvf0Var).get());
            case 24:
                return new com.ybsdk.feature.transfer.version2.internal.screens.dashboard.domain.a((com.ybsdk.feature.transfer.version2.internal.screens.dashboard.data.a) ((qcz0) xvf0Var).get());
            case 25:
                return new c1x0((d860) ((twf) xvf0Var).get());
            case 26:
                return new d411((pho) ((b3g) xvf0Var).get());
            case 27:
                return new e((rqo) ((b3g) xvf0Var).get());
            case 28:
                return new f((com.yandex.go.places.models.data.mappers.a) ((yc) xvf0Var).get());
            default:
                return new o7r0((pho) ((tbg) xvf0Var).get());
        }
    }

    public /* synthetic */ y501(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
