package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c6i implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d85 c;
    public final /* synthetic */ yci d;

    public /* synthetic */ c6i(String str, d85 d85Var, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = d85Var;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                pcg.b(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
            default:
                hdg.a(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
