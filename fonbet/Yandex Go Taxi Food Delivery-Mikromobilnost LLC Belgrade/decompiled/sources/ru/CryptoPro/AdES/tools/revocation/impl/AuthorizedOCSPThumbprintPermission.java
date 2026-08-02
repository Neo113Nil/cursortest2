package ru.CryptoPro.AdES.tools.revocation.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingPermissionData;
import ru.CryptoPro.AdES.tools.revocation.permission.RevocationPermission;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class AuthorizedOCSPThumbprintPermission implements RevocationPermission {
    public static final String OCSP_AUTHORIZED_THUMBPRINTS = GetProperty.getStringProperty("ru.CryptoPro.AdES.ocsp.authorizedOCSPs", null);
    public static final String OCSP_AUTHORIZED_SEPARATOR = GetProperty.getStringProperty("ru.CryptoPro.AdES.ocsp.separator", null);
    private static final List<String> AUTHORIZED_THUMBPRINTS = readAuthorizedOCSPThumbprints();

    private static byte[] calculateThumbprint(X509Certificate x509Certificate) throws NoSuchAlgorithmException, CertificateEncodingException {
        return MessageDigest.getInstance("SHA-1").digest(x509Certificate.getEncoded());
    }

    private static List<String> readAuthorizedOCSPThumbprints() {
        ArrayList arrayList = new ArrayList();
        String str = OCSP_AUTHORIZED_THUMBPRINTS;
        if (str != null) {
            String str2 = OCSP_AUTHORIZED_SEPARATOR;
            if (str2 == null) {
                str2 = ",";
            }
            arrayList.addAll(Arrays.asList(str.toLowerCase().split(str2)));
        }
        return arrayList;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.permission.RevocationPermission
    public boolean isAuthorizedIssuer(ValidatingPermissionData validatingPermissionData) {
        List<String> list = AUTHORIZED_THUMBPRINTS;
        if (list.isEmpty()) {
            return false;
        }
        try {
            return list.contains(HexString.toHexNoSpaces(calculateThumbprint(validatingPermissionData.getValidatingRevocationData().getCertificate())).toLowerCase());
        } catch (NoSuchAlgorithmException | CertificateEncodingException e) {
            JCPLogger.thrown(e);
            return false;
        }
    }
}
