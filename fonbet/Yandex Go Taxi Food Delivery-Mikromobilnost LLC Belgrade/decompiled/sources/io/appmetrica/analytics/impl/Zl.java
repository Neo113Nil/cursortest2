package io.appmetrica.analytics.impl;

import defpackage.evu0;
import defpackage.oyr;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class Zl extends Gb {
    public final /* synthetic */ C0226bm a;
    public final /* synthetic */ ServiceConnectionC0197am b;

    public Zl(C0226bm c0226bm, ServiceConnectionC0197am serviceConnectionC0197am) {
        this.a = c0226bm;
        this.b = serviceConnectionC0197am;
    }

    @Override // io.appmetrica.analytics.impl.Gb
    public final void a(String str) {
        InterfaceC0309ej c0252cj;
        C0226bm.a(this.a, this.b);
        Wi wi = this.b.a;
        this.a.getClass();
        if (str == null || evu0.J(str)) {
            c0252cj = new C0252cj("RuStore referrer payload is empty", null, 2, null);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("REFERRER_ID_KEY");
                c0252cj = evu0.J(string) ? new C0252cj("RuStore referrer id is empty", null, 2, null) : new C0281dj(new Ui(string, jSONObject.optLong("RECEIVED_TIMESTAMP_KEY") / 1000, jSONObject.optLong("INSTALL_APP_TIMESTAMP_KEY") / 1000, 4));
            } catch (Throwable th) {
                c0252cj = new C0252cj("Failed to parse RuStore referrer payload", th);
            }
        }
        wi.a(c0252cj);
    }

    @Override // io.appmetrica.analytics.impl.Gb
    public final void a(int i, String str) {
        C0226bm.a(this.a, this.b);
        this.b.a.a(new C0252cj(oyr.k(i, "RuStore referrer error ", Extension.COLON_SPACE, str), null, 2, null));
    }
}
