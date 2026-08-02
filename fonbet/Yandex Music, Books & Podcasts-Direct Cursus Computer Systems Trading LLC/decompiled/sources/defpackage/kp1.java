package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class kp1 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ kp1(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                saf.b(this.b, this.c, hq5Var, rvf.R(1));
                break;
            default:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                leu.j(0, hq5Var, null, this.b);
                leu.j(0, hq5Var, null, this.c);
        }
        return Unit.a;
    }

    public /* synthetic */ kp1(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
    }
}
