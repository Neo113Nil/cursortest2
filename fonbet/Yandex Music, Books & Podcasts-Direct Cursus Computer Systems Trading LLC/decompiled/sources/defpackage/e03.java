package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class e03 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ui4 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e03(ui4 ui4Var, int i) {
        super(1);
        this.r = i;
        this.s = ui4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                wi4 wi4Var = (wi4) obj;
                wi4Var.getClass();
                return this.s.g(wi4Var);
            default:
                wi4 wi4Var2 = (wi4) obj;
                wi4Var2.getClass();
                return this.s.d(wi4Var2);
        }
    }
}
