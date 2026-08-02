package ru.CryptoPro.JCP.tools;

/* loaded from: classes4.dex */
public class ChainParserException extends Exception {
    Exception a;

    public ChainParserException(String str, Exception exc) {
        super(str);
        this.a = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }

    public Exception getUnderlyingException() {
        return this.a;
    }

    public ChainParserException(String str) {
        super(str);
    }
}
