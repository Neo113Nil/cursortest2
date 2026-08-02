package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.paymentlist.experiments.YbWalletTopUpRuleExperiment;

/* loaded from: classes9.dex */
public final class svp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("yandex_bank_topup", YbWalletTopUpRuleExperiment.class, new stp(12), ExperimentSource.ZONE_INFO, true);
    }
}
