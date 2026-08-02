package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes2.dex */
public final class uu20 extends r45 {
    public final boolean b;
    public final String c;
    public final String d;

    public uu20(String str, boolean z, String str2, String str3) {
        super(str);
        this.b = z;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.r45
    public final wj00 e() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k("method", X509CertImpl.SIGNATURE);
        wj00Var.i("user_success", this.b);
        String str = this.c;
        if (str != null) {
            wj00Var.k(Constants.KEY_DATA, str);
        }
        String str2 = this.d;
        if (str2 != null) {
            wj00Var.k(X509CertImpl.SIGNATURE, str2);
        }
        return wj00Var;
    }
}
