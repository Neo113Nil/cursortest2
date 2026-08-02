package com.squareup.cash.clientsync;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SyncEntityMetadata {
    public final String id;
    public final Long version;

    public SyncEntityMetadata(String str, Long l) {
        str.getClass();
        this.id = str;
        this.version = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncEntityMetadata)) {
            return false;
        }
        SyncEntityMetadata syncEntityMetadata = (SyncEntityMetadata) obj;
        return Intrinsics.areEqual(this.id, syncEntityMetadata.id) && Intrinsics.areEqual(this.version, syncEntityMetadata.version);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Long l = this.version;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "SyncEntityMetadata(id=" + this.id + ", version=" + this.version + ")";
    }
}
