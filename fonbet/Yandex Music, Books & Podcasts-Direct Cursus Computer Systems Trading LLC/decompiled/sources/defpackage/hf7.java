package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class hf7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ if7 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hf7(if7 if7Var, int i) {
        super(0);
        this.r = i;
        this.s = if7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                sf7 sf7Var = this.s.c;
                sf7Var.c(pdr.a(sf7Var.m, true, false, null, null, null, 30));
                break;
            case 1:
                sf7 sf7Var2 = this.s.c;
                sf7Var2.c(pdr.a(sf7Var2.m, false, false, null, null, null, 30));
                break;
            default:
                sf7 sf7Var3 = this.s.c;
                Throwable a = z7o.a(sf7Var3.b(sf7Var3.a(true)));
                if (a != null && ltg.x(a)) {
                    sf7Var3.b(sf7Var3.a(false));
                }
                break;
        }
        return Unit.a;
    }
}
