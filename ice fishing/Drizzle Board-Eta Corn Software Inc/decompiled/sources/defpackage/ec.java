package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ec extends wd {
    public static final dc WYNAV5pd = new dc();
    public final ValueAnimator Ey6iv0m0;
    public TimeInterpolator FySoLYna;
    public ValueAnimator I5GHvsYW;
    public boolean KlHjfFWx;
    public final xd OxcuoDLp;
    public TimeInterpolator RXQxj5Oe;
    public float amk52bBQ;
    public TimeInterpolator gjV1z5T1;
    public final h5 lDXGDhIF;
    public final f80 sjUBp5pO;

    public ec(Context context, final m5 m5Var, h5 h5Var) {
        super(context, m5Var);
        this.KlHjfFWx = false;
        this.lDXGDhIF = h5Var;
        xd xdVar = new xd();
        this.OxcuoDLp = xdVar;
        xdVar.b2ZJblxo = true;
        f80 f80Var = new f80(this, WYNAV5pd);
        this.sjUBp5pO = f80Var;
        g80 g80Var = new g80();
        g80Var.qoPGr6Ce(1.0f);
        g80Var.NCTxEWno(50.0f);
        f80Var.k3x7lurq = g80Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.Ey6iv0m0 = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                m5 m5Var2 = m5Var;
                if (!m5Var2.qoPGr6Ce(true) || m5Var2.OnDfzHZD == 0) {
                    return;
                }
                ec ecVar = ec.this;
                if (ecVar.isVisible()) {
                    ecVar.invalidateSelf();
                }
            }
        });
        if (m5Var.qoPGr6Ce(true) && m5Var.OnDfzHZD != 0) {
            valueAnimator.start();
        }
        if (this.eVhOlqcC != 1.0f) {
            this.eVhOlqcC = 1.0f;
            invalidateSelf();
        }
    }

    @Override // defpackage.wd
    public final boolean VgvYg0wo(boolean z, boolean z2, boolean z3) {
        boolean VgvYg0wo = super.VgvYg0wo(z, z2, z3);
        rSPHMVzL rsphmvzl = this.wxUZMvaN;
        ContentResolver contentResolver = this.NCTxEWno.getContentResolver();
        rsphmvzl.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.KlHjfFWx = true;
            return VgvYg0wo;
        }
        this.KlHjfFWx = false;
        this.sjUBp5pO.k3x7lurq.NCTxEWno(50.0f / f);
        return VgvYg0wo;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.OnDfzHZD)) {
            canvas.save();
            Rect bounds = getBounds();
            float NCTxEWno = NCTxEWno();
            ObjectAnimator objectAnimator = this.VgvYg0wo;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.P7K7Inc8;
            this.lDXGDhIF.NCTxEWno(canvas, bounds, NCTxEWno, z, objectAnimator2 != null && objectAnimator2.isRunning());
            float MdtA4re8 = MdtA4re8();
            xd xdVar = this.OxcuoDLp;
            xdVar.VgvYg0wo = MdtA4re8;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.k3x7lurq;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            m5 m5Var = this.MdtA4re8;
            xdVar.MdtA4re8 = m5Var.VgvYg0wo[0];
            int i = m5Var.jb9XjC4I;
            if (i > 0) {
                this.lDXGDhIF.P7K7Inc8(canvas, paint, xdVar.NCTxEWno, 1.0f, m5Var.P7K7Inc8, this.ow5vqvCr, (int) ((ej0.b2ZJblxo(xdVar.NCTxEWno, 0.0f, 0.01f) * i) / 0.01f));
            } else {
                this.lDXGDhIF.P7K7Inc8(canvas, paint, 0.0f, 1.0f, m5Var.P7K7Inc8, this.ow5vqvCr, 0);
            }
            int i2 = this.ow5vqvCr;
            h5 h5Var = this.lDXGDhIF;
            h5Var.VgvYg0wo(canvas, paint, xdVar, i2);
            int i3 = m5Var.VgvYg0wo[0];
            h5Var.getClass();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.lDXGDhIF.b2ZJblxo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.lDXGDhIF.b2ZJblxo();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.sjUBp5pO.MdtA4re8();
        this.OxcuoDLp.NCTxEWno = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        m5 m5Var = this.MdtA4re8;
        float f2 = (f < m5Var.lDXGDhIF * 10000.0f || f > m5Var.sjUBp5pO * 10000.0f) ? 0.0f : 1.0f;
        boolean z = this.KlHjfFWx;
        xd xdVar = this.OxcuoDLp;
        f80 f80Var = this.sjUBp5pO;
        if (z) {
            f80Var.MdtA4re8();
            xdVar.NCTxEWno = f / 10000.0f;
            invalidateSelf();
            xdVar.wxUZMvaN = f2;
            invalidateSelf();
            return true;
        }
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            float min = (float) (10000.0d / (Math.min(height, width) * 3.141592653589793d));
            if (min <= 0.0f) {
                f80Var.getClass();
                m1.sjUBp5pO("Minimum visible change must be positive.");
                return false;
            }
            f80Var.Qr9iLBAD = min;
        }
        f80Var.NCTxEWno = xdVar.NCTxEWno * 10000.0f;
        f80Var.MdtA4re8 = true;
        f80Var.qoPGr6Ce(f);
        return true;
    }
}
