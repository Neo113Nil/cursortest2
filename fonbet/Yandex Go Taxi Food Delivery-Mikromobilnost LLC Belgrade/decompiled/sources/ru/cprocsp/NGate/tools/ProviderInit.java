package ru.cprocsp.NGate.tools;

import java.security.KeyStore;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.List;
import ru.CryptoPro.JCP.KeyStore.InvalidPasswordException;
import ru.CryptoPro.JCP.KeyStore.JCPPrivateKeyEntry;
import ru.CryptoPro.JCP.KeyStore.NoSuchCarrierException;
import ru.CryptoPro.JCP.KeyStore.StoreInputStream;
import ru.CryptoPro.JCP.params.JCPProtectionParameter;
import ru.CryptoPro.JCP.params.JCPProtectionParameterInfo;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.cprocsp.NGate.tools.log.Logger;

/* loaded from: classes4.dex */
public class ProviderInit implements Constants {

    public enum CheckLevel {
        clDefault,
        clKeyStoreAvailability,
        clKeyContainerAvailability,
        clFull
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[Catch: Exception -> 0x002a, TryCatch #2 {Exception -> 0x002a, blocks: (B:3:0x000e, B:5:0x0024, B:8:0x002d, B:10:0x003f, B:12:0x0043, B:15:0x0047, B:17:0x005b, B:19:0x0061, B:21:0x0082, B:24:0x0099, B:28:0x009f, B:30:0x00a5, B:31:0x00a9, B:33:0x00b1, B:36:0x00b6, B:38:0x00c9, B:40:0x0109, B:42:0x0111, B:44:0x0116, B:47:0x011e, B:49:0x012b, B:51:0x0131, B:54:0x013d, B:55:0x0140, B:62:0x0149, B:59:0x0150, B:64:0x0156, B:68:0x015d, B:70:0x00d5, B:71:0x00e7), top: B:2:0x000e, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111 A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #2 {Exception -> 0x002a, blocks: (B:3:0x000e, B:5:0x0024, B:8:0x002d, B:10:0x003f, B:12:0x0043, B:15:0x0047, B:17:0x005b, B:19:0x0061, B:21:0x0082, B:24:0x0099, B:28:0x009f, B:30:0x00a5, B:31:0x00a9, B:33:0x00b1, B:36:0x00b6, B:38:0x00c9, B:40:0x0109, B:42:0x0111, B:44:0x0116, B:47:0x011e, B:49:0x012b, B:51:0x0131, B:54:0x013d, B:55:0x0140, B:62:0x0149, B:59:0x0150, B:64:0x0156, B:68:0x015d, B:70:0x00d5, B:71:0x00e7), top: B:2:0x000e, inners: #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int check(String str, String str2, String str3, CheckLevel checkLevel) {
        X509Certificate x509Certificate;
        try {
            Logger.d("Checking availability of key store " + str + "...");
            if (str == null) {
                Logger.e("Key store type must be set.");
                return 1006;
            }
            KeyStore keyStore = KeyStore.getInstance(str, "JCSP");
            keyStore.load(new CSPStore.FailIfNotAvailableStoreParameter());
            CheckLevel checkLevel2 = CheckLevel.clDefault;
            if (checkLevel != checkLevel2 && checkLevel != CheckLevel.clKeyContainerAvailability && checkLevel != CheckLevel.clFull) {
                return 1280;
            }
            Logger.d("Opening key container " + str2 + "...");
            if (str2 == null) {
                Logger.e("Key alias must be set.");
                return 1006;
            }
            char[] cArr = null;
            keyStore.load(new StoreInputStream(str2), null);
            Logger.d("Checking availability of key container " + str2 + "...");
            if (!keyStore.containsAlias(str2)) {
                Logger.e("Key container " + str2 + " not found.");
                return Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND;
            }
            if (checkLevel != checkLevel2 && checkLevel != CheckLevel.clFull) {
                return 1280;
            }
            if (str3 != null && str3.length() > 0) {
                cArr = str3.toCharArray();
            }
            JCPProtectionParameter jCPProtectionParameter = new JCPProtectionParameter(cArr, true, true);
            if (cArr == null && checkLevel != CheckLevel.clFull) {
                Logger.d("Getting information about key container...");
                JCPProtectionParameterInfo jCPProtectionParameterInfo = new JCPProtectionParameterInfo();
                keyStore.getEntry(str2, jCPProtectionParameterInfo);
                if (jCPProtectionParameterInfo.isNeedPassword()) {
                    Logger.d("Getting certificate...");
                    x509Certificate = (X509Certificate) keyStore.getCertificate(str2);
                } else {
                    Logger.d("Getting private key and certificate...");
                    x509Certificate = (X509Certificate) ((JCPPrivateKeyEntry) keyStore.getEntry(str2, jCPProtectionParameter)).getCertificate();
                }
                if (x509Certificate != null) {
                    Logger.e("Certificate not found in the key container.");
                    return 1002;
                }
                Logger.d("Checking extended key usage of the certificate...");
                try {
                    List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
                    if (extendedKeyUsage == null) {
                        Logger.e("Extended key usage not found.");
                        return 1003;
                    }
                    Logger.d("Extended key usage found, validating client policy 1.3.6.1.5.5.7.3.2...");
                    if (!extendedKeyUsage.contains("1.3.6.1.5.5.7.3.2")) {
                        Logger.e("No valid extended key usage found.");
                        return 1003;
                    }
                    Logger.d("Client policy found.");
                    Logger.d("Checking certificate dates...");
                    try {
                        x509Certificate.checkValidity();
                        Logger.d("Certificate accepted.");
                        return 1280;
                    } catch (CertificateExpiredException e) {
                        Logger.e("Certificate expired.", e);
                        return 1007;
                    } catch (CertificateNotYetValidException e2) {
                        Logger.e("Certificate not yet valid.", e2);
                        return 1007;
                    }
                } catch (CertificateParsingException e3) {
                    Logger.e("Certificate decoding failed", e3);
                    return 1005;
                }
            }
            Logger.d("Getting private key and certificate (check level = " + checkLevel + ")...");
            x509Certificate = (X509Certificate) ((JCPPrivateKeyEntry) keyStore.getEntry(str2, jCPProtectionParameter)).getCertificate();
            if (x509Certificate != null) {
            }
        } catch (Exception e4) {
            Logger.e("Error occurred during check of the key container", e4);
            if (e4 instanceof NoSuchCarrierException) {
                Logger.e("Carrier not found.");
                return Constants.RESULT_CHECK_ERROR_CARRIER_NOT_FOUND;
            }
            if (e4 instanceof InvalidPasswordException) {
                Logger.e("Invalid password.");
                return 1001;
            }
            if (e4 instanceof UnrecoverableEntryException) {
                Logger.e("Private key not found.");
                return Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND;
            }
            Logger.e("Unknown error occurred during check of key container.");
            return 1004;
        }
    }
}
