package com.squareup.cash.db2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ExpiresAt {
    public final Long expires_at;

    public ExpiresAt(Long l) {
        this.expires_at = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExpiresAt) && Intrinsics.areEqual(this.expires_at, ((ExpiresAt) obj).expires_at);
    }

    public final int hashCode() {
        Long l = this.expires_at;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "ExpiresAt(expires_at=" + this.expires_at + ")";
    }
}
