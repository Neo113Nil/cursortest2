package ru.domesticroots.webview;

import android.content.Context;
import android.net.http.SslError;
import android.os.AsyncTask;
import defpackage.j79;
import defpackage.kp50;
import defpackage.q79;
import defpackage.rt41;
import defpackage.tgz;
import defpackage.xw21;
import defpackage.y97;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes4.dex */
class DownloadCertsAndCheckTask extends AsyncTask<Void, Void, Boolean> {
    private final rt41 callback;
    private final j79 certificateCheckCache;
    private final q79 certificatesProvider;
    private final Context context;
    private final y97 ctLogUrlProvider;
    private final tgz logger;
    private final SslError originalError;
    private final String url;

    public DownloadCertsAndCheckTask(Context context, SslError sslError, String str, q79 q79Var, y97 y97Var, j79 j79Var, rt41 rt41Var, tgz tgzVar) {
        this.context = context.getApplicationContext();
        this.originalError = sslError;
        this.url = str;
        this.certificatesProvider = q79Var;
        this.ctLogUrlProvider = y97Var;
        this.certificateCheckCache = j79Var;
        this.callback = rt41Var;
        this.logger = tgzVar;
    }

    private Certificate[] connectAndGetServerCertificates(String str) {
        HttpsURLConnection openConnection = openConnection(str);
        if (openConnection == null) {
            return null;
        }
        openConnection.setSSLSocketFactory(kp50.y());
        openConnection.setConnectTimeout(5000);
        openConnection.setReadTimeout(5000);
        try {
            openConnection.connect();
            return openConnection.getServerCertificates();
        } catch (IOException unused) {
            this.logger.r("Failed to establish connection to " + str);
            return null;
        } catch (RuntimeException e) {
            this.logger.s(e, "Exception when trying to connect to " + str);
            return null;
        } finally {
            openConnection.disconnect();
        }
    }

    private HttpsURLConnection openConnection(String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return (HttpsURLConnection) openConnection;
            }
            this.logger.r("Expected HTTPS connection, but found " + openConnection);
            return null;
        } catch (IOException e) {
            this.logger.s(e, "Failed to open connection to " + str);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public Boolean doInBackground(Void... voidArr) {
        boolean contains;
        boolean contains2;
        try {
            X509Certificate a = xw21.a(this.originalError.getCertificate());
            if (a == null) {
                this.logger.r("Extracted certificate from SslError is null");
                return Boolean.FALSE;
            }
            j79 j79Var = this.certificateCheckCache;
            synchronized (j79Var) {
                contains = j79Var.a.contains(a);
            }
            if (contains) {
                return Boolean.TRUE;
            }
            j79 j79Var2 = this.certificateCheckCache;
            synchronized (j79Var2) {
                contains2 = j79Var2.b.contains(a);
            }
            if (contains2) {
                return Boolean.FALSE;
            }
            Certificate[] connectAndGetServerCertificates = connectAndGetServerCertificates(this.url);
            if (connectAndGetServerCertificates == null || connectAndGetServerCertificates.length == 0) {
                this.logger.r("Empty certificate chain");
                return Boolean.FALSE;
            }
            int length = connectAndGetServerCertificates.length;
            X509Certificate[] x509CertificateArr = new X509Certificate[length];
            for (int i = 0; i < connectAndGetServerCertificates.length; i++) {
                x509CertificateArr[i] = (X509Certificate) connectAndGetServerCertificates[i];
            }
            if (length != connectAndGetServerCertificates.length) {
                this.logger.r("Illegal certificate transformation. Was " + connectAndGetServerCertificates.length + ", but found " + length);
                return Boolean.FALSE;
            }
            X509TrustManager k = kp50.k(this.context, this.certificatesProvider, this.ctLogUrlProvider, this.logger);
            if (k == null) {
                this.logger.r("Empty TrustManager");
                return Boolean.FALSE;
            }
            if (!x509CertificateArr[0].equals(a)) {
                this.logger.r("Found a mismatch between the leaf certificate in the chain and the certificate from the original SSLError.");
                return Boolean.FALSE;
            }
            try {
                k.checkServerTrusted(x509CertificateArr, "RSA");
                j79 j79Var3 = this.certificateCheckCache;
                synchronized (j79Var3) {
                    j79Var3.a.add(a);
                }
                return Boolean.TRUE;
            } catch (CertificateException e) {
                this.logger.getClass();
                if (e instanceof CertificateChainVerifier$NotTrustedException) {
                    CertificateChainVerifier$Result certificateChainVerifier$Result = ((CertificateChainVerifier$NotTrustedException) e).result;
                    certificateChainVerifier$Result.getClass();
                    if (certificateChainVerifier$Result == CertificateChainVerifier$Result.UNTRUSTED_ROOT) {
                        j79 j79Var4 = this.certificateCheckCache;
                        synchronized (j79Var4) {
                            j79Var4.b.add(a);
                        }
                    }
                }
                return Boolean.FALSE;
            }
        } catch (CertificateException e2) {
            this.logger.s(e2, "Failed to extract X509 certificate from original SslError");
            return Boolean.FALSE;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        rt41 rt41Var = this.callback;
        if (booleanValue) {
            rt41Var.l();
        } else {
            rt41Var.onCanceled();
        }
    }
}
