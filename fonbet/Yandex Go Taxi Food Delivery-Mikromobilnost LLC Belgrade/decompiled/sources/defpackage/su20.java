package defpackage;

/* loaded from: classes13.dex */
public final class su20 extends r45 {
    public final String b;
    public final String c;
    public final String d;

    public su20(String str, String str2, String str3, String str4) {
        super(str);
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.r45
    public final wj00 e() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k("method", "bound");
        wj00Var.k("binding_id", this.b);
        it00 it00Var = it00.b;
        String str = this.c;
        y3x y3xVar = str != null ? (y3x) it00Var.a.b.invoke(str) : null;
        if (y3xVar != null) {
            wj00Var.b.put("payload", y3xVar);
        }
        String str2 = this.d;
        if (str2 != null) {
            wj00Var.k("device_pubkey", str2);
        }
        return wj00Var;
    }
}
