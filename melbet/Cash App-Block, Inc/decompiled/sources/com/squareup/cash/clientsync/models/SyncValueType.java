package com.squareup.cash.clientsync.models;

/* loaded from: classes.dex */
public final class SyncValueType {
    public final int value;

    public SyncValueType(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SyncValueType) && this.value == ((SyncValueType) obj).value;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
