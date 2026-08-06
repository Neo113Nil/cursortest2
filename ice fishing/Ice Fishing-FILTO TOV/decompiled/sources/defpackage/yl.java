package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yl extends WIEu4Ya2g8 implements xk0 {
    public boolean Mjvvu5DE;
    public boolean WIEu4Ya2g8;
    public boolean YmKjaVtbfp5Z;
    public final fo0 iwATDS1i01k;
    public boolean mE4lRynR;
    public final Window uFEq9NpZ;

    public yl(Context context, Window window) {
        super(context);
        this.uFEq9NpZ = window;
        this.iwATDS1i01k = z50.WRKkgoJXwDn(kd.GWasM1elztuh);
        int i = ne1.GWasM1elztuh;
        ie1.Yi7zF1RB1(this, this);
        ne1.GWasM1elztuh(this, new xl(this));
    }

    @Override // defpackage.xk0
    public final wg1 GWasM1elztuh(View view, wg1 wg1Var) {
        if (!this.YmKjaVtbfp5Z) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return wg1Var.GWasM1elztuh.YmKjaVtbfp5Z(max, max2, max3, max4);
            }
        }
        return wg1Var;
    }

    @Override // defpackage.WIEu4Ya2g8
    public final void Yi7zF1RB1(int i, qx qxVar) {
        qxVar.Uxq83abb04(1735448596);
        int i2 = (qxVar.encWxUiV2(this) ? 4 : 2) | i;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 3) != 2)) {
            ((lv) this.iwATDS1i01k.getValue()).EljAMC1QTz(qxVar, 0);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new iwATDS1i01k(this, i, 5);
        }
    }

    @Override // defpackage.WIEu4Ya2g8
    public final void encWxUiV2(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // defpackage.WIEu4Ya2g8
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.mE4lRynR;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    @Override // defpackage.WIEu4Ya2g8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mOu10nynGul(int i, int i2) {
        int i3;
        int i4;
        int mode;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mOu10nynGul(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        Window window = this.uFEq9NpZ;
        if (mode2 == Integer.MIN_VALUE && !this.WIEu4Ya2g8 && window.getAttributes().height == -2) {
            if (this.YmKjaVtbfp5Z) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 30) {
                    i3 = x3.GWasM1elztuh.GWasM1elztuh(window);
                } else if (i5 < 32) {
                    i3 = b4.GWasM1elztuh.GWasM1elztuh(window);
                }
            } else {
                i3 = size2 + 1;
            }
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            i4 = size - paddingRight;
            if (i4 < 0) {
                i4 = 0;
            }
            int i6 = i3 - paddingBottom;
            int i7 = i6 >= 0 ? i6 : 0;
            mode = View.MeasureSpec.getMode(i);
            if (mode != 0) {
                i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
            if (mode2 != 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            }
            childAt.measure(i, i2);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
            } else if (mode != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
            setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
            if (this.YmKjaVtbfp5Z && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(Integer.MIN_VALUE);
                if (this.WIEu4Ya2g8) {
                    return;
                }
                window.setLayout(-1, -1);
                return;
            }
            return;
        }
        i3 = size2;
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        i4 = size - paddingRight2;
        if (i4 < 0) {
        }
        int i62 = i3 - paddingBottom2;
        if (i62 >= 0) {
        }
        mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
        }
        if (mode2 != 0) {
        }
        childAt.measure(i, i2);
        if (mode != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom2 : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom2));
        if (this.YmKjaVtbfp5Z) {
        }
    }
}
