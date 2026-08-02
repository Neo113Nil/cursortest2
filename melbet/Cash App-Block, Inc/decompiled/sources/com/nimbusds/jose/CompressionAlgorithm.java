package com.nimbusds.jose;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class CompressionAlgorithm implements Serializable {
    public static final CompressionAlgorithm DEF = new CompressionAlgorithm("DEF");
    public final String name;

    public CompressionAlgorithm(String str) {
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CompressionAlgorithm) {
            return this.name.equals(((CompressionAlgorithm) obj).name);
        }
        return false;
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return this.name;
    }
}
