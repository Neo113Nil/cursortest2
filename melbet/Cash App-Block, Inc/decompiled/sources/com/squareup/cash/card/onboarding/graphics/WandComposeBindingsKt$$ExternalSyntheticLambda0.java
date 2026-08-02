package com.squareup.cash.card.onboarding.graphics;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class WandComposeBindingsKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WandPose f$0;

    public /* synthetic */ WandComposeBindingsKt$$ExternalSyntheticLambda0(WandPose wandPose, int i) {
        this.$r8$classId = i;
        this.f$0 = wandPose;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new WandPoseController(this.f$0);
            case 1:
                return new MiniCardPoseController(this.f$0);
            default:
                return new HeartPoseController(this.f$0, 0.028f);
        }
    }
}
