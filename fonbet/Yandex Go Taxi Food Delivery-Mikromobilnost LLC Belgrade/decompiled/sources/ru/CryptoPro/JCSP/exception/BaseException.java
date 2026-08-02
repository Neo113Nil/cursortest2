package ru.CryptoPro.JCSP.exception;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class BaseException extends IOException {
    protected final int errorCode;

    public BaseException(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
