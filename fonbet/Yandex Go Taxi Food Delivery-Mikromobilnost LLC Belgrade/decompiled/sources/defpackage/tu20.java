package defpackage;

/* loaded from: classes2.dex */
public final class tu20 extends r45 {
    public final String b;
    public final wj00 c;
    public final String d;
    public final String e;

    public tu20(String str, String str2, wj00 wj00Var, String str3, String str4) {
        super(str);
        this.b = str2;
        this.c = wj00Var;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.r45
    public final wj00 e() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k("method", "cvv");
        String str = this.b;
        if (str != null) {
            wj00Var.k("cvn_token", str);
        }
        wj00 wj00Var2 = this.c;
        if (wj00Var2 != null) {
            wj00Var.b.put("token_ctx", wj00Var2);
        }
        String str2 = this.d;
        if (str2 != null) {
            wj00Var.k("binding_id", str2);
        }
        String str3 = this.e;
        if (str3 != null) {
            wj00Var.k("data_token", str3);
        }
        return wj00Var;
    }
}
