package ru.yandex.taxi.widget.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.g2t0;
import defpackage.ny61;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/widget/recycler/SnappyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "e", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Landroidx/recyclerview/widget/RecyclerView$e;", "layout", "Lzy11;", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$e;)V", "velocityX", "velocityY", "fling", "(II)Z", "getFocusedItemIndex", "()I", "g2t0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnappyRecyclerView extends RecyclerView {
    public static final int $stable = 8;

    public /* synthetic */ SnappyRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        RecyclerView.e layoutManager = getLayoutManager();
        int i = 0;
        if (layoutManager == null) {
            return false;
        }
        boolean I = layoutManager.I();
        boolean J = layoutManager.J();
        int minFlingVelocity = getMinFlingVelocity();
        boolean z = (((!I || Math.abs(velocityX) < minFlingVelocity) ? 0 : velocityX) == 0 && ((!J || Math.abs(velocityY) < minFlingVelocity) ? 0 : velocityY) == 0) ? false : true;
        SnappyLinearLayoutManager snappyLinearLayoutManager = (SnappyLinearLayoutManager) ((g2t0) getLayoutManager());
        if (snappyLinearLayoutManager.d0() != 0) {
            if (snappyLinearLayoutManager.J == 0) {
                View c0 = snappyLinearLayoutManager.c0(0);
                if (c0 != null) {
                    i = snappyLinearLayoutManager.h2(velocityX, c0.getLeft(), c0.getWidth(), ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition());
                }
            } else {
                View c02 = snappyLinearLayoutManager.c0(0);
                if (c02 != null) {
                    i = snappyLinearLayoutManager.h2(velocityY, c02.getTop(), c02.getHeight(), ((RecyclerView.LayoutParams) c02.getLayoutParams()).getViewLayoutPosition());
                }
            }
        }
        super.smoothScrollToPosition(i);
        return z;
    }

    public final int getFocusedItemIndex() {
        if (getChildCount() == 0) {
            return -1;
        }
        SnappyLinearLayoutManager snappyLinearLayoutManager = (SnappyLinearLayoutManager) ((g2t0) getLayoutManager());
        int d0 = snappyLinearLayoutManager.d0();
        for (int i = 0; i < d0; i++) {
            View c0 = snappyLinearLayoutManager.c0(i);
            if (c0 != null && c0.getLeft() <= 0) {
                if (c0.getWidth() + c0.getLeft() >= 0) {
                    return ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
                }
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e) {
        if (getAlpha() < 1.0f) {
            return true;
        }
        return super.onInterceptTouchEvent(e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent e) {
        View c0;
        int i = 0;
        if (getAlpha() < 1.0f) {
            return false;
        }
        if (getScrollState() == 0 && getChildCount() > 0) {
            float x = e.getX();
            if (findChildViewUnder(x, e.getY()) == null) {
                return x >= ((float) getChildAt(0).getLeft()) && x <= ((float) getChildAt(getChildCount() - 1).getRight()) && super.onTouchEvent(e);
            }
        }
        boolean onTouchEvent = super.onTouchEvent(e);
        g2t0 g2t0Var = (g2t0) getLayoutManager();
        if ((e.getAction() == 1 || e.getAction() == 3) && getScrollState() == 0) {
            SnappyLinearLayoutManager snappyLinearLayoutManager = (SnappyLinearLayoutManager) g2t0Var;
            if (snappyLinearLayoutManager.d0() != 0 && (c0 = snappyLinearLayoutManager.c0(0)) != null) {
                i = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
                if ((snappyLinearLayoutManager.J == 0 && Math.abs(c0.getLeft()) > c0.getWidth() / 2) || (snappyLinearLayoutManager.J == 1 && Math.abs(c0.getTop()) > c0.getHeight() / 2)) {
                    i++;
                }
            }
            smoothScrollToPosition(i);
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.e layout) {
        if (isInEditMode()) {
            return;
        }
        if (layout instanceof g2t0) {
            super.setLayoutManager(layout);
        } else {
            ny61.g("SnappyRecyclerView can have only ISnappyLayoutManager");
        }
    }

    public SnappyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SnappyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setItemAnimator(null);
    }

    public SnappyRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }
}
