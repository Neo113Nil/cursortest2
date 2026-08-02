package b1;

import Z0.v;
import Z0.z;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import c1.AbstractC0545e;
import com.google.android.gms.internal.ads.LP;
import h1.AbstractC4563a;
import l1.C4666a;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class i extends AbstractC0518b {

    /* renamed from: A, reason: collision with root package name */
    public c1.s f5438A;

    /* renamed from: q, reason: collision with root package name */
    public final String f5439q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5440r;

    /* renamed from: s, reason: collision with root package name */
    public final s.e f5441s;

    /* renamed from: t, reason: collision with root package name */
    public final s.e f5442t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f5443u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5444v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5445w;

    /* renamed from: x, reason: collision with root package name */
    public final c1.j f5446x;

    /* renamed from: y, reason: collision with root package name */
    public final c1.j f5447y;

    /* renamed from: z, reason: collision with root package name */
    public final c1.j f5448z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(v vVar, AbstractC4563a abstractC4563a, g1.e eVar) {
        super(vVar, abstractC4563a, r5, r0 != 0 ? r0 != 1 ? r0 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, eVar.f37603j, eVar.f37598d, eVar.f37601g, eVar.f37604k, eVar.f37605l);
        int d9 = AbstractC5050e.d(eVar.f37602h);
        Paint.Cap cap = d9 != 0 ? d9 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int d10 = AbstractC5050e.d(eVar.i);
        this.f5441s = new s.e();
        this.f5442t = new s.e();
        this.f5443u = new RectF();
        this.f5439q = eVar.f37595a;
        this.f5444v = eVar.f37596b;
        this.f5440r = eVar.f37606m;
        this.f5445w = (int) (vVar.f4046n.b() / 32.0f);
        AbstractC0545e a9 = eVar.f37597c.a();
        this.f5446x = (c1.j) a9;
        a9.a(this);
        abstractC4563a.f(a9);
        AbstractC0545e a10 = eVar.f37599e.a();
        this.f5447y = (c1.j) a10;
        a10.a(this);
        abstractC4563a.f(a10);
        AbstractC0545e a11 = eVar.f37600f.a();
        this.f5448z = (c1.j) a11;
        a11.a(this);
        abstractC4563a.f(a11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b1.AbstractC0518b, e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        super.d(colorFilter, lp);
        if (colorFilter == z.J) {
            c1.s sVar = this.f5438A;
            AbstractC4563a abstractC4563a = this.f5379f;
            if (sVar != null) {
                abstractC4563a.o(sVar);
            }
            c1.s sVar2 = new c1.s(lp, null);
            this.f5438A = sVar2;
            sVar2.a(this);
            abstractC4563a.f(this.f5438A);
        }
    }

    public final int[] f(int[] iArr) {
        c1.s sVar = this.f5438A;
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

    @Override // b1.InterfaceC0519c
    public final String getName() {
        return this.f5439q;
    }

    @Override // b1.AbstractC0518b, b1.InterfaceC0521e
    public final void h(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        Shader shader;
        Shader radialGradient;
        if (this.f5440r) {
            return;
        }
        e(this.f5443u, matrix, false);
        int i4 = this.f5444v;
        c1.j jVar = this.f5446x;
        c1.j jVar2 = this.f5448z;
        c1.j jVar3 = this.f5447y;
        if (i4 == 1) {
            long i6 = i();
            s.e eVar = this.f5441s;
            shader = (LinearGradient) eVar.j(i6, null);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                g1.c cVar = (g1.c) jVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(cVar.f37586b), cVar.f37585a, Shader.TileMode.CLAMP);
                eVar.k(i6, radialGradient);
                shader = radialGradient;
            }
            this.i.setShader(shader);
            super.h(canvas, matrix, i, c4666a);
        }
        long i9 = i();
        s.e eVar2 = this.f5442t;
        shader = (RadialGradient) eVar2.j(i9, null);
        if (shader == null) {
            PointF pointF3 = (PointF) jVar3.e();
            PointF pointF4 = (PointF) jVar2.e();
            g1.c cVar2 = (g1.c) jVar.e();
            int[] f2 = f(cVar2.f37586b);
            radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), f2, cVar2.f37585a, Shader.TileMode.CLAMP);
            eVar2.k(i9, radialGradient);
            shader = radialGradient;
        }
        this.i.setShader(shader);
        super.h(canvas, matrix, i, c4666a);
    }

    public final int i() {
        float f2 = this.f5447y.f5651d;
        float f9 = this.f5445w;
        int round = Math.round(f2 * f9);
        int round2 = Math.round(this.f5448z.f5651d * f9);
        int round3 = Math.round(this.f5446x.f5651d * f9);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
