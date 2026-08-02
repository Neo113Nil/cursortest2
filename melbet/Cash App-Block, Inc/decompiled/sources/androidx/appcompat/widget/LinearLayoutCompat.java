package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R$styleable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class LinearLayoutCompat extends ViewGroup {
    public boolean mBaselineAligned;
    public int mBaselineAlignedChildIndex;
    public int mBaselineChildTop;
    public Drawable mDivider;
    public int mDividerHeight;
    public int mDividerPadding;
    public int mDividerWidth;
    public int mGravity;
    public int[] mMaxAscent;
    public int[] mMaxDescent;
    public int mOrientation;
    public int mShowDividers;
    public int mTotalLength;
    public boolean mUseLargestChild;
    public float mWeightSum;

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = R$styleable.LinearLayoutCompat;
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArray, i, 0);
        TypedArray typedArray2 = (TypedArray) obtainStyledAttributes.requestAdapter;
        int i2 = typedArray2.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray2.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray2.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = typedArray2.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray2.getInt(3, -1);
        this.mUseLargestChild = typedArray2.getBoolean(7, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(5));
        this.mShowDividers = typedArray2.getInt(8, 0);
        this.mDividerPadding = typedArray2.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public final void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int i3 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                i3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.mTotalLength, 2, i3);
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public final boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.mShowDividers;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.mDivider == null) {
            return;
        }
        int i2 = 0;
        if (this.mOrientation == 1) {
            int childCount = getChildCount();
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                    drawHorizontalDivider(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.mDividerHeight);
                }
                i2++;
            }
            if (hasDividerBeforeChildAt(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                drawHorizontalDivider(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean z = getLayoutDirection() == 1;
        while (i2 < childCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                drawVerticalDivider(canvas, z ? childAt3.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
            i2++;
        }
        if (hasDividerBeforeChildAt(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int m;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int m2;
        int i14 = 8;
        if (this.mOrientation == 1) {
            int paddingLeft = getPaddingLeft();
            int i15 = i3 - i;
            int paddingRight = i15 - getPaddingRight();
            int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
            int childCount = getChildCount();
            int i16 = this.mGravity;
            int i17 = i16 & 112;
            int i18 = 8388615 & i16;
            int paddingTop = i17 != 16 ? i17 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength : JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4 - i2, this.mTotalLength, 2, getPaddingTop());
            int i19 = 0;
            while (i19 < childCount) {
                View childAt = getChildAt(i19);
                if (childAt != null && childAt.getVisibility() != i14) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    int i20 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i20 < 0) {
                        i20 = i18;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection()) & 7;
                    int m3 = absoluteGravity != 1 ? absoluteGravity != 5 ? ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft : (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) layoutParams).rightMargin : (JsonLogicResult$Success$$ExternalSyntheticOutline0.m(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) layoutParams).leftMargin) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    if (hasDividerBeforeChildAt(i19)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i21 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    childAt.layout(m3, i21, measuredWidth + m3, i21 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i21;
                }
                i19++;
                i14 = 8;
            }
            return;
        }
        boolean z2 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i22 = i4 - i2;
        int paddingBottom = i22 - getPaddingBottom();
        int paddingBottom2 = (i22 - paddingTop2) - getPaddingBottom();
        int childCount2 = getChildCount();
        int i23 = this.mGravity;
        int i24 = 8388615 & i23;
        int i25 = i23 & 112;
        boolean z3 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i24, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            m = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength;
            i5 = 1;
        } else {
            i5 = 1;
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3 - i, this.mTotalLength, 2, getPaddingLeft());
        }
        if (z2) {
            i7 = childCount2 - 1;
            i6 = -1;
        } else {
            i6 = i5;
            i7 = 0;
        }
        int i26 = 0;
        while (i26 < childCount2) {
            int i27 = (i6 * i26) + i7;
            View childAt2 = getChildAt(i27);
            if (childAt2 == null) {
                i8 = i7;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i28 = m;
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (z3) {
                        i9 = i6;
                        if (((LinearLayout.LayoutParams) layoutParams2).height != -1) {
                            i10 = childAt2.getBaseline();
                            i11 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                            if (i11 < 0) {
                                i11 = i25;
                            }
                            i12 = i11 & 112;
                            i13 = i26;
                            if (i12 != 16) {
                                m2 = (JsonLogicResult$Success$$ExternalSyntheticOutline0.m(paddingBottom2, measuredHeight2, 2, paddingTop2) + ((LinearLayout.LayoutParams) layoutParams2).topMargin) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                            } else if (i12 == 48) {
                                m2 = ((LinearLayout.LayoutParams) layoutParams2).topMargin + paddingTop2;
                                if (i10 != -1) {
                                    m2 = (iArr[i5] - i10) + m2;
                                }
                            } else if (i12 != 80) {
                                m2 = paddingTop2;
                            } else {
                                m2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                                if (i10 != -1) {
                                    m2 -= iArr2[2] - (childAt2.getMeasuredHeight() - i10);
                                }
                            }
                            int i29 = (!hasDividerBeforeChildAt(i27) ? i28 + this.mDividerWidth : i28) + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                            childAt2.layout(i29, m2, i29 + measuredWidth2, measuredHeight2 + m2);
                            m = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i29;
                            i26 = i13 + 1;
                            i6 = i9;
                            i7 = i8;
                        }
                    } else {
                        i9 = i6;
                    }
                    i10 = -1;
                    i11 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                    if (i11 < 0) {
                    }
                    i12 = i11 & 112;
                    i13 = i26;
                    if (i12 != 16) {
                    }
                    int i292 = (!hasDividerBeforeChildAt(i27) ? i28 + this.mDividerWidth : i28) + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    childAt2.layout(i292, m2, i292 + measuredWidth2, measuredHeight2 + m2);
                    m = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i292;
                    i26 = i13 + 1;
                    i6 = i9;
                    i7 = i8;
                }
            }
            i9 = i6;
            i13 = i26;
            i26 = i13 + 1;
            i6 = i9;
            i7 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int baseline;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        LayoutParams layoutParams;
        int i13;
        int[] iArr2;
        int i14;
        View view;
        int i15;
        boolean z4;
        boolean z5;
        int max;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z6;
        int i24;
        int i25;
        int i26;
        View view2;
        boolean z7;
        boolean z8;
        LinearLayoutCompat linearLayoutCompat = this;
        int i27 = -2;
        int i28 = 0;
        int i29 = 1073741824;
        int i30 = 8;
        if (linearLayoutCompat.mOrientation == 1) {
            linearLayoutCompat.mTotalLength = 0;
            int childCount = linearLayoutCompat.getChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i31 = linearLayoutCompat.mBaselineAlignedChildIndex;
            boolean z9 = linearLayoutCompat.mUseLargestChild;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            boolean z10 = false;
            int i35 = 0;
            boolean z11 = false;
            boolean z12 = true;
            float f = RecyclerView.DECELERATION_RATE;
            int i36 = 0;
            while (i32 < childCount) {
                int i37 = mode;
                View childAt = linearLayoutCompat.getChildAt(i32);
                if (childAt == null) {
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.mTotalLength;
                } else if (childAt.getVisibility() != i30) {
                    if (linearLayoutCompat.hasDividerBeforeChildAt(i32)) {
                        linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                    }
                    LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                    f += f2;
                    if (mode2 == i29 && ((LinearLayout.LayoutParams) layoutParams2).height == 0 && f2 > RecyclerView.DECELERATION_RATE) {
                        int i38 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i38, ((LinearLayout.LayoutParams) layoutParams2).topMargin + i38 + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                        view2 = childAt;
                        i23 = mode2;
                        i24 = i31;
                        z6 = z9;
                        i25 = i32;
                        z10 = true;
                        i26 = i37;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams2).height != 0 || f2 <= RecyclerView.DECELERATION_RATE) {
                            i20 = PKIFailureInfo.systemUnavail;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams2).height = i27;
                            i20 = 0;
                        }
                        if (f == RecyclerView.DECELERATION_RATE) {
                            i21 = i32;
                            i22 = linearLayoutCompat.mTotalLength;
                        } else {
                            i21 = i32;
                            i22 = 0;
                        }
                        i23 = mode2;
                        z6 = z9;
                        i24 = i31;
                        i25 = i21;
                        i26 = i37;
                        linearLayoutCompat.measureChildWithMargins(childAt, i, 0, i2, i22);
                        if (i20 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams2).height = i20;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i39 = linearLayoutCompat.mTotalLength;
                        view2 = childAt;
                        linearLayoutCompat.mTotalLength = Math.max(i39, i39 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                        if (z6) {
                            i36 = Math.max(measuredHeight, i36);
                        }
                    }
                    if (i24 >= 0 && i24 == i25 + 1) {
                        linearLayoutCompat.mBaselineChildTop = linearLayoutCompat.mTotalLength;
                    }
                    if (i25 < i24 && ((LinearLayout.LayoutParams) layoutParams2).weight > RecyclerView.DECELERATION_RATE) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        return;
                    }
                    if (i26 == 1073741824 || ((LinearLayout.LayoutParams) layoutParams2).width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                        z11 = true;
                    }
                    int i40 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i40;
                    i28 = Math.max(i28, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z13 = z7;
                    int combineMeasuredStates = View.combineMeasuredStates(i35, measuredState);
                    if (z12) {
                        i35 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) layoutParams2).width == -1) {
                            z8 = true;
                            if (((LinearLayout.LayoutParams) layoutParams2).weight <= RecyclerView.DECELERATION_RATE) {
                                if (!z13) {
                                    i40 = measuredWidth;
                                }
                                i34 = Math.max(i34, i40);
                            } else {
                                if (!z13) {
                                    i40 = measuredWidth;
                                }
                                i33 = Math.max(i33, i40);
                            }
                            z12 = z8;
                            i32 = i25 + 1;
                            i31 = i24;
                            mode = i26;
                            z9 = z6;
                            mode2 = i23;
                            i27 = -2;
                            i29 = 1073741824;
                            i30 = 8;
                        }
                    } else {
                        i35 = combineMeasuredStates;
                    }
                    z8 = false;
                    if (((LinearLayout.LayoutParams) layoutParams2).weight <= RecyclerView.DECELERATION_RATE) {
                    }
                    z12 = z8;
                    i32 = i25 + 1;
                    i31 = i24;
                    mode = i26;
                    z9 = z6;
                    mode2 = i23;
                    i27 = -2;
                    i29 = 1073741824;
                    i30 = 8;
                }
                i23 = mode2;
                i24 = i31;
                z6 = z9;
                i25 = i32;
                i26 = i37;
                i32 = i25 + 1;
                i31 = i24;
                mode = i26;
                z9 = z6;
                mode2 = i23;
                i27 = -2;
                i29 = 1073741824;
                i30 = 8;
            }
            int i41 = mode;
            int i42 = mode2;
            boolean z14 = z9;
            int i43 = i35;
            int i44 = i2;
            if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(childCount)) {
                linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
            }
            if (z14 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                linearLayoutCompat.mTotalLength = 0;
                for (int i45 = 0; i45 < childCount; i45++) {
                    View childAt2 = linearLayoutCompat.getChildAt(i45);
                    if (childAt2 == null) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.mTotalLength;
                    } else if (childAt2.getVisibility() != 8) {
                        LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                        int i46 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i46, i46 + i36 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                    }
                }
            }
            int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
            linearLayoutCompat.mTotalLength = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (resolveSizeAndState & 16777215) - linearLayoutCompat.mTotalLength;
            if (z10 || (i47 != 0 && f > RecyclerView.DECELERATION_RATE)) {
                float f3 = linearLayoutCompat.mWeightSum;
                if (f3 > RecyclerView.DECELERATION_RATE) {
                    f = f3;
                }
                linearLayoutCompat.mTotalLength = 0;
                int i48 = i43;
                int i49 = 0;
                while (i49 < childCount) {
                    View childAt3 = linearLayoutCompat.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i17 = i49;
                    } else {
                        LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) layoutParams4).weight;
                        if (f4 > RecyclerView.DECELERATION_RATE) {
                            int i50 = (int) ((i47 * f4) / f);
                            f -= f4;
                            i47 -= i50;
                            i17 = i49;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin, ((LinearLayout.LayoutParams) layoutParams4).width);
                            if (((LinearLayout.LayoutParams) layoutParams4).height == 0) {
                                i19 = 1073741824;
                                if (i42 == 1073741824) {
                                    if (i50 <= 0) {
                                        i50 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                                    i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i19 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i50;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i19));
                            i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                        } else {
                            i17 = i49;
                        }
                        int i51 = ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        i28 = Math.max(i28, measuredWidth2);
                        if (i41 != 1073741824) {
                            i18 = -1;
                            if (((LinearLayout.LayoutParams) layoutParams4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i18 = -1;
                        }
                        i33 = Math.max(i33, measuredWidth2);
                        boolean z15 = z12 && ((LinearLayout.LayoutParams) layoutParams4).width == i18;
                        int i52 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) layoutParams4).topMargin + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin);
                        z12 = z15;
                    }
                    i49 = i17 + 1;
                }
                linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                i43 = i48;
            } else {
                i33 = Math.max(i33, i34);
                if (z14 && i42 != 1073741824) {
                    for (int i53 = 0; i53 < childCount; i53++) {
                        View childAt4 = linearLayoutCompat.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt4.getLayoutParams())).weight > RecyclerView.DECELERATION_RATE) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                        }
                    }
                }
            }
            if (z12 || i41 == 1073741824) {
                i33 = i28;
            }
            linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + i33, linearLayoutCompat.getSuggestedMinimumWidth()), i, i43), resolveSizeAndState);
            if (z11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < childCount) {
                    View childAt5 = linearLayoutCompat.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        LayoutParams layoutParams5 = (LayoutParams) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) layoutParams5).width == -1) {
                            int i55 = ((LinearLayout.LayoutParams) layoutParams5).height;
                            ((LinearLayout.LayoutParams) layoutParams5).height = childAt5.getMeasuredHeight();
                            linearLayoutCompat.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i44, 0);
                            ((LinearLayout.LayoutParams) layoutParams5).height = i55;
                        }
                    }
                    i54++;
                    i44 = i2;
                }
                return;
            }
            return;
        }
        int i56 = i;
        linearLayoutCompat.mTotalLength = 0;
        int childCount2 = linearLayoutCompat.getChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (linearLayoutCompat.mMaxAscent == null || linearLayoutCompat.mMaxDescent == null) {
            linearLayoutCompat.mMaxAscent = new int[4];
            linearLayoutCompat.mMaxDescent = new int[4];
        }
        int[] iArr3 = linearLayoutCompat.mMaxAscent;
        int[] iArr4 = linearLayoutCompat.mMaxDescent;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = linearLayoutCompat.mBaselineAligned;
        boolean z17 = linearLayoutCompat.mUseLargestChild;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i57 < childCount2) {
            char c2 = c;
            View childAt6 = linearLayoutCompat.getChildAt(i57);
            if (childAt6 == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.mTotalLength;
                i12 = i57;
                i16 = i59;
                iArr2 = iArr3;
                iArr = iArr4;
                z2 = z16;
                z3 = z17;
            } else {
                int i63 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i;
                    i12 = i57;
                    i16 = i59;
                    iArr = iArr4;
                    z2 = z16;
                    z3 = z17;
                    i58 = i63;
                    iArr2 = iArr3;
                } else {
                    if (linearLayoutCompat.hasDividerBeforeChildAt(i57)) {
                        linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
                    }
                    LayoutParams layoutParams6 = (LayoutParams) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) layoutParams6).weight;
                    f5 += f6;
                    int i64 = i57;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams6).width == 0 && f6 > RecyclerView.DECELERATION_RATE) {
                        int i65 = linearLayoutCompat.mTotalLength;
                        int i66 = ((LinearLayout.LayoutParams) layoutParams6).leftMargin;
                        if (z18) {
                            linearLayoutCompat.mTotalLength = i66 + ((LinearLayout.LayoutParams) layoutParams6).rightMargin + i65;
                        } else {
                            linearLayoutCompat.mTotalLength = Math.max(i65, i65 + i66 + ((LinearLayout.LayoutParams) layoutParams6).rightMargin);
                        }
                        if (z16) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i13 = i63;
                            i12 = i64;
                            layoutParams = layoutParams6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i14 = i59;
                            i11 = i60;
                        } else {
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            z21 = true;
                            i13 = i63;
                            i12 = i64;
                            i15 = 1073741824;
                            layoutParams = layoutParams6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i14 = i59;
                            i11 = i60;
                            if (mode4 == i15 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
                                z4 = true;
                                z20 = true;
                            } else {
                                z4 = false;
                            }
                            int i67 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i67;
                            i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i68 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                                    if (i68 < 0) {
                                        i68 = linearLayoutCompat.mGravity;
                                    }
                                    int i69 = (((i68 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i69] = Math.max(iArr2[i69], baseline2);
                                    iArr[i69] = Math.max(iArr[i69], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i13, measuredHeight3);
                            boolean z22 = !z19 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                            if (((LinearLayout.LayoutParams) layoutParams).weight <= RecyclerView.DECELERATION_RATE) {
                                if (!z5) {
                                    i67 = measuredHeight3;
                                }
                                i60 = Math.max(i11, i67);
                                max = i14;
                            } else {
                                if (!z5) {
                                    i67 = measuredHeight3;
                                }
                                max = Math.max(i14, i67);
                                i60 = i11;
                            }
                            int i70 = max;
                            i58 = max2;
                            i16 = i70;
                            z19 = z22;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams6).width != 0 || f6 <= RecyclerView.DECELERATION_RATE) {
                            i10 = PKIFailureInfo.systemUnavail;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams6).width = -2;
                            i10 = 0;
                        }
                        iArr = iArr4;
                        i11 = i60;
                        i12 = i64;
                        z2 = z16;
                        z3 = z17;
                        int i71 = i10;
                        layoutParams = layoutParams6;
                        i13 = i63;
                        i56 = i;
                        iArr2 = iArr3;
                        i14 = i59;
                        linearLayoutCompat.measureChildWithMargins(childAt6, i56, f5 == RecyclerView.DECELERATION_RATE ? linearLayoutCompat.mTotalLength : 0, i2, 0);
                        if (i71 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams).width = i71;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i72 = linearLayoutCompat.mTotalLength;
                        int i73 = ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        if (z18) {
                            view = childAt6;
                            linearLayoutCompat.mTotalLength = i73 + measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i72;
                        } else {
                            view = childAt6;
                            linearLayoutCompat.mTotalLength = Math.max(i72, i72 + measuredWidth3 + i73 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z3) {
                            i61 = Math.max(measuredWidth3, i61);
                        }
                    }
                    i15 = 1073741824;
                    if (mode4 == i15) {
                    }
                    z4 = false;
                    int i672 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i672;
                    i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                    if (z2) {
                    }
                    int max22 = Math.max(i13, measuredHeight32);
                    if (z19) {
                    }
                    if (((LinearLayout.LayoutParams) layoutParams).weight <= RecyclerView.DECELERATION_RATE) {
                    }
                    int i702 = max;
                    i58 = max22;
                    i16 = i702;
                    z19 = z22;
                }
            }
            i59 = i16;
            i57 = i12 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z2;
            z17 = z3;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z23 = z16;
        boolean z24 = z17;
        int i74 = i58;
        int i75 = i59;
        int i76 = i60;
        if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(childCount2)) {
            linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
        }
        int i77 = iArr5[1];
        int max3 = (i77 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i74 : Math.max(i74, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i77, iArr5[c3]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            linearLayoutCompat.mTotalLength = 0;
            for (int i78 = 0; i78 < childCount2; i78++) {
                View childAt7 = linearLayoutCompat.getChildAt(i78);
                if (childAt7 == null) {
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.mTotalLength;
                } else if (childAt7.getVisibility() != 8) {
                    LayoutParams layoutParams7 = (LayoutParams) childAt7.getLayoutParams();
                    int i79 = linearLayoutCompat.mTotalLength;
                    if (z18) {
                        linearLayoutCompat.mTotalLength = ((LinearLayout.LayoutParams) layoutParams7).leftMargin + i61 + ((LinearLayout.LayoutParams) layoutParams7).rightMargin + i79;
                    } else {
                        linearLayoutCompat.mTotalLength = Math.max(i79, i79 + i61 + ((LinearLayout.LayoutParams) layoutParams7).leftMargin + ((LinearLayout.LayoutParams) layoutParams7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
        linearLayoutCompat.mTotalLength = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i56, 0);
        int i80 = (resolveSizeAndState2 & 16777215) - linearLayoutCompat.mTotalLength;
        if (z21 || (i80 != 0 && f5 > RecyclerView.DECELERATION_RATE)) {
            float f7 = linearLayoutCompat.mWeightSum;
            if (f7 > RecyclerView.DECELERATION_RATE) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            linearLayoutCompat.mTotalLength = 0;
            max3 = -1;
            int i81 = 0;
            while (i81 < childCount2) {
                View childAt8 = linearLayoutCompat.getChildAt(i81);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i7 = resolveSizeAndState2;
                } else {
                    LayoutParams layoutParams8 = (LayoutParams) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) layoutParams8).weight;
                    if (f8 > RecyclerView.DECELERATION_RATE) {
                        int i82 = (int) ((i80 * f8) / f5);
                        f5 -= f8;
                        i80 -= i82;
                        i7 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams8).topMargin + ((LinearLayout.LayoutParams) layoutParams8).bottomMargin, ((LinearLayout.LayoutParams) layoutParams8).height);
                        if (((LinearLayout.LayoutParams) layoutParams8).width == 0) {
                            i9 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i82 <= 0) {
                                    i82 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i82, 1073741824), childMeasureSpec2);
                                i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i9 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i82;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i9), childMeasureSpec2);
                        i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i7 = resolveSizeAndState2;
                    }
                    int i83 = linearLayoutCompat.mTotalLength;
                    if (z18) {
                        linearLayoutCompat.mTotalLength = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams8).leftMargin + ((LinearLayout.LayoutParams) layoutParams8).rightMargin + i83;
                    } else {
                        linearLayoutCompat.mTotalLength = Math.max(i83, childAt8.getMeasuredWidth() + i83 + ((LinearLayout.LayoutParams) layoutParams8).leftMargin + ((LinearLayout.LayoutParams) layoutParams8).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams8).height == -1;
                    int i84 = ((LinearLayout.LayoutParams) layoutParams8).topMargin + ((LinearLayout.LayoutParams) layoutParams8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i84;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z25) {
                        i84 = measuredHeight4;
                    }
                    int max4 = Math.max(i75, i84);
                    if (z19) {
                        i8 = -1;
                        if (((LinearLayout.LayoutParams) layoutParams8).height == -1) {
                            z = true;
                            if (!z23 && (baseline = childAt8.getBaseline()) != i8) {
                                int i85 = ((LinearLayout.LayoutParams) layoutParams8).gravity;
                                if (i85 < 0) {
                                    i85 = linearLayoutCompat.mGravity;
                                }
                                int i86 = (((i85 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i86] = Math.max(iArr5[i86], baseline);
                                iArr6[i86] = Math.max(iArr6[i86], measuredHeight4 - baseline);
                            }
                            z19 = z;
                            i75 = max4;
                        }
                    } else {
                        i8 = -1;
                    }
                    z = false;
                    if (!z23) {
                    }
                    z19 = z;
                    i75 = max4;
                }
                i81++;
                resolveSizeAndState2 = i7;
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
            int i87 = iArr5[1];
            if (i87 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i87, iArr5[c3]))));
            }
            i6 = i75;
        } else {
            i6 = Math.max(i75, i76);
            if (z24 && mode3 != 1073741824) {
                for (int i88 = 0; i88 < childCount2; i88++) {
                    View childAt9 = linearLayoutCompat.getChildAt(i88);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt9.getLayoutParams())).weight > RecyclerView.DECELERATION_RATE) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i61, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            max3 = i6;
        }
        linearLayoutCompat.setMeasuredDimension(i3 | (i62 & i4), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + max3, linearLayoutCompat.getSuggestedMinimumHeight()), i2, i62 << 16));
        if (z20) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
            int i89 = i5;
            while (i89 < childCount2) {
                View childAt10 = linearLayoutCompat.getChildAt(i89);
                if (childAt10.getVisibility() != 8) {
                    LayoutParams layoutParams9 = (LayoutParams) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams9).height == -1) {
                        int i90 = ((LinearLayout.LayoutParams) layoutParams9).width;
                        ((LinearLayout.LayoutParams) layoutParams9).width = childAt10.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(childAt10, i56, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) layoutParams9).width = i90;
                    }
                }
                i89++;
                linearLayoutCompat = this;
                i56 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            Mod$$ExternalSyntheticBUOutline0.m("base aligned child index out of range (0, ", getChildCount(), ")");
        } else {
            this.mBaselineAlignedChildIndex = i;
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(RecyclerView.DECELERATION_RATE, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }
}
