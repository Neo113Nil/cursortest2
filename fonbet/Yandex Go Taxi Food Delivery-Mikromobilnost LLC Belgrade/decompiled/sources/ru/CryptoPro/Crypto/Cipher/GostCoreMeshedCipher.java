package ru.CryptoPro.Crypto.Cipher;

import javax.crypto.ShortBufferException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostCoreMeshedCipher extends GostCoreCipher {
    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public boolean allowAdditionalKb(int i) {
        return false;
    }

    public boolean canProceedNewBytes(int i) {
        return true;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (!this.usePromix) {
            return super.engineUpdate(bArr, i, i2, bArr2, i3);
        }
        int i4 = i2;
        try {
            checkInited(3, "NotInitCrypt");
            int computeRequiredLen = computeRequiredLen(i4);
            if (bArr2.length < i3 + computeRequiredLen) {
                ShortBufferException shortBufferException = new ShortBufferException();
                JCPLogger.enter();
                JCPLogger.thrown(shortBufferException);
                throw shortBufferException;
            }
            if (!canProceedNewBytes(i4)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCoreCipher.resource.getString(ErrorStrings.BYTE_LIMIT));
                JCPLogger.enter();
                JCPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            int processedByteCount = ((int) getProcessedByteCount()) & (getKeyMeshingLength() - 1);
            if (processedByteCount != 0) {
                int keyMeshingLength = getKeyMeshingLength() - processedByteCount > i4 ? i4 : getKeyMeshingLength() - processedByteCount;
                int engineUpdate = super.engineUpdate(bArr, i, keyMeshingLength, bArr2, i3);
                i += keyMeshingLength;
                int i5 = i4 - keyMeshingLength;
                i3 += engineUpdate;
                if (getProcessedByteCount() % getKeyMeshingLength() == 0) {
                    changeKey();
                }
                i4 = i5;
            }
            while (i4 >= getKeyMeshingLength()) {
                int engineUpdate2 = super.engineUpdate(bArr, i, getKeyMeshingLength(), bArr2, i3);
                i += getKeyMeshingLength();
                i4 -= getKeyMeshingLength();
                i3 += engineUpdate2;
                changeKey();
            }
            if (i4 != 0) {
                super.engineUpdate(bArr, i, i4, bArr2, i3);
                if (getProcessedByteCount() % getKeyMeshingLength() == 0) {
                    changeKey();
                }
            }
            return computeRequiredLen;
        } catch (Error e) {
            resetInit();
            throw e;
        } catch (RuntimeException e2) {
            resetInit();
            throw e2;
        }
    }

    public int getKeyMeshingLength() {
        return 1024;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void setDefaultPromix() {
        this.usePromix = true;
    }
}
