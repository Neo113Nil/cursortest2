package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class z9v implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9v b;

    public /* synthetic */ z9v(h9v h9vVar, int i) {
        this.a = i;
        this.b = h9vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                oq5Var.Z(1026332354);
                Boolean bool = (Boolean) this.b.b.getValue();
                bool.getClass();
                oq5Var.p(false);
                return bool;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.Z(2070120323);
                Boolean bool2 = (Boolean) this.b.c.b.getValue();
                bool2.getClass();
                oq5Var2.p(false);
                return bool2;
        }
    }
}
