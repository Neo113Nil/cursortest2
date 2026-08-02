package ru.CryptoPro.AdES.service;

import defpackage.ayo;
import defpackage.c2;
import defpackage.d79;
import defpackage.dqf;
import defpackage.e4x0;
import defpackage.ge5;
import defpackage.gzo;
import defpackage.jqf;
import defpackage.l79;
import defpackage.ld3;
import defpackage.ro60;
import defpackage.so60;
import defpackage.to60;
import defpackage.u2;
import defpackage.uo60;
import defpackage.vo60;
import defpackage.wo60;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicLong;
import org.bouncycastle.cert.ocsp.OCSPException;
import ru.CryptoPro.AdES.evidence.CertificateIdentifierCalculator;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.AdES.tools.revocation.connection.ConnectionParameters;
import ru.CryptoPro.AdES.tools.revocation.connection.ConnectionTimeouts;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.logger.LoggingUtils;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes4.dex */
public class OCSPServiceConnectorImpl extends ServiceConnectorImpl<OCSPServiceResponse> implements OCSPConnector {
    private static final AtomicLong sequence = new AtomicLong(System.currentTimeMillis());
    private X509Certificate checkableCertificate;
    private int connectTimeout;
    private X509Certificate issuerCertificate;
    private int readTimeout;

    public OCSPServiceConnectorImpl(String str, ConnectionParameters connectionParameters) {
        super(str);
        ConnectionTimeouts connectionTimeouts;
        this.connectTimeout = -1;
        this.readTimeout = -1;
        if (connectionParameters == null || (connectionTimeouts = connectionParameters.getConnectionTimeouts()) == null) {
            return;
        }
        this.connectTimeout = connectionTimeouts.getConnectTimeout();
        this.readTimeout = connectionTimeouts.getReadTimeout();
    }

    private static byte[] createId(String str, String str2) throws AdESException {
        JCPLogger.fine("Creating ID for nonce...");
        return AdESUtility.calculateDigest(str2, str, (System.currentTimeMillis() + "+" + Runtime.getRuntime().freeMemory() + "+" + sequence.getAndIncrement()).getBytes());
    }

