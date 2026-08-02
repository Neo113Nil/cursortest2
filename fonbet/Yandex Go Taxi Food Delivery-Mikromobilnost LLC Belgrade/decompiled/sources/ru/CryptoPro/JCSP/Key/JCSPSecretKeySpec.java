package ru.CryptoPro.JCSP.Key;

import java.security.KeyManagementException;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.Key.foreign.JCSPForeignSecretKeySpec;
import ru.CryptoPro.JCSP.MSCAPI.HKey;

/* loaded from: classes4.dex */
public class JCSPSecretKeySpec extends SecretKeyImpl {
    public JCSPSecretKeySpec(AlgIdInterface algIdInterface, CryptParamsInterface cryptParamsInterface, int i, boolean z, EllipticParamsInterface ellipticParamsInterface) throws KeyManagementException {
        super(algIdInterface, z);
        this.insideKey = SecretKeyImpl.createKey(i, z, null, ellipticParamsInterface);
        setParams(cryptParamsInterface);
    }

    private static AlgorithmGroups.KeyAlgorithmGroup a(int i) {
        return (HKey.isForeignSecretKey(i) || i == 41984 || i == 9216) ? AlgorithmGroups.KeyAlgorithmGroup.RSA : AlgorithmGroups.KeyAlgorithmGroup.GOST;
    }

    public static JCSPSecretKeySpec getInstance(int i, AlgIdInterface algIdInterface, boolean z) {
        return i != 19462 ? i != 26142 ? i != 26146 ? i != 26160 ? i != 26161 ? new JCSPForeignSecretKeySpec(algIdInterface, z) : new JCSPSecretKeySpecK(algIdInterface, z) : new JCSPSecretKeySpecM(algIdInterface, z) : new JCSPSymmetric512KeySpec(algIdInterface, z) : new JCSPSecretKeySpec(algIdInterface, z) : new JCSPTls1MasterSecretKeySpec(algIdInterface, z);
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractKeySpec, ru.CryptoPro.JCP.params.DiversKeyInterface, ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        if (this.destroyed) {
            throw new CloneNotSupportedException("The key has been destroyed.");
        }
        return new JCSPSecretKeySpec((HKey) this.insideKey.clone(), this);
    }

    @Override // ru.CryptoPro.JCSP.Key.SecretKeyImpl, ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public Object clone2() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Unsupported operation.");
    }

    public JCSPSecretKeySpec(AlgIdInterface algIdInterface, String str) {
        super(algIdInterface, str);
    }

    public JCSPSecretKeySpec(AlgIdInterface algIdInterface, CryptParamsInterface cryptParamsInterface, boolean z, EllipticParamsInterface ellipticParamsInterface) throws KeyManagementException {
        this(algIdInterface, cryptParamsInterface, 26142, z, ellipticParamsInterface);
    }

    public JCSPSecretKeySpec(AlgIdInterface algIdInterface, boolean z) {
        super(algIdInterface, z);
    }

    public JCSPSecretKeySpec(HKey hKey) {
        this(hKey, AlgorithmGroups.KeyAlgorithmGroup.GOST);
    }

    public JCSPSecretKeySpec(HKey hKey, AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup) {
        super(hKey, keyAlgorithmGroup);
    }

    public JCSPSecretKeySpec(HKey hKey, JCSPSecretKeySpec jCSPSecretKeySpec) throws CloneNotSupportedException {
        super(hKey, jCSPSecretKeySpec);
    }

    public JCSPSecretKeySpec(byte[] bArr, int i, int i2, AlgIdInterface algIdInterface) {
        super(SecretKeyImpl.importRawKey(bArr, i, i2, algIdInterface), a(i));
    }

    public static JCSPSecretKeySpec getInstance(HKey hKey, int i) {
        return i != 19462 ? i != 26142 ? i != 26146 ? i != 26160 ? i != 26161 ? new JCSPForeignSecretKeySpec(hKey) : new JCSPSecretKeySpecK(hKey) : new JCSPSecretKeySpecM(hKey) : new JCSPSymmetric512KeySpec(hKey) : new JCSPSecretKeySpec(hKey) : new JCSPTls1MasterSecretKeySpec(hKey);
    }
}
