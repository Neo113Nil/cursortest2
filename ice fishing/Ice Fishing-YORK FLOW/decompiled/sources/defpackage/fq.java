package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fq extends defpackage.XntWc4eZSQ8j implements defpackage.ct0 {
    public boolean BHfvd2J71qpO;
    public final defpackage.pw0 T1fB7bDYiVJQ;
    public boolean WmetiUbpKU9I;
    public boolean XntWc4eZSQ8j;
    public final android.view.Window gUjdnLbkVAaA;
    public boolean s0TASMVLSWD5;

    public fq(android.content.Context context, android.view.Window window) {
        super(context);
        this.gUjdnLbkVAaA = window;
        this.T1fB7bDYiVJQ = defpackage.w60.hH0RRJrNssvh(defpackage.oh.ZpBGe2uQfcn8);
        int i = defpackage.zt1.ZpBGe2uQfcn8;
        defpackage.ut1.giKS3J6vZuNy(this, this);
        defpackage.zt1.ZpBGe2uQfcn8(this, new defpackage.eq(this));
    }

    @Override // defpackage.XntWc4eZSQ8j
    public final void P05cfTpS5W5L(boolean z, int i, int i2, int i3, int i4) {
        android.view.View childAt = getChildAt(0);
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

    @Override // defpackage.ct0
    public final defpackage.mw1 ZpBGe2uQfcn8(android.view.View view, defpackage.mw1 mw1Var) {
        if (!this.WmetiUbpKU9I) {
            android.view.View childAt = getChildAt(0);
            int max = java.lang.Math.max(0, childAt.getLeft());
            int max2 = java.lang.Math.max(0, childAt.getTop());
            int max3 = java.lang.Math.max(0, getWidth() - childAt.getRight());
            int max4 = java.lang.Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return mw1Var.ZpBGe2uQfcn8.WmetiUbpKU9I(max, max2, max3, max4);
            }
        }
        return mw1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    @Override // defpackage.XntWc4eZSQ8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e6mdH7fiFuta(int i, int i2) {
        int i3;
        int i4;
        int mode;
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.e6mdH7fiFuta(i, i2);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        android.view.Window window = this.gUjdnLbkVAaA;
        if (mode2 == Integer.MIN_VALUE && !this.XntWc4eZSQ8j && window.getAttributes().height == -2) {
            if (this.WmetiUbpKU9I) {
                int i5 = android.os.Build.VERSION.SDK_INT;
                if (i5 < 30) {
                    i3 = defpackage.o6.ZpBGe2uQfcn8.ZpBGe2uQfcn8(window);
                } else if (i5 < 32) {
                    i3 = defpackage.q6.ZpBGe2uQfcn8.ZpBGe2uQfcn8(window);
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
            mode = android.view.View.MeasureSpec.getMode(i);
            if (mode != 0) {
                i = android.view.View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
            if (mode2 != 0) {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            }
            childAt.measure(i, i2);
            if (mode != Integer.MIN_VALUE) {
                size = java.lang.Math.min(size, childAt.getMeasuredWidth() + paddingRight);
            } else if (mode != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
            setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : java.lang.Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
            if (this.WmetiUbpKU9I && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(Integer.MIN_VALUE);
                if (this.XntWc4eZSQ8j) {
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
        mode = android.view.View.MeasureSpec.getMode(i);
        if (mode != 0) {
        }
        if (mode2 != 0) {
        }
        childAt.measure(i, i2);
        if (mode != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom2 : size2 : java.lang.Math.min(size2, childAt.getMeasuredHeight() + paddingBottom2));
        if (this.WmetiUbpKU9I) {
        }
    }

    @Override // defpackage.XntWc4eZSQ8j
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.BHfvd2J71qpO;
    }

    @Override // defpackage.XntWc4eZSQ8j
    public final void giKS3J6vZuNy(int i, defpackage.e30 e30Var) {
        e30Var.PS16moFv2oLu(1735448596);
        int i2 = (e30Var.P05cfTpS5W5L(this) ? 4 : 2) | i;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            ((defpackage.c20) this.T1fB7bDYiVJQ.getValue()).QiMR8OkAhezm(e30Var, 0);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.T1fB7bDYiVJQ(this, i, 5);
        }
    }
}
