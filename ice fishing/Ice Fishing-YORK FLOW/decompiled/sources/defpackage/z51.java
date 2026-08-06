package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class z51 extends android.view.View {
    public static final int[] GE9mJIPrb8gP = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] Ns0WNyEWdPsk = new int[0];
    public defpackage.gUjdnLbkVAaA P05cfTpS5W5L;
    public java.lang.Long QiMR8OkAhezm;
    public defpackage.ls1 WDYagTQQm9ns;
    public defpackage.l3 e6mdH7fiFuta;
    public java.lang.Boolean oh71FJcDz6S2;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        java.lang.Runnable runnable = this.P05cfTpS5W5L;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        java.lang.Long l = this.QiMR8OkAhezm;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? GE9mJIPrb8gP : Ns0WNyEWdPsk;
            defpackage.ls1 ls1Var = this.WDYagTQQm9ns;
            if (ls1Var != null) {
                ls1Var.setState(iArr);
            }
        } else {
            defpackage.gUjdnLbkVAaA gujdnlbkvaaa = new defpackage.gUjdnLbkVAaA(10, this);
            this.P05cfTpS5W5L = gujdnlbkvaaa;
            postDelayed(gujdnlbkvaaa, 50L);
        }
        this.QiMR8OkAhezm = java.lang.Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(defpackage.z51 z51Var) {
        defpackage.ls1 ls1Var = z51Var.WDYagTQQm9ns;
        if (ls1Var != null) {
            ls1Var.setState(Ns0WNyEWdPsk);
        }
        z51Var.P05cfTpS5W5L = null;
    }

    public final void JhCgjQRTAOCT() {
        setRippleState(false);
    }

    public final void WDYagTQQm9ns(int i, long j, long j2) {
        defpackage.ls1 ls1Var = this.WDYagTQQm9ns;
        if (ls1Var == null) {
            return;
        }
        if (ls1Var.getRadius() != i) {
            ls1Var.setRadius(i);
        }
        float f = android.os.Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long giKS3J6vZuNy = defpackage.pf.giKS3J6vZuNy(j2, f);
        defpackage.pf pfVar = ls1Var.oh71FJcDz6S2;
        if (!(pfVar == null ? false : defpackage.pf.fWTAfUmVKrZq(pfVar.ZpBGe2uQfcn8, giKS3J6vZuNy))) {
            ls1Var.oh71FJcDz6S2 = new defpackage.pf(giKS3J6vZuNy);
            ls1Var.setColor(android.content.res.ColorStateList.valueOf(defpackage.ok0.PS16moFv2oLu(giKS3J6vZuNy)));
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, defpackage.ok0.CZa7MwI9IzLd(java.lang.Float.intBitsToFloat((int) (j >> 32))), defpackage.ok0.CZa7MwI9IzLd(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        ls1Var.setBounds(rect);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            fWTAfUmVKrZq();
        }
    }

    public final void fWTAfUmVKrZq() {
        this.e6mdH7fiFuta = null;
        defpackage.gUjdnLbkVAaA gujdnlbkvaaa = this.P05cfTpS5W5L;
        if (gujdnlbkvaaa != null) {
            removeCallbacks(gujdnlbkvaaa);
            defpackage.gUjdnLbkVAaA gujdnlbkvaaa2 = this.P05cfTpS5W5L;
            gujdnlbkvaaa2.getClass();
            gujdnlbkvaaa2.run();
        } else {
            defpackage.ls1 ls1Var = this.WDYagTQQm9ns;
            if (ls1Var != null) {
                ls1Var.setState(Ns0WNyEWdPsk);
            }
        }
        defpackage.ls1 ls1Var2 = this.WDYagTQQm9ns;
        if (ls1Var2 == null) {
            return;
        }
        ls1Var2.setVisible(false, false);
        unscheduleDrawable(ls1Var2);
    }

    public final void giKS3J6vZuNy(defpackage.u11 u11Var, boolean z, long j, int i, long j2, defpackage.l3 l3Var) {
        if (this.WDYagTQQm9ns == null || !java.lang.Boolean.valueOf(z).equals(this.oh71FJcDz6S2)) {
            defpackage.ls1 ls1Var = new defpackage.ls1(z);
            setBackground(ls1Var);
            this.WDYagTQQm9ns = ls1Var;
            this.oh71FJcDz6S2 = java.lang.Boolean.valueOf(z);
        }
        defpackage.ls1 ls1Var2 = this.WDYagTQQm9ns;
        ls1Var2.getClass();
        this.e6mdH7fiFuta = l3Var;
        WDYagTQQm9ns(i, j, j2);
        if (z) {
            ls1Var2.setHotspot(java.lang.Float.intBitsToFloat((int) (u11Var.ZpBGe2uQfcn8 >> 32)), java.lang.Float.intBitsToFloat((int) (u11Var.ZpBGe2uQfcn8 & 4294967295L)));
        } else {
            ls1Var2.setHotspot(ls1Var2.getBounds().centerX(), ls1Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        defpackage.l3 l3Var = this.e6mdH7fiFuta;
        if (l3Var != null) {
            l3Var.ZpBGe2uQfcn8();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
