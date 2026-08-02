package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.collections.a;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;

/* loaded from: classes4.dex */
public final class twu {
    public static final List a = scc.g("application/json", "text/html");

    public static void a(Map map) {
        if (EbsLogger.INSTANCE.getHasData()) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                EbsLogger.INSTANCE.data("HTTPS--->", str + " : " + a.X(list, ";", null, null, null, 62));
            }
        }
    }

    public static void b(HttpsURLConnection httpsURLConnection, byte[] bArr) {
        EbsLogger ebsLogger = EbsLogger.INSTANCE;
        if (ebsLogger.getHasData()) {
            Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
            if (serverCertificates.length == 0) {
                ebsLogger.warning("HTTPS--->", "No peer certificates");
            }
            for (Certificate certificate : serverCertificates) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                EbsLogger ebsLogger2 = EbsLogger.INSTANCE;
                ebsLogger2.data("CERT--->", "subjectDN = " + x509Certificate.getSubjectDN());
                ebsLogger2.data("CERT--->", "version = " + x509Certificate.getVersion());
                ebsLogger2.data("CERT--->", "issuerAlternativeNames = " + x509Certificate.getIssuerAlternativeNames());
                ebsLogger2.data("CERT--->", "subjectAlternativeNames = " + x509Certificate.getSubjectAlternativeNames());
                ebsLogger2.data("CERT--->", "notAfter = " + x509Certificate.getNotAfter());
                ebsLogger2.data("CERT--->", "notBefore = " + x509Certificate.getNotBefore());
                try {
                    ebsLogger2.data("CERT--->", "CRLDP = " + po91.d(x509Certificate));
                } catch (Exception unused) {
                    EbsLogger.INSTANCE.warning("CERT--->", "Failed to get CRLDP");
                }
            }
            ebsLogger.data("HTTPS--->", "END " + httpsURLConnection.getRequestMethod());
            for (Map.Entry<String, List<String>> entry : httpsURLConnection.getHeaderFields().entrySet()) {
                String key = entry.getKey();
                Iterator<T> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    EbsLogger.INSTANCE.data("HTTPS--->", key + " : " + ((String) it.next()));
                }
            }
            EbsLogger ebsLogger3 = EbsLogger.INSTANCE;
            ebsLogger3.data("HTTPS--->", httpsURLConnection.getResponseMessage() + " " + httpsURLConnection.getResponseCode() + " <-- " + httpsURLConnection.getURL());
            if (bArr.length == 0) {
                return;
            }
            String contentType = httpsURLConnection.getContentType();
            String g0 = contentType != null ? evu0.g0(contentType, ";", contentType) : null;
            if (g0 == null) {
                g0 = "";
            }
            if (a.contains(g0)) {
                ebsLogger3.data("HTTPS--->", "response body = ".concat(new String(bArr, uza.a)));
            }
        }
    }
}
