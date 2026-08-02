package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class tp7 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ s1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tp7(s1 s1Var, int i) {
        super(1);
        this.r = i;
        this.s = s1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((q6s) obj).getClass();
                s1 s1Var = this.s;
                s1Var.a();
                s1Var.e();
                break;
            default:
                ((s6s) obj).getClass();
                s1 s1Var2 = new tp7(this.s, 0).s;
                new r6s(s1Var2.e(), s1Var2.a());
                break;
        }
        return Unit.a;
    }
}
