package com.nimbusds.jose.jwk;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class KeyRevocation implements Serializable {
    public final Reason reason;
    public final Date revokedAt;

    /* loaded from: classes9.dex */
    public final class Reason {
        public final String value;
        public static final Reason UNSPECIFIED = new Reason("unspecified");
        public static final Reason COMPROMISED = new Reason("compromised");
        public static final Reason SUPERSEDED = new Reason("superseded");

        public Reason(String str) {
            Objects.requireNonNull(str);
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Reason) {
                return Objects.equals(this.value, ((Reason) obj).value);
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.value);
        }

        public final String toString() {
            return this.value;
        }
    }

    public KeyRevocation(Date date, Reason reason) {
        this.revokedAt = date;
        this.reason = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyRevocation)) {
            return false;
        }
        KeyRevocation keyRevocation = (KeyRevocation) obj;
        return Objects.equals(this.revokedAt, keyRevocation.revokedAt) && Objects.equals(this.reason, keyRevocation.reason);
    }

    public final int hashCode() {
        return Objects.hash(this.revokedAt, this.reason);
    }
}
