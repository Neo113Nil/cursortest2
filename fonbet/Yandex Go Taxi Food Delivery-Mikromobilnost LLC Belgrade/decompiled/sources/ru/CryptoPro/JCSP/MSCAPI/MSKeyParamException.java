package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.ny61;

/* loaded from: classes4.dex */
public class MSKeyParamException extends MSKeyException {
    public MSKeyParamException() {
    }

    public static void procCode(int i) throws MSException {
        switch (i) {
            case MSException.NTE_BAD_UID /* -2146893823 */:
            case MSException.NTE_BAD_KEY /* -2146893821 */:
            case MSException.NTE_BAD_FLAGS /* -2146893815 */:
            case MSException.NTE_FIXEDPARAMETER /* -2146893787 */:
            case MSException.ERROR_INVALID_PARAMETER /* 87 */:
            case MSException.ERROR_MORE_DATA /* 234 */:
                ny61.g(MSException.formatErrorMessage(i, "KeyParam"));
                return;
            case MSException.NTE_BAD_TYPE /* -2146893814 */:
            case MSException.NTE_NO_KEY /* -2146893811 */:
            case MSException.NTE_FAIL /* -2146893792 */:
            case MSException.SCARD_E_NO_SUCH_CERTIFICATE /* -2146435028 */:
                throw new MSKeyParamException(MSException.formatErrorMessage(i, "KeyParam"), i);
            default:
                MSException.procCode(i);
                return;
        }
    }

    public boolean isBadType() {
        return getDescription() == -2146893814;
    }

    public boolean isCertificateAbsent() {
        return getDescription() == -2146435028;
    }

    public boolean isPermissionsAbsent() {
        return getDescription() == -2146893808;
    }

    public MSKeyParamException(String str) {
        super(str);
    }

    public MSKeyParamException(String str, int i) {
        super(str, i);
    }

    public MSKeyParamException(String str, Throwable th) {
        super(str, th);
    }

    public MSKeyParamException(Throwable th) {
        super(th);
    }
}
