package ru.CryptoPro.JCSP.state;

import ru.CryptoPro.JCSP.InitEvent;

/* loaded from: classes4.dex */
public class ErrorEvent implements InitEvent {
    private final int errorCode;
    private final Throwable throwable;

    public ErrorEvent(int i, Throwable th) {
        this.errorCode = i;
        this.throwable = th;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public ErrorEvent(int i) {
        this(i, null);
    }
}
