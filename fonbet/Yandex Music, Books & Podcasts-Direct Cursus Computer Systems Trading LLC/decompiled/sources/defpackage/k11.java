package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m11 b;

    public /* synthetic */ k11(m11 m11Var, int i) {
        this.a = i;
        this.b = m11Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m11 m11Var = this.b;
                break;
            case 1:
                this.b.p.g();
                break;
            default:
                m11 m11Var2 = this.b;
                m11Var2.p.f();
                x97.y(ot0.F(m11Var2), null, null, new hl(m11Var2, null, 5), 3);
                break;
        }
        return Unit.a;
    }
}
