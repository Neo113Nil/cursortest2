package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda9(Braze braze, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit subscribeToContentCardsUpdates$lambda$3;
        Unit requestImmediateDataFlush$lambda$1;
        Unit handleInternalBannerRefresh$lambda$1;
        Unit refreshFeatureFlags$lambda$1;
        Unit requestContentCardsRefresh$lambda$1;
        Unit requestContentCardsRefreshFromCache$lambda$1;
        Unit performPushDeliveryFlush$lambda$1;
        Unit subscribeToChangeUserEvents$lambda$3;
        Unit safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1;
        int i = this.$r8$classId;
        Braze braze = this.f$0;
        switch (i) {
            case 0:
                subscribeToContentCardsUpdates$lambda$3 = Braze.subscribeToContentCardsUpdates$lambda$3(braze);
                return subscribeToContentCardsUpdates$lambda$3;
            case 1:
                requestImmediateDataFlush$lambda$1 = Braze.requestImmediateDataFlush$lambda$1(braze);
                return requestImmediateDataFlush$lambda$1;
            case 2:
                handleInternalBannerRefresh$lambda$1 = Braze.handleInternalBannerRefresh$lambda$1(braze);
                return handleInternalBannerRefresh$lambda$1;
            case 3:
                refreshFeatureFlags$lambda$1 = Braze.refreshFeatureFlags$lambda$1(braze);
                return refreshFeatureFlags$lambda$1;
            case 4:
                requestContentCardsRefresh$lambda$1 = Braze.requestContentCardsRefresh$lambda$1(braze);
                return requestContentCardsRefresh$lambda$1;
            case 5:
                requestContentCardsRefreshFromCache$lambda$1 = Braze.requestContentCardsRefreshFromCache$lambda$1(braze);
                return requestContentCardsRefreshFromCache$lambda$1;
            case 6:
                performPushDeliveryFlush$lambda$1 = Braze.performPushDeliveryFlush$lambda$1(braze);
                return performPushDeliveryFlush$lambda$1;
            case 7:
                subscribeToChangeUserEvents$lambda$3 = Braze.subscribeToChangeUserEvents$lambda$3(braze);
                return subscribeToChangeUserEvents$lambda$3;
            default:
                safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1 = Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1(braze);
                return safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1;
        }
    }
}
