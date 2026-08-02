package defpackage;

/* loaded from: classes10.dex */
public final class qme0 implements xbi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ cne0 c;
    public final /* synthetic */ cne0 w;

    public /* synthetic */ qme0(int i, cne0 cne0Var, cne0 cne0Var2, String str) {
        this.a = i;
        this.b = str;
        this.c = cne0Var;
        this.w = cne0Var2;
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        int i = this.a;
        cne0 cne0Var = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(cne0Var.g(str, false));
            default:
                String l = cne0Var.l(str, null);
                return l == null ? "" : l;
        }
    }

    @Override // defpackage.xbi0
    public final void setValue(Object obj, kgx kgxVar, Object obj2) {
        int i = this.a;
        cne0 cne0Var = this.w;
        String str = this.b;
        switch (i) {
            case 0:
                cne0Var.u(str, ((Boolean) obj2).booleanValue());
                break;
            default:
                cne0Var.r(str, (String) obj2);
                break;
        }
    }
}
