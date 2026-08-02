package ru.CryptoPro.JCSP.params;

/* loaded from: classes4.dex */
public class PasswordParamsSpec implements PasswordParamsInterface {
    private final char[] a;

    public PasswordParamsSpec(char[] cArr) {
        this.a = cArr;
    }

    @Override // ru.CryptoPro.JCSP.params.PasswordParamsInterface
    public char[] getPassword() {
        return this.a;
    }
}
