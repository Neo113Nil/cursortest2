package ru.CryptoPro.Crypto.Cipher;

import defpackage.ss61;
import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.MacSpi;
import ru.CryptoPro.Crypto.Key.GostSecretKey;
import ru.CryptoPro.Crypto.Starter;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.MacSizeSpec;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostMac extends MacSpi implements Cloneable {
    public static final String BUNDLE_NAME = "ru.CryptoPro.Crypto.Cipher.resources.cipher";
    protected static final String IMITA_ERR = "ImitaErr";
    protected static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.Crypto.Cipher.resources.cipher", Locale.getDefault());
    protected byte[] buffer;
    protected int bufferPos;
    protected int byteBlockSize;
    protected long count;
    protected SecretKeyInterface key;
    protected boolean lockUpdate;
    protected int macSize;
    protected CryptParamsInterface param;
    protected final int[] uz;

    public GostMac(GostMac gostMac) throws CloneNotSupportedException {
        this.bufferPos = 0;
        this.key = null;
        this.param = null;
        this.uz = new int[]{r2[0], r2[1]};
        this.count = 0L;
        this.lockUpdate = false;
        this.count = gostMac.count;
        this.bufferPos = gostMac.bufferPos;
        this.lockUpdate = gostMac.lockUpdate;
        int[] iArr = gostMac.uz;
        this.byteBlockSize = gostMac.byteBlockSize;
        byte[] bArr = new byte[gostMac.buffer.length];
        this.buffer = bArr;
        byte[] bArr2 = gostMac.buffer;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.param = gostMac.param;
        this.key = (SecretKeyInterface) gostMac.key.clone();
        this.macSize = gostMac.macSize;
    }

    public boolean allowAdditionalKb() {
        return true;
    }

    public void clearKey() {
        SecretKeyInterface secretKeyInterface = this.key;
        if (secretKeyInterface != null) {
            secretKeyInterface.clear();
            this.key = null;
        }
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new GostMac(this);
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        try {
            JCPLogger.enter();
            try {
                int i = this.bufferPos;
                if (i != 0) {
                    Arrays.fill(this.buffer, i, 8, (byte) 0);
                    step();
                }
                if (this.count <= 8) {
                    this.key.imita(this.uz, this.param);
                }
                int i2 = this.uz[0];
                engineReset();
                this.lockUpdate = true;
                JCPLogger.exit();
                return Array.toByteArray(i2);
            } catch (InvalidKeyException e) {
                engineReset();
                InvalidParameterException invalidParameterException = new InvalidParameterException(resource.getString(IMITA_ERR));
                invalidParameterException.initCause(e);
                JCPLogger.warning(invalidParameterException);
                throw invalidParameterException;
            }
        } catch (Error e2) {
            clearKey();
            engineReset();
            throw e2;
        } catch (RuntimeException e3) {
            clearKey();
            engineReset();
            throw e3;
        }
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return this.macSize;
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        ParamsInterface params;
        this.lockUpdate = false;
        try {
            JCPLogger.enter();
            if (!ss61.a) {
                throw new InvalidKeyException(resource.getString("NoCipherLicense"));
            }
            SecretKeyInterface extractSpec = GostSecretKey.extractSpec(key);
            this.key = extractSpec;
            if (extractSpec instanceof SecretKeySpec) {
                ((SecretKeySpec) extractSpec).setAllowExtra1K(allowAdditionalKb());
            }
            if (algorithmParameterSpec == null) {
                params = this.key.getParams();
            } else if (algorithmParameterSpec instanceof CryptParamsInterface) {
                this.param = (CryptParamsInterface) algorithmParameterSpec;
                engineReset();
                JCPLogger.exit();
            } else {
                if (!(algorithmParameterSpec instanceof MacSizeSpec)) {
                    InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(resource.getString("InvPar"));
                    JCPLogger.warning(invalidAlgorithmParameterException);
                    throw invalidAlgorithmParameterException;
                }
                this.macSize = ((MacSizeSpec) algorithmParameterSpec).getMacSize();
                params = this.key.getParams();
            }
            this.param = (CryptParamsInterface) params;
            engineReset();
            JCPLogger.exit();
        } catch (Error e) {
            clearKey();
            engineReset();
            throw e;
        } catch (RuntimeException e2) {
            clearKey();
            engineReset();
            throw e2;
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        this.count = 0L;
        this.bufferPos = 0;
        int[] iArr = this.uz;
        iArr[1] = 0;
        iArr[0] = 0;
        Arrays.fill(this.buffer, (byte) 0);
        this.lockUpdate = false;
        try {
            SecretKeyInterface secretKeyInterface = this.key;
            if (secretKeyInterface != null) {
                ((SecretKeySpec) secretKeyInterface).resetKey();
            }
        } catch (InvalidKeyException e) {
            clearKey();
            engineReset();
            throw new Error(e.getMessage());
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        int i3;
        try {
            if (this.lockUpdate) {
                throw new Error("Update locked");
            }
            if (bArr.length < i2 + i) {
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
                JCPLogger.thrown(arrayIndexOutOfBoundsException);
                throw arrayIndexOutOfBoundsException;
            }
            int i4 = this.bufferPos;
            if (i4 + i2 < 8) {
                System.arraycopy(bArr, i, this.buffer, i4, i2);
                this.bufferPos += i2;
            } else {
                if (i4 != 0) {
                    System.arraycopy(bArr, i, this.buffer, i4, 8 - i4);
                    try {
                        step();
                        Arrays.fill(this.buffer, (byte) 0);
                        int i5 = this.bufferPos;
                        i3 = 8 - i5;
                        this.count += 8 - i5;
                        i2 -= 8 - i5;
                        this.bufferPos = 0;
                    } catch (InvalidKeyException e) {
                        engineReset();
                        InvalidParameterException invalidParameterException = new InvalidParameterException(resource.getString(IMITA_ERR));
                        invalidParameterException.initCause(e);
                        JCPLogger.enter();
                        JCPLogger.warning(invalidParameterException);
                        throw invalidParameterException;
                    }
                } else {
                    i3 = 0;
                }
                try {
                    int i6 = i + i3;
                    this.key.imita(this.uz, bArr, i6, i2 / 8, this.param);
                    int i7 = i2 % 8;
                    this.bufferPos = i7;
                    System.arraycopy(bArr, (i6 + i2) - i7, this.buffer, 0, i7);
                    Arrays.fill(this.buffer, this.bufferPos, 8, (byte) 0);
                } catch (InvalidKeyException e2) {
                    engineReset();
                    InvalidParameterException invalidParameterException2 = new InvalidParameterException(resource.getString(IMITA_ERR));
                    invalidParameterException2.initCause(e2);
                    JCPLogger.enter();
                    JCPLogger.warning(invalidParameterException2);
                    throw invalidParameterException2;
                }
            }
            this.count += i2;
        } catch (Error e3) {
            clearKey();
            engineReset();
            throw e3;
        } catch (RuntimeException e4) {
            clearKey();
            engineReset();
            throw e4;
        }
    }

    public Object readResolve() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public void setDefaultSize() {
        this.byteBlockSize = 8;
        this.macSize = 4;
    }

    public void step() throws InvalidKeyException {
        this.key.imita(this.uz, this.buffer, 0, 1, this.param);
    }

    public Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public GostMac() {
        this.bufferPos = 0;
        this.key = null;
        this.param = null;
        this.uz = new int[2];
        this.count = 0L;
        this.lockUpdate = false;
        Starter.check(GostMac.class);
        setDefaultSize();
        this.buffer = new byte[this.byteBlockSize];
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b) {
        engineUpdate(new byte[]{b}, 0, 1);
    }
}
