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
import g.AbstractC4518a;

/* renamed from: m.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4715u0 extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public boolean f39240A;

    /* renamed from: B, reason: collision with root package name */
    public int[] f39241B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f39242C;

    /* renamed from: D, reason: collision with root package name */
    public Drawable f39243D;

    /* renamed from: E, reason: collision with root package name */
    public int f39244E;

    /* renamed from: F, reason: collision with root package name */
    public int f39245F;

    /* renamed from: G, reason: collision with root package name */
    public int f39246G;

    /* renamed from: H, reason: collision with root package name */
    public int f39247H;

    /* renamed from: n, reason: collision with root package name */
    public boolean f39248n;

    /* renamed from: u, reason: collision with root package name */
    public int f39249u;

    /* renamed from: v, reason: collision with root package name */
    public int f39250v;

    /* renamed from: w, reason: collision with root package name */
    public int f39251w;

    /* renamed from: x, reason: collision with root package name */
    public int f39252x;

    /* renamed from: y, reason: collision with root package name */
    public int f39253y;

    /* renamed from: z, reason: collision with root package name */
    public float f39254z;

    public AbstractC4715u0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f39248n = true;
        this.f39249u = -1;
        this.f39250v = 0;
        this.f39252x = 8388659;
        int[] iArr = AbstractC4518a.f37601o;
        j4.g s9 = j4.g.s(context, attributeSet, iArr, 0);
        O.X.n(this, context, iArr, attributeSet, (TypedArray) s9.f38405v, 0);
        TypedArray typedArray = (TypedArray) s9.f38405v;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f39254z = typedArray.getFloat(4, -1.0f);
        this.f39249u = typedArray.getInt(3, -1);
        this.f39240A = typedArray.getBoolean(7, false);
        setDividerDrawable(s9.i(5));
        this.f39246G = typedArray.getInt(8, 0);
        this.f39247H = typedArray.getDimensionPixelSize(6, 0);
        s9.t();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4713t0;
    }

    public final void d(Canvas canvas, int i) {
        this.f39243D.setBounds(getPaddingLeft() + this.f39247H, i, (getWidth() - getPaddingRight()) - this.f39247H, this.f39245F + i);
        this.f39243D.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f39243D.setBounds(i, getPaddingTop() + this.f39247H, this.f39244E + i, (getHeight() - getPaddingBottom()) - this.f39247H);
        this.f39243D.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4713t0 generateDefaultLayoutParams() {
        int i = this.f39251w;
        if (i == 0) {
            return new C4713t0(-2, -2);
        }
        if (i == 1) {
            return new C4713t0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4713t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C4713t0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f39249u < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i6 = this.f39249u;
        if (childCount <= i6) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i6);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f39249u == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i9 = this.f39250v;
        if (this.f39251w == 1 && (i = this.f39252x & 112) != 48) {
            if (i == 16) {
                i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f39253y) / 2;
            } else if (i == 80) {
                i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f39253y;
            }
        }
        return i9 + ((LinearLayout.LayoutParams) ((C4713t0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f39249u;
    }

    public Drawable getDividerDrawable() {
        return this.f39243D;
    }

    public int getDividerPadding() {
        return this.f39247H;
    }

    public int getDividerWidth() {
        return this.f39244E;
    }

    public int getGravity() {
        return this.f39252x;
    }

    public int getOrientation() {
        return this.f39251w;
    }

    public int getShowDividers() {
        return this.f39246G;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f39254z;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C4713t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4713t0 ? new C4713t0((C4713t0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C4713t0((ViewGroup.MarginLayoutParams) layoutParams) : new C4713t0(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f39246G & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f39246G & 4) != 0;
        }
        if ((this.f39246G & 2) != 0) {
            for (int i6 = i - 1; i6 >= 0; i6--) {
                if (getChildAt(i6).getVisibility() != 8) {
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
        if (this.f39243D == null) {
            return;
        }
        int i6 = 0;
        if (this.f39251w == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i6 < virtualChildCount) {
                View childAt = getChildAt(i6);
                if (childAt != null && childAt.getVisibility() != 8 && i(i6)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C4713t0) childAt.getLayoutParams())).topMargin) - this.f39245F);
                }
                i6++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f39245F : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C4713t0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z3 = f1.f39146a;
        boolean z6 = getLayoutDirection() == 1;
        while (i6 < virtualChildCount2) {
            View childAt3 = getChildAt(i6);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i6)) {
                C4713t0 c4713t0 = (C4713t0) childAt3.getLayoutParams();
                e(canvas, z6 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c4713t0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c4713t0).leftMargin) - this.f39244E);
            }
            i6++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C4713t0 c4713t02 = (C4713t0) childAt4.getLayoutParams();
                if (z6) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c4713t02).leftMargin;
                    i = this.f39244E;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c4713t02).rightMargin;
                }
            } else if (z6) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f39244E;
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
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char c9;
        int i20;
        int i21;
        int i22;
        int i23 = 8;
        char c10 = 2;
        if (this.f39251w == 1) {
            int paddingLeft = getPaddingLeft();
            int i24 = i9 - i;
            int paddingRight = i24 - getPaddingRight();
            int paddingRight2 = (i24 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i25 = this.f39252x;
            int i26 = i25 & 112;
            int i27 = 8388615 & i25;
            int paddingTop = i26 != 16 ? i26 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i6) - this.f39253y : getPaddingTop() + (((i10 - i6) - this.f39253y) / 2);
            int i28 = 0;
            while (i28 < virtualChildCount) {
                View childAt = getChildAt(i28);
                if (childAt == null || childAt.getVisibility() == i23) {
                    c9 = c10;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C4713t0 c4713t0 = (C4713t0) childAt.getLayoutParams();
                    c9 = c10;
                    int i29 = ((LinearLayout.LayoutParams) c4713t0).gravity;
                    if (i29 < 0) {
                        i29 = i27;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i29, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i20 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c4713t0).leftMargin;
                        i21 = ((LinearLayout.LayoutParams) c4713t0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i22 = ((LinearLayout.LayoutParams) c4713t0).leftMargin + paddingLeft;
                        if (i(i28)) {
                            paddingTop += this.f39245F;
                        }
                        int i30 = paddingTop + ((LinearLayout.LayoutParams) c4713t0).topMargin;
                        childAt.layout(i22, i30, measuredWidth + i22, i30 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c4713t0).bottomMargin + i30;
                    } else {
                        i20 = paddingRight - measuredWidth;
                        i21 = ((LinearLayout.LayoutParams) c4713t0).rightMargin;
                    }
                    i22 = i20 - i21;
                    if (i(i28)) {
                    }
                    int i302 = paddingTop + ((LinearLayout.LayoutParams) c4713t0).topMargin;
                    childAt.layout(i22, i302, measuredWidth + i22, i302 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c4713t0).bottomMargin + i302;
                }
                i28++;
                c10 = c9;
                i23 = 8;
            }
            return;
        }
        boolean z6 = f1.f39146a;
        boolean z9 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i31 = i10 - i6;
        int paddingBottom = i31 - getPaddingBottom();
        int paddingBottom2 = (i31 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i32 = this.f39252x;
        int i33 = 8388615 & i32;
        int i34 = i32 & 112;
        boolean z10 = this.f39248n;
        int[] iArr = this.f39241B;
        int[] iArr2 = this.f39242C;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i33, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i9) - i) - this.f39253y : getPaddingLeft() + (((i9 - i) - this.f39253y) / 2);
        if (z9) {
            i12 = virtualChildCount2 - 1;
            i11 = -1;
        } else {
            i11 = 1;
            i12 = 0;
        }
        int i35 = 0;
        while (i35 < virtualChildCount2) {
            int i36 = (i11 * i35) + i12;
            View childAt2 = getChildAt(i36);
            if (childAt2 == null) {
                i13 = i12;
            } else {
                i13 = i12;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C4713t0 c4713t02 = (C4713t0) childAt2.getLayoutParams();
                    int i37 = paddingLeft2;
                    if (z10) {
                        i14 = paddingTop2;
                        if (((LinearLayout.LayoutParams) c4713t02).height != -1) {
                            i15 = childAt2.getBaseline();
                            i16 = ((LinearLayout.LayoutParams) c4713t02).gravity;
                            if (i16 < 0) {
                                i16 = i34;
                            }
                            i17 = i16 & 112;
                            if (i17 == 16) {
                                if (i17 == 48) {
                                    i18 = i14 + ((LinearLayout.LayoutParams) c4713t02).topMargin;
                                    if (i15 != -1) {
                                        i18 = (iArr[1] - i15) + i18;
                                    }
                                } else if (i17 != 80) {
                                    i18 = i14;
                                } else {
                                    i18 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c4713t02).bottomMargin;
                                    if (i15 != -1) {
                                        i19 = iArr2[2] - (childAt2.getMeasuredHeight() - i15);
                                    }
                                }
                                int i38 = (i(i36) ? i37 + this.f39244E : i37) + ((LinearLayout.LayoutParams) c4713t02).leftMargin;
                                childAt2.layout(i38, i18, i38 + measuredWidth2, i18 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c4713t02).rightMargin + i38;
                                i35++;
                                i12 = i13;
                                paddingTop2 = i14;
                            } else {
                                i18 = ((paddingBottom2 - measuredHeight2) / 2) + i14 + ((LinearLayout.LayoutParams) c4713t02).topMargin;
                                i19 = ((LinearLayout.LayoutParams) c4713t02).bottomMargin;
                            }
                            i18 -= i19;
                            int i382 = (i(i36) ? i37 + this.f39244E : i37) + ((LinearLayout.LayoutParams) c4713t02).leftMargin;
                            childAt2.layout(i382, i18, i382 + measuredWidth2, i18 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c4713t02).rightMargin + i382;
                            i35++;
                            i12 = i13;
                            paddingTop2 = i14;
                        }
                    } else {
                        i14 = paddingTop2;
                    }
                    i15 = -1;
                    i16 = ((LinearLayout.LayoutParams) c4713t02).gravity;
                    if (i16 < 0) {
                    }
                    i17 = i16 & 112;
                    if (i17 == 16) {
                    }
                    i18 -= i19;
                    int i3822 = (i(i36) ? i37 + this.f39244E : i37) + ((LinearLayout.LayoutParams) c4713t02).leftMargin;
                    childAt2.layout(i3822, i18, i3822 + measuredWidth2, i18 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c4713t02).rightMargin + i3822;
                    i35++;
                    i12 = i13;
                    paddingTop2 = i14;
                }
            }
            i14 = paddingTop2;
            i35++;
            i12 = i13;
            paddingTop2 = i14;
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
    public void onMeasure(int i, int i6) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        int baseline;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        boolean z6;
        boolean z9;
        C4713t0 c4713t0;
        int i19;
        int[] iArr2;
        int i20;
        View view;
        int i21;
        boolean z10;
        boolean z11;
        int max;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z12;
        int i30;
        int i31;
        int i32;
        View view2;
        boolean z13;
        boolean z14;
        AbstractC4715u0 abstractC4715u0 = this;
        int i33 = -2;
        int i34 = 1073741824;
        int i35 = 8;
        int i36 = 0;
        if (abstractC4715u0.f39251w == 1) {
            abstractC4715u0.f39253y = 0;
            int virtualChildCount = abstractC4715u0.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i6);
            int i37 = abstractC4715u0.f39249u;
            boolean z15 = abstractC4715u0.f39240A;
            int i38 = 0;
            int i39 = 0;
            int i40 = 0;
            boolean z16 = false;
            int i41 = 0;
            boolean z17 = false;
            boolean z18 = true;
            float f3 = 0.0f;
            int i42 = 0;
            while (i38 < virtualChildCount) {
                int i43 = mode;
                View childAt = abstractC4715u0.getChildAt(i38);
                if (childAt == null) {
                    abstractC4715u0.f39253y = abstractC4715u0.f39253y;
                } else if (childAt.getVisibility() != i35) {
                    if (abstractC4715u0.i(i38)) {
                        abstractC4715u0.f39253y += abstractC4715u0.f39245F;
                    }
                    C4713t0 c4713t02 = (C4713t0) childAt.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) c4713t02).weight;
                    f3 += f9;
                    if (mode2 == i34 && ((LinearLayout.LayoutParams) c4713t02).height == 0 && f9 > 0.0f) {
                        int i44 = abstractC4715u0.f39253y;
                        abstractC4715u0.f39253y = Math.max(i44, ((LinearLayout.LayoutParams) c4713t02).topMargin + i44 + ((LinearLayout.LayoutParams) c4713t02).bottomMargin);
                        view2 = childAt;
                        i29 = mode2;
                        i30 = i37;
                        z12 = z15;
                        i31 = i38;
                        z16 = true;
                        i32 = i43;
                    } else {
                        if (((LinearLayout.LayoutParams) c4713t02).height != 0 || f9 <= 0.0f) {
                            i26 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c4713t02).height = i33;
                            i26 = 0;
                        }
                        if (f3 == 0.0f) {
                            i27 = i38;
                            i28 = abstractC4715u0.f39253y;
                        } else {
                            i27 = i38;
                            i28 = 0;
                        }
                        i29 = mode2;
                        z12 = z15;
                        i30 = i37;
                        i31 = i27;
                        i32 = i43;
                        abstractC4715u0.measureChildWithMargins(childAt, i, 0, i6, i28);
                        if (i26 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c4713t02).height = i26;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i45 = abstractC4715u0.f39253y;
                        view2 = childAt;
                        abstractC4715u0.f39253y = Math.max(i45, i45 + measuredHeight + ((LinearLayout.LayoutParams) c4713t02).topMargin + ((LinearLayout.LayoutParams) c4713t02).bottomMargin);
                        if (z12) {
                            i42 = Math.max(measuredHeight, i42);
                        }
                    }
                    if (i30 >= 0 && i30 == i31 + 1) {
                        abstractC4715u0.f39250v = abstractC4715u0.f39253y;
                    }
                    if (i31 < i30 && ((LinearLayout.LayoutParams) c4713t02).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i32 == 1073741824 || ((LinearLayout.LayoutParams) c4713t02).width != -1) {
                        z13 = false;
                    } else {
                        z13 = true;
                        z17 = true;
                    }
                    int i46 = ((LinearLayout.LayoutParams) c4713t02).leftMargin + ((LinearLayout.LayoutParams) c4713t02).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i46;
                    int max2 = Math.max(i36, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z19 = z13;
                    int combineMeasuredStates = View.combineMeasuredStates(i41, measuredState);
                    if (z18) {
                        i41 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) c4713t02).width == -1) {
                            z14 = true;
                            if (((LinearLayout.LayoutParams) c4713t02).weight <= 0.0f) {
                                if (!z19) {
                                    i46 = measuredWidth;
                                }
                                i40 = Math.max(i40, i46);
                            } else {
                                if (!z19) {
                                    i46 = measuredWidth;
                                }
                                i39 = Math.max(i39, i46);
                            }
                            z18 = z14;
                            i36 = max2;
                            i38 = i31 + 1;
                            i37 = i30;
                            mode = i32;
                            z15 = z12;
                            mode2 = i29;
                            i33 = -2;
                            i34 = 1073741824;
                            i35 = 8;
                        }
                    } else {
                        i41 = combineMeasuredStates;
                    }
                    z14 = false;
                    if (((LinearLayout.LayoutParams) c4713t02).weight <= 0.0f) {
                    }
                    z18 = z14;
                    i36 = max2;
                    i38 = i31 + 1;
                    i37 = i30;
                    mode = i32;
                    z15 = z12;
                    mode2 = i29;
                    i33 = -2;
                    i34 = 1073741824;
                    i35 = 8;
                }
                i29 = mode2;
                i30 = i37;
                z12 = z15;
                i31 = i38;
                i32 = i43;
                i38 = i31 + 1;
                i37 = i30;
                mode = i32;
                z15 = z12;
                mode2 = i29;
                i33 = -2;
                i34 = 1073741824;
                i35 = 8;
            }
            int i47 = mode;
            int i48 = mode2;
            boolean z20 = z15;
            int i49 = i41;
            int i50 = i6;
            if (abstractC4715u0.f39253y > 0 && abstractC4715u0.i(virtualChildCount)) {
                abstractC4715u0.f39253y += abstractC4715u0.f39245F;
            }
            if (z20 && (i48 == Integer.MIN_VALUE || i48 == 0)) {
                abstractC4715u0.f39253y = 0;
                for (int i51 = 0; i51 < virtualChildCount; i51++) {
                    View childAt2 = abstractC4715u0.getChildAt(i51);
                    if (childAt2 == null) {
                        abstractC4715u0.f39253y = abstractC4715u0.f39253y;
                    } else if (childAt2.getVisibility() != 8) {
                        C4713t0 c4713t03 = (C4713t0) childAt2.getLayoutParams();
                        int i52 = abstractC4715u0.f39253y;
                        abstractC4715u0.f39253y = Math.max(i52, i52 + i42 + ((LinearLayout.LayoutParams) c4713t03).topMargin + ((LinearLayout.LayoutParams) c4713t03).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC4715u0.getPaddingBottom() + abstractC4715u0.getPaddingTop() + abstractC4715u0.f39253y;
            abstractC4715u0.f39253y = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC4715u0.getSuggestedMinimumHeight()), i50, 0);
            int i53 = (resolveSizeAndState & 16777215) - abstractC4715u0.f39253y;
            if (z16 || (i53 != 0 && f3 > 0.0f)) {
                float f10 = abstractC4715u0.f39254z;
                if (f10 > 0.0f) {
                    f3 = f10;
                }
                abstractC4715u0.f39253y = 0;
                int i54 = i49;
                int i55 = 0;
                while (i55 < virtualChildCount) {
                    View childAt3 = abstractC4715u0.getChildAt(i55);
                    if (childAt3.getVisibility() == 8) {
                        i23 = i55;
                    } else {
                        C4713t0 c4713t04 = (C4713t0) childAt3.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) c4713t04).weight;
                        if (f11 > 0.0f) {
                            int i56 = (int) ((i53 * f11) / f3);
                            f3 -= f11;
                            i53 -= i56;
                            i23 = i55;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, abstractC4715u0.getPaddingRight() + abstractC4715u0.getPaddingLeft() + ((LinearLayout.LayoutParams) c4713t04).leftMargin + ((LinearLayout.LayoutParams) c4713t04).rightMargin, ((LinearLayout.LayoutParams) c4713t04).width);
                            if (((LinearLayout.LayoutParams) c4713t04).height == 0) {
                                i25 = 1073741824;
                                if (i48 == 1073741824) {
                                    if (i56 <= 0) {
                                        i56 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i56, 1073741824));
                                    i54 = View.combineMeasuredStates(i54, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i25 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i56;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i25));
                            i54 = View.combineMeasuredStates(i54, childAt3.getMeasuredState() & (-256));
                        } else {
                            i23 = i55;
                        }
                        int i57 = ((LinearLayout.LayoutParams) c4713t04).leftMargin + ((LinearLayout.LayoutParams) c4713t04).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i57;
                        i36 = Math.max(i36, measuredWidth2);
                        if (i47 != 1073741824) {
                            i24 = -1;
                            if (((LinearLayout.LayoutParams) c4713t04).width == -1) {
                                measuredWidth2 = i57;
                            }
                        } else {
                            i24 = -1;
                        }
                        i39 = Math.max(i39, measuredWidth2);
                        boolean z21 = z18 && ((LinearLayout.LayoutParams) c4713t04).width == i24;
                        int i58 = abstractC4715u0.f39253y;
                        abstractC4715u0.f39253y = Math.max(i58, childAt3.getMeasuredHeight() + i58 + ((LinearLayout.LayoutParams) c4713t04).topMargin + ((LinearLayout.LayoutParams) c4713t04).bottomMargin);
                        z18 = z21;
                    }
                    i55 = i23 + 1;
                }
                abstractC4715u0.f39253y = abstractC4715u0.getPaddingBottom() + abstractC4715u0.getPaddingTop() + abstractC4715u0.f39253y;
                i49 = i54;
            } else {
                i39 = Math.max(i39, i40);
                if (z20 && i48 != 1073741824) {
                    for (int i59 = 0; i59 < virtualChildCount; i59++) {
                        View childAt4 = abstractC4715u0.getChildAt(i59);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C4713t0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                        }
                    }
                }
            }
            if (z18 || i47 == 1073741824) {
                i39 = i36;
            }
            abstractC4715u0.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC4715u0.getPaddingRight() + abstractC4715u0.getPaddingLeft() + i39, abstractC4715u0.getSuggestedMinimumWidth()), i, i49), resolveSizeAndState);
            if (z17) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC4715u0.getMeasuredWidth(), 1073741824);
                int i60 = 0;
                while (i60 < virtualChildCount) {
                    View childAt5 = abstractC4715u0.getChildAt(i60);
                    if (childAt5.getVisibility() != 8) {
                        C4713t0 c4713t05 = (C4713t0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c4713t05).width == -1) {
                            int i61 = ((LinearLayout.LayoutParams) c4713t05).height;
                            ((LinearLayout.LayoutParams) c4713t05).height = childAt5.getMeasuredHeight();
                            abstractC4715u0.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i50, 0);
                            ((LinearLayout.LayoutParams) c4713t05).height = i61;
                        }
                    }
                    i60++;
                    i50 = i6;
                }
                return;
            }
            return;
        }
        int i62 = i;
        abstractC4715u0.f39253y = 0;
        int virtualChildCount2 = abstractC4715u0.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i62);
        int mode4 = View.MeasureSpec.getMode(i6);
        if (abstractC4715u0.f39241B == null || abstractC4715u0.f39242C == null) {
            abstractC4715u0.f39241B = new int[4];
            abstractC4715u0.f39242C = new int[4];
        }
        int[] iArr3 = abstractC4715u0.f39241B;
        int[] iArr4 = abstractC4715u0.f39242C;
        iArr3[3] = -1;
        char c9 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z22 = abstractC4715u0.f39248n;
        boolean z23 = abstractC4715u0.f39240A;
        boolean z24 = mode3 == 1073741824;
        float f12 = 0.0f;
        boolean z25 = true;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        boolean z26 = false;
        boolean z27 = false;
        while (i63 < virtualChildCount2) {
            char c10 = c9;
            View childAt6 = abstractC4715u0.getChildAt(i63);
            if (childAt6 == null) {
                abstractC4715u0.f39253y = abstractC4715u0.f39253y;
                i18 = i63;
                i22 = i65;
                iArr2 = iArr3;
                iArr = iArr4;
                z6 = z22;
                z9 = z23;
            } else {
                int i69 = i64;
                if (childAt6.getVisibility() == 8) {
                    i62 = i;
                    i18 = i63;
                    i22 = i65;
                    iArr = iArr4;
                    z6 = z22;
                    z9 = z23;
                    i64 = i69;
                    iArr2 = iArr3;
                } else {
                    if (abstractC4715u0.i(i63)) {
                        abstractC4715u0.f39253y += abstractC4715u0.f39244E;
                    }
                    C4713t0 c4713t06 = (C4713t0) childAt6.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) c4713t06).weight;
                    f12 += f13;
                    int i70 = i63;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c4713t06).width == 0 && f13 > 0.0f) {
                        if (z24) {
                            abstractC4715u0.f39253y = ((LinearLayout.LayoutParams) c4713t06).leftMargin + ((LinearLayout.LayoutParams) c4713t06).rightMargin + abstractC4715u0.f39253y;
                        } else {
                            int i71 = abstractC4715u0.f39253y;
                            abstractC4715u0.f39253y = Math.max(i71, ((LinearLayout.LayoutParams) c4713t06).leftMargin + i71 + ((LinearLayout.LayoutParams) c4713t06).rightMargin);
                        }
                        if (z22) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z6 = z22;
                            z9 = z23;
                            i19 = i69;
                            i18 = i70;
                            c4713t0 = c4713t06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i62 = i;
                            i20 = i65;
                            i17 = i66;
                        } else {
                            view = childAt6;
                            z6 = z22;
                            z9 = z23;
                            z27 = true;
                            i19 = i69;
                            i18 = i70;
                            i21 = 1073741824;
                            c4713t0 = c4713t06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i62 = i;
                            i20 = i65;
                            i17 = i66;
                            if (mode4 == i21 && ((LinearLayout.LayoutParams) c4713t0).height == -1) {
                                z10 = true;
                                z26 = true;
                            } else {
                                z10 = false;
                            }
                            int i72 = ((LinearLayout.LayoutParams) c4713t0).topMargin + ((LinearLayout.LayoutParams) c4713t0).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i72;
                            i68 = View.combineMeasuredStates(i68, view.getMeasuredState());
                            if (z6) {
                                z11 = z10;
                            } else {
                                int baseline2 = view.getBaseline();
                                z11 = z10;
                                if (baseline2 != -1) {
                                    int i73 = ((LinearLayout.LayoutParams) c4713t0).gravity;
                                    if (i73 < 0) {
                                        i73 = abstractC4715u0.f39252x;
                                    }
                                    int i74 = (((i73 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i74] = Math.max(iArr2[i74], baseline2);
                                    iArr[i74] = Math.max(iArr[i74], measuredHeight3 - baseline2);
                                }
                            }
                            int max3 = Math.max(i19, measuredHeight3);
                            boolean z28 = !z25 && ((LinearLayout.LayoutParams) c4713t0).height == -1;
                            if (((LinearLayout.LayoutParams) c4713t0).weight <= 0.0f) {
                                if (!z11) {
                                    i72 = measuredHeight3;
                                }
                                i66 = Math.max(i17, i72);
                                max = i20;
                            } else {
                                if (!z11) {
                                    i72 = measuredHeight3;
                                }
                                max = Math.max(i20, i72);
                                i66 = i17;
                            }
                            int i75 = max;
                            i64 = max3;
                            i22 = i75;
                            z25 = z28;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) c4713t06).width != 0 || f13 <= 0.0f) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c4713t06).width = -2;
                            i16 = 0;
                        }
                        iArr = iArr4;
                        i17 = i66;
                        i18 = i70;
                        z6 = z22;
                        z9 = z23;
                        int i76 = i16;
                        c4713t0 = c4713t06;
                        i19 = i69;
                        i62 = i;
                        iArr2 = iArr3;
                        i20 = i65;
                        abstractC4715u0.measureChildWithMargins(childAt6, i62, f12 == 0.0f ? abstractC4715u0.f39253y : 0, i6, 0);
                        if (i76 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c4713t0).width = i76;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z24) {
                            view = childAt6;
                            abstractC4715u0.f39253y = ((LinearLayout.LayoutParams) c4713t0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c4713t0).rightMargin + abstractC4715u0.f39253y;
                        } else {
                            view = childAt6;
                            int i77 = abstractC4715u0.f39253y;
                            abstractC4715u0.f39253y = Math.max(i77, i77 + measuredWidth3 + ((LinearLayout.LayoutParams) c4713t0).leftMargin + ((LinearLayout.LayoutParams) c4713t0).rightMargin);
                        }
                        if (z9) {
                            i67 = Math.max(measuredWidth3, i67);
                        }
                    }
                    i21 = 1073741824;
                    if (mode4 == i21) {
                    }
                    z10 = false;
                    int i722 = ((LinearLayout.LayoutParams) c4713t0).topMargin + ((LinearLayout.LayoutParams) c4713t0).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i722;
                    i68 = View.combineMeasuredStates(i68, view.getMeasuredState());
                    if (z6) {
                    }
                    int max32 = Math.max(i19, measuredHeight32);
                    if (z25) {
                    }
                    if (((LinearLayout.LayoutParams) c4713t0).weight <= 0.0f) {
                    }
                    int i752 = max;
                    i64 = max32;
                    i22 = i752;
                    z25 = z28;
                }
            }
            i65 = i22;
            i63 = i18 + 1;
            c9 = c10;
            iArr3 = iArr2;
            iArr4 = iArr;
            z22 = z6;
            z23 = z9;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c11 = c9;
        boolean z29 = z22;
        boolean z30 = z23;
        int i78 = i64;
        int i79 = i65;
        int i80 = i66;
        if (abstractC4715u0.f39253y > 0 && abstractC4715u0.i(virtualChildCount2)) {
            abstractC4715u0.f39253y += abstractC4715u0.f39244E;
        }
        int i81 = iArr5[1];
        int max4 = (i81 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) ? i78 : Math.max(i78, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i81, iArr5[c11]))));
        if (z30 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC4715u0.f39253y = 0;
            for (int i82 = 0; i82 < virtualChildCount2; i82++) {
                View childAt7 = abstractC4715u0.getChildAt(i82);
                if (childAt7 == null) {
                    abstractC4715u0.f39253y = abstractC4715u0.f39253y;
                } else if (childAt7.getVisibility() != 8) {
                    C4713t0 c4713t07 = (C4713t0) childAt7.getLayoutParams();
                    if (z24) {
                        abstractC4715u0.f39253y = ((LinearLayout.LayoutParams) c4713t07).leftMargin + i67 + ((LinearLayout.LayoutParams) c4713t07).rightMargin + abstractC4715u0.f39253y;
                    } else {
                        int i83 = abstractC4715u0.f39253y;
                        abstractC4715u0.f39253y = Math.max(i83, i83 + i67 + ((LinearLayout.LayoutParams) c4713t07).leftMargin + ((LinearLayout.LayoutParams) c4713t07).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC4715u0.getPaddingRight() + abstractC4715u0.getPaddingLeft() + abstractC4715u0.f39253y;
        abstractC4715u0.f39253y = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC4715u0.getSuggestedMinimumWidth()), i62, 0);
        int i84 = (resolveSizeAndState2 & 16777215) - abstractC4715u0.f39253y;
        if (z27 || (i84 != 0 && f12 > 0.0f)) {
            float f14 = abstractC4715u0.f39254z;
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
            abstractC4715u0.f39253y = 0;
            max4 = -1;
            int i85 = 0;
            while (i85 < virtualChildCount2) {
                View childAt8 = abstractC4715u0.getChildAt(i85);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i13 = resolveSizeAndState2;
                } else {
                    C4713t0 c4713t08 = (C4713t0) childAt8.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) c4713t08).weight;
                    if (f15 > 0.0f) {
                        int i86 = (int) ((i84 * f15) / f12);
                        f12 -= f15;
                        i84 -= i86;
                        i13 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, abstractC4715u0.getPaddingBottom() + abstractC4715u0.getPaddingTop() + ((LinearLayout.LayoutParams) c4713t08).topMargin + ((LinearLayout.LayoutParams) c4713t08).bottomMargin, ((LinearLayout.LayoutParams) c4713t08).height);
                        if (((LinearLayout.LayoutParams) c4713t08).width == 0) {
                            i15 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i86 <= 0) {
                                    i86 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i86, 1073741824), childMeasureSpec2);
                                i68 = View.combineMeasuredStates(i68, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i86;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                        i68 = View.combineMeasuredStates(i68, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i13 = resolveSizeAndState2;
                    }
                    if (z24) {
                        abstractC4715u0.f39253y = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c4713t08).leftMargin + ((LinearLayout.LayoutParams) c4713t08).rightMargin + abstractC4715u0.f39253y;
                    } else {
                        int i87 = abstractC4715u0.f39253y;
                        abstractC4715u0.f39253y = Math.max(i87, childAt8.getMeasuredWidth() + i87 + ((LinearLayout.LayoutParams) c4713t08).leftMargin + ((LinearLayout.LayoutParams) c4713t08).rightMargin);
                    }
                    boolean z31 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c4713t08).height == -1;
                    int i88 = ((LinearLayout.LayoutParams) c4713t08).topMargin + ((LinearLayout.LayoutParams) c4713t08).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i88;
                    max4 = Math.max(max4, measuredHeight4);
                    if (!z31) {
                        i88 = measuredHeight4;
                    }
                    int max5 = Math.max(i79, i88);
                    if (z25) {
                        i14 = -1;
                        if (((LinearLayout.LayoutParams) c4713t08).height == -1) {
                            z3 = true;
                            if (!z29 && (baseline = childAt8.getBaseline()) != i14) {
                                int i89 = ((LinearLayout.LayoutParams) c4713t08).gravity;
                                if (i89 < 0) {
                                    i89 = abstractC4715u0.f39252x;
                                }
                                int i90 = (((i89 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i90] = Math.max(iArr5[i90], baseline);
                                iArr6[i90] = Math.max(iArr6[i90], measuredHeight4 - baseline);
                            }
                            z25 = z3;
                            i79 = max5;
                        }
                    } else {
                        i14 = -1;
                    }
                    z3 = false;
                    if (!z29) {
                    }
                    z25 = z3;
                    i79 = max5;
                }
                i85++;
                resolveSizeAndState2 = i13;
            }
            i9 = resolveSizeAndState2;
            i10 = -16777216;
            abstractC4715u0.f39253y = abstractC4715u0.getPaddingRight() + abstractC4715u0.getPaddingLeft() + abstractC4715u0.f39253y;
            int i91 = iArr5[1];
            if (i91 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) {
                i11 = 0;
            } else {
                i11 = 0;
                max4 = Math.max(max4, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i91, iArr5[c11]))));
            }
            i12 = i79;
        } else {
            i12 = Math.max(i79, i80);
            if (z30 && mode3 != 1073741824) {
                for (int i92 = 0; i92 < virtualChildCount2; i92++) {
                    View childAt9 = abstractC4715u0.getChildAt(i92);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C4713t0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i67, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i9 = resolveSizeAndState2;
            i10 = -16777216;
            i11 = 0;
        }
        if (!z25 && mode4 != 1073741824) {
            max4 = i12;
        }
        abstractC4715u0.setMeasuredDimension(i9 | (i68 & i10), View.resolveSizeAndState(Math.max(abstractC4715u0.getPaddingBottom() + abstractC4715u0.getPaddingTop() + max4, abstractC4715u0.getSuggestedMinimumHeight()), i6, i68 << 16));
        if (z26) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC4715u0.getMeasuredHeight(), 1073741824);
            int i93 = i11;
            while (i93 < virtualChildCount2) {
                View childAt10 = abstractC4715u0.getChildAt(i93);
                if (childAt10.getVisibility() != 8) {
                    C4713t0 c4713t09 = (C4713t0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c4713t09).height == -1) {
                        int i94 = ((LinearLayout.LayoutParams) c4713t09).width;
                        ((LinearLayout.LayoutParams) c4713t09).width = childAt10.getMeasuredWidth();
                        abstractC4715u0.measureChildWithMargins(childAt10, i62, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c4713t09).width = i94;
                    }
                }
                i93++;
                abstractC4715u0 = this;
                i62 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z3) {
        this.f39248n = z3;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f39249u = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f39243D) {
            return;
        }
        this.f39243D = drawable;
        if (drawable != null) {
            this.f39244E = drawable.getIntrinsicWidth();
            this.f39245F = drawable.getIntrinsicHeight();
        } else {
            this.f39244E = 0;
            this.f39245F = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f39247H = i;
    }

    public void setGravity(int i) {
        if (this.f39252x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f39252x = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i6 = i & 8388615;
        int i9 = this.f39252x;
        if ((8388615 & i9) != i6) {
            this.f39252x = i6 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f39240A = z3;
    }

    public void setOrientation(int i) {
        if (this.f39251w != i) {
            this.f39251w = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f39246G) {
            requestLayout();
        }
        this.f39246G = i;
    }

    public void setVerticalGravity(int i) {
        int i6 = i & 112;
        int i9 = this.f39252x;
        if ((i9 & 112) != i6) {
            this.f39252x = i6 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f39254z = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
