package defpackage;

/* loaded from: classes5.dex */
public final class grr extends irr {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grr(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        super(str, str2, str3);
        eta.s(str2, str3, str4, str5, str6);
        str7.getClass();
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = z;
    }

    @Override // defpackage.irr, defpackage.x28
    public final z9h e() {
        z9h e = super.e();
        e.j("card_number", this.d);
        e.j("expiration_month", this.e);
        e.j("expiration_year", this.f);
        e.j("cvn", this.g);
        e.i(this.h ? 1 : 0, "bind_card");
        e.j("payment_method", "new_card");
        return e;
    }
}
