package ru.CryptoPro.Crypto.Key;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.Crypto.tools.SelfTester_Crypt;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.KuznechikKeySpec;
import ru.CryptoPro.JCP.Key.MagmaKeySpec;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.Key.Symmetric512KeySpec;

/* loaded from: classes4.dex */
public class GostSecretKey implements SecretKey, SpecKey {
    private final SecretKeyInterface a;

    public GostSecretKey(SecretKeyInterface secretKeyInterface) {
        this.a = secretKeyInterface;
    }

    public static SecretKeyInterface extractSpec(Key key) throws InvalidKeyException {
        try {
            SecretKeyInterface secretKeyInterface = (SecretKeyInterface) ((GostSecretKey) key).getSpec();
            SelfTester_Crypt.check(1024);
            return (SecretKeyInterface) secretKeyInterface.clone();
        } catch (Exception e) {
            throw ((InvalidKeyException) new InvalidKeyException(e.getMessage()).initCause(e));
        }
    }

    public static byte[] getIV(Key key) {
        return ((SecretKeyInterface) ((GostSecretKey) key).getSpec()).getIV();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new NotSerializableException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        throw new NotSerializableException();
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public void clear() {
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        clear();
    }

    @Override // java.security.Key, ru.CryptoPro.JCP.Key.SpecKey
    public String getAlgorithm() {
        SecretKeyInterface secretKeyInterface = this.a;
        return secretKeyInterface instanceof Symmetric512KeySpec ? "SYMMETRIC512" : secretKeyInterface instanceof KuznechikKeySpec ? "GOST3412_2015_K" : secretKeyInterface instanceof MagmaKeySpec ? "GOST3412_2015_M" : "GOST28147";
    }

    @Override // java.security.Key, ru.CryptoPro.JCP.Key.SpecKey
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key, ru.CryptoPro.JCP.Key.SpecKey
    public String getFormat() {
        return null;
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public int getKeySize() {
        return this.a instanceof Symmetric512KeySpec ? 512 : 256;
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public KeyInterface getSpec() {
        return this.a;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return false;
    }

    public Object readResolve() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }
}
