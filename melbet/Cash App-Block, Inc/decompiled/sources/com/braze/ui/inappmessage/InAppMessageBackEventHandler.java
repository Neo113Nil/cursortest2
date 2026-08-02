package com.braze.ui.inappmessage;

import android.app.Activity;
import android.os.Build;
import android.window.OnBackAnimationCallback;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageBackEventHandler;", "", "activity", "Landroid/app/Activity;", "inAppMessageView", "Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "<init>", "(Landroid/app/Activity;Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "backAnimationCallback", "Landroid/window/OnBackAnimationCallback;", "unregister", "", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class InAppMessageBackEventHandler {
    private WeakReference<Activity> activityRef;
    private OnBackAnimationCallback backAnimationCallback;
    private final IInAppMessageBackEventListener inAppMessageView;

    public InAppMessageBackEventHandler(Activity activity, IInAppMessageBackEventListener iInAppMessageBackEventListener) {
        activity.getClass();
        this.inAppMessageView = iInAppMessageBackEventListener;
        if (Build.VERSION.SDK_INT < 34 || !BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            return;
        }
        InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1 inAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1 = new InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1(this);
        this.backAnimationCallback = inAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1;
        this.activityRef = new WeakReference<>(activity);
        activity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, inAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1);
    }

    public void unregister() {
        WeakReference<Activity> weakReference = this.activityRef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        OnBackAnimationCallback onBackAnimationCallback = this.backAnimationCallback;
        if (activity != null && onBackAnimationCallback != null && Build.VERSION.SDK_INT >= 34) {
            activity.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackAnimationCallback);
        }
        this.backAnimationCallback = null;
        this.activityRef = null;
    }
}
