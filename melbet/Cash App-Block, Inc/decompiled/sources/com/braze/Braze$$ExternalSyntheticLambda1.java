package com.braze;

import android.os.Build;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Braze$$ExternalSyntheticLambda1() {
        this.$r8$classId = 0;
        String str = Build.MODEL;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String lambda$1$0;
        String logPurchase$lambda$1$1;
        String refreshFeatureFlags$lambda$1$0;
        String isEphemeralEventKey$lambda$0;
        String currentUser$lambda$0;
        String openSession$lambda$0;
        String openSession$lambda$1;
        String requestContentCardsRefresh$lambda$0;
        String requestContentCardsRefreshFromCache$lambda$0;
        String performPushDeliveryFlush$lambda$0;
        String subscribeToNewInAppMessages$lambda$0;
        String _init_$lambda$2;
        String subscribeToChangeUserEvents$lambda$0;
        String subscribeToChangeUserEvents$lambda$2;
        String subscribeToContentCardsUpdates$lambda$3$0;
        String subscribeToContentCardsUpdates$lambda$3$1;
        String applyPendingRuntimeConfiguration$lambda$0$0;
        String applyPendingRuntimeConfiguration$lambda$0$1;
        String publishError$lambda$0;
        String safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0;
        String lambda$3$0;
        String lambda$3$10;
        String lambda$3$11;
        String lambda$3$13;
        String lambda$3$14;
        String lambda$3$15;
        String lambda$3$16;
        String lambda$3$17;
        String lambda$3$18;
        String configurationProviderSafe$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                String str = Build.MODEL;
                lambda$1$0 = Braze.lambda$1$0(Build.MODEL);
                return lambda$1$0;
            case 1:
                logPurchase$lambda$1$1 = Braze.logPurchase$lambda$1$1();
                return logPurchase$lambda$1$1;
            case 2:
                refreshFeatureFlags$lambda$1$0 = Braze.refreshFeatureFlags$lambda$1$0();
                return refreshFeatureFlags$lambda$1$0;
            case 3:
                isEphemeralEventKey$lambda$0 = Braze.isEphemeralEventKey$lambda$0();
                return isEphemeralEventKey$lambda$0;
            case 4:
                currentUser$lambda$0 = Braze.getCurrentUser$lambda$0();
                return currentUser$lambda$0;
            case 5:
                openSession$lambda$0 = Braze.openSession$lambda$0();
                return openSession$lambda$0;
            case 6:
                openSession$lambda$1 = Braze.openSession$lambda$1();
                return openSession$lambda$1;
            case 7:
                requestContentCardsRefresh$lambda$0 = Braze.requestContentCardsRefresh$lambda$0();
                return requestContentCardsRefresh$lambda$0;
            case 8:
                requestContentCardsRefreshFromCache$lambda$0 = Braze.requestContentCardsRefreshFromCache$lambda$0();
                return requestContentCardsRefreshFromCache$lambda$0;
            case 9:
                performPushDeliveryFlush$lambda$0 = Braze.performPushDeliveryFlush$lambda$0();
                return performPushDeliveryFlush$lambda$0;
            case 10:
                subscribeToNewInAppMessages$lambda$0 = Braze.subscribeToNewInAppMessages$lambda$0();
                return subscribeToNewInAppMessages$lambda$0;
            case 11:
                _init_$lambda$2 = Braze._init_$lambda$2();
                return _init_$lambda$2;
            case 12:
                subscribeToChangeUserEvents$lambda$0 = Braze.subscribeToChangeUserEvents$lambda$0();
                return subscribeToChangeUserEvents$lambda$0;
            case 13:
                subscribeToChangeUserEvents$lambda$2 = Braze.subscribeToChangeUserEvents$lambda$2();
                return subscribeToChangeUserEvents$lambda$2;
            case 14:
                subscribeToContentCardsUpdates$lambda$3$0 = Braze.subscribeToContentCardsUpdates$lambda$3$0();
                return subscribeToContentCardsUpdates$lambda$3$0;
            case 15:
                subscribeToContentCardsUpdates$lambda$3$1 = Braze.subscribeToContentCardsUpdates$lambda$3$1();
                return subscribeToContentCardsUpdates$lambda$3$1;
            case 16:
                applyPendingRuntimeConfiguration$lambda$0$0 = Braze.applyPendingRuntimeConfiguration$lambda$0$0();
                return applyPendingRuntimeConfiguration$lambda$0$0;
            case 17:
                applyPendingRuntimeConfiguration$lambda$0$1 = Braze.applyPendingRuntimeConfiguration$lambda$0$1();
                return applyPendingRuntimeConfiguration$lambda$0$1;
            case 18:
                publishError$lambda$0 = Braze.publishError$lambda$0();
                return publishError$lambda$0;
            case 19:
                safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0 = Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0();
                return safeCallFlushDelayedInitPushAnalyticsQueue$lambda$0;
            case 20:
                lambda$3$0 = Braze.lambda$3$0();
                return lambda$3$0;
            case 21:
                lambda$3$10 = Braze.lambda$3$10();
                return lambda$3$10;
            case 22:
                lambda$3$11 = Braze.lambda$3$11();
                return lambda$3$11;
            case 23:
                lambda$3$13 = Braze.lambda$3$13();
                return lambda$3$13;
            case 24:
                lambda$3$14 = Braze.lambda$3$14();
                return lambda$3$14;
            case 25:
                lambda$3$15 = Braze.lambda$3$15();
                return lambda$3$15;
            case 26:
                lambda$3$16 = Braze.lambda$3$16();
                return lambda$3$16;
            case 27:
                lambda$3$17 = Braze.lambda$3$17();
                return lambda$3$17;
            case 28:
                lambda$3$18 = Braze.lambda$3$18();
                return lambda$3$18;
            default:
                configurationProviderSafe$lambda$0 = Braze.getConfigurationProviderSafe$lambda$0();
                return configurationProviderSafe$lambda$0;
        }
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }
}
