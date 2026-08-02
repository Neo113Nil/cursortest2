package com.netcetera.threeds.sdk.infrastructure;

import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class setVerticalScrollbarOverlay {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    private final byte[] initialize;

    public setVerticalScrollbarOverlay(byte[] bArr) {
        this.initialize = bArr;
    }

    public byte[] ThreeDS2Service() {
        int i = getWarnings;
        int i2 = i & 111;
        int i3 = (i2 - (~((i ^ 111) | i2))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.initialize;
        if (i4 != 0) {
            return bArr;
        }
        throw null;
    }

    public int get() {
        int i = getWarnings;
        int i2 = i | 9;
        int i3 = i2 << 1;
        int i4 = -(i2 & (~(i & 9)));
        int i5 = (i3 & i4) + (i4 | i3);
        ThreeDS2ServiceInstance = i5 % 128;
        int i6 = i5 % 2;
        int length = this.initialize.length;
        if (i6 == 0) {
            throw null;
        }
        int i7 = i & 9;
        int i8 = -(-((i ^ 9) | i7));
        ThreeDS2ServiceInstance = ((i7 & i8) + (i8 | i7)) % 128;
        return length;
    }

    public String getWarnings() {
        String str = new String(this.initialize, StandardCharsets.UTF_8);
        int i = getWarnings;
        int i2 = i & 9;
        int i3 = ((i ^ 9) | i2) << 1;
        int i4 = -((i | 9) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return str;
    }
}
