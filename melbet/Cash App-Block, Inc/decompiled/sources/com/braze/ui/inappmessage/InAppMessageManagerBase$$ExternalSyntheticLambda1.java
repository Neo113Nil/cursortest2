package com.braze.ui.inappmessage;

import com.braze.models.inappmessage.IInAppMessage;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class InAppMessageManagerBase$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IInAppMessage f$0;

    public /* synthetic */ InAppMessageManagerBase$$ExternalSyntheticLambda1(IInAppMessage iInAppMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = iInAppMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String defaultInAppMessageViewFactory$lambda$0;
        String requestDisplayInAppMessage$lambda$9;
        String displayInAppMessage$lambda$0;
        String displayInAppMessage$lambda$13;
        int i = this.$r8$classId;
        IInAppMessage iInAppMessage = this.f$0;
        switch (i) {
            case 0:
                defaultInAppMessageViewFactory$lambda$0 = InAppMessageManagerBase.getDefaultInAppMessageViewFactory$lambda$0(iInAppMessage);
                return defaultInAppMessageViewFactory$lambda$0;
            case 1:
                requestDisplayInAppMessage$lambda$9 = BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$9(iInAppMessage);
                return requestDisplayInAppMessage$lambda$9;
            case 2:
                displayInAppMessage$lambda$0 = BrazeInAppMessageManager.displayInAppMessage$lambda$0(iInAppMessage);
                return displayInAppMessage$lambda$0;
            default:
                displayInAppMessage$lambda$13 = BrazeInAppMessageManager.displayInAppMessage$lambda$13(iInAppMessage);
                return displayInAppMessage$lambda$13;
        }
    }
}
