package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class qs5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bt5 b;
    public final /* synthetic */ rka0 c;
    public final /* synthetic */ nw70 w;
    public final /* synthetic */ oy80 x;

    public /* synthetic */ qs5(bt5 bt5Var, rka0 rka0Var, nw70 nw70Var, oy80 oy80Var, int i) {
        this.a = i;
        this.b = bt5Var;
        this.c = rka0Var;
        this.w = nw70Var;
        this.x = oy80Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        oy80 oy80Var = this.x;
        nw70 nw70Var = this.w;
        rka0 rka0Var = this.c;
        bt5 bt5Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                yu20 yu20Var = (yu20) obj;
                String str = yu20Var.b;
                String str2 = yu20Var.a;
                if (!str2.equals("warning")) {
                    break;
                } else {
                    rwo rwoVar = bt5Var.g;
                    sv90 sv90Var = qv90.a;
                    String str3 = str == null ? "" : str;
                    sv90Var.getClass();
                    ((y22) rwoVar).a(sv90.b0(str3));
                    break;
                }
            default:
                break;
        }
        return bt5Var.d(rka0Var.a, nw70Var, oy80Var);
    }
}
