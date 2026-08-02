package defpackage;

import com.yandex.plus.acquisition.adapter.api.PlusAcquisitionSdkPaymentAnalyticsParams;
import com.yandex.plus.acquisition.sdk.api.PlusAcquisitionExperiments;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class v42 implements u42 {
    public final PlusAcquisitionPaymentAnalytics$Params a(PlusAcquisitionSdkPaymentAnalyticsParams plusAcquisitionSdkPaymentAnalyticsParams) {
        PlusAcquisitionExperiments plusAcquisitionExperiments;
        PlusAcquisitionSdkPaymentAnalyticsParams.Experiments experiments = plusAcquisitionSdkPaymentAnalyticsParams.getExperiments();
        if (experiments != null) {
            Set<PlusAcquisitionSdkPaymentAnalyticsParams.Experiments.TestId> testIds = experiments.getTestIds();
            ArrayList arrayList = new ArrayList(tcc.n(testIds, 10));
            for (PlusAcquisitionSdkPaymentAnalyticsParams.Experiments.TestId testId : testIds) {
                arrayList.add(new PlusAcquisitionExperiments.TestId(testId.getValue(), testId.getBucketNumber()));
            }
            plusAcquisitionExperiments = new PlusAcquisitionExperiments(a.N0(arrayList), experiments.getFlags());
        } else {
            plusAcquisitionExperiments = null;
        }
        return new PlusAcquisitionPaymentAnalytics$Params(plusAcquisitionExperiments, plusAcquisitionSdkPaymentAnalyticsParams.getFrom(), plusAcquisitionSdkPaymentAnalyticsParams.getCustomParams());
    }
}
