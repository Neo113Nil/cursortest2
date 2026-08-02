package defpackage;

import javax.net.ssl.HttpsURLConnection;
import ru.cprocsp.NGate.tls.TLSConstants;

/* loaded from: classes4.dex */
public class rwu {
    public void a(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setConnectTimeout(30000);
        httpsURLConnection.setReadTimeout(TLSConstants.SO_TIMEOUT);
    }
}
