package b1;

import Z0.v;
import Z0.z;
import a1.C0428a;
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
import c1.AbstractC0545e;
import c1.InterfaceC0541a;
import com.google.android.gms.internal.ads.LP;
import f1.C4516b;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.List;
import l1.AbstractC4672g;
import l1.C4666a;

/* loaded from: classes.dex */
public final class h implements InterfaceC0521e, InterfaceC0541a, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f5419a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5420b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4563a f5421c;

    /* renamed from: d, reason: collision with root package name */
    public final s.e f5422d = new s.e();

    /* renamed from: e, reason: collision with root package name */
    public final s.e f5423e = new s.e();

    /* renamed from: f, reason: collision with root package name */
    public final Path f5424f;

    /* renamed from: g, reason: collision with root package name */
    public final C0428a f5425g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f5426h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5427j;

    /* renamed from: k, reason: collision with root package name */
    public final c1.j f5428k;

    /* renamed from: l, reason: collision with root package name */
    public final c1.f f5429l;

    /* renamed from: m, reason: collision with root package name */
    public final c1.j f5430m;

    /* renamed from: n, reason: collision with root package name */
    public final c1.j f5431n;

    /* renamed from: o, reason: collision with root package name */
    public c1.s f5432o;

    /* renamed from: p, reason: collision with root package name */
    public c1.s f5433p;

    /* renamed from: q, reason: collision with root package name */
    public final v f5434q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5435r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0545e f5436s;

    /* renamed from: t, reason: collision with root package name */
    public float f5437t;

    public h(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a, g1.d dVar) {
        Path path = new Path();
        this.f5424f = path;
        this.f5425g = new C0428a(1, 0);
        this.f5426h = new RectF();
        this.i = new ArrayList();
        this.f5437t = 0.0f;
        this.f5421c = abstractC4563a;
        this.f5419a = dVar.f37593g;
        this.f5420b = dVar.f37594h;
        this.f5434q = vVar;
        this.f5427j = dVar.f37587a;
        path.setFillType(dVar.f37588b);
        this.f5435r = (int) (iVar.b() / 32.0f);
        AbstractC0545e a9 = dVar.f37589c.a();
        this.f5428k = (c1.j) a9;
        a9.a(this);
        abstractC4563a.f(a9);
        AbstractC0545e a10 = dVar.f37590d.a();
        this.f5429l = (c1.f) a10;
        a10.a(this);
        abstractC4563a.f(a10);
        AbstractC0545e a11 = dVar.f37591e.a();
        this.f5430m = (c1.j) a11;
        a11.a(this);
        abstractC4563a.f(a11);
        AbstractC0545e a12 = dVar.f37592f.a();
        this.f5431n = (c1.j) a12;
        a12.a(this);
        abstractC4563a.f(a12);
        if (abstractC4563a.l() != null) {
            c1.i a13 = ((C4516b) abstractC4563a.l().f38154u).a();
            this.f5436s = a13;
            a13.a(this);
            abstractC4563a.f(this.f5436s);
        }
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5434q.invalidateSelf();
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) list2.get(i);
            if (interfaceC0519c instanceof m) {
                this.i.add((m) interfaceC0519c);
            }
        }
    }

    @Override // e1.f
    public final void c(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        AbstractC4672g.g(eVar, i, arrayList, eVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        PointF pointF = z.f4080a;
        if (colorFilter == 4) {
            this.f5429l.j(lp);
            return;
        }
        ColorFilter colorFilter2 = z.f4075I;
        AbstractC4563a abstractC4563a = this.f5421c;
        if (colorFilter == colorFilter2) {
            c1.s sVar = this.f5432o;
            if (sVar != null) {
                abstractC4563a.o(sVar);
            }
            c1.s sVar2 = new c1.s(lp, null);
            this.f5432o = sVar2;
            sVar2.a(this);
            abstractC4563a.f(this.f5432o);
            return;
        }
        if (colorFilter == z.J) {
            c1.s sVar3 = this.f5433p;
            if (sVar3 != null) {
                abstractC4563a.o(sVar3);
            }
            this.f5422d.h();
            this.f5423e.h();
            c1.s sVar4 = new c1.s(lp, null);
            this.f5433p = sVar4;
            sVar4.a(this);
            abstractC4563a.f(this.f5433p);
            return;
        }
        if (colorFilter == z.f4084e) {
            AbstractC0545e abstractC0545e = this.f5436s;
            if (abstractC0545e != null) {
                abstractC0545e.j(lp);
                return;
            }
            c1.s sVar5 = new c1.s(lp, null);
            this.f5436s = sVar5;
            sVar5.a(this);
            abstractC4563a.f(this.f5436s);
        }
    }

    @Override // b1.InterfaceC0521e
    public final void e(RectF rectF, Matrix matrix, boolean z6) {
        Path path = this.f5424f;
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

    public final int[] f(int[] iArr) {
        c1.s sVar = this.f5433p;
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
        return this.f5419a;
    }

    @Override // b1.InterfaceC0521e
    public final void h(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        float[] fArr;
        int[] iArr;
        Shader shader;
        int[] iArr2;
        float[] fArr2;
        if (this.f5420b) {
            return;
        }
        Path path = this.f5424f;
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
        path.computeBounds(this.f5426h, false);
        int i6 = this.f5427j;
        c1.j jVar = this.f5428k;
        c1.j jVar2 = this.f5431n;
        c1.j jVar3 = this.f5430m;
        if (i6 == 1) {
            long i9 = i();
            s.e eVar = this.f5422d;
            shader = (LinearGradient) eVar.j(i9, null);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                g1.c cVar = (g1.c) jVar.e();
                int[] f2 = f(cVar.f37586b);
                if (f2.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{f2[0], f2[0]};
                } else {
                    iArr2 = f2;
                    fArr2 = cVar.f37585a;
                }
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                eVar.k(i9, shader);
            }
        } else {
            long i10 = i();
            s.e eVar2 = this.f5423e;
            RadialGradient radialGradient = (RadialGradient) eVar2.j(i10, null);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                g1.c cVar2 = (g1.c) jVar.e();
                int[] f9 = f(cVar2.f37586b);
                if (f9.length < 2) {
                    fArr = new float[]{0.0f, 1.0f};
                    iArr = new int[]{f9[0], f9[0]};
                } else {
                    fArr = cVar2.f37585a;
                    iArr = f9;
                }
                float[] fArr3 = fArr;
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f10, pointF4.y - f11);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f10, f11, hypot, iArr, fArr3, Shader.TileMode.CLAMP);
                eVar2.k(i10, radialGradient2);
                shader = radialGradient2;
            }
        }
        Shader shader2 = shader;
        shader2.setLocalMatrix(matrix);
        C0428a c0428a = this.f5425g;
        c0428a.setShader(shader2);
        c1.s sVar = this.f5432o;
        if (sVar != null) {
            c0428a.setColorFilter((ColorFilter) sVar.e());
        }
        AbstractC0545e abstractC0545e = this.f5436s;
        if (abstractC0545e != null) {
            float floatValue = ((Float) abstractC0545e.e()).floatValue();
            if (floatValue == 0.0f) {
                c0428a.setMaskFilter(null);
            } else if (floatValue != this.f5437t) {
                c0428a.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f5437t = floatValue;
        }
        float intValue = ((Integer) this.f5429l.e()).intValue() / 100.0f;
        c0428a.setAlpha(AbstractC4672g.c((int) (i * intValue)));
        if (c4666a != null) {
            c4666a.a((int) (intValue * 255.0f), c0428a);
        }
        canvas.drawPath(path, c0428a);
    }

    public final int i() {
        float f2 = this.f5430m.f5651d;
        float f9 = this.f5435r;
        int round = Math.round(f2 * f9);
        int round2 = Math.round(this.f5431n.f5651d * f9);
        int round3 = Math.round(this.f5428k.f5651d * f9);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
