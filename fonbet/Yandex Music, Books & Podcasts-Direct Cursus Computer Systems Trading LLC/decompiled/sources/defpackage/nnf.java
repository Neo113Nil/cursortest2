package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class nnf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml4 b;

    public /* synthetic */ nnf(ml4 ml4Var, int i) {
        this.a = i;
        this.b = ml4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int a;
        switch (this.a) {
            case 0:
                a = this.b.a();
                break;
            default:
                a = this.b.a() + 1;
                break;
        }
        return Integer.valueOf(a);
    }
}
