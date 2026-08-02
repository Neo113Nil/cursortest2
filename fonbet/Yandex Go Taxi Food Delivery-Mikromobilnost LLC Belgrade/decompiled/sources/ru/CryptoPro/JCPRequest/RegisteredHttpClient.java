package ru.CryptoPro.JCPRequest;

import com.adjust.sdk.Constants;
import defpackage.dt61;
import defpackage.qz40;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes4.dex */
public class RegisteredHttpClient {
    public static dt61 getHttpInstance(URL url, boolean z) throws Exception {
        qz40 qz40Var = new qz40();
        qz40Var.a = 0;
        qz40Var.c = null;
        qz40Var.d = null;
        qz40Var.e = null;
        qz40Var.b = z;
        boolean equalsIgnoreCase = url.getProtocol().equalsIgnoreCase(Constants.SCHEME);
        qz40Var.f = null;
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new ConnectException(GostCertificateRequest.ADDRESS_SHOULD_BE_HTTP);
        }
        qz40Var.f = equalsIgnoreCase ? (HttpsURLConnection) openConnection : (HttpURLConnection) openConnection;
        return qz40Var;
    }
}
