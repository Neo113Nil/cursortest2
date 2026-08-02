package ru.CryptoPro.sspiSSL;

import defpackage.dx61;
import defpackage.kbs;
import defpackage.ny61;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.cert.PKIXBuilderParameters;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;
import ru.CryptoPro.ssl.JavaTLSCertPathManagerParameters;
import ru.CryptoPro.ssl.JavaTLSKeyStoreParameter;

/* loaded from: classes4.dex */
abstract class KeyManagerFactoryImpl extends KeyManagerFactorySpi {
    public dx61 a;
    public boolean b;

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public final KeyManager[] engineGetKeyManagers() {
        if (this.b) {
            return new KeyManager[]{this.a};
        }
        ny61.r("KeyManagerFactoryImpl is not initialized");
        return null;
    }

    public final class GostX509 extends KeyManagerFactoryImpl {
        @Override // javax.net.ssl.KeyManagerFactorySpi
        public final void engineInit(ManagerFactoryParameters managerFactoryParameters) {
            PKIXBuilderParameters pKIXBuilderParameters;
            boolean z;
            boolean z2;
            if (!(managerFactoryParameters instanceof JavaTLSCertPathManagerParameters) && !(managerFactoryParameters instanceof JavaTLSKeyStoreParameter)) {
                kbs.t("GostX509KeyManager does not use valid ManagerFactoryParameters");
                return;
            }
            JavaTLSKeyStoreParameter javaTLSKeyStoreParameter = (JavaTLSKeyStoreParameter) managerFactoryParameters;
            if (javaTLSKeyStoreParameter instanceof JavaTLSCertPathManagerParameters) {
                JavaTLSCertPathManagerParameters javaTLSCertPathManagerParameters = (JavaTLSCertPathManagerParameters) javaTLSKeyStoreParameter;
                pKIXBuilderParameters = javaTLSCertPathManagerParameters.getParameters();
                z = javaTLSCertPathManagerParameters.isTlsClientDisableIssuerCheck();
                z2 = javaTLSCertPathManagerParameters.isTlsClientCertPathCheck();
            } else {
                pKIXBuilderParameters = null;
                z = false;
                z2 = true;
            }
            try {
                this.a = new dx61(javaTLSKeyStoreParameter.getKeyStore(), javaTLSKeyStoreParameter.getPassword(), javaTLSKeyStoreParameter.isFromDefaultContext(), pKIXBuilderParameters, z, z2);
                this.b = true;
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException(e);
            }
        }

        @Override // javax.net.ssl.KeyManagerFactorySpi
        public final void engineInit(KeyStore keyStore, char[] cArr) {
            this.a = new dx61(keyStore, cArr, false, null, false, true);
            this.b = true;
        }
    }
}
