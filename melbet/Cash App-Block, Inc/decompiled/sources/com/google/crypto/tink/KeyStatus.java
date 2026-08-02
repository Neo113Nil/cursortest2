package com.google.crypto.tink;

/* loaded from: classes.dex */
public final class KeyStatus {
    public final String name;
    public static final KeyStatus ENABLED = new KeyStatus("ENABLED");
    public static final KeyStatus DISABLED = new KeyStatus("DISABLED");
    public static final KeyStatus DESTROYED = new KeyStatus("DESTROYED");

    public KeyStatus(String str) {
        this.name = str;
    }

    public final String toString() {
        return this.name;
    }
}
