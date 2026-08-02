package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class diq implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ jp0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wn5 e;
    public final /* synthetic */ wn5 f;

    public /* synthetic */ diq(String str, jp0 jp0Var, boolean z, wn5 wn5Var, wn5 wn5Var2) {
        this.b = str;
        this.c = jp0Var;
        this.d = z;
        this.e = wn5Var;
        this.f = wn5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    ixf.g(this.b, this.c, this.d, this.e, this.f, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ixf.g(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ diq(String str, jp0 jp0Var, boolean z, wn5 wn5Var, wn5 wn5Var2, int i) {
        this.b = str;
        this.c = jp0Var;
        this.d = z;
        this.e = wn5Var;
        this.f = wn5Var2;
    }
}
