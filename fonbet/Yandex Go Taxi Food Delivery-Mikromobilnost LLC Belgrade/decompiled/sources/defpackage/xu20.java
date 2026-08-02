package defpackage;

/* loaded from: classes13.dex */
public final class xu20 extends r45 {
    public final /* synthetic */ int b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xu20(String str, String str2, int i) {
        super(str);
        this.b = i;
        this.c = str2;
    }

    @Override // defpackage.r45
    public final wj00 e() {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                wj00 wj00Var = new wj00(0);
                wj00Var.k("method", "new_sbp_token");
                if (str != null) {
                    wj00Var.k("device_pubkey", str);
                }
                return wj00Var;
            default:
                wj00 wj00Var2 = new wj00(0);
                wj00Var2.k("method", "sbp_qr");
                if (str != null) {
                    wj00Var2.k("device_pubkey", str);
                }
                return wj00Var2;
        }
    }
}
