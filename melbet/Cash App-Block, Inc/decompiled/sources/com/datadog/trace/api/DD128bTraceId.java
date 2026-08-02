package com.datadog.trace.api;

import com.datadog.trace.api.internal.util.LongStringUtils;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public final class DD128bTraceId extends DDTraceId {
    public static final /* synthetic */ int $r8$clinit = 0;
    public String hexStr;
    public final long highOrderBits;
    public final long lowOrderBits;
    public String str;

    public DD128bTraceId(long j, long j2, String str) {
        this.highOrderBits = j;
        this.lowOrderBits = j2;
        this.hexStr = str;
    }

    public static DD128bTraceId fromHex(int i, int i2, String str) {
        long parseUnsignedLongHex;
        long j;
        if (str == null) {
            throw new NumberFormatException("s can't be null");
        }
        int length = str.length();
        if (i < 0 || i2 <= 0 || i2 > 32 || i + i2 > length) {
            throw new NumberFormatException("Illegal start or length");
        }
        if (i2 > 16) {
            int i3 = i2 - 16;
            j = LongStringUtils.parseUnsignedLongHex(str, i, i3, true);
            parseUnsignedLongHex = LongStringUtils.parseUnsignedLongHex(str, i3 + i, 16, true);
        } else {
            parseUnsignedLongHex = LongStringUtils.parseUnsignedLongHex(str, i, i2, true);
            j = 0;
        }
        long j2 = parseUnsignedLongHex;
        long j3 = j;
        if (i2 != 32) {
            str = null;
        } else if (i != 0) {
            str = str.substring(i, i + 32);
        }
        return new DD128bTraceId(j3, j2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DD128bTraceId)) {
            return false;
        }
        DD128bTraceId dD128bTraceId = (DD128bTraceId) obj;
        return this.highOrderBits == dD128bTraceId.highOrderBits && this.lowOrderBits == dD128bTraceId.lowOrderBits;
    }

    public final int hashCode() {
        long j = this.highOrderBits;
        long j2 = j ^ (j >>> 32);
        long j3 = this.lowOrderBits;
        return (int) ((j2 ^ j3) ^ (j3 >>> 32));
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final String toHexString() {
        String str = this.hexStr;
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[32];
        LongStringUtils.fillStringBytesWithPaddedHexId(this.highOrderBits, 0, 16, bArr);
        LongStringUtils.fillStringBytesWithPaddedHexId(this.lowOrderBits, 16, 16, bArr);
        String str2 = new String(bArr, StandardCharsets.US_ASCII);
        this.hexStr = str2;
        return str2;
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final String toHexStringPadded() {
        return LongStringUtils.toHexStringPadded(16, this.lowOrderBits);
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final long toHighOrderLong() {
        return this.highOrderBits;
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final long toLong() {
        return this.lowOrderBits;
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final String toString() {
        String str = this.str;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.lowOrderBits);
        this.str = unsignedString;
        return unsignedString;
    }
}
