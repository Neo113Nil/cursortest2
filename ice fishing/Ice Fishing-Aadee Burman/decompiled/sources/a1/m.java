package a1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.C2991bm;
import java.util.ArrayList;
import k1.C4629a;

/* loaded from: classes.dex */
public final class m extends k {
    public final PointF i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f4273j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f4274k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f4275l;

    /* renamed from: m, reason: collision with root package name */
    public l f4276m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.f4273j = new float[2];
        this.f4274k = new float[2];
        this.f4275l = new PathMeasure();
    }

    @Override // a1.AbstractC0428e
    public final Object f(C4629a c4629a, float f3) {
        float f9;
        l lVar = (l) c4629a;
        Path path = lVar.f4271q;
        C2991bm c2991bm = this.f4257e;
        if (c2991bm == null || c4629a.f38558h == null) {
            f9 = f3;
        } else {
            f9 = f3;
            PointF pointF = (PointF) c2991bm.R(lVar.f38557g, lVar.f38558h.floatValue(), (PointF) lVar.f38552b, (PointF) lVar.f38553c, d(), f9, this.f4256d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) c4629a.f38552b;
        }
        l lVar2 = this.f4276m;
        PathMeasure pathMeasure = this.f4275l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f4276m = lVar;
        }
        float length = pathMeasure.getLength();
        float f10 = f9 * length;
        float[] fArr = this.f4273j;
        float[] fArr2 = this.f4274k;
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
