package com.braze.ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener;", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener;", "Landroid/view/View;", "view", "", "token", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "callbacks", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$VerticalDismissDirection;", "verticalDismissDirection", "<init>", "(Landroid/view/View;Ljava/lang/Object;Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$VerticalDismissDirection;)V", "(Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$VerticalDismissDirection;)V", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "newTouchListener", "", "setTouchListener", "(Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "touchListener", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "ITouchListener", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener {
    private ITouchListener touchListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "", "onTouchStartedOrContinued", "", "onTouchEnded", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ITouchListener {
        void onTouchEnded();

        void onTouchStartedOrContinued();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks, SwipeDismissTouchListener.VerticalDismissDirection verticalDismissDirection) {
        this(view, null, dismissCallbacks, verticalDismissDirection);
        view.getClass();
        verticalDismissDirection.getClass();
    }

    @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ITouchListener iTouchListener;
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            ITouchListener iTouchListener2 = this.touchListener;
            if (iTouchListener2 != null) {
                iTouchListener2.onTouchStartedOrContinued();
            }
        } else if ((action == 1 || action == 3) && (iTouchListener = this.touchListener) != null) {
            iTouchListener.onTouchEnded();
        }
        return super.onTouch(view, motionEvent);
    }

    public final void setTouchListener(ITouchListener newTouchListener) {
        newTouchListener.getClass();
        this.touchListener = newTouchListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks, SwipeDismissTouchListener.VerticalDismissDirection verticalDismissDirection) {
        super(view, obj, dismissCallbacks, verticalDismissDirection);
        view.getClass();
        verticalDismissDirection.getClass();
    }
}
