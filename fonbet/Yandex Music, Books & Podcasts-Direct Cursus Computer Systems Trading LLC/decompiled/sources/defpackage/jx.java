package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class jx implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc5 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ yci d;

    public /* synthetic */ jx(bc5 bc5Var, Function0 function0, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = bc5Var;
        this.c = function0;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fgq.c(this.b, this.c, this.d, hq5Var, rvf.R(385));
                break;
            default:
                fgq.a(this.b, this.c, this.d, hq5Var, rvf.R(385));
                break;
        }
        return Unit.a;
    }
}
