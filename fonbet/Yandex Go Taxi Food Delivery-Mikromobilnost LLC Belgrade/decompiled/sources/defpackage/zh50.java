package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class zh50 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai50 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String w;
    public final /* synthetic */ ji50 x;

    public /* synthetic */ zh50(ai50 ai50Var, boolean z, String str, ji50 ji50Var, int i) {
        this.a = i;
        this.b = ai50Var;
        this.c = z;
        this.w = str;
        this.x = ji50Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        ji50 ji50Var = this.x;
        String str = this.w;
        boolean z = this.c;
        ai50 ai50Var = this.b;
        w3j0 w3j0Var = (w3j0) obj;
        switch (i) {
            case 0:
                ai50Var.getClass();
                w3j0Var.d("type", ai50.a(z));
                w3j0Var.d("adress", str);
                w3j0Var.a.put("origin", ai50.d(ji50Var));
                break;
            default:
                ai50Var.getClass();
                w3j0Var.d("type", ai50.a(z));
                w3j0Var.d("adress", str);
                w3j0Var.a.put("origin", ai50.d(ji50Var));
                break;
        }
        return w3j0Var;
    }
}
