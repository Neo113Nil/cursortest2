package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class qud0 extends skx {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qud0(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.j = new dlm0();
                break;
            default:
                this.j = new PointF();
                break;
        }
    }

    @Override // defpackage.i35
    public final Object g(rkx rkxVar, float f) {
        Object obj;
        float f2;
        switch (this.i) {
            case 0:
                return m(rkxVar, f, f, f);
            default:
                dlm0 dlm0Var = (dlm0) this.j;
                Object obj2 = rkxVar.b;
                if (obj2 == null || (obj = rkxVar.c) == null) {
                    ny61.r("Missing values for keyframe.");
                    return null;
                }
                dlm0 dlm0Var2 = (dlm0) obj2;
                dlm0 dlm0Var3 = (dlm0) obj;
                puz puzVar = this.e;
                if (puzVar != null) {
                    f2 = f;
                    dlm0 dlm0Var4 = (dlm0) puzVar.b(rkxVar.g, rkxVar.h.floatValue(), dlm0Var2, dlm0Var3, f2, e(), this.d);
                    if (dlm0Var4 != null) {
                        return dlm0Var4;
                    }
                } else {
                    f2 = f;
                }
                float f3 = ti20.f(dlm0Var2.a, dlm0Var3.a, f2);
                float f4 = ti20.f(dlm0Var2.b, dlm0Var3.b, f2);
                dlm0Var.a = f3;
                dlm0Var.b = f4;
                return dlm0Var;
        }
    }

    @Override // defpackage.i35
    public /* bridge */ /* synthetic */ Object h(rkx rkxVar, float f, float f2, float f3) {
        switch (this.i) {
            case 0:
                return m(rkxVar, f, f2, f3);
            default:
                return super.h(rkxVar, f, f2, f3);
        }
    }

    public PointF m(rkx rkxVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = rkxVar.b;
        if (obj2 == null || (obj = rkxVar.c) == null) {
            ny61.r("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        puz puzVar = this.e;
        if (puzVar != null && (pointF = (PointF) puzVar.b(rkxVar.g, rkxVar.h.floatValue(), pointF3, pointF4, f, e(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF3.x;
        float b = g8e.b(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF2.set(b, g8e.b(pointF4.y, f5, f3, f5));
        return pointF2;
    }
}
