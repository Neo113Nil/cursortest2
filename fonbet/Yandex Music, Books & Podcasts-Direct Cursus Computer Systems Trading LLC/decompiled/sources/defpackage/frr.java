package defpackage;

/* loaded from: classes5.dex */
public final class frr extends irr {
    public final /* synthetic */ int d;
    public final String e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frr(int i, String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.d = i;
        switch (i) {
            case 1:
                dfi.s(str2, str3, str4);
                super(str, str2, str3);
                this.e = str4;
                this.f = str5;
                break;
            default:
                str2.getClass();
                str3.getClass();
                this.e = str4;
                this.f = str5;
                break;
        }
    }

    @Override // defpackage.irr, defpackage.x28
    public final z9h e() {
        switch (this.d) {
            case 0:
                z9h e = super.e();
                String str = this.e;
                if (str != null) {
                    e.j("google_pay_token", str);
                }
                String str2 = this.f;
                if (str2 != null) {
                    e.j("payment_method", str2);
                }
                return e;
            default:
                z9h e2 = super.e();
                e2.j("payment_method", this.e);
                String str3 = this.f;
                if (str3 != null) {
                    e2.j("cvn", str3);
                }
                return e2;
        }
    }
}
