package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class la implements jq {
    private static int get = 0;
    private static int getWarnings = 1;
    private final jq ThreeDS2ServiceInstance;
    private final jq initialize;

    public la(jq jqVar, jq jqVar2) {
        this.ThreeDS2ServiceInstance = jqVar;
        this.initialize = jqVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public String ThreeDS2Service() {
        String str;
        int i = get + 43;
        getWarnings = i % 128;
        int i2 = i % 2;
        jq jqVar = this.ThreeDS2ServiceInstance;
        if (i2 == 0) {
            str = (String) ku.ThreeDS2ServiceInstance(new Object[]{jqVar, this.initialize, lc.getWarnings}, -1774358813, 1774358814, (int) System.currentTimeMillis());
            int i3 = 63 / 0;
        } else {
            str = (String) ku.ThreeDS2ServiceInstance(new Object[]{jqVar, this.initialize, lc.getWarnings}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        }
        System.identityHashCode(this);
        System.identityHashCode(this);
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = get;
        int i2 = i ^ 69;
        int i3 = ((i & 69) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        getWarnings = i5 % 128;
        int i6 = i5 % 2;
        jq jqVar = this.ThreeDS2ServiceInstance;
        jq jqVar2 = this.initialize;
        if (i6 != 0) {
            return ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{jqVar, jqVar2, le.initialize}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        }
        ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{jqVar, jqVar2, le.initialize}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int createTransaction() {
        int i = getWarnings;
        int i2 = i | 71;
        int i3 = i2 << 1;
        int i4 = -((~(i & 71)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        get = i5 % 128;
        int i6 = i5 % 2;
        jq jqVar = this.ThreeDS2ServiceInstance;
        jq jqVar2 = this.initialize;
        if (i6 != 0) {
            ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{jqVar, jqVar2, lh.getWarnings}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        int intValue = ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{jqVar, jqVar2, lh.getWarnings}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        int i7 = get + 125;
        getWarnings = i7 % 128;
        if (i7 % 2 != 0) {
            return intValue;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = getWarnings;
        int i2 = (i & (-44)) | ((~i) & 43);
        int i3 = (i & 43) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        get = i4 % 128;
        int i5 = i4 % 2;
        jq jqVar = this.ThreeDS2ServiceInstance;
        jq jqVar2 = this.initialize;
        if (i5 != 0) {
            throw null;
        }
        String str = (String) ku.ThreeDS2ServiceInstance(new Object[]{jqVar, jqVar2, lf.get}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        int i6 = get;
        getWarnings = ((((i6 | 52) << 1) - (i6 ^ 52)) - 1) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int getWarnings() {
        int i = get;
        int i2 = i | 5;
        int i3 = i2 << 1;
        int i4 = -((~(i & 5)) & i2);
        getWarnings = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        int intValue = ((Integer) ku.ThreeDS2ServiceInstance(new Object[]{this.ThreeDS2ServiceInstance, this.initialize, ld.ThreeDS2Service}, 1282703768, -1282703768, (int) System.currentTimeMillis())).intValue();
        int i5 = get;
        int i6 = i5 ^ 105;
        int i7 = (i5 & 105) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        getWarnings = i8 % 128;
        if (i8 % 2 != 0) {
            return intValue;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = get;
        int i2 = i & 63;
        int i3 = (i | 63) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getWarnings = i5 % 128;
        int i6 = i5 % 2;
        jq jqVar = this.ThreeDS2ServiceInstance;
        jq jqVar2 = this.initialize;
        if (i6 != 0) {
            return (String) ku.ThreeDS2ServiceInstance(new Object[]{jqVar, jqVar2, lb.get}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        }
        throw null;
    }
}
