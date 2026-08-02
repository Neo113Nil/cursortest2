package defpackage;

import com.yandex.fintechsdk.entities.environment.PayEnvironment;

/* loaded from: classes12.dex */
public final class rgs implements osu {
    public final vif a;
    public final PayEnvironment b;

    public rgs(vif vifVar, PayEnvironment payEnvironment) {
        this.a = vifVar;
        this.b = payEnvironment;
    }

    @Override // defpackage.osu
    public final String a() {
        this.a.getClass();
        int i = qgs.a[this.b.ordinal()];
        if (i == 1) {
            return "https://mobpayment-test.yandex-team.ru";
        }
        if (i == 2) {
            return "https://mobpayment.yandex.net";
        }
        if (i == 3) {
            return "https://sandbox.mobile.pay.yandex.ru";
        }
        w511.b();
        return null;
    }
}
