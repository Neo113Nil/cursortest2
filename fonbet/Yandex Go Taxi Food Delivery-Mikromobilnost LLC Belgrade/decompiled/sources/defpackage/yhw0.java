package defpackage;

/* loaded from: classes2.dex */
public final class yhw0 extends ciw0 {
    public final /* synthetic */ int d;
    public final String e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yhw0(String str, String str2, String str3, String str4, int i, String str5) {
        super(str, str2, str3);
        this.d = i;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.ciw0, defpackage.thj
    public final wj00 e() {
        int i = this.d;
        String str = this.f;
        String str2 = this.e;
        switch (i) {
            case 0:
                wj00 e = super.e();
                if (str2 != null) {
                    e.k("google_pay_token", str2);
                }
                if (str != null) {
                    e.k("payment_method", str);
                }
                return e;
            default:
                wj00 e2 = super.e();
                e2.k("payment_method", str2);
                if (str != null) {
                    e2.k("cvn", str);
                }
                return e2;
        }
    }
}
