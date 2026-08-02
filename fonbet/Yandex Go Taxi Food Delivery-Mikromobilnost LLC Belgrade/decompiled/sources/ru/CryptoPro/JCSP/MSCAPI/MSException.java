package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.ny61;
import java.security.AccessControlException;

/* loaded from: classes4.dex */
public class MSException extends Exception {
    public static final int CRYPT_E_ASN1_ERROR = -2146881280;
    public static final int CRYPT_E_BAD_ENCODE = -2146885630;
    public static final int ERROR_BUSY = 170;
    public static final int ERROR_CALL_NOT_IMPLEMENTED = 120;
    public static final int ERROR_HSM_CHANNEL_CLOSED = 109;
    public static final int ERROR_INVALID_HANDLE = 6;
    public static final int ERROR_INVALID_PARAMETER = 87;
    public static final int ERROR_INVALID_PASSWORD = 86;
    public static final int ERROR_MORE_DATA = 234;
    public static final int ERROR_NOT_ALL_ASSIGNED = 1300;
    public static final int ERROR_NOT_ENOUGH_MEMORY = 8;
    public static final int ERROR_NO_MEDIA_IN_DRIVE = 1112;
    public static final int ERROR_NO_MORE_ITEMS = 259;
    public static final String MSException_TAG = "MSCAPI ERROR:";
    public static final int NTE_BAD_ALGID = -2146893816;
    public static final int NTE_BAD_DATA = -2146893819;
    public static final int NTE_BAD_FLAGS = -2146893815;
    public static final int NTE_BAD_HASH = -2146893822;
    public static final int NTE_BAD_HASH_STATE = -2146893812;
    public static final int NTE_BAD_KEY = -2146893821;
    public static final int NTE_BAD_KEYSET = -2146893802;
    public static final int NTE_BAD_KEYSET_PARAM = -2146893793;
    public static final int NTE_BAD_KEY_STATE = -2146893813;
    public static final int NTE_BAD_LEN = -2146893820;
    public static final int NTE_BAD_PUBLIC_KEY = -2146893803;
    public static final int NTE_BAD_SIGNATURE = -2146893818;
    public static final int NTE_BAD_TYPE = -2146893814;
    public static final int NTE_BAD_UID = -2146893823;
    public static final int NTE_BAD_VER = -2146893817;
    public static final int NTE_DOUBLE_ENCRYPT = -2146893806;
    public static final int NTE_EXISTS = -2146893809;
    public static final int NTE_FAIL = -2146893792;
    public static final int NTE_FIXEDPARAMETER = -2146893787;
    public static final int NTE_KEYSET_ENTRY_BAD = -2146893798;
    public static final int NTE_KEYSET_NOT_DEF = -2146893799;
    public static final int NTE_NO_KEY = -2146893811;
    public static final int NTE_NO_MEMORY = -2146893810;
    public static final int NTE_PERM = -2146893808;
    public static final int NTE_SILENT_CONTEXT = -2146893790;
    public static final int NTE_TOKEN_KEYSET_STORAGE_FULL = -2146893789;
    public static final int RPC_S_PROTOCOL_ERROR = 1728;
    public static final int RPC_S_SERVER_TOO_BUSY = 1723;
    public static final int SCARD_E_INVALID_CHV = -2146435030;
    public static final int SCARD_E_NO_SUCH_CERTIFICATE = -2146435028;
    public static final int SCARD_W_CANCELLED_BY_USER = -2146434962;
    public static final int SCARD_W_CHV_BLOCKED = -2146434964;
    public static final int SCARD_W_REMOVED_CARD = -2146434967;
    public static final int SCARD_W_WRONG_CHV = -2146434965;
    public static final int WSA_ECONNREFUSED = 10061;
    public static final int WSA_INVALID_HANDLE = 6;
    private int a;

    public MSException() {
        this.a = 0;
    }

    public static String formatErrorMessage(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str != null ? str.concat(" ") : "");
        sb.append("MSCAPI ERROR: 0x");
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    public static boolean isNetworkError(int i) {
        return i == 6 || i == 109 || i == 1723 || i == 1728 || i == 10061;
    }

    public static void procCode(int i) throws MSException {
        if (i != -2146893810) {
            if (i != -2146893808) {
                if (i != 0) {
                    if (i != 6) {
                        if (i != 8) {
                            if (i != 120) {
                                if (i != 1300) {
                                    switch (i) {
                                        case NTE_BAD_UID /* -2146893823 */:
                                        case NTE_BAD_HASH /* -2146893822 */:
                                            break;
                                        default:
                                            switch (i) {
                                                case NTE_BAD_ALGID /* -2146893816 */:
                                                case NTE_BAD_FLAGS /* -2146893815 */:
                                                case NTE_BAD_TYPE /* -2146893814 */:
                                                    break;
                                                default:
                                                    throw new MSException(formatErrorMessage(i, null), i);
                                            }
                                    }
                                }
                            }
                        }
                    }
                    ny61.g(formatErrorMessage(i, null));
                    return;
                }
                return;
            }
            throw new AccessControlException(formatErrorMessage(i, null));
        }
        throw new OutOfMemoryError(formatErrorMessage(i, null));
    }

    public int getDescription() {
        return this.a;
    }

    public boolean isBadKeyset() {
        return getDescription() == -2146893802 || getDescription() == -2146893793 || getDescription() == -2146893798 || getDescription() == -2146893799;
    }

    public boolean isCanceled() {
        return getDescription() == -2146434962;
    }

    public boolean isNoKey() {
        return getDescription() == -2146893811;
    }

    public boolean isPfxBadAsn1() {
        return getDescription() == -2146885630 || getDescription() == -2146881280;
    }

    public boolean isPfxInvalidPassword() {
        return getDescription() == 86;
    }

    public boolean isWantGraphic() {
        return getDescription() == -2146893790;
    }

    public boolean isWrongPassword() {
        return getDescription() == -2146434965 || getDescription() == -2146435030 || getDescription() == -2146434964;
    }

    public MSException(String str) {
        super(str);
        this.a = 0;
    }

    public MSException(String str, int i) {
        super(str);
        this.a = i;
    }

    public MSException(String str, Throwable th) {
        super(str, th);
        this.a = 0;
    }

    public MSException(Throwable th) {
        super(th);
        this.a = 0;
    }
}
