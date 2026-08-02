package defpackage;

/* loaded from: classes5.dex */
public final class vle extends vs2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final jeq d;
    public final ime e;
    public final boolean f;

    public vle(String str, String str2, boolean z, jeq jeqVar, ime imeVar, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = jeqVar;
        this.e = imeVar;
        this.f = z2;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "v1/init_payment";
    }

    @Override // defpackage.vs2, defpackage.e1j
    public final z9h d() {
        z9h z9hVar = new z9h();
        z9hVar.j("token", this.a);
        String str = this.b;
        if (str != null) {
            z9hVar.j("email", str);
        }
        ime imeVar = this.e;
        String str2 = (String) imeVar.d;
        if (str2 != null) {
            z9hVar.j("turboapp_id", str2);
        }
        String str3 = (String) imeVar.b;
        if (str3 != null) {
            z9hVar.j("psuid", str3);
        }
        String str4 = (String) imeVar.c;
        if (str4 != null) {
            z9hVar.j("tsid", str4);
        }
        z9hVar.h("credit", this.c);
        String str5 = this.d.a;
        jeq jeqVar = jeq.enabled;
        z9hVar.h("show_sbp_tokens", str5.equals("sbpTokensEnabled"));
        z9hVar.h("is_new_attempt", this.f);
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
