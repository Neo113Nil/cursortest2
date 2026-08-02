package defpackage;

/* loaded from: classes5.dex */
public final class b13 extends x28 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public b13(int i, String str, String str2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "bind_google_pay_token";
    }

    @Override // defpackage.x28
    public final z9h e() {
        z9h z9hVar = new z9h();
        String str = this.a;
        if (str != null) {
            z9hVar.j("token", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            z9hVar.j("service_token", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            z9hVar.j("order_tag", str3);
        }
        z9hVar.i(this.d, "region_id");
        z9hVar.j("google_pay_token", this.e);
        return z9hVar;
    }
}
