package defpackage;

import android.graphics.Outline;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class eyj {
    public boolean a = true;
    public final Outline b;
    public ocg c;
    public nh0 d;
    public eak e;
    public boolean f;
    public boolean g;
    public eak h;
    public jgo i;
    public float j;
    public long k;
    public long l;
    public boolean m;

    public eyj() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.b = outline;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (r5.e >> 32)) == r0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(mu3 mu3Var) {
        e();
        eak eakVar = this.e;
        if (eakVar != null) {
            mu3Var.h(eakVar);
            return;
        }
        float f = this.j;
        if (f <= 0.0f) {
            mu3Var.i(Float.intBitsToFloat((int) (this.k >> 32)), Float.intBitsToFloat((int) (this.k & 4294967295L)), Float.intBitsToFloat((int) (this.l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32)), Float.intBitsToFloat((int) (this.l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L)), 1);
            return;
        }
        eak eakVar2 = this.h;
        jgo jgoVar = this.i;
        if (eakVar2 != null) {
            long j = this.k;
            long j2 = this.l;
            if (jgoVar != null && cb0.B(jgoVar)) {
                int i = (int) (j >> 32);
                if (jgoVar.a == Float.intBitsToFloat(i)) {
                    int i2 = (int) (j & 4294967295L);
                    if (jgoVar.b == Float.intBitsToFloat(i2)) {
                        if (jgoVar.c == Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i)) {
                            if (jgoVar.d == Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2)) {
                            }
                        }
                    }
                }
            }
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (this.k >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.k & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (this.l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L));
        float f2 = this.j;
        jgo m = cb0.m(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        if (eakVar2 == null) {
            eakVar2 = ph0.a();
        } else {
            ((nh0) eakVar2).h();
        }
        eak.a(eakVar2, m);
        this.i = m;
        this.h = eakVar2;
        mu3Var.h(eakVar2);
    }

    public final Outline b() {
        e();
        if (this.m && this.a) {
            return this.b;
        }
        return null;
    }

    public final boolean c(long j) {
        ocg ocgVar;
        if (this.m && (ocgVar = this.c) != null) {
            return a4g.E(ocgVar, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return true;
    }

    public final boolean d(ocg ocgVar, float f, boolean z, float f2, long j) {
        this.b.setAlpha(f);
        boolean d = Intrinsics.d(this.c, ocgVar);
        boolean z2 = !d;
        if (!d) {
            this.c = ocgVar;
            this.f = true;
        }
        this.l = j;
        boolean z3 = ocgVar != null && (z || f2 > 0.0f);
        if (this.m != z3) {
            this.m = z3;
            this.f = true;
        }
        return z2;
    }

    public final void e() {
        if (this.f) {
            this.k = 0L;
            this.j = 0.0f;
            this.e = null;
            this.f = false;
            this.g = false;
            ocg ocgVar = this.c;
            Outline outline = this.b;
            if (ocgVar == null || !this.m || Float.intBitsToFloat((int) (this.l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.l & 4294967295L)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.a = true;
            if (ocgVar instanceof ayj) {
                ynn ynnVar = ((ayj) ocgVar).j;
                float f = ynnVar.a;
                float f2 = ynnVar.b;
                this.k = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                float f3 = ynnVar.c;
                float f4 = ynnVar.d;
                this.l = (Float.floatToRawIntBits(f4 - f2) & 4294967295L) | (Float.floatToRawIntBits(f3 - f) << 32);
                outline.setRect(Math.round(f), Math.round(f2), Math.round(f3), Math.round(f4));
                return;
            }
            if (!(ocgVar instanceof byj)) {
                if (ocgVar instanceof zxj) {
                    f(((zxj) ocgVar).j);
                    return;
                }
                return;
            }
            jgo jgoVar = ((byj) ocgVar).j;
            float intBitsToFloat = Float.intBitsToFloat((int) (jgoVar.e >> 32));
            float f5 = jgoVar.a;
            float f6 = jgoVar.b;
            this.k = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
            float b = jgoVar.b();
            float a = jgoVar.a();
            this.l = (Float.floatToRawIntBits(a) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
            if (cb0.B(jgoVar)) {
                this.b.setRoundRect(Math.round(f5), Math.round(f6), Math.round(jgoVar.c), Math.round(jgoVar.d), intBitsToFloat);
                this.j = intBitsToFloat;
                return;
            }
            nh0 nh0Var = this.d;
            if (nh0Var == null) {
                nh0Var = ph0.a();
                this.d = nh0Var;
            }
            nh0Var.h();
            eak.a(nh0Var, jgoVar);
            f(nh0Var);
        }
    }

    public final void f(eak eakVar) {
        int i = Build.VERSION.SDK_INT;
        Outline outline = this.b;
        if (i > 28 || ((nh0) eakVar).a.isConvex()) {
            if (i >= 30) {
                fyj.a.a(outline, eakVar);
            } else {
                if (!(eakVar instanceof nh0)) {
                    qq6.d("Unable to obtain android.graphics.Path");
                    return;
                }
                outline.setConvexPath(((nh0) eakVar).a);
            }
            this.g = !outline.canClip();
        } else {
            this.a = false;
            outline.setEmpty();
            this.g = true;
        }
        this.e = eakVar;
    }
}
