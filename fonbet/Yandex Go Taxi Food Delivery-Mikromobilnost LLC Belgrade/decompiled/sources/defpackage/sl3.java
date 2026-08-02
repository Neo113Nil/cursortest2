package defpackage;

/* loaded from: classes12.dex */
public final class sl3 {
    public final /* synthetic */ int a;
    public final hk3 b;

    public /* synthetic */ sl3(hk3 hk3Var, int i) {
        this.a = i;
        this.b = hk3Var;
    }

    public final String a() {
        ek ekVar;
        ek ekVar2;
        int i = this.a;
        hk3 hk3Var = this.b;
        switch (i) {
            case 0:
                Object value = hk3Var.c.a.getValue();
                qk3 qk3Var = value instanceof qk3 ? (qk3) value : null;
                if (qk3Var == null || (ekVar = qk3Var.a) == null) {
                    return null;
                }
                return ekVar.a;
            default:
                Object value2 = hk3Var.c.a.getValue();
                qk3 qk3Var2 = value2 instanceof qk3 ? (qk3) value2 : null;
                if (qk3Var2 == null || (ekVar2 = qk3Var2.a) == null) {
                    return null;
                }
                return ekVar2.a;
        }
    }
}
