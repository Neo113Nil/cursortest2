package defpackage;

/* loaded from: classes2.dex */
public final class zhw0 extends ciw0 {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public zhw0(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str, str2, str3);
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = z;
    }

    @Override // defpackage.ciw0, defpackage.thj
    public final wj00 e() {
        wj00 e = super.e();
        e.k("card_number", this.d);
        e.k("expiration_month", this.e);
        e.k("expiration_year", this.f);
        e.k("cvn", this.g);
        e.j(this.h ? 1 : 0, "bind_card");
        e.k("payment_method", "new_card");
        return e;
    }
}
