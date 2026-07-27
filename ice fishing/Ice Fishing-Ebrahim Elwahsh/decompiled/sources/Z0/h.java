package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0421e;
import a1.InterfaceC0417a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import d1.C4456b;
import f1.AbstractC4490a;
import j1.C4589b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements e, InterfaceC0417a, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f4107a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4108b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4490a f4109c;

    /* renamed from: d, reason: collision with root package name */
    public final s.e f4110d = new s.e();

    /* renamed from: e, reason: collision with root package name */
    public final s.e f4111e = new s.e();

    /* renamed from: f, reason: collision with root package name */
    public final Path f4112f;

    /* renamed from: g, reason: collision with root package name */
    public final Y0.a f4113g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f4114h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4115j;

    /* renamed from: k, reason: collision with root package name */
    public final a1.j f4116k;

    /* renamed from: l, reason: collision with root package name */
    public final a1.f f4117l;

    /* renamed from: m, reason: collision with root package name */
    public final a1.j f4118m;

    /* renamed from: n, reason: collision with root package name */
    public final a1.j f4119n;

    /* renamed from: o, reason: collision with root package name */
    public a1.s f4120o;

    /* renamed from: p, reason: collision with root package name */
    public a1.s f4121p;

    /* renamed from: q, reason: collision with root package name */
    public final v f4122q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4123r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0421e f4124s;

    /* renamed from: t, reason: collision with root package name */
    public float f4125t;

    public h(v vVar, X0.i iVar, AbstractC4490a abstractC4490a, e1.d dVar) {
        Path path = new Path();
        this.f4112f = path;
        this.f4113g = new Y0.a(1, 0);
        this.f4114h = new RectF();
        this.i = new ArrayList();
        this.f4125t = 0.0f;
        this.f4109c = abstractC4490a;
        this.f4107a = dVar.f37248g;
        this.f4108b = dVar.f37249h;
        this.f4122q = vVar;
        this.f4115j = dVar.f37242a;
        path.setFillType(dVar.f37243b);
        this.f4123r = (int) (iVar.b() / 32.0f);
        AbstractC0421e a9 = dVar.f37244c.a();
        this.f4116k = (a1.j) a9;
        a9.a(this);
        abstractC4490a.e(a9);
        AbstractC0421e a10 = dVar.f37245d.a();
        this.f4117l = (a1.f) a10;
        a10.a(this);
        abstractC4490a.e(a10);
        AbstractC0421e a11 = dVar.f37246e.a();
        this.f4118m = (a1.j) a11;
        a11.a(this);
        abstractC4490a.e(a11);
        AbstractC0421e a12 = dVar.f37247f.a();
        this.f4119n = (a1.j) a12;
        a12.a(this);
        abstractC4490a.e(a12);
        if (abstractC4490a.l() != null) {
            a1.i a13 = ((C4456b) abstractC4490a.l().f37858u).a();
            this.f4124s = a13;
            a13.a(this);
            abstractC4490a.e(this.f4124s);
        }
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4122q.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = (c) list2.get(i);
            if (cVar instanceof m) {
                this.i.add((m) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        PointF pointF = z.f3785a;
        if (colorFilter == 4) {
            this.f4117l.j(sVar);
            return;
        }
        ColorFilter colorFilter2 = z.f3780I;
        AbstractC4490a abstractC4490a = this.f4109c;
        if (colorFilter == colorFilter2) {
            a1.s sVar2 = this.f4120o;
            if (sVar2 != null) {
                abstractC4490a.o(sVar2);
            }
            a1.s sVar3 = new a1.s(sVar, null);
            this.f4120o = sVar3;
            sVar3.a(this);
            abstractC4490a.e(this.f4120o);
            return;
        }
        if (colorFilter == z.J) {
            a1.s sVar4 = this.f4121p;
            if (sVar4 != null) {
                abstractC4490a.o(sVar4);
            }
            this.f4110d.h();
            this.f4111e.h();
            a1.s sVar5 = new a1.s(sVar, null);
            this.f4121p = sVar5;
            sVar5.a(this);
            abstractC4490a.e(this.f4121p);
            return;
        }
        if (colorFilter == z.f3789e) {
            AbstractC0421e abstractC0421e = this.f4124s;
            if (abstractC0421e != null) {
                abstractC0421e.j(sVar);
                return;
            }
            a1.s sVar6 = new a1.s(sVar, null);
            this.f4124s = sVar6;
            sVar6.a(this);
            abstractC4490a.e(this.f4124s);
        }
    }

    @Override // Z0.e
    public final void d(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f4112f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((m) arrayList.get(i)).g(), matrix);
                i++;
            }
        }
    }

    public final int[] e(int[] iArr) {
        a1.s sVar = this.f4121p;
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

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        j1.h.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4107a;
    }

    @Override // Z0.e
    public final void h(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        float[] fArr;
        int[] iArr;
        Shader shader;
        int[] iArr2;
        float[] fArr2;
        if (this.f4108b) {
            return;
        }
        Path path = this.f4112f;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i4 >= arrayList.size()) {
                break;
            }
            path.addPath(((m) arrayList.get(i4)).g(), matrix);
            i4++;
        }
        path.computeBounds(this.f4114h, false);
        int i9 = this.f4115j;
        a1.j jVar = this.f4116k;
        a1.j jVar2 = this.f4119n;
        a1.j jVar3 = this.f4118m;
        if (i9 == 1) {
            long i10 = i();
            s.e eVar = this.f4110d;
            shader = (LinearGradient) eVar.j(i10, null);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                e1.c cVar = (e1.c) jVar.e();
                int[] e6 = e(cVar.f37241b);
                if (e6.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{e6[0], e6[0]};
                } else {
                    iArr2 = e6;
                    fArr2 = cVar.f37240a;
                }
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                eVar.k(i10, shader);
            }
        } else {
            long i11 = i();
            s.e eVar2 = this.f4111e;
            RadialGradient radialGradient = (RadialGradient) eVar2.j(i11, null);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                e1.c cVar2 = (e1.c) jVar.e();
                int[] e9 = e(cVar2.f37241b);
                if (e9.length < 2) {
                    fArr = new float[]{0.0f, 1.0f};
                    iArr = new int[]{e9[0], e9[0]};
                } else {
                    fArr = cVar2.f37240a;
                    iArr = e9;
                }
                float[] fArr3 = fArr;
                float f6 = pointF3.x;
                float f9 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f6, pointF4.y - f9);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f6, f9, hypot, iArr, fArr3, Shader.TileMode.CLAMP);
                eVar2.k(i11, radialGradient2);
                shader = radialGradient2;
            }
        }
        Shader shader2 = shader;
        shader2.setLocalMatrix(matrix);
        Y0.a aVar = this.f4113g;
        aVar.setShader(shader2);
        a1.s sVar = this.f4120o;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        AbstractC0421e abstractC0421e = this.f4124s;
        if (abstractC0421e != null) {
            float floatValue = ((Float) abstractC0421e.e()).floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f4125t) {
                aVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f4125t = floatValue;
        }
        float intValue = ((Integer) this.f4117l.e()).intValue() / 100.0f;
        aVar.setAlpha(j1.h.c((int) (i * intValue)));
        if (c4589b != null) {
            c4589b.a((int) (intValue * 255.0f), aVar);
        }
        canvas.drawPath(path, aVar);
    }

    public final int i() {
        float f6 = this.f4118m.f4305d;
        float f9 = this.f4123r;
        int round = Math.round(f6 * f9);
        int round2 = Math.round(this.f4119n.f4305d * f9);
        int round3 = Math.round(this.f4116k.f4305d * f9);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
