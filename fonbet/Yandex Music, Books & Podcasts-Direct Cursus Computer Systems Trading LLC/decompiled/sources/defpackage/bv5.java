package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class bv5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ bv5(fp7 fp7Var, int i, int i2) {
        this.a = i2;
        this.b = fp7Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = this.c;
                fp7 fp7Var = this.b;
                return Boolean.valueOf(fp7Var.q() == i && !fp7Var.k.b());
            default:
                int i2 = this.c;
                fp7 fp7Var2 = this.b;
                return Boolean.valueOf(fp7Var2.q() == i2 && !fp7Var2.k.b());
        }
    }
}
