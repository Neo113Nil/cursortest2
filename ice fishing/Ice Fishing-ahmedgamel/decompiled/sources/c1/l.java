package c1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import m1.C4739a;

/* loaded from: classes.dex */
public final class l extends C4739a {

    /* renamed from: q, reason: collision with root package name */
    public Path f5666q;

    /* renamed from: r, reason: collision with root package name */
    public final C4739a f5667r;

    public l(Z0.i iVar, C4739a c4739a) {
        super(iVar, (PointF) c4739a.f39341b, (PointF) c4739a.f39342c, c4739a.f39343d, c4739a.f39344e, c4739a.f39345f, c4739a.f39346g, c4739a.f39347h);
        this.f5667r = c4739a;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f39342c;
        Object obj3 = this.f39341b;
        boolean z6 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f39342c) == null || z6) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C4739a c4739a = this.f5667r;
        PointF pointF3 = c4739a.f39353o;
        PointF pointF4 = c4739a.f39354p;
        Matrix matrix = l1.i.f38862a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f2 = pointF3.x + pointF.x;
            float f9 = pointF.y + pointF3.y;
            float f10 = pointF2.x;
            float f11 = f10 + pointF4.x;
            float f12 = pointF2.y;
            path.cubicTo(f2, f9, f11, f12 + pointF4.y, f10, f12);
        }
        this.f5666q = path;
    }
}
