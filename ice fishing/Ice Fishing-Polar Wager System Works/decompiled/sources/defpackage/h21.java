package defpackage;

/* loaded from: classes.dex */
public final class h21 extends android.view.View {
    public static final int[] SH1y5HwkJhh = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] ez2rX8ReCYw = new int[0];
    public java.lang.Long AARZUJiTa;
    public defpackage.cnag84Bm EXtogiMhuM;
    public defpackage.uk1 adDC3e2L;
    public defpackage.e3 riuEU0zW4;
    public java.lang.Boolean xiZrDbcSW0;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        java.lang.Runnable runnable = this.EXtogiMhuM;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        java.lang.Long l = this.AARZUJiTa;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? SH1y5HwkJhh : ez2rX8ReCYw;
            defpackage.uk1 uk1Var = this.adDC3e2L;
            if (uk1Var != null) {
                uk1Var.setState(iArr);
            }
        } else {
            defpackage.cnag84Bm cnag84bm = new defpackage.cnag84Bm(8, this);
            this.EXtogiMhuM = cnag84bm;
            postDelayed(cnag84bm, 50L);
        }
        this.AARZUJiTa = java.lang.Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(defpackage.h21 h21Var) {
        defpackage.uk1 uk1Var = h21Var.adDC3e2L;
        if (uk1Var != null) {
            uk1Var.setState(ez2rX8ReCYw);
        }
        h21Var.EXtogiMhuM = null;
    }

    public final void F7NU4MC0GW() {
        setRippleState(false);
    }

    public final void adDC3e2L(int i, long j, long j2) {
        defpackage.uk1 uk1Var = this.adDC3e2L;
        if (uk1Var == null) {
            return;
        }
        java.lang.Integer num = uk1Var.AARZUJiTa;
        if (num == null || num.intValue() != i) {
            uk1Var.AARZUJiTa = java.lang.Integer.valueOf(i);
            uk1Var.setRadius(i);
        }
        float f = android.os.Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long oh6vYeIP = defpackage.ae.oh6vYeIP(j2, f);
        defpackage.ae aeVar = uk1Var.xiZrDbcSW0;
        if (!(aeVar == null ? false : defpackage.ae.r1MBDhnF(aeVar.IHQe1A4L2xu, oh6vYeIP))) {
            uk1Var.xiZrDbcSW0 = new defpackage.ae(oh6vYeIP);
            uk1Var.setColor(android.content.res.ColorStateList.valueOf(defpackage.w70.yIx6ChFVk(oh6vYeIP)));
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, defpackage.ci0.TFRaUu83X3E(java.lang.Float.intBitsToFloat((int) (j >> 32))), defpackage.ci0.TFRaUu83X3E(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        uk1Var.setBounds(rect);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            r1MBDhnF();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        defpackage.e3 e3Var = this.riuEU0zW4;
        if (e3Var != null) {
            e3Var.IHQe1A4L2xu();
        }
    }

    public final void oh6vYeIP(defpackage.px0 px0Var, boolean z, long j, int i, long j2, defpackage.e3 e3Var) {
        if (this.adDC3e2L == null || !java.lang.Boolean.valueOf(z).equals(this.xiZrDbcSW0)) {
            defpackage.uk1 uk1Var = new defpackage.uk1(z);
            setBackground(uk1Var);
            this.adDC3e2L = uk1Var;
            this.xiZrDbcSW0 = java.lang.Boolean.valueOf(z);
        }
        defpackage.uk1 uk1Var2 = this.adDC3e2L;
        uk1Var2.getClass();
        this.riuEU0zW4 = e3Var;
        adDC3e2L(i, j, j2);
        if (z) {
            uk1Var2.setHotspot(java.lang.Float.intBitsToFloat((int) (px0Var.IHQe1A4L2xu >> 32)), java.lang.Float.intBitsToFloat((int) (px0Var.IHQe1A4L2xu & 4294967295L)));
        } else {
            uk1Var2.setHotspot(uk1Var2.getBounds().centerX(), uk1Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void r1MBDhnF() {
        this.riuEU0zW4 = null;
        defpackage.cnag84Bm cnag84bm = this.EXtogiMhuM;
        if (cnag84bm != null) {
            removeCallbacks(cnag84bm);
            defpackage.cnag84Bm cnag84bm2 = this.EXtogiMhuM;
            cnag84bm2.getClass();
            cnag84bm2.run();
        } else {
            defpackage.uk1 uk1Var = this.adDC3e2L;
            if (uk1Var != null) {
                uk1Var.setState(ez2rX8ReCYw);
            }
        }
        defpackage.uk1 uk1Var2 = this.adDC3e2L;
        if (uk1Var2 == null) {
            return;
        }
        uk1Var2.setVisible(false, false);
        unscheduleDrawable(uk1Var2);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
