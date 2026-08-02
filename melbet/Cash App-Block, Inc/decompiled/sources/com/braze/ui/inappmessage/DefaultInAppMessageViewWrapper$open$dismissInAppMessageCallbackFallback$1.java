package com.braze.ui.inappmessage;

import androidx.activity.OnBackPressedCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 extends OnBackPressedCallback {
    public DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1() {
        super(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleOnBackPressed$lambda$0() {
        return "Fallback Back button intercepted by in-app message";
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(28), 7, (Object) null);
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
    }
}
