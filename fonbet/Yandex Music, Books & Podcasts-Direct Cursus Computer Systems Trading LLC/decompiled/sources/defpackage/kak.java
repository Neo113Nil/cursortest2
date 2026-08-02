package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kak extends bcf {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public jak m;

    public kak(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // defpackage.cs2
    public final Object f(acf acfVar, float f) {
        float f2;
        jak jakVar = (jak) acfVar;
        Path path = jakVar.q;
        szg szgVar = this.e;
        if (szgVar == null || acfVar.h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) szgVar.b(jakVar.g, jakVar.h.floatValue(), (PointF) jakVar.b, (PointF) jakVar.c, d(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) acfVar.b;
        }
        jak jakVar2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (jakVar2 != jakVar) {
            pathMeasure.setPath(path, false);
            this.m = jakVar;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f4, f5);
        if (f3 < 0.0f) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}
