package ru.CryptoPro.Crypto.Cipher;

import defpackage.b64;
import defpackage.ny61;
import defpackage.ss61;
import defpackage.w511;
import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.Crypto.Key.GostAgreeKey;
import ru.CryptoPro.Crypto.Key.GostSecretKey;
import ru.CryptoPro.Crypto.Starter;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.MagmaKeySpec;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.G3412ParamsSpec;
import ru.CryptoPro.JCP.params.GostCipherSpecImpl;
import ru.CryptoPro.JCP.params.Kexp15ParamsSpec;
import ru.CryptoPro.JCP.params.OmacParamsSpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostCoreCipher implements Consts {
    protected static final int BYTE_BLOCK_SIZE = 8;
    protected static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.Crypto.Cipher.resources.cipher", Locale.getDefault());
    protected byte[] buffer;
    protected int byteBlockSize;
    protected int mode;
    protected boolean isIVSet = false;
    protected boolean isInited = false;
    protected int bufferPos = 0;
    protected long processedByteCount = 0;
    protected SecretKeyInterface key = null;
    protected CryptParamsInterface param = null;
    protected int[] internalState = new int[2];
    protected int gammaBytesRemained = 0;
    protected int[] synchro = new int[2];
    public int[] a = null;
    protected boolean doProcessIV = true;
    protected int gammaBlockLen = 0;
    protected int mixBlockSize = 0;
    protected boolean usePromix = false;
    protected byte[] baseUkm = null;
    protected byte[] extendKeyUkm = null;
    protected OmacParamsSpec omacParamsSpec = null;

    public GostCoreCipher() {
        this.mode = 0;
        Starter.check(GostCoreCipher.class);
        setByteBlockSize();
        setMixBlockSize(false);
        setDefaultPromix();
        this.buffer = new byte[this.byteBlockSize];
        this.mode = 0;
        resetInit();
    }

    public final void a(int i) {
        if (this.mode == 0) {
            this.mode = 128;
        }
        if (i == 1) {
            this.mode |= 1;
            return;
        }
        if (i == 2) {
            this.mode |= 2;
            return;
        }
        if (i == 3) {
            this.mode |= 8;
        } else if (i == 4) {
            this.mode |= 4;
        } else {
            ny61.g(resource.getString("NoMode"));
        }
    }

    public boolean allowAdditionalKb(int i) {
        return i == 1 || i == 2;
    }

    public final void b(int[] iArr) {
        if (iArr.length != 2 && this.bufferPos != 0) {
            resetInit();
            throw new InvalidParameterException(resource.getString("CryptErr"));
        }
        try {
            int[] iArr2 = new int[2];
            System.arraycopy(iArr, 0, iArr2, 0, 2);
            this.key.encrypt(-2147483632, iArr2, null, this.param);
            System.arraycopy(iArr2, 0, iArr, 0, 2);
        } catch (InvalidKeyException e) {
            resetInit();
            InvalidParameterException invalidParameterException = new InvalidParameterException(resource.getString("CryptErr"));
            invalidParameterException.initCause(e);
            throw invalidParameterException;
        }
    }

    public int blockCrypt(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        byte[] bArr3;
        if ((this.mode & 32) != 0 && this.doProcessIV) {
            int[] iArr = this.internalState;
            int[] iArr2 = this.synchro;
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1];
            this.doProcessIV = false;
        }
        int computeRequiredLen = computeRequiredLen(i2);
        int i8 = this.bufferPos;
        if (i8 != 0) {
            int i9 = i8 + i2;
            int i10 = this.byteBlockSize;
            byte[] bArr4 = this.buffer;
            if (i9 < i10) {
                System.arraycopy(bArr, i, bArr4, i8, i2);
                this.bufferPos += i2;
                this.processedByteCount += i2;
                i6 = 0;
                i4 = computeRequiredLen;
                i5 = i2;
                z = true;
                i7 = 0;
            } else {
                System.arraycopy(bArr, i, bArr4, i8, i10 - i8);
                try {
                    int[] intArray = Array.toIntArray(this.buffer);
                    int i11 = this.mode;
                    if ((i11 & 1) != 0) {
                        this.key.encrypt(i11 & Consts.MODE_CRYPT_MASK, intArray, this.internalState, this.param);
                    } else if ((i11 & 2) != 0) {
                        this.key.decrypt(i11 & Consts.MODE_CRYPT_MASK, intArray, this.internalState, this.param);
                    }
                    Array.toByteArray(bArr2, i3, intArray, 0);
                    Arrays.fill(this.buffer, (byte) 0);
                    i6 = this.byteBlockSize;
                    int i12 = this.bufferPos;
                    i4 = computeRequiredLen;
                    this.processedByteCount += i6 - i12;
                    this.bufferPos = 0;
                    i5 = i2 - (i6 - i12);
                    i7 = i6 - i12;
                    z = false;
                } catch (InvalidKeyException e) {
                    resetInit();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("CryptErr"));
                    illegalArgumentException.initCause(e);
                    throw illegalArgumentException;
                }
            }
        } else {
            i4 = computeRequiredLen;
            i5 = i2;
            z = false;
            i6 = 0;
            i7 = 0;
        }
        if (z) {
            return i4;
        }
        int i13 = i5 / this.byteBlockSize;
        try {
            int i14 = this.mode;
            if ((i14 & 1) != 0 && (i14 & 16) != 0) {
                ((SecretKeySpec) this.key).encryptECB(bArr2, i6 + i3, bArr, i + i7, i13, this.internalState, this.param);
            } else if ((i14 & 2) != 0 && (i14 & 16) != 0) {
                ((SecretKeySpec) this.key).decryptECB(bArr2, i6 + i3, bArr, i + i7, i13, this.internalState, this.param);
            } else if ((i14 & 1) != 0 && (i14 & 32) != 0) {
                ((SecretKeySpec) this.key).encryptCBC(bArr2, i6 + i3, bArr, i + i7, i13, this.internalState, this.param);
            } else if ((i14 & 2) != 0 && (i14 & 32) != 0) {
                bArr3 = bArr;
                ((SecretKeySpec) this.key).decryptCBC(bArr2, i6 + i3, bArr3, i + i7, i13, this.internalState, this.param);
                int i15 = i5 % this.byteBlockSize;
                this.bufferPos = i15;
                System.arraycopy(bArr3, ((i7 + i) + i5) - i15, this.buffer, 0, i15);
                Arrays.fill(this.buffer, this.bufferPos, this.byteBlockSize, (byte) 0);
                this.processedByteCount += i5;
                return i4;
            }
            bArr3 = bArr;
            int i152 = i5 % this.byteBlockSize;
            this.bufferPos = i152;
            System.arraycopy(bArr3, ((i7 + i) + i5) - i152, this.buffer, 0, i152);
            Arrays.fill(this.buffer, this.bufferPos, this.byteBlockSize, (byte) 0);
            this.processedByteCount += i5;
            return i4;
        } catch (InvalidKeyException e2) {
            resetInit();
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(resource.getString("CryptErr"));
            illegalArgumentException2.initCause(e2);
            throw illegalArgumentException2;
        }
    }

    public void changeKey() {
        try {
            this.key.changeKey(this.param);
            int i = this.mode;
            if ((i & 64) != 0) {
                b(this.synchro);
            } else if ((i & 128) != 0) {
                b(this.internalState);
            }
        } catch (InvalidKeyException e) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString(ErrorStrings.ERR_CHANGE));
            illegalArgumentException.initCause(e);
            JCPLogger.warning(illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    public void checkIVLen(int i) throws InvalidAlgorithmParameterException {
    }

    public void checkInited(int i, String str) {
        if (!this.isInited || (this.mode & i) == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString(str));
            JCPLogger.warning(illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    public void chooseIV(Key key) throws InvalidAlgorithmParameterException {
        this.a = null;
        boolean z = key instanceof GostAgreeKey;
        int i = this.mode;
        if (z) {
            if ((i & 8) != 0 || (i & 4) != 0) {
                setAndSaveIV(((GostAgreeKey) key).getIV());
            }
        } else if ((i & 8) != 0) {
            this.key.setIVLen(getReqIVLen());
            setIV(this.key.getIV());
        } else if ((i & 4) != 0 && !(this.key instanceof MagmaKeySpec)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NoIVUnwrap"));
            JCPLogger.warning(illegalArgumentException);
            throw illegalArgumentException;
        }
        if ((this.mode & 1) != 0) {
            this.key.setIVLen(getReqIVLen());
            setIV(this.key.getIV());
        }
        if ((this.mode & 2) == 0) {
            return;
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(resource.getString("NoIVDecrypt"));
        JCPLogger.warning(illegalArgumentException2);
        throw illegalArgumentException2;
    }

    public void clearKey() {
        SecretKeyInterface secretKeyInterface = this.key;
        if (secretKeyInterface != null) {
            secretKeyInterface.clear();
            this.key = null;
        }
    }

    public int computeRequiredLen(int i) {
        int i2 = this.mode;
        if ((i2 & 64) != 0 || (i2 & 128) != 0 || (i2 & 256) != 0 || (i2 & 1024) != 0) {
            return i;
        }
        int i3 = this.bufferPos + i;
        int i4 = this.byteBlockSize;
        return (i3 / i4) * i4;
    }

    public int cryptCNT(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.doProcessIV) {
            b(this.synchro);
            this.doProcessIV = false;
        }
        int computeRequiredLen = computeRequiredLen(i2);
        int i4 = this.gammaBytesRemained;
        if (i4 != 0) {
            if (i2 < i4) {
                i4 = i2;
            }
            byte[] byteArray = Array.toByteArray(this.internalState);
            for (int i5 = 0; i5 < i4; i5++) {
                bArr2[i5 + i3] = (byte) (bArr[i5 + i] ^ byteArray[(byteArray.length - this.gammaBytesRemained) + i5]);
            }
            this.gammaBytesRemained -= i4;
            this.processedByteCount += i4;
        } else {
            i4 = 0;
        }
        int i6 = i2 - i4;
        int i7 = this.byteBlockSize;
        int i8 = i6 / i7;
        int i9 = i6 % i7;
        try {
            ((SecretKeySpec) this.key).cryptCNT(bArr2, i4 + i3, bArr, i + i4, i8, this.synchro, this.param);
            this.processedByteCount += this.byteBlockSize * i8;
            if (i9 == 0) {
                return computeRequiredLen;
            }
            try {
                int[] iArr = new int[2];
                this.key.encrypt(this.mode & Consts.MODE_CRYPT_MASK, iArr, this.synchro, this.param);
                byte[] byteArray2 = Array.toByteArray(iArr);
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = i10 + i4;
                    int i12 = this.byteBlockSize;
                    bArr2[b64.b(i8, i12, i11, i3)] = (byte) (bArr[b64.b(i8, i12, i11, i)] ^ byteArray2[i10]);
                }
                Arrays.fill(byteArray2, 0, i9, (byte) 0);
                this.gammaBytesRemained = this.byteBlockSize - i9;
                this.internalState = Array.toIntArray(byteArray2);
                this.processedByteCount += i9;
                return computeRequiredLen;
            } catch (InvalidKeyException e) {
                resetInit();
                InvalidParameterException invalidParameterException = new InvalidParameterException(resource.getString("CryptErr"));
                invalidParameterException.initCause(e);
                throw invalidParameterException;
            }
        } catch (InvalidKeyException e2) {
            resetInit();
            InvalidParameterException invalidParameterException2 = new InvalidParameterException(resource.getString("CryptErr"));
            invalidParameterException2.initCause(e2);
            throw invalidParameterException2;
        }
    }

    public int cryptCTR(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new InvalidParameterException("Unsupported mode CTR");
    }

    public int cryptOmacCTR(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new InvalidParameterException("Unsupported mode CTR");
    }

    public int decryptCFB(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        if (this.doProcessIV) {
            int[] iArr = this.internalState;
            int[] iArr2 = this.synchro;
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1];
            this.doProcessIV = false;
        }
        int computeRequiredLen = computeRequiredLen(i2);
        int i5 = this.gammaBytesRemained;
        if (i5 != 0) {
            if (i2 < i5) {
                i5 = i2;
            }
            byte[] byteArray = Array.toByteArray(this.internalState);
            for (int i6 = 0; i6 < i5; i6++) {
                byte b = bArr[i6 + i];
                int length = byteArray.length;
                int i7 = this.gammaBytesRemained;
                bArr2[i6 + i3] = (byte) (byteArray[(length - i7) + i6] ^ b);
                byteArray[(byteArray.length - i7) + i6] = b;
            }
            this.processedByteCount += i5;
            this.gammaBytesRemained -= i5;
            this.internalState = Array.toIntArray(byteArray);
        } else {
            i5 = 0;
        }
        int i8 = i2 - i5;
        int i9 = this.byteBlockSize;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        try {
            ((SecretKeySpec) this.key).decryptCFB(bArr2, i5 + i3, bArr, i5 + i, i10, this.internalState, this.param);
            this.processedByteCount += this.byteBlockSize * i10;
            if (i11 == 0) {
                return computeRequiredLen;
            }
            try {
                this.key.encrypt(16, this.internalState, null, this.param);
                byte[] byteArray2 = Array.toByteArray(this.internalState);
                while (true) {
                    int i12 = this.byteBlockSize;
                    if (i4 >= i11) {
                        this.gammaBytesRemained = i12 - i11;
                        this.internalState = Array.toIntArray(byteArray2);
                        this.processedByteCount += i11;
                        return computeRequiredLen;
                    }
                    byte b2 = bArr[(i10 * i12) + i4 + i + i5];
                    bArr2[(i10 * i12) + i4 + i5 + i3] = (byte) (bArr[(((i12 * i10) + i4) + i) + i5] ^ byteArray2[i4]);
                    byteArray2[i4] = b2;
                    i4++;
                }
            } catch (InvalidKeyException e) {
                resetInit();
                InvalidParameterException invalidParameterException = new InvalidParameterException(resource.getString("CryptErr"));
                invalidParameterException.initCause(e);
                throw invalidParameterException;
            }
        } catch (InvalidKeyException e2) {
            resetInit();
            InvalidParameterException invalidParameterException2 = new InvalidParameterException(resource.getString("CryptErr"));
            invalidParameterException2.initCause(e2);
            throw invalidParameterException2;
        }
    }

    public int encryptCFB(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        if (this.doProcessIV) {
            int[] iArr = this.internalState;
            int[] iArr2 = this.synchro;
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1];
            this.doProcessIV = false;
        }
        int computeRequiredLen = computeRequiredLen(i2);
        int i5 = this.gammaBytesRemained;
        if (i5 != 0) {
            if (i2 < i5) {
                i5 = i2;
            }
            byte[] byteArray = Array.toByteArray(this.internalState);
            for (int i6 = 0; i6 < i5; i6++) {
                int length = (byteArray.length - this.gammaBytesRemained) + i6;
                byteArray[length] = (byte) (byteArray[length] ^ bArr[i6 + i]);
            }
            System.arraycopy(byteArray, byteArray.length - this.gammaBytesRemained, bArr2, i3, i5);
            this.processedByteCount += i5;
            this.gammaBytesRemained -= i5;
            this.internalState = Array.toIntArray(byteArray);
            i4 = i5;
        } else {
            i4 = 0;
        }
        int i7 = i2 - i4;
        int i8 = this.byteBlockSize;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        try {
            ((SecretKeySpec) this.key).encryptCFB(bArr2, i4 + i3, bArr, i4 + i, i9, this.internalState, this.param);
            this.processedByteCount += this.byteBlockSize * i9;
            if (i10 == 0) {
                return computeRequiredLen;
            }
            try {
                this.key.encrypt(16, this.internalState, null, this.param);
                byte[] byteArray2 = Array.toByteArray(this.internalState);
                for (int i11 = 0; i11 < i10; i11++) {
                    byteArray2[i11] = (byte) (byteArray2[i11] ^ bArr[b64.b(i9, this.byteBlockSize, i11 + i4, i)]);
                }
                System.arraycopy(byteArray2, 0, bArr2, b64.b(i9, this.byteBlockSize, i4, i3), i10);
                this.gammaBytesRemained = this.byteBlockSize - i10;
                this.internalState = Array.toIntArray(byteArray2);
                this.processedByteCount += i10;
                return computeRequiredLen;
            } catch (InvalidKeyException e) {
                resetInit();
                InvalidParameterException invalidParameterException = new InvalidParameterException(resource.getString("CryptErr"));
                invalidParameterException.initCause(e);
                throw invalidParameterException;
            }
        } catch (InvalidKeyException e2) {
            resetInit();
            InvalidParameterException invalidParameterException2 = new InvalidParameterException(resource.getString("CryptErr"));
            invalidParameterException2.initCause(e2);
            throw invalidParameterException2;
        }
    }

    public byte[] engineGetIV() {
        try {
            JCPLogger.enter();
            byte[] byteArray = this.isIVSet ? Array.toByteArray(this.synchro) : null;
            JCPLogger.exit();
            return byteArray;
        } catch (Error e) {
            resetInit();
            throw e;
        } catch (RuntimeException e2) {
            resetInit();
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0073, code lost:
    
        if (((ru.CryptoPro.JCP.params.OmacParamsSpec) r8).isCms() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce A[Catch: InvalidAlgorithmParameterException -> 0x0019, InvalidKeyException -> 0x001c, RuntimeException -> 0x001f, Error -> 0x0022, TryCatch #2 {Error -> 0x0022, RuntimeException -> 0x001f, InvalidAlgorithmParameterException -> 0x0019, InvalidKeyException -> 0x001c, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000e, B:8:0x0012, B:9:0x00c1, B:11:0x00ce, B:13:0x00db, B:14:0x00e2, B:16:0x00e6, B:18:0x00eb, B:19:0x00f4, B:23:0x00fe, B:24:0x0111, B:27:0x0104, B:29:0x010e, B:30:0x0025, B:32:0x0029, B:33:0x002d, B:35:0x0031, B:36:0x0042, B:38:0x0046, B:39:0x0058, B:41:0x005c, B:43:0x0075, B:45:0x007a, B:47:0x007e, B:50:0x009d, B:52:0x00a6, B:53:0x00af, B:54:0x00bf, B:56:0x0117, B:57:0x0124), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6 A[Catch: InvalidAlgorithmParameterException -> 0x0019, InvalidKeyException -> 0x001c, RuntimeException -> 0x001f, Error -> 0x0022, TryCatch #2 {Error -> 0x0022, RuntimeException -> 0x001f, InvalidAlgorithmParameterException -> 0x0019, InvalidKeyException -> 0x001c, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000e, B:8:0x0012, B:9:0x00c1, B:11:0x00ce, B:13:0x00db, B:14:0x00e2, B:16:0x00e6, B:18:0x00eb, B:19:0x00f4, B:23:0x00fe, B:24:0x0111, B:27:0x0104, B:29:0x010e, B:30:0x0025, B:32:0x0029, B:33:0x002d, B:35:0x0031, B:36:0x0042, B:38:0x0046, B:39:0x0058, B:41:0x005c, B:43:0x0075, B:45:0x007a, B:47:0x007e, B:50:0x009d, B:52:0x00a6, B:53:0x00af, B:54:0x00bf, B:56:0x0117, B:57:0x0124), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb A[Catch: InvalidAlgorithmParameterException -> 0x0019, InvalidKeyException -> 0x001c, RuntimeException -> 0x001f, Error -> 0x0022, TryCatch #2 {Error -> 0x0022, RuntimeException -> 0x001f, InvalidAlgorithmParameterException -> 0x0019, InvalidKeyException -> 0x001c, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000e, B:8:0x0012, B:9:0x00c1, B:11:0x00ce, B:13:0x00db, B:14:0x00e2, B:16:0x00e6, B:18:0x00eb, B:19:0x00f4, B:23:0x00fe, B:24:0x0111, B:27:0x0104, B:29:0x010e, B:30:0x0025, B:32:0x0029, B:33:0x002d, B:35:0x0031, B:36:0x0042, B:38:0x0046, B:39:0x0058, B:41:0x005c, B:43:0x0075, B:45:0x007a, B:47:0x007e, B:50:0x009d, B:52:0x00a6, B:53:0x00af, B:54:0x00bf, B:56:0x0117, B:57:0x0124), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec;
        SecretKeyInterface extractSpec;
        IvParameterSpec ivParameterSpec2;
        try {
            JCPLogger.enter();
            if (!ss61.a) {
                throw new InvalidKeyException(resource.getString("NoCipherLicense"));
            }
            resetInit();
            CryptParamsInterface cryptParamsInterface = null;
            if (algorithmParameterSpec != null) {
                if (algorithmParameterSpec instanceof CryptParamsInterface) {
                    cryptParamsInterface = (CryptParamsInterface) algorithmParameterSpec;
                    ivParameterSpec = null;
                } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                    ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                } else if (algorithmParameterSpec instanceof GostCipherSpecImpl) {
                    cryptParamsInterface = (CryptParamsInterface) ((GostCipherSpecImpl) algorithmParameterSpec).getCryptParameters();
                    ivParameterSpec = ((GostCipherSpecImpl) algorithmParameterSpec).getIvParameters();
                } else if (algorithmParameterSpec instanceof Kexp15ParamsSpec) {
                    this.baseUkm = ((Kexp15ParamsSpec) algorithmParameterSpec).getBaseUkm();
                    this.extendKeyUkm = ((Kexp15ParamsSpec) algorithmParameterSpec).getExtendKeyUkm();
                } else if (algorithmParameterSpec instanceof OmacParamsSpec) {
                    ivParameterSpec2 = new IvParameterSpec(((OmacParamsSpec) algorithmParameterSpec).getIvValue());
                    this.omacParamsSpec = (OmacParamsSpec) algorithmParameterSpec;
                } else {
                    if (!(algorithmParameterSpec instanceof G3412ParamsSpec)) {
                        InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(resource.getString("InvPar"));
                        JCPLogger.warning(invalidAlgorithmParameterException);
                        throw invalidAlgorithmParameterException;
                    }
                    ivParameterSpec2 = new IvParameterSpec(((G3412ParamsSpec) algorithmParameterSpec).getIV());
                    this.gammaBlockLen = ((G3412ParamsSpec) algorithmParameterSpec).getGammaLen();
                    if (((G3412ParamsSpec) algorithmParameterSpec).isCms()) {
                        setMixBlockSize(true);
                        ivParameterSpec = ivParameterSpec2;
                    } else {
                        if (((G3412ParamsSpec) algorithmParameterSpec).getMixBlockSize() != 0) {
                            this.mixBlockSize = ((G3412ParamsSpec) algorithmParameterSpec).getMixBlockSize();
                        }
                        ivParameterSpec = ivParameterSpec2;
                    }
                }
                a(i);
                extractSpec = GostSecretKey.extractSpec(key);
                this.key = extractSpec;
                if (extractSpec instanceof SecretKeySpec) {
                    ((SecretKeySpec) extractSpec).setAllowExtra1K(allowAdditionalKb(i));
                    int i2 = this.gammaBlockLen;
                    if (i2 != 0) {
                        ((SecretKeySpec) this.key).setGammaBlockLen(i2);
                    }
                }
                if (this.extendKeyUkm != null) {
                    extendExportKey();
                }
                if (cryptParamsInterface == null) {
                    cryptParamsInterface = (CryptParamsInterface) this.key.getParams();
                }
                this.param = cryptParamsInterface;
                int i3 = this.mode & 16;
                if (ivParameterSpec == null) {
                    if (i3 != 0) {
                        JCPLogger.warning("ECB mode cannot use IV");
                    } else {
                        setAndSaveIV(ivParameterSpec.getIV());
                    }
                } else if (i3 == 0) {
                    chooseIV(key);
                }
                this.isInited = true;
                JCPLogger.exit();
            }
            ivParameterSpec = null;
            a(i);
            extractSpec = GostSecretKey.extractSpec(key);
            this.key = extractSpec;
            if (extractSpec instanceof SecretKeySpec) {
            }
            if (this.extendKeyUkm != null) {
            }
            if (cryptParamsInterface == null) {
            }
            this.param = cryptParamsInterface;
            int i32 = this.mode & 16;
            if (ivParameterSpec == null) {
            }
            this.isInited = true;
            JCPLogger.exit();
        } catch (Error e) {
            resetInit();
            throw e;
        } catch (RuntimeException e2) {
            resetInit();
            throw e2;
        } catch (InvalidAlgorithmParameterException e3) {
            resetInit();
            throw e3;
        } catch (InvalidKeyException e4) {
            resetInit();
            throw e4;
        }
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        try {
            JCPLogger.enter();
            if (str.equalsIgnoreCase("ECB")) {
                this.mode |= 16;
            } else if (str.equalsIgnoreCase("CBC")) {
                this.mode |= 32;
            } else {
                if (!str.equalsIgnoreCase("CNT") && !str.equalsIgnoreCase("OFB")) {
                    if (str.equalsIgnoreCase("CFB")) {
                        this.mode |= 128;
                    } else if (str.equals("CTR")) {
                        this.mode |= 256;
                    } else {
                        if (str.equals("CTR_ACPKM")) {
                            this.mode |= 256;
                        } else if (str.equals("OMAC_CTR")) {
                            this.mode |= 1024;
                        } else if (str.equalsIgnoreCase("PRO_EXPORT")) {
                            this.mode |= 2048;
                        } else if (str.equals("KEXP_2015_M_EXPORT")) {
                            this.mode |= 16384;
                        } else if (str.equals("KEXP_2015_K_EXPORT")) {
                            this.mode |= 32768;
                        } else if (str.equalsIgnoreCase("SIMPLE_EXPORT")) {
                            this.mode |= 4096;
                        } else {
                            if (!str.equalsIgnoreCase("PRO12_EXPORT")) {
                                NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException(resource.getString("ModeNotSupp"));
                                JCPLogger.warning(noSuchAlgorithmException);
                                throw noSuchAlgorithmException;
                            }
                            this.mode |= 8192;
                        }
                        this.usePromix = true;
                    }
                }
                this.mode |= 64;
            }
            JCPLogger.exit();
        } catch (Error e) {
            this.mode = 0;
            resetInit();
            throw e;
        } catch (RuntimeException e2) {
            this.mode = 0;
            resetInit();
            throw e2;
        } catch (NoSuchAlgorithmException e3) {
            this.mode = 0;
            resetInit();
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: NoSuchAlgorithmException -> 0x0029, RuntimeException -> 0x002d, Error -> 0x0031, InvalidKeyException -> 0x0050, TRY_ENTER, TryCatch #6 {InvalidKeyException -> 0x0050, blocks: (B:3:0x0002, B:17:0x0063, B:20:0x006c, B:21:0x007c, B:28:0x0055, B:26:0x0091, B:31:0x007e, B:32:0x0090, B:36:0x003e, B:37:0x004f), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[Catch: NoSuchAlgorithmException -> 0x0029, RuntimeException -> 0x002d, Error -> 0x0031, InvalidKeyException -> 0x0050, TryCatch #6 {InvalidKeyException -> 0x0050, blocks: (B:3:0x0002, B:17:0x0063, B:20:0x006c, B:21:0x007c, B:28:0x0055, B:26:0x0091, B:31:0x007e, B:32:0x0090, B:36:0x003e, B:37:0x004f), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        byte[] bArr2;
        SecretKeyInterface unwrap;
        try {
            try {
                JCPLogger.enter();
                checkInited(4, "NotInitUnwrap");
                int i2 = this.mode;
                boolean z = (i2 & 4096) == 0;
                boolean z2 = (i2 & 8192) != 0;
                try {
                    try {
                        bArr2 = bArr;
                        try {
                            unwrap = this.key.unwrap(bArr2, this.synchro, this.param, z, z2);
                        } catch (InvalidKeyException e) {
                            e = e;
                            InvalidKeyException invalidKeyException = e;
                            if (!z2) {
                                throw invalidKeyException;
                            }
                            try {
                                unwrap = this.key.unwrap(bArr2, this.synchro, this.param, z, false);
                                if (i != 3) {
                                }
                            } catch (KeyManagementException e2) {
                                InvalidKeyException invalidKeyException2 = new InvalidKeyException(resource.getString("UnwrapErr"));
                                invalidKeyException2.initCause(e2);
                                JCPLogger.warning(invalidKeyException2);
                                throw invalidKeyException2;
                            }
                        }
                    } catch (KeyManagementException e3) {
                        InvalidKeyException invalidKeyException3 = new InvalidKeyException(resource.getString("UnwrapErr"));
                        invalidKeyException3.initCause(e3);
                        JCPLogger.warning(invalidKeyException3);
                        throw invalidKeyException3;
                    }
                } catch (InvalidKeyException e4) {
                    e = e4;
                    bArr2 = bArr;
                }
                if (i != 3) {
                    JCPLogger.exit();
                    return new GostSecretKey(unwrap);
                }
                NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException(resource.getString("InvalidKeyType"));
                JCPLogger.warning(noSuchAlgorithmException);
                throw noSuchAlgorithmException;
            } catch (InvalidKeyException e5) {
                resetInit();
                throw e5;
            }
        } catch (Error e6) {
            resetInit();
            throw e6;
        } catch (RuntimeException e7) {
            resetInit();
            throw e7;
        } catch (NoSuchAlgorithmException e8) {
            resetInit();
            throw e8;
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        int encryptCFB;
        try {
            checkInited(3, "NotInitCrypt");
            if (i2 == 0 && this.bufferPos == 0) {
                return 0;
            }
            int computeRequiredLen = computeRequiredLen(i2);
            if (bArr2.length - i3 < computeRequiredLen) {
                ShortBufferException shortBufferException = new ShortBufferException();
                JCPLogger.enter();
                JCPLogger.thrown(shortBufferException);
                throw shortBufferException;
            }
            if (bArr == bArr2 && i3 > i && i3 < i + i2) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("OverEncryption");
                JCPLogger.enter();
                JCPLogger.thrown(illegalArgumentException);
                throw illegalArgumentException;
            }
            int i4 = this.mode;
            if ((i4 & 1) == 0) {
                if ((i4 & 128) != 0) {
                    encryptCFB = decryptCFB(bArr, i, i2, bArr2, i3);
                } else if ((i4 & 64) != 0) {
                    encryptCFB = cryptCNT(bArr, i, i2, bArr2, i3);
                } else {
                    if ((i4 & 256) == 0) {
                        if ((i4 & 1024) != 0) {
                            encryptCFB = cryptOmacCTR(bArr, i, i2, bArr2, i3);
                        } else {
                            if ((i4 & 16) == 0 && (i4 & 32) == 0) {
                                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(resource.getString(ErrorStrings.STR_INV_DECRYPT_MODE));
                                JCPLogger.enter();
                                JCPLogger.warning(illegalArgumentException2);
                                throw illegalArgumentException2;
                            }
                            encryptCFB = blockCrypt(bArr, i, i2, bArr2, i3);
                        }
                    }
                    encryptCFB = cryptCTR(bArr, i, i2, bArr2, i3);
                }
            } else if ((i4 & 128) != 0) {
                encryptCFB = encryptCFB(bArr, i, i2, bArr2, i3);
            } else {
                if ((i4 & 64) == 0) {
                    if ((i4 & 256) != 0) {
                        encryptCFB = cryptCTR(bArr, i, i2, bArr2, i3);
                    } else {
                        if ((i4 & 1024) == 0) {
                            if ((i4 & 16) == 0 && (i4 & 32) == 0) {
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(resource.getString(ErrorStrings.STR_INV_ENCRYPT_MODE));
                                JCPLogger.enter();
                                JCPLogger.warning(illegalArgumentException3);
                                throw illegalArgumentException3;
                            }
                            encryptCFB = blockCrypt(bArr, i, i2, bArr2, i3);
                        }
                        encryptCFB = cryptOmacCTR(bArr, i, i2, bArr2, i3);
                    }
                }
                encryptCFB = cryptCNT(bArr, i, i2, bArr2, i3);
            }
            if (computeRequiredLen == encryptCFB) {
                return computeRequiredLen;
            }
            ShortBufferException shortBufferException2 = new ShortBufferException();
            JCPLogger.enter();
            JCPLogger.thrown(shortBufferException2);
            throw shortBufferException2;
        } catch (Error e) {
            resetInit();
            throw e;
        } catch (RuntimeException e2) {
            resetInit();
            throw e2;
        } catch (ShortBufferException e3) {
            resetInit();
            throw e3;
        }
    }

    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        try {
            JCPLogger.enter();
            checkInited(8, "NotInitWrap");
            if (!(key instanceof GostSecretKey)) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("InvalidKeyType"));
                JCPLogger.warning(invalidKeyException);
                throw invalidKeyException;
            }
            SecretKeyInterface secretKeyInterface = (SecretKeyInterface) ((GostSecretKey) key).getSpec();
            int i = this.mode;
            byte[] wrap = secretKeyInterface.wrap(this.key, this.synchro, this.param, (i & 4096) == 0, (i & 8192) != 0);
            JCPLogger.exit();
            return wrap;
        } catch (Error e) {
            resetInit();
            throw e;
        } catch (RuntimeException e2) {
            resetInit();
            throw e2;
        } catch (InvalidKeyException e3) {
            resetInit();
            throw e3;
        }
    }

    public void extendExportKey() throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new UnsupportedOperationException();
    }

    public int getMode() {
        return this.mode;
    }

    public AlgorithmParameters getParameters() {
        if (!this.isInited) {
            return null;
        }
        try {
            if (this.omacParamsSpec != null) {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(JCP.GOST_OMAC_NAME, "Crypto");
                algorithmParameters.init(this.omacParamsSpec.getOmacValue());
                return algorithmParameters;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public long getProcessedByteCount() {
        return this.processedByteCount;
    }

    public void getRandomBytes(byte[] bArr, int i, int i2) {
        SecretKeyInterface secretKeyInterface = this.key;
        if (secretKeyInterface != null) {
            ((SecretKeySpec) secretKeyInterface).getRandomBytes(bArr, i, i2);
        } else {
            w511.q();
        }
    }

    public int getReqIVLen() {
        if ((this.mode & 16) != 0) {
            return 0;
        }
        return this.byteBlockSize;
    }

    public int getUnprocessedDataSize(int i) {
        try {
            JCPLogger.enter();
            checkInited(3, "NotInitCrypt");
            JCPLogger.exit();
            return isNotGammaMode() ? this.bufferPos + i : i;
        } catch (Error e) {
            this.resetInit();
            throw e;
        } catch (RuntimeException e2) {
            this.resetInit();
            throw e2;
        }
    }

    public boolean isNotGammaMode() {
        int i = this.mode;
        return ((i & 16) == 0 && (i & 32) == 0) ? false : true;
    }

    public Object readResolve() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public void resetFinal() throws InvalidKeyException, InvalidAlgorithmParameterException {
        ((SecretKeySpec) this.key).resetKey();
        resetIV();
        this.processedByteCount = 0L;
        this.gammaBytesRemained = 0;
        this.bufferPos = 0;
        Arrays.fill(this.internalState, 0);
        Arrays.fill(this.buffer, (byte) 0);
        this.doProcessIV = true;
        this.isInited = true;
    }

    public void resetIV() throws InvalidAlgorithmParameterException {
        int[] iArr = this.a;
        if (iArr != null) {
            setIV(iArr);
        } else if (this.isIVSet) {
            this.key.setIVLen(getReqIVLen());
            setIV(this.key.getIV());
        }
    }

    public void resetInit() {
        this.mode &= -16;
        this.isInited = false;
        this.doProcessIV = true;
        this.processedByteCount = 0L;
        this.gammaBytesRemained = 0;
        this.bufferPos = 0;
        this.isIVSet = false;
        Arrays.fill(this.internalState, 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.synchro, 0);
        this.param = null;
        this.baseUkm = null;
        this.extendKeyUkm = null;
        this.omacParamsSpec = null;
        clearKey();
    }

    public void setAndSaveIV(byte[] bArr) throws InvalidAlgorithmParameterException {
        this.a = Array.toIntArray(bArr);
        setIV(bArr);
    }

    public void setByteBlockSize() {
        this.byteBlockSize = 8;
    }

    public void setDefaultPromix() {
        this.usePromix = false;
    }

    public void setIV(int[] iArr) throws InvalidAlgorithmParameterException {
        checkIVLen(iArr.length << 2);
        this.synchro = Array.copy(iArr);
        this.isIVSet = true;
    }

    public void setMixBlockSize(boolean z) {
        this.mixBlockSize = 0;
    }

    public Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public void setIV(byte[] bArr) throws InvalidAlgorithmParameterException {
        checkIVLen(bArr.length);
        this.synchro = Array.toIntArray(bArr);
        this.isIVSet = true;
    }
}
