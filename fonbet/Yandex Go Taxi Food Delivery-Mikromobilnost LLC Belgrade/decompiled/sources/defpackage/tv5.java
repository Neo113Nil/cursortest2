package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public final class tv5 extends l55 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ tv5(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 a() {
        switch (this.a) {
            case 0:
                wj00 wj00Var = new wj00(0);
                wj00Var.k("redirect_url", this.b);
                wj00Var.k("mode", "async");
                return wj00Var;
            case 1:
                wj00 wj00Var2 = new wj00(0);
                wj00Var2.k("purchase_token", this.b);
                return wj00Var2;
            case 2:
                wj00 wj00Var3 = new wj00(0);
                wj00Var3.k("sbp_token_id", this.b);
                return wj00Var3;
            default:
                wj00 wj00Var4 = new wj00(0);
                wj00Var4.k("verification_id", this.b);
                return wj00Var4;
        }
    }

    @Override // defpackage.hz50
    public final String c() {
        switch (this.a) {
            case 0:
                return "v1/bind_sbp_token";
            case 1:
                return "v2/check_payment";
            case 2:
                return "v1/unbind_sbp_token";
            default:
                return "v2/check_verification";
        }
    }

    @Override // defpackage.hz50
    public final y5j0 encoding() {
        switch (this.a) {
        }
        return new aex();
    }

    @Override // defpackage.hz50
    public final NetworkMethod method() {
        switch (this.a) {
        }
        return NetworkMethod.post;
    }
}
