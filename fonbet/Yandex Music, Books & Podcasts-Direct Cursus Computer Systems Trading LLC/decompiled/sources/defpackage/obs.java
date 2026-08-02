package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class obs extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ qbs s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obs(qbs qbsVar, int i) {
        super(0);
        this.r = i;
        this.s = qbsVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                ?? r0 = this.s.g;
                if (r0 != 0) {
                    r0.invoke();
                }
                break;
            case 1:
                qbs qbsVar = this.s;
                mm6 mm6Var = qbsVar.i;
                if (mm6Var != null) {
                    x97.y(mm6Var, null, pm6.d, new pbs(qbsVar, null, 0), 1);
                }
                qbsVar.l();
                break;
            case 2:
                qbs qbsVar2 = this.s;
                mm6 mm6Var2 = qbsVar2.i;
                if (mm6Var2 != null) {
                    x97.y(mm6Var2, null, pm6.d, new pbs(qbsVar2, null, 1), 1);
                }
                qbsVar2.l();
                break;
            case 3:
                qbs qbsVar3 = this.s;
                mm6 mm6Var3 = qbsVar3.i;
                if (mm6Var3 != null) {
                    x97.y(mm6Var3, null, pm6.d, new pbs(qbsVar3, null, 2), 1);
                }
                qbsVar3.l();
                break;
            default:
                this.s.n();
                break;
        }
        return Unit.a;
    }
}
