package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class oec implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt3 b;

    public /* synthetic */ oec(zt3 zt3Var, int i) {
        this.a = i;
        this.b = zt3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zt3 zt3Var = this.b;
        switch (i) {
            case 0:
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith((String) obj);
                return Unit.a;
            case 1:
                egd egdVar = (egd) obj;
                if (zt3Var.w()) {
                    r7o r7oVar2 = z7o.b;
                    zt3Var.resumeWith(egdVar);
                }
                return Unit.a;
            case 2:
                r7o r7oVar3 = z7o.b;
                zt3Var.resumeWith((String) obj);
                return Unit.a;
            case 3:
                r7o r7oVar4 = z7o.b;
                Unit unit = Unit.a;
                zt3Var.resumeWith(unit);
                return unit;
            default:
                alk alkVar = (alk) obj;
                alkVar.getClass();
                if (zt3Var.w()) {
                    r7o r7oVar5 = z7o.b;
                    zt3Var.resumeWith(alkVar);
                }
                return Unit.a;
        }
    }
}
