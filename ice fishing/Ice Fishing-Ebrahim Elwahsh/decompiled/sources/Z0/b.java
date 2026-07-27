package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0421e;
import a1.InterfaceC0417a;
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
import d1.C4455a;
import d1.C4456b;
import f1.AbstractC4490a;
import j1.C4589b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC0417a, k, e {

    /* renamed from: e, reason: collision with root package name */
    public final v f4066e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC4490a f4067f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f4069h;
    public final Y0.a i;

    /* renamed from: j, reason: collision with root package name */
    public final a1.i f4070j;

    /* renamed from: k, reason: collision with root package name */
    public final a1.f f4071k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4072l;

    /* renamed from: m, reason: collision with root package name */
    public final a1.i f4073m;

    /* renamed from: n, reason: collision with root package name */
    public a1.s f4074n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0421e f4075o;

    /* renamed from: p, reason: collision with root package name */
    public float f4076p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f4062a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4063b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f4064c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f4065d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4068g = new ArrayList();

    public b(v vVar, AbstractC4490a abstractC4490a, Paint.Cap cap, Paint.Join join, float f6, C4455a c4455a, C4456b c4456b, ArrayList arrayList, C4456b c4456b2) {
        Y0.a aVar = new Y0.a(1, 0);
        this.i = aVar;
        this.f4076p = 0.0f;
        this.f4066e = vVar;
        this.f4067f = abstractC4490a;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f6);
        this.f4071k = (a1.f) c4455a.a();
        this.f4070j = c4456b.a();
        if (c4456b2 == null) {
            this.f4073m = null;
        } else {
            this.f4073m = c4456b2.a();
        }
        this.f4072l = new ArrayList(arrayList.size());
        this.f4069h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f4072l.add(((C4456b) arrayList.get(i)).a());
        }
        abstractC4490a.e(this.f4071k);
        abstractC4490a.e(this.f4070j);
        for (int i4 = 0; i4 < this.f4072l.size(); i4++) {
            abstractC4490a.e((AbstractC0421e) this.f4072l.get(i4));
        }
        a1.i iVar = this.f4073m;
        if (iVar != null) {
            abstractC4490a.e(iVar);
        }
        this.f4071k.a(this);
        this.f4070j.a(this);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((AbstractC0421e) this.f4072l.get(i9)).a(this);
        }
        a1.i iVar2 = this.f4073m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (abstractC4490a.l() != null) {
            a1.i a9 = ((C4456b) abstractC4490a.l().f37858u).a();
            this.f4075o = a9;
            a9.a(this);
            abstractC4490a.e(this.f4075o);
        }
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4066e.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        t tVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof t) {
                t tVar2 = (t) cVar;
                if (tVar2.f4195c == 2) {
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
            arrayList = this.f4068g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof t) {
                t tVar3 = (t) cVar2;
                if (tVar3.f4195c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(tVar3);
                    tVar3.c(this);
                    aVar = aVar2;
                }
            }
            if (cVar2 instanceof m) {
                if (aVar == null) {
                    aVar = new a(tVar);
                }
                aVar.f4060a.add((m) cVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // c1.f
    public void c(ColorFilter colorFilter, S0.s sVar) {
        PointF pointF = z.f3785a;
        if (colorFilter == 4) {
            this.f4071k.j(sVar);
            return;
        }
        if (colorFilter == z.f3800q) {
            this.f4070j.j(sVar);
            return;
        }
        ColorFilter colorFilter2 = z.f3780I;
        AbstractC4490a abstractC4490a = this.f4067f;
        if (colorFilter == colorFilter2) {
            a1.s sVar2 = this.f4074n;
            if (sVar2 != null) {
                abstractC4490a.o(sVar2);
            }
            a1.s sVar3 = new a1.s(sVar, null);
            this.f4074n = sVar3;
            sVar3.a(this);
            abstractC4490a.e(this.f4074n);
            return;
        }
        if (colorFilter == z.f3789e) {
            AbstractC0421e abstractC0421e = this.f4075o;
            if (abstractC0421e != null) {
                abstractC0421e.j(sVar);
                return;
            }
            a1.s sVar4 = new a1.s(sVar, null);
            this.f4075o = sVar4;
            sVar4.a(this);
            abstractC4490a.e(this.f4075o);
        }
    }

    @Override // Z0.e
    public final void d(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f4063b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4068g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f4065d;
                path.computeBounds(rectF2, false);
                float l9 = this.f4070j.l() / 2.0f;
                rectF2.set(rectF2.left - l9, rectF2.top - l9, rectF2.right + l9, rectF2.bottom + l9);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            a aVar = (a) arrayList.get(i);
            for (int i4 = 0; i4 < aVar.f4060a.size(); i4++) {
                path.addPath(((m) aVar.f4060a.get(i4)).g(), matrix);
            }
            i++;
        }
    }

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        j1.h.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.e
    public void h(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        int i4;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        b bVar = this;
        float[] fArr2 = (float[]) j1.j.f38537e.get();
        boolean z8 = false;
        fArr2[0] = 0.0f;
        int i9 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f6 = 100.0f;
        float intValue = ((Integer) bVar.f4071k.e()).intValue() / 100.0f;
        int c4 = j1.h.c((int) (i * intValue));
        Y0.a aVar = bVar.i;
        aVar.setAlpha(c4);
        aVar.setStrokeWidth(bVar.f4070j.l());
        if (aVar.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = bVar.f4072l;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = bVar.f4069h;
                if (i10 >= size) {
                    break;
                }
                float floatValue = ((Float) ((AbstractC0421e) arrayList.get(i10)).e()).floatValue();
                fArr[i10] = floatValue;
                if (i10 % 2 == 0) {
                    if (floatValue < 1.0f) {
                        fArr[i10] = 1.0f;
                    }
                } else if (floatValue < 0.1f) {
                    fArr[i10] = 0.1f;
                }
                i10++;
            }
            a1.i iVar = bVar.f4073m;
            aVar.setPathEffect(new DashPathEffect(fArr, iVar == null ? 0.0f : ((Float) iVar.e()).floatValue()));
        }
        a1.s sVar = bVar.f4074n;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        AbstractC0421e abstractC0421e = bVar.f4075o;
        if (abstractC0421e != null) {
            float floatValue2 = ((Float) abstractC0421e.e()).floatValue();
            if (floatValue2 == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue2 != bVar.f4076p) {
                AbstractC4490a abstractC4490a = bVar.f4067f;
                if (abstractC4490a.f37552A == floatValue2) {
                    blurMaskFilter = abstractC4490a.f37553B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC4490a.f37553B = blurMaskFilter2;
                    abstractC4490a.f37552A = floatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            bVar.f4076p = floatValue2;
        }
        if (c4589b != null) {
            c4589b.a((int) (intValue * 255.0f), aVar);
        }
        canvas.save();
        canvas.concat(matrix);
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = bVar.f4068g;
            if (i11 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            a aVar2 = (a) arrayList2.get(i11);
            t tVar = aVar2.f4061b;
            Path path = bVar.f4063b;
            ArrayList arrayList3 = aVar2.f4060a;
            if (tVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i9; size2 >= 0; size2--) {
                    path.addPath(((m) arrayList3.get(size2)).g());
                }
                t tVar2 = aVar2.f4061b;
                float floatValue3 = ((Float) tVar2.f4196d.e()).floatValue() / f6;
                float floatValue4 = ((Float) tVar2.f4197e.e()).floatValue() / f6;
                float floatValue5 = ((Float) tVar2.f4198f.e()).floatValue() / 360.0f;
                if (floatValue3 >= 0.01f || floatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = bVar.f4062a;
                    pathMeasure.setPath(path, z8);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f9 = floatValue5 * length;
                    float f10 = (floatValue3 * length) + f9;
                    float min = Math.min((floatValue4 * length) + f9, (f10 + length) - 1.0f);
                    int size3 = arrayList3.size() - i9;
                    float f11 = 0.0f;
                    while (size3 >= 0) {
                        int i12 = i9;
                        Path path2 = bVar.f4064c;
                        path2.set(((m) arrayList3.get(size3)).g());
                        pathMeasure.setPath(path2, z8);
                        float length2 = pathMeasure.getLength();
                        if (min > length) {
                            float f12 = min - length;
                            if (f12 < f11 + length2 && f11 < f12) {
                                j1.j.a(path2, f10 > length ? (f10 - length) / length2 : 0.0f, Math.min(f12 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, aVar);
                                f11 += length2;
                                size3--;
                                bVar = this;
                                i9 = i12;
                                z8 = false;
                            }
                        }
                        float f13 = f11 + length2;
                        if (f13 >= f10 && f11 <= min) {
                            if (f13 > min || f10 >= f11) {
                                j1.j.a(path2, f10 < f11 ? 0.0f : (f10 - f11) / length2, min > f13 ? 1.0f : (min - f11) / length2, 0.0f);
                                canvas.drawPath(path2, aVar);
                            } else {
                                canvas.drawPath(path2, aVar);
                            }
                        }
                        f11 += length2;
                        size3--;
                        bVar = this;
                        i9 = i12;
                        z8 = false;
                    }
                } else {
                    canvas.drawPath(path, aVar);
                }
                i4 = i9;
            } else {
                i4 = i9;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((m) arrayList3.get(size4)).g());
                }
                canvas.drawPath(path, aVar);
            }
            i11++;
            bVar = this;
            i9 = i4;
            z8 = false;
            f6 = 100.0f;
        }
    }
}
