package ru.CryptoPro.JCPRequest.ca20.request;

import java.io.IOException;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import ru.CryptoPro.JCPRequest.GostCertificateRequest;
import ru.CryptoPro.JCPRequest.ca15.request.CA15RootRequest;
import ru.CryptoPro.JCPRequest.ca15.tools.Utility;
import ru.CryptoPro.JCPRequest.ca20.decoder.CA20CertificateRecord;
import ru.CryptoPro.JCPRequest.ca20.decoder.CA20CertificateRequestRecord;
import ru.CryptoPro.JCPRequest.ca20.decoder.CA20RevocationRecord;
import ru.CryptoPro.JCPRequest.ca20.status.CA20RequestStatus;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCPRequest.ca20.user.CA20User;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes4.dex */
public class CA20GostCertificateRequest extends GostCertificateRequest {

    /* renamed from: ru.CryptoPro.JCPRequest.ca20.request.CA20GostCertificateRequest$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AcquiredListType.values().length];
            a = iArr;
            try {
                iArr[AcquiredListType.ltRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AcquiredListType.ltCertificate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AcquiredListType.ltRevocation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AcquiredListType {
        private static final /* synthetic */ AcquiredListType[] $VALUES;
        public static final AcquiredListType ltCertificate;
        public static final AcquiredListType ltRequest;
        public static final AcquiredListType ltRevocation;

        static {
            AcquiredListType acquiredListType = new AcquiredListType("ltRequest", 0);
            ltRequest = acquiredListType;
            AcquiredListType acquiredListType2 = new AcquiredListType("ltCertificate", 1);
            ltCertificate = acquiredListType2;
            AcquiredListType acquiredListType3 = new AcquiredListType("ltRevocation", 2);
            ltRevocation = acquiredListType3;
            $VALUES = new AcquiredListType[]{acquiredListType, acquiredListType2, acquiredListType3};
        }

        public static AcquiredListType valueOf(String str) {
            return (AcquiredListType) Enum.valueOf(AcquiredListType.class, str);
        }

