package com.squareup.cash.blockers.treehouse;

import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class TreehouseFlows$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealTreehouseConfigurationStore f$0;

    public /* synthetic */ TreehouseFlows$$ExternalSyntheticLambda0(RealTreehouseConfigurationStore realTreehouseConfigurationStore, int i) {
        this.$r8$classId = i;
        this.f$0 = realTreehouseConfigurationStore;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        RealTreehouseConfigurationStore realTreehouseConfigurationStore = this.f$0;
        switch (i) {
            case 0:
                return realTreehouseConfigurationStore.minimalCommitTimestamp("flows");
            case 1:
                return realTreehouseConfigurationStore.minimalCommitTimestamp("discover");
            case 2:
                return realTreehouseConfigurationStore.minimalCommitTimestamp("activity");
            case 3:
                return realTreehouseConfigurationStore.minimalCommitTimestamp("bitcoin");
            case 4:
                return realTreehouseConfigurationStore.minimalCommitTimestamp("cash-app-pay");
            case 5:
                return realTreehouseConfigurationStore.minimalCommitTimestamp("financial-services");
            case 6:
                return realTreehouseConfigurationStore.minimalCommitTimestamp("marketing");
            default:
                return realTreehouseConfigurationStore.minimalCommitTimestamp("playground");
        }
    }
}
