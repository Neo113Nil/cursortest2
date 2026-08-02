package defpackage;

/* loaded from: classes5.dex */
public final class lwt extends vs2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final z9h f;
    public final boolean g;
    public final String h;

    public lwt(String str, String str2, String str3, String str4, String str5, z9h z9hVar, boolean z, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z9hVar;
        this.g = z;
        this.h = str6;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "v2/verify_binding";
    }

    @Override // defpackage.vs2, defpackage.e1j
    public final z9h c() {
        z9h z9hVar = new z9h();
        z9hVar.j("X-Request-ID", this.a);
        return z9hVar;
    }

    @Override // defpackage.vs2, defpackage.e1j
    public final z9h d() {
        z9h z9hVar = new z9h();
        String str = this.b;
        if (str != null) {
            z9hVar.j("currency", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            z9hVar.j("pos_id", str2);
        }
        z9hVar.h("is_empty_cvv", this.g);
        z9hVar.j("system", this.h);
        z9h z9hVar2 = new z9h();
        String str3 = this.d;
        if (str3 != null) {
            z9hVar2.j("pmd", str3);
        }
        String str4 = this.e;
        if (str4 != null) {
            z9hVar2.j("psd", str4);
        }
        w1g.B(z9hVar2.b, "context", this.f);
        w1g.B(z9hVar.b, "tokens", z9hVar2);
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
