package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class h03 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j03 s;
    public final /* synthetic */ wa4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h03(j03 j03Var, wa4 wa4Var, int i) {
        super(1);
        this.r = i;
        this.s = j03Var;
        this.t = wa4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ft7 ft7Var = (ft7) obj;
                ft7Var.getClass();
                ((x60) this.s.g).a(gut.u());
                this.t.m(ft7Var);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((x60) this.s.g).a(gut.J0(str));
                this.t.c();
                break;
        }
        return Unit.a;
    }
}
