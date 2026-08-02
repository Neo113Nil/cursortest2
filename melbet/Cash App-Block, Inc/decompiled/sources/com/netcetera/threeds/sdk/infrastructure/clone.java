package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public abstract class clone {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;

    public clone ThreeDS2ServiceInstance(final clone cloneVar) {
        clone cloneVar2 = new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.clone.2
            private static int ThreeDS2Service = 1;
            private static int getWarnings;

            /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
            @Override // com.netcetera.threeds.sdk.infrastructure.clone
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean ThreeDS2ServiceInstance(nq nqVar, String str, boolean z) {
                int i;
                int i2 = getWarnings;
                int i3 = i2 & 1;
                int i4 = (i2 | 1) & (~i3);
                int i5 = -(-(i3 << 1));
                ThreeDS2Service = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
                if (clone.this.ThreeDS2ServiceInstance(nqVar, str, z)) {
                    int i6 = ThreeDS2Service + 57;
                    getWarnings = i6 % 128;
                    int i7 = i6 % 2;
                    clone cloneVar3 = cloneVar;
                    if (i7 != 0) {
                        cloneVar3.ThreeDS2ServiceInstance(nqVar, str, z);
                        throw null;
                    }
                    if (cloneVar3.ThreeDS2ServiceInstance(nqVar, str, z)) {
                        int i8 = ThreeDS2Service;
                        int i9 = i8 & 37;
                        int i10 = (i9 - (~((i8 ^ 37) | i9))) - 1;
                        int i11 = i10 % 128;
                        getWarnings = i11;
                        r1 = i10 % 2 == 0;
                        int i12 = ((i11 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i11 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) << 1;
                        int i13 = -(((~i11) & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i11 & (-124)));
                        ThreeDS2Service = ((i12 & i13) + (i13 | i12)) % 128;
                        int i14 = ThreeDS2Service;
                        i = (((i14 & (-18)) | ((~i14) & 17)) - (~((i14 & 17) << 1))) - 1;
                        getWarnings = i % 128;
                        if (i % 2 != 0) {
                            return r1;
                        }
                        throw null;
                    }
                }
                int i15 = getWarnings;
                ThreeDS2Service = ((i15 ^ 17) + ((i15 & 17) << 1)) % 128;
                int i142 = ThreeDS2Service;
                i = (((i142 & (-18)) | ((~i142) & 17)) - (~((i142 & 17) << 1))) - 1;
                getWarnings = i % 128;
                if (i % 2 != 0) {
                }
            }
        };
        int identityHashCode = System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = -(-((((-19202177) & identityHashCode) | (19202176 & i) | (identityHashCode & 19202176)) * 988));
        int i3 = (692144788 ^ i2) + ((i2 & 692144788) << 1);
        int i4 = (296173704 & i) | (i ^ 296173704);
        int i5 = ~i4;
        int i6 = (i4 | i5) & i5;
        int i7 = (-1374147532) & i6;
        int i8 = (((i6 | (-1374147532)) & (~i7)) | i7) * (-1976);
        int i9 = i3 & i8;
        int i10 = ((((i3 ^ i8) | i9) << 1) - (~(-((i8 | i3) & (~i9))))) - 1;
        int i11 = ~((identityHashCode & 1097176003) | (1097176003 ^ identityHashCode));
        int i12 = (1097176003 & i) | ((~i) & (-1097176004)) | (i & (-1097176004));
        int i13 = ~i12;
        int i14 = -(~(-(-(((i11 & 19202176) | (19202176 ^ i11) | ((i12 | i13) & i13)) * 988))));
        int i15 = (i10 ^ i14) + ((i14 & i10) << 1);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        int identityHashCode2 = System.identityHashCode(this);
        int i17 = ~(((-1185546337) ^ identityHashCode2) | ((-1185546337) & identityHashCode2));
        int i18 = ((~i17) & (-1337630447)) | (1337630446 & i17);
        int i19 = i17 & (-1337630447);
        int i20 = ((i19 & i18) | (i18 ^ i19)) * (-476);
        int i21 = ((1677153933 | i20) << 1) - (i20 ^ 1677153933);
        int i22 = (-1185546337) | identityHashCode2;
        int i23 = ~i22;
        int i24 = -(~(-(-(((i22 | i23) & i23) * 952))));
        int i25 = (((i21 | i24) << 1) - (i24 ^ i21)) - 1;
        int i26 = ~identityHashCode2;
        int i27 = (i26 & (-1320818273)) | ((-1320818273) ^ i26);
        int i28 = i27 & (-1202358511);
        int i29 = (i27 | (-1202358511)) & (~i28);
        int i30 = (i29 & i28) | (i29 ^ i28);
        int i31 = ~i30;
        int i32 = ((i30 | i31) & i31) * 476;
        if (i16 <= (((~i32) & i25) | ((~i25) & i32)) + ((i32 & i25) << 1)) {
            return cloneVar2;
        }
        throw null;
    }

    public abstract boolean ThreeDS2ServiceInstance(nq nqVar, String str, boolean z);

    public clone initialize(final clone cloneVar) {
        clone cloneVar2 = new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.clone.1
            private static int ThreeDS2Service = 0;
            private static int ThreeDS2ServiceInstance = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[RETURN] */
            @Override // com.netcetera.threeds.sdk.infrastructure.clone
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean ThreeDS2ServiceInstance(nq nqVar, String str, boolean z) {
                boolean z2;
                int i;
                int i2 = ThreeDS2Service;
                ThreeDS2ServiceInstance = ((i2 ^ 63) + ((i2 & 63) << 1)) % 128;
                if (!clone.this.ThreeDS2ServiceInstance(nqVar, str, z)) {
                    int i3 = ThreeDS2Service;
                    ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i3 & 65, ~(i3 | 65), 1, 128);
                    if (!cloneVar.ThreeDS2ServiceInstance(nqVar, str, z)) {
                        int i4 = ThreeDS2ServiceInstance;
                        ThreeDS2Service = (((i4 | 85) << 1) - (i4 ^ 85)) % 128;
                        z2 = false;
                        int i5 = ThreeDS2Service;
                        i = ((i5 | 115) << 1) - (i5 ^ 115);
                        ThreeDS2ServiceInstance = i % 128;
                        if (i % 2 == 0) {
                            return z2;
                        }
                        throw null;
                    }
                }
                ThreeDS2Service = (ThreeDS2ServiceInstance + 75) % 128;
                z2 = true;
                int i52 = ThreeDS2Service;
                i = ((i52 | 115) << 1) - (i52 ^ 115);
                ThreeDS2ServiceInstance = i % 128;
                if (i % 2 == 0) {
                }
            }
        };
        int i = ThreeDS2ServiceInstance + 69;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return cloneVar2;
        }
        throw null;
    }
}
