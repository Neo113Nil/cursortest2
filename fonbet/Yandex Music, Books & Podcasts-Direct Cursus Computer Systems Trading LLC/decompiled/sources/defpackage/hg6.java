package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class hg6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg6 b;

    public /* synthetic */ hg6(zg6 zg6Var, int i) {
        this.a = i;
        this.b = zg6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                this.b.b(bi6.a, booleanValue, str);
                break;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                this.b.b(bi6.b, booleanValue2, str2);
                break;
            case 2:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                i4w.h(this.b, null, hq5Var, 0);
            case 3:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                yci m = d.m(vci.a, 48);
                oq5 oq5Var3 = (oq5) hq5Var2;
                zg6 zg6Var = this.b;
                boolean h = oq5Var3.h(zg6Var);
                Object K = oq5Var3.K();
                if (h || K == gq5.a) {
                    e65 e65Var = new e65(0, zg6Var, zg6.class, "onOverflowButtonClick", "onOverflowButtonClick()V", 0, 27);
                    oq5Var3.k0(e65Var);
                    K = e65Var;
                }
                aae.a((Function0) ((h9f) K), m, false, j66.c, oq5Var3, 24624, 12);
                break;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                str3.getClass();
                this.b.b(bi6.c, booleanValue3, str3);
                break;
        }
        return Unit.a;
    }
}
