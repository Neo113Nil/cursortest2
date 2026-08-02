package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class yy implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fz b;

    public /* synthetic */ yy(fz fzVar, int i) {
        this.a = i;
        this.b = fzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                bool.getClass();
                e10 e10Var = this.b.b;
                if (e10Var.w.g()) {
                    x97.y(ot0.F(e10Var), null, null, new v00(e10Var, null, 6), 3);
                    x97.y(ot0.F(e10Var), null, null, new v00(e10Var, null, 7), 3);
                } else {
                    e10Var.M();
                }
                break;
            default:
                this.b.b.L(true, bool.booleanValue());
                break;
        }
        return Unit.a;
    }
}
