package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class n2p implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0p b;
    public final /* synthetic */ yci c;

    public /* synthetic */ n2p(c0p c0pVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = c0pVar;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a4g.a(this.b, this.c, hq5Var, rvf.R(1));
                break;
            default:
                a4g.b(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
