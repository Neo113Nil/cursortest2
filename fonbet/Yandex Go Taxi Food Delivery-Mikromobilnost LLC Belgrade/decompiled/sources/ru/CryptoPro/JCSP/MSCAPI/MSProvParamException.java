package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.ny61;

/* loaded from: classes4.dex */
public class MSProvParamException extends MSException {
    public MSProvParamException() {
    }

    public static void procCode(int i) throws MSException {
        switch (i) {
            case MSException.NTE_BAD_UID /* -2146893823 */:
            case MSException.NTE_BAD_FLAGS /* -2146893815 */:
            case MSException.NTE_BAD_TYPE /* -2146893814 */:
            case MSException.ERROR_MORE_DATA /* 234 */:
                ny61.g(MSException.formatErrorMessage(i, "ProvParam"));
                return;
            case MSException.NTE_KEYSET_NOT_DEF /* -2146893799 */:
            case MSException.NTE_FAIL /* -2146893792 */:
            case MSException.NTE_SILENT_CONTEXT /* -2146893790 */:
            case MSException.NTE_TOKEN_KEYSET_STORAGE_FULL /* -2146893789 */:
            case MSException.SCARD_E_INVALID_CHV /* -2146435030 */:
            case MSException.SCARD_W_REMOVED_CARD /* -2146434967 */:
            case MSException.SCARD_W_WRONG_CHV /* -2146434965 */:
            case MSException.SCARD_W_CHV_BLOCKED /* -2146434964 */:
            case MSException.SCARD_W_CANCELLED_BY_USER /* -2146434962 */:
            case MSException.ERROR_NO_MORE_ITEMS /* 259 */:
                throw new MSProvParamException(MSException.formatErrorMessage(i, "ProvParam"), i);
            default:
                MSException.procCode(i);
                return;
        }
    }

    public boolean enumFinished() {
        return getDescription() == 259;
    }

    public MSProvParamException(String str) {
        super(str);
    }

    public MSProvParamException(String str, int i) {
        super(str, i);
    }

    public MSProvParamException(String str, Throwable th) {
        super(str, th);
    }

    public MSProvParamException(Throwable th) {
        super(th);
    }
}
