package ru.CryptoPro.AdES;

/* loaded from: classes4.dex */
public class CSPSigningOptions<T> extends CSPOptions<T> {
    private boolean useKeyLocalContextForHash;

    public CSPSigningOptions(T t) {
        super(t);
        this.useKeyLocalContextForHash = false;
    }

    public boolean isUseKeyLocalContextForHash() {
        return this.useKeyLocalContextForHash;
    }

    public T useKeyLocalContextForHash() {
        this.useKeyLocalContextForHash = true;
        return this.holder;
    }
}
