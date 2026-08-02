package ru.CryptoPro.JCSP.Key;

import java.security.KeyManagementException;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class JCSPAgreeSecretKeySpec extends SecretKeyImpl {
    public JCSPAgreeSecretKeySpec() throws KeyManagementException {
        super((AlgIdInterface) new AlgIdSpec((OID) null), true);
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractKeySpec, ru.CryptoPro.JCP.params.DiversKeyInterface, ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        if (this.destroyed) {
            throw new CloneNotSupportedException("The key has been destroyed.");
        }
        return new JCSPAgreeSecretKeySpec((HKey) this.insideKey.clone());
    }

    @Override // ru.CryptoPro.JCSP.Key.SecretKeyImpl, ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public Object clone2() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Unsupported operation.");
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getAlgorithmIdentifier() {
        return HProv.CALG_PRO_AGREEDKEY_DH;
    }

    public JCSPAgreeSecretKeySpec(HKey hKey) {
        super(hKey, AlgorithmGroups.KeyAlgorithmGroup.GOST);
    }
}
