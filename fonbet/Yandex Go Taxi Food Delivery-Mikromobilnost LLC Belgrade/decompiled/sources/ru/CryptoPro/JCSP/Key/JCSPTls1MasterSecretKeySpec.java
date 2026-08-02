package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCSP.MSCAPI.HKey;

/* loaded from: classes4.dex */
public class JCSPTls1MasterSecretKeySpec extends JCSPSecretKeySpec {
    public JCSPTls1MasterSecretKeySpec(AlgIdInterface algIdInterface, boolean z) {
        super(algIdInterface, z);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeySpec, ru.CryptoPro.JCSP.Key.AbstractKeySpec, ru.CryptoPro.JCP.params.DiversKeyInterface, ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        if (this.destroyed) {
            throw new CloneNotSupportedException("The key has been destroyed.");
        }
        return new JCSPTls1MasterSecretKeySpec((HKey) getKey().clone());
    }

    public JCSPTls1MasterSecretKeySpec(HKey hKey) {
        super(hKey);
    }
}
