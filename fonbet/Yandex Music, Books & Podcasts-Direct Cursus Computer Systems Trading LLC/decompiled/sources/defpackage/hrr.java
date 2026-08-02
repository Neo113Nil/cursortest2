package defpackage;

/* loaded from: classes5.dex */
public final class hrr extends irr {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hrr(String str, String str2, String str3, int i) {
        super(str, str2, str3);
        this.d = i;
    }

    @Override // defpackage.irr, defpackage.x28
    public final z9h e() {
        switch (this.d) {
            case 0:
                z9h e = super.e();
                e.j("payment_method", "new_sbp_token");
                e.j("cvn", "");
                return e;
            default:
                z9h e2 = super.e();
                e2.j("payment_method", "sbp_qr");
                e2.j("cvn", "");
                return e2;
        }
    }
}
