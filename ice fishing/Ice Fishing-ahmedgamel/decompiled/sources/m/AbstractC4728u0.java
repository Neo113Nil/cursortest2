package m;

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
import g.AbstractC4528a;

/* renamed from: m.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4728u0 extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public boolean f39309A;

    /* renamed from: B, reason: collision with root package name */
    public int[] f39310B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f39311C;

    /* renamed from: D, reason: collision with root package name */
    public Drawable f39312D;

    /* renamed from: E, reason: collision with root package name */
    public int f39313E;

    /* renamed from: F, reason: collision with root package name */
    public int f39314F;

    /* renamed from: G, reason: collision with root package name */
    public int f39315G;

    /* renamed from: H, reason: collision with root package name */
    public int f39316H;

    /* renamed from: n, reason: collision with root package name */
    public boolean f39317n;

    /* renamed from: u, reason: collision with root package name */
    public int f39318u;

    /* renamed from: v, reason: collision with root package name */
    public int f39319v;

    /* renamed from: w, reason: collision with root package name */
    public int f39320w;

    /* renamed from: x, reason: collision with root package name */
    public int f39321x;

    /* renamed from: y, reason: collision with root package name */
    public int f39322y;

    /* renamed from: z, reason: collision with root package name */
    public float f39323z;

    public AbstractC4728u0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f39317n = true;
        this.f39318u = -1;
        this.f39319v = 0;
        this.f39321x = 8388659;
        int[] iArr = AbstractC4528a.f37563o;
        l4.g s9 = l4.g.s(context, attributeSet, iArr, 0);
        O.X.n(this, context, iArr, attributeSet, (TypedArray) s9.f38917v, 0);
        TypedArray typedArray = (TypedArray) s9.f38917v;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z6 = typedArray.getBoolean(2, true);
        if (!z6) {
            setBaselineAligned(z6);
        }
        this.f39323z = typedArray.getFloat(4, -1.0f);
        this.f39318u = typedArray.getInt(3, -1);
        this.f39309A = typedArray.getBoolean(7, false);
        setDividerDrawable(s9.i(5));
        this.f39315G = typedArray.getInt(8, 0);
        this.f39316H = typedArray.getDimensionPixelSize(6, 0);
        s9.t();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4726t0;
    }

    public final void d(Canvas canvas, int i) {
        this.f39312D.setBounds(getPaddingLeft() + this.f39316H, i, (getWidth() - getPaddingRight()) - this.f39316H, this.f39314F + i);
        this.f39312D.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f39312D.setBounds(i, getPaddingTop() + this.f39316H, this.f39313E + i, (getHeight() - getPaddingBottom()) - this.f39316H);
        this.f39312D.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4726t0 generateDefaultLayoutParams() {
        int i = this.f39320w;
        if (i == 0) {
            return new C4726t0(-2, -2);
        }
        if (i == 1) {
            return new C4726t0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4726t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C4726t0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f39318u < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f39318u;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f39318u == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.f39319v;
        if (this.f39320w == 1 && (i = this.f39321x & 112) != 48) {
            if (i == 16) {
                i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f39322y) / 2;
            } else if (i == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f39322y;
            }
        }
        return i6 + ((LinearLayout.LayoutParams) ((C4726t0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f39318u;
    }

    public Drawable getDividerDrawable() {
        return this.f39312D;
    }

    public int getDividerPadding() {
        return this.f39316H;
    }

    public int getDividerWidth() {
        return this.f39313E;
    }

    public int getGravity() {
        return this.f39321x;
    }

    public int getOrientation() {
        return this.f39320w;
    }

    public int getShowDividers() {
        return this.f39315G;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f39323z;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C4726t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4726t0 ? new C4726t0((C4726t0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C4726t0((ViewGroup.MarginLayoutParams) layoutParams) : new C4726t0(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f39315G & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f39315G & 4) != 0;
        }
        if ((this.f39315G & 2) != 0) {
            for (int i4 = i - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
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
        if (this.f39312D == null) {
            return;
        }
        int i4 = 0;
        if (this.f39320w == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && i(i4)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C4726t0) childAt.getLayoutParams())).topMargin) - this.f39314F);
                }
                i4++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f39314F : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C4726t0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z6 = g1.f39217a;
        boolean z9 = getLayoutDirection() == 1;
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i4)) {
                C4726t0 c4726t0 = (C4726t0) childAt3.getLayoutParams();
                e(canvas, z9 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c4726t0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c4726t0).leftMargin) - this.f39313E);
            }
            i4++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C4726t0 c4726t02 = (C4726t0) childAt4.getLayoutParams();
                if (z9) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c4726t02).leftMargin;
                    i = this.f39313E;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c4726t02).rightMargin;
                }
            } else if (z9) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f39313E;
                right = left - i;
            }
            e(canvas, right);
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char c9;
        int i19;
        int i20;
        int i21;
        int i22 = 8;
        char c10 = 2;
        if (this.f39320w == 1) {
            int paddingLeft = getPaddingLeft();
            int i23 = i6 - i;
            int paddingRight = i23 - getPaddingRight();
            int paddingRight2 = (i23 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i24 = this.f39321x;
            int i25 = i24 & 112;
            int i26 = 8388615 & i24;
            int paddingTop = i25 != 16 ? i25 != 80 ? getPaddingTop() : ((getPaddingTop() + i9) - i4) - this.f39322y : getPaddingTop() + (((i9 - i4) - this.f39322y) / 2);
            int i27 = 0;
            while (i27 < virtualChildCount) {
                View childAt = getChildAt(i27);
                if (childAt == null || childAt.getVisibility() == i22) {
                    c9 = c10;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C4726t0 c4726t0 = (C4726t0) childAt.getLayoutParams();
                    c9 = c10;
                    int i28 = ((LinearLayout.LayoutParams) c4726t0).gravity;
                    if (i28 < 0) {
                        i28 = i26;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i28, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i19 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c4726t0).leftMargin;
                        i20 = ((LinearLayout.LayoutParams) c4726t0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i21 = ((LinearLayout.LayoutParams) c4726t0).leftMargin + paddingLeft;
                        if (i(i27)) {
                            paddingTop += this.f39314F;
                        }
                        int i29 = paddingTop + ((LinearLayout.LayoutParams) c4726t0).topMargin;
                        childAt.layout(i21, i29, measuredWidth + i21, i29 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c4726t0).bottomMargin + i29;
                    } else {
                        i19 = paddingRight - measuredWidth;
                        i20 = ((LinearLayout.LayoutParams) c4726t0).rightMargin;
                    }
                    i21 = i19 - i20;
                    if (i(i27)) {
                    }
                    int i292 = paddingTop + ((LinearLayout.LayoutParams) c4726t0).topMargin;
                    childAt.layout(i21, i292, measuredWidth + i21, i292 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c4726t0).bottomMargin + i292;
                }
                i27++;
                c10 = c9;
                i22 = 8;
            }
            return;
        }
        boolean z9 = g1.f39217a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i30 = i9 - i4;
        int paddingBottom = i30 - getPaddingBottom();
        int paddingBottom2 = (i30 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i31 = this.f39321x;
        int i32 = 8388615 & i31;
        int i33 = i31 & 112;
        boolean z11 = this.f39317n;
        int[] iArr = this.f39310B;
        int[] iArr2 = this.f39311C;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i32, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i6) - i) - this.f39322y : getPaddingLeft() + (((i6 - i) - this.f39322y) / 2);
        if (z10) {
            i11 = virtualChildCount2 - 1;
            i10 = -1;
        } else {
            i10 = 1;
            i11 = 0;
        }
        int i34 = 0;
        while (i34 < virtualChildCount2) {
            int i35 = (i10 * i34) + i11;
            View childAt2 = getChildAt(i35);
            if (childAt2 == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C4726t0 c4726t02 = (C4726t0) childAt2.getLayoutParams();
                    int i36 = paddingLeft2;
                    if (z11) {
                        i13 = paddingTop2;
                        if (((LinearLayout.LayoutParams) c4726t02).height != -1) {
                            i14 = childAt2.getBaseline();
                            i15 = ((LinearLayout.LayoutParams) c4726t02).gravity;
                            if (i15 < 0) {
                                i15 = i33;
                            }
                            i16 = i15 & 112;
                            if (i16 == 16) {
                                if (i16 == 48) {
                                    i17 = i13 + ((LinearLayout.LayoutParams) c4726t02).topMargin;
                                    if (i14 != -1) {
                                        i17 = (iArr[1] - i14) + i17;
                                    }
                                } else if (i16 != 80) {
                                    i17 = i13;
                                } else {
                                    i17 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c4726t02).bottomMargin;
                                    if (i14 != -1) {
                                        i18 = iArr2[2] - (childAt2.getMeasuredHeight() - i14);
                                    }
                                }
                                int i37 = (i(i35) ? i36 + this.f39313E : i36) + ((LinearLayout.LayoutParams) c4726t02).leftMargin;
                                childAt2.layout(i37, i17, i37 + measuredWidth2, i17 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c4726t02).rightMargin + i37;
                                i34++;
                                i11 = i12;
                                paddingTop2 = i13;
                            } else {
                                i17 = ((paddingBottom2 - measuredHeight2) / 2) + i13 + ((LinearLayout.LayoutParams) c4726t02).topMargin;
                                i18 = ((LinearLayout.LayoutParams) c4726t02).bottomMargin;
                            }
                            i17 -= i18;
                            int i372 = (i(i35) ? i36 + this.f39313E : i36) + ((LinearLayout.LayoutParams) c4726t02).leftMargin;
                            childAt2.layout(i372, i17, i372 + measuredWidth2, i17 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c4726t02).rightMargin + i372;
                            i34++;
                            i11 = i12;
                            paddingTop2 = i13;
                        }
                    } else {
                        i13 = paddingTop2;
                    }
                    i14 = -1;
                    i15 = ((LinearLayout.LayoutParams) c4726t02).gravity;
                    if (i15 < 0) {
                    }
                    i16 = i15 & 112;
                    if (i16 == 16) {
                    }
                    i17 -= i18;
                    int i3722 = (i(i35) ? i36 + this.f39313E : i36) + ((LinearLayout.LayoutParams) c4726t02).leftMargin;
                    childAt2.layout(i3722, i17, i3722 + measuredWidth2, i17 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c4726t02).rightMargin + i3722;
                    i34++;
                    i11 = i12;
                    paddingTop2 = i13;
                }
            }
            i13 = paddingTop2;
            i34++;
            i11 = i12;
            paddingTop2 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i4) {
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z6;
        int baseline;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        boolean z9;
        boolean z10;
        C4726t0 c4726t0;
        int i18;
        int[] iArr2;
        int i19;
        View view;
        int i20;
        boolean z11;
        boolean z12;
        int max;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z13;
        int i29;
        int i30;
        int i31;
        View view2;
        boolean z14;
        boolean z15;
        AbstractC4728u0 abstractC4728u0 = this;
        int i32 = -2;
        int i33 = 1073741824;
        int i34 = 8;
        int i35 = 0;
        if (abstractC4728u0.f39320w == 1) {
            abstractC4728u0.f39322y = 0;
            int virtualChildCount = abstractC4728u0.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            int i36 = abstractC4728u0.f39318u;
            boolean z16 = abstractC4728u0.f39309A;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            boolean z17 = false;
            int i40 = 0;
            boolean z18 = false;
            boolean z19 = true;
            float f2 = 0.0f;
            int i41 = 0;
            while (i37 < virtualChildCount) {
                int i42 = mode;
                View childAt = abstractC4728u0.getChildAt(i37);
                if (childAt == null) {
                    abstractC4728u0.f39322y = abstractC4728u0.f39322y;
                } else if (childAt.getVisibility() != i34) {
                    if (abstractC4728u0.i(i37)) {
                        abstractC4728u0.f39322y += abstractC4728u0.f39314F;
                    }
                    C4726t0 c4726t02 = (C4726t0) childAt.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) c4726t02).weight;
                    f2 += f9;
                    if (mode2 == i33 && ((LinearLayout.LayoutParams) c4726t02).height == 0 && f9 > 0.0f) {
                        int i43 = abstractC4728u0.f39322y;
                        abstractC4728u0.f39322y = Math.max(i43, ((LinearLayout.LayoutParams) c4726t02).topMargin + i43 + ((LinearLayout.LayoutParams) c4726t02).bottomMargin);
                        view2 = childAt;
                        i28 = mode2;
                        i29 = i36;
                        z13 = z16;
                        i30 = i37;
                        z17 = true;
                        i31 = i42;
                    } else {
                        if (((LinearLayout.LayoutParams) c4726t02).height != 0 || f9 <= 0.0f) {
                            i25 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c4726t02).height = i32;
                            i25 = 0;
                        }
                        if (f2 == 0.0f) {
                            i26 = i37;
                            i27 = abstractC4728u0.f39322y;
                        } else {
                            i26 = i37;
                            i27 = 0;
                        }
                        i28 = mode2;
                        z13 = z16;
                        i29 = i36;
                        i30 = i26;
                        i31 = i42;
                        abstractC4728u0.measureChildWithMargins(childAt, i, 0, i4, i27);
                        if (i25 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c4726t02).height = i25;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i44 = abstractC4728u0.f39322y;
                        view2 = childAt;
                        abstractC4728u0.f39322y = Math.max(i44, i44 + measuredHeight + ((LinearLayout.LayoutParams) c4726t02).topMargin + ((LinearLayout.LayoutParams) c4726t02).bottomMargin);
                        if (z13) {
                            i41 = Math.max(measuredHeight, i41);
                        }
                    }
                    if (i29 >= 0 && i29 == i30 + 1) {
                        abstractC4728u0.f39319v = abstractC4728u0.f39322y;
                    }
                    if (i30 < i29 && ((LinearLayout.LayoutParams) c4726t02).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i31 == 1073741824 || ((LinearLayout.LayoutParams) c4726t02).width != -1) {
                        z14 = false;
                    } else {
                        z14 = true;
                        z18 = true;
                    }
                    int i45 = ((LinearLayout.LayoutParams) c4726t02).leftMargin + ((LinearLayout.LayoutParams) c4726t02).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i45;
                    int max2 = Math.max(i35, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z20 = z14;
                    int combineMeasuredStates = View.combineMeasuredStates(i40, measuredState);
                    if (z19) {
                        i40 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) c4726t02).width == -1) {
                            z15 = true;
                            if (((LinearLayout.LayoutParams) c4726t02).weight <= 0.0f) {
                                if (!z20) {
                                    i45 = measuredWidth;
                                }
                                i39 = Math.max(i39, i45);
                            } else {
                                if (!z20) {
                                    i45 = measuredWidth;
                                }
                                i38 = Math.max(i38, i45);
                            }
                            z19 = z15;
                            i35 = max2;
                            i37 = i30 + 1;
                            i36 = i29;
                            mode = i31;
                            z16 = z13;
                            mode2 = i28;
                            i32 = -2;
                            i33 = 1073741824;
                            i34 = 8;
                        }
                    } else {
                        i40 = combineMeasuredStates;
                    }
                    z15 = false;
                    if (((LinearLayout.LayoutParams) c4726t02).weight <= 0.0f) {
                    }
                    z19 = z15;
                    i35 = max2;
                    i37 = i30 + 1;
                    i36 = i29;
                    mode = i31;
                    z16 = z13;
                    mode2 = i28;
                    i32 = -2;
                    i33 = 1073741824;
                    i34 = 8;
                }
                i28 = mode2;
                i29 = i36;
                z13 = z16;
                i30 = i37;
                i31 = i42;
                i37 = i30 + 1;
                i36 = i29;
                mode = i31;
                z16 = z13;
                mode2 = i28;
                i32 = -2;
                i33 = 1073741824;
                i34 = 8;
            }
            int i46 = mode;
            int i47 = mode2;
            boolean z21 = z16;
            int i48 = i40;
            int i49 = i4;
            if (abstractC4728u0.f39322y > 0 && abstractC4728u0.i(virtualChildCount)) {
                abstractC4728u0.f39322y += abstractC4728u0.f39314F;
            }
            if (z21 && (i47 == Integer.MIN_VALUE || i47 == 0)) {
                abstractC4728u0.f39322y = 0;
                for (int i50 = 0; i50 < virtualChildCount; i50++) {
                    View childAt2 = abstractC4728u0.getChildAt(i50);
                    if (childAt2 == null) {
                        abstractC4728u0.f39322y = abstractC4728u0.f39322y;
                    } else if (childAt2.getVisibility() != 8) {
                        C4726t0 c4726t03 = (C4726t0) childAt2.getLayoutParams();
                        int i51 = abstractC4728u0.f39322y;
                        abstractC4728u0.f39322y = Math.max(i51, i51 + i41 + ((LinearLayout.LayoutParams) c4726t03).topMargin + ((LinearLayout.LayoutParams) c4726t03).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC4728u0.getPaddingBottom() + abstractC4728u0.getPaddingTop() + abstractC4728u0.f39322y;
            abstractC4728u0.f39322y = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC4728u0.getSuggestedMinimumHeight()), i49, 0);
            int i52 = (resolveSizeAndState & 16777215) - abstractC4728u0.f39322y;
            if (z17 || (i52 != 0 && f2 > 0.0f)) {
                float f10 = abstractC4728u0.f39323z;
                if (f10 > 0.0f) {
                    f2 = f10;
                }
                abstractC4728u0.f39322y = 0;
                int i53 = i48;
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt3 = abstractC4728u0.getChildAt(i54);
                    if (childAt3.getVisibility() == 8) {
                        i22 = i54;
                    } else {
                        C4726t0 c4726t04 = (C4726t0) childAt3.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) c4726t04).weight;
                        if (f11 > 0.0f) {
                            int i55 = (int) ((i52 * f11) / f2);
                            f2 -= f11;
                            i52 -= i55;
                            i22 = i54;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, abstractC4728u0.getPaddingRight() + abstractC4728u0.getPaddingLeft() + ((LinearLayout.LayoutParams) c4726t04).leftMargin + ((LinearLayout.LayoutParams) c4726t04).rightMargin, ((LinearLayout.LayoutParams) c4726t04).width);
                            if (((LinearLayout.LayoutParams) c4726t04).height == 0) {
                                i24 = 1073741824;
                                if (i47 == 1073741824) {
                                    if (i55 <= 0) {
                                        i55 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i55, 1073741824));
                                    i53 = View.combineMeasuredStates(i53, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i24 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i55;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i24));
                            i53 = View.combineMeasuredStates(i53, childAt3.getMeasuredState() & (-256));
                        } else {
                            i22 = i54;
                        }
                        int i56 = ((LinearLayout.LayoutParams) c4726t04).leftMargin + ((LinearLayout.LayoutParams) c4726t04).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i56;
                        i35 = Math.max(i35, measuredWidth2);
                        if (i46 != 1073741824) {
                            i23 = -1;
                            if (((LinearLayout.LayoutParams) c4726t04).width == -1) {
                                measuredWidth2 = i56;
                            }
                        } else {
                            i23 = -1;
                        }
                        i38 = Math.max(i38, measuredWidth2);
                        boolean z22 = z19 && ((LinearLayout.LayoutParams) c4726t04).width == i23;
                        int i57 = abstractC4728u0.f39322y;
                        abstractC4728u0.f39322y = Math.max(i57, childAt3.getMeasuredHeight() + i57 + ((LinearLayout.LayoutParams) c4726t04).topMargin + ((LinearLayout.LayoutParams) c4726t04).bottomMargin);
                        z19 = z22;
                    }
                    i54 = i22 + 1;
                }
                abstractC4728u0.f39322y = abstractC4728u0.getPaddingBottom() + abstractC4728u0.getPaddingTop() + abstractC4728u0.f39322y;
                i48 = i53;
            } else {
                i38 = Math.max(i38, i39);
                if (z21 && i47 != 1073741824) {
                    for (int i58 = 0; i58 < virtualChildCount; i58++) {
                        View childAt4 = abstractC4728u0.getChildAt(i58);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C4726t0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i41, 1073741824));
                        }
                    }
                }
            }
            if (z19 || i46 == 1073741824) {
                i38 = i35;
            }
            abstractC4728u0.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC4728u0.getPaddingRight() + abstractC4728u0.getPaddingLeft() + i38, abstractC4728u0.getSuggestedMinimumWidth()), i, i48), resolveSizeAndState);
            if (z18) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC4728u0.getMeasuredWidth(), 1073741824);
                int i59 = 0;
                while (i59 < virtualChildCount) {
                    View childAt5 = abstractC4728u0.getChildAt(i59);
                    if (childAt5.getVisibility() != 8) {
                        C4726t0 c4726t05 = (C4726t0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c4726t05).width == -1) {
                            int i60 = ((LinearLayout.LayoutParams) c4726t05).height;
                            ((LinearLayout.LayoutParams) c4726t05).height = childAt5.getMeasuredHeight();
                            abstractC4728u0.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i49, 0);
                            ((LinearLayout.LayoutParams) c4726t05).height = i60;
                        }
                    }
                    i59++;
                    i49 = i4;
                }
                return;
            }
            return;
        }
        int i61 = i;
        abstractC4728u0.f39322y = 0;
        int virtualChildCount2 = abstractC4728u0.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i61);
        int mode4 = View.MeasureSpec.getMode(i4);
        if (abstractC4728u0.f39310B == null || abstractC4728u0.f39311C == null) {
            abstractC4728u0.f39310B = new int[4];
            abstractC4728u0.f39311C = new int[4];
        }
        int[] iArr3 = abstractC4728u0.f39310B;
        int[] iArr4 = abstractC4728u0.f39311C;
        iArr3[3] = -1;
        char c9 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z23 = abstractC4728u0.f39317n;
        boolean z24 = abstractC4728u0.f39309A;
        boolean z25 = mode3 == 1073741824;
        float f12 = 0.0f;
        boolean z26 = true;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        boolean z27 = false;
        boolean z28 = false;
        while (i62 < virtualChildCount2) {
            char c10 = c9;
            View childAt6 = abstractC4728u0.getChildAt(i62);
            if (childAt6 == null) {
                abstractC4728u0.f39322y = abstractC4728u0.f39322y;
                i17 = i62;
                i21 = i64;
                iArr2 = iArr3;
                iArr = iArr4;
                z9 = z23;
                z10 = z24;
            } else {
                int i68 = i63;
                if (childAt6.getVisibility() == 8) {
                    i61 = i;
                    i17 = i62;
                    i21 = i64;
                    iArr = iArr4;
                    z9 = z23;
                    z10 = z24;
                    i63 = i68;
                    iArr2 = iArr3;
                } else {
                    if (abstractC4728u0.i(i62)) {
                        abstractC4728u0.f39322y += abstractC4728u0.f39313E;
                    }
                    C4726t0 c4726t06 = (C4726t0) childAt6.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) c4726t06).weight;
                    f12 += f13;
                    int i69 = i62;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c4726t06).width == 0 && f13 > 0.0f) {
                        if (z25) {
                            abstractC4728u0.f39322y = ((LinearLayout.LayoutParams) c4726t06).leftMargin + ((LinearLayout.LayoutParams) c4726t06).rightMargin + abstractC4728u0.f39322y;
                        } else {
                            int i70 = abstractC4728u0.f39322y;
                            abstractC4728u0.f39322y = Math.max(i70, ((LinearLayout.LayoutParams) c4726t06).leftMargin + i70 + ((LinearLayout.LayoutParams) c4726t06).rightMargin);
                        }
                        if (z23) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z9 = z23;
                            z10 = z24;
                            i18 = i68;
                            i17 = i69;
                            c4726t0 = c4726t06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i61 = i;
                            i19 = i64;
                            i16 = i65;
                        } else {
                            view = childAt6;
                            z9 = z23;
                            z10 = z24;
                            z28 = true;
                            i18 = i68;
                            i17 = i69;
                            i20 = 1073741824;
                            c4726t0 = c4726t06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i61 = i;
                            i19 = i64;
                            i16 = i65;
                            if (mode4 == i20 && ((LinearLayout.LayoutParams) c4726t0).height == -1) {
                                z11 = true;
                                z27 = true;
                            } else {
                                z11 = false;
                            }
                            int i71 = ((LinearLayout.LayoutParams) c4726t0).topMargin + ((LinearLayout.LayoutParams) c4726t0).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i71;
                            i67 = View.combineMeasuredStates(i67, view.getMeasuredState());
                            if (z9) {
                                z12 = z11;
                            } else {
                                int baseline2 = view.getBaseline();
                                z12 = z11;
                                if (baseline2 != -1) {
                                    int i72 = ((LinearLayout.LayoutParams) c4726t0).gravity;
                                    if (i72 < 0) {
                                        i72 = abstractC4728u0.f39321x;
                                    }
                                    int i73 = (((i72 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i73] = Math.max(iArr2[i73], baseline2);
                                    iArr[i73] = Math.max(iArr[i73], measuredHeight3 - baseline2);
                                }
                            }
                            int max3 = Math.max(i18, measuredHeight3);
                            boolean z29 = !z26 && ((LinearLayout.LayoutParams) c4726t0).height == -1;
                            if (((LinearLayout.LayoutParams) c4726t0).weight <= 0.0f) {
                                if (!z12) {
                                    i71 = measuredHeight3;
                                }
                                i65 = Math.max(i16, i71);
                                max = i19;
                            } else {
                                if (!z12) {
                                    i71 = measuredHeight3;
                                }
                                max = Math.max(i19, i71);
                                i65 = i16;
                            }
                            int i74 = max;
                            i63 = max3;
                            i21 = i74;
                            z26 = z29;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) c4726t06).width != 0 || f13 <= 0.0f) {
                            i15 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c4726t06).width = -2;
                            i15 = 0;
                        }
                        iArr = iArr4;
                        i16 = i65;
                        i17 = i69;
                        z9 = z23;
                        z10 = z24;
                        int i75 = i15;
                        c4726t0 = c4726t06;
                        i18 = i68;
                        i61 = i;
                        iArr2 = iArr3;
                        i19 = i64;
                        abstractC4728u0.measureChildWithMargins(childAt6, i61, f12 == 0.0f ? abstractC4728u0.f39322y : 0, i4, 0);
                        if (i75 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c4726t0).width = i75;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z25) {
                            view = childAt6;
                            abstractC4728u0.f39322y = ((LinearLayout.LayoutParams) c4726t0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c4726t0).rightMargin + abstractC4728u0.f39322y;
                        } else {
                            view = childAt6;
                            int i76 = abstractC4728u0.f39322y;
                            abstractC4728u0.f39322y = Math.max(i76, i76 + measuredWidth3 + ((LinearLayout.LayoutParams) c4726t0).leftMargin + ((LinearLayout.LayoutParams) c4726t0).rightMargin);
                        }
                        if (z10) {
                            i66 = Math.max(measuredWidth3, i66);
                        }
                    }
                    i20 = 1073741824;
                    if (mode4 == i20) {
                    }
                    z11 = false;
                    int i712 = ((LinearLayout.LayoutParams) c4726t0).topMargin + ((LinearLayout.LayoutParams) c4726t0).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i712;
                    i67 = View.combineMeasuredStates(i67, view.getMeasuredState());
                    if (z9) {
                    }
                    int max32 = Math.max(i18, measuredHeight32);
                    if (z26) {
                    }
                    if (((LinearLayout.LayoutParams) c4726t0).weight <= 0.0f) {
                    }
                    int i742 = max;
                    i63 = max32;
                    i21 = i742;
                    z26 = z29;
                }
            }
            i64 = i21;
            i62 = i17 + 1;
            c9 = c10;
            iArr3 = iArr2;
            iArr4 = iArr;
            z23 = z9;
            z24 = z10;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c11 = c9;
        boolean z30 = z23;
        boolean z31 = z24;
        int i77 = i63;
        int i78 = i64;
        int i79 = i65;
        if (abstractC4728u0.f39322y > 0 && abstractC4728u0.i(virtualChildCount2)) {
            abstractC4728u0.f39322y += abstractC4728u0.f39313E;
        }
        int i80 = iArr5[1];
        int max4 = (i80 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) ? i77 : Math.max(i77, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i80, iArr5[c11]))));
        if (z31 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC4728u0.f39322y = 0;
            for (int i81 = 0; i81 < virtualChildCount2; i81++) {
                View childAt7 = abstractC4728u0.getChildAt(i81);
                if (childAt7 == null) {
                    abstractC4728u0.f39322y = abstractC4728u0.f39322y;
                } else if (childAt7.getVisibility() != 8) {
                    C4726t0 c4726t07 = (C4726t0) childAt7.getLayoutParams();
                    if (z25) {
                        abstractC4728u0.f39322y = ((LinearLayout.LayoutParams) c4726t07).leftMargin + i66 + ((LinearLayout.LayoutParams) c4726t07).rightMargin + abstractC4728u0.f39322y;
                    } else {
                        int i82 = abstractC4728u0.f39322y;
                        abstractC4728u0.f39322y = Math.max(i82, i82 + i66 + ((LinearLayout.LayoutParams) c4726t07).leftMargin + ((LinearLayout.LayoutParams) c4726t07).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC4728u0.getPaddingRight() + abstractC4728u0.getPaddingLeft() + abstractC4728u0.f39322y;
        abstractC4728u0.f39322y = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC4728u0.getSuggestedMinimumWidth()), i61, 0);
        int i83 = (resolveSizeAndState2 & 16777215) - abstractC4728u0.f39322y;
        if (z28 || (i83 != 0 && f12 > 0.0f)) {
            float f14 = abstractC4728u0.f39323z;
            if (f14 > 0.0f) {
                f12 = f14;
            }
            iArr5[3] = -1;
            iArr5[c11] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c11] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC4728u0.f39322y = 0;
            max4 = -1;
            int i84 = 0;
            while (i84 < virtualChildCount2) {
                View childAt8 = abstractC4728u0.getChildAt(i84);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i12 = resolveSizeAndState2;
                } else {
                    C4726t0 c4726t08 = (C4726t0) childAt8.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) c4726t08).weight;
                    if (f15 > 0.0f) {
                        int i85 = (int) ((i83 * f15) / f12);
                        f12 -= f15;
                        i83 -= i85;
                        i12 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, abstractC4728u0.getPaddingBottom() + abstractC4728u0.getPaddingTop() + ((LinearLayout.LayoutParams) c4726t08).topMargin + ((LinearLayout.LayoutParams) c4726t08).bottomMargin, ((LinearLayout.LayoutParams) c4726t08).height);
                        if (((LinearLayout.LayoutParams) c4726t08).width == 0) {
                            i14 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i85 <= 0) {
                                    i85 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i85, 1073741824), childMeasureSpec2);
                                i67 = View.combineMeasuredStates(i67, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i14 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i85;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i14), childMeasureSpec2);
                        i67 = View.combineMeasuredStates(i67, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i12 = resolveSizeAndState2;
                    }
                    if (z25) {
                        abstractC4728u0.f39322y = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c4726t08).leftMargin + ((LinearLayout.LayoutParams) c4726t08).rightMargin + abstractC4728u0.f39322y;
                    } else {
                        int i86 = abstractC4728u0.f39322y;
                        abstractC4728u0.f39322y = Math.max(i86, childAt8.getMeasuredWidth() + i86 + ((LinearLayout.LayoutParams) c4726t08).leftMargin + ((LinearLayout.LayoutParams) c4726t08).rightMargin);
                    }
                    boolean z32 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c4726t08).height == -1;
                    int i87 = ((LinearLayout.LayoutParams) c4726t08).topMargin + ((LinearLayout.LayoutParams) c4726t08).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i87;
                    max4 = Math.max(max4, measuredHeight4);
                    if (!z32) {
                        i87 = measuredHeight4;
                    }
                    int max5 = Math.max(i78, i87);
                    if (z26) {
                        i13 = -1;
                        if (((LinearLayout.LayoutParams) c4726t08).height == -1) {
                            z6 = true;
                            if (!z30 && (baseline = childAt8.getBaseline()) != i13) {
                                int i88 = ((LinearLayout.LayoutParams) c4726t08).gravity;
                                if (i88 < 0) {
                                    i88 = abstractC4728u0.f39321x;
                                }
                                int i89 = (((i88 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i89] = Math.max(iArr5[i89], baseline);
                                iArr6[i89] = Math.max(iArr6[i89], measuredHeight4 - baseline);
                            }
                            z26 = z6;
                            i78 = max5;
                        }
                    } else {
                        i13 = -1;
                    }
                    z6 = false;
                    if (!z30) {
                    }
                    z26 = z6;
                    i78 = max5;
                }
                i84++;
                resolveSizeAndState2 = i12;
            }
            i6 = resolveSizeAndState2;
            i9 = -16777216;
            abstractC4728u0.f39322y = abstractC4728u0.getPaddingRight() + abstractC4728u0.getPaddingLeft() + abstractC4728u0.f39322y;
            int i90 = iArr5[1];
            if (i90 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) {
                i10 = 0;
            } else {
                i10 = 0;
                max4 = Math.max(max4, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i90, iArr5[c11]))));
            }
            i11 = i78;
        } else {
            i11 = Math.max(i78, i79);
            if (z31 && mode3 != 1073741824) {
                for (int i91 = 0; i91 < virtualChildCount2; i91++) {
                    View childAt9 = abstractC4728u0.getChildAt(i91);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C4726t0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i66, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = resolveSizeAndState2;
            i9 = -16777216;
            i10 = 0;
        }
        if (!z26 && mode4 != 1073741824) {
            max4 = i11;
        }
        abstractC4728u0.setMeasuredDimension(i6 | (i67 & i9), View.resolveSizeAndState(Math.max(abstractC4728u0.getPaddingBottom() + abstractC4728u0.getPaddingTop() + max4, abstractC4728u0.getSuggestedMinimumHeight()), i4, i67 << 16));
        if (z27) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC4728u0.getMeasuredHeight(), 1073741824);
            int i92 = i10;
            while (i92 < virtualChildCount2) {
                View childAt10 = abstractC4728u0.getChildAt(i92);
                if (childAt10.getVisibility() != 8) {
                    C4726t0 c4726t09 = (C4726t0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c4726t09).height == -1) {
                        int i93 = ((LinearLayout.LayoutParams) c4726t09).width;
                        ((LinearLayout.LayoutParams) c4726t09).width = childAt10.getMeasuredWidth();
                        abstractC4728u0.measureChildWithMargins(childAt10, i61, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c4726t09).width = i93;
                    }
                }
                i92++;
                abstractC4728u0 = this;
                i61 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z6) {
        this.f39317n = z6;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f39318u = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f39312D) {
            return;
        }
        this.f39312D = drawable;
        if (drawable != null) {
            this.f39313E = drawable.getIntrinsicWidth();
            this.f39314F = drawable.getIntrinsicHeight();
        } else {
            this.f39313E = 0;
            this.f39314F = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f39316H = i;
    }

    public void setGravity(int i) {
        if (this.f39321x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f39321x = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i4 = i & 8388615;
        int i6 = this.f39321x;
        if ((8388615 & i6) != i4) {
            this.f39321x = i4 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f39309A = z6;
    }

    public void setOrientation(int i) {
        if (this.f39320w != i) {
            this.f39320w = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f39315G) {
            requestLayout();
        }
        this.f39315G = i;
    }

    public void setVerticalGravity(int i) {
        int i4 = i & 112;
        int i6 = this.f39321x;
        if ((i6 & 112) != i4) {
            this.f39321x = i4 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f39323z = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
