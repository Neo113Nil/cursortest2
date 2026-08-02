package ru.yandex.taxi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.em2;
import defpackage.l7s0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/widget/AnyTouchCatcherFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "hasAtLeastOneCaughtTouch", "()Z", "Lem2;", "listener", "Lzy11;", "setAnyTouchCatcherListener", "(Lem2;)V", "Z", "anyTouchCatcherListener", "Lem2;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnyTouchCatcherFrameLayout extends FrameLayout {
    public static final int $stable = 8;
    private em2 anyTouchCatcherListener;
    private boolean hasAtLeastOneCaughtTouch;

    public /* synthetic */ AnyTouchCatcherFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: hasAtLeastOneCaughtTouch, reason: from getter */
    public final boolean getHasAtLeastOneCaughtTouch() {
        return this.hasAtLeastOneCaughtTouch;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        this.hasAtLeastOneCaughtTouch = true;
        em2 em2Var = this.anyTouchCatcherListener;
        if (em2Var != null) {
            l7s0 l7s0Var = (l7s0) em2Var;
            ((ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c) l7s0Var.a).a.C.a.a = true;
            ((ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c) l7s0Var.a).i.a = true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void setAnyTouchCatcherListener(em2 listener) {
        this.anyTouchCatcherListener = listener;
    }

    public AnyTouchCatcherFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AnyTouchCatcherFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnyTouchCatcherFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
