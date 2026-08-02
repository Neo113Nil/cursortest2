package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.ui.layout.o;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final /* synthetic */ class un4 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ un4(float f, float f2, wg6 wg6Var, Ref$ObjectRef ref$ObjectRef) {
        this.b = f;
        this.c = f2;
        this.w = wg6Var;
        this.x = ref$ObjectRef;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        float f = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                o oVar = (o) obj3;
                o oVar2 = (o) obj2;
                o.a aVar = (o.a) obj;
                o.a.o(aVar, oVar, 0, 0);
                o.a.o(aVar, oVar2, aVar.f0(f2) + (oVar.a - oVar2.a), -aVar.f0(f));
                break;
            default:
                wg6 wg6Var = (wg6) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                float c = y6i0.c(Math.abs((f2 - ((Number) ((a) obj).e()).floatValue()) / f), 0.0f, 1.0f);
                float f3 = wg6Var.f(((dtr0) wg6Var.g.getValue()).a);
                float d = cjb1.d(f2, f3, c);
                tx40 tx40Var = wg6Var.h;
                if (Math.abs(f3 - d) > 1.0f) {
                    f3 = d;
                } else {
                    l8x l8xVar = (l8x) ref$ObjectRef.element;
                    if (l8xVar != null) {
                        l8xVar.a(null);
                    }
                }
                tx40Var.setFloatValue(f3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ un4(o oVar, o oVar2, float f, float f2) {
        this.w = oVar;
        this.x = oVar2;
        this.b = f;
        this.c = f2;
    }
}
