package com.braze;

import com.braze.events.InAppMessageEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda50 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ InAppMessageEvent f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda50(Braze braze, InAppMessageEvent inAppMessageEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
        this.f$1 = inAppMessageEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit reenqueueInAppMessage$lambda$1;
        Unit retryInAppMessage$lambda$1;
        int i = this.$r8$classId;
        InAppMessageEvent inAppMessageEvent = this.f$1;
        Braze braze = this.f$0;
        switch (i) {
            case 0:
                reenqueueInAppMessage$lambda$1 = Braze.reenqueueInAppMessage$lambda$1(braze, inAppMessageEvent);
                return reenqueueInAppMessage$lambda$1;
            default:
                retryInAppMessage$lambda$1 = Braze.retryInAppMessage$lambda$1(braze, inAppMessageEvent);
                return retryInAppMessage$lambda$1;
        }
    }
}
