package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class eb5 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gb5 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb5(gb5 gb5Var, int i) {
        super(1);
        this.r = i;
        this.s = gb5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                long j = ((enj) obj).a;
                Function0 function0 = this.s.J;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                long j2 = ((enj) obj).a;
                gb5 gb5Var = this.s;
                Function0 function02 = gb5Var.I;
                if (function02 != null) {
                    function02.invoke();
                }
                if (gb5Var.K) {
                    ((msd) men.t(gb5Var, es5.l)).a(0);
                }
                break;
            default:
                long j3 = ((enj) obj).a;
                gb5 gb5Var2 = this.s;
                if (gb5Var2.u) {
                    gb5Var2.v.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
