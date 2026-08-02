package defpackage;

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
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class lt2 implements yr2, cbf, fqa {
    public final czg e;
    public final ds2 f;
    public final float[] h;
    public final pif i;
    public final yic j;
    public final s85 k;
    public final ArrayList l;
    public final yic m;
    public rwt n;
    public cs2 o;
    public float p;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public lt2(czg czgVar, ds2 ds2Var, Paint.Cap cap, Paint.Join join, float f, gk0 gk0Var, hk0 hk0Var, ArrayList arrayList, hk0 hk0Var2) {
        pif pifVar = new pif(1, 0);
        this.i = pifVar;
        this.p = 0.0f;
        this.e = czgVar;
        this.f = ds2Var;
        pifVar.setStyle(Paint.Style.STROKE);
        pifVar.setStrokeCap(cap);
        pifVar.setStrokeJoin(join);
        pifVar.setStrokeMiter(f);
        this.k = (s85) gk0Var.a();
        this.j = hk0Var.a();
        if (hk0Var2 == null) {
            this.m = null;
        } else {
            this.m = hk0Var2.a();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((hk0) arrayList.get(i)).a());
        }
        ds2Var.e(this.k);
        ds2Var.e(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            ds2Var.e((cs2) this.l.get(i2));
        }
        yic yicVar = this.m;
        if (yicVar != null) {
            ds2Var.e(yicVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((cs2) this.l.get(i3)).a(this);
        }
        yic yicVar2 = this.m;
        if (yicVar2 != null) {
            yicVar2.a(this);
        }
        if (ds2Var.k() != null) {
            yic a = ((hk0) ds2Var.k().b).a();
            this.o = a;
            a.a(this);
            ds2Var.e(this.o);
        }
    }

    @Override // defpackage.yr2
    public final void a() {
        this.e.invalidateSelf();
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        kt2 kt2Var = null;
        sat satVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            lb6 lb6Var = (lb6) arrayList2.get(size);
            if (lb6Var instanceof sat) {
                sat satVar2 = (sat) lb6Var;
                if (satVar2.c == 2) {
                    satVar = satVar2;
                }
            }
        }
        if (satVar != null) {
            satVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            lb6 lb6Var2 = (lb6) list2.get(size2);
            if (lb6Var2 instanceof sat) {
                sat satVar3 = (sat) lb6Var2;
                if (satVar3.c == 2) {
                    if (kt2Var != null) {
                        arrayList.add(kt2Var);
                    }
                    kt2 kt2Var2 = new kt2(satVar3);
                    satVar3.c(this);
                    kt2Var = kt2Var2;
                }
            }
            if (lb6Var2 instanceof hak) {
                if (kt2Var == null) {
                    kt2Var = new kt2(satVar);
                }
                kt2Var.a.add((hak) lb6Var2);
            }
        }
        if (kt2Var != null) {
            arrayList.add(kt2Var);
        }
    }

    @Override // defpackage.bbf
    public final void c(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        y5i.g(abfVar, i, arrayList, abfVar2, this);
    }

    @Override // defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float l = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - l, rectF2.top - l, rectF2.right + l, rectF2.bottom + l);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            kt2 kt2Var = (kt2) arrayList.get(i);
            for (int i2 = 0; i2 < kt2Var.a.size(); i2++) {
                path.addPath(((hak) kt2Var.a.get(i2)).getPath(), matrix);
            }
            i++;
        }
    }

    public void f(szg szgVar, Object obj) {
        PointF pointF = lzg.a;
        if (obj == 4) {
            this.k.j(szgVar);
            return;
        }
        if (obj == lzg.q) {
            this.j.j(szgVar);
            return;
        }
        ColorFilter colorFilter = lzg.I;
        ds2 ds2Var = this.f;
        if (obj == colorFilter) {
            rwt rwtVar = this.n;
            if (rwtVar != null) {
                ds2Var.n(rwtVar);
            }
            if (szgVar == null) {
                this.n = null;
                return;
            }
            rwt rwtVar2 = new rwt(szgVar, null);
            this.n = rwtVar2;
            rwtVar2.a(this);
            ds2Var.e(this.n);
            return;
        }
        if (obj == lzg.e) {
            cs2 cs2Var = this.o;
            if (cs2Var != null) {
                cs2Var.j(szgVar);
                return;
            }
            rwt rwtVar3 = new rwt(szgVar, null);
            this.o = rwtVar3;
            rwtVar3.a(this);
            ds2Var.e(this.o);
        }
    }

    public void g(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        int i2;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        lt2 lt2Var = this;
        float[] fArr2 = (float[]) rvt.e.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f = 100.0f;
        float intValue = ((Integer) lt2Var.k.e()).intValue() / 100.0f;
        int c = y5i.c((int) (i * intValue));
        pif pifVar = lt2Var.i;
        pifVar.setAlpha(c);
        pifVar.setStrokeWidth(lt2Var.j.l());
        if (pifVar.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = lt2Var.l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = lt2Var.h;
                if (i4 >= size) {
                    break;
                }
                float floatValue = ((Float) ((cs2) arrayList.get(i4)).e()).floatValue();
                fArr[i4] = floatValue;
                if (i4 % 2 == 0) {
                    if (floatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (floatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            yic yicVar = lt2Var.m;
            pifVar.setPathEffect(new DashPathEffect(fArr, yicVar == null ? 0.0f : ((Float) yicVar.e()).floatValue()));
        }
        rwt rwtVar = lt2Var.n;
        if (rwtVar != null) {
            pifVar.setColorFilter((ColorFilter) rwtVar.e());
        }
        cs2 cs2Var = lt2Var.o;
        if (cs2Var != null) {
            float floatValue2 = ((Float) cs2Var.e()).floatValue();
            if (floatValue2 == 0.0f) {
                pifVar.setMaskFilter(null);
            } else if (floatValue2 != lt2Var.p) {
                ds2 ds2Var = lt2Var.f;
                if (ds2Var.A == floatValue2) {
                    blurMaskFilter = ds2Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    ds2Var.B = blurMaskFilter2;
                    ds2Var.A = floatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                pifVar.setMaskFilter(blurMaskFilter);
            }
            lt2Var.p = floatValue2;
        }
        if (qraVar != null) {
            qraVar.a((int) (intValue * 255.0f), pifVar);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = lt2Var.g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            kt2 kt2Var = (kt2) arrayList2.get(i5);
            sat satVar = kt2Var.b;
            ArrayList arrayList3 = kt2Var.a;
            Path path = lt2Var.b;
            if (satVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((hak) arrayList3.get(size2)).getPath());
                }
                float floatValue3 = ((Float) satVar.d.e()).floatValue() / f;
                float floatValue4 = ((Float) satVar.e.e()).floatValue() / f;
                float floatValue5 = ((Float) satVar.f.e()).floatValue() / 360.0f;
                if (floatValue3 >= 0.01f || floatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = lt2Var.a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f2 = floatValue5 * length;
                    float f3 = (floatValue3 * length) + f2;
                    float min = Math.min((floatValue4 * length) + f2, (f3 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f4 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path path2 = ((hak) arrayList3.get(size3)).getPath();
                        Path path3 = lt2Var.c;
                        path3.set(path2);
                        pathMeasure.setPath(path3, z);
                        float length2 = pathMeasure.getLength();
                        if (min > length) {
                            float f5 = min - length;
                            if (f5 < f4 + length2 && f4 < f5) {
                                rvt.a(path3, f3 > length ? (f3 - length) / length2 : 0.0f, Math.min(f5 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path3, pifVar);
                                f4 += length2;
                                size3--;
                                lt2Var = this;
                                i3 = i6;
                                z = false;
                            }
                        }
                        float f6 = f4 + length2;
                        if (f6 >= f3 && f4 <= min) {
                            if (f6 > min || f3 >= f4) {
                                rvt.a(path3, f3 < f4 ? 0.0f : (f3 - f4) / length2, min > f6 ? 1.0f : (min - f4) / length2, 0.0f);
                                canvas.drawPath(path3, pifVar);
                            } else {
                                canvas.drawPath(path3, pifVar);
                            }
                        }
                        f4 += length2;
                        size3--;
                        lt2Var = this;
                        i3 = i6;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, pifVar);
                }
                i2 = i3;
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((hak) arrayList3.get(size4)).getPath());
                }
                canvas.drawPath(path, pifVar);
            }
            i5++;
            lt2Var = this;
            i3 = i2;
            z = false;
            f = 100.0f;
        }
    }
}
