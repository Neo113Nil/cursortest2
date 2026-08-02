package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ik2 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jk2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik2(jk2 jk2Var, int i) {
        super(0);
        this.r = i;
        this.s = jk2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.s.U0();
                break;
            default:
                jk2 jk2Var = this.s;
                wci wciVar = jk2Var.o;
                wciVar.getClass();
                ((zci) wciVar).d(jk2Var);
                break;
        }
        return Unit.a;
    }
}
