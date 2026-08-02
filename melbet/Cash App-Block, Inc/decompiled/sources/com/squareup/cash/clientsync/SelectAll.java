package com.squareup.cash.clientsync;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectAll {
    public final String message;
    public final long timestamp_ms;

    public SelectAll(long j, String str) {
        str.getClass();
        this.timestamp_ms = j;
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectAll)) {
            return false;
        }
        SelectAll selectAll = (SelectAll) obj;
        return this.timestamp_ms == selectAll.timestamp_ms && Intrinsics.areEqual(this.message, selectAll.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final long getTimestamp_ms() {
        return this.timestamp_ms;
    }

    public final int hashCode() {
        return this.message.hashCode() + (Long.hashCode(this.timestamp_ms) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("SelectAll(timestamp_ms=", this.timestamp_ms, ", message=", this.message);
        m.append(")");
        return m.toString();
    }
}
