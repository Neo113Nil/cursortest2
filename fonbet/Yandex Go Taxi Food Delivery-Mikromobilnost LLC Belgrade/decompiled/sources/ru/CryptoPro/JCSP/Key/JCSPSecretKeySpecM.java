package ru.CryptoPro.JCSP.Key;

import java.security.KeyManagementException;
import ru.CryptoPro.JCP.Key.MagmaKeySpec;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCSP.MSCAPI.HKey;

/* loaded from: classes4.dex */
public class JCSPSecretKeySpecM extends JCSPSecretKeySpecK {
    public JCSPSecretKeySpecM(CryptParamsInterface cryptParamsInterface, boolean z, EllipticParamsInterface ellipticParamsInterface) throws KeyManagementException {
        super(cryptParamsInterface, 26160, z, ellipticParamsInterface);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeySpecK, ru.CryptoPro.JCSP.Key.JCSPSecretKeySpec, ru.CryptoPro.JCSP.Key.AbstractKeySpec, ru.CryptoPro.JCP.params.DiversKeyInterface, ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        if (this.destroyed) {
            throw new CloneNotSupportedException("The key has been destroyed.");
        }
        JCSPSecretKeySpecM jCSPSecretKeySpecM = new JCSPSecretKeySpecM((HKey) this.insideKey.clone());
        jCSPSecretKeySpecM.setNeedMacSize(getNeedMacSize());
        return jCSPSecretKeySpecM;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeySpecK, ru.CryptoPro.JCSP.Key.JCSPSecretKeySpec, ru.CryptoPro.JCSP.Key.SecretKeyImpl, ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public Object clone2() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Unsupported operation.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeySpecK, ru.CryptoPro.JCSP.Key.SecretKeyImpl
    public long getC1() {
        return MagmaKeySpec.C1_magma;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeySpecK, ru.CryptoPro.JCSP.Key.SecretKeyImpl
    public long getC2() {
        return MagmaKeySpec.C2_magma;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeySpecK, ru.CryptoPro.JCSP.Key.SecretKeyImpl
    public long getC3() {
        return MagmaKeySpec.C3_magma;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeySpecK, ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec
    public int getCmsMixModeSize() {
        return 1024;
    }

    public JCSPSecretKeySpecM(AlgIdInterface algIdInterface, boolean z) {
        super(algIdInterface, z);
    }

    public JCSPSecretKeySpecM(AlgIdInterface algIdInterface, String str) {
        super(algIdInterface, str);
    }

    public JCSPSecretKeySpecM(HKey hKey) {
        super(hKey);
    }

    public JCSPSecretKeySpecM(byte[] bArr, int i, int i2, AlgIdInterface algIdInterface) {
        super(bArr, i, i2, algIdInterface);
    }
}
