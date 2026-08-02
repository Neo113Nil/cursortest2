package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class i17 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ww3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i17(ww3 ww3Var, int i) {
        super(1);
        this.r = i;
        this.s = ww3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                lne lneVar = (lne) obj;
                lneVar.getClass();
                this.s.invoke(lneVar);
                break;
            case 1:
                lne lneVar2 = (lne) obj;
                lneVar2.getClass();
                this.s.invoke(lneVar2);
                break;
            default:
                lne lneVar3 = (lne) obj;
                lneVar3.getClass();
                this.s.invoke(lneVar3);
                break;
        }
        return Unit.a;
    }
}
