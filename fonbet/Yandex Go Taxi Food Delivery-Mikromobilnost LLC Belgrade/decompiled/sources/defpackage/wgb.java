package defpackage;

/* loaded from: classes2.dex */
public final class wgb extends thj {
    public final String a;

    public wgb(String str) {
        this.a = str;
    }

    @Override // defpackage.thj, defpackage.hz50
    public final String c() {
        return "check_payment";
    }

    @Override // defpackage.thj
    public final wj00 e() {
        wj00 e = super.e();
        e.k("purchase_token", this.a);
        return e;
    }
}
