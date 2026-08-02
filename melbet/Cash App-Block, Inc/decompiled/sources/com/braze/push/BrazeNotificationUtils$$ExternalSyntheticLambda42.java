package com.braze.push;

import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationFactory;
import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda42 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeNotificationPayload f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda42(BrazeNotificationPayload brazeNotificationPayload, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeNotificationPayload;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String publicVersionIfPresentAndSupported$lambda$0;
        String populateNotificationBuilder$lambda$0;
        String handlePushNotificationPayload$lambda$9;
        int i = this.$r8$classId;
        BrazeNotificationPayload brazeNotificationPayload = this.f$0;
        switch (i) {
            case 0:
                publicVersionIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setPublicVersionIfPresentAndSupported$lambda$0(brazeNotificationPayload);
                return publicVersionIfPresentAndSupported$lambda$0;
            case 1:
                populateNotificationBuilder$lambda$0 = BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$0(brazeNotificationPayload);
                return populateNotificationBuilder$lambda$0;
            default:
                handlePushNotificationPayload$lambda$9 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$9(brazeNotificationPayload);
                return handlePushNotificationPayload$lambda$9;
        }
    }
}
