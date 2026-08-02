package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class m1h implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bci b;
    public final /* synthetic */ v1h c;
    public final /* synthetic */ n1h d;
    public final /* synthetic */ yci e;

    public /* synthetic */ m1h(bci bciVar, v1h v1hVar, n1h n1hVar, yci yciVar) {
        this.b = bciVar;
        this.c = v1hVar;
        this.d = n1hVar;
        this.e = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(9);
                o5g.c(this.b, this.c, this.d, this.e, (hq5) obj, R);
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                o5g.c(this.b, this.c, this.d, this.e, hq5Var, 8);
        }
        return Unit.a;
    }

    public /* synthetic */ m1h(bci bciVar, v1h v1hVar, n1h n1hVar, yci yciVar, int i) {
        this.b = bciVar;
        this.c = v1hVar;
        this.d = n1hVar;
        this.e = yciVar;
    }
}
