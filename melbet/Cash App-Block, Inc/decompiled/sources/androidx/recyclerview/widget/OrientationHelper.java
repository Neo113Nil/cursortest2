package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class OrientationHelper {
    public final RecyclerView.LayoutManager mLayoutManager;
    public int mLastTotalSpace = PKIFailureInfo.systemUnavail;
    public final Rect mTmpRect = new Rect();

    /* renamed from: androidx.recyclerview.widget.OrientationHelper$1, reason: invalid class name */
    public final class AnonymousClass1 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedEnd(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mLayoutManager.getClass();
            return RecyclerView.LayoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedMeasurement(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mLayoutManager.getClass();
            return RecyclerView.LayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedMeasurementInOther(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mLayoutManager.getClass();
            return RecyclerView.LayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedStart(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mLayoutManager.getClass();
            return RecyclerView.LayoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEnd() {
            return this.mLayoutManager.mWidth;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEndAfterPadding() {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            return layoutManager.mWidth - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEndPadding() {
            return this.mLayoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getMode() {
            return this.mLayoutManager.mWidthMode;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getModeInOther() {
            return this.mLayoutManager.mHeightMode;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getStartAfterPadding() {
            return this.mLayoutManager.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTotalSpace() {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            return (layoutManager.mWidth - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTransformedEndWithDecoration(View view) {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            Rect rect = this.mTmpRect;
            layoutManager.getTransformedBoundingBox(rect, view);
            return rect.right;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTransformedStartWithDecoration(View view) {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            Rect rect = this.mTmpRect;
            layoutManager.getTransformedBoundingBox(rect, view);
            return rect.left;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void offsetChildren(int i) {
            this.mLayoutManager.offsetChildrenHorizontal(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.OrientationHelper$2, reason: invalid class name */
    public final class AnonymousClass2 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedEnd(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mLayoutManager.getClass();
            return RecyclerView.LayoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedMeasurement(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mLayoutManager.getClass();
            return RecyclerView.LayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedMeasurementInOther(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mLayoutManager.getClass();
            return RecyclerView.LayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedStart(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mLayoutManager.getClass();
            return RecyclerView.LayoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEnd() {
            return this.mLayoutManager.mHeight;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEndAfterPadding() {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            return layoutManager.mHeight - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEndPadding() {
            return this.mLayoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getMode() {
            return this.mLayoutManager.mHeightMode;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getModeInOther() {
            return this.mLayoutManager.mWidthMode;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getStartAfterPadding() {
            return this.mLayoutManager.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTotalSpace() {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            return (layoutManager.mHeight - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTransformedEndWithDecoration(View view) {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            Rect rect = this.mTmpRect;
            layoutManager.getTransformedBoundingBox(rect, view);
            return rect.bottom;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTransformedStartWithDecoration(View view) {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            Rect rect = this.mTmpRect;
            layoutManager.getTransformedBoundingBox(rect, view);
            return rect.top;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void offsetChildren(int i) {
            this.mLayoutManager.offsetChildrenVertical(i);
        }
    }

    public OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.mLayoutManager = layoutManager;
    }

    public static OrientationHelper createOrientationHelper(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return new AnonymousClass1(layoutManager);
        }
        if (i == 1) {
            return new AnonymousClass2(layoutManager);
        }
        a$$ExternalSyntheticBUOutline0.m$3("invalid orientation");
        return null;
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public abstract int getMode();

    public abstract int getModeInOther();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public abstract int getTransformedEndWithDecoration(View view);

    public abstract int getTransformedStartWithDecoration(View view);

    public abstract void offsetChildren(int i);
}
