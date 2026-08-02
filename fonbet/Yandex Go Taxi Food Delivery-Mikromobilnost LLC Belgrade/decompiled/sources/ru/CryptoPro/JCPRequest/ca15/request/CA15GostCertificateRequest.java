package ru.CryptoPro.JCPRequest.ca15.request;

import defpackage.ny61;
import defpackage.oyr;
import io.appmetrica.analytics.UserInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.util.Map;
import java.util.Properties;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.JCPRequest.GostCertificateRequest;
import ru.CryptoPro.JCPRequest.ca15.decoder.CA15CertificateRequestRecord;
import ru.CryptoPro.JCPRequest.ca15.decoder.HTMLPageDecoder;
import ru.CryptoPro.JCPRequest.ca15.status.CA15RequestStatus;
import ru.CryptoPro.JCPRequest.ca15.tools.Utility;
import ru.CryptoPro.JCPRequest.ca15.user.CA15User;

/* loaded from: classes4.dex */
public class CA15GostCertificateRequest extends GostCertificateRequest {
    public static final String TEST_CA15_HTTPS_ADDRESS = "https://www.cryptopro.ru:5555/ui";
    public static final String TEST_CA15_HTTP_ADDRESS = "http://www.cryptopro.ru/ui";

    public CA15GostCertificateRequest() throws IOException {
    }

    public static CA15RequestStatus checkCertificateStatus(String str, CA15User cA15User, String str2) throws Exception {
        for (CA15CertificateRequestRecord cA15CertificateRequestRecord : getCertificateRequestList(str, cA15User).values()) {
            if (cA15CertificateRequestRecord.getCertificateRequestIdentifier().equalsIgnoreCase(str2)) {
                return new CA15RequestStatus(cA15CertificateRequestRecord.getStatus().getValue(), str2);
            }
        }
        ny61.v(oyr.p("Request with identifier ", str2, " is not found into the request table."));
        return null;
    }

    public static byte[] getCertificateByRequestId(String str, CA15User cA15User, String str2) throws Exception {
        Properties properties = new Properties();
        properties.put("ConfirmReq_" + str2, "NoText");
        properties.put("TokenID", cA15User.getTokenID());
        properties.put("Password", cA15User.getPassword());
        return HTMLPageDecoder.decodeCertificate(Utility.getHttpPostFileUsingProps(str, "/Register/RegInstallCert.asp", cA15User, properties));
    }

    public static String getCertificateRequestId(String str, CA15User cA15User, String str2) throws Exception {
        String cleanCertificateRequest = Utility.cleanCertificateRequest(HTMLPageDecoder.decodeCertificateRequest(str2));
        for (CA15CertificateRequestRecord cA15CertificateRequestRecord : getCertificateRequestList(str, cA15User).values()) {
            if (cA15CertificateRequestRecord.getPkcs10().equalsIgnoreCase(cleanCertificateRequest)) {
                return cA15CertificateRequestRecord.getCertificateRequestIdentifier();
            }
        }
        ny61.v("Request identifier is not found into the request table.");
        return null;
    }

    public static Map getCertificateRequestList(String str, CA15User cA15User) throws Exception {
        Properties properties = new Properties();
        properties.put("TokenID", cA15User.getTokenID());
        properties.put("Password", cA15User.getPassword());
        return HTMLPageDecoder.decodeCertificateRequestTable(Utility.getHttpPostFileUsingProps(str, "/Register/RegTemporaryUser.asp", cA15User, properties));
    }

    public static Certificate[] getRootCertList(String str, boolean z) throws Exception {
        StringBuilder v = oyr.v(str, "/certnew.asp?Type=chain&Enc=");
        v.append(z ? "b64" : "bin");
        return CA15RootRequest.getRootCertList(v.toString(), true, z);
    }

    public static CA15RequestStatus sendCertificateRequestB64(String str, CA15User cA15User, byte[] bArr) throws Exception {
        String str2 = "-----BEGIN NEW CERTIFICATE REQUEST-----\n" + new String(bArr) + "\n-----END NEW CERTIFICATE REQUEST-----";
        Properties properties = new Properties();
        properties.put("PKCS10", URLEncoder.encode(str2, "UTF-8"));
        properties.put(UserInfo.TAG, "");
        properties.put("TokenID", cA15User.getTokenID());
        properties.put("Password", cA15User.getPassword());
        String httpPostFileUsingProps = Utility.getHttpPostFileUsingProps(str, "/Register/RegSubmitCertRequest.asp", cA15User, properties);
        try {
            return new CA15RequestStatus(0, HTMLPageDecoder.decodeRequestIdentifier(httpPostFileUsingProps));
        } catch (Exception unused) {
            return HTMLPageDecoder.decodeCertificateRequest(httpPostFileUsingProps) == null ? new CA15RequestStatus(-1, null) : new CA15RequestStatus(1, getCertificateRequestId(str, cA15User, httpPostFileUsingProps));
        }
    }

    public CA15RequestStatus sendCertificateRequest(String str, CA15User cA15User) throws Exception {
        if (this.encoded == null) {
            throw new SignatureException(GostCertificateRequest.resource.getString("NO_SIGNED"));
        }
        Encoder encoder = new Encoder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encoder.encode(this.encoded, byteArrayOutputStream);
        return sendCertificateRequestB64(str, cA15User, byteArrayOutputStream.toByteArray());
    }

    public CA15GostCertificateRequest(String str) throws IOException {
        super(str);
    }

    public static Certificate[] getRootCertList(String str) throws Exception {
        return getRootCertList(str, false);
    }
}
