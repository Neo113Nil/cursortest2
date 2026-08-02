package ru.CryptoPro.AdES;

/* loaded from: classes4.dex */
public class CSPEncryptionOptions<T> extends CSPOptions<T> {
    private boolean copySecretKeyToLocalContext;

    public CSPEncryptionOptions(T t) {
        super(t);
        this.copySecretKeyToLocalContext = false;
    }

    public T copySecretKeyToLocalContext() {
        this.copySecretKeyToLocalContext = true;
        return this.holder;
    }

    public boolean isCopySecretKeyToLocalContext() {
        return this.copySecretKeyToLocalContext;
    }
}
