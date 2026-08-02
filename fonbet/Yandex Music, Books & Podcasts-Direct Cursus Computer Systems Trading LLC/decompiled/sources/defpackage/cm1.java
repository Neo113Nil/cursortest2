package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class cm1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ em1 b;

    public /* synthetic */ cm1(em1 em1Var, int i) {
        this.a = i;
        this.b = em1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                em1 em1Var = this.b;
                break;
            case 1:
                this.b.r.g();
                break;
            default:
                em1 em1Var2 = this.b;
                em1Var2.r.f();
                x97.y(ot0.F(em1Var2), null, null, new hl(em1Var2, null, 11), 3);
                break;
        }
        return Unit.a;
    }
}
