package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class lp implements jt {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final jt getWarnings;
    private final jt initialize;

    public lp(jt jtVar, jt jtVar2) {
        this.getWarnings = jtVar;
        this.initialize = jtVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String get() {
        int i = get;
        int i2 = (i & (-6)) | ((~i) & 5);
        int i3 = (i & 5) << 1;
        ThreeDS2Service = ((i2 & i3) + (i3 | i2)) % 128;
        String str = (String) og.ThreeDS2Service(((jt) og.ThreeDS2Service(this.getWarnings, this.initialize)).get(), this.initialize.get());
        int i4 = ThreeDS2Service;
        int i5 = i4 & 21;
        int i6 = ((i4 | 21) & (~i5)) + (i5 << 1);
        get = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String getWarnings() {
        int i = ThreeDS2Service;
        get = (((i | 107) << 1) - (((~i) & 107) | (i & (-108)))) % 128;
        String str = (String) og.ThreeDS2Service(((jt) og.ThreeDS2Service(this.getWarnings, this.initialize)).getWarnings(), this.initialize.getWarnings());
        int i2 = ThreeDS2Service;
        int i3 = i2 & 5;
        int i4 = (i2 | 5) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        get = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
