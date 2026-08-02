package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class rt9 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ st9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rt9(st9 st9Var, int i) {
        super(0);
        this.r = i;
        this.s = st9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                st9 st9Var = this.s;
                return new lq4(st9Var.a.getContext(), st9Var.b);
            case 1:
                st9 st9Var2 = this.s;
                return new kgi(st9Var2.a, st9Var2.b, 0);
            default:
                st9 st9Var3 = this.s;
                return new kgi(st9Var3.a, st9Var3.b, 1);
        }
    }
}
