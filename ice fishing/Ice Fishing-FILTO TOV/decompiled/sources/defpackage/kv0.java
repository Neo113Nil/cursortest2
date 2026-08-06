package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kv0 extends View {
    public static final int[] JFJ3QoxA = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] rQPn8YBR = new int[0];
    public Long AvO7iQsrTN;
    public Boolean EljAMC1QTz;
    public qc1 OOA6hdeuvCS;
    public uFEq9NpZ encWxUiV2;
    public o1 mOu10nynGul;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.encWxUiV2;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.AvO7iQsrTN;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? JFJ3QoxA : rQPn8YBR;
            qc1 qc1Var = this.OOA6hdeuvCS;
            if (qc1Var != null) {
                qc1Var.setState(iArr);
            }
        } else {
            uFEq9NpZ ufeq9npz = new uFEq9NpZ(8, this);
            this.encWxUiV2 = ufeq9npz;
            postDelayed(ufeq9npz, 50L);
        }
        this.AvO7iQsrTN = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(kv0 kv0Var) {
        qc1 qc1Var = kv0Var.OOA6hdeuvCS;
        if (qc1Var != null) {
            qc1Var.setState(rQPn8YBR);
        }
        kv0Var.encWxUiV2 = null;
    }

    public final void OOA6hdeuvCS(int i, long j, long j2) {
        qc1 qc1Var = this.OOA6hdeuvCS;
        if (qc1Var == null) {
            return;
        }
        if (qc1Var.getRadius() != i) {
            qc1Var.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long Yi7zF1RB1 = yb.Yi7zF1RB1(f, j2);
        yb ybVar = qc1Var.EljAMC1QTz;
        if (!(ybVar == null ? false : yb.X1lG3V04pd(ybVar.GWasM1elztuh, Yi7zF1RB1))) {
            qc1Var.EljAMC1QTz = new yb(Yi7zF1RB1);
            qc1Var.setColor(ColorStateList.valueOf(ki1.HFYAaqMd6(Yi7zF1RB1)));
        }
        Rect rect = new Rect(0, 0, vc0.MZhzXH72(Float.intBitsToFloat((int) (j >> 32))), vc0.MZhzXH72(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        qc1Var.setBounds(rect);
    }

    public final void X1lG3V04pd() {
        this.mOu10nynGul = null;
        uFEq9NpZ ufeq9npz = this.encWxUiV2;
        if (ufeq9npz != null) {
            removeCallbacks(ufeq9npz);
            uFEq9NpZ ufeq9npz2 = this.encWxUiV2;
            ufeq9npz2.getClass();
            ufeq9npz2.run();
        } else {
            qc1 qc1Var = this.OOA6hdeuvCS;
            if (qc1Var != null) {
                qc1Var.setState(rQPn8YBR);
            }
        }
        qc1 qc1Var2 = this.OOA6hdeuvCS;
        if (qc1Var2 == null) {
            return;
        }
        qc1Var2.setVisible(false, false);
        unscheduleDrawable(qc1Var2);
    }

    public final void Yi7zF1RB1(vr0 vr0Var, boolean z, long j, int i, long j2, o1 o1Var) {
        if (this.OOA6hdeuvCS == null || !Boolean.valueOf(z).equals(this.EljAMC1QTz)) {
            qc1 qc1Var = new qc1(z);
            setBackground(qc1Var);
            this.OOA6hdeuvCS = qc1Var;
            this.EljAMC1QTz = Boolean.valueOf(z);
        }
        qc1 qc1Var2 = this.OOA6hdeuvCS;
        qc1Var2.getClass();
        this.mOu10nynGul = o1Var;
        OOA6hdeuvCS(i, j, j2);
        if (z) {
            qc1Var2.setHotspot(Float.intBitsToFloat((int) (vr0Var.GWasM1elztuh >> 32)), Float.intBitsToFloat((int) (vr0Var.GWasM1elztuh & 4294967295L)));
        } else {
            qc1Var2.setHotspot(qc1Var2.getBounds().centerX(), qc1Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            X1lG3V04pd();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        o1 o1Var = this.mOu10nynGul;
        if (o1Var != null) {
            o1Var.GWasM1elztuh();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void xqGvceK5x() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
