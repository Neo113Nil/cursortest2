package defpackage;

import com.yandex.go.delivery.rental_duration_selector.experiment.RentalDurationExperiment;
import com.yandex.go.delivery.rental_duration_selector.experiment.h;
import com.yandex.go.image.api.domain.models.ImageLoadPriority;
import com.yandex.go.image.internal.coil.fetcher.c;
import com.yandex.go.network_metrics.experiment.ReportingDestination;
import com.yandex.go.network_metrics.experiment.ReportingEndpoint$$serializer;
import com.yandex.go.promocodes.referral.api.net.dto.DescriptionItem$$serializer;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode$$serializer;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import com.yandex.go.promocodes.referral.api.net.dto.b;
import com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodes;
import com.yandex.go.promocodes.referral.impl.net.dto.d;
import com.yandex.go.zone.dto.objects.RequirementOverrideDto;
import com.yandex.go.zone.dto.objects.p3;
import defpackage.pnj0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto;
import ru.yandex.taxi.shortcuts.dto.response.RequiredAccount;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes.dex */
public final /* synthetic */ class vci0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ vci0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                List x0 = a.x0(jwq0.b(), new wci0());
                ArrayList arrayList = new ArrayList();
                int size = x0.size();
                while (i < size) {
                    lw60 lw60Var = (lw60) ((uwq) x0.get(i));
                    arrayList.add(new Pair(lw60Var.a(), lw60Var.b()));
                    i++;
                }
                return arrayList;
            case 1:
                List x02 = a.x0(jwq0.a(), new xci0());
                ArrayList arrayList2 = new ArrayList();
                int size2 = x02.size();
                while (i < size2) {
                    arrayList2.add(((mgt) ((ryg) x02.get(i))).a());
                    i++;
                }
                return arrayList2;
            case 2:
                b bVar = ReferralCode.Companion;
                return ReferralService.Companion.serializer();
            case 3:
                b bVar2 = ReferralCode.Companion;
                return new p53(DescriptionItem$$serializer.INSTANCE, 0);
            case 4:
                d dVar = ReferralCodes.Companion;
                return new p53(ReferralCode$$serializer.INSTANCE, 0);
            case 5:
                return vez0.g("com.yandex.go.promocodes.referral.api.net.dto.ReferralService", ReferralService.values(), new String[]{TariffOrderFlow.ORDER_FLOW_TAXI_KEY, "grocery", null}, new Annotation[][]{null, null, null});
            case 6:
                return new oke(qoi0.a(hx.class), null, new KSerializer[0]);
            case 7:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 8:
                return new c(gw00.e(new Pair(Integer.valueOf(ImageLoadPriority.LOW.getPriority()), 7)));
            case 9:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 10:
                h hVar = RentalDurationExperiment.Companion;
                return new p53(auu0.a, 0);
            case 11:
                h hVar2 = RentalDurationExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 12:
                com.yandex.go.network_metrics.experiment.c cVar = ReportingDestination.Companion;
                return new p53(auu0.a, 0);
            case 13:
                com.yandex.go.network_metrics.experiment.c cVar2 = ReportingDestination.Companion;
                return new p53(ReportingEndpoint$$serializer.INSTANCE, 0);
            case 14:
                return vez0.g("ru.yandex.taxi.shortcuts.dto.response.RequiredAccount", RequiredAccount.values(), new String[]{"no_auth", "any", "portal_or_lite"}, new Annotation[][]{null, null, null});
            case 15:
                dbj0 dbj0Var = ebj0.Companion;
                return new p53(xd70.a, 0);
            case 16:
                zcj0 zcj0Var = adj0.Companion;
                return new p53(auu0.a, 0);
            case 17:
                mdj0 mdj0Var = RequirementBubbleDto.Companion;
                return new k8u(auu0.a, ru.yandex.taxi.requirements.models.net.experiment.a.a, 1);
            case 18:
                mdj0 mdj0Var2 = RequirementBubbleDto.Companion;
                return RequirementBubbleDto.RequirementBubbleActionDto.Companion.serializer();
            case 19:
                return vez0.g("ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto.RequirementBubbleActionDto", RequirementBubbleDto.RequirementBubbleActionDto.values(), new String[]{"show_schedule", "show_compound_select_options", "change_count", "show_intercity_contact", null}, new Annotation[][]{null, null, null, null, null});
            case 20:
                sgj0 sgj0Var = tgj0.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, qke.n(new p53(auu0Var3, 0)), 1);
            case 21:
                sgj0 sgj0Var2 = tgj0.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, qke.n(new p53(auu0Var4, 0)), 1);
            case 22:
                p3 p3Var = RequirementOverrideDto.Companion;
                return new p53(auu0.a, 0);
            case 23:
                ujj0 ujj0Var = vjj0.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, new k8u(auu0Var5, new k8u(auu0Var5, amx0.a, 1), 1), 1);
            case 24:
                vmj0 vmj0Var = wmj0.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 25:
                mnj0 mnj0Var = pnj0.Companion;
                auu0 auu0Var7 = auu0.a;
                return new k8u(auu0Var7, new k8u(auu0Var7, qnj0.a, 1), 1);
            case 26:
                mnj0 mnj0Var2 = pnj0.Companion;
                return new p53(snj0.a, 0);
            case 27:
                rnj0 rnj0Var = pnj0.b.Companion;
                return new k8u(auu0.a, nnj0.a, 1);
            case 28:
                gpj0 gpj0Var = hpj0.Companion;
                return new k8u(auu0.a, kpj0.a, 1);
            default:
                gqj0 gqj0Var = ru.yandex.taxi.requirements.models.net.experiment.c.Companion;
                auu0 auu0Var8 = auu0.a;
                return new k8u(auu0Var8, auu0Var8, 1);
        }
    }
}
