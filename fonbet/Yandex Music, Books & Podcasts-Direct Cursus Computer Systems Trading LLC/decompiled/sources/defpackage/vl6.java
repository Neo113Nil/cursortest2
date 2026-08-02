package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class vl6 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xl6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl6(xl6 xl6Var, int i) {
        super(0);
        this.r = i;
        this.s = xl6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                bcx.C(this.s);
                return Unit.a;
            case 1:
                this.s.v.d();
                return Boolean.TRUE;
            case 2:
                this.s.v.m();
                return Boolean.TRUE;
            case 3:
                xl6 xl6Var = this.s;
                xl6Var.s.w.invoke(new hde(xl6Var.w.e));
                return Boolean.TRUE;
            case 4:
                xl6 xl6Var2 = this.s;
                axf axfVar = xl6Var2.s;
                yoc yocVar = xl6Var2.x;
                if (axfVar.b()) {
                    c3r c3rVar = axfVar.c;
                    if (c3rVar != null) {
                        ((nw7) c3rVar).b();
                    }
                } else {
                    yoc.b(yocVar);
                }
                return Boolean.TRUE;
            case 5:
                this.s.v.f(true);
                return Boolean.TRUE;
            case 6:
                this.s.v.b(true);
                return Boolean.TRUE;
            default:
                bcx.C(this.s);
                return Unit.a;
        }
    }
}
