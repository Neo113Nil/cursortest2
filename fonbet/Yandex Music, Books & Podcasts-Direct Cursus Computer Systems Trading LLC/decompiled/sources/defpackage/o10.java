package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class o10 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f20 b;
    public final /* synthetic */ lzs c;

    public /* synthetic */ o10(f20 f20Var, lzs lzsVar) {
        this.b = f20Var;
        this.c = lzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                ksw.c(this.b, this.c, hq5Var, 0);
            default:
                num.getClass();
                ksw.c(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o10(f20 f20Var, lzs lzsVar, int i) {
        this.b = f20Var;
        this.c = lzsVar;
    }
}
