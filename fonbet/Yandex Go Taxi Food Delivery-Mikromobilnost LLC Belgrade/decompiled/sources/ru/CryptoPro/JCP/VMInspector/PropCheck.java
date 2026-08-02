package ru.CryptoPro.JCP.VMInspector;

import defpackage.d7g0;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.util.prefs.Preferences;
import ru.CryptoPro.JCP.Util.PaneDefaultProvider;
import ru.CryptoPro.JCP.tools.Decoder;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.JCP.tools.License;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class PropCheck {
    private static final String CHARSET = "UTF-8";
    private static final String PREF_JCSP_NAME = "License";
    private static final String PREF_NAME = "License_class_license_2_0";
    private static final String SAMPLE_CONTAINER_NAME = "GOST3410DHEL";
    private static final String TEST_TEXT = "This is message, length=32 bytes";
    private static final String prefs = "/ru/CryptoPro/JCSP";

    private PropCheck() {
    }

    private static void checkProvider() throws Exception {
        String defaultDigestSignatureProvider = PaneDefaultProvider.getDefaultDigestSignatureProvider(null);
        String simpleStoreName = PaneDefaultProvider.getSimpleStoreName(null);
        KeyStore keyStore = KeyStore.getInstance(simpleStoreName, defaultDigestSignatureProvider);
        Inspector.print("Read key container: GOST3410DHEL");
        Inspector.print("Use store: " + simpleStoreName);
        keyStore.load(null, null);
        PrivateKey privateKey = (PrivateKey) keyStore.getKey("GOST3410DHEL", null);
        if (privateKey == null) {
            Inspector.print("Container not found!");
            d7g0.i();
            return;
        }
        PublicKey publicKey = keyStore.getCertificate("GOST3410DHEL").getPublicKey();
        Signature signature = Signature.getInstance("GOST3411withGOST3410EL", defaultDigestSignatureProvider);
        signature.initSign(privateKey);
        signature.update("This is message, length=32 bytes".getBytes("UTF-8"));
        byte[] sign = signature.sign();
        signature.initVerify(publicKey);
        signature.update("This is message, length=32 bytes".getBytes("UTF-8"));
        if (!signature.verify(sign)) {
            d7g0.i();
            return;
        }
        sign[0] = (byte) (sign[0] + 1);
        signature.initVerify(publicKey);
        signature.update("This is message, length=32 bytes".getBytes("UTF-8"));
        if (signature.verify(sign)) {
            d7g0.i();
        }
    }

    /* JADX WARN: Finally extract failed */
    public static void main(String[] strArr) throws Exception {
        try {
            String defaultDigestSignatureProvider = PaneDefaultProvider.getDefaultDigestSignatureProvider(null);
            if (defaultDigestSignatureProvider == null) {
                Inspector.print("No JCP/JavaCSP registered");
                return;
            }
            boolean equals = defaultDigestSignatureProvider.equals("JCP");
            if (!equals && !Platform.isServerPlatform()) {
                Inspector.print("Warning: this test expects a failure if invalid license was set. Now default provider is Java CSP and it checks its license only if it is being used on server OS but this OS is client, so the test will not work as expected. If you check Java CSP run the example on server OS.");
            }
            Inspector.print("Operability verify.");
            checkProvider();
            Inspector.print("Licence reading.");
            Preferences systemNodeForPackage = Preferences.systemNodeForPackage(equals ? License.class : Security.getProvider("JCSP").getClass());
            String str = PREF_JCSP_NAME;
            String str2 = systemNodeForPackage.get(equals ? "License_class_license_2_0" : PREF_JCSP_NAME, null);
            byte[] decodeBuffer = new Decoder().decodeBuffer(str2);
            try {
                Inspector.print("Licence garble.");
                boolean z = true;
                int length = decodeBuffer.length - 1;
                decodeBuffer[length] = (byte) (decodeBuffer[length] + 1);
                Inspector.print("Save garble licence.");
                systemNodeForPackage.put(equals ? "License_class_license_2_0" : PREF_JCSP_NAME, new Encoder().encode(decodeBuffer));
                Inspector.print("Run Provider with garble licence.");
                try {
                    checkProvider();
                    z = false;
                } catch (Exception e) {
                    Inspector.print("Provider don't work...");
                    Inspector.print(e);
                }
                Inspector.print("Licence restore.");
                if (equals) {
                    str = "License_class_license_2_0";
                }
                systemNodeForPackage.put(str, str2);
                Inspector.print("Provider operability verify.");
                checkProvider();
                Inspector.print(z ? Inspector.STR_TEST_PASSED : Inspector.STR_TEST_FAILED);
            } catch (Throwable th) {
                Inspector.print("Licence restore.");
                if (equals) {
                    str = "License_class_license_2_0";
                }
                systemNodeForPackage.put(str, str2);
                throw th;
            }
        } catch (Exception e2) {
            Inspector.print(e2);
        }
    }
}
