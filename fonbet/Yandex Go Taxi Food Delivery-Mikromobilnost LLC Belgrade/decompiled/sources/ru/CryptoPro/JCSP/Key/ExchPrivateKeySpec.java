package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.MSCAPI.HKey;

/* loaded from: classes4.dex */
public class ExchPrivateKeySpec extends AbstractEncryptionKeySpec {
    public ExchPrivateKeySpec(HKey hKey, String str) {
        super(hKey, str, AlgorithmGroups.KeyAlgorithmGroup.Unknown);
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractKeySpec, ru.CryptoPro.JCP.params.DiversKeyInterface, ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        if (this.destroyed) {
            throw new CloneNotSupportedException("The key has been destroyed.");
        }
        return new ExchPrivateKeySpec((HKey) this.insideKey.clone(), this);
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public Object clone2() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Unsupported operation.");
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractKeySpec
    public int getKeyType() {
        return 1;
    }

    public ExchPrivateKeySpec(AlgIdInterface algIdInterface, boolean z, boolean z2, boolean z3) {
        super(algIdInterface, z, z2, z3);
    }

    public ExchPrivateKeySpec(AlgIdInterface algIdInterface, String str) {
        super(algIdInterface, str);
    }

    public ExchPrivateKeySpec(HKey hKey, AbstractKeySpec abstractKeySpec) throws CloneNotSupportedException {
        super(hKey, abstractKeySpec);
    }
}
