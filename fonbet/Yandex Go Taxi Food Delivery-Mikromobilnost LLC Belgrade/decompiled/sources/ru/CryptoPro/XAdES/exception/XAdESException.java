package ru.CryptoPro.XAdES.exception;

import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public class XAdESException extends AdESException {
    public XAdESException(Exception exc, Integer num) {
        super(exc, num);
    }

    public XAdESException(Integer num) {
        super(num);
    }

    public XAdESException(String str, Exception exc, Integer num) {
        super(str, exc, num);
    }

    public XAdESException(String str, Integer... numArr) {
        super(str, numArr);
    }
}
