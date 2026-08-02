package com.squareup.cash.clientsync.persistence;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AuditLogEntry {
    public final String message;
    public final long timestampMs;

    public AuditLogEntry(long j, String str) {
        str.getClass();
        this.timestampMs = j;
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuditLogEntry)) {
            return false;
        }
        AuditLogEntry auditLogEntry = (AuditLogEntry) obj;
        return this.timestampMs == auditLogEntry.timestampMs && Intrinsics.areEqual(this.message, auditLogEntry.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (Long.hashCode(this.timestampMs) * 31);
    }

    public final String toString() {
        return "[" + this.timestampMs + "] " + this.message;
    }
}
