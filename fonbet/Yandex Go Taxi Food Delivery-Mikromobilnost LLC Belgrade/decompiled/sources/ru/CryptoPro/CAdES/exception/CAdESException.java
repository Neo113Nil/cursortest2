package ru.CryptoPro.CAdES.exception;

import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public class CAdESException extends AdESException {
    public CAdESException(Exception exc, Integer num) {
        super(exc, num);
    }

    public CAdESException(Integer num) {
        super(num);
    }

    public CAdESException(String str, Exception exc, Integer num) {
        super(str, exc, num);
    }

    public CAdESException(String str, Integer... numArr) {
        super(str, numArr);
    }
}
