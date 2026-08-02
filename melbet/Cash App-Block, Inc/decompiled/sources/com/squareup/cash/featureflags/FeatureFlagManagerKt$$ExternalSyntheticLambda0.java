package com.squareup.cash.featureflags;

import androidx.compose.runtime.AbstractApplier;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class FeatureFlagManagerKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FeatureFlagManager f$0;
    public final /* synthetic */ AbstractApplier f$1;

    public /* synthetic */ FeatureFlagManagerKt$$ExternalSyntheticLambda0(FeatureFlagManager featureFlagManager, AbstractApplier abstractApplier, int i) {
        this.$r8$classId = i;
        this.f$0 = featureFlagManager;
        this.f$1 = abstractApplier;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return ((RealFeatureFlagManager) this.f$0).peekCurrentValue(this.f$1);
            default:
                return ((RealFeatureFlagManager) this.f$0).currentValue(this.f$1);
        }
    }
}
