package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xq90 extends skx {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public wq90 m;

    public xq90(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // defpackage.i35
    public final Object g(rkx rkxVar, float f) {
        float f2;
        wq90 wq90Var = (wq90) rkxVar;
        Path path = wq90Var.q;
        puz puzVar = this.e;
        if (puzVar == null || rkxVar.h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) puzVar.b(wq90Var.g, wq90Var.h.floatValue(), (PointF) wq90Var.b, (PointF) wq90Var.c, e(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) rkxVar.b;
        }
        wq90 wq90Var2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (wq90Var2 != wq90Var) {
            pathMeasure.setPath(path, false);
            this.m = wq90Var;
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
