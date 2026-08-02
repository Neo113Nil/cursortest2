package com.braze;

import com.braze.events.IEventSubscriber;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ IEventSubscriber f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda7(Braze braze, IEventSubscriber iEventSubscriber, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
        this.f$1 = iEventSubscriber;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit subscribeToContentCardsUpdates$lambda$1;
        Unit subscribeToNewInAppMessages$lambda$1;
        Unit subscribeToChangeUserEvents$lambda$1;
        int i = this.$r8$classId;
        IEventSubscriber iEventSubscriber = this.f$1;
        Braze braze = this.f$0;
        switch (i) {
            case 0:
                subscribeToContentCardsUpdates$lambda$1 = Braze.subscribeToContentCardsUpdates$lambda$1(braze, iEventSubscriber);
                return subscribeToContentCardsUpdates$lambda$1;
            case 1:
                subscribeToNewInAppMessages$lambda$1 = Braze.subscribeToNewInAppMessages$lambda$1(braze, iEventSubscriber);
                return subscribeToNewInAppMessages$lambda$1;
            default:
                subscribeToChangeUserEvents$lambda$1 = Braze.subscribeToChangeUserEvents$lambda$1(braze, iEventSubscriber);
                return subscribeToChangeUserEvents$lambda$1;
        }
    }
}
