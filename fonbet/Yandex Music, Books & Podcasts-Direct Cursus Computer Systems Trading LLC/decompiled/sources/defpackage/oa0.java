package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class oa0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jx7 b;

    public /* synthetic */ oa0(jx7 jx7Var, int i) {
        this.a = i;
        this.b = jx7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float n0;
        switch (this.a) {
            case 0:
                n0 = this.b.n0(20);
                break;
            case 1:
                n0 = this.b.n0(125);
                break;
            default:
                n0 = this.b.n0(20);
                break;
        }
        return Float.valueOf(n0);
    }
}
