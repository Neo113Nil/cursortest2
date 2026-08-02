package com.squareup.cash.data.blockers;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealFlowStarter$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow$Type f$0;

    public /* synthetic */ RealFlowStarter$$ExternalSyntheticLambda5(Flow$Type flow$Type, int i) {
        this.$r8$classId = i;
        this.f$0 = flow$Type;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                return BlockersData.copy$default(blockersData, null, null, null, this.f$0, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -9, 65535);
            default:
                BlockersData blockersData2 = (BlockersData) obj;
                blockersData2.getClass();
                return BlockersData.copy$default(blockersData2, null, null, null, this.f$0, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -9, 65535);
        }
    }
}
