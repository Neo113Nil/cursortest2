package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class cdo implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ cdo(Function0 function0, Function0 function02, Function0 function03, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
        this.d = function03;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                t7g.h(null, this.b, this.c, this.d, hq5Var, 0, 1);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                etn.l(sb6.a.a(new d85(((d85) bmq.b(((ma5) ((oq5) hq5Var2).j(pa5.a)).c(), null, null, hq5Var2, 0, 14).getValue()).a)), ild.C(250749355, new cdo(this.b, this.c, this.d, 0), hq5Var2), hq5Var2, 56);
        }
        return Unit.a;
    }
}
