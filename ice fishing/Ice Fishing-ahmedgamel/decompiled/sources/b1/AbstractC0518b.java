package b1;

import Z0.v;
import Z0.z;
import a1.C0428a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import c1.AbstractC0545e;
import c1.InterfaceC0541a;
import com.google.android.gms.internal.ads.LP;
import f1.C4515a;
import f1.C4516b;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.List;
import l1.AbstractC4672g;
import l1.C4666a;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0518b implements InterfaceC0541a, k, InterfaceC0521e {

    /* renamed from: e, reason: collision with root package name */
    public final v f5378e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC4563a f5379f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f5381h;
    public final C0428a i;

    /* renamed from: j, reason: collision with root package name */
    public final c1.i f5382j;

    /* renamed from: k, reason: collision with root package name */
    public final c1.f f5383k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f5384l;

    /* renamed from: m, reason: collision with root package name */
    public final c1.i f5385m;

    /* renamed from: n, reason: collision with root package name */
    public c1.s f5386n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0545e f5387o;

    /* renamed from: p, reason: collision with root package name */
    public float f5388p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f5374a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f5375b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f5376c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f5377d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5380g = new ArrayList();

    public AbstractC0518b(v vVar, AbstractC4563a abstractC4563a, Paint.Cap cap, Paint.Join join, float f2, C4515a c4515a, C4516b c4516b, ArrayList arrayList, C4516b c4516b2) {
        C0428a c0428a = new C0428a(1, 0);
        this.i = c0428a;
        this.f5388p = 0.0f;
        this.f5378e = vVar;
        this.f5379f = abstractC4563a;
        c0428a.setStyle(Paint.Style.STROKE);
        c0428a.setStrokeCap(cap);
        c0428a.setStrokeJoin(join);
        c0428a.setStrokeMiter(f2);
        this.f5383k = (c1.f) c4515a.a();
        this.f5382j = c4516b.a();
        if (c4516b2 == null) {
            this.f5385m = null;
        } else {
            this.f5385m = c4516b2.a();
        }
        this.f5384l = new ArrayList(arrayList.size());
        this.f5381h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f5384l.add(((C4516b) arrayList.get(i)).a());
        }
        abstractC4563a.f(this.f5383k);
        abstractC4563a.f(this.f5382j);
        for (int i4 = 0; i4 < this.f5384l.size(); i4++) {
            abstractC4563a.f((AbstractC0545e) this.f5384l.get(i4));
        }
        c1.i iVar = this.f5385m;
        if (iVar != null) {
            abstractC4563a.f(iVar);
        }
        this.f5383k.a(this);
        this.f5382j.a(this);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((AbstractC0545e) this.f5384l.get(i6)).a(this);
        }
        c1.i iVar2 = this.f5385m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (abstractC4563a.l() != null) {
            c1.i a9 = ((C4516b) abstractC4563a.l().f38154u).a();
            this.f5387o = a9;
            a9.a(this);
            abstractC4563a.f(this.f5387o);
        }
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5378e.invalidateSelf();
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0517a c0517a = null;
        t tVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList2.get(size);
            if (interfaceC0519c instanceof t) {
                t tVar2 = (t) interfaceC0519c;
                if (tVar2.f5507c == 2) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f5380g;
            if (size2 < 0) {
                break;
            }
            InterfaceC0519c interfaceC0519c2 = (InterfaceC0519c) list2.get(size2);
            if (interfaceC0519c2 instanceof t) {
                t tVar3 = (t) interfaceC0519c2;
                if (tVar3.f5507c == 2) {
                    if (c0517a != null) {
                        arrayList.add(c0517a);
                    }
                    C0517a c0517a2 = new C0517a(tVar3);
                    tVar3.c(this);
                    c0517a = c0517a2;
                }
            }
            if (interfaceC0519c2 instanceof m) {
                if (c0517a == null) {
                    c0517a = new C0517a(tVar);
                }
                c0517a.f5372a.add((m) interfaceC0519c2);
            }
        }
        if (c0517a != null) {
            arrayList.add(c0517a);
        }
    }

    @Override // e1.f
    public final void c(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        AbstractC4672g.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // e1.f
    public void d(ColorFilter colorFilter, LP lp) {
        PointF pointF = z.f4080a;
        if (colorFilter == 4) {
            this.f5383k.j(lp);
            return;
        }
        if (colorFilter == z.f4095q) {
            this.f5382j.j(lp);
            return;
        }
        ColorFilter colorFilter2 = z.f4075I;
        AbstractC4563a abstractC4563a = this.f5379f;
        if (colorFilter == colorFilter2) {
            c1.s sVar = this.f5386n;
            if (sVar != null) {
                abstractC4563a.o(sVar);
            }
            c1.s sVar2 = new c1.s(lp, null);
            this.f5386n = sVar2;
            sVar2.a(this);
            abstractC4563a.f(this.f5386n);
            return;
        }
        if (colorFilter == z.f4084e) {
            AbstractC0545e abstractC0545e = this.f5387o;
            if (abstractC0545e != null) {
                abstractC0545e.j(lp);
                return;
            }
            c1.s sVar3 = new c1.s(lp, null);
            this.f5387o = sVar3;
            sVar3.a(this);
            abstractC4563a.f(this.f5387o);
        }
    }

    @Override // b1.InterfaceC0521e
    public final void e(RectF rectF, Matrix matrix, boolean z6) {
        Path path = this.f5375b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5380g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f5377d;
                path.computeBounds(rectF2, false);
                float l9 = this.f5382j.l() / 2.0f;
                rectF2.set(rectF2.left - l9, rectF2.top - l9, rectF2.right + l9, rectF2.bottom + l9);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            C0517a c0517a = (C0517a) arrayList.get(i);
            for (int i4 = 0; i4 < c0517a.f5372a.size(); i4++) {
                path.addPath(((m) c0517a.f5372a.get(i4)).g(), matrix);
            }
            i++;
        }
    }

    @Override // b1.InterfaceC0521e
    public void h(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        int i4;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        AbstractC0518b abstractC0518b = this;
        float[] fArr2 = (float[]) l1.i.f38866e.get();
        boolean z6 = false;
        fArr2[0] = 0.0f;
        int i6 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = 100.0f;
        float intValue = ((Integer) abstractC0518b.f5383k.e()).intValue() / 100.0f;
        int c9 = AbstractC4672g.c((int) (i * intValue));
        C0428a c0428a = abstractC0518b.i;
        c0428a.setAlpha(c9);
        c0428a.setStrokeWidth(abstractC0518b.f5382j.l());
        if (c0428a.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = abstractC0518b.f5384l;
        if (!arrayList.isEmpty()) {
            int i9 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = abstractC0518b.f5381h;
                if (i9 >= size) {
                    break;
                }
                float floatValue = ((Float) ((AbstractC0545e) arrayList.get(i9)).e()).floatValue();
                fArr[i9] = floatValue;
                if (i9 % 2 == 0) {
                    if (floatValue < 1.0f) {
                        fArr[i9] = 1.0f;
                    }
                } else if (floatValue < 0.1f) {
                    fArr[i9] = 0.1f;
                }
                i9++;
            }
            c1.i iVar = abstractC0518b.f5385m;
            c0428a.setPathEffect(new DashPathEffect(fArr, iVar == null ? 0.0f : ((Float) iVar.e()).floatValue()));
        }
        c1.s sVar = abstractC0518b.f5386n;
        if (sVar != null) {
            c0428a.setColorFilter((ColorFilter) sVar.e());
        }
        AbstractC0545e abstractC0545e = abstractC0518b.f5387o;
        if (abstractC0545e != null) {
            float floatValue2 = ((Float) abstractC0545e.e()).floatValue();
            if (floatValue2 == 0.0f) {
                c0428a.setMaskFilter(null);
            } else if (floatValue2 != abstractC0518b.f5388p) {
                AbstractC4563a abstractC4563a = abstractC0518b.f5379f;
                if (abstractC4563a.f37972A == floatValue2) {
                    blurMaskFilter = abstractC4563a.f37973B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC4563a.f37973B = blurMaskFilter2;
                    abstractC4563a.f37972A = floatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                c0428a.setMaskFilter(blurMaskFilter);
            }
            abstractC0518b.f5388p = floatValue2;
        }
        if (c4666a != null) {
            c4666a.a((int) (intValue * 255.0f), c0428a);
        }
        canvas.save();
        canvas.concat(matrix);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = abstractC0518b.f5380g;
            if (i10 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            C0517a c0517a = (C0517a) arrayList2.get(i10);
            t tVar = c0517a.f5373b;
            Path path = abstractC0518b.f5375b;
            ArrayList arrayList3 = c0517a.f5372a;
            if (tVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i6; size2 >= 0; size2--) {
                    path.addPath(((m) arrayList3.get(size2)).g());
                }
                t tVar2 = c0517a.f5373b;
                float floatValue3 = ((Float) tVar2.f5508d.e()).floatValue() / f2;
                float floatValue4 = ((Float) tVar2.f5509e.e()).floatValue() / f2;
                float floatValue5 = ((Float) tVar2.f5510f.e()).floatValue() / 360.0f;
                if (floatValue3 >= 0.01f || floatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = abstractC0518b.f5374a;
                    pathMeasure.setPath(path, z6);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f9 = floatValue5 * length;
                    float f10 = (floatValue3 * length) + f9;
                    float min = Math.min((floatValue4 * length) + f9, (f10 + length) - 1.0f);
                    int size3 = arrayList3.size() - i6;
                    float f11 = 0.0f;
                    while (size3 >= 0) {
                        int i11 = i6;
                        Path path2 = abstractC0518b.f5376c;
                        path2.set(((m) arrayList3.get(size3)).g());
                        pathMeasure.setPath(path2, z6);
                        float length2 = pathMeasure.getLength();
                        if (min > length) {
                            float f12 = min - length;
                            if (f12 < f11 + length2 && f11 < f12) {
                                l1.i.a(path2, f10 > length ? (f10 - length) / length2 : 0.0f, Math.min(f12 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, c0428a);
                                f11 += length2;
                                size3--;
                                abstractC0518b = this;
                                i6 = i11;
                                z6 = false;
                            }
                        }
                        float f13 = f11 + length2;
                        if (f13 >= f10 && f11 <= min) {
                            if (f13 > min || f10 >= f11) {
                                l1.i.a(path2, f10 < f11 ? 0.0f : (f10 - f11) / length2, min > f13 ? 1.0f : (min - f11) / length2, 0.0f);
                                canvas.drawPath(path2, c0428a);
                            } else {
                                canvas.drawPath(path2, c0428a);
                            }
                        }
                        f11 += length2;
                        size3--;
                        abstractC0518b = this;
                        i6 = i11;
                        z6 = false;
                    }
                } else {
                    canvas.drawPath(path, c0428a);
                }
                i4 = i6;
            } else {
                i4 = i6;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((m) arrayList3.get(size4)).g());
                }
                canvas.drawPath(path, c0428a);
            }
            i10++;
            abstractC0518b = this;
            i6 = i4;
            z6 = false;
            f2 = 100.0f;
        }
    }
}
