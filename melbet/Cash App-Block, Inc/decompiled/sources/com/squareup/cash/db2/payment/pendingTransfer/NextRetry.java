package com.squareup.cash.db2.payment.pendingTransfer;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NextRetry {
    public final Long min;

    public NextRetry(Long l) {
        this.min = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NextRetry) && Intrinsics.areEqual(this.min, ((NextRetry) obj).min);
    }

    public final int hashCode() {
        Long l = this.min;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "NextRetry(min=" + this.min + ")";
    }
}
