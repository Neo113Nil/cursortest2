package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class yjq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2s b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ yci d;

    public /* synthetic */ yjq(o2s o2sVar, Function1 function1, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = o2sVar;
        this.c = function1;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                szf.o(this.b, this.c, this.d, hq5Var, rvf.R(385));
                break;
            default:
                wdg.m(this.b, this.c, this.d, hq5Var, rvf.R(385));
                break;
        }
        return Unit.a;
    }
}
