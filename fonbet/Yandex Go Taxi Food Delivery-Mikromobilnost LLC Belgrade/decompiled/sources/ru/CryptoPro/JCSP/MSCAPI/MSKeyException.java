package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.ny61;

/* loaded from: classes4.dex */
public class MSKeyException extends MSException {
    public MSKeyException() {
    }

    public static void procCode(int i) throws MSException {
        switch (i) {
            case MSException.NTE_BAD_UID /* -2146893823 */:
            case MSException.NTE_BAD_ALGID /* -2146893816 */:
            case MSException.NTE_BAD_FLAGS /* -2146893815 */:
            case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                ny61.g(MSException.formatErrorMessage(i, "Key"));
                return;
            case MSException.NTE_BAD_HASH /* -2146893822 */:
            case MSException.NTE_BAD_HASH_STATE /* -2146893812 */:
                throw new MSHashNSignException(MSException.formatErrorMessage(i, "Key"), i);
            case MSException.NTE_BAD_KEY /* -2146893821 */:
            case MSException.NTE_BAD_DATA /* -2146893819 */:
            case MSException.NTE_BAD_VER /* -2146893817 */:
            case MSException.NTE_BAD_TYPE /* -2146893814 */:
            case MSException.NTE_BAD_KEY_STATE /* -2146893813 */:
            case MSException.NTE_NO_KEY /* -2146893811 */:
            case MSException.NTE_BAD_PUBLIC_KEY /* -2146893803 */:
            case MSException.NTE_KEYSET_NOT_DEF /* -2146893799 */:
            case MSException.NTE_SILENT_CONTEXT /* -2146893790 */:
            case MSException.NTE_TOKEN_KEYSET_STORAGE_FULL /* -2146893789 */:
            case MSException.SCARD_E_INVALID_CHV /* -2146435030 */:
            case MSException.SCARD_W_REMOVED_CARD /* -2146434967 */:
            case MSException.SCARD_W_WRONG_CHV /* -2146434965 */:
            case MSException.SCARD_W_CHV_BLOCKED /* -2146434964 */:
            case MSException.SCARD_W_CANCELLED_BY_USER /* -2146434962 */:
            case 120:
            case MSException.ERROR_MORE_DATA /* 234 */:
                throw new MSKeyException(MSException.formatErrorMessage(i, "Key"), i);
            default:
                MSException.procCode(i);
                return;
        }
    }

    public boolean isBadKey() {
        return getDescription() == -2146893821;
    }

    public boolean isNotExportable() {
        return getDescription() == -2146893813;
    }

    public MSKeyException(String str) {
        super(str);
    }

    public MSKeyException(String str, int i) {
        super(str, i);
    }

    public MSKeyException(String str, Throwable th) {
        super(str, th);
    }

    public MSKeyException(Throwable th) {
        super(th);
    }
}
