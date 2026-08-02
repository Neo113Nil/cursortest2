package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ko9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ qo9 s;
    public final /* synthetic */ jo9 t;
    public final /* synthetic */ xzb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko9(m39 m39Var, qo9 qo9Var, jo9 jo9Var, xzb xzbVar, int i) {
        super(1);
        this.r = i;
        this.s = qo9Var;
        this.t = jo9Var;
        this.u = xzbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.setEnabled(((Boolean) this.t.o.a(this.u)).booleanValue());
                break;
            default:
                szb szbVar = this.t.s;
                this.s.setColorOn(szbVar != null ? (Integer) szbVar.a(this.u) : null);
                break;
        }
        return Unit.a;
    }
}
