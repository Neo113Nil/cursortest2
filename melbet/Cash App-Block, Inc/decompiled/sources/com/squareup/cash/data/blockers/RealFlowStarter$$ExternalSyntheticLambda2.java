package com.squareup.cash.data.blockers;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.StatusResult;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealFlowStarter$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ StatusResult f$1;

    public /* synthetic */ RealFlowStarter$$ExternalSyntheticLambda2(StatusResult statusResult, List list) {
        this.f$1 = statusResult;
        this.f$0 = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                return BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, this.f$1, false, null, null, null, null, null, null, null, null, null, null, null, false, RequestContext.copy$default(blockersData.requestContext, null, null, null, null, this.f$0, null, null, null, null, null, null, null, 8175), null, null, -536870913, 57341);
            default:
                BlockersData blockersData2 = (BlockersData) obj;
                blockersData2.getClass();
                return BlockersData.copy$default(blockersData2, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, this.f$1, false, null, null, null, null, null, null, null, null, null, null, null, false, RequestContext.copy$default(blockersData2.requestContext, null, null, null, null, this.f$0, null, null, null, null, null, null, null, 8175), null, null, -536870913, 57343);
        }
    }

    public /* synthetic */ RealFlowStarter$$ExternalSyntheticLambda2(List list, StatusResult statusResult) {
        this.f$0 = list;
        this.f$1 = statusResult;
    }
}
