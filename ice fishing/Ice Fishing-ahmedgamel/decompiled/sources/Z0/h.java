package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0428e;
import a1.InterfaceC0424a;
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
import com.google.android.gms.internal.ads.C2991bm;
import d1.C4444b;
import f1.AbstractC4498a;
import j1.AbstractC4603g;
import j1.C4597a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements e, InterfaceC0424a, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f4030a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4031b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4498a f4032c;

    /* renamed from: d, reason: collision with root package name */
    public final s.e f4033d = new s.e();

    /* renamed from: e, reason: collision with root package name */
    public final s.e f4034e = new s.e();

    /* renamed from: f, reason: collision with root package name */
    public final Path f4035f;

    /* renamed from: g, reason: collision with root package name */
    public final Y0.a f4036g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f4037h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4038j;

    /* renamed from: k, reason: collision with root package name */
    public final a1.j f4039k;

    /* renamed from: l, reason: collision with root package name */
    public final a1.f f4040l;

    /* renamed from: m, reason: collision with root package name */
    public final a1.j f4041m;

    /* renamed from: n, reason: collision with root package name */
    public final a1.j f4042n;

    /* renamed from: o, reason: collision with root package name */
    public a1.s f4043o;

    /* renamed from: p, reason: collision with root package name */
    public a1.s f4044p;

    /* renamed from: q, reason: collision with root package name */
    public final v f4045q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4046r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0428e f4047s;

    /* renamed from: t, reason: collision with root package name */
    public float f4048t;

    public h(v vVar, X0.i iVar, AbstractC4498a abstractC4498a, e1.d dVar) {
        Path path = new Path();
        this.f4035f = path;
        this.f4036g = new Y0.a(1, 0);
        this.f4037h = new RectF();
        this.i = new ArrayList();
        this.f4048t = 0.0f;
        this.f4032c = abstractC4498a;
        this.f4030a = dVar.f37117g;
        this.f4031b = dVar.f37118h;
        this.f4045q = vVar;
        this.f4038j = dVar.f37111a;
        path.setFillType(dVar.f37112b);
        this.f4046r = (int) (iVar.b() / 32.0f);
        AbstractC0428e a9 = dVar.f37113c.a();
        this.f4039k = (a1.j) a9;
        a9.a(this);
        abstractC4498a.d(a9);
        AbstractC0428e a10 = dVar.f37114d.a();
        this.f4040l = (a1.f) a10;
        a10.a(this);
        abstractC4498a.d(a10);
        AbstractC0428e a11 = dVar.f37115e.a();
        this.f4041m = (a1.j) a11;
        a11.a(this);
        abstractC4498a.d(a11);
        AbstractC0428e a12 = dVar.f37116f.a();
        this.f4042n = (a1.j) a12;
        a12.a(this);
        abstractC4498a.d(a12);
        if (abstractC4498a.l() != null) {
            a1.i a13 = ((C4444b) abstractC4498a.l().f903u).a();
            this.f4047s = a13;
            a13.a(this);
            abstractC4498a.d(this.f4047s);
        }
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4045q.invalidateSelf();
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

    @Override // Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f4035f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((m) arrayList.get(i)).f(), matrix);
                i++;
            }
        }
    }

    public final int[] d(int[] iArr) {
        a1.s sVar = this.f4044p;
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
    public final void e(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        AbstractC4603g.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.e
    public final void g(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        float[] fArr;
        int[] iArr;
        Shader shader;
        int[] iArr2;
        float[] fArr2;
        if (this.f4031b) {
            return;
        }
        Path path = this.f4035f;
        path.reset();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i6 >= arrayList.size()) {
                break;
            }
            path.addPath(((m) arrayList.get(i6)).f(), matrix);
            i6++;
        }
        path.computeBounds(this.f4037h, false);
        int i9 = this.f4038j;
        a1.j jVar = this.f4039k;
        a1.j jVar2 = this.f4042n;
        a1.j jVar3 = this.f4041m;
        if (i9 == 1) {
            long i10 = i();
            s.e eVar = this.f4033d;
            shader = (LinearGradient) eVar.j(i10, null);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                e1.c cVar = (e1.c) jVar.e();
                int[] d2 = d(cVar.f37110b);
                if (d2.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{d2[0], d2[0]};
                } else {
                    iArr2 = d2;
                    fArr2 = cVar.f37109a;
                }
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                eVar.k(i10, shader);
            }
        } else {
            long i11 = i();
            s.e eVar2 = this.f4034e;
            RadialGradient radialGradient = (RadialGradient) eVar2.j(i11, null);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                e1.c cVar2 = (e1.c) jVar.e();
                int[] d9 = d(cVar2.f37110b);
                if (d9.length < 2) {
                    fArr = new float[]{0.0f, 1.0f};
                    iArr = new int[]{d9[0], d9[0]};
                } else {
                    fArr = cVar2.f37109a;
                    iArr = d9;
                }
                float[] fArr3 = fArr;
                float f3 = pointF3.x;
                float f9 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f3, pointF4.y - f9);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f3, f9, hypot, iArr, fArr3, Shader.TileMode.CLAMP);
                eVar2.k(i11, radialGradient2);
                shader = radialGradient2;
            }
        }
        Shader shader2 = shader;
        shader2.setLocalMatrix(matrix);
        Y0.a aVar = this.f4036g;
        aVar.setShader(shader2);
        a1.s sVar = this.f4043o;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        AbstractC0428e abstractC0428e = this.f4047s;
        if (abstractC0428e != null) {
            float floatValue = ((Float) abstractC0428e.e()).floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f4048t) {
                aVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f4048t = floatValue;
        }
        float intValue = ((Integer) this.f4040l.e()).intValue() / 100.0f;
        aVar.setAlpha(AbstractC4603g.c((int) (i * intValue)));
        if (c4597a != null) {
            c4597a.a((int) (intValue * 255.0f), aVar);
        }
        canvas.drawPath(path, aVar);
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4030a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        PointF pointF = z.f3729a;
        if (colorFilter == 4) {
            this.f4040l.j(c2991bm);
            return;
        }
        ColorFilter colorFilter2 = z.f3724I;
        AbstractC4498a abstractC4498a = this.f4032c;
        if (colorFilter == colorFilter2) {
            a1.s sVar = this.f4043o;
            if (sVar != null) {
                abstractC4498a.o(sVar);
            }
            a1.s sVar2 = new a1.s(c2991bm, null);
            this.f4043o = sVar2;
            sVar2.a(this);
            abstractC4498a.d(this.f4043o);
            return;
        }
        if (colorFilter == z.J) {
            a1.s sVar3 = this.f4044p;
            if (sVar3 != null) {
                abstractC4498a.o(sVar3);
            }
            this.f4033d.h();
            this.f4034e.h();
            a1.s sVar4 = new a1.s(c2991bm, null);
            this.f4044p = sVar4;
            sVar4.a(this);
            abstractC4498a.d(this.f4044p);
            return;
        }
        if (colorFilter == z.f3733e) {
            AbstractC0428e abstractC0428e = this.f4047s;
            if (abstractC0428e != null) {
                abstractC0428e.j(c2991bm);
                return;
            }
            a1.s sVar5 = new a1.s(c2991bm, null);
            this.f4047s = sVar5;
            sVar5.a(this);
            abstractC4498a.d(this.f4047s);
        }
    }

    public final int i() {
        float f3 = this.f4041m.f4256d;
        float f9 = this.f4046r;
        int round = Math.round(f3 * f9);
        int round2 = Math.round(this.f4042n.f4256d * f9);
        int round3 = Math.round(this.f4039k.f4256d * f9);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
