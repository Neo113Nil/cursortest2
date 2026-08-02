package com.braze.push;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda14 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Integer f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda14(int i, Integer num) {
        this.$r8$classId = i;
        this.f$0 = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Integer num = this.f$0;
        switch (i) {
            case 0:
                return BrazeNotificationUtils.getNotificationId$lambda$0(num);
            case 1:
                return BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$1(num);
            default:
                return BrazeNotificationUtils.getNotificationPriority$lambda$0$0(num);
        }
    }
}
