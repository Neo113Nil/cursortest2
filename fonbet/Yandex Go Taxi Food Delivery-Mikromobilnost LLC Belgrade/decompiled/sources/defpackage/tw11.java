package defpackage;

import android.content.Context;
import com.yandex.go.universal_qr_scanner.domain.screen.title.a;
import com.yandex.go.universal_qr_scanner.experiments.config.e;
import com.yandex.go.yb.domain.c;
import com.ybsdk.api.YBSdk;
import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.main.internal.data.network.UserCardsApi;
import com.ybsdk.feature.main.internal.domain.userCards.b;
import com.ybsdk.feature.stories.internal.domain.VerticalStoriesAnalyticsInteractor$RefererScreenState;
import com.ybsdk.rconfig.configs.YbWebPerformanceLogIds;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Regex;

/* loaded from: classes14.dex */
public final class tw11 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ tw11(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new wpy0(18, (sk7) ((by8) xvf0Var).get());
            case 1:
                return new vr((Context) ((sag) xvf0Var).get(), (char) 0);
            case 2:
                return new a((e) ((on11) xvf0Var).get());
            case 3:
                return new z0f((kcz0) ((mg11) xvf0Var).get());
            case 4:
                return new com.ybsdk.feature.main.internal.domain.userCards.a((b) ((tw11) xvf0Var).get());
            case 5:
                return new b((UserCardsApi) ((v400) xvf0Var).get());
            case 6:
                return new bq21((pdc) ((icg) xvf0Var).get());
            case 7:
                return new o7r0((pho) ((jcg) xvf0Var).get());
            case 8:
                return new a331((on2) ((jcg) xvf0Var).get());
            case 9:
                ((jcg) xvf0Var).get();
                return new k15();
            case 10:
                return ((smp) ((jcg) xvf0Var).get()).a();
            case 11:
                return new i331((Context) ((sag) xvf0Var).get());
            case 12:
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((hag) xvf0Var).get();
                kcz0 kcz0Var = new kcz0();
                kcz0Var.a = appAnalyticsReporter;
                kcz0Var.b = VerticalStoriesAnalyticsInteractor$RefererScreenState.INITIAL;
                return kcz0Var;
            case 13:
                return new wpy0(25, (o021) ((h0l0) xvf0Var).get());
            case 14:
                return new y541((o7r0) ((nb11) xvf0Var).get());
            case 15:
                return new com.yandex.go.places.organization.card.impl.ui.card.flex.actions.web_custom_tabs.a((v470) ((ibz0) xvf0Var).get());
            case 16:
                st2 st2Var = (st2) ((exf) xvf0Var).get();
                cm41 cm41Var = new cm41();
                bvf0.a(st2Var.a);
                return cm41Var;
            case 17:
                Map<String, String> logIdsMap = ((YbWebPerformanceLogIds) ((if8) ((um41) ((rbg) xvf0Var).get())).a.d(cj41.a).getData()).getLogIdsMap();
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(logIdsMap.size()));
                Iterator<T> it = logIdsMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(new Regex((String) entry.getKey()), entry.getValue());
                }
                return linkedHashMap;
            case 18:
                return new o7r0((pho) ((c1g) xvf0Var).get());
            case 19:
                return new ls51((i130) ((pcg) xvf0Var).get());
            case 20:
                mg51 createSdkComponent = YBSdk.createSdkComponent(new pg51((c) ((pcg) xvf0Var).get(), new YBSdkVisualParams(false, false, true, null, null, null, 59, null)));
                q5z.i(createSdkComponent);
                return createSdkComponent;
            case 21:
                return new lv51((lx4) ((pcg) xvf0Var).get());
            case 22:
                return new epz((dne0) ((xcg) xvf0Var).get(), 2);
            default:
                return new he61((kf00) ((y500) xvf0Var).get());
        }
    }
}
