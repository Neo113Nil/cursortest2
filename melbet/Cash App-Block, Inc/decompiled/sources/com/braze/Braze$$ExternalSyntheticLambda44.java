package com.braze;

import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda44 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeConfig f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda44(BrazeConfig brazeConfig, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String applyPendingRuntimeConfiguration$lambda$0$2;
        String configure$lambda$0;
        String configuration$lambda$0;
        int i = this.$r8$classId;
        BrazeConfig brazeConfig = this.f$0;
        switch (i) {
            case 0:
                applyPendingRuntimeConfiguration$lambda$0$2 = Braze.applyPendingRuntimeConfiguration$lambda$0$2(brazeConfig);
                return applyPendingRuntimeConfiguration$lambda$0$2;
            case 1:
                configure$lambda$0 = Braze.Companion.configure$lambda$0(brazeConfig);
                return configure$lambda$0;
            default:
                configuration$lambda$0 = RuntimeAppConfigurationProvider.setConfiguration$lambda$0(brazeConfig);
                return configuration$lambda$0;
        }
    }
}
