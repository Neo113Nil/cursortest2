package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class DividerItemDecoration extends RecyclerView.ItemDecoration {
    public static final int[] ATTRS = {R.attr.listDivider};
    public final Rect mBounds = new Rect();
    public Drawable mDivider;
    public final int mOrientation;

    public DividerItemDecoration(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.mDivider = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.mOrientation = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Drawable drawable = this.mDivider;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.mOrientation == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.mLayout == null || this.mDivider == null) {
            return;
        }
        int i3 = 0;
        int i4 = this.mOrientation;
        Rect rect = this.mBounds;
        if (i4 == 1) {
            canvas.save();
            if (recyclerView.mClipToPadding) {
                i2 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i3 < childCount) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.getDecoratedBoundsWithMarginsInt(rect, childAt);
                int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.mDivider.setBounds(i2, round - this.mDivider.getIntrinsicHeight(), width, round);
                this.mDivider.draw(canvas);
                i3++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.mClipToPadding) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i3 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i3);
            recyclerView.mLayout.getDecoratedBoundsWithMargins(rect, childAt2);
            int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.mDivider.setBounds(round2 - this.mDivider.getIntrinsicWidth(), i, round2, height);
            this.mDivider.draw(canvas);
            i3++;
        }
        canvas.restore();
    }
}
