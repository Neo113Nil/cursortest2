package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class jgk extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ozw s;
    public final /* synthetic */ ft7 t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgk(ozw ozwVar, ft7 ft7Var, String str, int i) {
        super(0);
        this.r = i;
        this.s = ozwVar;
        this.t = ft7Var;
        this.u = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                ft7 ft7Var = this.t;
                ft7Var.getClass();
                this.s.A(ft7Var.a, this.u);
                break;
            default:
                ft7 ft7Var2 = this.t;
                ft7Var2.getClass();
                this.s.A(ft7Var2.a, this.u);
                break;
        }
        return Unit.a;
    }
}
