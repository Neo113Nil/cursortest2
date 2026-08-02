package com.squareup.cash.clientsync.models;

/* loaded from: classes.dex */
public final class SyncEntityType {
    public static final SyncEntityType SYNC_VALUE = new SyncEntityType(14);
    public final int value;

    public SyncEntityType(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SyncEntityType) && this.value == ((SyncEntityType) obj).value;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
