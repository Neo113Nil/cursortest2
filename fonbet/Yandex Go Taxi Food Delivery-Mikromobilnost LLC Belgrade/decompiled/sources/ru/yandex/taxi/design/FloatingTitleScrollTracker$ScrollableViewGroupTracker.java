package ru.yandex.taxi.design;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import defpackage.xw31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¢\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"ru/yandex/taxi/design/FloatingTitleScrollTracker$ScrollableViewGroupTracker", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewGroup;", "scrollableViewGroup", "<init>", "(Lru/yandex/taxi/design/g;Landroid/view/ViewGroup;)V", "Lzy11;", "init", "()V", "release", "onScrollChanged", "Landroid/view/ViewGroup;", "Landroid/view/View;", "child", "Landroid/view/View;", "Landroid/view/ViewTreeObserver;", "childViewTreeObserver", "Landroid/view/ViewTreeObserver;", "Landroid/graphics/Rect;", "initialPadding", "Landroid/graphics/Rect;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
abstract class FloatingTitleScrollTracker$ScrollableViewGroupTracker implements ViewTreeObserver.OnScrollChangedListener {
    private final View child;
    private ViewTreeObserver childViewTreeObserver;
    private Rect initialPadding;
    private final ViewGroup scrollableViewGroup;
    final /* synthetic */ g this$0;

    public FloatingTitleScrollTracker$ScrollableViewGroupTracker(g gVar, ViewGroup viewGroup) {
        this.this$0 = gVar;
        this.scrollableViewGroup = viewGroup;
        this.child = viewGroup.getChildCount() == 1 ? viewGroup.getChildAt(0) : null;
    }

    public final void init() {
        View view = this.child;
        if (view == null) {
            return;
        }
        Rect h = xw31.h(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.childViewTreeObserver = viewTreeObserver;
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnScrollChangedListener(this);
        }
        this.initialPadding = h;
        Rect rect = new Rect(h);
        rect.top = this.this$0.a.getMeasuredHeight() + h.top;
        xw31.H(view, rect);
        this.scrollableViewGroup.scrollTo(0, 0);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        View view = this.child;
        if (view == null) {
            return;
        }
        int scrollY = this.scrollableViewGroup.getScrollY();
        g gVar = this.this$0;
        int paddingTop = view.getPaddingTop();
        gVar.getClass();
        if (paddingTop > 0) {
            gVar.c(Math.max(0.0f, scrollY < paddingTop ? scrollY / paddingTop : 1.0f));
        } else {
            gVar.c(0.0f);
        }
    }

    public final void release() {
        View view = this.child;
        if (view == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = this.childViewTreeObserver;
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnScrollChangedListener(this);
        }
        this.childViewTreeObserver = null;
        Rect rect = this.initialPadding;
        if (rect != null) {
            xw31.H(view, rect);
        }
    }
}
