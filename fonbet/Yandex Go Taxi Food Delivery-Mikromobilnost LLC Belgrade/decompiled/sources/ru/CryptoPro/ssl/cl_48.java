package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLProtocolException;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
final class cl_48 extends cl_47 {
    public final X509Certificate[] b;
    public ArrayList c;
    public int d;

    public cl_48(cl_46 cl_46Var) {
        int k = cl_46Var.k();
        ArrayList arrayList = new ArrayList(4);
        CertificateFactory certificateFactory = null;
        while (k > 0) {
            int k2 = cl_46Var.k();
            cl_46Var.e(k2);
            byte[] bArr = new byte[k2];
            cl_46Var.read(bArr, 0, k2);
            k -= k2 + 3;
            if (certificateFactory == null) {
                try {
                    certificateFactory = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
                } catch (CertificateException e) {
                    throw ((SSLProtocolException) new SSLProtocolException(e.getMessage()).initCause(e));
                }
            }
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArr)));
        }
        this.b = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        cl_62Var.k(c() - 3);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            if (bArr == null) {
                cl_62Var.k(0);
            } else {
                cl_62.c(bArr.length, 16777216);
                cl_62Var.k(bArr.length);
                cl_62Var.write(bArr, 0, bArr.length);
            }
        }
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        if (this.c == null) {
            this.d = 3;
            X509Certificate[] x509CertificateArr = this.b;
            this.c = new ArrayList(x509CertificateArr.length);
            try {
                for (X509Certificate x509Certificate : x509CertificateArr) {
                    byte[] encoded = x509Certificate.getEncoded();
                    this.c.add(encoded);
                    this.d = encoded.length + 3 + this.d;
                }
            } catch (CertificateEncodingException e) {
                this.c = null;
                ny61.n("Could not encode certificates", e);
                return 0;
            }
        }
        return this.d;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** Certificate message\n");
        int i = 0;
        while (true) {
            X509Certificate[] x509CertificateArr = this.b;
            if (i >= x509CertificateArr.length) {
                stringBuffer.append("***\n");
                return stringBuffer.toString();
            }
            stringBuffer.append("chain [");
            stringBuffer.append(i);
            stringBuffer.append("] = ");
            stringBuffer.append(x509CertificateArr[i]);
            stringBuffer.append("\n");
            i++;
        }
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 11;
    }

    public cl_48(X509Certificate[] x509CertificateArr) {
        this.b = x509CertificateArr;
    }
}
