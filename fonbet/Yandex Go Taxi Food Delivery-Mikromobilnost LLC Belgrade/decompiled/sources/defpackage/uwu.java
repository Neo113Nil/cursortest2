package defpackage;

import javax.net.ssl.HttpsURLConnection;
import ru.rt.ebs.cryptosdk.core.security.entities.models.ITLSFactory;

/* loaded from: classes4.dex */
public final class uwu extends rwu {
    public final ITLSFactory a;
    public final twu b;

    public uwu(ITLSFactory iTLSFactory, twu twuVar) {
        this.a = iTLSFactory;
        this.b = twuVar;
    }

    @Override // defpackage.rwu
    public final void a(HttpsURLConnection httpsURLConnection) {
        super.a(httpsURLConnection);
        httpsURLConnection.setSSLSocketFactory(new pvf0(this.a.getOrCreateGostTLSProvider().getSslSocketFactory(), this.b));
    }
}
