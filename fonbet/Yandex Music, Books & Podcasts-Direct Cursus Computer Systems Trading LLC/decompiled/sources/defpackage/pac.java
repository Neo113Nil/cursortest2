package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class pac extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ qac s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pac(qac qacVar, int i) {
        super(1);
        this.r = i;
        this.s = qacVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((Unit) obj).getClass();
                qac qacVar = this.s;
                String str = qacVar.b.b;
                return mif.a(qacVar.a.t(str), new sea(9, qacVar, str), null, 5);
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                jtp d = nif.d(Unit.a);
                if (!booleanValue) {
                    return d;
                }
                qac qacVar2 = this.s;
                oxa oxaVar = qacVar2.a;
                lm7 lm7Var = qacVar2.b;
                String str2 = lm7Var.c;
                String str3 = lm7Var.b;
                vx6 vx6Var = (vx6) oxaVar.b;
                return quj.C((hg3) vx6Var.c, (hg3) vx6Var.d, new jm7(vx6Var, str2, str3, new i9w(), 0));
            default:
                String str4 = (String) obj;
                str4.getClass();
                return ivf.M(((ozw) this.s.c.a).j(str4));
        }
    }
}
