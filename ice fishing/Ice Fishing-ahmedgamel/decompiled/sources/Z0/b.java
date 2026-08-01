package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0428e;
import a1.InterfaceC0424a;
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
import com.google.android.gms.internal.ads.C2991bm;
import d1.C4443a;
import d1.C4444b;
import f1.AbstractC4498a;
import j1.AbstractC4603g;
import j1.C4597a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC0424a, k, e {

    /* renamed from: e, reason: collision with root package name */
    public final v f3989e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC4498a f3990f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f3992h;
    public final Y0.a i;

    /* renamed from: j, reason: collision with root package name */
    public final a1.i f3993j;

    /* renamed from: k, reason: collision with root package name */
    public final a1.f f3994k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3995l;

    /* renamed from: m, reason: collision with root package name */
    public final a1.i f3996m;

    /* renamed from: n, reason: collision with root package name */
    public a1.s f3997n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0428e f3998o;

    /* renamed from: p, reason: collision with root package name */
    public float f3999p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f3985a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f3986b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f3987c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f3988d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3991g = new ArrayList();

    public b(v vVar, AbstractC4498a abstractC4498a, Paint.Cap cap, Paint.Join join, float f3, C4443a c4443a, C4444b c4444b, ArrayList arrayList, C4444b c4444b2) {
        Y0.a aVar = new Y0.a(1, 0);
        this.i = aVar;
        this.f3999p = 0.0f;
        this.f3989e = vVar;
        this.f3990f = abstractC4498a;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f3);
        this.f3994k = (a1.f) c4443a.a();
        this.f3993j = c4444b.a();
        if (c4444b2 == null) {
            this.f3996m = null;
        } else {
            this.f3996m = c4444b2.a();
        }
        this.f3995l = new ArrayList(arrayList.size());
        this.f3992h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f3995l.add(((C4444b) arrayList.get(i)).a());
        }
        abstractC4498a.d(this.f3994k);
        abstractC4498a.d(this.f3993j);
        for (int i6 = 0; i6 < this.f3995l.size(); i6++) {
            abstractC4498a.d((AbstractC0428e) this.f3995l.get(i6));
        }
        a1.i iVar = this.f3996m;
        if (iVar != null) {
            abstractC4498a.d(iVar);
        }
        this.f3994k.a(this);
        this.f3993j.a(this);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((AbstractC0428e) this.f3995l.get(i9)).a(this);
        }
        a1.i iVar2 = this.f3996m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (abstractC4498a.l() != null) {
            a1.i a9 = ((C4444b) abstractC4498a.l().f903u).a();
            this.f3998o = a9;
            a9.a(this);
            abstractC4498a.d(this.f3998o);
        }
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f3989e.invalidateSelf();
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
                if (tVar2.f4118c == 2) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f3991g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof t) {
                t tVar3 = (t) cVar2;
                if (tVar3.f4118c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(tVar3);
                    tVar3.d(this);
                    aVar = aVar2;
                }
            }
            if (cVar2 instanceof m) {
                if (aVar == null) {
                    aVar = new a(tVar);
                }
                aVar.f3983a.add((m) cVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f3986b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3991g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f3988d;
                path.computeBounds(rectF2, false);
                float l9 = this.f3993j.l() / 2.0f;
                rectF2.set(rectF2.left - l9, rectF2.top - l9, rectF2.right + l9, rectF2.bottom + l9);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            a aVar = (a) arrayList.get(i);
            for (int i6 = 0; i6 < aVar.f3983a.size(); i6++) {
                path.addPath(((m) aVar.f3983a.get(i6)).f(), matrix);
            }
            i++;
        }
    }

    @Override // c1.f
    public final void e(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        AbstractC4603g.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.e
    public void g(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        int i6;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        b bVar = this;
        float[] fArr2 = (float[]) j1.j.f38354e.get();
        boolean z3 = false;
        fArr2[0] = 0.0f;
        int i9 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f3 = 100.0f;
        float intValue = ((Integer) bVar.f3994k.e()).intValue() / 100.0f;
        int c9 = AbstractC4603g.c((int) (i * intValue));
        Y0.a aVar = bVar.i;
        aVar.setAlpha(c9);
        aVar.setStrokeWidth(bVar.f3993j.l());
        if (aVar.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = bVar.f3995l;
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = bVar.f3992h;
                if (i10 >= size) {
                    break;
                }
                float floatValue = ((Float) ((AbstractC0428e) arrayList.get(i10)).e()).floatValue();
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
            a1.i iVar = bVar.f3996m;
            aVar.setPathEffect(new DashPathEffect(fArr, iVar == null ? 0.0f : ((Float) iVar.e()).floatValue()));
        }
        a1.s sVar = bVar.f3997n;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        AbstractC0428e abstractC0428e = bVar.f3998o;
        if (abstractC0428e != null) {
            float floatValue2 = ((Float) abstractC0428e.e()).floatValue();
            if (floatValue2 == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue2 != bVar.f3999p) {
                AbstractC4498a abstractC4498a = bVar.f3990f;
                if (abstractC4498a.f37348A == floatValue2) {
                    blurMaskFilter = abstractC4498a.f37349B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC4498a.f37349B = blurMaskFilter2;
                    abstractC4498a.f37348A = floatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            bVar.f3999p = floatValue2;
        }
        if (c4597a != null) {
            c4597a.a((int) (intValue * 255.0f), aVar);
        }
        canvas.save();
        canvas.concat(matrix);
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = bVar.f3991g;
            if (i11 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            a aVar2 = (a) arrayList2.get(i11);
            t tVar = aVar2.f3984b;
            Path path = bVar.f3986b;
            ArrayList arrayList3 = aVar2.f3983a;
            if (tVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i9; size2 >= 0; size2--) {
                    path.addPath(((m) arrayList3.get(size2)).f());
                }
                t tVar2 = aVar2.f3984b;
                float floatValue3 = ((Float) tVar2.f4119d.e()).floatValue() / f3;
                float floatValue4 = ((Float) tVar2.f4120e.e()).floatValue() / f3;
                float floatValue5 = ((Float) tVar2.f4121f.e()).floatValue() / 360.0f;
                if (floatValue3 >= 0.01f || floatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = bVar.f3985a;
                    pathMeasure.setPath(path, z3);
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
                        Path path2 = bVar.f3987c;
                        path2.set(((m) arrayList3.get(size3)).f());
                        pathMeasure.setPath(path2, z3);
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
                                z3 = false;
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
                        z3 = false;
                    }
                } else {
                    canvas.drawPath(path, aVar);
                }
                i6 = i9;
            } else {
                i6 = i9;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((m) arrayList3.get(size4)).f());
                }
                canvas.drawPath(path, aVar);
            }
            i11++;
            bVar = this;
            i9 = i6;
            z3 = false;
            f3 = 100.0f;
        }
    }

    @Override // c1.f
    public void h(ColorFilter colorFilter, C2991bm c2991bm) {
        PointF pointF = z.f3729a;
        if (colorFilter == 4) {
            this.f3994k.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3744q) {
            this.f3993j.j(c2991bm);
            return;
        }
        ColorFilter colorFilter2 = z.f3724I;
        AbstractC4498a abstractC4498a = this.f3990f;
        if (colorFilter == colorFilter2) {
            a1.s sVar = this.f3997n;
            if (sVar != null) {
                abstractC4498a.o(sVar);
            }
            a1.s sVar2 = new a1.s(c2991bm, null);
            this.f3997n = sVar2;
            sVar2.a(this);
            abstractC4498a.d(this.f3997n);
            return;
        }
        if (colorFilter == z.f3733e) {
            AbstractC0428e abstractC0428e = this.f3998o;
            if (abstractC0428e != null) {
                abstractC0428e.j(c2991bm);
                return;
            }
            a1.s sVar3 = new a1.s(c2991bm, null);
            this.f3998o = sVar3;
            sVar3.a(this);
            abstractC4498a.d(this.f3998o);
        }
    }
}
