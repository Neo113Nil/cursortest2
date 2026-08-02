package ru.cprocsp.ACSP.tools.store.util;

import android.content.Context;
import defpackage.izh0;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.AbstractMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.KeyStore.JCPPrivateKeyEntry;
import ru.CryptoPro.JCP.params.JCPProtectionParameter;
import ru.CryptoPro.JCP.tools.JCPKeyPair;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.KeyStore.PFXStore;
import ru.cprocsp.ACSP.tools.common.IResult;
import ru.cprocsp.ACSP.tools.common.Result;

/* loaded from: classes4.dex */
public class UtilPFX implements Serializable {
    public static int NUMBER_OF_PFX_PASSWORD_INPUT_ATTEMPTS = 1000;
    private final byte[] content;
    private Map<PfxItemInfo, Map.Entry<Certificate[], Key>> keyCertMap;
    private KeyStore keyStore;
    private int numberOfPfxPasswordInputAttempts = NUMBER_OF_PFX_PASSWORD_INPUT_ATTEMPTS;

    public UtilPFX(byte[] bArr) {
        this.content = bArr;
    }

    public Set<PfxItemInfo> getKeyAliasFromPfx(char[] cArr) throws Exception {
        this.keyCertMap = new HashMap();
        KeyStore keyStore = KeyStore.getInstance(JCSP.PFX_STORE_NAME, "JCSP");
        PFXStore.PfxLoadStoreParameter pfxLoadStoreParameter = new PFXStore.PfxLoadStoreParameter(new PFXStore.PfxStoreProtection(new ByteArrayInputStream(this.content), cArr));
        pfxLoadStoreParameter.enableUUIDKeyAliasOnLoading();
        keyStore.load(pfxLoadStoreParameter);
        Enumeration<String> aliases = keyStore.aliases();
        KeyStore keyStore2 = KeyStore.getInstance("HDIMAGE", "JCSP");
        this.keyStore = keyStore2;
        keyStore2.load(null, null);
        while (aliases.hasMoreElements()) {
            String nextElement = aliases.nextElement();
            PrivateKey privateKey = (PrivateKey) keyStore.getKey(nextElement, cArr);
            Certificate[] certificateChain = keyStore.getCertificateChain(nextElement);
            if (certificateChain != null && privateKey != null) {
                int i = 0;
                if (new JCPKeyPair(certificateChain[0].getPublicKey(), privateKey).match()) {
                    AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(certificateChain, privateKey);
                    this.keyCertMap.put(new PfxItemInfo(this, nextElement, i), simpleEntry);
                }
            }
        }
        return this.keyCertMap.keySet();
    }

    public Map<PfxItemInfo, Map.Entry<Certificate[], Key>> getKeyCertMap() {
        return this.keyCertMap;
    }

    public int getNumberOfPfxPasswordInputAttempts() {
        return this.numberOfPfxPasswordInputAttempts;
    }

    public void setNumberOfPfxPasswordInputAttempts(int i) {
        this.numberOfPfxPasswordInputAttempts = i;
    }

    public class PfxItemInfo {
        private final String alias;

        private PfxItemInfo(String str) {
            this.alias = str;
        }

        private int saveRootCert(Context context, Certificate[] certificateArr) {
            X509Certificate x509Certificate = (X509Certificate) certificateArr[certificateArr.length - 1];
            if (x509Certificate.getBasicConstraints() == -1 || !x509Certificate.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
                return 5;
            }
            try {
                x509Certificate.verify(x509Certificate.getPublicKey());
                return UtilCertStore.saveRootCert(context, x509Certificate).getCode();
            } catch (Exception unused) {
                return 3;
            }
        }

        public String getAlias() {
            return this.alias;
        }

        public IResult save(Context context, char[] cArr) throws KeyStoreException {
            Map.Entry entry = (Map.Entry) UtilPFX.this.keyCertMap.get(this);
            if (entry != null) {
                Certificate[] certificateArr = (Certificate[]) entry.getKey();
                Key key = (Key) entry.getValue();
                if (key != null && certificateArr != null) {
                    UtilPFX.this.keyStore.setEntry(this.alias, new JCPPrivateKeyEntry((PrivateKey) key, certificateArr, true), new JCPProtectionParameter(cArr));
                    return saveRootCert(context, certificateArr) == 3 ? new Result(6, String.format(context.getString(izh0.PFXSavedWithoutRootCert), this.alias)) : new Result(0, String.format(context.getString(izh0.PFXSaved), this.alias));
                }
            }
            return new Result(5, context.getString(izh0.PFXNotContainKeys));
        }

        public /* synthetic */ PfxItemInfo(UtilPFX utilPFX, String str, int i) {
            this(str);
        }
    }
}
