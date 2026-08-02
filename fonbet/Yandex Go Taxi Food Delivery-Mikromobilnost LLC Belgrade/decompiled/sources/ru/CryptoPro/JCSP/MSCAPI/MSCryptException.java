package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.ny61;

/* loaded from: classes4.dex */
public class MSCryptException extends MSException {
    public MSCryptException() {
    }

    public static void procCode(int i) throws MSException {
        if (i != -2146893812) {
            if (i != -2146893806 && i != -2146893792) {
                switch (i) {
                    case MSException.NTE_BAD_UID /* -2146893823 */:
                        break;
                    case MSException.NTE_BAD_HASH /* -2146893822 */:
                        break;
                    case MSException.NTE_BAD_KEY /* -2146893821 */:
                    case MSException.NTE_BAD_LEN /* -2146893820 */:
                    case MSException.NTE_BAD_DATA /* -2146893819 */:
                        break;
                    default:
                        switch (i) {
                            case MSException.NTE_BAD_ALGID /* -2146893816 */:
                            case MSException.NTE_BAD_FLAGS /* -2146893815 */:
                                break;
                            default:
                                MSException.procCode(i);
                                return;
                        }
                }
                ny61.g(MSException.formatErrorMessage(i, "Crypt"));
                return;
            }
            throw new MSCryptException(MSException.formatErrorMessage(i, "Crypt"), i);
        }
        throw new MSHashNSignException(MSException.formatErrorMessage(i, "Crypt"), i);
    }

    public boolean a() {
        return getDescription() == -2146893820;
    }

    public MSCryptException(String str) {
        super(str);
    }

    public MSCryptException(String str, int i) {
        super(str, i);
    }

    public MSCryptException(String str, Throwable th) {
        super(str, th);
    }

    public MSCryptException(Throwable th) {
        super(th);
    }
}
