package com.fillr.browsersdk.tls;

import android.text.TextUtils;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.tls.asn1.ASN1Null;
import com.fillr.browsersdk.tls.asn1.ASN1ObjectId;
import com.fillr.browsersdk.tls.asn1.ASN1Time;
import com.fillr.browsersdk.tls.asn1.ASN1UtfString;
import com.fillr.browsersdk.tls.asn1.complextypes.PublicKeyInfo;
import com.fillr.browsersdk.tls.asn1.complextypes.SSLCertificate;
import com.fillr.browsersdk.tls.asn1.complextypes.TBSCertificate;
import com.fillr.browsersdk.tls.asn1.complextypes.Validity;
import java.math.BigInteger;
import java.security.KeyPair;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class CertificateRegistry {
    public static final String[] BANNED_HOSTS = {"^(api|ft|schema)\\.fillr\\.com", "^rakuten\\.co\\.jp$", ".*\\.rakuten\\.co\\.jp$"};
    public static final Map GENERATED_CERTS = Collections.synchronizedMap(new HashMap());

    public static SSLCertificate generateSelfSignedCertificate(String str, KeyPair keyPair) {
        if (TextUtils.isEmpty(str) || keyPair == null) {
            return null;
        }
        for (int i = 0; i < 3; i++) {
            if (str.matches(BANNED_HOSTS[i])) {
                return null;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            str.startsWith("*.");
        }
        SSLCertificate whitelistedCertificate = getWhitelistedCertificate(str);
        if (whitelistedCertificate != null) {
            return whitelistedCertificate;
        }
        if (TextUtils.isEmpty(str)) {
            str = "FillrCA";
        }
        String str2 = str;
        UUID randomUUID = UUID.randomUUID();
        BigInteger or = BigInteger.valueOf(randomUUID.getMostSignificantBits()).shiftLeft(64).or(BigInteger.valueOf(randomUUID.getLeastSignificantBits()));
        if (or.signum() < 1) {
            or = or.negate();
        }
        ASN1ObjectId aSN1ObjectId = new ASN1ObjectId(ASN1ObjectId.SHA256_WITH_RSA);
        Validity validity = new Validity(1);
        validity.notBefore = aSN1ObjectId;
        validity.notAfter = new ASN1Null();
        byte[] encoded = keyPair.getPublic().getEncoded();
        PublicKeyInfo publicKeyInfo = new PublicKeyInfo();
        publicKeyInfo.preformattedData = encoded;
        SSLCertificate sSLCertificate = new SSLCertificate(or, validity, publicKeyInfo, keyPair);
        TBSCertificate tBSCertificate = sSLCertificate.tbsCert;
        String bigInteger = ((BigInteger) tBSCertificate.serialNumber.date).toString(16);
        ASN1ObjectId aSN1ObjectId2 = tBSCertificate.issuer;
        aSN1ObjectId2.valueChain.clear();
        ASN1Time aSN1Time = new ASN1Time();
        int[] iArr = ASN1ObjectId.COMMON_NAME;
        ((HashSet) aSN1Time.date).add(new Validity(new ASN1ObjectId(iArr), new ASN1UtfString(str)));
        aSN1ObjectId2.addValue(aSN1Time);
        if (!TextUtils.isEmpty(bigInteger)) {
            ASN1Time aSN1Time2 = new ASN1Time();
            ((HashSet) aSN1Time2.date).add(new Validity(new ASN1ObjectId(ASN1ObjectId.ORGANIZATIONAL_UNIT), new ASN1UtfString(bigInteger)));
            aSN1ObjectId2.addValue(aSN1Time2);
        }
        ASN1ObjectId aSN1ObjectId3 = tBSCertificate.subject;
        aSN1ObjectId3.valueChain.clear();
        ASN1Time aSN1Time3 = new ASN1Time();
        ((HashSet) aSN1Time3.date).add(new Validity(new ASN1ObjectId(iArr), new ASN1UtfString(str2)));
        aSN1ObjectId3.addValue(aSN1Time3);
        ((BigInteger) tBSCertificate.serialNumber.date).toString(16);
        SVG svg = Fillr.getInstance().fillrConfig;
        GENERATED_CERTS.put(str2, sSLCertificate);
        SVG svg2 = Fillr.getInstance().fillrConfig;
        return sSLCertificate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r3 <= r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SSLCertificate getWhitelistedCertificate(String str) {
        Validity validity;
        if (!TextUtils.isEmpty(str)) {
            str.startsWith("*.");
        }
        Map map = GENERATED_CERTS;
        SSLCertificate sSLCertificate = (SSLCertificate) map.get(str);
        SVG svg = Fillr.getInstance().fillrConfig;
        if (sSLCertificate != null) {
            TBSCertificate tBSCertificate = sSLCertificate.tbsCert;
            if (tBSCertificate != null && (validity = tBSCertificate.validity) != null) {
                ASN1Time aSN1Time = (ASN1Time) validity.notAfter;
                ASN1Time aSN1Time2 = (ASN1Time) validity.notBefore;
                if (aSN1Time2 != null && aSN1Time != null) {
                    long time = new Date().getTime();
                    long time2 = ((Date) aSN1Time2.date).getTime();
                    long time3 = ((Date) aSN1Time.date).getTime();
                    if (time >= time2) {
                    }
                }
            }
            map.remove(str);
            SVG svg2 = Fillr.getInstance().fillrConfig;
        }
        return (SSLCertificate) map.get(str);
    }
}
