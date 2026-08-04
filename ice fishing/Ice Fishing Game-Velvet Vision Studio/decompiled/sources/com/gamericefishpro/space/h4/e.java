package com.gamericefishpro.space.h4;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.n.w0;
import com.onesignal.core.activities.PermissionsActivity;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {
    public static final int K = ViewConfiguration.getTapTimeout();
    public final int A;
    public final float[] B;
    public final float[] C;
    public final float[] D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final w0 J;
    public final a d;
    public final AccelerateInterpolator e;
    public final w0 i;
    public b v;
    public final float[] w;
    public final float[] y;
    public final int z;

    public e(w0 w0Var) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f = 0L;
        this.d = aVar;
        this.e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.w = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.y = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.B = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.C = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.D = fArr5;
        this.i = w0Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.A = K;
        aVar.a = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        aVar.b = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        this.J = w0Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i, float f, float f2, float f3) {
        float fB;
        float interpolation;
        float fB2 = b(this.w[i] * f2, 0.0f, this.y[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.e;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.B[i];
            float f5 = this.C[i];
            float f6 = this.D[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.B[i];
        float f9 = this.C[i];
        float f10 = this.D[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.z;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.H && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.F) {
            this.H = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.d;
        int i2 = (int) (jCurrentAnimationTimeMillis - aVar.e);
        int i3 = aVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        w0 w0Var;
        int count;
        a aVar = this.d;
        float f = aVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(aVar.c);
        if (iAbs != 0 && (count = (w0Var = this.J).getCount()) != 0) {
            int childCount = w0Var.getChildCount();
            int firstVisiblePosition = w0Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && w0Var.getChildAt(0).getTop() >= 0)) : !(i >= count && w0Var.getChildAt(childCount - 1).getBottom() <= w0Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        if (this.I) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.G = true;
            this.E = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            w0 w0Var = this.i;
            float fA = a(0, x, width, w0Var.getWidth());
            float fA2 = a(1, motionEvent.getY(), view.getHeight(), w0Var.getHeight());
            a aVar = this.d;
            aVar.c = fA;
            aVar.d = fA2;
            if (!this.H && e()) {
                if (this.v == null) {
                    this.v = new b(i2, this);
                }
                this.H = true;
                this.F = true;
                if (this.E || (i = this.A) <= 0) {
                    this.v.run();
                } else {
                    b bVar = this.v;
                    long j = i;
                    Field field = l0.a;
                    w0Var.postOnAnimationDelayed(bVar, j);
                }
                this.E = true;
            }
        }
        return false;
    }
}
