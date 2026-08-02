package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class setDrawingCacheEnabled implements setDuplicateParentStateEnabled<Set<String>> {
    private static int ThreeDS2Service = 1;
    private static int initialize;
    private final Set<String> getWarnings;

    private setDrawingCacheEnabled(Set<String> set) {
        this.getWarnings = set;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ((i2 | i3) * 521) + (((~(i4 | i2)) | i) * (-1042)) + (i2 * (-520)) + (i * 522);
        int i6 = ~i;
        int i7 = (((~(i | i4 | i2)) | (~(i3 | i6)) | (~((~i2) | i6))) * 521) + i5;
        if (i7 == 1) {
            return ThreeDS2Service(objArr);
        }
        if (i7 != 2) {
            if (i7 == 3) {
                return initialize(objArr);
            }
            setDrawingCacheEnabled setdrawingcacheenabled = new setDrawingCacheEnabled(new HashSet(Arrays.asList((String[]) objArr[0])));
            int i8 = ThreeDS2Service;
            int i9 = (i8 & 118) + (i8 | 118);
            initialize = ((i9 ^ (-1)) + (i9 << 1)) % 128;
            return setdrawingcacheenabled;
        }
        Set set = (Set) objArr[0];
        Set set2 = (Set) objArr[1];
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        hashSet.addAll(set2);
        setDrawingCacheEnabled setdrawingcacheenabled2 = new setDrawingCacheEnabled(hashSet);
        int i10 = initialize;
        int i11 = i10 & 13;
        int i12 = (i10 ^ 13) | i11;
        ThreeDS2Service = ((i11 & i12) + (i12 | i11)) % 128;
        return setdrawingcacheenabled2;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setDrawingCacheEnabled setdrawingcacheenabled = new setDrawingCacheEnabled((Set) objArr[0]);
        int i = ThreeDS2Service;
        int i2 = ((i ^ 87) - (~(-(-((i & 87) << 1))))) - 1;
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return setdrawingcacheenabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.setDrawingCacheEnabled.ThreeDS2Service;
        r0 = r5 ^ 49;
        r5 = -(-((r5 & 49) << 1));
        com.netcetera.threeds.sdk.infrastructure.setDrawingCacheEnabled.initialize = ((r0 & r5) + (r5 | r0)) % 128;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r5 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r5 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.setDrawingCacheEnabled.initialize;
        r3 = r5 & 117;
        r1 = ((r5 ^ 117) | r3) << 1;
        r5 = -((r5 | 117) & (~r3));
        com.netcetera.threeds.sdk.infrastructure.setDrawingCacheEnabled.ThreeDS2Service = ((r1 & r5) + (r5 | r1)) % 128;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ThreeDS2Service() {
        int i = initialize;
        int i2 = (((i & (-8)) | ((~i) & 7)) - (~((i & 7) << 1))) - 1;
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        boolean ThreeDS2ServiceInstance = ThreeDS2ServiceInstance();
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = initialize;
        int i6 = ((i5 ^ 73) | (i5 & 73)) << 1;
        int i7 = -(((~i5) & 73) | (i5 & (-74)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        ThreeDS2Service = i8 % 128;
        if (i8 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    public boolean ThreeDS2ServiceInstance() {
        int i = initialize;
        int i2 = ((i ^ 41) | (i & 41)) << 1;
        int i3 = -(((~i) & 41) | (i & (-42)));
        ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        boolean isEmpty = this.getWarnings.isEmpty();
        int i4 = ThreeDS2Service;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i4 ^ 103) | (i4 & 103)) << 1, ~(-(((~i4) & 103) | (i4 & (-104)))), 1, 128);
        return isEmpty;
    }

    public Set<String> getWarnings() {
        int i = ThreeDS2Service;
        int i2 = (i ^ 77) + ((i & 77) << 1);
        initialize = i2 % 128;
        int i3 = i2 % 2;
        Set<String> set = this.getWarnings;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        int i5 = (-2) - (((i & 98) + (i | 98)) ^ (-1));
        initialize = i5 % 128;
        if (i5 % 2 == 0) {
            return set;
        }
        throw null;
    }

    public static setDrawingCacheEnabled initialize(Set<String> set, Set<String> set2) {
        return (setDrawingCacheEnabled) get(new Object[]{set, set2}, -678199787, 678199789, (int) System.currentTimeMillis());
    }

    public static setDrawingCacheEnabled initialize(Set<String> set) {
        return (setDrawingCacheEnabled) get(new Object[]{set}, 1622279849, -1622279846, (int) System.currentTimeMillis());
    }

    public static setDrawingCacheEnabled getWarnings(String... strArr) {
        return (setDrawingCacheEnabled) get(new Object[]{strArr}, -1741236806, 1741236806, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setDrawingCacheEnabled setdrawingcacheenabled = new setDrawingCacheEnabled(Collections.EMPTY_SET);
        int i = initialize + 95;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            return setdrawingcacheenabled;
        }
        throw null;
    }

    public static setDrawingCacheEnabled get() {
        return (setDrawingCacheEnabled) get(new Object[0], 1448993882, -1448993881, (int) System.currentTimeMillis());
    }
}
