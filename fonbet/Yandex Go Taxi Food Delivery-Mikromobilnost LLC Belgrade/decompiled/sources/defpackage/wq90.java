package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class wq90 extends rkx {
    public Path q;
    public final rkx r;

    public wq90(nsz nszVar, rkx rkxVar) {
        super(nszVar, (PointF) rkxVar.b, (PointF) rkxVar.c, rkxVar.d, rkxVar.e, rkxVar.f, rkxVar.g, rkxVar.h);
        this.r = rkxVar;
        d();
    }

    public final void d() {
        boolean z;
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        if (obj2 != null && obj3 != null) {
            PointF pointF = (PointF) obj2;
            if (((PointF) obj3).equals(pointF.x, pointF.y)) {
                z = true;
                if (obj3 != null || (obj = this.c) == null || z) {
                    return;
                }
                PointF pointF2 = (PointF) obj3;
                PointF pointF3 = (PointF) obj;
                rkx rkxVar = this.r;
                PointF pointF4 = rkxVar.o;
                PointF pointF5 = rkxVar.p;
                Matrix matrix = zw21.a;
                Path path = new Path();
                path.moveTo(pointF2.x, pointF2.y);
                if (pointF4 == null || pointF5 == null || (pointF4.length() == 0.0f && pointF5.length() == 0.0f)) {
                    path.lineTo(pointF3.x, pointF3.y);
                } else {
                    float f = pointF4.x + pointF2.x;
                    float f2 = pointF2.y + pointF4.y;
                    float f3 = pointF3.x;
                    float f4 = f3 + pointF5.x;
                    float f5 = pointF3.y;
                    path.cubicTo(f, f2, f4, f5 + pointF5.y, f3, f5);
                }
                this.q = path;
                return;
            }
        }
        z = false;
        if (obj3 != null) {
        }
    }
}
