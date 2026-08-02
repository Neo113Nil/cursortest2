package ru.CryptoPro.Crypto.Cipher;

import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import ru.CryptoPro.JCP.Key.MagmaKeySpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class GostMagmaMac extends GostMac {
    protected static final int MAGMA_BLOCK_SIZE = 8;
    protected static final int MAGMA_MAC_SIZE = 4;
    protected byte[] byteUz;

    public GostMagmaMac(GostMagmaMac gostMagmaMac) throws CloneNotSupportedException {
        super(gostMagmaMac);
        this.byteUz = Array.copy(gostMagmaMac.byteUz);
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostMac, javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new GostMagmaMac(this);
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostMac, javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        int i;
        try {
            JCPLogger.enter();
            try {
                if (this.count != 0 && ((i = this.bufferPos) == 0 || i == this.byteBlockSize)) {
                    lastStep(0);
                    int engineGetMacLength = engineGetMacLength();
                    byte[] bArr = new byte[engineGetMacLength];
                    Array.copy(this.byteUz, 0, bArr, 0, engineGetMacLength);
                    engineReset();
                    this.lockUpdate = true;
                    JCPLogger.exit();
                    return bArr;
                }
                Arrays.fill(this.buffer, this.bufferPos, this.byteBlockSize, (byte) 0);
                byte[] bArr2 = this.buffer;
                int i2 = this.bufferPos;
                bArr2[i2] = (byte) (bArr2[i2] ^ DerValue.TAG_CONTEXT);
                lastStep(1);
                int engineGetMacLength2 = engineGetMacLength();
                byte[] bArr3 = new byte[engineGetMacLength2];
                Array.copy(this.byteUz, 0, bArr3, 0, engineGetMacLength2);
                engineReset();
                this.lockUpdate = true;
                JCPLogger.exit();
                return bArr3;
            } catch (InvalidKeyException e) {
                engineReset();
                InvalidParameterException invalidParameterException = new InvalidParameterException(GostMac.resource.getString("ImitaErr"));
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

    @Override // ru.CryptoPro.Crypto.Cipher.GostMac, javax.crypto.MacSpi
    public void engineReset() {
        super.engineReset();
        Arrays.fill(this.byteUz, (byte) 0);
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostMac, javax.crypto.MacSpi
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
            int i5 = i4 + i2;
            int i6 = this.byteBlockSize;
            if (i5 < i6) {
                System.arraycopy(bArr, i, this.buffer, i4, i2);
                this.bufferPos += i2;
            } else {
                if (i4 != 0) {
                    System.arraycopy(bArr, i, this.buffer, i4, i6 - i4);
                    int i7 = this.bufferPos + i2;
                    int i8 = this.byteBlockSize;
                    if (i7 == i8) {
                        this.count += i2;
                        this.bufferPos = i8;
                        return;
                    }
                    try {
                        step();
                        Arrays.fill(this.buffer, (byte) 0);
                        int i9 = this.byteBlockSize;
                        int i10 = this.bufferPos;
                        i3 = i9 - i10;
                        this.count += i9 - i10;
                        i2 -= i9 - i10;
                        this.bufferPos = 0;
                    } catch (InvalidKeyException e) {
                        engineReset();
                        InvalidParameterException invalidParameterException = new InvalidParameterException(GostMac.resource.getString("ImitaErr"));
                        invalidParameterException.initCause(e);
                        JCPLogger.enter();
                        JCPLogger.warning(invalidParameterException);
                        throw invalidParameterException;
                    }
                } else {
                    i3 = 0;
                }
                int i11 = this.byteBlockSize;
                int i12 = i2 % i11;
                int i13 = i2 / i11;
                if (i12 == 0 && i13 != 0) {
                    i13--;
                }
                try {
                    int i14 = i + i3;
                    ((MagmaKeySpec) this.key).imita(this.byteUz, bArr, i14, i13);
                    if (i12 == 0) {
                        i12 = this.byteBlockSize;
                    }
                    this.bufferPos = i12;
                    System.arraycopy(bArr, (i14 + i2) - i12, this.buffer, 0, i12);
                    Arrays.fill(this.buffer, this.bufferPos, this.byteBlockSize, (byte) 0);
                } catch (InvalidKeyException e2) {
                    engineReset();
                    InvalidParameterException invalidParameterException2 = new InvalidParameterException(GostMac.resource.getString("ImitaErr"));
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

    public void lastStep(int i) throws InvalidKeyException {
        ((MagmaKeySpec) this.key).getImita(this.byteUz, this.buffer, 0, i);
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostMac
    public void setDefaultSize() {
        this.byteBlockSize = 8;
        this.macSize = 4;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostMac
    public void step() throws InvalidKeyException {
        ((MagmaKeySpec) this.key).imita(this.byteUz, this.buffer, 0, 1);
    }

    public GostMagmaMac() {
        this.byteUz = new byte[this.byteBlockSize];
    }
}
