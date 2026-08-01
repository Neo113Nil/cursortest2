package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0428e;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.internal.ads.C2991bm;
import f1.AbstractC4498a;
import j1.C4597a;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: A, reason: collision with root package name */
    public a1.s f4049A;

    /* renamed from: q, reason: collision with root package name */
    public final String f4050q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4051r;

    /* renamed from: s, reason: collision with root package name */
    public final s.e f4052s;

    /* renamed from: t, reason: collision with root package name */
    public final s.e f4053t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f4054u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4055v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4056w;

    /* renamed from: x, reason: collision with root package name */
    public final a1.j f4057x;

    /* renamed from: y, reason: collision with root package name */
    public final a1.j f4058y;

    /* renamed from: z, reason: collision with root package name */
    public final a1.j f4059z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(v vVar, AbstractC4498a abstractC4498a, e1.e eVar) {
        super(vVar, abstractC4498a, r5, r0 != 0 ? r0 != 1 ? r0 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, eVar.f37127j, eVar.f37122d, eVar.f37125g, eVar.f37128k, eVar.f37129l);
        int d2 = AbstractC5049e.d(eVar.f37126h);
        Paint.Cap cap = d2 != 0 ? d2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int d9 = AbstractC5049e.d(eVar.i);
        this.f4052s = new s.e();
        this.f4053t = new s.e();
        this.f4054u = new RectF();
        this.f4050q = eVar.f37119a;
        this.f4055v = eVar.f37120b;
        this.f4051r = eVar.f37130m;
        this.f4056w = (int) (vVar.f3690n.b() / 32.0f);
        AbstractC0428e a9 = eVar.f37121c.a();
        this.f4057x = (a1.j) a9;
        a9.a(this);
        abstractC4498a.d(a9);
        AbstractC0428e a10 = eVar.f37123e.a();
        this.f4058y = (a1.j) a10;
        a10.a(this);
        abstractC4498a.d(a10);
        AbstractC0428e a11 = eVar.f37124f.a();
        this.f4059z = (a1.j) a11;
        a11.a(this);
        abstractC4498a.d(a11);
    }

    public final int[] d(int[] iArr) {
        a1.s sVar = this.f4049A;
        if (sVar != null) {
            Integer[] numArr = (Integer[]) sVar.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // Z0.b, Z0.e
    public final void g(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        Shader shader;
        Shader radialGradient;
        if (this.f4051r) {
            return;
        }
        c(this.f4054u, matrix, false);
        int i6 = this.f4055v;
        a1.j jVar = this.f4057x;
        a1.j jVar2 = this.f4059z;
        a1.j jVar3 = this.f4058y;
        if (i6 == 1) {
            long i9 = i();
            s.e eVar = this.f4052s;
            shader = (LinearGradient) eVar.j(i9, null);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                e1.c cVar = (e1.c) jVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, d(cVar.f37110b), cVar.f37109a, Shader.TileMode.CLAMP);
                eVar.k(i9, radialGradient);
                shader = radialGradient;
            }
            this.i.setShader(shader);
            super.g(canvas, matrix, i, c4597a);
        }
        long i10 = i();
        s.e eVar2 = this.f4053t;
        shader = (RadialGradient) eVar2.j(i10, null);
        if (shader == null) {
            PointF pointF3 = (PointF) jVar3.e();
            PointF pointF4 = (PointF) jVar2.e();
            e1.c cVar2 = (e1.c) jVar.e();
            int[] d2 = d(cVar2.f37110b);
            radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), d2, cVar2.f37109a, Shader.TileMode.CLAMP);
            eVar2.k(i10, radialGradient);
            shader = radialGradient;
        }
        this.i.setShader(shader);
        super.g(canvas, matrix, i, c4597a);
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4050q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z0.b, c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        super.h(colorFilter, c2991bm);
        if (colorFilter == z.J) {
            a1.s sVar = this.f4049A;
            AbstractC4498a abstractC4498a = this.f3990f;
            if (sVar != null) {
                abstractC4498a.o(sVar);
            }
            a1.s sVar2 = new a1.s(c2991bm, null);
            this.f4049A = sVar2;
            sVar2.a(this);
            abstractC4498a.d(this.f4049A);
        }
    }

    public final int i() {
        float f3 = this.f4058y.f4256d;
        float f9 = this.f4056w;
        int round = Math.round(f3 * f9);
        int round2 = Math.round(this.f4059z.f4256d * f9);
        int round3 = Math.round(this.f4057x.f4256d * f9);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
