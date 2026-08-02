package ru.CryptoPro.JCSP.Key.foreign;

import java.security.InvalidKeyException;
import java.security.Key;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.GostSecretKey;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class ForeignSymmetricKey extends GostSecretKey {
    private byte[] a;

    public ForeignSymmetricKey(JCSPSecretKeyInterface jCSPSecretKeyInterface, byte[] bArr) {
        super(jCSPSecretKeyInterface);
        this.a = bArr;
    }

    public static JCSPSecretKeyInterface extractSpec(Key key) throws InvalidKeyException {
        return GostSecretKey.extractSpec(key, 0);
    }

    @Override // ru.CryptoPro.JCSP.Key.GostSecretKey, java.security.Key, ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public String getAlgorithm() {
        int algorithmIdentifier = this.spec.getAlgorithmIdentifier();
        if (algorithmIdentifier == 26113) {
            return JCSP.CP_DES_NAME;
        }
        if (algorithmIdentifier == 26115) {
            return JCSP.CP_TRIPLE_DES_NAME;
        }
        if (algorithmIdentifier == 26121) {
            return JCSP.CP_TRIPLE_DES_112_NAME;
        }
        if (algorithmIdentifier == 26133) {
            return "GENERIC_SECRET";
        }
        switch (algorithmIdentifier) {
            case 26126:
            case 26127:
            case 26128:
            case HProv.CALG_AES /* 26129 */:
                return JCSP.CP_AES_NAME;
            default:
                return "Unknown";
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.GostSecretKey, java.security.Key, ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public byte[] getEncoded() {
        HKey key = ((AbstractKeySpec) this.spec).getKey();
        if (key != null) {
            return key.exportRawForeignKey();
        }
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostSecretKey, java.security.Key, ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public String getFormat() {
        return null;
    }

    public byte[] getIV() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostSecretKey, ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public int getKeySize() {
        return ((AbstractKeySpec) this.spec).getKeyLength();
    }

    public void setIV(byte[] bArr) {
        this.a = bArr;
    }

    public ForeignSymmetricKey(JCSPSecretKeyInterface jCSPSecretKeyInterface) {
        super(jCSPSecretKeyInterface);
    }
}
