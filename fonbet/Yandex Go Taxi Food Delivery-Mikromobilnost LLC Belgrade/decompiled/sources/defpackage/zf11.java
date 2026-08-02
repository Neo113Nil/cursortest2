package defpackage;

import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import ru.CryptoPro.ssl.SSLLogger;

/* loaded from: classes7.dex */
public final class zf11 implements vll0 {
    public final TrustManager[] a = {new yf11(0)};

    @Override // defpackage.vll0
    public final OkHttpClient.a a(OkHttpClient.a aVar) {
        SSLContext sSLContext = SSLContext.getInstance(SSLLogger.SHORT_LOGGER_NAME);
        if (sSLContext != null) {
            SecureRandom secureRandom = new SecureRandom();
            TrustManager[] trustManagerArr = this.a;
            sSLContext.init(null, trustManagerArr, secureRandom);
            aVar.h(sSLContext.getSocketFactory(), (X509TrustManager) trustManagerArr[0]);
            aVar.e(new xf11());
        }
        return aVar;
    }
}
