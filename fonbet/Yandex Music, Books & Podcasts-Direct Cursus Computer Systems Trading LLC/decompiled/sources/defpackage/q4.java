package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ q4(v2 v2Var, int i) {
        this.a = i;
        this.b = v2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                return new i3(v2Var.b, btf.b(new q4(v2Var, 1)), new u2(3, v2Var));
            default:
                return new y2((e0j) this.b.b.b.getValue(), 1);
        }
    }
}
