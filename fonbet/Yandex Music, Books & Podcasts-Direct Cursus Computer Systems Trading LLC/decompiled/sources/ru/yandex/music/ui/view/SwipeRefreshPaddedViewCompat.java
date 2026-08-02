package ru.yandex.music.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import defpackage.xq0;

/* loaded from: classes6.dex */
public class SwipeRefreshPaddedViewCompat extends SwipeRefreshLayout {
    public AbsListView L;
    public RecyclerView v0;
    public int w0;

    public SwipeRefreshPaddedViewCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = -1;
    }

    private AbsListView getListView() {
        AbsListView absListView;
        if (this.L == null) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    absListView = null;
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt instanceof AbsListView) {
                    absListView = (AbsListView) childAt;
                    break;
                }
                i++;
            }
            this.L = absListView;
        }
        return this.L;
    }

    private RecyclerView getRecyclerView() {
        RecyclerView recyclerView;
        if (this.v0 == null) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    recyclerView = null;
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt instanceof RecyclerView) {
                    recyclerView = (RecyclerView) childAt;
                    break;
                }
                i++;
            }
            this.v0 = recyclerView;
        }
        return this.v0;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L = null;
        this.v0 = null;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getListView() == null && getRecyclerView() == null) {
            xq0.q("Unable to find ListView or RecyclerView inside Layout");
            return;
        }
        AbsListView absListView = this.L;
        int paddingTop = absListView != null ? absListView.getPaddingTop() : this.v0.getPaddingTop();
        if (this.w0 != paddingTop) {
            this.w0 = paddingTop;
            this.x = ((int) (getResources().getDisplayMetrics().density * 64.0f)) + this.w0;
            this.t.invalidate();
        }
    }

    public SwipeRefreshPaddedViewCompat(Context context) {
        this(context, null);
    }
}
