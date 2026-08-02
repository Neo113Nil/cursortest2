package com.google.crypto.tink;

/* loaded from: classes.dex */
public final class KeysetHandle$Builder$Entry {
    public boolean isPrimary;
    public final Parameters parameters;
    public KeysetHandle$Builder$KeyIdStrategy strategy = null;

    public KeysetHandle$Builder$Entry(Parameters parameters) {
        this.parameters = parameters;
    }
}
