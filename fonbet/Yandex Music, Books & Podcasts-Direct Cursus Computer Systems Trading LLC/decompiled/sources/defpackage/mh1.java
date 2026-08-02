package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class mh1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj1 b;

    public /* synthetic */ mh1(hj1 hj1Var, int i) {
        this.a = i;
        this.b = hj1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (a14) this.b.e.getValue();
            default:
                hj1 hj1Var = this.b;
                return new zca(hj1Var.a, (a14) hj1Var.e.getValue());
        }
    }
}
