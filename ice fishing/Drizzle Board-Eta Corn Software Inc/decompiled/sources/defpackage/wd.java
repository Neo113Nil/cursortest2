package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class wd extends Drawable implements Animatable {
    public static final d4 ygLcUYwZ = new d4(Float.class, "growFraction", 9);
    public final m5 MdtA4re8;
    public final Context NCTxEWno;
    public ObjectAnimator P7K7Inc8;
    public ArrayList Qr9iLBAD;
    public ObjectAnimator VgvYg0wo;
    public float eVhOlqcC;
    public boolean jb9XjC4I;
    public int ow5vqvCr;
    public final float b2ZJblxo = -1.0f;
    public final Paint k3x7lurq = new Paint();
    public final Rect OnDfzHZD = new Rect();
    public rSPHMVzL wxUZMvaN = new rSPHMVzL();

    public wd(Context context, m5 m5Var) {
        this.NCTxEWno = context;
        this.MdtA4re8 = m5Var;
        setAlpha(255);
    }

    public final float MdtA4re8() {
        float f = this.b2ZJblxo;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof ec;
        m5 m5Var = this.MdtA4re8;
        if (m5Var.qoPGr6Ce(z) && m5Var.OnDfzHZD != 0) {
            rSPHMVzL rsphmvzl = this.wxUZMvaN;
            ContentResolver contentResolver = this.NCTxEWno.getContentResolver();
            rsphmvzl.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > 0.0f) {
                float uptimeMillis = (SystemClock.uptimeMillis() % r7) / ((int) ((((z ? m5Var.eVhOlqcC : m5Var.k3x7lurq) * 1000.0f) / m5Var.OnDfzHZD) * f2));
                return uptimeMillis < 0.0f ? (uptimeMillis % 1.0f) + 1.0f : uptimeMillis;
            }
        }
        return 0.0f;
    }

    public final float NCTxEWno() {
        m5 m5Var = this.MdtA4re8;
        if (m5Var.b2ZJblxo == 0 && m5Var.Qr9iLBAD == 0) {
            return 1.0f;
        }
        return this.eVhOlqcC;
    }

    public final void P7K7Inc8(b2 b2Var) {
        ArrayList arrayList = this.Qr9iLBAD;
        if (arrayList == null || !arrayList.contains(b2Var)) {
            return;
        }
        this.Qr9iLBAD.remove(b2Var);
        if (this.Qr9iLBAD.isEmpty()) {
            this.Qr9iLBAD = null;
        }
    }

    public boolean VgvYg0wo(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.VgvYg0wo;
        int i = 0;
        d4 d4Var = ygLcUYwZ;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, d4Var, 0.0f, 1.0f);
            this.VgvYg0wo = ofFloat;
            ofFloat.setDuration(500L);
            this.VgvYg0wo.setInterpolator(yoc1Y4KB.NCTxEWno);
            ObjectAnimator objectAnimator2 = this.VgvYg0wo;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                m1.sjUBp5pO("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.VgvYg0wo = objectAnimator2;
            objectAnimator2.addListener(new vd(this, i));
        }
        int i2 = 1;
        if (this.P7K7Inc8 == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, d4Var, 1.0f, 0.0f);
            this.P7K7Inc8 = ofFloat2;
            ofFloat2.setDuration(500L);
            this.P7K7Inc8.setInterpolator(yoc1Y4KB.NCTxEWno);
            ObjectAnimator objectAnimator3 = this.P7K7Inc8;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                m1.sjUBp5pO("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.P7K7Inc8 = objectAnimator3;
            objectAnimator3.addListener(new vd(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.VgvYg0wo : this.P7K7Inc8;
            ObjectAnimator objectAnimator5 = z ? this.P7K7Inc8 : this.VgvYg0wo;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.jb9XjC4I;
                    this.jb9XjC4I = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.jb9XjC4I = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.jb9XjC4I;
                    this.jb9XjC4I = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.jb9XjC4I = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                m5 m5Var = this.MdtA4re8;
                if (!z ? m5Var.Qr9iLBAD != 0 : m5Var.b2ZJblxo != 0) {
                    boolean z7 = this.jb9XjC4I;
                    this.jb9XjC4I = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.jb9XjC4I = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.ow5vqvCr;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.VgvYg0wo;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.P7K7Inc8;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.ow5vqvCr = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.k3x7lurq.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return wxUZMvaN(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        VgvYg0wo(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        VgvYg0wo(false, true, false);
    }

    public final boolean wxUZMvaN(boolean z, boolean z2, boolean z3) {
        rSPHMVzL rsphmvzl = this.wxUZMvaN;
        ContentResolver contentResolver = this.NCTxEWno.getContentResolver();
        rsphmvzl.getClass();
        return VgvYg0wo(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }
}
