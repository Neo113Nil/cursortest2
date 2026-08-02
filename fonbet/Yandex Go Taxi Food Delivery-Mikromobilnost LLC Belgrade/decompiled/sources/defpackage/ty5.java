package defpackage;

import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowFailureReason;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowResult;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowType;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class ty5 {
    public final pho a;

    public ty5(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType, BiometricsAnalytics$BiometricsFlowResult biometricsAnalytics$BiometricsFlowResult, BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason) {
        HashMap hashMap = new HashMap();
        hashMap.put("flow_type", biometricsAnalytics$BiometricsFlowType.getEventValue());
        hashMap.put(TarifficatorScenarioActivity.RESULT_KEY, biometricsAnalytics$BiometricsFlowResult.getEventValue());
        if (biometricsAnalytics$BiometricsFlowFailureReason != null) {
            hashMap.put("failure_reason", biometricsAnalytics$BiometricsFlowFailureReason.getEventValue());
        }
        this.a.a("Biometrics.Flow.Result", hashMap, 1, new HashMap());
    }

    public final void b(BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType) {
        HashMap hashMap = new HashMap();
        hashMap.put("flow_type", biometricsAnalytics$BiometricsFlowType.getEventValue());
        this.a.a("Biometrics.Flow.Start", hashMap, 1, new HashMap());
    }
}
