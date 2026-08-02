package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public /* synthetic */ class setImageMatrixC2551$5 {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;
    public static final /* synthetic */ int[] initialize;

    static {
        int[] iArr = new int[setImageAlpha.values().length];
        initialize = iArr;
        try {
            iArr[setImageAlpha.ThreeDS2Service.ordinal()] = 1;
            int i = getWarnings;
            int i2 = ((i ^ 93) | (i & 93)) << 1;
            int i3 = -(((~i) & 93) | (i & (-94)));
            ThreeDS2Service = ((i2 & i3) + (i3 | i2)) % 128;
        } catch (NoSuchFieldError unused) {
        }
        try {
            initialize[setImageAlpha.getWarnings.ordinal()] = 2;
            int i4 = ThreeDS2Service;
            int i5 = i4 & 65;
            int i6 = (i4 | 65) & (~i5);
            int i7 = i5 << 1;
            getWarnings = ((i6 & i7) + (i6 | i7)) % 128;
        } catch (NoSuchFieldError unused2) {
        }
        int i8 = ThreeDS2Service;
        int i9 = (i8 ^ 35) + ((i8 & 35) << 1);
        getWarnings = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }
}
