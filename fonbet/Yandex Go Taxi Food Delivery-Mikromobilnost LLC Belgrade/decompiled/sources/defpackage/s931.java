package defpackage;

import com.yandex.xplat.common.NetworkMethod;
import com.yandex.xplat.payment.sdk.ChallengeMethod;

/* loaded from: classes2.dex */
public final class s931 extends l55 {
    public final String a;
    public final String b;
    public final String c;
    public final ChallengeMethod d;
    public final boolean e;

    public s931(String str, String str2, String str3, ChallengeMethod challengeMethod, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = challengeMethod;
        this.e = z;
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 a() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k("binding_id", this.a);
        wj00Var.k("verification_id", this.b);
        wj00Var.k("guess", this.c);
        wj00Var.k("method", this.d.getValue());
        if (this.e) {
            wj00Var.i("request_resend", true);
        }
        return wj00Var;
    }

    @Override // defpackage.hz50
    public final String c() {
        return "v1/verify_sbp_payment";
    }

    @Override // defpackage.hz50
    public final y5j0 encoding() {
        return new aex();
    }

    @Override // defpackage.hz50
    public final NetworkMethod method() {
        return NetworkMethod.post;
    }
}
