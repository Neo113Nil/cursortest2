package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public abstract class compareTo {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;

    public compareTo get(final compareTo compareto) {
        compareTo compareto2 = new compareTo() { // from class: com.netcetera.threeds.sdk.infrastructure.compareTo.5
            private static int ThreeDS2ServiceInstance = 1;
            private static int getWarnings;

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public findFragmentById get(nq nqVar, String str, boolean z) {
                int i = getWarnings;
                int i2 = i ^ 5;
                ThreeDS2ServiceInstance = ((((i & 5) | i2) << 1) - i2) % 128;
                findFragmentById findfragmentbyid = compareTo.this.get(nqVar, str, z);
                if (!findfragmentbyid.get()) {
                    int i3 = ThreeDS2ServiceInstance + 93;
                    getWarnings = i3 % 128;
                    if (i3 % 2 == 0) {
                        return findfragmentbyid;
                    }
                    throw null;
                }
                int i4 = getWarnings;
                int i5 = i4 | 81;
                int i6 = i5 << 1;
                int i7 = -((~(i4 & 81)) & i5);
                ThreeDS2ServiceInstance = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
                findFragmentById findfragmentbyid2 = compareto.get(nqVar, str, z);
                int i8 = ThreeDS2ServiceInstance;
                int i9 = ((i8 | 89) << 1) - (i8 ^ 89);
                getWarnings = i9 % 128;
                if (i9 % 2 == 0) {
                    return findfragmentbyid2;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.compareTo
            public nq getWarnings(nq nqVar, String str, boolean z) {
                int i = ThreeDS2ServiceInstance;
                int i2 = i ^ 43;
                int i3 = -(-((i & 43) << 1));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                getWarnings = i4 % 128;
                int i5 = i4 % 2;
                compareTo compareto3 = compareTo.this;
                nq warnings = compareto.getWarnings(nqVar, str, z);
                if (i5 != 0) {
                    compareto3.getWarnings(warnings, str, z);
                    throw null;
                }
                nq warnings2 = compareto3.getWarnings(warnings, str, z);
                int i6 = getWarnings;
                int i7 = (i6 & (-120)) | ((~i6) & 119);
                int i8 = -(-((i6 & 119) << 1));
                ThreeDS2ServiceInstance = ((i7 & i8) + (i8 | i7)) % 128;
                return warnings2;
            }
        };
        int i = getWarnings;
        int i2 = (i & 9) + (i | 9);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return compareto2;
    }

    public abstract findFragmentById get(nq nqVar, String str, boolean z);

    public nq getWarnings(nq nqVar, String str, boolean z) {
        int i = ThreeDS2Service;
        int i2 = i & 111;
        int i3 = ((i | 111) & (~i2)) + (i2 << 1);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            return nqVar;
        }
        throw null;
    }
}