        public static AcquiredListType[] values() {
            return (AcquiredListType[]) $VALUES.clone();
        }
    }

    public CA20GostCertificateRequest() throws IOException {
    }

    public static CA20RequestStatus checkCertificateStatus(String str, CA20User cA20User, String str2) throws Exception {
        Properties JSON_HEADERS = Utility.JSON_HEADERS();
        cA20User.putBasicAuthorization(JSON_HEADERS);
        JSONObject jSONObject = new JSONObject(new JSONTokener(new String(GostCertificateRequest.httpGetFile(str + cA20User.getUrlApiPart() + "/certrequest/" + str2, cA20User, JSON_HEADERS), "UTF-8"))).getJSONObject("CertRequest");
        return new CA20RequestStatus(jSONObject.getString("CertRequestId"), jSONObject.getString("Status"));
    }

    public static void e(byte[] bArr, Vector vector, AcquiredListType acquiredListType, String str, String str2) {
        Object cA20CertificateRequestRecord;
        JSONArray jSONArray = new JSONObject(new JSONTokener(new String(bArr, "UTF-8"))).getJSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString(str2);
            String string2 = jSONObject.getString("UserId");
            String string3 = jSONObject.getString("Status");
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equalsIgnoreCase(str2) && !next.equalsIgnoreCase("UserId") && !next.equalsIgnoreCase("Status")) {
                    hashMap.put(next, jSONObject.get(next).equals(JSONObject.NULL) ? null : jSONObject.getString(next));
                }
            }
            int i2 = AnonymousClass1.a[acquiredListType.ordinal()];
            if (i2 == 1) {
                cA20CertificateRequestRecord = new CA20CertificateRequestRecord(string, string2, string3, hashMap);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    vector.add(new CA20RevocationRecord(jSONObject.getString("RevRequestId"), string, string2, string3, hashMap));
                }
            } else {
                cA20CertificateRequestRecord = new CA20CertificateRecord(string, string2, string3, hashMap);
            }
            vector.add(cA20CertificateRequestRecord);
        }
    }

    public static byte[] getCertificateByRequestId(String str, CA20User cA20User, String str2) throws Exception {
        Properties JSON_HEADERS = Utility.JSON_HEADERS();
        cA20User.putBasicAuthorization(JSON_HEADERS);
        return GostCertificateRequest.httpGetFile(str + cA20User.getUrlApiPart() + "/certrequest/" + str2 + "/rawcert", cA20User, JSON_HEADERS);
    }

    public static Vector getCertificateList(String str, CA20User cA20User) throws Exception {
        Properties JSON_HEADERS = Utility.JSON_HEADERS();
        cA20User.putBasicAuthorization(JSON_HEADERS);
        byte[] httpGetFile = GostCertificateRequest.httpGetFile(str + cA20User.getUrlApiPart() + "/certificate", cA20User, JSON_HEADERS);
        Vector vector = new Vector();
        e(httpGetFile, vector, AcquiredListType.ltCertificate, "Certificate", "CertId");
        return vector;
    }

    public static Vector getCertificateRequestList(String str, CA20User cA20User) throws Exception {
        Properties JSON_HEADERS = Utility.JSON_HEADERS();
        cA20User.putBasicAuthorization(JSON_HEADERS);
        byte[] httpGetFile = GostCertificateRequest.httpGetFile(str + cA20User.getUrlApiPart() + "/certrequest", cA20User, JSON_HEADERS);
        Vector vector = new Vector();
        e(httpGetFile, vector, AcquiredListType.ltRequest, "CertRequest", "CertRequestId");
        return vector;
    }

    public static Vector getRequestRevocationList(String str, CA20User cA20User) throws Exception {
        Properties JSON_HEADERS = Utility.JSON_HEADERS();
        cA20User.putBasicAuthorization(JSON_HEADERS);
        byte[] httpGetFile = GostCertificateRequest.httpGetFile(str + cA20User.getUrlApiPart() + "/revrequest", cA20User, JSON_HEADERS);
        Vector vector = new Vector();
        e(httpGetFile, vector, AcquiredListType.ltRevocation, "RevokeRequest", "RevRequestId");
        return vector;
    }

    public static Certificate[] getRootCertList(String str) throws Exception {
        return CA15RootRequest.getRootCertList(str + "/api/cacertificate", false, false);
    }

    public static CA20RequestStatus markCertificateInstalled(String str, CA20User cA20User, String str2) throws Exception {
        Properties JSON_HEADERS = Utility.JSON_HEADERS();
        cA20User.putBasicAuthorization(JSON_HEADERS);
        String str3 = cA20User.getUrlApiPart() + "/certrequest/" + str2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Status", CA20Status.STATUS_REQUEST_K);
        JSONObject jSONObject2 = new JSONObject(new JSONTokener(Utility.getHttpPostFile(str, str3, cA20User, JSON_HEADERS, null, jSONObject.toString().getBytes("UTF-8")))).getJSONObject("CertRequest");
        return new CA20RequestStatus(jSONObject2.getString("CertRequestId"), jSONObject2.getString("Status"));
    }

    public static CA20RequestStatus sendCertificateRequest(String str, CA20User cA20User, byte[] bArr) throws Exception {
        Properties properties = new Properties();
        properties.put(ExtFunctionsKt.HEADER_USER_AGENT, Utility.USER_AGENT);
        properties.put("Content-Type", "application/octet-stream");
        cA20User.putBasicAuthorization(properties);
        JSONObject jSONObject = new JSONObject(new JSONTokener(Utility.getHttpPostFile(str, cA20User.getUrlApiPart() + "/certrequest", cA20User, properties, null, bArr))).getJSONObject("CertRequest");
        return new CA20RequestStatus(jSONObject.getString("CertRequestId"), jSONObject.getString("Status"));
    }

    public CA20GostCertificateRequest(String str) throws IOException {
        super(str);
    }

    public CA20RequestStatus sendCertificateRequest(String str, CA20User cA20User) throws Exception {
        byte[] bArr = this.encoded;
        if (bArr != null) {
            return sendCertificateRequest(str, cA20User, bArr);
        }
        throw new SignatureException(GostCertificateRequest.resource.getString("NO_SIGNED"));
    }
}
