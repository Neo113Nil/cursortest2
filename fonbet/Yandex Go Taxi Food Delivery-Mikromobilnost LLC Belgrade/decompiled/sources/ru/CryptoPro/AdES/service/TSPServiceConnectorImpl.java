package ru.CryptoPro.AdES.service;

import defpackage.ayo;
import defpackage.c490;
import defpackage.fah;
import defpackage.gzo;
import defpackage.hhs0;
import defpackage.i8z0;
import defpackage.izo;
import defpackage.j8z0;
import defpackage.k8z0;
import defpackage.l2;
import defpackage.m8z0;
import defpackage.nt10;
import defpackage.ny61;
import defpackage.rza1;
import defpackage.u2;
import defpackage.w1;
import defpackage.xr1;
import io.appmetrica.analytics.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import org.bouncycastle.tsp.TSPException;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCP.tools.logger.LoggingUtils;

/* loaded from: classes4.dex */
public class TSPServiceConnectorImpl extends ServiceConnectorImpl<TSPServiceResponse> implements TSPConnector {
    protected String digestAlgorithm;
    private byte[] imprint;

    public TSPServiceConnectorImpl(String str) {
        super(str);
    }

    private static String getFailureDescription(int i) {
        if (i == 1) {
            return "the requester's data is incorrect (for notary services)";
        }
        if (i == 2) {
            return "the authority indicated in the request is different from the one creating the response token";
        }
        switch (i) {
            case Integer.MIN_VALUE:
                return "the system is unavailable";
            case 4:
                return "the data submitted has the wrong format";
            case 8:
                return "no certificate could be found matching the provided criteria";
            case 16:
                return "messageTime was not sufficiently close to the system time, as defined by local policy";
            case 32:
                return "bad request";
            case 64:
                return "integrity check failed (e.g., signature did not verify)";
            case 128:
                return "unrecognized or unsupported Algorithm Identifier";
            case 256:
                return "the requested TSA policy is not supported by the TSA";
            case 512:
                return "the TSA's time source is not available";
            case 1024:
                return "bad recipient nonce";
            case 2048:
                return "wrong integrity";
            case 4096:
                return "the certificate is confirmed";
            case 8192:
                return "the certificate is revoked";
            case 16384:
                return "the proof-of-possession failed";
            case 32768:
                return "when the timestamp is missing but should be there (by policy)";
            case 65536:
                return "request is not authorised";
            case 131072:
                return "unsupported version";
            case 262144:
                return "transaction id is in use";
            case 524288:
                return "the signed is not trusted";
            case 1048576:
                return "bad certificate template";
            case 2097152:
                return "bad sender nonce";
            case SelfTester_JCP.ENCRYPT_CBC /* 4194304 */:
                return "the additional information requested could not be understood or is not available";
            case SelfTester_JCP.ENCRYPT_CNT /* 8388608 */:
                return "the requested extension is not supported by the TSA";
            case 536870912:
                return "duplicate certificate request";
            case 1073741824:
                return "the request cannot be handled due to system failure";
            default:
                return "unknown error";
        }
    }

    public j8z0 generateTSPRequest() {
        gzo gzoVar;
        JCPLogger.fine("Generating TSP request...");
        k8z0 k8z0Var = new k8z0();
        k8z0Var.a = w1.w;
        JCPLogger.fine("Digest algorithm: " + this.digestAlgorithm);
        BigInteger valueOf = BigInteger.valueOf(System.currentTimeMillis());
        String str = this.digestAlgorithm;
        byte[] bArr = this.imprint;
        if (str == null) {
            ny61.g("No digest algorithm specified");
            return null;
        }
        u2 u2Var = new u2(str);
        k8z0.c.getClass();
        xr1 b = fah.b(u2Var);
        nt10 nt10Var = new nt10();
        nt10Var.a = b;
        nt10Var.b = rza1.b(bArr);
        izo izoVar = k8z0Var.b;
        if (izoVar.b.isEmpty()) {
            gzoVar = null;
        } else {
            Vector vector = izoVar.b;
            int size = vector.size();
            ayo[] ayoVarArr = new ayo[size];
            for (int i = 0; i != vector.size(); i++) {
                ayoVarArr[i] = (ayo) izoVar.a.get(vector.elementAt(i));
            }
            gzoVar = new gzo();
            gzoVar.a = new Hashtable();
            gzoVar.b = new Vector();
            if (size == 0) {
                ny61.g("extension array cannot be null or empty");
                return null;
            }
            for (int i2 = 0; i2 != size; i2++) {
                ayo ayoVar = ayoVarArr[i2];
                gzoVar.b.addElement(ayoVar.a);
                gzoVar.a.put(ayoVar.a, ayoVar);
            }
        }
        return valueOf != null ? new j8z0(new i8z0(nt10Var, new l2(valueOf), k8z0Var.a, gzoVar)) : new j8z0(new i8z0(nt10Var, null, k8z0Var.a, gzoVar));
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnectorImpl, ru.CryptoPro.AdES.service.ServiceConnector
    public TSPServiceResponse getEncoded() throws AdESException {
        InputStream inputStream = null;
        try {
            try {
                j8z0 generateTSPRequest = generateTSPRequest();
                byte[] encoded = generateTSPRequest.a.getEncoded();
                LoggingUtils.logBase64EncodedValue("TSP request [BASE64]:", encoded);
                InputStream encoded2 = getEncoded(encoded);
                hhs0 hhs0Var = new hhs0(encoded2);
                c490 p = hhs0Var.p();
                int z = p == null ? 0 : p.z();
                if (z != 0) {
                    throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(this.serviceUrl, "service returned tsp status: " + z + Extension.O_BRAKE_SPACE + getFailureDescription(z)), IAdESException.ecOnlineCallFailed);
                }
                hhs0Var.z(generateTSPRequest);
                m8z0 m8z0Var = (m8z0) hhs0Var.c;
                if (m8z0Var == null) {
                    throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(this.serviceUrl, "service not returned timestamp: " + hhs0Var.v()), IAdESException.ecOnlineCallFailed);
                }
                if (JCPLogger.isFinerEnabled()) {
                    LoggingUtils.logBase64EncodedValue("TSP timestamp [BASE64]:", m8z0Var.a.b.getEncoded("DL"));
                }
                TSPServiceResponse tSPServiceResponse = new TSPServiceResponse(m8z0Var);
                if (encoded2 != null) {
                    try {
                        encoded2.close();
                    } catch (IOException unused) {
                    }
                }
                return tSPServiceResponse;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(this.serviceUrl, e.getMessage()), e, IAdESException.ecOnlineCallFailed);
        } catch (TSPException e2) {
            throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(this.serviceUrl, e2.getMessage()), e2, IAdESException.ecOnlineCallFailed);
        }
    }

    @Override // ru.CryptoPro.AdES.service.ServiceConnectorImpl
    public Properties getRequestProperties() {
        Properties properties = new Properties();
        properties.setProperty("Content-Type", "application/timestamp-query");
        properties.setProperty("Content-Transfer-Encoding", BuildConfig.SDK_DEPENDENCY);
        return properties;
    }

    @Override // ru.CryptoPro.AdES.service.TSPConnector, ru.CryptoPro.AdES.tools.DigestUtility
    public void setDigestAlgorithm(String str) {
        this.digestAlgorithm = str;
    }

    @Override // ru.CryptoPro.AdES.service.TSPConnector
    public void setImprint(byte[] bArr) {
        this.imprint = Array.copy(bArr);
    }
}
