package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ho1 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ yci d;

    public /* synthetic */ ho1(List list, Function1 function1, yci yciVar) {
        this.b = list;
        this.c = function1;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                ild.d(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
            default:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                ild.d(this.b, this.c, this.d, hq5Var, 0);
        }
        return Unit.a;
    }

    public /* synthetic */ ho1(List list, Function1 function1, yci yciVar, int i) {
        this.b = list;
        this.c = function1;
        this.d = yciVar;
    }
}
