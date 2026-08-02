package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class nag implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();
    public final fa2 a;
    public final AccelerateInterpolator b;
    public final nra c;
    public q9 d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final int h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final nra q;

    public nag(nra nraVar) {
        fa2 fa2Var = new fa2();
        fa2Var.e = Long.MIN_VALUE;
        fa2Var.g = -1L;
        fa2Var.f = 0L;
        this.a = fa2Var;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr5;
        this.c = nraVar;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = r;
        fa2Var.a = 500;
        fa2Var.b = 500;
        this.q = nraVar;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3, int i) {
        float f4;
        float interpolation;
        float b = b(this.e[i] * f2, 0.0f, this.f[i]);
        float c = c(f2 - f, b) - c(f, b);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else {
            if (c <= 0.0f) {
                f4 = 0.0f;
                if (f4 != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.i[i];
                float f6 = this.j[i];
                float f7 = this.k[i];
                float f8 = f5 * f3;
                return f4 > 0.0f ? b(f4 * f8, f6, f7) : -b((-f4) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(c);
        }
        f4 = b(interpolation, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.g;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.o && i == 1) {
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
        if (this.m) {
            this.o = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        fa2 fa2Var = this.a;
        int i2 = (int) (currentAnimationTimeMillis - fa2Var.e);
        int i3 = fa2Var.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        fa2Var.i = i;
        fa2Var.h = fa2Var.a(currentAnimationTimeMillis);
        fa2Var.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        nra nraVar;
        int count;
        fa2 fa2Var = this.a;
        float f = fa2Var.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(fa2Var.c);
        if (abs != 0 && (count = (nraVar = this.q).getCount()) != 0) {
            int childCount = nraVar.getChildCount();
            int firstVisiblePosition = nraVar.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && nraVar.getChildAt(0).getTop() >= 0)) : !(i >= count && nraVar.getChildAt(childCount - 1).getBottom() <= nraVar.getHeight())) {
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
        if (this.p) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.n = true;
            this.l = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            nra nraVar = this.c;
            float a = a(x, width, nraVar.getWidth(), 0);
            float a2 = a(motionEvent.getY(), view.getHeight(), nraVar.getHeight(), 1);
            fa2 fa2Var = this.a;
            fa2Var.c = a;
            fa2Var.d = a2;
            if (!this.o && e()) {
                if (this.d == null) {
                    this.d = new q9(9, this);
                }
                this.o = true;
                this.m = true;
                if (this.l || (i = this.h) <= 0) {
                    this.d.run();
                } else {
                    q9 q9Var = this.d;
                    long j = i;
                    WeakHashMap weakHashMap = wdu.a;
                    nraVar.postOnAnimationDelayed(q9Var, j);
                }
                this.l = true;
            }
        }
        return false;
    }
}
