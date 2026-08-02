package ru.CryptoPro.Crypto.Cipher;

import defpackage.kbs;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import ru.CryptoPro.Crypto.Key.GostSecretKey;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.MagmaKExp15KeySpec;
import ru.CryptoPro.JCP.Key.MagmaKeySpec;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.KdfTreeDiversKeySpec;
import ru.CryptoPro.JCP.params.MacSizeSpec;
import ru.CryptoPro.JCP.params.OmacParamsSpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostCoreMagmaCipher extends GostCoreMeshedCipher {
    protected static final long MAX_ENCRYPTIONS_COUNT_CTR_ACPKM_SINGLE_MESSAGE_M = 2147483648L;
    protected static final int TIMES_CHANGE_KEY_M = 128;
    protected byte[] internalStateByte;
    protected byte[] storedGamma;
    protected byte[] synchroByte;
    protected int internalStateOff = 0;
    protected byte[] savedSynchroByte = null;
    protected int storedGammaOffset = 0;
    public boolean b = false;
    public boolean c = false;
    public SecretKeySpec d = null;
    public Mac e = null;

    public GostCoreMagmaCipher() {
        int i = this.byteBlockSize;
        this.internalStateByte = new byte[i];
        this.synchroByte = new byte[i];
        this.storedGamma = new byte[i];
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreMeshedCipher, ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public boolean allowAdditionalKb(int i) {
        return false;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public int blockCrypt(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        byte[] bArr3;
        if ((this.mode & 32) != 0 && this.doProcessIV) {
            this.internalStateByte = Array.copy(this.synchroByte);
            this.internalStateOff = 0;
            this.doProcessIV = false;
        }
        int computeRequiredLen = computeRequiredLen(i2);
        int i7 = this.bufferPos;
        if (i7 != 0) {
            int i8 = i7 + i2;
            int i9 = this.byteBlockSize;
            byte[] bArr4 = this.buffer;
            if (i8 < i9) {
                System.arraycopy(bArr, i, bArr4, i7, i2);
                this.bufferPos += i2;
                this.processedByteCount += i2;
                z = true;
                i4 = i2;
                i5 = 0;
                i6 = 0;
            } else {
                System.arraycopy(bArr, i, bArr4, i7, i9 - i7);
                try {
                    int i10 = this.mode;
                    if ((i10 & 1) != 0) {
                        ((MagmaKeySpec) this.key).encrypt(i10 & Consts.MODE_CRYPT_MASK, this.buffer, this.internalStateByte, this.internalStateOff, this.param);
                    } else if ((i10 & 2) != 0) {
                        ((MagmaKeySpec) this.key).decrypt(i10 & Consts.MODE_CRYPT_MASK, this.buffer, this.internalStateByte, this.internalStateOff, this.param);
                    }
                    byte[] bArr5 = this.buffer;
                    Array.copy(bArr5, 0, bArr2, i3, bArr5.length);
                    Arrays.fill(this.buffer, (byte) 0);
                    int i11 = this.byteBlockSize;
                    int i12 = this.bufferPos;
                    this.processedByteCount += i11 - i12;
                    this.bufferPos = 0;
                    i4 = i2 - (i11 - i12);
                    i5 = i11;
                    i6 = i11 - i12;
                    z = false;
                } catch (InvalidKeyException e) {
                    resetInit();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCoreCipher.resource.getString("CryptErr"));
                    illegalArgumentException.initCause(e);
                    throw illegalArgumentException;
                }
            }
        } else {
            i4 = i2;
            i5 = 0;
            z = false;
            i6 = 0;
        }
        if (z) {
            return computeRequiredLen;
        }
        int i13 = i4 / this.byteBlockSize;
        try {
            int i14 = this.mode;
            if ((i14 & 1) != 0 && (i14 & 16) != 0) {
                ((MagmaKeySpec) this.key).encryptECB(bArr2, i3 + i5, bArr, i + i6, i13, this.param);
            } else if ((i14 & 2) == 0 || (i14 & 16) == 0) {
                int i15 = i5;
                if ((i14 & 1) != 0 && (i14 & 32) != 0) {
                    this.internalStateOff = ((MagmaKeySpec) this.key).encryptCBC(bArr2, i15 + i3, bArr, i + i6, i13, this.internalStateByte, this.internalStateOff, this.param);
                } else if ((i14 & 2) != 0 && (i14 & 32) != 0) {
                    bArr3 = bArr;
                    this.internalStateOff = ((MagmaKeySpec) this.key).decryptCBC(bArr2, i15 + i3, bArr3, i + i6, i13, this.internalStateByte, this.internalStateOff, this.param);
                    int i16 = i4 % this.byteBlockSize;
                    this.bufferPos = i16;
                    System.arraycopy(bArr3, ((i6 + i) + i4) - i16, this.buffer, 0, i16);
                    Arrays.fill(this.buffer, this.bufferPos, this.byteBlockSize, (byte) 0);
                    this.processedByteCount += i4;
                    return computeRequiredLen;
                }
            } else {
                ((MagmaKeySpec) this.key).decryptECB(bArr2, i5 + i3, bArr, i + i6, i13, this.param);
            }
            bArr3 = bArr;
            int i162 = i4 % this.byteBlockSize;
            this.bufferPos = i162;
            System.arraycopy(bArr3, ((i6 + i) + i4) - i162, this.buffer, 0, i162);
            Arrays.fill(this.buffer, this.bufferPos, this.byteBlockSize, (byte) 0);
            this.processedByteCount += i4;
            return computeRequiredLen;
        } catch (InvalidKeyException e2) {
            resetInit();
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(GostCoreCipher.resource.getString("CryptErr"));
            illegalArgumentException2.initCause(e2);
            throw illegalArgumentException2;
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreMeshedCipher
    public boolean canProceedNewBytes(int i) {
        return this.processedByteCount + ((long) i) <= ((long) this.byteBlockSize) * MAX_ENCRYPTIONS_COUNT_CTR_ACPKM_SINGLE_MESSAGE_M;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void changeKey() {
        try {
            this.key.changeKey(this.param);
        } catch (InvalidKeyException e) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCoreCipher.resource.getString(ErrorStrings.ERR_CHANGE));
            illegalArgumentException.initCause(e);
            JCPLogger.warning(illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void checkIVLen(int i) throws InvalidAlgorithmParameterException {
        int i2 = this.mode;
        if ((i2 & 256) != 0 && i < (this.byteBlockSize >> 1)) {
            kbs.t("Invalid IV length");
            return;
        }
        if (((i2 & 64) != 0 || (i2 & 32) != 0) && i % this.byteBlockSize != 0) {
            kbs.t("Invalid IV length");
            return;
        }
        if ((i2 & 128) != 0 && i < this.byteBlockSize) {
            kbs.t("Invalid IV length");
        } else {
            if ((i2 & 1024) == 0 || i >= (this.byteBlockSize >> 1) + 8) {
                return;
            }
            kbs.t("Invalid IV length");
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public int cryptCNT(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        if (this.doProcessIV) {
            this.internalStateByte = Array.copy(this.synchroByte);
            Arrays.fill(this.storedGamma, (byte) 0);
            this.internalStateOff = 0;
            this.storedGammaOffset = 0;
            this.doProcessIV = false;
        }
        int computeRequiredLen = computeRequiredLen(i2);
        int i5 = this.gammaBlockLen;
        if (i5 == 0) {
            i5 = this.byteBlockSize;
        }
        int i6 = this.gammaBytesRemained;
        if (i6 != 0) {
            if (i2 < i6) {
                i6 = i2;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                byte[] bArr3 = this.storedGamma;
                int i8 = this.storedGammaOffset;
                bArr2[i3 + i7] = (byte) (bArr3[i8] ^ bArr[i + i7]);
                bArr3[i8] = 0;
                this.storedGammaOffset = i8 + 1;
            }
            this.processedByteCount += i6;
            int i9 = this.gammaBytesRemained - i6;
            this.gammaBytesRemained = i9;
            if (i9 == 0) {
                this.storedGammaOffset = 0;
            }
            i4 = i6;
        }
        try {
            int i10 = i2 - i4;
            ((MagmaKeySpec) this.key).gammaOFB(bArr2, i4 + i3, bArr, i4 + i, i10, this.internalStateByte, this.internalStateOff, this.storedGamma, this.gammaBlockLen, this.param);
            this.processedByteCount += i10;
            int i11 = i10 % i5;
            if (i11 != 0) {
                this.gammaBytesRemained = i5 - i11;
            }
            return computeRequiredLen;
        } catch (InvalidKeyException e) {
            resetInit();
            InvalidParameterException invalidParameterException = new InvalidParameterException(GostCoreCipher.resource.getString("CryptErr"));
            invalidParameterException.initCause(e);
            throw invalidParameterException;
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public int cryptCTR(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        if (this.doProcessIV) {
            int iVLen = getIVLen() >> 1;
            Array.copy(this.synchroByte, 0, this.internalStateByte, 0, iVLen);
            Arrays.fill(this.internalStateByte, iVLen, r4.length - 1, (byte) 0);
            Arrays.fill(this.storedGamma, (byte) 0);
            this.internalStateOff = 0;
            this.storedGammaOffset = 0;
            this.doProcessIV = false;
        }
        int computeRequiredLen = computeRequiredLen(i2);
        int i5 = this.gammaBlockLen;
        if (i5 == 0) {
            i5 = this.byteBlockSize;
        }
        int i6 = this.gammaBytesRemained;
        if (i6 != 0) {
            if (i2 < i6) {
                i6 = i2;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                byte[] bArr3 = this.storedGamma;
                int i8 = this.storedGammaOffset;
                bArr2[i3 + i7] = (byte) (bArr3[i8] ^ bArr[i + i7]);
                bArr3[i8] = 0;
                this.storedGammaOffset = i8 + 1;
            }
            this.processedByteCount += i6;
            int i9 = this.gammaBytesRemained - i6;
            this.gammaBytesRemained = i9;
            if (i9 == 0) {
                this.storedGammaOffset = 0;
            }
            i4 = i6;
        }
        try {
            int i10 = i2 - i4;
            ((MagmaKeySpec) this.key).gammaCTR(bArr2, i4 + i3, bArr, i4 + i, i10, this.internalStateByte, this.storedGamma, this.gammaBlockLen, this.param);
            this.processedByteCount += i10;
            int i11 = i10 % i5;
            if (i11 != 0) {
                this.gammaBytesRemained = i5 - i11;
            }
            return computeRequiredLen;
        } catch (InvalidKeyException e) {
            resetInit();
            InvalidParameterException invalidParameterException = new InvalidParameterException(GostCoreCipher.resource.getString("CryptErr"));
            invalidParameterException.initCause(e);
            throw invalidParameterException;
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public int cryptOmacCTR(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.b) {
            try {
                diversOmacKeys();
                Mac mac = Mac.getInstance(getOmacAlg());
                this.e = mac;
                mac.init(new GostSecretKey(this.d), new MacSizeSpec(this.byteBlockSize));
                this.b = true;
            } catch (InvalidAlgorithmParameterException e) {
                resetInit();
                InvalidParameterException invalidParameterException = new InvalidParameterException(GostCoreCipher.resource.getString("CryptErr"));
                invalidParameterException.initCause(e);
                throw invalidParameterException;
            } catch (InvalidKeyException e2) {
                resetInit();
                InvalidParameterException invalidParameterException2 = new InvalidParameterException(GostCoreCipher.resource.getString("CryptErr"));
                invalidParameterException2.initCause(e2);
                throw invalidParameterException2;
            } catch (NoSuchAlgorithmException e3) {
                resetInit();
                InvalidParameterException invalidParameterException3 = new InvalidParameterException(GostCoreCipher.resource.getString("CryptErr"));
                invalidParameterException3.initCause(e3);
                throw invalidParameterException3;
            }
        }
        int cryptCTR = cryptCTR(bArr, i, i2, bArr2, i3);
        int i4 = this.mode & 1;
        Mac mac2 = this.e;
        if (i4 != 0) {
            mac2.update(bArr, i, i2);
            return cryptCTR;
        }
        mac2.update(bArr2, i3, cryptCTR);
        return cryptCTR;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public int decryptCFB(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        if (this.doProcessIV) {
            this.internalStateByte = Array.copy(this.synchroByte);
            Arrays.fill(this.storedGamma, (byte) 0);
            this.internalStateOff = 0;
            this.storedGammaOffset = 0;
            this.doProcessIV = false;
        }
        int computeRequiredLen = computeRequiredLen(i2);
        int i5 = this.gammaBlockLen;
        if (i5 == 0) {
            i5 = this.byteBlockSize;
        }
        int i6 = this.gammaBytesRemained;
        if (i6 != 0) {
            if (i2 < i6) {
                i6 = i2;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                byte[] bArr3 = this.internalStateByte;
                int i8 = this.internalStateOff;
                int i9 = i + i7;
                bArr3[i8] = bArr[i9];
                byte[] bArr4 = this.storedGamma;
                int i10 = this.storedGammaOffset;
                bArr2[i3 + i7] = (byte) (bArr[i9] ^ bArr4[i10]);
                int i11 = i8 + 1;
                this.internalStateOff = i11;
                if (i11 >= bArr3.length) {
                    this.internalStateOff = i11 - bArr3.length;
                }
                bArr4[i10] = 0;
                this.storedGammaOffset = i10 + 1;
            }
            this.processedByteCount += i6;
            int i12 = this.gammaBytesRemained - i6;
            this.gammaBytesRemained = i12;
            if (i12 == 0) {
                this.storedGammaOffset = 0;
            }
            i4 = i6;
        }
        try {
            int i13 = i2 - i4;
            ((MagmaKeySpec) this.key).decryptCFB(bArr2, i4 + i3, bArr, i4 + i, i13, this.internalStateByte, this.internalStateOff, this.storedGamma, this.gammaBlockLen, this.param);
            this.processedByteCount += i13;
            int i14 = i13 % i5;
            if (i14 != 0) {
                this.gammaBytesRemained = i5 - i14;
            }
            return computeRequiredLen;
        } catch (InvalidKeyException e) {
            resetInit();
            InvalidParameterException invalidParameterException = new InvalidParameterException(GostCoreCipher.resource.getString("CryptErr"));
            invalidParameterException.initCause(e);
            throw invalidParameterException;
        }
    }

    public void diversOmacKeys() throws InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr = new byte[8];
        Array.copy(this.synchroByte, ((MagmaKeySpec) this.key).getBlockLen() / 2, bArr, 0, 8);
        this.d = (SecretKeySpec) ((SpecKey) ((SecretKeySpec) this.key).diversKeyByBlob((String) null, new KdfTreeDiversKeySpec(null, "kdf tree".getBytes(), 2, bArr, 512, 1))).getSpec();
        this.key = (SecretKeySpec) ((SpecKey) ((SecretKeySpec) this.key).diversKeyByBlob((String) null, new KdfTreeDiversKeySpec(null, "kdf tree".getBytes(), 1, bArr, 512, 1))).getSpec();
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public int encryptCFB(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        if (this.doProcessIV) {
            this.internalStateByte = Array.copy(this.synchroByte);
            Arrays.fill(this.storedGamma, (byte) 0);
            this.internalStateOff = 0;
            this.storedGammaOffset = 0;
            this.doProcessIV = false;
        }
        int computeRequiredLen = computeRequiredLen(i2);
        int i5 = this.gammaBlockLen;
        if (i5 == 0) {
            i5 = this.byteBlockSize;
        }
        int i6 = this.gammaBytesRemained;
        if (i6 != 0) {
            if (i2 < i6) {
                i6 = i2;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                byte[] bArr3 = this.storedGamma;
                int i8 = this.storedGammaOffset;
                byte b = (byte) (bArr3[i8] ^ bArr[i + i7]);
                bArr2[i3 + i7] = b;
                byte[] bArr4 = this.internalStateByte;
                int i9 = this.internalStateOff;
                bArr4[i9] = b;
                int i10 = i9 + 1;
                this.internalStateOff = i10;
                if (i10 >= bArr4.length) {
                    this.internalStateOff = i10 - bArr4.length;
                }
                bArr3[i8] = 0;
                this.storedGammaOffset = i8 + 1;
            }
            this.processedByteCount += i6;
            int i11 = this.gammaBytesRemained - i6;
            this.gammaBytesRemained = i11;
            if (i11 == 0) {
                this.storedGammaOffset = 0;
            }
            i4 = i6;
        }
        try {
            int i12 = i2 - i4;
            ((MagmaKeySpec) this.key).encryptCFB(bArr2, i4 + i3, bArr, i4 + i, i12, this.internalStateByte, this.internalStateOff, this.storedGamma, this.gammaBlockLen, this.param);
            this.processedByteCount += i12;
            int i13 = i12 % i5;
            if (i13 != 0) {
                this.gammaBytesRemained = i5 - i13;
            }
            return computeRequiredLen;
        } catch (InvalidKeyException e) {
            resetInit();
            InvalidParameterException invalidParameterException = new InvalidParameterException(GostCoreCipher.resource.getString("CryptErr"));
            invalidParameterException.initCause(e);
            throw invalidParameterException;
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public byte[] engineGetIV() {
        try {
            JCPLogger.enter();
            byte[] copy = this.isIVSet ? Array.copy(this.synchroByte) : null;
            JCPLogger.exit();
            return copy;
        } catch (Error e) {
            resetInit();
            throw e;
        } catch (RuntimeException e2) {
            resetInit();
            throw e2;
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            JCPLogger.enter();
            checkInited(4, "NotInitUnwrap");
            int i2 = this.mode;
            if ((i2 & 16384) == 0 && (i2 & 32768) == 0) {
                throw new InvalidKeyException("Invalid export mode");
            }
            SecretKeyInterface secretKeyInterface = this.key;
            if (!(secretKeyInterface instanceof MagmaKExp15KeySpec)) {
                throw new InvalidKeyException(GostCoreCipher.resource.getString("InvalidKeyType"));
            }
            try {
                SecretKeyInterface unwrap = secretKeyInterface.unwrap(bArr, str, this.baseUkm, this.param);
                if (i == 3) {
                    JCPLogger.exit();
                    return new GostSecretKey(unwrap);
                }
                NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException(GostCoreCipher.resource.getString("InvalidKeyType"));
                JCPLogger.warning(noSuchAlgorithmException);
                throw noSuchAlgorithmException;
            } catch (KeyManagementException e) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(GostCoreCipher.resource.getString("UnwrapErr"));
                invalidKeyException.initCause(e);
                JCPLogger.warning(invalidKeyException);
                throw invalidKeyException;
            }
        } catch (Error e2) {
            resetInit();
            throw e2;
        } catch (RuntimeException e3) {
            resetInit();
            throw e3;
        } catch (InvalidKeyException e4) {
            resetInit();
            throw e4;
        } catch (NoSuchAlgorithmException e5) {
            resetInit();
            throw e5;
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        try {
            JCPLogger.enter();
            checkInited(8, "NotInitWrap");
            int i = this.mode;
            if ((i & 16384) == 0 && (i & 32768) == 0) {
                throw new InvalidKeyException("Invalid export mode");
            }
            if (!(key instanceof GostSecretKey)) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(GostCoreCipher.resource.getString("InvalidKeyType"));
                JCPLogger.warning(invalidKeyException);
                throw invalidKeyException;
            }
            if (!(this.key instanceof MagmaKExp15KeySpec)) {
                throw new InvalidKeyException(GostCoreCipher.resource.getString("InvalidKeyType"));
            }
            SecretKeyInterface secretKeyInterface = (SecretKeyInterface) ((GostSecretKey) key).getSpec();
            if (!(secretKeyInterface instanceof MagmaKeySpec)) {
                throw new InvalidKeyException(GostCoreCipher.resource.getString("InvalidKeyType"));
            }
            byte[] wrap = this.key.wrap(secretKeyInterface, this.baseUkm, this.param);
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

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void extendExportKey() throws InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeyInterface secretKeyInterface = this.key;
        if (!(secretKeyInterface instanceof MagmaKExp15KeySpec)) {
            throw new InvalidAlgorithmParameterException(GostCoreCipher.resource.getString("InvPar"));
        }
        if (((MagmaKExp15KeySpec) secretKeyInterface).isLongKey()) {
            return;
        }
        this.key = (SecretKeyInterface) ((SpecKey) ((MagmaKExp15KeySpec) this.key).diversKeyByBlob((String) null, new KdfTreeDiversKeySpec(null, "kdf tree".getBytes(), 1, Array.copy(this.extendKeyUkm), 512, 1))).getSpec();
    }

    public int getIVLen() {
        return 8;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreMeshedCipher
    public int getKeyMeshingLength() {
        int i = this.mixBlockSize;
        int i2 = this.gammaBlockLen;
        if (i2 == 0) {
            i2 = this.byteBlockSize;
        }
        return i * i2;
    }

    public String getOmacAlg() {
        return JCP.GOST_M_IMIT_NAME;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public int getReqIVLen() {
        int i = this.byteBlockSize;
        int i2 = this.mode;
        if ((i2 & 16) != 0) {
            return 0;
        }
        if ((i2 & 32) == 0 && (i2 & 64) == 0 && (i2 & 128) == 0) {
            if ((i2 & 256) != 0) {
                return i >> 1;
            }
            if ((i2 & 1024) != 0) {
                return (i >> 1) + 8;
            }
        }
        return i;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void resetFinal() throws InvalidKeyException, InvalidAlgorithmParameterException {
        GostCoreMagmaCipher gostCoreMagmaCipher;
        if ((this.mode & 1024) != 0) {
            byte[] doFinal = this.e.doFinal();
            byte[] bArr = new byte[this.byteBlockSize];
            gostCoreMagmaCipher = this;
            gostCoreMagmaCipher.cryptCTR(doFinal, 0, doFinal.length, bArr, 0);
            int i = gostCoreMagmaCipher.mode;
            if ((i & 1) != 0) {
                gostCoreMagmaCipher.omacParamsSpec = new OmacParamsSpec(bArr);
            } else if ((i & 2) != 0) {
                if (gostCoreMagmaCipher.c) {
                    kbs.t("Cipher has already been reset in this mode and doesn't contain valid OMAC. Proper init() is required before decrypting.");
                    return;
                }
                OmacParamsSpec omacParamsSpec = gostCoreMagmaCipher.omacParamsSpec;
                if (omacParamsSpec != null) {
                    try {
                        byte[] omacValue = omacParamsSpec.getOmacValue();
                        if (omacValue == null) {
                            kbs.t("OMAC_CTR cipher mode requires OMAC value");
                            return;
                        } else if (omacValue.length != gostCoreMagmaCipher.byteBlockSize) {
                            kbs.t("Invalid OMAC len");
                            return;
                        } else if (!Array.compare(bArr, omacValue)) {
                            kbs.t("OMAC value is incorrect");
                            return;
                        }
                    } catch (IOException e) {
                        throw new InvalidAlgorithmParameterException(e);
                    }
                }
            }
        } else {
            gostCoreMagmaCipher = this;
        }
        gostCoreMagmaCipher.c = true;
        gostCoreMagmaCipher.d = null;
        gostCoreMagmaCipher.e = null;
        super.resetFinal();
        Arrays.fill(gostCoreMagmaCipher.internalStateByte, (byte) 0);
        gostCoreMagmaCipher.internalStateOff = 0;
        Arrays.fill(gostCoreMagmaCipher.storedGamma, (byte) 0);
        gostCoreMagmaCipher.storedGammaOffset = 0;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void resetIV() throws InvalidAlgorithmParameterException {
        byte[] bArr = this.savedSynchroByte;
        if (bArr != null) {
            setIV(bArr);
        } else if (this.isIVSet) {
            this.key.setIVLen(getReqIVLen());
            setIV(this.key.getIV());
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void resetInit() {
        super.resetInit();
        this.c = false;
        this.b = false;
        this.d = null;
        byte[] bArr = this.internalStateByte;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        this.internalStateOff = 0;
        byte[] bArr2 = this.synchroByte;
        if (bArr2 != null) {
            Arrays.fill(bArr2, (byte) 0);
        }
        byte[] bArr3 = this.savedSynchroByte;
        if (bArr3 != null) {
            Arrays.fill(bArr3, (byte) 0);
        }
        byte[] bArr4 = this.storedGamma;
        if (bArr4 != null) {
            Arrays.fill(bArr4, (byte) 0);
        }
        this.storedGammaOffset = 0;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void setAndSaveIV(byte[] bArr) throws InvalidAlgorithmParameterException {
        this.synchroByte = Array.copy(bArr);
        setIV(bArr);
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreMeshedCipher, ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void setDefaultPromix() {
        this.usePromix = false;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void setIV(int[] iArr) throws InvalidAlgorithmParameterException {
        checkIVLen(iArr.length << 2);
        this.synchroByte = Array.toByteArray(iArr);
        this.isIVSet = true;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void setMixBlockSize(boolean z) {
        this.mixBlockSize = z ? 1024 : 128;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void setIV(byte[] bArr) throws InvalidAlgorithmParameterException {
        checkIVLen(bArr.length);
        this.synchroByte = Array.copy(bArr);
        this.isIVSet = true;
    }
}
