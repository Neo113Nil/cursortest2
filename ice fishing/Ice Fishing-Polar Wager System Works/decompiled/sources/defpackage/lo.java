package defpackage;

/* loaded from: classes.dex */
public final class lo extends defpackage.G3OKOH3wZRC implements defpackage.jq0 {
    public boolean EgCjBq0SZwJ;
    public boolean G3OKOH3wZRC;
    public boolean QoRHpC4k;
    public final android.view.Window SyNS6RMn;
    public final defpackage.qt0 cnag84Bm;
    public boolean kd6TUFXn;

    public lo(android.content.Context context, android.view.Window window) {
        super(context);
        this.SyNS6RMn = window;
        this.cnag84Bm = defpackage.c80.nBH8hAHy(defpackage.tf.IHQe1A4L2xu);
        int i = defpackage.mm1.IHQe1A4L2xu;
        defpackage.hm1.oh6vYeIP(this, this);
        defpackage.mm1.IHQe1A4L2xu(this, new defpackage.ko(this));
    }

    @Override // defpackage.G3OKOH3wZRC
    public final void EXtogiMhuM(int i, int i2, int i3, int i4) {
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

    @Override // defpackage.jq0
    public final defpackage.ro1 IHQe1A4L2xu(android.view.View view, defpackage.ro1 ro1Var) {
        if (!this.G3OKOH3wZRC) {
            android.view.View childAt = getChildAt(0);
            int max = java.lang.Math.max(0, childAt.getLeft());
            int max2 = java.lang.Math.max(0, childAt.getTop());
            int max3 = java.lang.Math.max(0, getWidth() - childAt.getRight());
            int max4 = java.lang.Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return ro1Var.IHQe1A4L2xu.G3OKOH3wZRC(max, max2, max3, max4);
            }
        }
        return ro1Var;
    }

    @Override // defpackage.G3OKOH3wZRC
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.EgCjBq0SZwJ;
    }

    @Override // defpackage.G3OKOH3wZRC
    public final void oh6vYeIP(defpackage.t10 t10Var, int i) {
        t10Var.QUKZkWRtw6(1735448596);
        int i2 = (t10Var.EXtogiMhuM(this) ? 4 : 2) | i;
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 3) != 2)) {
            ((defpackage.k00) this.cnag84Bm.getValue()).adDC3e2L(t10Var, 0);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.QoRHpC4k(this, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    @Override // defpackage.G3OKOH3wZRC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void riuEU0zW4(int i, int i2) {
        int i3;
        int i4;
        int mode;
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.riuEU0zW4(i, i2);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        android.view.Window window = this.SyNS6RMn;
        if (mode2 == Integer.MIN_VALUE && !this.QoRHpC4k && window.getAttributes().height == -2) {
            if (this.G3OKOH3wZRC) {
                int i5 = android.os.Build.VERSION.SDK_INT;
                if (i5 < 30) {
                    i3 = defpackage.o5.IHQe1A4L2xu.IHQe1A4L2xu(window);
                } else if (i5 < 32) {
                    i3 = defpackage.r5.IHQe1A4L2xu.IHQe1A4L2xu(window);
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
            if (this.G3OKOH3wZRC && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(Integer.MIN_VALUE);
                if (this.QoRHpC4k) {
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
        if (this.G3OKOH3wZRC) {
        }
    }
}
