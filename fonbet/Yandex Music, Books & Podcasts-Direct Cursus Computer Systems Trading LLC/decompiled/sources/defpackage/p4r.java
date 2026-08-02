package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class p4r {
    public static final IntRange f0 = new IntRange(30, 40, 1);
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public ValueAnimator U;
    public ValueAnimator V;
    public ValueAnimator W;
    public AnimatorSet X;
    public ValueAnimator Y;
    public volatile float Z;
    public final GLSurfaceView a;
    public boolean a0;
    public final boolean b;
    public float b0;
    public final long c;
    public final AccelerateDecelerateInterpolator c0;
    public final tf6 d0;
    public rar e0;
    public long l;
    public boolean n;
    public long o;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public volatile float x;
    public volatile float z;
    public float[] d = {0.0f, 0.0f, 0.0f};
    public float[] e = {0.0f, 0.0f, 0.0f};
    public float f = 0.75f;
    public final float[] g = {0.0f, 0.0f, 0.0f};
    public final ktp h = new ktp(7);
    public final ktp i = new ktp(7);
    public final ktp j = new ktp(7);
    public final ktp k = new ktp(3);
    public long m = 100;
    public volatile float p = 0.01f;
    public volatile float q = 0.01f;
    public volatile float y = -0.025f;

    public p4r(GLSurfaceView gLSurfaceView, boolean z, long j) {
        this.a = gLSurfaceView;
        this.b = z;
        this.c = j;
        float[] fArr = new float[18];
        for (int i = 0; i < 18; i++) {
            fArr[i] = 0.0f;
        }
        this.A = fArr;
        this.B = new float[]{0.0f, 0.0f, 0.0f};
        this.C = new float[]{-0.3f, 0.3f, 0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, 0.2f};
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.a0 = true;
        phn.a.getClass();
        this.b0 = phn.b.d(600);
        this.c0 = new AccelerateDecelerateInterpolator();
        this.d0 = gld.e(dm6.b());
    }

    public static float a(float f, float f2) {
        if (280.0f <= f2 && f2 <= 359.0f) {
            return f % 360;
        }
        if (f > 280.0f) {
            return 280.0f;
        }
        return f;
    }

    public static osu e(int i, boolean z) {
        if (!z) {
            return new osu(i, i, i, i, i, i);
        }
        float[] fArr = new float[3];
        aa5.h(i, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float c = yhn.c((f2 * 0.1f) + f2, 0.0f, 1.0f);
        float f3 = fArr[2];
        float[] fArr2 = {f, c, yhn.c((0.1f * f3) + f3, 0.0f, 1.0f)};
        float f4 = fArr[0];
        float f5 = fArr[1];
        float c2 = yhn.c((f5 * 0.05f) + f5, 0.0f, 1.0f);
        float f6 = fArr[2];
        float[] fArr3 = {f4, c2, yhn.c((0.05f * f6) + f6, 0.0f, 1.0f)};
        int a = aa5.a(fArr2);
        int a2 = aa5.a(fArr3);
        return new osu(a, a, a2, a2, i, i);
    }

    public static osu f(dys dysVar) {
        Float f;
        boolean z = dysVar instanceof cys;
        IntRange intRange = f0;
        if (z) {
            Float f2 = ((cys) dysVar).a;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                f = Float.valueOf(a(ldg.A(phn.a, intRange) + floatValue, floatValue));
            } else {
                f = null;
            }
            return new osu(v3g.L(50.0f), v3g.L(50.0f), v3g.L(300.0f), v3g.L(320.0f), v3g.L(f2 != null ? f2.floatValue() : 10.0f), v3g.L(f != null ? f.floatValue() : 30.0f));
        }
        if (!(dysVar instanceof bys)) {
            b6e.s();
            return null;
        }
        bzs bzsVar = ((bys) dysVar).a;
        float f3 = (bzsVar.b + 280) % 360;
        ohn ohnVar = phn.a;
        float a = a(ldg.A(ohnVar, new IntRange(40, 80, 1)) + f3, f3);
        Float f4 = bzsVar.c;
        float floatValue2 = f4 != null ? f4.floatValue() : a(ldg.A(ohnVar, new IntRange(120, 160, 1)) + f3, f3);
        return new osu(v3g.L(f3), v3g.L(a(ldg.A(ohnVar, intRange) + f3, f3)), v3g.L(a), v3g.L(a(a + ldg.A(ohnVar, intRange), f3)), v3g.L(floatValue2), v3g.L(a(floatValue2 + ldg.A(ohnVar, intRange), f3)));
    }

    public static void g(int i, int i2, float[] fArr) {
        fArr[i2] = ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        fArr[i2 + 1] = ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        fArr[i2 + 2] = (i & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
    }

    public final AnimatorSet b(long j, Function1 function1) {
        AnimatorSet animatorSet = new AnimatorSet();
        GLSurfaceView gLSurfaceView = this.a;
        AnimatorSet.Builder after = animatorSet.play(v3g.u(new float[]{0.0f, 1.0f}, 600L, gLSurfaceView, false, function1)).after(j);
        ValueAnimator u = v3g.u(new float[]{1.0f, 0.0f}, 600L, gLSurfaceView, false, function1);
        u.setStartDelay(800L);
        after.before(u);
        return animatorSet;
    }

    public final void c(Function1 function1) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            function1.invoke(valueAnimator);
        }
        ValueAnimator valueAnimator2 = this.W;
        if (valueAnimator2 != null) {
            function1.invoke(valueAnimator2);
        }
        AnimatorSet animatorSet = this.X;
        if (animatorSet != null) {
            function1.invoke(animatorSet);
        }
        ValueAnimator valueAnimator3 = this.Y;
        if (valueAnimator3 != null) {
            function1.invoke(valueAnimator3);
        }
        ValueAnimator valueAnimator4 = this.V;
        if (valueAnimator4 != null) {
            function1.invoke(valueAnimator4);
        }
    }

    public final void d() {
        long j;
        float f;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.b) {
            f = 1.0f;
            j = 500;
        } else {
            j = this.c;
            f = 0.8f;
        }
        this.U = v3g.u(new float[]{this.p, f}, j, this.a, true, new m4r(this, 0));
    }

    public final void h() {
        GLES20.glUniform3fv(this.N, 6, this.A, 0);
        if (this.b) {
            int i = this.M;
            float[] fArr = this.e;
            GLES20.glUniform3f(i, fArr[0], fArr[1], fArr[2]);
        }
    }

    public final void i(osu osuVar) {
        int i = osuVar.a;
        this.r = i;
        float[] fArr = this.A;
        g(i, 15, fArr);
        int i2 = osuVar.b;
        this.s = i2;
        g(i2, 6, fArr);
        int i3 = osuVar.c;
        this.t = i3;
        g(i3, 12, fArr);
        int i4 = osuVar.d;
        this.u = i4;
        g(i4, 3, fArr);
        int i5 = osuVar.e;
        this.v = i5;
        g(i5, 9, fArr);
        int i6 = osuVar.f;
        this.w = i6;
        g(i6, 0, fArr);
        h();
    }

    public final void j(r3v r3vVar) {
        osu f;
        r3vVar.getClass();
        float b = (r3vVar.b() + 1.0f) * 0.5f;
        this.f = b;
        boolean z = r3vVar instanceof q3v;
        if (!z) {
            b = 0.2f;
        }
        k4r k4rVar = new k4r(this, b, 4);
        GLSurfaceView gLSurfaceView = this.a;
        gLSurfaceView.queueEvent(k4rVar);
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        osu osuVar = new osu(this.r, this.s, this.t, this.u, this.v, this.w);
        if (z) {
            q3v q3vVar = (q3v) r3vVar;
            f = e(q3vVar.a.a, q3vVar.c);
        } else if (r3vVar instanceof o3v) {
            f = e(((o3v) r3vVar).a.a, false);
        } else {
            if (!(r3vVar instanceof p3v)) {
                b6e.s();
                return;
            }
            f = f(new cys(null));
        }
        float[] S = v3g.S(r3vVar.a().b);
        float[] fArr = (float[]) this.e.clone();
        if (!this.a0) {
            this.W = v3g.u(new float[]{0.0f, 1.0f}, this.c, gLSurfaceView, true, new r90(this, osuVar, f, fArr, S, 7));
        } else {
            this.a0 = false;
            this.e = S;
            gLSurfaceView.queueEvent(new l4r(this, f, 0));
        }
    }
}
