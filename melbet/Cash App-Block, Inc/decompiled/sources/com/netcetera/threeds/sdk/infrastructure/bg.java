package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class bg implements size {
    private static int get = 1;
    private static int getWarnings;
    private final String ThreeDS2Service;

    public bg(String str) {
        this.ThreeDS2Service = str;
    }

    public String getWarnings() {
        int i = getWarnings;
        String str = this.ThreeDS2Service;
        int i2 = (((i | 22) << 1) - (i ^ 22)) - 1;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
