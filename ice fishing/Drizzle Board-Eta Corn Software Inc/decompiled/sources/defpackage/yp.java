package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yp implements View.OnTouchListener {
    public static final int amk52bBQ = ViewConfiguration.getTapTimeout();
    public final AccelerateInterpolator MdtA4re8;
    public final h1 NCTxEWno;
    public boolean OnDfzHZD;
    public final fe OxcuoDLp;
    public final float[] P7K7Inc8;
    public final int Qr9iLBAD;
    public i1 VgvYg0wo;
    public final float[] b2ZJblxo;
    public final float[] eVhOlqcC;
    public final float[] jb9XjC4I;
    public final float[] k3x7lurq;
    public boolean lDXGDhIF;
    public boolean ow5vqvCr;
    public boolean sjUBp5pO;
    public final fe wxUZMvaN;
    public boolean ygLcUYwZ;

    public yp(fe feVar) {
        h1 h1Var = new h1();
        h1Var.VgvYg0wo = Long.MIN_VALUE;
        h1Var.b2ZJblxo = -1L;
        h1Var.P7K7Inc8 = 0L;
        this.NCTxEWno = h1Var;
        this.MdtA4re8 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.P7K7Inc8 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.b2ZJblxo = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.jb9XjC4I = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.eVhOlqcC = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k3x7lurq = fArr5;
        this.wxUZMvaN = feVar;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.Qr9iLBAD = amk52bBQ;
        h1Var.qoPGr6Ce = 500;
        h1Var.NCTxEWno = 500;
        this.OxcuoDLp = feVar;
    }

    public static float NCTxEWno(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public final float MdtA4re8(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.lDXGDhIF) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final boolean VgvYg0wo() {
        fe feVar;
        int count;
        h1 h1Var = this.NCTxEWno;
        float f = h1Var.wxUZMvaN;
        int abs = (int) (f / Math.abs(f));
        Math.abs(h1Var.MdtA4re8);
        if (abs != 0 && (count = (feVar = this.OxcuoDLp).getCount()) != 0) {
            int childCount = feVar.getChildCount();
            int firstVisiblePosition = feVar.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && feVar.getChildAt(0).getTop() >= 0)) : !(i >= count && feVar.getChildAt(childCount - 1).getBottom() <= feVar.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        if (this.sjUBp5pO) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                wxUZMvaN();
                return false;
            }
            this.ygLcUYwZ = true;
            this.ow5vqvCr = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            fe feVar = this.wxUZMvaN;
            float qoPGr6Ce = qoPGr6Ce(x, width, feVar.getWidth(), 0);
            float qoPGr6Ce2 = qoPGr6Ce(motionEvent.getY(), view.getHeight(), feVar.getHeight(), 1);
            h1 h1Var = this.NCTxEWno;
            h1Var.MdtA4re8 = qoPGr6Ce;
            h1Var.wxUZMvaN = qoPGr6Ce2;
            if (!this.lDXGDhIF && VgvYg0wo()) {
                i1 i1Var = this.VgvYg0wo;
                if (i1Var == null) {
                    i1Var = new i1(i2, this);
                    this.VgvYg0wo = i1Var;
                }
                this.lDXGDhIF = true;
                this.OnDfzHZD = true;
                if (this.ow5vqvCr || (i = this.Qr9iLBAD) <= 0) {
                    i1Var.run();
                } else {
                    long j = i;
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    feVar.postOnAnimationDelayed(i1Var, j);
                }
                this.ow5vqvCr = true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float qoPGr6Ce(float f, float f2, float f3, int i) {
        float f4;
        float interpolation;
        float NCTxEWno = NCTxEWno(this.P7K7Inc8[i] * f2, 0.0f, this.b2ZJblxo[i]);
        float MdtA4re8 = MdtA4re8(f2 - f, NCTxEWno) - MdtA4re8(f, NCTxEWno);
        AccelerateInterpolator accelerateInterpolator = this.MdtA4re8;
        if (MdtA4re8 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-MdtA4re8);
        } else {
            if (MdtA4re8 <= 0.0f) {
                f4 = 0.0f;
                if (f4 != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.jb9XjC4I[i];
                float f6 = this.eVhOlqcC[i];
                float f7 = this.k3x7lurq[i];
                float f8 = f5 * f3;
                return f4 > 0.0f ? NCTxEWno(f4 * f8, f6, f7) : -NCTxEWno((-f4) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(MdtA4re8);
        }
        f4 = NCTxEWno(interpolation, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    public final void wxUZMvaN() {
        int i = 0;
        if (this.OnDfzHZD) {
            this.lDXGDhIF = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        h1 h1Var = this.NCTxEWno;
        int i2 = (int) (currentAnimationTimeMillis - h1Var.VgvYg0wo);
        int i3 = h1Var.NCTxEWno;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        h1Var.jb9XjC4I = i;
        h1Var.Qr9iLBAD = h1Var.qoPGr6Ce(currentAnimationTimeMillis);
        h1Var.b2ZJblxo = currentAnimationTimeMillis;
    }
}
