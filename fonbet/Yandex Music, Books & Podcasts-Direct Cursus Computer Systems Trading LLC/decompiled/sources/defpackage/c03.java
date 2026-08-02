package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c03 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j03 s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c03(j03 j03Var, String str, int i) {
        super(0);
        this.r = i;
        this.s = j03Var;
        this.t = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.e.a(new j13(this.t, 1));
            default:
                t28 t28Var = this.s.d;
                return yd5.I("check_payment", t28Var.b, new s28(t28Var, new vi4(this.t), 1));
        }
    }
}
