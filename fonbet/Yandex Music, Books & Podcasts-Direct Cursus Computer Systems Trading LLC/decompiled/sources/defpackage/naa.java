package defpackage;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public final class naa extends AsyncTask {
    public final Context a;
    public final SslError b;
    public final String c;
    public final h88 d;
    public final y9w e;
    public final pt0 f;
    public final zfv g;
    public final osg h;

    public naa(Context context, SslError sslError, String str, h88 h88Var, y9w y9wVar, pt0 pt0Var, zfv zfvVar, x2i x2iVar) {
        this.a = context.getApplicationContext();
        this.b = sslError;
        this.c = str;
        this.d = h88Var;
        this.e = y9wVar;
        this.f = pt0Var;
        this.g = zfvVar;
        this.h = x2iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0096  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        X509Certificate u;
        boolean contains;
        boolean contains2;
        HttpsURLConnection httpsURLConnection;
        Certificate[] serverCertificates;
        URLConnection openConnection;
        try {
            SslCertificate certificate = this.b.getCertificate();
            if (Build.VERSION.SDK_INT >= 29) {
                u = ivt.a(certificate);
            } else {
                byte[] byteArray = SslCertificate.saveState(certificate).getByteArray("x509-certificate");
                u = byteArray == null ? null : dag.u(byteArray);
            }
            if (u == null) {
                this.h.F("Extracted certificate from SslError is null");
                return Boolean.FALSE;
            }
            pt0 pt0Var = this.f;
            synchronized (pt0Var) {
                contains = ((HashSet) pt0Var.a).contains(u);
            }
            if (contains) {
                return Boolean.TRUE;
            }
            pt0 pt0Var2 = this.f;
            synchronized (pt0Var2) {
                contains2 = ((HashSet) pt0Var2.b).contains(u);
            }
            if (contains2) {
                return Boolean.FALSE;
            }
            String str = this.c;
            osg osgVar = this.h;
            try {
                openConnection = new URL(str).openConnection();
            } catch (IOException e) {
                osgVar.D("Failed to open connection to " + str, e);
            }
            if (openConnection instanceof HttpsURLConnection) {
                httpsURLConnection = (HttpsURLConnection) openConnection;
                if (httpsURLConnection != null) {
                }
                serverCertificates = null;
                if (serverCertificates != null) {
                }
                this.h.F("Empty certificate chain");
                return Boolean.FALSE;
            }
            osgVar.F("Expected HTTPS connection, but found " + openConnection);
            httpsURLConnection = null;
            if (httpsURLConnection != null) {
                httpsURLConnection.setSSLSocketFactory(dag.z());
                httpsURLConnection.setConnectTimeout(ScreenMirroringConfig.Test.pcVideoUdpPort);
                httpsURLConnection.setReadTimeout(ScreenMirroringConfig.Test.pcVideoUdpPort);
                try {
                    try {
                        try {
                            httpsURLConnection.connect();
                            serverCertificates = httpsURLConnection.getServerCertificates();
                        } finally {
                            httpsURLConnection.disconnect();
                        }
                    } catch (IOException unused) {
                        osgVar.F("Failed to establish connection to " + str);
                        serverCertificates = null;
                        if (serverCertificates != null) {
                        }
                        this.h.F("Empty certificate chain");
                        return Boolean.FALSE;
                    }
                } catch (RuntimeException e2) {
                    osgVar.D("Exception when trying to connect to " + str, e2);
                    serverCertificates = null;
                    if (serverCertificates != null) {
                    }
                    this.h.F("Empty certificate chain");
                    return Boolean.FALSE;
                }
                if (serverCertificates != null || serverCertificates.length == 0) {
                    this.h.F("Empty certificate chain");
                    return Boolean.FALSE;
                }
                int length = serverCertificates.length;
                X509Certificate[] x509CertificateArr = new X509Certificate[length];
                for (int i = 0; i < serverCertificates.length; i++) {
                    x509CertificateArr[i] = (X509Certificate) serverCertificates[i];
                }
                if (length != serverCertificates.length) {
                    this.h.F("Illegal certificate transformation. Was " + serverCertificates.length + ", but found " + length);
                    return Boolean.FALSE;
                }
                X509TrustManager t = dag.t(this.a, this.d, this.e, this.h);
                if (t == null) {
                    this.h.F("Empty TrustManager");
                    return Boolean.FALSE;
                }
                if (!x509CertificateArr[0].equals(u)) {
                    this.h.F("Found a mismatch between the leaf certificate in the chain and the certificate from the original SSLError.");
                    return Boolean.FALSE;
                }
                try {
                    t.checkServerTrusted(x509CertificateArr, "RSA");
                    pt0 pt0Var3 = this.f;
                    synchronized (pt0Var3) {
                        ((HashSet) pt0Var3.a).add(u);
                    }
                    return Boolean.TRUE;
                } catch (CertificateException e3) {
                    this.h.H("Certificate chain rejected (" + e3.getMessage() + ")");
                    if (e3 instanceof ea4) {
                        int i2 = ((ea4) e3).a;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i2 == 2) {
                            pt0 pt0Var4 = this.f;
                            synchronized (pt0Var4) {
                                ((HashSet) pt0Var4.b).add(u);
                            }
                        }
                    }
                    return Boolean.FALSE;
                }
            }
            serverCertificates = null;
            if (serverCertificates != null) {
            }
            this.h.F("Empty certificate chain");
            return Boolean.FALSE;
        } catch (CertificateException e4) {
            this.h.D("Failed to extract X509 certificate from original SslError", e4);
            return Boolean.FALSE;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zfv zfvVar = this.g;
        if (booleanValue) {
            zfvVar.z();
        } else {
            zfvVar.e();
        }
    }
}
