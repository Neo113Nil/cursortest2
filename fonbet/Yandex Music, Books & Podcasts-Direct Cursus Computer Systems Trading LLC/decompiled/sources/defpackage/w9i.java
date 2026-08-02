package defpackage;

/* loaded from: classes5.dex */
public final class w9i extends ks2 {
    public final String b;
    public final z9h c;
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9i(String str, String str2, z9h z9hVar, String str3, String str4) {
        super(str);
        str.getClass();
        this.b = str2;
        this.c = z9hVar;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.ks2
    public final z9h e() {
        z9h z9hVar = new z9h();
        z9hVar.j("method", "cvv");
        String str = this.b;
        if (str != null) {
            z9hVar.j("cvn_token", str);
        }
        z9h z9hVar2 = this.c;
        if (z9hVar2 != null) {
            w1g.B(z9hVar.b, "token_ctx", z9hVar2);
        }
        String str2 = this.d;
        if (str2 != null) {
            z9hVar.j("binding_id", str2);
        }
        String str3 = this.e;
        if (str3 != null) {
            z9hVar.j("data_token", str3);
        }
        return z9hVar;
    }
}
