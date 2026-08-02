package com.nimbusds.jose;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes5.dex */
public class Algorithm implements Serializable {
    public static final Algorithm NONE = new Algorithm("none");
    public final String name;

    public Algorithm(String str) {
        Objects.requireNonNull(str);
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Algorithm) {
            return this.name.equals(((Algorithm) obj).name);
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
