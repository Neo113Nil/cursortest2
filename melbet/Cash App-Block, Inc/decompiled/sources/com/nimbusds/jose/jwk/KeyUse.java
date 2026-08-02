package com.nimbusds.jose.jwk;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class KeyUse implements Serializable {
    public final String identifier;
    public static final KeyUse SIGNATURE = new KeyUse("sig");
    public static final KeyUse ENCRYPTION = new KeyUse("enc");

    public KeyUse(String str) {
        this.identifier = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyUse) {
            return this.identifier.equals(((KeyUse) obj).identifier);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.identifier);
    }

    public final String toString() {
        return this.identifier;
    }
}
