package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class le6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn5 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ le6(wn5 wn5Var, Object obj, int i) {
        this.a = i;
        this.b = wn5Var;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                this.b.invoke(this.c, hq5Var, 0);
            case 1:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    this.b.invoke(this.c, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                oq5 oq5Var3 = (oq5) hq5Var;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    this.b.invoke(this.c, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            case 3:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                this.b.invoke(this.c, hq5Var, 0);
            case 4:
                oq5 oq5Var5 = (oq5) hq5Var;
                if (oq5Var5.P(intValue & 1, (intValue & 3) != 2)) {
                    this.b.invoke(this.c, oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                break;
            case 5:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                this.b.invoke(this.c, hq5Var, 0);
            case 6:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                this.b.invoke(this.c, hq5Var, 0);
            default:
                oq5 oq5Var8 = (oq5) hq5Var;
                if (oq5Var8.P(intValue & 1, (intValue & 3) != 2)) {
                    this.b.invoke(this.c, oq5Var8, 0);
                } else {
                    oq5Var8.S();
                }
                break;
        }
        return Unit.a;
    }
}
