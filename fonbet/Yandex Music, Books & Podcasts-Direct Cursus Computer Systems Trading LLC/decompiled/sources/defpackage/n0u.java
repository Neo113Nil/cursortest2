package defpackage;

/* loaded from: classes5.dex */
public final class n0u extends vs2 {
    public final String a;
    public final String b;
    public final String c;
    public final za4 d;
    public final boolean e;

    public n0u(String str, String str2, String str3, za4 za4Var, boolean z) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = za4Var;
        this.e = z;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "v1/verify_sbp_payment";
    }

    @Override // defpackage.vs2, defpackage.e1j
    public final z9h d() {
        z9h z9hVar = new z9h();
        z9hVar.j("binding_id", this.a);
        z9hVar.j("verification_id", this.b);
        z9hVar.j("guess", this.c);
        z9hVar.j("method", this.d.a);
        if (this.e) {
            z9hVar.h("request_resend", true);
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
