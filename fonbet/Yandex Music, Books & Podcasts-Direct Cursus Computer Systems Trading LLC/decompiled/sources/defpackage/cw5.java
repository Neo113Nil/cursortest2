package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class cw5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ String d;

    public /* synthetic */ cw5(String str, yci yciVar, String str2, int i) {
        this.a = 1;
        this.b = str;
        this.c = yciVar;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                n7w.k(rvf.R(1), hq5Var, this.c, this.b, this.d);
                break;
            case 1:
                jf0.l(rvf.R(49), hq5Var, this.c, this.b, this.d);
                break;
            case 2:
                x2n.b(rvf.R(1), hq5Var, this.c, this.b, this.d);
                break;
            default:
                o5g.a(rvf.R(1), hq5Var, this.c, this.b, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cw5(String str, String str2, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.d = str2;
        this.c = yciVar;
    }
}
