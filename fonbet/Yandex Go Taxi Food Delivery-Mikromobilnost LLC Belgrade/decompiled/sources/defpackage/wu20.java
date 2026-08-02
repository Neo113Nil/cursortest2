package defpackage;

/* loaded from: classes2.dex */
public final class wu20 extends r45 {
    public final String b;
    public final String c;
    public final wj00 d;
    public final boolean e;
    public final String f;

    public wu20(String str, String str2, String str3, wj00 wj00Var, boolean z, String str4) {
        super(str);
        this.b = str2;
        this.c = str3;
        this.d = wj00Var;
        this.e = z;
        this.f = str4;
    }

    @Override // defpackage.r45
    public final wj00 e() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k("method", "new_card");
        String str = this.b;
        if (str != null) {
            wj00Var.k("data_token", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            wj00Var.k("cvn_token", str2);
        }
        wj00 wj00Var2 = this.d;
        if (wj00Var2 != null) {
            wj00Var.b.put("token_ctx", wj00Var2);
        }
        wj00Var.i("bind_card", this.e);
        String str3 = this.f;
        if (str3 != null) {
            wj00Var.k("device_pubkey", str3);
        }
        return wj00Var;
    }
}
