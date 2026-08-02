package ru.CryptoPro.Crypto.Cipher;

import defpackage.kbs;
import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import ru.CryptoPro.Crypto.Key.GostSecretKey;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class BaseGostCipher extends CipherSpi {
    public final GostCoreCipher a;
    protected int blockSize;
    public final byte[] c;
    public static final ResourceBundle h = ResourceBundle.getBundle("ru.CryptoPro.Crypto.Cipher.resources.cipher", Locale.getDefault());
    public static final boolean ALLOW_ECB_CBC_NOPADDING_ENCRYPTION = GetProperty.getBooleanProperty("allow_ecb_cbc_nopadding_encryption", false);
    public int b = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = false;
    public String g = "";

    public BaseGostCipher(GostCoreCipher gostCoreCipher) {
        this.a = gostCoreCipher;
        setBlockSize();
        this.c = new byte[this.blockSize];
    }

    public final int a(int i) {
        int i2;
        int i3;
        GostCoreCipher gostCoreCipher = this.a;
        return (!this.f || this.b < 2 || (this.e & 2) == 0 || (i2 = this.d) == (i3 = this.blockSize)) ? gostCoreCipher.computeRequiredLen(i) : gostCoreCipher.computeRequiredLen((i + i2) - i3);
    }

    public final byte[] b(byte[] bArr) {
        int i;
        if (this.f && this.b >= 2) {
            int i2 = this.e;
            int i3 = i2 & 1;
            GostCoreCipher gostCoreCipher = this.a;
            if (i3 != 0) {
                int processedByteCount = ((int) gostCoreCipher.getProcessedByteCount()) % this.blockSize;
                int i4 = (!d() && processedByteCount == 0) ? 0 : this.blockSize - processedByteCount;
                int unprocessedDataSize = gostCoreCipher.getUnprocessedDataSize(i4) + bArr.length;
                byte[] bArr2 = new byte[unprocessedDataSize];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                int i5 = this.b;
                byte[] bArr3 = this.c;
                if (i5 == 2) {
                    for (int i6 = 0; i6 < i4; i6++) {
                        bArr3[i6] = (byte) i4;
                    }
                } else if (i5 == 3) {
                    int i7 = i4 - 1;
                    gostCoreCipher.getRandomBytes(bArr3, 0, i7);
                    bArr3[i7] = (byte) i4;
                } else if (i5 == 4) {
                    int i8 = 0;
                    while (i8 < i4 - 1) {
                        bArr3[i8] = 0;
                        i8++;
                    }
                    bArr3[i8] = (byte) i4;
                } else if (i5 == 5) {
                    for (int i9 = 0; i9 < i4; i9++) {
                        bArr3[i9] = 0;
                    }
                } else if (i5 == 6) {
                    gostCoreCipher.getRandomBytes(bArr3, 0, i4);
                }
                try {
                    if (this.a.engineUpdate(this.c, 0, i4, bArr2, bArr.length) == unprocessedDataSize - bArr.length) {
                        return bArr2;
                    }
                    throw new ProviderException();
                } catch (ShortBufferException e) {
                    ProviderException providerException = new ProviderException(e.toString());
                    providerException.initCause(e);
                    throw providerException;
                }
            }
            if ((i2 & 2) != 0) {
                int i10 = this.d;
                int i11 = this.blockSize;
                ResourceBundle resourceBundle = h;
                if (i10 != i11 && gostCoreCipher.getProcessedByteCount() % this.blockSize != 0) {
                    throw new BadPaddingException(resourceBundle.getString("InvTextLen"));
                }
                int i12 = this.blockSize;
                byte[] bArr4 = new byte[i12];
                try {
                    if (this.a.engineUpdate(this.c, 0, i12, bArr4, 0) != this.blockSize) {
                        throw new ProviderException();
                    }
                    if (!d()) {
                        i = 0;
                    } else {
                        if (i12 == 0) {
                            throw new ProviderException();
                        }
                        i = bArr4[i12 - 1];
                        if (i > this.blockSize || i < 0) {
                            throw new BadPaddingException(resourceBundle.getString("CryptErr"));
                        }
                        int i13 = this.b;
                        if (i13 == 2) {
                            for (int i14 = 0; i14 < i - 1; i14++) {
                                if (bArr4[this.blockSize - i] != i) {
                                    throw new BadPaddingException(resourceBundle.getString("CryptErr"));
                                }
                            }
                        } else if (i13 == 4) {
                            for (int i15 = 0; i15 < i - 1; i15++) {
                                if (bArr4[this.blockSize - i] != 0) {
                                    throw new BadPaddingException(resourceBundle.getString("CryptErr"));
                                }
                            }
                        }
                    }
                    byte[] bArr5 = new byte[(bArr.length + this.blockSize) - i];
                    System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                    System.arraycopy(bArr4, 0, bArr5, bArr.length, this.blockSize - i);
                    return bArr5;
                } catch (ShortBufferException e2) {
                    ProviderException providerException2 = new ProviderException(e2.toString());
                    providerException2.initCause(e2);
                    throw providerException2;
                }
            }
        }
        return bArr;
    }

    public final void c() {
        Arrays.fill(this.c, (byte) 0);
        this.d = 0;
    }

    public final boolean d() {
        int i = this.b;
        return (i == 5 || i == 6) ? false : true;
    }

    /* JADX WARN: Finally extract failed */
    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        boolean d = d();
        GostCoreCipher gostCoreCipher = this.a;
        try {
            if (!d && i2 == 0 && this.d == 0 && (this.e & 2) != 0) {
                try {
                    JCPLogger.enter();
                    c();
                    gostCoreCipher.resetFinal();
                    JCPLogger.exit();
                    return new byte[0];
                } catch (Error e) {
                    this.c();
                    throw e;
                } catch (RuntimeException e2) {
                    this.c();
                    throw e2;
                }
            }
            if (this.f && this.b >= 2) {
                try {
                    JCPLogger.enter();
                    gostCoreCipher.checkInited(3, "NotInitCrypt");
                    byte[] b = b(engineUpdate(bArr, i, i2));
                    c();
                    gostCoreCipher.resetFinal();
                    JCPLogger.exit();
                    return b;
                } catch (Error e3) {
                    c();
                    throw e3;
                } catch (RuntimeException e4) {
                    c();
                    throw e4;
                }
            }
            try {
                try {
                    try {
                        JCPLogger.enter();
                        int unprocessedDataSize = gostCoreCipher.getUnprocessedDataSize(i2);
                        if ((this.e & 48) != 0 && unprocessedDataSize % this.blockSize != 0) {
                            c();
                            BadPaddingException badPaddingException = new BadPaddingException();
                            JCPLogger.thrown(badPaddingException);
                            throw badPaddingException;
                        }
                        byte[] bArr2 = new byte[unprocessedDataSize];
                        this.a.engineUpdate(bArr, i, i2, bArr2, 0);
                        c();
                        gostCoreCipher.resetFinal();
                        JCPLogger.exit();
                        return bArr2;
                    } catch (Throwable th) {
                        JCPLogger.exit();
                        throw th;
                    }
                } catch (InvalidAlgorithmParameterException e5) {
                    c();
                    throw new RuntimeException(e5.getMessage());
                } catch (InvalidKeyException e6) {
                    c();
                    throw new RuntimeException(e6.getMessage());
                }
            } catch (Error e7) {
                c();
                throw e7;
            } catch (ShortBufferException unused) {
                c();
                throw new IllegalBlockSizeException();
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e8) {
            c();
            kbs.g(e8.getMessage());
            return null;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.blockSize;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return this.a.engineGetIV();
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) throws InvalidKeyException {
        if ((key instanceof SpecKey) && (key instanceof GostSecretKey)) {
            return ((SpecKey) key).getKeySize();
        }
        InvalidKeyException invalidKeyException = new InvalidKeyException(h.getString("InvalidKeyType"));
        JCPLogger.warning(invalidKeyException);
        throw invalidKeyException;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        int i2;
        GostCoreCipher gostCoreCipher = this.a;
        try {
            int unprocessedDataSize = gostCoreCipher.getUnprocessedDataSize(i);
            if (this.f && this.b >= 2) {
                if ((this.e & 1) == 0) {
                    int unprocessedDataSize2 = gostCoreCipher.getUnprocessedDataSize(i + this.d);
                    unprocessedDataSize = unprocessedDataSize2 - (unprocessedDataSize2 % this.blockSize);
                } else {
                    int unprocessedDataSize3 = gostCoreCipher.getUnprocessedDataSize(i + this.d);
                    if (d()) {
                        i2 = this.blockSize;
                        if (unprocessedDataSize3 % i2 == 0) {
                            unprocessedDataSize = unprocessedDataSize3 + i2;
                        }
                    }
                    int i3 = this.blockSize;
                    i2 = i3 - (unprocessedDataSize3 % i3);
                    unprocessedDataSize = unprocessedDataSize3 + i2;
                }
            }
            JCPLogger.exit();
            return unprocessedDataSize;
        } catch (Error e) {
            c();
            throw e;
        } catch (RuntimeException e2) {
            c();
            throw e2;
        }
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return this.a.getParameters();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        GostCoreCipher gostCoreCipher = this.a;
        try {
            gostCoreCipher.engineInit(i, key, null);
            this.e = gostCoreCipher.getMode();
            boolean isNotGammaMode = gostCoreCipher.isNotGammaMode();
            this.f = isNotGammaMode;
            if (this.b == 0) {
                this.b = isNotGammaMode ? 2 : 1;
            }
        } catch (InvalidAlgorithmParameterException e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException(e.toString());
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        this.a.engineSetMode(str);
        this.g = str;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        int i;
        if (str.equalsIgnoreCase("PKCS5_PADDING") || str.equalsIgnoreCase("PKCS5Padding")) {
            i = 2;
        } else if (str.equalsIgnoreCase(Consts.STR_ISO_PADDING)) {
            i = 3;
        } else if (str.equalsIgnoreCase(Consts.STR_ANSI_PADDING)) {
            i = 4;
        } else if (str.equalsIgnoreCase("ZERO_PADDING")) {
            i = 5;
        } else if (str.equalsIgnoreCase("RANDOM_PADDING")) {
            i = 6;
        } else {
            boolean equalsIgnoreCase = str.equalsIgnoreCase("No_Padding");
            ResourceBundle resourceBundle = h;
            if (!equalsIgnoreCase && !str.equalsIgnoreCase("NoPadding")) {
                NoSuchPaddingException noSuchPaddingException = new NoSuchPaddingException(resourceBundle.getString("PaddingNotSupp"));
                JCPLogger.warning(noSuchPaddingException);
                throw noSuchPaddingException;
            }
            if (this.g.equalsIgnoreCase("ECB") || this.g.equalsIgnoreCase("CBC")) {
                if (!ALLOW_ECB_CBC_NOPADDING_ENCRYPTION) {
                    NoSuchPaddingException noSuchPaddingException2 = new NoSuchPaddingException(resourceBundle.getString("PaddingNotSupp"));
                    JCPLogger.warning(noSuchPaddingException2);
                    throw noSuchPaddingException2;
                }
                JCPLogger.enter();
                JCPLogger.warning("Usage of NO_PADDING padding mode with ECB or CBC crypt modes is deprecated!");
                JCPLogger.exit();
            }
            i = 1;
        }
        this.b = i;
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        return this.a.engineUnwrap(bArr, str, i);
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        int i4;
        if (bArr == bArr2 && i3 > i && i3 < i + i2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("OverEncryption");
            JCPLogger.enter();
            JCPLogger.thrown(illegalArgumentException);
            throw illegalArgumentException;
        }
        if (!this.f || this.b < 2 || (this.e & 2) == 0) {
            return this.a.engineUpdate(bArr, i, i2, bArr2, i3);
        }
        try {
            this.a.checkInited(3, "NotInitCrypt");
            int i5 = this.d;
            int i6 = this.blockSize;
            byte[] bArr3 = this.c;
            if (i5 != i6) {
                int i7 = i6 - i5 < i2 ? i6 - i5 : i2;
                System.arraycopy(bArr, i, bArr3, i5, i7);
                i += i7;
                this.d += i7;
                i4 = i2 - i7;
            } else {
                i4 = i2;
            }
            int i8 = 0;
            if (i4 == 0) {
                return 0;
            }
            int i9 = this.blockSize;
            GostCoreCipher gostCoreCipher = this.a;
            if (i4 >= i9) {
                int i10 = i4;
                int engineUpdate = gostCoreCipher.engineUpdate(this.c, 0, i9, bArr2, i3);
                int i11 = i;
                int engineUpdate2 = this.a.engineUpdate(bArr, i11, i10 - this.blockSize, bArr2, i3 + engineUpdate);
                int i12 = this.blockSize;
                int i13 = engineUpdate + engineUpdate2;
                System.arraycopy(bArr, (i10 - i12) + i11, bArr3, 0, i12);
                return i13;
            }
            int engineUpdate3 = gostCoreCipher.engineUpdate(this.c, 0, i4, bArr2, i3);
            int i14 = i4;
            while (true) {
                int i15 = this.blockSize;
                if (i8 >= i15 - i14) {
                    System.arraycopy(bArr, i, bArr3, i15 - i14, i14);
                    return engineUpdate3;
                }
                bArr3[i8] = bArr3[i8 + i14];
                i8++;
            }
        } catch (Error e) {
            c();
            throw e;
        } catch (RuntimeException e2) {
            c();
            throw e2;
        } catch (ShortBufferException e3) {
            c();
            throw e3;
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        return this.a.engineWrap(key);
    }

    public Object readResolve() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public void setBlockSize() {
        this.blockSize = 8;
    }

    public Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        JCPLogger.thrown(unsupportedOperationException);
        throw unsupportedOperationException;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        GostCoreCipher gostCoreCipher = this.a;
        gostCoreCipher.engineInit(i, key, algorithmParameterSpec);
        this.e = gostCoreCipher.getMode();
        boolean isNotGammaMode = gostCoreCipher.isNotGammaMode();
        this.f = isNotGammaMode;
        if (this.b == 0) {
            this.b = isNotGammaMode ? 2 : 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [ru.CryptoPro.Crypto.Cipher.BaseGostCipher] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        ?? r1;
        RuntimeException runtimeException;
        Error error;
        BaseGostCipher baseGostCipher;
        BaseGostCipher baseGostCipher2;
        int a;
        try {
            r1 = "NotInitCrypt";
            this.a.checkInited(3, "NotInitCrypt");
            a = a(i2);
        } catch (Error e) {
            e = e;
            r1 = this;
        } catch (RuntimeException e2) {
            e = e2;
            r1 = this;
        }
        try {
            if (a < 0) {
                throw new ProviderException();
            }
            byte[] bArr2 = new byte[a];
            if (bArr != null) {
                try {
                    if (bArr.length < i2 + i) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                        JCPLogger.thrown(illegalArgumentException);
                        throw illegalArgumentException;
                    }
                } catch (Error e3) {
                    error = e3;
                    baseGostCipher2 = this;
                    baseGostCipher2.c();
                    throw error;
                } catch (RuntimeException e4) {
                    runtimeException = e4;
                    baseGostCipher = this;
                    baseGostCipher.c();
                    throw runtimeException;
                }
            }
            if (i2 == 0) {
                return bArr2;
            }
            r1 = this;
            try {
                r1.engineUpdate(bArr, i, i2, bArr2, 0);
                return bArr2;
            } catch (ShortBufferException e5) {
                ProviderException providerException = new ProviderException(e5.toString());
                providerException.initCause(e5);
                throw providerException;
            }
        } catch (Error e6) {
            e = e6;
            error = e;
            baseGostCipher2 = r1;
            baseGostCipher2.c();
            throw error;
        } catch (RuntimeException e7) {
            e = e7;
            runtimeException = e;
            baseGostCipher = r1;
            baseGostCipher.c();
            throw runtimeException;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        try {
            JCPLogger.enter();
            byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
            if (bArr2.length - i3 < engineDoFinal.length) {
                ShortBufferException shortBufferException = new ShortBufferException();
                JCPLogger.enter();
                JCPLogger.thrown(shortBufferException);
                throw shortBufferException;
            }
            System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
            JCPLogger.exit();
            int length = engineDoFinal.length;
            Arrays.fill(engineDoFinal, (byte) 0);
            return length;
        } catch (Error e) {
            c();
            throw e;
        } catch (RuntimeException e2) {
            c();
            throw e2;
        }
    }
}
