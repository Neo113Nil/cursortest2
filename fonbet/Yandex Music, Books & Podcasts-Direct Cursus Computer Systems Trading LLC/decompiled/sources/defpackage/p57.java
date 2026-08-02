package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class p57 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ y57 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p57(y57 y57Var, int i) {
        super(0);
        this.r = i;
        this.s = y57Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                y57 y57Var = this.s;
                x97.y(ot0.F(y57Var), null, null, new i57(y57Var, null, 5), 3);
                return Unit.a;
            case 1:
                return this.s.v0;
            default:
                y57 y57Var2 = this.s;
                x97.y(ot0.F(y57Var2), null, null, new i57(y57Var2, null, 7), 3);
                return Unit.a;
        }
    }
}
