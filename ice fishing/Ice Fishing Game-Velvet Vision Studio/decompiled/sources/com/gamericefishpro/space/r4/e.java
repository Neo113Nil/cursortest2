package com.gamericefishpro.space.r4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.ka.y;
import com.gamericefishpro.space.u6.l;
import com.gamericefishpro.space.u6.s;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final c p = new c(1);
    public static final c q = new c(2);
    public static final c r = new c(3);
    public static final c s = new c(4);
    public static final c t = new c(5);
    public static final c u = new c(0);
    public final y d;
    public final d5 e;
    public final float j;
    public f m;
    public float n;
    public boolean o;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean f = false;
    public final float g = Float.MAX_VALUE;
    public final float h = -3.4028235E38f;
    public long i = 0;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public e(y yVar, d5 d5Var) {
        this.d = yVar;
        this.e = d5Var;
        if (d5Var == r || d5Var == s || d5Var == t) {
            this.j = 0.1f;
        } else if (d5Var == u) {
            this.j = 0.00390625f;
        } else if (d5Var == p || d5Var == q) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static b b() {
        ThreadLocal threadLocal = b.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new b(new s(9)));
        }
        return (b) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [com.gamericefishpro.space.r4.a, java.lang.Object] */
    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        if (this.m == null) {
            this.m = new f(f);
        }
        f fVar = this.m;
        double d = f;
        fVar.i = d;
        double d2 = (float) d;
        if (d2 > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.j * 0.75f);
        fVar.d = dAbs;
        fVar.e = dAbs * 62.5d;
        s sVar = b().e;
        sVar.getClass();
        if (Thread.currentThread() != ((Looper) sVar.i).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.H(this.d);
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        b bVarB = b();
        ArrayList arrayList = bVarB.b;
        if (arrayList.size() == 0) {
            ((Choreographer) bVarB.e.e).postFrameCallback(new com.gamericefishpro.space.p5.e(bVarB.d));
            if (Build.VERSION.SDK_INT >= 33) {
                bVarB.g = ValueAnimator.getDurationScale();
                if (bVarB.h == null) {
                    l lVar = new l();
                    lVar.e = bVarB;
                    bVarB.h = lVar;
                }
                final l lVar2 = bVarB.h;
                if (((a) lVar2.d) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: com.gamericefishpro.space.r4.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f3) {
                            ((b) lVar2.e).g = f3;
                        }
                    };
                    lVar2.d = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.e.Z(this.d, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                ((com.gamericefishpro.space.i6.l) arrayList.get(i)).getClass();
                throw null;
            }
            i++;
        }
    }

    public final void d() {
        if (this.m.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        s sVar = b().e;
        sVar.getClass();
        if (Thread.currentThread() != ((Looper) sVar.i).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.o = true;
        }
    }
}
