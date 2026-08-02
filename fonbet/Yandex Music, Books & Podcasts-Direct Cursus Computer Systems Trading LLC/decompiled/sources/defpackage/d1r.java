package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d1r extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ g1r s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1r(g1r g1rVar, int i) {
        super(0);
        this.r = i;
        this.s = g1rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        g1r g1rVar = this.s;
        switch (i) {
            case 0:
                zt3 zt3Var = g1rVar.d;
                if (zt3Var.w()) {
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(n1r.a);
                }
                return Boolean.TRUE;
            default:
                zt3 zt3Var2 = g1rVar.d;
                if (zt3Var2.w()) {
                    r7o r7oVar2 = z7o.b;
                    zt3Var2.resumeWith(n1r.b);
                }
                return Unit.a;
        }
    }
}