    private so60 generateOCSPRequest() throws OCSPException, IOException, IllegalArgumentException, AdESException {
        JCPLogger.fine("Generating OCSP request...");
        String checkAndGetDigestAlgorithm = AdESUtility.checkAndGetDigestAlgorithm(null, this.provider, this.checkableCertificate.getPublicKey());
        if (checkAndGetDigestAlgorithm == null) {
            throw new AdESException("Digest algorithm has not been found or is not supported by provider " + this.provider, IAdESException.ecInternal);
        }
        JCPLogger.fine("Digest algorithm: ".concat(checkAndGetDigestAlgorithm));
        CertificateIdentifierCalculator certificateIdentifierCalculator = new CertificateIdentifierCalculator(this.checkableCertificate, this.issuerCertificate);
        certificateIdentifierCalculator.setDigestAlgorithm(checkAndGetDigestAlgorithm);
        certificateIdentifierCalculator.setProvider(this.provider);
        l79 fixCertificateID = AdESUtility.fixCertificateID(certificateIdentifierCalculator.make((Void) null), checkAndGetDigestAlgorithm);
        uo60 uo60Var = new uo60();
        to60 to60Var = new to60();
        to60Var.a = fixCertificateID;
        ArrayList arrayList = uo60Var.a;
        arrayList.add(to60Var);
        dqf dqfVar = new dqf(new dqf(Arrays.copyOfRange(createId(checkAndGetDigestAlgorithm, this.provider), 0, 8)).getEncoded());
        u2 u2Var = ro60.b;
        ayo ayoVar = new ayo();
        ayoVar.a = u2Var;
        ayoVar.b = false;
        ayoVar.c = dqfVar;
        gzo gzoVar = new gzo();
        Hashtable hashtable = new Hashtable();
        gzoVar.a = hashtable;
        Vector vector = new Vector();
        gzoVar.b = vector;
        vector.addElement(u2Var);
        hashtable.put(u2Var, ayoVar);
        uo60Var.b = gzoVar;
        Iterator it = arrayList.iterator();
        c2 c2Var = new c2();
        while (it.hasNext()) {
            try {
                d79 d79Var = ((to60) it.next()).a.a;
                ld3 ld3Var = new ld3(2);
                ld3Var.b = d79Var;
                c2Var.a(ld3Var);
            } catch (Exception e) {
                throw new OCSPException("exception creating Request", e);
            }
        }
        jqf jqfVar = new jqf(c2Var);
        gzo gzoVar2 = uo60Var.b;
        e4x0 e4x0Var = new e4x0();
        e4x0Var.a = e4x0.w;
        e4x0Var.b = jqfVar;
        e4x0Var.c = gzoVar2;
        ld3 ld3Var2 = new ld3(1);
        ld3Var2.b = e4x0Var;
        so60 so60Var = new so60();
        so60Var.a = ld3Var2;
        so60Var.b = gzoVar2;
        return so60Var;
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnectorImpl, ru.CryptoPro.AdES.service.ServiceConnector
    public OCSPServiceResponse getEncoded() throws AdESException {
        InputStream inputStream = null;
        try {
            try {
                so60 generateOCSPRequest = generateOCSPRequest();
                byte[] encoded = generateOCSPRequest.a.getEncoded();
                LoggingUtils.logBase64EncodedValue("OCSP request [BASE64]:", encoded);
                InputStream encoded2 = getEncoded(encoded);
                vo60 vo60Var = new vo60(encoded2);
                wo60 wo60Var = vo60Var.a;
                if (JCPLogger.isFinerEnabled()) {
                    LoggingUtils.logBase64EncodedValue("OCSP response [BASE64]:", wo60Var.getEncoded());
                }
                if (wo60Var.a.a.z() == 0) {
                    OCSPServiceResponse oCSPServiceResponse = new OCSPServiceResponse(generateOCSPRequest, (ge5) vo60Var.a());
                    if (encoded2 != null) {
                        try {
                            encoded2.close();
                        } catch (IOException unused) {
                        }
                    }
                    return oCSPServiceResponse;
                }
                throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(this.serviceUrl, "invalid OCSP status: " + wo60Var.a.a.z()), IAdESException.ecOnlineCallFailed);
            } catch (IOException e) {
                throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(this.serviceUrl, e.getMessage()), e, IAdESException.ecOnlineCallFailed);
            } catch (OCSPException e2) {
                throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(this.serviceUrl, e2.getMessage()), e2, IAdESException.ecOnlineCallFailed);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnectorImpl
    public Properties getRequestProperties() {
        Properties properties = new Properties();
        properties.setProperty("Content-Type", "application/ocsp-request");
        properties.setProperty(GlideBitmapDownloader.ACCEPT_HEADER, "application/ocsp-response");
        return properties;
    }

    @Override // ru.CryptoPro.AdES.service.OCSPConnector
    public void setCheckableCertificate(X509Certificate x509Certificate) {
        this.checkableCertificate = x509Certificate;
    }

    @Override // ru.CryptoPro.AdES.service.OCSPConnector
    public void setIssuerCertificate(X509Certificate x509Certificate) {
        this.issuerCertificate = x509Certificate;
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnectorImpl
    public void specifyConnectionParameters(HttpURLConnection httpURLConnection) {
        int i = this.connectTimeout;
        if (i >= 0) {
            httpURLConnection.setConnectTimeout(i);
        }
        int i2 = this.readTimeout;
        if (i2 >= 0) {
            httpURLConnection.setReadTimeout(i2);
        }
    }

    public OCSPServiceConnectorImpl(String str) {
        super(str);
        this.connectTimeout = -1;
        this.readTimeout = -1;
    }
}
