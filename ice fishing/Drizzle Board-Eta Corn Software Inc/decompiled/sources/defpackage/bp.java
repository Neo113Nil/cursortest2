package defpackage;

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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class bp extends ViewGroup {
    public int MdtA4re8;
    public boolean NCTxEWno;
    public int OnDfzHZD;
    public int P7K7Inc8;
    public float Qr9iLBAD;
    public int VgvYg0wo;
    public int b2ZJblxo;
    public int[] eVhOlqcC;
    public boolean jb9XjC4I;
    public int[] k3x7lurq;
    public int lDXGDhIF;
    public Drawable ow5vqvCr;
    public int sjUBp5pO;
    public int wxUZMvaN;
    public int ygLcUYwZ;

    public bp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.NCTxEWno = true;
        this.MdtA4re8 = -1;
        this.wxUZMvaN = 0;
        this.P7K7Inc8 = 8388659;
        int[] iArr = z00.ygLcUYwZ;
        f0 Mq3SeTnW = f0.Mq3SeTnW(context, attributeSet, iArr, 0);
        hg0.jb9XjC4I(this, context, iArr, attributeSet, (TypedArray) Mq3SeTnW.MdtA4re8, 0);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.Qr9iLBAD = typedArray.getFloat(4, -1.0f);
        this.MdtA4re8 = typedArray.getInt(3, -1);
        this.jb9XjC4I = typedArray.getBoolean(7, false);
        setDividerDrawable(Mq3SeTnW.OxcuoDLp(5));
        this.lDXGDhIF = typedArray.getInt(8, 0);
        this.sjUBp5pO = typedArray.getDimensionPixelSize(6, 0);
        Mq3SeTnW.SgZGMMPL();
    }

    public final void MdtA4re8(Canvas canvas, int i) {
        this.ow5vqvCr.setBounds(getPaddingLeft() + this.sjUBp5pO, i, (getWidth() - getPaddingRight()) - this.sjUBp5pO, this.ygLcUYwZ + i);
        this.ow5vqvCr.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: P7K7Inc8, reason: merged with bridge method [inline-methods] */
    public ap generateLayoutParams(AttributeSet attributeSet) {
        return new ap(getContext(), attributeSet);
    }

    public final boolean Qr9iLBAD(int i) {
        if (i == 0) {
            return (this.lDXGDhIF & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.lDXGDhIF;
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

    @Override // android.view.ViewGroup
    /* renamed from: VgvYg0wo, reason: merged with bridge method [inline-methods] */
    public ap generateDefaultLayoutParams() {
        int i = this.VgvYg0wo;
        if (i == 0) {
            return new ap(-2, -2);
        }
        if (i == 1) {
            return new ap(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: b2ZJblxo, reason: merged with bridge method [inline-methods] */
    public ap generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ap ? new ap((ap) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ap((ViewGroup.MarginLayoutParams) layoutParams) : new ap(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ap;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.MdtA4re8 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.MdtA4re8;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.MdtA4re8 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.wxUZMvaN;
        if (this.VgvYg0wo == 1 && (i = this.P7K7Inc8 & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.b2ZJblxo) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.b2ZJblxo;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((ap) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.MdtA4re8;
    }

    public Drawable getDividerDrawable() {
        return this.ow5vqvCr;
    }

    public int getDividerPadding() {
        return this.sjUBp5pO;
    }

    public int getDividerWidth() {
        return this.OnDfzHZD;
    }

    public int getGravity() {
        return this.P7K7Inc8;
    }

    public int getOrientation() {
        return this.VgvYg0wo;
    }

    public int getShowDividers() {
        return this.lDXGDhIF;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.Qr9iLBAD;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.ow5vqvCr == null) {
            return;
        }
        int i2 = 0;
        if (this.VgvYg0wo == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && Qr9iLBAD(i2)) {
                    MdtA4re8(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((ap) childAt.getLayoutParams())).topMargin) - this.ygLcUYwZ);
                }
                i2++;
            }
            if (Qr9iLBAD(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                MdtA4re8(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.ygLcUYwZ : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((ap) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = fh0.qoPGr6Ce;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && Qr9iLBAD(i2)) {
                ap apVar = (ap) childAt3.getLayoutParams();
                wxUZMvaN(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) apVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) apVar).leftMargin) - this.OnDfzHZD);
            }
            i2++;
        }
        if (Qr9iLBAD(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                ap apVar2 = (ap) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) apVar2).leftMargin;
                    i = this.OnDfzHZD;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) apVar2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.OnDfzHZD;
                right = left - i;
            }
            wxUZMvaN(canvas, right);
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
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        char c2 = 2;
        if (this.VgvYg0wo == 1) {
            int paddingLeft = getPaddingLeft();
            int i18 = i3 - i;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.P7K7Inc8;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            int paddingTop = i20 != 16 ? i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.b2ZJblxo : getPaddingTop() + (((i4 - i2) - this.b2ZJblxo) / 2);
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt == null || childAt.getVisibility() == i17) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    ap apVar = (ap) childAt.getLayoutParams();
                    c = c2;
                    int i23 = ((LinearLayout.LayoutParams) apVar).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) apVar).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) apVar).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) apVar).leftMargin + paddingLeft;
                        if (Qr9iLBAD(i22)) {
                            paddingTop += this.ygLcUYwZ;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) apVar).topMargin;
                        childAt.layout(i16, i24, measuredWidth + i16, i24 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) apVar).bottomMargin + i24;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) apVar).rightMargin;
                    }
                    i16 = i14 - i15;
                    if (Qr9iLBAD(i22)) {
                    }
                    int i242 = paddingTop + ((LinearLayout.LayoutParams) apVar).topMargin;
                    childAt.layout(i16, i242, measuredWidth + i16, i242 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) apVar).bottomMargin + i242;
                }
                i22++;
                c2 = c;
                i17 = 8;
            }
            return;
        }
        boolean z2 = fh0.qoPGr6Ce;
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.P7K7Inc8;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z4 = this.NCTxEWno;
        int[] iArr = this.eVhOlqcC;
        int[] iArr2 = this.k3x7lurq;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.b2ZJblxo : getPaddingLeft() + (((i3 - i) - this.b2ZJblxo) / 2);
        if (z3) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i5 * i29) + i6;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    ap apVar2 = (ap) childAt2.getLayoutParams();
                    int i31 = paddingLeft2;
                    if (z4) {
                        i8 = paddingTop2;
                        if (((LinearLayout.LayoutParams) apVar2).height != -1) {
                            i9 = childAt2.getBaseline();
                            i10 = ((LinearLayout.LayoutParams) apVar2).gravity;
                            if (i10 < 0) {
                                i10 = i28;
                            }
                            i11 = i10 & 112;
                            if (i11 == 16) {
                                if (i11 == 48) {
                                    i12 = i8 + ((LinearLayout.LayoutParams) apVar2).topMargin;
                                    if (i9 != -1) {
                                        i12 = (iArr[1] - i9) + i12;
                                    }
                                } else if (i11 != 80) {
                                    i12 = i8;
                                } else {
                                    i12 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) apVar2).bottomMargin;
                                    if (i9 != -1) {
                                        i13 = iArr2[2] - (childAt2.getMeasuredHeight() - i9);
                                    }
                                }
                                int i32 = (Qr9iLBAD(i30) ? i31 + this.OnDfzHZD : i31) + ((LinearLayout.LayoutParams) apVar2).leftMargin;
                                childAt2.layout(i32, i12, i32 + measuredWidth2, i12 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) apVar2).rightMargin + i32;
                                i29++;
                                i6 = i7;
                                paddingTop2 = i8;
                            } else {
                                i12 = ((paddingBottom2 - measuredHeight2) / 2) + i8 + ((LinearLayout.LayoutParams) apVar2).topMargin;
                                i13 = ((LinearLayout.LayoutParams) apVar2).bottomMargin;
                            }
                            i12 -= i13;
                            int i322 = (Qr9iLBAD(i30) ? i31 + this.OnDfzHZD : i31) + ((LinearLayout.LayoutParams) apVar2).leftMargin;
                            childAt2.layout(i322, i12, i322 + measuredWidth2, i12 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) apVar2).rightMargin + i322;
                            i29++;
                            i6 = i7;
                            paddingTop2 = i8;
                        }
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = -1;
                    i10 = ((LinearLayout.LayoutParams) apVar2).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    if (i11 == 16) {
                    }
                    i12 -= i13;
                    int i3222 = (Qr9iLBAD(i30) ? i31 + this.OnDfzHZD : i31) + ((LinearLayout.LayoutParams) apVar2).leftMargin;
                    childAt2.layout(i3222, i12, i3222 + measuredWidth2, i12 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) apVar2).rightMargin + i3222;
                    i29++;
                    i6 = i7;
                    paddingTop2 = i8;
                }
            }
            i8 = paddingTop2;
            i29++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int[] iArr;
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
        int[] iArr2;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        ap apVar;
        int i13;
        int[] iArr3;
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
        bp bpVar = this;
        int i27 = -2;
        int i28 = 0;
        int i29 = 1073741824;
        int i30 = 8;
        if (bpVar.VgvYg0wo == 1) {
            bpVar.b2ZJblxo = 0;
            int virtualChildCount = bpVar.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i31 = bpVar.MdtA4re8;
            boolean z9 = bpVar.jb9XjC4I;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            boolean z10 = false;
            int i35 = 0;
            boolean z11 = false;
            boolean z12 = true;
            float f = 0.0f;
            int i36 = 0;
            while (i32 < virtualChildCount) {
                int i37 = mode;
                View childAt = bpVar.getChildAt(i32);
                if (childAt == null) {
                    bpVar.b2ZJblxo = bpVar.b2ZJblxo;
                } else if (childAt.getVisibility() != i30) {
                    if (bpVar.Qr9iLBAD(i32)) {
                        bpVar.b2ZJblxo += bpVar.ygLcUYwZ;
                    }
                    ap apVar2 = (ap) childAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) apVar2).weight;
                    f += f2;
                    if (mode2 == i29 && ((LinearLayout.LayoutParams) apVar2).height == 0 && f2 > 0.0f) {
                        int i38 = bpVar.b2ZJblxo;
                        bpVar.b2ZJblxo = Math.max(i38, ((LinearLayout.LayoutParams) apVar2).topMargin + i38 + ((LinearLayout.LayoutParams) apVar2).bottomMargin);
                        view2 = childAt;
                        i23 = mode2;
                        i24 = i31;
                        z6 = z9;
                        i25 = i32;
                        z10 = true;
                        i26 = i37;
                    } else {
                        if (((LinearLayout.LayoutParams) apVar2).height != 0 || f2 <= 0.0f) {
                            i20 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) apVar2).height = i27;
                            i20 = 0;
                        }
                        if (f == 0.0f) {
                            i21 = i32;
                            i22 = bpVar.b2ZJblxo;
                        } else {
                            i21 = i32;
                            i22 = 0;
                        }
                        i23 = mode2;
                        z6 = z9;
                        i24 = i31;
                        i25 = i21;
                        i26 = i37;
                        bpVar.measureChildWithMargins(childAt, i, 0, i2, i22);
                        if (i20 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) apVar2).height = i20;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i39 = bpVar.b2ZJblxo;
                        view2 = childAt;
                        bpVar.b2ZJblxo = Math.max(i39, i39 + measuredHeight + ((LinearLayout.LayoutParams) apVar2).topMargin + ((LinearLayout.LayoutParams) apVar2).bottomMargin);
                        if (z6) {
                            i36 = Math.max(measuredHeight, i36);
                        }
                    }
                    if (i24 >= 0 && i24 == i25 + 1) {
                        bpVar.wxUZMvaN = bpVar.b2ZJblxo;
                    }
                    if (i25 < i24 && ((LinearLayout.LayoutParams) apVar2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i26 == 1073741824 || ((LinearLayout.LayoutParams) apVar2).width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                        z11 = true;
                    }
                    int i40 = ((LinearLayout.LayoutParams) apVar2).leftMargin + ((LinearLayout.LayoutParams) apVar2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i40;
                    i28 = Math.max(i28, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z13 = z7;
                    int combineMeasuredStates = View.combineMeasuredStates(i35, measuredState);
                    if (z12) {
                        i35 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) apVar2).width == -1) {
                            z8 = true;
                            if (((LinearLayout.LayoutParams) apVar2).weight <= 0.0f) {
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
                    if (((LinearLayout.LayoutParams) apVar2).weight <= 0.0f) {
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
            if (bpVar.b2ZJblxo > 0 && bpVar.Qr9iLBAD(virtualChildCount)) {
                bpVar.b2ZJblxo += bpVar.ygLcUYwZ;
            }
            if (z14 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                bpVar.b2ZJblxo = 0;
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View childAt2 = bpVar.getChildAt(i45);
                    if (childAt2 == null) {
                        bpVar.b2ZJblxo = bpVar.b2ZJblxo;
                    } else if (childAt2.getVisibility() != 8) {
                        ap apVar3 = (ap) childAt2.getLayoutParams();
                        int i46 = bpVar.b2ZJblxo;
                        bpVar.b2ZJblxo = Math.max(i46, i46 + i36 + ((LinearLayout.LayoutParams) apVar3).topMargin + ((LinearLayout.LayoutParams) apVar3).bottomMargin);
                    }
                }
            }
            int paddingBottom = bpVar.getPaddingBottom() + bpVar.getPaddingTop() + bpVar.b2ZJblxo;
            bpVar.b2ZJblxo = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, bpVar.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (resolveSizeAndState & 16777215) - bpVar.b2ZJblxo;
            if (z10 || (i47 != 0 && f > 0.0f)) {
                float f3 = bpVar.Qr9iLBAD;
                if (f3 > 0.0f) {
                    f = f3;
                }
                bpVar.b2ZJblxo = 0;
                int i48 = i43;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt3 = bpVar.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i17 = i49;
                    } else {
                        ap apVar4 = (ap) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) apVar4).weight;
                        if (f4 > 0.0f) {
                            int i50 = (int) ((i47 * f4) / f);
                            f -= f4;
                            i47 -= i50;
                            i17 = i49;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, bpVar.getPaddingRight() + bpVar.getPaddingLeft() + ((LinearLayout.LayoutParams) apVar4).leftMargin + ((LinearLayout.LayoutParams) apVar4).rightMargin, ((LinearLayout.LayoutParams) apVar4).width);
                            if (((LinearLayout.LayoutParams) apVar4).height == 0) {
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
                        int i51 = ((LinearLayout.LayoutParams) apVar4).leftMargin + ((LinearLayout.LayoutParams) apVar4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        i28 = Math.max(i28, measuredWidth2);
                        if (i41 != 1073741824) {
                            i18 = -1;
                            if (((LinearLayout.LayoutParams) apVar4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i18 = -1;
                        }
                        i33 = Math.max(i33, measuredWidth2);
                        boolean z15 = z12 && ((LinearLayout.LayoutParams) apVar4).width == i18;
                        int i52 = bpVar.b2ZJblxo;
                        bpVar.b2ZJblxo = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) apVar4).topMargin + ((LinearLayout.LayoutParams) apVar4).bottomMargin);
                        z12 = z15;
                    }
                    i49 = i17 + 1;
                }
                bpVar.b2ZJblxo = bpVar.getPaddingBottom() + bpVar.getPaddingTop() + bpVar.b2ZJblxo;
                i43 = i48;
            } else {
                i33 = Math.max(i33, i34);
                if (z14 && i42 != 1073741824) {
                    for (int i53 = 0; i53 < virtualChildCount; i53++) {
                        View childAt4 = bpVar.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((ap) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                        }
                    }
                }
            }
            if (z12 || i41 == 1073741824) {
                i33 = i28;
            }
            bpVar.setMeasuredDimension(View.resolveSizeAndState(Math.max(bpVar.getPaddingRight() + bpVar.getPaddingLeft() + i33, bpVar.getSuggestedMinimumWidth()), i, i43), resolveSizeAndState);
            if (z11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bpVar.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt5 = bpVar.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        ap apVar5 = (ap) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) apVar5).width == -1) {
                            int i55 = ((LinearLayout.LayoutParams) apVar5).height;
                            ((LinearLayout.LayoutParams) apVar5).height = childAt5.getMeasuredHeight();
                            bpVar.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i44, 0);
                            ((LinearLayout.LayoutParams) apVar5).height = i55;
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
        bpVar.b2ZJblxo = 0;
        int virtualChildCount2 = bpVar.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i2);
        int[] iArr4 = bpVar.eVhOlqcC;
        if (iArr4 == null || (iArr = bpVar.k3x7lurq) == null) {
            iArr4 = new int[4];
            bpVar.eVhOlqcC = iArr4;
            iArr = new int[4];
            bpVar.k3x7lurq = iArr;
        }
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr;
        iArr5[3] = -1;
        char c = 2;
        iArr5[2] = -1;
        iArr5[1] = -1;
        iArr5[0] = -1;
        iArr6[3] = -1;
        iArr6[2] = -1;
        iArr6[1] = -1;
        iArr6[0] = -1;
        boolean z16 = bpVar.NCTxEWno;
        boolean z17 = bpVar.jb9XjC4I;
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
        while (i57 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = bpVar.getChildAt(i57);
            if (childAt6 == null) {
                bpVar.b2ZJblxo = bpVar.b2ZJblxo;
                i12 = i57;
                i16 = i59;
                iArr3 = iArr5;
                iArr2 = iArr6;
                z2 = z16;
                z3 = z17;
            } else {
                int i63 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i;
                    i12 = i57;
                    i16 = i59;
                    iArr2 = iArr6;
                    z2 = z16;
                    z3 = z17;
                    i58 = i63;
                    iArr3 = iArr5;
                } else {
                    if (bpVar.Qr9iLBAD(i57)) {
                        bpVar.b2ZJblxo += bpVar.OnDfzHZD;
                    }
                    ap apVar6 = (ap) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) apVar6).weight;
                    f5 += f6;
                    int i64 = i57;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) apVar6).width == 0 && f6 > 0.0f) {
                        int i65 = bpVar.b2ZJblxo;
                        int i66 = ((LinearLayout.LayoutParams) apVar6).leftMargin;
                        if (z18) {
                            bpVar.b2ZJblxo = i66 + ((LinearLayout.LayoutParams) apVar6).rightMargin + i65;
                        } else {
                            bpVar.b2ZJblxo = Math.max(i65, i65 + i66 + ((LinearLayout.LayoutParams) apVar6).rightMargin);
                        }
                        if (z16) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i13 = i63;
                            i12 = i64;
                            apVar = apVar6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
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
                            apVar = apVar6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i56 = i;
                            i14 = i59;
                            i11 = i60;
                            if (mode4 == i15 && ((LinearLayout.LayoutParams) apVar).height == -1) {
                                z4 = true;
                                z20 = true;
                            } else {
                                z4 = false;
                            }
                            int i67 = ((LinearLayout.LayoutParams) apVar).topMargin + ((LinearLayout.LayoutParams) apVar).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i67;
                            i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i68 = ((LinearLayout.LayoutParams) apVar).gravity;
                                    if (i68 < 0) {
                                        i68 = bpVar.P7K7Inc8;
                                    }
                                    int i69 = (((i68 & 112) >> 4) & (-2)) >> 1;
                                    iArr3[i69] = Math.max(iArr3[i69], baseline2);
                                    iArr2[i69] = Math.max(iArr2[i69], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i13, measuredHeight3);
                            boolean z22 = !z19 && ((LinearLayout.LayoutParams) apVar).height == -1;
                            if (((LinearLayout.LayoutParams) apVar).weight <= 0.0f) {
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
                        if (((LinearLayout.LayoutParams) apVar6).width != 0 || f6 <= 0.0f) {
                            i10 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) apVar6).width = -2;
                            i10 = 0;
                        }
                        iArr2 = iArr6;
                        i11 = i60;
                        i12 = i64;
                        z2 = z16;
                        z3 = z17;
                        int i71 = i10;
                        apVar = apVar6;
                        i13 = i63;
                        i56 = i;
                        iArr3 = iArr5;
                        i14 = i59;
                        bpVar.measureChildWithMargins(childAt6, i56, f5 == 0.0f ? bpVar.b2ZJblxo : 0, i2, 0);
                        if (i71 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) apVar).width = i71;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i72 = bpVar.b2ZJblxo;
                        int i73 = ((LinearLayout.LayoutParams) apVar).leftMargin;
                        if (z18) {
                            view = childAt6;
                            bpVar.b2ZJblxo = i73 + measuredWidth3 + ((LinearLayout.LayoutParams) apVar).rightMargin + i72;
                        } else {
                            view = childAt6;
                            bpVar.b2ZJblxo = Math.max(i72, i72 + measuredWidth3 + i73 + ((LinearLayout.LayoutParams) apVar).rightMargin);
                        }
                        if (z3) {
                            i61 = Math.max(measuredWidth3, i61);
                        }
                    }
                    i15 = 1073741824;
                    if (mode4 == i15) {
                    }
                    z4 = false;
                    int i672 = ((LinearLayout.LayoutParams) apVar).topMargin + ((LinearLayout.LayoutParams) apVar).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i672;
                    i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                    if (z2) {
                    }
                    int max22 = Math.max(i13, measuredHeight32);
                    if (z19) {
                    }
                    if (((LinearLayout.LayoutParams) apVar).weight <= 0.0f) {
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
            iArr5 = iArr3;
            iArr6 = iArr2;
            z16 = z2;
            z17 = z3;
        }
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr6;
        char c3 = c;
        boolean z23 = z16;
        boolean z24 = z17;
        int i74 = i58;
        int i75 = i59;
        int i76 = i60;
        if (bpVar.b2ZJblxo > 0 && bpVar.Qr9iLBAD(virtualChildCount2)) {
            bpVar.b2ZJblxo += bpVar.OnDfzHZD;
        }
        int i77 = iArr7[1];
        int max3 = (i77 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) ? i74 : Math.max(i74, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i77, iArr7[c3]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            bpVar.b2ZJblxo = 0;
            for (int i78 = 0; i78 < virtualChildCount2; i78++) {
                View childAt7 = bpVar.getChildAt(i78);
                if (childAt7 == null) {
                    bpVar.b2ZJblxo = bpVar.b2ZJblxo;
                } else if (childAt7.getVisibility() != 8) {
                    ap apVar7 = (ap) childAt7.getLayoutParams();
                    int i79 = bpVar.b2ZJblxo;
                    if (z18) {
                        bpVar.b2ZJblxo = ((LinearLayout.LayoutParams) apVar7).leftMargin + i61 + ((LinearLayout.LayoutParams) apVar7).rightMargin + i79;
                    } else {
                        bpVar.b2ZJblxo = Math.max(i79, i79 + i61 + ((LinearLayout.LayoutParams) apVar7).leftMargin + ((LinearLayout.LayoutParams) apVar7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = bpVar.getPaddingRight() + bpVar.getPaddingLeft() + bpVar.b2ZJblxo;
        bpVar.b2ZJblxo = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, bpVar.getSuggestedMinimumWidth()), i56, 0);
        int i80 = (resolveSizeAndState2 & 16777215) - bpVar.b2ZJblxo;
        if (z21 || (i80 != 0 && f5 > 0.0f)) {
            float f7 = bpVar.Qr9iLBAD;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr7[3] = -1;
            iArr7[c3] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[c3] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            bpVar.b2ZJblxo = 0;
            max3 = -1;
            int i81 = 0;
            while (i81 < virtualChildCount2) {
                View childAt8 = bpVar.getChildAt(i81);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i7 = resolveSizeAndState2;
                } else {
                    ap apVar8 = (ap) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) apVar8).weight;
                    if (f8 > 0.0f) {
                        int i82 = (int) ((i80 * f8) / f5);
                        f5 -= f8;
                        i80 -= i82;
                        i7 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, bpVar.getPaddingBottom() + bpVar.getPaddingTop() + ((LinearLayout.LayoutParams) apVar8).topMargin + ((LinearLayout.LayoutParams) apVar8).bottomMargin, ((LinearLayout.LayoutParams) apVar8).height);
                        if (((LinearLayout.LayoutParams) apVar8).width == 0) {
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
                    int i83 = bpVar.b2ZJblxo;
                    if (z18) {
                        bpVar.b2ZJblxo = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) apVar8).leftMargin + ((LinearLayout.LayoutParams) apVar8).rightMargin + i83;
                    } else {
                        bpVar.b2ZJblxo = Math.max(i83, childAt8.getMeasuredWidth() + i83 + ((LinearLayout.LayoutParams) apVar8).leftMargin + ((LinearLayout.LayoutParams) apVar8).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) apVar8).height == -1;
                    int i84 = ((LinearLayout.LayoutParams) apVar8).topMargin + ((LinearLayout.LayoutParams) apVar8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i84;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z25) {
                        i84 = measuredHeight4;
                    }
                    int max4 = Math.max(i75, i84);
                    if (z19) {
                        i8 = -1;
                        if (((LinearLayout.LayoutParams) apVar8).height == -1) {
                            z = true;
                            if (!z23 && (baseline = childAt8.getBaseline()) != i8) {
                                int i85 = ((LinearLayout.LayoutParams) apVar8).gravity;
                                if (i85 < 0) {
                                    i85 = bpVar.P7K7Inc8;
                                }
                                int i86 = (((i85 & 112) >> 4) & (-2)) >> 1;
                                iArr7[i86] = Math.max(iArr7[i86], baseline);
                                iArr8[i86] = Math.max(iArr8[i86], measuredHeight4 - baseline);
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
            bpVar.b2ZJblxo = bpVar.getPaddingRight() + bpVar.getPaddingLeft() + bpVar.b2ZJblxo;
            int i87 = iArr7[1];
            if (i87 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                max3 = Math.max(max3, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i87, iArr7[c3]))));
            }
            i6 = i75;
        } else {
            i6 = Math.max(i75, i76);
            if (z24 && mode3 != 1073741824) {
                for (int i88 = 0; i88 < virtualChildCount2; i88++) {
                    View childAt9 = bpVar.getChildAt(i88);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((ap) childAt9.getLayoutParams())).weight > 0.0f) {
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
        bpVar.setMeasuredDimension(i3 | (i62 & i4), View.resolveSizeAndState(Math.max(bpVar.getPaddingBottom() + bpVar.getPaddingTop() + max3, bpVar.getSuggestedMinimumHeight()), i2, i62 << 16));
        if (z20) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(bpVar.getMeasuredHeight(), 1073741824);
            int i89 = i5;
            while (i89 < virtualChildCount2) {
                View childAt10 = bpVar.getChildAt(i89);
                if (childAt10.getVisibility() != 8) {
                    ap apVar9 = (ap) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) apVar9).height == -1) {
                        int i90 = ((LinearLayout.LayoutParams) apVar9).width;
                        ((LinearLayout.LayoutParams) apVar9).width = childAt10.getMeasuredWidth();
                        bpVar.measureChildWithMargins(childAt10, i56, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) apVar9).width = i90;
                    }
                }
                i89++;
                bpVar = this;
                i56 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.NCTxEWno = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.MdtA4re8 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.ow5vqvCr) {
            return;
        }
        this.ow5vqvCr = drawable;
        if (drawable != null) {
            this.OnDfzHZD = drawable.getIntrinsicWidth();
            this.ygLcUYwZ = drawable.getIntrinsicHeight();
        } else {
            this.OnDfzHZD = 0;
            this.ygLcUYwZ = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.sjUBp5pO = i;
    }

    public void setGravity(int i) {
        if (this.P7K7Inc8 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.P7K7Inc8 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.P7K7Inc8;
        if ((8388615 & i3) != i2) {
            this.P7K7Inc8 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.jb9XjC4I = z;
    }

    public void setOrientation(int i) {
        if (this.VgvYg0wo != i) {
            this.VgvYg0wo = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.lDXGDhIF) {
            requestLayout();
        }
        this.lDXGDhIF = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.P7K7Inc8;
        if ((i3 & 112) != i2) {
            this.P7K7Inc8 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.Qr9iLBAD = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void wxUZMvaN(Canvas canvas, int i) {
        this.ow5vqvCr.setBounds(i, getPaddingTop() + this.sjUBp5pO, this.OnDfzHZD + i, (getHeight() - getPaddingBottom()) - this.sjUBp5pO);
        this.ow5vqvCr.draw(canvas);
    }
}
