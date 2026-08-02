package ru.CryptoPro.JCSP.Key;

import defpackage.dy31;
import defpackage.ny61;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import javax.crypto.ShortBufferException;
import ru.CryptoPro.JCP.Key.MasterKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.KeyStore.KeyIsNotExportableException;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes4.dex */
public abstract class AbstractEncryptionKeySpec extends AbstractKeySpec implements JCSPSecretKeyInterface {
    public static final int CRYPT_RSA_PKCS = 80;
    public static final int CRYPT_RSA_RMASK = 82;
    public static final int CRYPT_RSA_X_509 = 81;

    public AbstractEncryptionKeySpec(HKey hKey, AbstractKeySpec abstractKeySpec) throws CloneNotSupportedException {
        super(abstractKeySpec.params, abstractKeySpec.keyName);
        this.insideKey = hKey;
        AbstractKeySpec.copy(abstractKeySpec, this);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void changeKey(CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public abstract /* synthetic */ Object clone2() throws CloneNotSupportedException;

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void decrypt(byte[] bArr, int[] iArr, boolean z) throws InvalidKeyException, ShortBufferException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            this.insideKey.decrypt(z, bArr, iArr);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int decryptLength(int i, boolean z) throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return 0;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            return this.insideKey.getDecryptBufferLength(z, i);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
            return 0;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey(byte[] bArr) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey2012(byte[] bArr) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void encrypt(byte[] bArr, int[] iArr, boolean z) throws InvalidKeyException, ShortBufferException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            this.insideKey.encrypt(z, bArr, iArr);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int encryptLength(int i, boolean z) throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return 0;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            return this.insideKey.getEncryptBufferLength(z, i);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
            return 0;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getAlgorithmIdentifier() {
        if (!this.destroyed) {
            return this.insideKey.getKeyAlg();
        }
        ny61.r("The key has been destroyed.");
        return 0;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getAppropriateCryptMode() {
        throw new IllegalArgumentException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    public int getCmsMixModeSize() {
        return 0;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getEncryptMode() {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return 0;
        }
        if (!isForeignKey() && !isSecretKey()) {
            ny61.g(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
            return 0;
        }
        int encryptMode = this.insideKey.getEncryptMode();
        if (encryptMode == 1) {
            return 32;
        }
        if (encryptMode == 2) {
            return 16;
        }
        if (encryptMode == 3) {
            return 64;
        }
        if (encryptMode == 4) {
            return 128;
        }
        if (encryptMode == 32) {
            return this.insideKey.getMixMode() == 1 ? 4096 : 2048;
        }
        if (encryptMode != 34) {
            return encryptMode != 35 ? 0 : 8192;
        }
        return 2097152;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] getIV() {
        throw new IllegalArgumentException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] getIV_blob() throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            return this.insideKey.getIvBlob();
        } catch (IllegalArgumentException e) {
            dy31.s(e);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] getIV_byte() throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            return this.insideKey.getSynchro();
        } catch (IllegalArgumentException e) {
            dy31.s(e);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] getKeyX() throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (!isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            return this.insideKey.getKeyX();
        } catch (IllegalArgumentException e) {
            dy31.s(e);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public boolean getMixMode() {
        throw new IllegalArgumentException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getPadding() {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return 0;
        }
        if (!isForeignKey() && !isSecretKey()) {
            ny61.g(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
            return 0;
        }
        int padding = this.insideKey.getPadding();
        int i = 1;
        if (padding != 1) {
            i = 2;
            if (padding != 2) {
                i = 3;
                if (padding != 3) {
                    i = 4;
                    if (padding != 4) {
                        i = 5;
                        if (padding != 5) {
                            switch (padding) {
                            }
                            return 0;
                        }
                    }
                }
            }
        }
        return i;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] getTag() throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (!isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            return this.insideKey.getAuthTag();
        } catch (IllegalArgumentException e) {
            dy31.s(e);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface getWorkKey() {
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public HHash makeNewHMAC(int i, OID oid) throws InvalidKeyException {
        if (!this.destroyed) {
            return this.insideKey.makeNewHMAC(i, oid);
        }
        dy31.v("The key has been destroyed.");
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public HHash makeNewMac(int i, int i2) throws InvalidKeyException {
        if (!this.destroyed) {
            return this.insideKey.makeNewMac(i, 0);
        }
        dy31.v("The key has been destroyed.");
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void methodGOSTR3411PRF(byte[][] bArr, byte[] bArr2, boolean z) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public MasterKeyInterface preHashMaster(byte[] bArr, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setAAD(byte[] bArr) throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
        } else {
            if (!isSecretKey()) {
                throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
            }
            try {
                this.insideKey.setAAD(bArr);
            } catch (IllegalArgumentException e) {
                dy31.s(e);
            }
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setAlgorithmIdentifier(int i) throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
        } else {
            this.insideKey.setKeyAlg(i);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setAlgorithmIdentifierByCryptMode(int i) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setEncryptMode(int i, boolean z) {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return;
        }
        if (!isForeignKey() && !isSecretKey()) {
            ny61.g(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
            return;
        }
        if (i == 16) {
            this.insideKey.setEncryptMode(2);
            return;
        }
        if (i == 32) {
            this.insideKey.setEncryptMode(1);
            return;
        }
        if (i == 64) {
            this.insideKey.setEncryptMode(3);
            return;
        }
        if (i == 128) {
            this.insideKey.setEncryptMode(4);
            return;
        }
        if (i == 2048) {
            this.insideKey.setEncryptMode(32);
            return;
        }
        if (i == 4096) {
            this.insideKey.setEncryptMode(32);
            this.insideKey.setMixMode(1);
            if (z) {
                this.insideKey.setMixModeSize(getCmsMixModeSize());
                return;
            }
            return;
        }
        if (i != 8192) {
            if (i != 2097152) {
                return;
            }
            this.insideKey.setEncryptMode(34);
        } else {
            this.insideKey.setEncryptMode(35);
            this.insideKey.setMixMode(1);
            if (z) {
                this.insideKey.setMixModeSize(getCmsMixModeSize());
            }
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void setIVLen(int i) {
        throw new IllegalArgumentException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setIV_blob(byte[] bArr) throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            this.insideKey.setIvBlob(bArr);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setIV_byte(byte[] bArr) throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            this.insideKey.setSynchro(bArr);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setMixMode(boolean z) {
        throw new IllegalArgumentException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setModeBits(int i) {
        throw new IllegalArgumentException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setPadding(int i) {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return;
        }
        if (!isForeignKey() && !isSecretKey()) {
            ny61.g(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
            return;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    int i3 = 4;
                    if (i != 4) {
                        i3 = 5;
                        if (i != 5) {
                            if (i != 8192) {
                                switch (i) {
                                    case 80:
                                        i2 = 80;
                                        break;
                                    case 81:
                                        i2 = 81;
                                        break;
                                    case 82:
                                        i2 = 82;
                                        break;
                                    default:
                                        i2 = -1;
                                        break;
                                }
                            }
                        }
                    }
                    i2 = i3;
                }
            }
        }
        this.insideKey.setPadding(i2);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setTag(byte[] bArr) throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
        } else {
            if (!isSecretKey()) {
                throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
            }
            try {
                this.insideKey.setAuthTag(bArr);
            } catch (IllegalArgumentException e) {
                dy31.s(e);
            }
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public JCSPSecretKeyInterface unwrap(byte[] bArr, int i, boolean z) throws InvalidKeyException, KeyManagementException {
        JCSPLogger.subEnter();
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (getKeyType() != 1 && !isSecretKey()) {
            ny61.g(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
            return null;
        }
        HKey importSessionSecretKey = this.insideKey.importSessionSecretKey(bArr, 1, (z ? AlgorithmGroups.KeyAlgorithmGroup.RSA : AlgorithmGroups.KeyAlgorithmGroup.GOST).ordinal());
        JCSPSecretKeySpec jCSPSecretKeySpec = JCSPSecretKeySpec.getInstance(importSessionSecretKey, importSessionSecretKey.getKeyAlg());
        JCSPLogger.subExit();
        return jCSPSecretKeySpec;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public boolean updateTLSKey(long j, int i) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface) throws InvalidKeyException {
        JCSPLogger.subEnter();
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        boolean isSecretKey = isSecretKey();
        HKey hKey = this.insideKey;
        try {
            byte[] exportSessionKey = isSecretKey ? hKey.exportSessionKey(((SecretKeyImpl) secretKeyInterface).insideKey) : hKey.exportPrivate(((SecretKeyImpl) secretKeyInterface).insideKey, 7);
            JCSPLogger.subExit();
            return exportSessionKey;
        } catch (KeyIsNotExportableException | MSException e) {
            dy31.s(e);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public MasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public JCSPMasterKeyInterface preHashMaster(byte[] bArr, int i, int i2, int i3, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public JCSPMasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, int i, int i2, int i3, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    public AbstractEncryptionKeySpec(AlgIdInterface algIdInterface, boolean z, boolean z2, boolean z3) {
        super(algIdInterface, z, z2, z3);
    }

    public AbstractEncryptionKeySpec(HKey hKey, String str, AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup) {
        super(hKey, str, keyAlgorithmGroup);
    }

    public AbstractEncryptionKeySpec(AlgIdInterface algIdInterface, String str) {
        super(algIdInterface, str);
    }

    public AbstractEncryptionKeySpec(HKey hKey, AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup) {
        this(hKey, null, keyAlgorithmGroup);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void decrypt(byte[] bArr, int[] iArr, boolean z, int i) throws InvalidKeyException, ShortBufferException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            this.insideKey.decrypt(z, bArr, iArr, i);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void encrypt(byte[] bArr, int[] iArr, boolean z, int i) throws InvalidKeyException, ShortBufferException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return;
        }
        if (!isForeignKey() && !isSecretKey()) {
            throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
        }
        try {
            this.insideKey.encrypt(z, bArr, iArr, i);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, byte[] bArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException(AbstractKeySpec.STR_ENCRYPT_NOT_SUPPORT);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, String str, byte[] bArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }
}
