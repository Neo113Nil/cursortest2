package ru.CryptoPro.JCSP.Key;

import java.security.InvalidKeyException;
import ru.CryptoPro.JCP.KeyStore.KeyIsNotExportableException;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HKey;

/* loaded from: classes4.dex */
public abstract class cl_7 {
    public static HHash a(int i, byte[] bArr, ParamsInterface paramsInterface, HKey hKey) {
        return hKey.prepareHash(i, bArr, paramsInterface, false);
    }

    public static void b(int i, HKey hKey) {
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
        hKey.setPadding(i2);
    }

    public static int c(HKey hKey) {
        int padding = hKey.getPadding();
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
                                case 80:
                                    return 80;
                                case 81:
                                    return 81;
                                case 82:
                                    return 82;
                                default:
                                    return 0;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public static byte[] d(HKey hKey) {
        return hKey.genPublic();
    }

    public static int a(HKey hKey) {
        return hKey.getKeyAlg();
    }

    public static void a(int i, HKey hKey) throws InvalidKeyException {
        hKey.setKeyAlg(i);
    }

    public static boolean a(HHash hHash, byte[] bArr, HKey hKey, int i) {
        return hHash.checkSignature(bArr, hKey, i);
    }

    public static byte[] a(HKey hKey, HKey hKey2) throws KeyIsNotExportableException {
        return hKey.exportSessionKey(hKey2);
    }

    public static int b(HKey hKey) {
        return hKey.getKeyLen();
    }
}
