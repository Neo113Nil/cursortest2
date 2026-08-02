package com.squareup.cash.db2.security;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public final class PasswordInfo {
    public final long version;

    public PasswordInfo(long j) {
        this.version = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordInfo) && this.version == ((PasswordInfo) obj).version;
    }

    public final int hashCode() {
        return Long.hashCode(1L) + (Long.hashCode(this.version) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.version, "PasswordInfo(version=", ", info_id=1)");
    }
}
