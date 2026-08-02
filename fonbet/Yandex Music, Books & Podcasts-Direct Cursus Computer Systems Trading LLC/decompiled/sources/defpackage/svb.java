package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class svb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ptb b;
    public final /* synthetic */ jub c;

    public /* synthetic */ svb(ptb ptbVar, jub jubVar, int i, int i2) {
        this.a = i2;
        this.b = ptbVar;
        this.c = jubVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vwb.o(this.b, this.c, hq5Var, rvf.R(1));
                break;
            default:
                cxb.j(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
