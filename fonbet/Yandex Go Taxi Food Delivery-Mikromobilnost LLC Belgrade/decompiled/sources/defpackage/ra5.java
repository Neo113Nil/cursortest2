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
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import com.airbnb.lottie.utils.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class ra5 implements e35, uix, ccm {
    public final LottieDrawable e;
    public final l35 f;
    public final float[] h;
    public final LPaint i;
    public final kor j;
    public final lfc k;
    public final ArrayList l;
    public final kor m;
    public e131 n;
    public i35 o;
    public float p;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public ra5(LottieDrawable lottieDrawable, l35 l35Var, Paint.Cap cap, Paint.Join join, float f, ae2 ae2Var, be2 be2Var, ArrayList arrayList, be2 be2Var2) {
        LPaint lPaint = new LPaint(1);
        this.i = lPaint;
        this.p = 0.0f;
        this.e = lottieDrawable;
        this.f = l35Var;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f);
        this.k = (lfc) ae2Var.I();
        this.j = be2Var.I();
        if (be2Var2 == null) {
            this.m = null;
        } else {
            this.m = be2Var2.I();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((be2) arrayList.get(i)).I());
        }
        l35Var.c(this.k);
        l35Var.c(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            l35Var.c((i35) this.l.get(i2));
        }
        kor korVar = this.m;
        if (korVar != null) {
            l35Var.c(korVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((i35) this.l.get(i3)).a(this);
        }
        kor korVar2 = this.m;
        if (korVar2 != null) {
            korVar2.a(this);
        }
        if (l35Var.j() != null) {
            kor I = ((be2) l35Var.j().b).I();
            this.o = I;
            I.a(this);
            l35Var.c(this.o);
        }
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        ti20.g(sixVar, i, arrayList, sixVar2, this);
    }

    @Override // defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        AsyncUpdates asyncUpdates = upx.a;
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float m = this.j.m() / 2.0f;
                rectF2.set(rectF2.left - m, rectF2.top - m, rectF2.right + m, rectF2.bottom + m);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                AsyncUpdates asyncUpdates2 = upx.a;
                return;
            }
            qa5 qa5Var = (qa5) arrayList.get(i);
            for (int i2 = 0; i2 < qa5Var.a.size(); i2++) {
                path.addPath(((vq90) qa5Var.a.get(i2)).getPath(), matrix);
            }
            i++;
        }
    }

    @Override // defpackage.e35
    public final void d() {
        this.e.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        qa5 qa5Var = null;
        ff11 ff11Var = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            uee ueeVar = (uee) arrayList2.get(size);
            if (ueeVar instanceof ff11) {
                ff11 ff11Var2 = (ff11) ueeVar;
                if (ff11Var2.c == ShapeTrimPath$Type.INDIVIDUALLY) {
                    ff11Var = ff11Var2;
                }
            }
        }
        if (ff11Var != null) {
            ff11Var.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            uee ueeVar2 = (uee) list2.get(size2);
            if (ueeVar2 instanceof ff11) {
                ff11 ff11Var3 = (ff11) ueeVar2;
                if (ff11Var3.c == ShapeTrimPath$Type.INDIVIDUALLY) {
                    if (qa5Var != null) {
                        arrayList.add(qa5Var);
                    }
                    qa5 qa5Var2 = new qa5(ff11Var3);
                    ff11Var3.a(this);
                    qa5Var = qa5Var2;
                }
            }
            if (ueeVar2 instanceof vq90) {
                if (qa5Var == null) {
                    qa5Var = new qa5(ff11Var);
                }
                qa5Var.a.add((vq90) ueeVar2);
            }
        }
        if (qa5Var != null) {
            arrayList.add(qa5Var);
        }
    }

    public void f(Canvas canvas, Matrix matrix, int i, a aVar) {
        int i2;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        ra5 ra5Var = this;
        AsyncUpdates asyncUpdates = upx.a;
        float[] fArr2 = (float[]) zw21.e.get();
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
        float intValue = ((Integer) ra5Var.k.f()).intValue() / 100.0f;
        int c = ti20.c((int) (i * intValue));
        LPaint lPaint = ra5Var.i;
        lPaint.setAlpha(c);
        lPaint.setStrokeWidth(ra5Var.j.m());
        if (lPaint.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = ra5Var.l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = ra5Var.h;
                if (i4 >= size) {
                    break;
                }
                float floatValue = ((Float) ((i35) arrayList.get(i4)).f()).floatValue();
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
            kor korVar = ra5Var.m;
            lPaint.setPathEffect(new DashPathEffect(fArr, korVar == null ? 0.0f : ((Float) korVar.f()).floatValue()));
            AsyncUpdates asyncUpdates2 = upx.a;
        }
        e131 e131Var = ra5Var.n;
        if (e131Var != null) {
            lPaint.setColorFilter((ColorFilter) e131Var.f());
        }
        i35 i35Var = ra5Var.o;
        if (i35Var != null) {
            float floatValue2 = ((Float) i35Var.f()).floatValue();
            if (floatValue2 == 0.0f) {
                lPaint.setMaskFilter(null);
            } else if (floatValue2 != ra5Var.p) {
                l35 l35Var = ra5Var.f;
                if (l35Var.A == floatValue2) {
                    blurMaskFilter = l35Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    l35Var.B = blurMaskFilter2;
                    l35Var.A = floatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                lPaint.setMaskFilter(blurMaskFilter);
            }
            ra5Var.p = floatValue2;
        }
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), lPaint);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = ra5Var.g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                AsyncUpdates asyncUpdates3 = upx.a;
                return;
            }
            qa5 qa5Var = (qa5) arrayList2.get(i5);
            ff11 ff11Var = qa5Var.b;
            ArrayList arrayList3 = qa5Var.a;
            Path path = ra5Var.b;
            if (ff11Var != null) {
                AsyncUpdates asyncUpdates4 = upx.a;
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((vq90) arrayList3.get(size2)).getPath());
                }
                float floatValue3 = ((Float) ff11Var.d.f()).floatValue() / f;
                float floatValue4 = ((Float) ff11Var.e.f()).floatValue() / f;
                float floatValue5 = ((Float) ff11Var.f.f()).floatValue() / 360.0f;
                if (floatValue3 >= 0.01f || floatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = ra5Var.a;
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
                        Path path2 = ((vq90) arrayList3.get(size3)).getPath();
                        Path path3 = ra5Var.c;
                        path3.set(path2);
                        pathMeasure.setPath(path3, z);
                        float length2 = pathMeasure.getLength();
                        if (min > length) {
                            float f5 = min - length;
                            if (f5 < f4 + length2 && f4 < f5) {
                                zw21.a(path3, f3 > length ? (f3 - length) / length2 : 0.0f, Math.min(f5 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path3, lPaint);
                                f4 += length2;
                                size3--;
                                ra5Var = this;
                                i3 = i6;
                                z = false;
                            }
                        }
                        float f6 = f4 + length2;
                        if (f6 >= f3 && f4 <= min) {
                            if (f6 > min || f3 >= f4) {
                                zw21.a(path3, f3 < f4 ? 0.0f : (f3 - f4) / length2, min > f6 ? 1.0f : (min - f4) / length2, 0.0f);
                                canvas.drawPath(path3, lPaint);
                            } else {
                                canvas.drawPath(path3, lPaint);
                            }
                        }
                        f4 += length2;
                        size3--;
                        ra5Var = this;
                        i3 = i6;
                        z = false;
                    }
                    i2 = i3;
                    AsyncUpdates asyncUpdates5 = upx.a;
                } else {
                    canvas.drawPath(path, lPaint);
                    AsyncUpdates asyncUpdates6 = upx.a;
                    i2 = i3;
                }
            } else {
                i2 = i3;
                AsyncUpdates asyncUpdates7 = upx.a;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((vq90) arrayList3.get(size4)).getPath());
                }
                AsyncUpdates asyncUpdates8 = upx.a;
                canvas.drawPath(path, lPaint);
            }
            i5++;
            ra5Var = this;
            i3 = i2;
            z = false;
            f = 100.0f;
        }
    }

    public void g(puz puzVar, Object obj) {
        PointF pointF = cuz.a;
        if (obj == 4) {
            this.k.k(puzVar);
            return;
        }
        if (obj == cuz.q) {
            this.j.k(puzVar);
            return;
        }
        ColorFilter colorFilter = cuz.I;
        l35 l35Var = this.f;
        if (obj == colorFilter) {
            e131 e131Var = this.n;
            if (e131Var != null) {
                l35Var.m(e131Var);
            }
            if (puzVar == null) {
                this.n = null;
                return;
            }
            e131 e131Var2 = new e131(puzVar, null);
            this.n = e131Var2;
            e131Var2.a(this);
            l35Var.c(this.n);
            return;
        }
        if (obj == cuz.e) {
            i35 i35Var = this.o;
            if (i35Var != null) {
                i35Var.k(puzVar);
                return;
            }
            e131 e131Var3 = new e131(puzVar, null);
            this.o = e131Var3;
            e131Var3.a(this);
            l35Var.c(this.o);
        }
    }
}
