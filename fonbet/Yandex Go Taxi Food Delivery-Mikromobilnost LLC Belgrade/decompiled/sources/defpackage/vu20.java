package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;

/* loaded from: classes2.dex */
public final class vu20 extends r45 {
    public final String b;
    public final String c;

    public vu20(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.r45
    public final wj00 e() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k("method", "google_pay");
        String str = this.b;
        if (str != null) {
            wj00Var.k(AuthSdkActivity.RESPONSE_TYPE_TOKEN, str);
        }
        String str2 = this.c;
        if (str2 != null) {
            wj00Var.k("device_pubkey", str2);
        }
        return wj00Var;
    }
}
