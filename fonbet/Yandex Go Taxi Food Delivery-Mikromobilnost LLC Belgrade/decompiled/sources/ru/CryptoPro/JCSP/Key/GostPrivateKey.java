package ru.CryptoPro.JCSP.Key;

import java.security.spec.InvalidKeySpecException;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;

/* loaded from: classes4.dex */
public class GostPrivateKey extends InternalGostPrivateKey implements JCSPForgetKeyPasswordInterface, JCSPSpecKey {
    private boolean a;

    public GostPrivateKey(JCSPPrivateKeyInterface jCSPPrivateKeyInterface) throws InvalidKeySpecException {
        super(jCSPPrivateKeyInterface);
        this.a = false;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public void clear() {
        PrivateKeyInterface privateKeyInterface = this.spec;
        if (privateKeyInterface != null) {
            privateKeyInterface.clear();
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        PrivateKeyInterface privateKeyInterface = this.spec;
        if (privateKeyInterface != null) {
            privateKeyInterface.destroy();
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPForgetKeyPasswordInterface
    public void forget() {
        PrivateKeyInterface privateKeyInterface = this.spec;
        if (privateKeyInterface instanceof JCSPForgetKeyPasswordInterface) {
            ((JCSPForgetKeyPasswordInterface) privateKeyInterface).forget();
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public int getKeySize() {
        return this.keySize;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        PrivateKeyInterface privateKeyInterface = this.spec;
        if (privateKeyInterface != null) {
            return privateKeyInterface.isDestroyed();
        }
        return true;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey
    public boolean isFromPfx() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCP.Key.InternalGostPrivateKey
    public void resolveDigestAlgId() {
        this.digestAlgId = (this.keyAlgorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || this.keyAlgorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) ? 32801 : (this.keyAlgorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || this.keyAlgorithm.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) ? 32802 : 32798;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey
    public void setFromPfx() {
        this.a = true;
    }
}
