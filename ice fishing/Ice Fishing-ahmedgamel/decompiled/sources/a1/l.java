package a1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import k1.C4629a;

/* loaded from: classes.dex */
public final class l extends C4629a {

    /* renamed from: q, reason: collision with root package name */
    public Path f4271q;

    /* renamed from: r, reason: collision with root package name */
    public final C4629a f4272r;

    public l(X0.i iVar, C4629a c4629a) {
        super(iVar, (PointF) c4629a.f38552b, (PointF) c4629a.f38553c, c4629a.f38554d, c4629a.f38555e, c4629a.f38556f, c4629a.f38557g, c4629a.f38558h);
        this.f4272r = c4629a;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f38553c;
        Object obj3 = this.f38552b;
        boolean z3 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f38553c) == null || z3) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C4629a c4629a = this.f4272r;
        PointF pointF3 = c4629a.f38564o;
        PointF pointF4 = c4629a.f38565p;
        Matrix matrix = j1.j.f38350a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f3 = pointF3.x + pointF.x;
            float f9 = pointF.y + pointF3.y;
            float f10 = pointF2.x;
            float f11 = f10 + pointF4.x;
            float f12 = pointF2.y;
            path.cubicTo(f3, f9, f11, f12 + pointF4.y, f10, f12);
        }
        this.f4271q = path;
    }
}
