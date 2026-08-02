package bo.app;

import com.braze.support.BrazeLogger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wg {
    public static final wg a = new wg();
    public static final nf b;

    static {
        try {
            b = new nf();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(26), 4, (Object) null);
        }
    }

    public static final String b() {
        return "Exception setting TLS socket factory on url connection.";
    }

    public final HttpURLConnection a(URL url) {
        url.getClass();
        URLConnection openConnection = url.openConnection();
        if (Intrinsics.areEqual(url.getProtocol(), "https")) {
            try {
                openConnection.getClass();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                nf nfVar = b;
                if (nfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socketFactory");
                    throw null;
                }
                httpsURLConnection.setSSLSocketFactory(nfVar);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(27), 4, (Object) null);
            }
        }
        openConnection.getClass();
        return (HttpURLConnection) openConnection;
    }

    public static final String a() {
        return "Exception initializing static TLS socket factory.";
    }
}
