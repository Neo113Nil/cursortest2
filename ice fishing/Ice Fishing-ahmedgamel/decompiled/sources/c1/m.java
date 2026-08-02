package c1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.LP;
import java.util.ArrayList;
import m1.C4739a;

/* loaded from: classes.dex */
public final class m extends k {
    public final PointF i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f5668j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f5669k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f5670l;

    /* renamed from: m, reason: collision with root package name */
    public l f5671m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.f5668j = new float[2];
        this.f5669k = new float[2];
        this.f5670l = new PathMeasure();
    }

    @Override // c1.AbstractC0545e
    public final Object f(C4739a c4739a, float f2) {
        float f9;
        l lVar = (l) c4739a;
        Path path = lVar.f5666q;
        LP lp = this.f5652e;
        if (lp == null || c4739a.f39347h == null) {
            f9 = f2;
        } else {
            f9 = f2;
            PointF pointF = (PointF) lp.d(lVar.f39346g, lVar.f39347h.floatValue(), (PointF) lVar.f39341b, (PointF) lVar.f39342c, d(), f9, this.f5651d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) c4739a.f39341b;
        }
        l lVar2 = this.f5671m;
        PathMeasure pathMeasure = this.f5670l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f5671m = lVar;
        }
        float length = pathMeasure.getLength();
        float f10 = f9 * length;
        float[] fArr = this.f5668j;
        float[] fArr2 = this.f5669k;
        pathMeasure.getPosTan(f10, fArr, fArr2);
        PointF pointF2 = this.i;
        pointF2.set(fArr[0], fArr[1]);
        if (f10 < 0.0f) {
            pointF2.offset(fArr2[0] * f10, fArr2[1] * f10);
            return pointF2;
        }
        if (f10 > length) {
            float f11 = f10 - length;
            pointF2.offset(fArr2[0] * f11, fArr2[1] * f11);
        }
        return pointF2;
    }
}
