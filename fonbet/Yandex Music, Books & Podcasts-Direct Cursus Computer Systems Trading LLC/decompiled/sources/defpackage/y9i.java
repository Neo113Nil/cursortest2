package defpackage;

/* loaded from: classes5.dex */
public final class y9i extends ks2 {
    public final String b;
    public final String c;
    public final z9h d;
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9i(String str, String str2, String str3, z9h z9hVar, boolean z) {
        super(str);
        str.getClass();
        this.b = str2;
        this.c = str3;
        this.d = z9hVar;
        this.e = z;
    }

    @Override // defpackage.ks2
    public final z9h e() {
        z9h z9hVar = new z9h();
        z9hVar.j("method", "new_card");
        String str = this.b;
        if (str != null) {
            z9hVar.j("data_token", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            z9hVar.j("cvn_token", str2);
        }
        z9h z9hVar2 = this.d;
        if (z9hVar2 != null) {
            w1g.B(z9hVar.b, "token_ctx", z9hVar2);
        }
        z9hVar.h("bind_card", this.e);
        return z9hVar;
    }
}
