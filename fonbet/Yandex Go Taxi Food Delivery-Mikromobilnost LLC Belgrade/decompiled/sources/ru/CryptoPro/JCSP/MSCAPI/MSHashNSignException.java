package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.ny61;

/* loaded from: classes4.dex */
public class MSHashNSignException extends MSException {
    public MSHashNSignException() {
    }

    public static void procCode(int i) throws MSException {
        switch (i) {
            case MSException.NTE_BAD_UID /* -2146893823 */:
            case MSException.NTE_BAD_ALGID /* -2146893816 */:
            case MSException.NTE_BAD_FLAGS /* -2146893815 */:
            case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                ny61.g(MSException.formatErrorMessage(i, "Hash or Sign"));
                return;
            case MSException.NTE_BAD_HASH /* -2146893822 */:
            case MSException.NTE_BAD_LEN /* -2146893820 */:
            case MSException.NTE_BAD_SIGNATURE /* -2146893818 */:
            case MSException.NTE_BAD_HASH_STATE /* -2146893812 */:
            case MSException.NTE_NO_KEY /* -2146893811 */:
            case MSException.NTE_BAD_KEYSET /* -2146893802 */:
            case MSException.NTE_KEYSET_NOT_DEF /* -2146893799 */:
            case MSException.NTE_FAIL /* -2146893792 */:
            case MSException.NTE_SILENT_CONTEXT /* -2146893790 */:
            case MSException.SCARD_E_INVALID_CHV /* -2146435030 */:
            case MSException.SCARD_W_REMOVED_CARD /* -2146434967 */:
            case MSException.SCARD_W_WRONG_CHV /* -2146434965 */:
            case MSException.SCARD_W_CHV_BLOCKED /* -2146434964 */:
            case MSException.SCARD_W_CANCELLED_BY_USER /* -2146434962 */:
            case 120:
            case MSException.ERROR_MORE_DATA /* 234 */:
                throw new MSHashNSignException(MSException.formatErrorMessage(i, "Hash or Sign"), i);
            case MSException.NTE_BAD_KEY /* -2146893821 */:
                throw new MSKeyException(MSException.formatErrorMessage(i, "Hash or Sign"), i);
            default:
                if (MSException.isNetworkError(i)) {
                    throw new MSHsmChannelClosedException(MSException.formatErrorMessage(i, "Hash or Sign"));
                }
                MSException.procCode(i);
                return;
        }
    }

    public boolean isBadSignature() {
        return getDescription() == -2146893818;
    }

    public MSHashNSignException(String str) {
        super(str);
    }

    public MSHashNSignException(String str, int i) {
        super(str, i);
    }

    public MSHashNSignException(String str, Throwable th) {
        super(str, th);
    }

    public MSHashNSignException(Throwable th) {
        super(th);
    }
}
