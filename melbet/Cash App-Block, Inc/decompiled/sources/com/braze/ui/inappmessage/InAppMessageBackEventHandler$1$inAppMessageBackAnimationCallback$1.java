package com.braze.ui.inappmessage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/braze/ui/inappmessage/InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1", "Landroid/window/OnBackAnimationCallback;", "onBackInvoked", "", "onBackStarted", "backEvent", "Landroid/window/BackEvent;", "onBackProgressed", "onBackCancelled", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1 implements OnBackAnimationCallback {
    final /* synthetic */ InAppMessageBackEventHandler this$0;

    public InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1(InAppMessageBackEventHandler inAppMessageBackEventHandler) {
        this.this$0 = inAppMessageBackEventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackCancelled$lambda$3() {
        return "Back button intercepted by in-app message back animation callback, back event cancelled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackInvoked$lambda$0() {
        return "Back button intercepted by in-app message back animation callback, closing in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackProgressed$lambda$2() {
        return "Back button intercepted by in-app message back animation callback, back event in progress.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackStarted$lambda$1() {
        return "Back button intercepted by in-app message back animation callback, back event started.";
    }

    public void onBackCancelled() {
        IInAppMessageBackEventListener iInAppMessageBackEventListener;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(2), 7, (Object) null);
        super.onBackCancelled();
        iInAppMessageBackEventListener = this.this$0.inAppMessageView;
        if (iInAppMessageBackEventListener != null) {
            iInAppMessageBackEventListener.onBackCancelled();
        }
    }

    public void onBackInvoked() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(29), 7, (Object) null);
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
    }

    public void onBackProgressed(BackEvent backEvent) {
        IInAppMessageBackEventListener iInAppMessageBackEventListener;
        backEvent.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(1), 7, (Object) null);
        super.onBackProgressed(backEvent);
        iInAppMessageBackEventListener = this.this$0.inAppMessageView;
        if (iInAppMessageBackEventListener != null) {
            iInAppMessageBackEventListener.onBackProgressed(backEvent);
        }
    }

    public void onBackStarted(BackEvent backEvent) {
        IInAppMessageBackEventListener iInAppMessageBackEventListener;
        backEvent.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(3), 7, (Object) null);
        super.onBackStarted(backEvent);
        iInAppMessageBackEventListener = this.this$0.inAppMessageView;
        if (iInAppMessageBackEventListener != null) {
            iInAppMessageBackEventListener.onBackStarted(backEvent);
        }
    }
}
