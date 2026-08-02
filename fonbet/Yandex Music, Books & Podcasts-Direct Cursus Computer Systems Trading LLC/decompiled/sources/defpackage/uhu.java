package defpackage;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uhu {
    public final int a;
    public final int b;
    public final gei c;
    public final int d;
    public final rdk f;
    public final Interpolator g;
    public float i;
    public float j;
    public final boolean m;
    public final n7b e = new n7b(9);
    public boolean h = false;
    public final Rect l = new Rect();
    public long k = System.nanoTime();

    public uhu(rdk rdkVar, gei geiVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        this.m = false;
        this.f = rdkVar;
        this.c = geiVar;
        this.d = i2;
        if (((ArrayList) rdkVar.f) == null) {
            rdkVar.f = new ArrayList();
        }
        ((ArrayList) rdkVar.f).add(this);
        this.g = interpolator;
        this.a = i4;
        this.b = i5;
        if (i3 == 3) {
            this.m = true;
        }
        this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        a();
    }

    public final void a() {
        boolean z = this.h;
        int i = this.b;
        int i2 = this.a;
        Interpolator interpolator = this.g;
        gei geiVar = this.c;
        rdk rdkVar = this.f;
        if (z) {
            long nanoTime = System.nanoTime();
            long j = nanoTime - this.k;
            this.k = nanoTime;
            float f = this.i - (((float) (j * 1.0E-6d)) * this.j);
            this.i = f;
            if (f < 0.0f) {
                this.i = 0.0f;
            }
            float f2 = this.i;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f2);
            }
            boolean d = geiVar.d(f2, nanoTime, this.e, geiVar.b);
            if (this.i <= 0.0f) {
                if (i2 != -1) {
                    geiVar.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    geiVar.b.setTag(i, null);
                }
                ((ArrayList) rdkVar.g).add(this);
            }
            if (this.i > 0.0f || d) {
                ((rei) rdkVar.c).invalidate();
                return;
            }
            return;
        }
        long nanoTime2 = System.nanoTime();
        long j2 = nanoTime2 - this.k;
        this.k = nanoTime2;
        float f3 = (((float) (j2 * 1.0E-6d)) * this.j) + this.i;
        this.i = f3;
        if (f3 >= 1.0f) {
            this.i = 1.0f;
        }
        float f4 = this.i;
        if (interpolator != null) {
            f4 = interpolator.getInterpolation(f4);
        }
        boolean d2 = geiVar.d(f4, nanoTime2, this.e, geiVar.b);
        if (this.i >= 1.0f) {
            if (i2 != -1) {
                geiVar.b.setTag(i2, Long.valueOf(System.nanoTime()));
            }
            if (i != -1) {
                geiVar.b.setTag(i, null);
            }
            if (!this.m) {
                ((ArrayList) rdkVar.g).add(this);
            }
        }
        if (this.i < 1.0f || d2) {
            ((rei) rdkVar.c).invalidate();
        }
    }

    public final void b() {
        this.h = true;
        int i = this.d;
        if (i != -1) {
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        }
        ((rei) this.f.c).invalidate();
        this.k = System.nanoTime();
    }
}
