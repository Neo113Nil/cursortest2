package ru.CryptoPro.JCSP.Cipher.foreign;

import defpackage.w511;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import ru.CryptoPro.Crypto.Cipher.ErrorStrings;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.JCSPSpecKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAExchPrivateKey;

/* loaded from: classes4.dex */
public class RSATransportCipher extends CipherSpi {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCSP.Cipher.resources.cipher";
    protected static final String d = "InvalidKeyType";
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.JCSP.Cipher.resources.cipher", Locale.getDefault());
    protected String a;
    protected int b;
    protected Key c;

    public void a(Key key) throws InvalidKeyException {
        String algorithm = key.getAlgorithm();
        if (!algorithm.equalsIgnoreCase("RSA") && !algorithm.equalsIgnoreCase("CP_RSA")) {
            throw new InvalidKeyException(resource.getString("InvalidKeyType"));
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) throws InvalidKeyException {
        if (key instanceof JCSPSpecKey) {
            return ((JCSPSpecKey) key).getKeySize();
        }
        InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("InvalidKeyType"));
        JCSPLogger.warning(invalidKeyException);
        throw invalidKeyException;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        JCSPLogger.subEnter();
        if (i != 3 && i != 4) {
            w511.u();
            return;
        }
        if (i == 4 && !(key instanceof RSAExchPrivateKey)) {
            throw new InvalidKeyException(resource.getString(ErrorStrings.TRANSPORT_KEY_ERR));
        }
        a(key);
        this.b = i;
        this.c = key;
        JCSPLogger.subExit();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        this.a = str;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        JCSPLogger.subEnter();
        engineInit(i, key, secureRandom);
        JCSPLogger.subExit();
    }
}
