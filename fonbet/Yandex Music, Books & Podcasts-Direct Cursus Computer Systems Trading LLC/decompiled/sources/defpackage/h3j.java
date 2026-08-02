package defpackage;

/* loaded from: classes5.dex */
public final class h3j extends vs2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public h3j(Integer num, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "bindings/v2.0/bindings";
    }

    @Override // defpackage.vs2, defpackage.e1j
    public final z9h c() {
        z9h z9hVar = new z9h();
        z9hVar.j("X-Oauth-Token", this.a);
        z9hVar.j("X-Service-Token", this.b);
        return z9hVar;
    }

    @Override // defpackage.vs2, defpackage.e1j
    public final z9h d() {
        z9h z9hVar = new z9h();
        z9hVar.j("card_data_encrypted", this.d);
        z9hVar.j("hash_algo", this.c);
        z9hVar.j("service_token", this.b);
        Integer num = this.e;
        if (num != null) {
            z9hVar.i(num.intValue(), "region_id");
        }
        return z9hVar;
    }

    @Override // defpackage.e1j
    public final s0o encoding() {
        return new pv9(13);
    }

    @Override // defpackage.e1j
    public final q0j method() {
        return q0j.post;
    }
}
