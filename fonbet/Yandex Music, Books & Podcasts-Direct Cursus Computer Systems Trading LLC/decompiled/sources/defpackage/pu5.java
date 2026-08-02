package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class pu5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu5 b;

    public /* synthetic */ pu5(qu5 qu5Var, int i) {
        this.a = i;
        this.b = qu5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new d85(this.b.a.a());
            case 1:
                return new d85(this.b.d.a(false, false));
            default:
                return new d85(((d85) this.b.g.b.getValue()).a);
        }
    }
}
