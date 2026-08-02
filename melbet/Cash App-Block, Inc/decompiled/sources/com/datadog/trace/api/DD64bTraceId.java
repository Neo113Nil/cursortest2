package com.datadog.trace.api;

import com.datadog.trace.api.internal.util.LongStringUtils;

/* loaded from: classes4.dex */
public final class DD64bTraceId extends DDTraceId {
    public static final DD64bTraceId MAX = new DD64bTraceId(-1, "18446744073709551615");
    public String hexStr;
    public final long id;
    public String str;

    public DD64bTraceId(long j, String str) {
        this.id = j;
        this.str = str;
    }

    public static DD64bTraceId create(long j, String str) {
        DD64bTraceId dD64bTraceId;
        return (j != 0 || (dD64bTraceId = DDTraceId.ZERO) == null) ? j == -1 ? MAX : new DD64bTraceId(j, str) : dD64bTraceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DD64bTraceId) && this.id == ((DD64bTraceId) obj).id;
    }

    public final int hashCode() {
        long j = this.id;
        return (int) (j ^ (j >>> 32));
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final String toHexString() {
        String str = this.hexStr;
        if (str != null) {
            return str;
        }
        String hexStringPadded = LongStringUtils.toHexStringPadded(32, this.id);
        this.hexStr = hexStringPadded;
        return hexStringPadded;
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final String toHexStringPadded() {
        return LongStringUtils.toHexStringPadded(16, this.id);
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final long toHighOrderLong() {
        return 0L;
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final long toLong() {
        return this.id;
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final String toString() {
        String str = this.str;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.id);
        this.str = unsignedString;
        return unsignedString;
    }
}
