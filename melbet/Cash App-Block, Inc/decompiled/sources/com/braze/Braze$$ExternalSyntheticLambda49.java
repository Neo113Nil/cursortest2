package com.braze;

import com.braze.events.InAppMessageEvent;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda49 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InAppMessageEvent f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda49(InAppMessageEvent inAppMessageEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = inAppMessageEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String reenqueueInAppMessage$lambda$0;
        String retryInAppMessage$lambda$0;
        int i = this.$r8$classId;
        InAppMessageEvent inAppMessageEvent = this.f$0;
        switch (i) {
            case 0:
                reenqueueInAppMessage$lambda$0 = Braze.reenqueueInAppMessage$lambda$0(inAppMessageEvent);
                return reenqueueInAppMessage$lambda$0;
            default:
                retryInAppMessage$lambda$0 = Braze.retryInAppMessage$lambda$0(inAppMessageEvent);
                return retryInAppMessage$lambda$0;
        }
    }
}
