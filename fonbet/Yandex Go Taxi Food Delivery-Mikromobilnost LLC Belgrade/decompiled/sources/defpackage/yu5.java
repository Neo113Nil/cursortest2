package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;

/* loaded from: classes2.dex */
public final class yu5 extends thj {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public yu5(String str, String str2, String str3, String str4, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    @Override // defpackage.thj, defpackage.hz50
    public final String c() {
        return "bind_google_pay_token";
    }

    @Override // defpackage.thj
    public final wj00 e() {
        wj00 e = super.e();
        String str = this.a;
        if (str != null) {
            e.k(AuthSdkActivity.RESPONSE_TYPE_TOKEN, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            e.k("service_token", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            e.k("order_tag", str3);
        }
        e.j(this.d, "region_id");
        e.k("google_pay_token", this.e);
        return e;
    }
}
