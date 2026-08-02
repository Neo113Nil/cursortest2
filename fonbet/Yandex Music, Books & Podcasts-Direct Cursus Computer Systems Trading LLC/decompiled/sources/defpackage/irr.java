package defpackage;

/* loaded from: classes5.dex */
public abstract class irr extends x28 {
    public final String a;
    public final String b;
    public final String c;

    public irr(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "supply_payment_data";
    }

    @Override // defpackage.x28
    public z9h e() {
        z9h z9hVar = new z9h();
        String str = this.a;
        if (str != null) {
            z9hVar.j("token", str);
        }
        z9hVar.j("purchase_token", this.b);
        z9hVar.j("email", this.c);
        return z9hVar;
    }
}
