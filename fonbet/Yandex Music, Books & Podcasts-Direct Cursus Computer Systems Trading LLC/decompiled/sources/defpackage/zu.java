package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ j00 b;
    public final /* synthetic */ jab c;

    public /* synthetic */ zu(j00 j00Var, jab jabVar, int i) {
        this.a = i;
        this.b = j00Var;
        this.c = jabVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    j00 j00Var = this.b;
                    boolean h = oq5Var.h(j00Var);
                    jab jabVar = this.c;
                    boolean h2 = h | oq5Var.h(jabVar);
                    Object K = oq5Var.K();
                    if (h2 || K == gq5.a) {
                        K = new cv(j00Var, jabVar, 2);
                        oq5Var.k0(K);
                    }
                    cxb.g((Function0) K, d.d(vci.a, 1.0f), oq5Var, 48);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                thj thjVar = (thj) obj;
                String str = (String) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                thjVar.getClass();
                str.getClass();
                this.b.b(this.c, thjVar, str, booleanValue);
                break;
            case 2:
                thj thjVar2 = (thj) obj;
                String str2 = (String) obj2;
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                thjVar2.getClass();
                str2.getClass();
                this.b.b(this.c, thjVar2, str2, booleanValue2);
                break;
            default:
                thj thjVar3 = (thj) obj;
                String str3 = (String) obj2;
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                thjVar3.getClass();
                str3.getClass();
                this.b.b(this.c, thjVar3, str3, booleanValue3);
                break;
        }
        return Unit.a;
    }
}
