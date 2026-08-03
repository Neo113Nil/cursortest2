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
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class i0 extends ViewGroup {

    /* renamed from: g, reason: collision with root package name */
    public boolean f4332g;

    /* renamed from: h, reason: collision with root package name */
    public int f4333h;

    /* renamed from: i, reason: collision with root package name */
    public int f4334i;

    /* renamed from: j, reason: collision with root package name */
    public int f4335j;

    /* renamed from: k, reason: collision with root package name */
    public int f4336k;

    /* renamed from: l, reason: collision with root package name */
    public int f4337l;

    /* renamed from: m, reason: collision with root package name */
    public float f4338m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4339n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f4340o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f4341p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f4342q;

    /* renamed from: r, reason: collision with root package name */
    public int f4343r;

    /* renamed from: s, reason: collision with root package name */
    public int f4344s;

    /* renamed from: t, reason: collision with root package name */
    public int f4345t;

    /* renamed from: u, reason: collision with root package name */
    public int f4346u;

    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4332g = true;
        this.f4333h = -1;
        this.f4334i = 0;
        this.f4336k = 8388659;
        int[] iArr = i.a.f2919j;
        a5.c C = a5.c.C(context, attributeSet, iArr, i10);
        h3.w.a(this, context, iArr, attributeSet, (TypedArray) C.f261g, i10);
        TypedArray typedArray = (TypedArray) C.f261g;
        int i11 = typedArray.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f4338m = typedArray.getFloat(4, -1.0f);
        this.f4333h = typedArray.getInt(3, -1);
        this.f4339n = typedArray.getBoolean(7, false);
        setDividerDrawable(C.v(5));
        this.f4345t = typedArray.getInt(8, 0);
        this.f4346u = typedArray.getDimensionPixelSize(6, 0);
        C.F();
    }

    public final void b(Canvas canvas, int i10) {
        this.f4342q.setBounds(getPaddingLeft() + this.f4346u, i10, (getWidth() - getPaddingRight()) - this.f4346u, this.f4344s + i10);
        this.f4342q.draw(canvas);
    }

    public final void c(Canvas canvas, int i10) {
        this.f4342q.setBounds(i10, getPaddingTop() + this.f4346u, this.f4343r + i10, (getHeight() - getPaddingBottom()) - this.f4346u);
        this.f4342q.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof h0;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h0 generateDefaultLayoutParams() {
        int i10 = this.f4335j;
        if (i10 == 0) {
            return new h0(-2, -2);
        }
        if (i10 == 1) {
            return new h0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public h0 generateLayoutParams(AttributeSet attributeSet) {
        return new h0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public h0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new h0(layoutParams);
    }

    public final boolean g(int i10) {
        if (i10 == 0) {
            return (this.f4345t & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f4345t & 4) != 0;
        }
        if ((this.f4345t & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f4333h < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f4333h;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4333h == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i12 = this.f4334i;
        if (this.f4335j == 1 && (i10 = this.f4336k & 112) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4337l) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4337l;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((h0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4333h;
    }

    public Drawable getDividerDrawable() {
        return this.f4342q;
    }

    public int getDividerPadding() {
        return this.f4346u;
    }

    public int getDividerWidth() {
        return this.f4343r;
    }

    public int getGravity() {
        return this.f4336k;
    }

    public int getOrientation() {
        return this.f4335j;
    }

    public int getShowDividers() {
        return this.f4345t;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4338m;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        if (this.f4342q == null) {
            return;
        }
        int i11 = 0;
        if (this.f4335j == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && g(i11)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((h0) childAt.getLayoutParams())).topMargin) - this.f4344s);
                }
                i11++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4344s : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((h0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a6 = v1.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i11)) {
                h0 h0Var = (h0) childAt3.getLayoutParams();
                c(canvas, a6 ? childAt3.getRight() + ((LinearLayout.LayoutParams) h0Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) h0Var).leftMargin) - this.f4343r);
            }
            i11++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                h0 h0Var2 = (h0) childAt4.getLayoutParams();
                if (a6) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) h0Var2).leftMargin;
                    i10 = this.f4343r;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) h0Var2).rightMargin;
                }
            } else if (a6) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f4343r;
                right = left - i10;
            }
            c(canvas, right);
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char c3;
        int i23;
        int i24;
        int i25;
        int i26 = 8;
        char c7 = 2;
        if (this.f4335j == 1) {
            int paddingLeft = getPaddingLeft();
            int i27 = i12 - i10;
            int paddingRight = i27 - getPaddingRight();
            int paddingRight2 = (i27 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i28 = this.f4336k;
            int i29 = i28 & 112;
            int i30 = 8388615 & i28;
            int paddingTop = i29 != 16 ? i29 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f4337l : getPaddingTop() + (((i13 - i11) - this.f4337l) / 2);
            int i31 = 0;
            while (i31 < virtualChildCount) {
                View childAt = getChildAt(i31);
                if (childAt == null || childAt.getVisibility() == i26) {
                    c3 = c7;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    h0 h0Var = (h0) childAt.getLayoutParams();
                    c3 = c7;
                    int i32 = ((LinearLayout.LayoutParams) h0Var).gravity;
                    if (i32 < 0) {
                        i32 = i30;
                    }
                    Field field = h3.w.f2829a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i32, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i23 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) h0Var).leftMargin;
                        i24 = ((LinearLayout.LayoutParams) h0Var).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i25 = ((LinearLayout.LayoutParams) h0Var).leftMargin + paddingLeft;
                        if (g(i31)) {
                            paddingTop += this.f4344s;
                        }
                        int i33 = paddingTop + ((LinearLayout.LayoutParams) h0Var).topMargin;
                        childAt.layout(i25, i33, measuredWidth + i25, i33 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) h0Var).bottomMargin + i33;
                    } else {
                        i23 = paddingRight - measuredWidth;
                        i24 = ((LinearLayout.LayoutParams) h0Var).rightMargin;
                    }
                    i25 = i23 - i24;
                    if (g(i31)) {
                    }
                    int i332 = paddingTop + ((LinearLayout.LayoutParams) h0Var).topMargin;
                    childAt.layout(i25, i332, measuredWidth + i25, i332 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) h0Var).bottomMargin + i332;
                }
                i31++;
                c7 = c3;
                i26 = 8;
            }
            return;
        }
        boolean a6 = v1.a(this);
        int paddingTop2 = getPaddingTop();
        int i34 = i13 - i11;
        int paddingBottom = i34 - getPaddingBottom();
        int paddingBottom2 = (i34 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i35 = this.f4336k;
        int i36 = 8388615 & i35;
        int i37 = i35 & 112;
        boolean z11 = this.f4332g;
        int[] iArr = this.f4340o;
        int[] iArr2 = this.f4341p;
        Field field2 = h3.w.f2829a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i36, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f4337l : getPaddingLeft() + (((i12 - i10) - this.f4337l) / 2);
        if (a6) {
            i15 = virtualChildCount2 - 1;
            i14 = -1;
        } else {
            i14 = 1;
            i15 = 0;
        }
        int i38 = 0;
        while (i38 < virtualChildCount2) {
            int i39 = (i14 * i38) + i15;
            View childAt2 = getChildAt(i39);
            if (childAt2 == null) {
                i16 = i15;
            } else {
                i16 = i15;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    h0 h0Var2 = (h0) childAt2.getLayoutParams();
                    int i40 = paddingLeft2;
                    if (z11) {
                        i17 = paddingTop2;
                        if (((LinearLayout.LayoutParams) h0Var2).height != -1) {
                            i18 = childAt2.getBaseline();
                            i19 = ((LinearLayout.LayoutParams) h0Var2).gravity;
                            if (i19 < 0) {
                                i19 = i37;
                            }
                            i20 = i19 & 112;
                            if (i20 == 16) {
                                if (i20 == 48) {
                                    i21 = i17 + ((LinearLayout.LayoutParams) h0Var2).topMargin;
                                    if (i18 != -1) {
                                        i21 = (iArr[1] - i18) + i21;
                                    }
                                } else if (i20 != 80) {
                                    i21 = i17;
                                } else {
                                    i21 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) h0Var2).bottomMargin;
                                    if (i18 != -1) {
                                        i22 = iArr2[2] - (childAt2.getMeasuredHeight() - i18);
                                    }
                                }
                                int i41 = (g(i39) ? i40 + this.f4343r : i40) + ((LinearLayout.LayoutParams) h0Var2).leftMargin;
                                childAt2.layout(i41, i21, i41 + measuredWidth2, i21 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) h0Var2).rightMargin + i41;
                                i38++;
                                i15 = i16;
                                paddingTop2 = i17;
                            } else {
                                i21 = ((paddingBottom2 - measuredHeight2) / 2) + i17 + ((LinearLayout.LayoutParams) h0Var2).topMargin;
                                i22 = ((LinearLayout.LayoutParams) h0Var2).bottomMargin;
                            }
                            i21 -= i22;
                            int i412 = (g(i39) ? i40 + this.f4343r : i40) + ((LinearLayout.LayoutParams) h0Var2).leftMargin;
                            childAt2.layout(i412, i21, i412 + measuredWidth2, i21 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) h0Var2).rightMargin + i412;
                            i38++;
                            i15 = i16;
                            paddingTop2 = i17;
                        }
                    } else {
                        i17 = paddingTop2;
                    }
                    i18 = -1;
                    i19 = ((LinearLayout.LayoutParams) h0Var2).gravity;
                    if (i19 < 0) {
                    }
                    i20 = i19 & 112;
                    if (i20 == 16) {
                    }
                    i21 -= i22;
                    int i4122 = (g(i39) ? i40 + this.f4343r : i40) + ((LinearLayout.LayoutParams) h0Var2).leftMargin;
                    childAt2.layout(i4122, i21, i4122 + measuredWidth2, i21 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) h0Var2).rightMargin + i4122;
                    i38++;
                    i15 = i16;
                    paddingTop2 = i17;
                }
            }
            i17 = paddingTop2;
            i38++;
            i15 = i16;
            paddingTop2 = i17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int baseline;
        int i18;
        int i19;
        int[] iArr;
        int i20;
        int i21;
        boolean z11;
        boolean z12;
        h0 h0Var;
        int i22;
        int[] iArr2;
        int i23;
        View view;
        int i24;
        boolean z13;
        boolean z14;
        int max;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z15;
        int i33;
        int i34;
        int i35;
        View view2;
        boolean z16;
        boolean z17;
        i0 i0Var = this;
        int i36 = -2;
        int i37 = 0;
        int i38 = 1073741824;
        int i39 = 8;
        if (i0Var.f4335j == 1) {
            i0Var.f4337l = 0;
            int virtualChildCount = i0Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i40 = i0Var.f4333h;
            boolean z18 = i0Var.f4339n;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            boolean z19 = false;
            int i44 = 0;
            boolean z20 = false;
            boolean z21 = true;
            float f10 = 0.0f;
            int i45 = 0;
            while (i41 < virtualChildCount) {
                int i46 = mode;
                View childAt = i0Var.getChildAt(i41);
                if (childAt == null) {
                    i0Var.f4337l = i0Var.f4337l;
                } else if (childAt.getVisibility() != i39) {
                    if (i0Var.g(i41)) {
                        i0Var.f4337l += i0Var.f4344s;
                    }
                    h0 h0Var2 = (h0) childAt.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) h0Var2).weight;
                    f10 += f11;
                    if (mode2 == i38 && ((LinearLayout.LayoutParams) h0Var2).height == 0 && f11 > 0.0f) {
                        int i47 = i0Var.f4337l;
                        i0Var.f4337l = Math.max(i47, ((LinearLayout.LayoutParams) h0Var2).topMargin + i47 + ((LinearLayout.LayoutParams) h0Var2).bottomMargin);
                        view2 = childAt;
                        i32 = mode2;
                        i33 = i40;
                        z15 = z18;
                        i34 = i41;
                        z19 = true;
                        i35 = i46;
                    } else {
                        if (((LinearLayout.LayoutParams) h0Var2).height != 0 || f11 <= 0.0f) {
                            i29 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) h0Var2).height = i36;
                            i29 = 0;
                        }
                        if (f10 == 0.0f) {
                            i30 = i41;
                            i31 = i0Var.f4337l;
                        } else {
                            i30 = i41;
                            i31 = 0;
                        }
                        i32 = mode2;
                        z15 = z18;
                        i33 = i40;
                        i34 = i30;
                        i35 = i46;
                        i0Var.measureChildWithMargins(childAt, i10, 0, i11, i31);
                        if (i29 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) h0Var2).height = i29;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i48 = i0Var.f4337l;
                        view2 = childAt;
                        i0Var.f4337l = Math.max(i48, i48 + measuredHeight + ((LinearLayout.LayoutParams) h0Var2).topMargin + ((LinearLayout.LayoutParams) h0Var2).bottomMargin);
                        if (z15) {
                            i45 = Math.max(measuredHeight, i45);
                        }
                    }
                    if (i33 >= 0 && i33 == i34 + 1) {
                        i0Var.f4334i = i0Var.f4337l;
                    }
                    if (i34 < i33 && ((LinearLayout.LayoutParams) h0Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i35 == 1073741824 || ((LinearLayout.LayoutParams) h0Var2).width != -1) {
                        z16 = false;
                    } else {
                        z16 = true;
                        z20 = true;
                    }
                    int i49 = ((LinearLayout.LayoutParams) h0Var2).leftMargin + ((LinearLayout.LayoutParams) h0Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i49;
                    i37 = Math.max(i37, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z22 = z16;
                    int combineMeasuredStates = View.combineMeasuredStates(i44, measuredState);
                    if (z21) {
                        i44 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) h0Var2).width == -1) {
                            z17 = true;
                            if (((LinearLayout.LayoutParams) h0Var2).weight <= 0.0f) {
                                if (!z22) {
                                    i49 = measuredWidth;
                                }
                                i43 = Math.max(i43, i49);
                            } else {
                                if (!z22) {
                                    i49 = measuredWidth;
                                }
                                i42 = Math.max(i42, i49);
                            }
                            z21 = z17;
                            i41 = i34 + 1;
                            i40 = i33;
                            mode = i35;
                            z18 = z15;
                            mode2 = i32;
                            i36 = -2;
                            i38 = 1073741824;
                            i39 = 8;
                        }
                    } else {
                        i44 = combineMeasuredStates;
                    }
                    z17 = false;
                    if (((LinearLayout.LayoutParams) h0Var2).weight <= 0.0f) {
                    }
                    z21 = z17;
                    i41 = i34 + 1;
                    i40 = i33;
                    mode = i35;
                    z18 = z15;
                    mode2 = i32;
                    i36 = -2;
                    i38 = 1073741824;
                    i39 = 8;
                }
                i32 = mode2;
                i33 = i40;
                z15 = z18;
                i34 = i41;
                i35 = i46;
                i41 = i34 + 1;
                i40 = i33;
                mode = i35;
                z18 = z15;
                mode2 = i32;
                i36 = -2;
                i38 = 1073741824;
                i39 = 8;
            }
            int i50 = mode;
            int i51 = mode2;
            boolean z23 = z18;
            int i52 = i44;
            int i53 = i11;
            if (i0Var.f4337l > 0 && i0Var.g(virtualChildCount)) {
                i0Var.f4337l += i0Var.f4344s;
            }
            if (z23 && (i51 == Integer.MIN_VALUE || i51 == 0)) {
                i0Var.f4337l = 0;
                for (int i54 = 0; i54 < virtualChildCount; i54++) {
                    View childAt2 = i0Var.getChildAt(i54);
                    if (childAt2 == null) {
                        i0Var.f4337l = i0Var.f4337l;
                    } else if (childAt2.getVisibility() != 8) {
                        h0 h0Var3 = (h0) childAt2.getLayoutParams();
                        int i55 = i0Var.f4337l;
                        i0Var.f4337l = Math.max(i55, i55 + i45 + ((LinearLayout.LayoutParams) h0Var3).topMargin + ((LinearLayout.LayoutParams) h0Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = i0Var.getPaddingBottom() + i0Var.getPaddingTop() + i0Var.f4337l;
            i0Var.f4337l = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, i0Var.getSuggestedMinimumHeight()), i53, 0);
            int i56 = (resolveSizeAndState & 16777215) - i0Var.f4337l;
            if (z19 || (i56 != 0 && f10 > 0.0f)) {
                float f12 = i0Var.f4338m;
                if (f12 > 0.0f) {
                    f10 = f12;
                }
                i0Var.f4337l = 0;
                int i57 = i52;
                int i58 = 0;
                while (i58 < virtualChildCount) {
                    View childAt3 = i0Var.getChildAt(i58);
                    if (childAt3.getVisibility() == 8) {
                        i26 = i58;
                    } else {
                        h0 h0Var4 = (h0) childAt3.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) h0Var4).weight;
                        if (f13 > 0.0f) {
                            int i59 = (int) ((i56 * f13) / f10);
                            f10 -= f13;
                            i56 -= i59;
                            i26 = i58;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i0Var.getPaddingRight() + i0Var.getPaddingLeft() + ((LinearLayout.LayoutParams) h0Var4).leftMargin + ((LinearLayout.LayoutParams) h0Var4).rightMargin, ((LinearLayout.LayoutParams) h0Var4).width);
                            if (((LinearLayout.LayoutParams) h0Var4).height == 0) {
                                i28 = 1073741824;
                                if (i51 == 1073741824) {
                                    if (i59 <= 0) {
                                        i59 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i59, 1073741824));
                                    i57 = View.combineMeasuredStates(i57, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i28 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i59;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i28));
                            i57 = View.combineMeasuredStates(i57, childAt3.getMeasuredState() & (-256));
                        } else {
                            i26 = i58;
                        }
                        int i60 = ((LinearLayout.LayoutParams) h0Var4).leftMargin + ((LinearLayout.LayoutParams) h0Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i60;
                        i37 = Math.max(i37, measuredWidth2);
                        if (i50 != 1073741824) {
                            i27 = -1;
                            if (((LinearLayout.LayoutParams) h0Var4).width == -1) {
                                measuredWidth2 = i60;
                            }
                        } else {
                            i27 = -1;
                        }
                        i42 = Math.max(i42, measuredWidth2);
                        boolean z24 = z21 && ((LinearLayout.LayoutParams) h0Var4).width == i27;
                        int i61 = i0Var.f4337l;
                        i0Var.f4337l = Math.max(i61, childAt3.getMeasuredHeight() + i61 + ((LinearLayout.LayoutParams) h0Var4).topMargin + ((LinearLayout.LayoutParams) h0Var4).bottomMargin);
                        z21 = z24;
                    }
                    i58 = i26 + 1;
                }
                i0Var.f4337l = i0Var.getPaddingBottom() + i0Var.getPaddingTop() + i0Var.f4337l;
                i52 = i57;
            } else {
                i42 = Math.max(i42, i43);
                if (z23 && i51 != 1073741824) {
                    for (int i62 = 0; i62 < virtualChildCount; i62++) {
                        View childAt4 = i0Var.getChildAt(i62);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((h0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i45, 1073741824));
                        }
                    }
                }
            }
            if (z21 || i50 == 1073741824) {
                i42 = i37;
            }
            i0Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(i0Var.getPaddingRight() + i0Var.getPaddingLeft() + i42, i0Var.getSuggestedMinimumWidth()), i10, i52), resolveSizeAndState);
            if (z20) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i0Var.getMeasuredWidth(), 1073741824);
                int i63 = 0;
                while (i63 < virtualChildCount) {
                    View childAt5 = i0Var.getChildAt(i63);
                    if (childAt5.getVisibility() != 8) {
                        h0 h0Var5 = (h0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) h0Var5).width == -1) {
                            int i64 = ((LinearLayout.LayoutParams) h0Var5).height;
                            ((LinearLayout.LayoutParams) h0Var5).height = childAt5.getMeasuredHeight();
                            i0Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i53, 0);
                            ((LinearLayout.LayoutParams) h0Var5).height = i64;
                        }
                    }
                    i63++;
                    i53 = i11;
                }
                return;
            }
            return;
        }
        int i65 = i10;
        i0Var.f4337l = 0;
        int virtualChildCount2 = i0Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i65);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (i0Var.f4340o == null || i0Var.f4341p == null) {
            i0Var.f4340o = new int[4];
            i0Var.f4341p = new int[4];
        }
        int[] iArr3 = i0Var.f4340o;
        int[] iArr4 = i0Var.f4341p;
        iArr3[3] = -1;
        char c3 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z25 = i0Var.f4332g;
        boolean z26 = i0Var.f4339n;
        boolean z27 = mode3 == 1073741824;
        float f14 = 0.0f;
        boolean z28 = true;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        boolean z29 = false;
        boolean z30 = false;
        while (i66 < virtualChildCount2) {
            char c7 = c3;
            View childAt6 = i0Var.getChildAt(i66);
            if (childAt6 == null) {
                i0Var.f4337l = i0Var.f4337l;
                i21 = i66;
                i25 = i68;
                iArr2 = iArr3;
                iArr = iArr4;
                z11 = z25;
                z12 = z26;
            } else {
                int i72 = i67;
                if (childAt6.getVisibility() == 8) {
                    i65 = i10;
                    i21 = i66;
                    i25 = i68;
                    iArr = iArr4;
                    z11 = z25;
                    z12 = z26;
                    i67 = i72;
                    iArr2 = iArr3;
                } else {
                    if (i0Var.g(i66)) {
                        i0Var.f4337l += i0Var.f4343r;
                    }
                    h0 h0Var6 = (h0) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) h0Var6).weight;
                    f14 += f15;
                    int i73 = i66;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) h0Var6).width == 0 && f15 > 0.0f) {
                        if (z27) {
                            i0Var.f4337l = ((LinearLayout.LayoutParams) h0Var6).leftMargin + ((LinearLayout.LayoutParams) h0Var6).rightMargin + i0Var.f4337l;
                        } else {
                            int i74 = i0Var.f4337l;
                            i0Var.f4337l = Math.max(i74, ((LinearLayout.LayoutParams) h0Var6).leftMargin + i74 + ((LinearLayout.LayoutParams) h0Var6).rightMargin);
                        }
                        if (z25) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            i22 = i72;
                            i21 = i73;
                            h0Var = h0Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i65 = i10;
                            i23 = i68;
                            i20 = i69;
                        } else {
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            z30 = true;
                            i22 = i72;
                            i21 = i73;
                            i24 = 1073741824;
                            h0Var = h0Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i65 = i10;
                            i23 = i68;
                            i20 = i69;
                            if (mode4 == i24 && ((LinearLayout.LayoutParams) h0Var).height == -1) {
                                z13 = true;
                                z29 = true;
                            } else {
                                z13 = false;
                            }
                            int i75 = ((LinearLayout.LayoutParams) h0Var).topMargin + ((LinearLayout.LayoutParams) h0Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i75;
                            i71 = View.combineMeasuredStates(i71, view.getMeasuredState());
                            if (z11) {
                                z14 = z13;
                            } else {
                                int baseline2 = view.getBaseline();
                                z14 = z13;
                                if (baseline2 != -1) {
                                    int i76 = ((LinearLayout.LayoutParams) h0Var).gravity;
                                    if (i76 < 0) {
                                        i76 = i0Var.f4336k;
                                    }
                                    int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i77] = Math.max(iArr2[i77], baseline2);
                                    iArr[i77] = Math.max(iArr[i77], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i22, measuredHeight3);
                            boolean z31 = !z28 && ((LinearLayout.LayoutParams) h0Var).height == -1;
                            if (((LinearLayout.LayoutParams) h0Var).weight <= 0.0f) {
                                if (!z14) {
                                    i75 = measuredHeight3;
                                }
                                i69 = Math.max(i20, i75);
                                max = i23;
                            } else {
                                if (!z14) {
                                    i75 = measuredHeight3;
                                }
                                max = Math.max(i23, i75);
                                i69 = i20;
                            }
                            int i78 = max;
                            i67 = max2;
                            i25 = i78;
                            z28 = z31;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) h0Var6).width != 0 || f15 <= 0.0f) {
                            i19 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) h0Var6).width = -2;
                            i19 = 0;
                        }
                        iArr = iArr4;
                        i20 = i69;
                        i21 = i73;
                        z11 = z25;
                        z12 = z26;
                        int i79 = i19;
                        h0Var = h0Var6;
                        i22 = i72;
                        i65 = i10;
                        iArr2 = iArr3;
                        i23 = i68;
                        i0Var.measureChildWithMargins(childAt6, i65, f14 == 0.0f ? i0Var.f4337l : 0, i11, 0);
                        if (i79 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) h0Var).width = i79;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z27) {
                            view = childAt6;
                            i0Var.f4337l = ((LinearLayout.LayoutParams) h0Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) h0Var).rightMargin + i0Var.f4337l;
                        } else {
                            view = childAt6;
                            int i80 = i0Var.f4337l;
                            i0Var.f4337l = Math.max(i80, i80 + measuredWidth3 + ((LinearLayout.LayoutParams) h0Var).leftMargin + ((LinearLayout.LayoutParams) h0Var).rightMargin);
                        }
                        if (z12) {
                            i70 = Math.max(measuredWidth3, i70);
                        }
                    }
                    i24 = 1073741824;
                    if (mode4 == i24) {
                    }
                    z13 = false;
                    int i752 = ((LinearLayout.LayoutParams) h0Var).topMargin + ((LinearLayout.LayoutParams) h0Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i752;
                    i71 = View.combineMeasuredStates(i71, view.getMeasuredState());
                    if (z11) {
                    }
                    int max22 = Math.max(i22, measuredHeight32);
                    if (z28) {
                    }
                    if (((LinearLayout.LayoutParams) h0Var).weight <= 0.0f) {
                    }
                    int i782 = max;
                    i67 = max22;
                    i25 = i782;
                    z28 = z31;
                }
            }
            i68 = i25;
            i66 = i21 + 1;
            c3 = c7;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z11;
            z26 = z12;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c10 = c3;
        boolean z32 = z25;
        boolean z33 = z26;
        int i81 = i67;
        int i82 = i68;
        int i83 = i69;
        if (i0Var.f4337l > 0 && i0Var.g(virtualChildCount2)) {
            i0Var.f4337l += i0Var.f4343r;
        }
        int i84 = iArr5[1];
        int max3 = (i84 == -1 && iArr5[0] == -1 && iArr5[c10] == -1 && iArr5[3] == -1) ? i81 : Math.max(i81, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c10]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i84, iArr5[c10]))));
        if (z33 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            i0Var.f4337l = 0;
            for (int i85 = 0; i85 < virtualChildCount2; i85++) {
                View childAt7 = i0Var.getChildAt(i85);
                if (childAt7 == null) {
                    i0Var.f4337l = i0Var.f4337l;
                } else if (childAt7.getVisibility() != 8) {
                    h0 h0Var7 = (h0) childAt7.getLayoutParams();
                    if (z27) {
                        i0Var.f4337l = ((LinearLayout.LayoutParams) h0Var7).leftMargin + i70 + ((LinearLayout.LayoutParams) h0Var7).rightMargin + i0Var.f4337l;
                    } else {
                        int i86 = i0Var.f4337l;
                        i0Var.f4337l = Math.max(i86, i86 + i70 + ((LinearLayout.LayoutParams) h0Var7).leftMargin + ((LinearLayout.LayoutParams) h0Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = i0Var.getPaddingRight() + i0Var.getPaddingLeft() + i0Var.f4337l;
        i0Var.f4337l = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, i0Var.getSuggestedMinimumWidth()), i65, 0);
        int i87 = (resolveSizeAndState2 & 16777215) - i0Var.f4337l;
        if (z30 || (i87 != 0 && f14 > 0.0f)) {
            float f16 = i0Var.f4338m;
            if (f16 > 0.0f) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[c10] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c10] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            i0Var.f4337l = 0;
            max3 = -1;
            int i88 = 0;
            while (i88 < virtualChildCount2) {
                View childAt8 = i0Var.getChildAt(i88);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i16 = resolveSizeAndState2;
                } else {
                    h0 h0Var8 = (h0) childAt8.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) h0Var8).weight;
                    if (f17 > 0.0f) {
                        int i89 = (int) ((i87 * f17) / f14);
                        f14 -= f17;
                        i87 -= i89;
                        i16 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, i0Var.getPaddingBottom() + i0Var.getPaddingTop() + ((LinearLayout.LayoutParams) h0Var8).topMargin + ((LinearLayout.LayoutParams) h0Var8).bottomMargin, ((LinearLayout.LayoutParams) h0Var8).height);
                        if (((LinearLayout.LayoutParams) h0Var8).width == 0) {
                            i18 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i89 <= 0) {
                                    i89 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i89, 1073741824), childMeasureSpec2);
                                i71 = View.combineMeasuredStates(i71, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i18 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i89;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i18), childMeasureSpec2);
                        i71 = View.combineMeasuredStates(i71, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i16 = resolveSizeAndState2;
                    }
                    if (z27) {
                        i0Var.f4337l = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) h0Var8).leftMargin + ((LinearLayout.LayoutParams) h0Var8).rightMargin + i0Var.f4337l;
                    } else {
                        int i90 = i0Var.f4337l;
                        i0Var.f4337l = Math.max(i90, childAt8.getMeasuredWidth() + i90 + ((LinearLayout.LayoutParams) h0Var8).leftMargin + ((LinearLayout.LayoutParams) h0Var8).rightMargin);
                    }
                    boolean z34 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) h0Var8).height == -1;
                    int i91 = ((LinearLayout.LayoutParams) h0Var8).topMargin + ((LinearLayout.LayoutParams) h0Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i91;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z34) {
                        i91 = measuredHeight4;
                    }
                    int max4 = Math.max(i82, i91);
                    if (z28) {
                        i17 = -1;
                        if (((LinearLayout.LayoutParams) h0Var8).height == -1) {
                            z10 = true;
                            if (!z32 && (baseline = childAt8.getBaseline()) != i17) {
                                int i92 = ((LinearLayout.LayoutParams) h0Var8).gravity;
                                if (i92 < 0) {
                                    i92 = i0Var.f4336k;
                                }
                                int i93 = (((i92 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i93] = Math.max(iArr5[i93], baseline);
                                iArr6[i93] = Math.max(iArr6[i93], measuredHeight4 - baseline);
                            }
                            z28 = z10;
                            i82 = max4;
                        }
                    } else {
                        i17 = -1;
                    }
                    z10 = false;
                    if (!z32) {
                    }
                    z28 = z10;
                    i82 = max4;
                }
                i88++;
                resolveSizeAndState2 = i16;
            }
            i12 = resolveSizeAndState2;
            i13 = -16777216;
            i0Var.f4337l = i0Var.getPaddingRight() + i0Var.getPaddingLeft() + i0Var.f4337l;
            int i94 = iArr5[1];
            if (i94 == -1 && iArr5[0] == -1 && iArr5[c10] == -1 && iArr5[3] == -1) {
                i14 = 0;
            } else {
                i14 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c10]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i94, iArr5[c10]))));
            }
            i15 = i82;
        } else {
            i15 = Math.max(i82, i83);
            if (z33 && mode3 != 1073741824) {
                for (int i95 = 0; i95 < virtualChildCount2; i95++) {
                    View childAt9 = i0Var.getChildAt(i95);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((h0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i70, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = resolveSizeAndState2;
            i13 = -16777216;
            i14 = 0;
        }
        if (!z28 && mode4 != 1073741824) {
            max3 = i15;
        }
        i0Var.setMeasuredDimension(i12 | (i71 & i13), View.resolveSizeAndState(Math.max(i0Var.getPaddingBottom() + i0Var.getPaddingTop() + max3, i0Var.getSuggestedMinimumHeight()), i11, i71 << 16));
        if (z29) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i0Var.getMeasuredHeight(), 1073741824);
            int i96 = i14;
            while (i96 < virtualChildCount2) {
                View childAt10 = i0Var.getChildAt(i96);
                if (childAt10.getVisibility() != 8) {
                    h0 h0Var9 = (h0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) h0Var9).height == -1) {
                        int i97 = ((LinearLayout.LayoutParams) h0Var9).width;
                        ((LinearLayout.LayoutParams) h0Var9).width = childAt10.getMeasuredWidth();
                        i0Var.measureChildWithMargins(childAt10, i65, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) h0Var9).width = i97;
                    }
                }
                i96++;
                i0Var = this;
                i65 = i10;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f4332g = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f4333h = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4342q) {
            return;
        }
        this.f4342q = drawable;
        if (drawable != null) {
            this.f4343r = drawable.getIntrinsicWidth();
            this.f4344s = drawable.getIntrinsicHeight();
        } else {
            this.f4343r = 0;
            this.f4344s = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f4346u = i10;
    }

    public void setGravity(int i10) {
        if (this.f4336k != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f4336k = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f4336k;
        if ((8388615 & i12) != i11) {
            this.f4336k = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f4339n = z10;
    }

    public void setOrientation(int i10) {
        if (this.f4335j != i10) {
            this.f4335j = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f4345t) {
            requestLayout();
        }
        this.f4345t = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f4336k;
        if ((i12 & 112) != i11) {
            this.f4336k = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f4338m = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
