package com.squareup.cash.blockers.analytics;

import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractViewBlockerResponse;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final /* synthetic */ class BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ AndroidStringManager f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ BlockersData f$3;
    public final /* synthetic */ Ref$ObjectRef f$4;
    public final /* synthetic */ Analytics f$5;
    public final /* synthetic */ String f$6;
    public final /* synthetic */ String f$7;
    public final /* synthetic */ String f$8;
    public final /* synthetic */ BlockerFlowReferrerType f$9;

    public /* synthetic */ BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda3(Function1 function1, AndroidStringManager androidStringManager, int i, BlockersData blockersData, Ref$ObjectRef ref$ObjectRef, Analytics analytics, String str, String str2, String str3, BlockerFlowReferrerType blockerFlowReferrerType) {
        this.f$0 = function1;
        this.f$1 = androidStringManager;
        this.f$2 = i;
        this.f$3 = blockersData;
        this.f$4 = ref$ObjectRef;
        this.f$5 = analytics;
        this.f$6 = str;
        this.f$7 = str2;
        this.f$8 = str3;
        this.f$9 = blockerFlowReferrerType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        BlockerResponse blockerResponse = (BlockerResponse) this.f$0.invoke(obj);
        if (blockerResponse instanceof BlockerResponse.Error) {
            BlockerResponse.Error error = (BlockerResponse.Error) blockerResponse;
            String str = error.errorCode;
            String str2 = error.errorMessage;
            if (str2 == null) {
                AndroidStringManager androidStringManager = this.f$1;
                str2 = androidStringManager != null ? androidStringManager.get(this.f$2) : null;
            }
            pair = new Pair(str, str2);
        } else {
            pair = null;
        }
        if (pair == null) {
            pair = new Pair(null, null);
        }
        String str3 = (String) pair.first;
        String str4 = (String) pair.second;
        BlockersData blockersData = this.f$3;
        ClientScenario clientScenario = blockersData.clientScenario;
        Flow$Type flow$Type = blockersData.flowType;
        String nextBlockerId = blockersData.getNextBlockerId();
        blockerResponse.getClass();
        BlockerFlowInteractViewBlockerResponse.Status status = blockerResponse instanceof BlockerResponse.Error ? ((BlockerResponse.Error) blockerResponse).status : BlockerFlowInteractViewBlockerResponse.Status.SUCCESS;
        Long l = (Long) this.f$4.element;
        Analytics analytics = this.f$5;
        analytics.getClass();
        String str5 = this.f$6;
        str5.getClass();
        status.getClass();
        analytics.track(new BlockerFlowInteractViewBlockerResponse(nextBlockerId, this.f$7, clientScenario != null ? BlockerFlowAnalyticsHelperKt.analyticsName(clientScenario, flow$Type) : null, flow$Type != null ? flow$Type.name() : null, str3, str4, str5, l != null ? Integer.valueOf((int) (System.currentTimeMillis() - l.longValue())) : null, status, this.f$8, this.f$9), null);
        return Unit.INSTANCE;
    }
}
