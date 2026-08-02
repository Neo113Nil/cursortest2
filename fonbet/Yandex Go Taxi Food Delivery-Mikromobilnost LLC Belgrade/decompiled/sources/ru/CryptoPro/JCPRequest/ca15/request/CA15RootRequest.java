package ru.CryptoPro.JCPRequest.ca15.request;

import com.objsys.asn1j.runtime.Asn1Exception;
import defpackage.ny61;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import ru.CryptoPro.JCPRequest.CertChainLoader;
import ru.CryptoPro.JCPRequest.GostCertificateRequest;
import ru.CryptoPro.JCPRequest.ca15.decoder.HTMLPageDecoder;
import ru.CryptoPro.JCPRequest.ca15.user.CAUser;

/* loaded from: classes4.dex */
public class CA15RootRequest {
    public static Certificate[] getRootCertList(String str, boolean z, boolean z2) throws Exception {
        byte[] httpGetFile = GostCertificateRequest.httpGetFile(str, CAUser.NULL);
        if (httpGetFile == null) {
            ny61.v("Empty P7B list.");
            return null;
        }
        if (z) {
            httpGetFile = HTMLPageDecoder.decodeP7B(httpGetFile, z2);
        }
        try {
            return CertChainLoader.loadChain(httpGetFile);
        } catch (Asn1Exception e) {
            IOException iOException = new IOException("ASN.1 exception when encode certificate chain.");
            iOException.initCause(e);
            throw iOException;
        } catch (CertificateException e2) {
            IOException iOException2 = new IOException("Certificate invalid format.");
            iOException2.initCause(e2);
            throw iOException2;
        }
    }
}
