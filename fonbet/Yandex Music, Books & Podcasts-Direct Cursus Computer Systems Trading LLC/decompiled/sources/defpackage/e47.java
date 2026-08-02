package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class e47 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ g47 s;
    public final /* synthetic */ zl2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e47(g47 g47Var, zl2 zl2Var, int i) {
        super(1);
        this.r = i;
        this.s = g47Var;
        this.t = zl2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                en enVar = (en) obj;
                enVar.getClass();
                this.s.J(enVar, this.t);
                break;
            case 1:
                w7o w7oVar = (w7o) obj;
                w7oVar.getClass();
                g47.a(this.s, w7oVar, this.t);
                break;
            default:
                w7o w7oVar2 = (w7o) obj;
                w7oVar2.getClass();
                g47.a(this.s, w7oVar2, this.t);
                break;
        }
        return Unit.a;
    }
}
