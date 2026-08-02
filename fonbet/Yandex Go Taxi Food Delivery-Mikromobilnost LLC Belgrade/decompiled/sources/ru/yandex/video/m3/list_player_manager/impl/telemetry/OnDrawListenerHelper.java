package ru.yandex.video.m3.list_player_manager.impl.telemetry;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/OnDrawListenerHelper;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "observedView", "Landroid/view/ViewTreeObserver$OnDrawListener;", "listener", "<init>", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V", "view", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroid/view/View;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnDrawListenerHelper implements View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    private final ViewTreeObserver.OnDrawListener listener;
    private final View observedView;

    public OnDrawListenerHelper(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.observedView = view;
        this.listener = onDrawListener;
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.observedView.getViewTreeObserver().addOnDrawListener(this.listener);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.observedView.getViewTreeObserver().removeOnDrawListener(this.listener);
    }
}
