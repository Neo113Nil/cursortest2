package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class setBackgroundResource implements setDuplicateParentStateEnabled<Set<String>> {
    private static int get = 1;
    private static int getWarnings;
    private final Set<String> ThreeDS2Service;

    private setBackgroundResource(Set<String> set) {
        this.ThreeDS2Service = set;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-301)) + (i * EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE);
        int i5 = ~i;
        int i6 = (((~(i | (~i2))) | (~(i2 | i3))) * EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE) + ((~(i5 | i2 | i3)) * (-604)) + (((~((~i3) | i5 | i2)) | (~(i | i2 | i3))) * (-302)) + i4;
        if (i6 == 1) {
            Set set = (Set) objArr[0];
            Set set2 = (Set) objArr[1];
            HashSet hashSet = new HashSet();
            hashSet.addAll(set);
            hashSet.addAll(set2);
            setBackgroundResource setbackgroundresource = new setBackgroundResource(hashSet);
            int i7 = get;
            getWarnings = (((i7 | 77) << 1) - (i7 ^ 77)) % 128;
            return setbackgroundresource;
        }
        if (i6 == 2) {
            return initialize(objArr);
        }
        if (i6 != 3) {
            setBackgroundResource setbackgroundresource2 = new setBackgroundResource(new HashSet(Arrays.asList((String[]) objArr[0])));
            int i8 = getWarnings;
            get = ((i8 & 13) + (i8 | 13)) % 128;
            return setbackgroundresource2;
        }
        setBackgroundResource setbackgroundresource3 = new setBackgroundResource(Collections.EMPTY_SET);
        int i9 = get;
        int i10 = i9 & 99;
        getWarnings = (i10 + ((i9 ^ 99) | i10)) % 128;
        return setbackgroundresource3;
    }

    public static setBackgroundResource getWarnings(Set<String> set, Set<String> set2) {
        return (setBackgroundResource) ThreeDS2ServiceInstance(new Object[]{set, set2}, 466400441, -466400440, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setBackgroundResource setbackgroundresource = new setBackgroundResource((Set) objArr[0]);
        int i = get;
        int i2 = ((i & 80) + (i | 80)) - 1;
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            return setbackgroundresource;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    public boolean ThreeDS2Service() {
        boolean z;
        int i = getWarnings;
        int i2 = i & 49;
        int i3 = (((i | 49) & (~i2)) - (~(i2 << 1))) - 1;
        get = i3 % 128;
        if (i3 % 2 == 0) {
            ThreeDS2ServiceInstance();
            throw null;
        }
        if (ThreeDS2ServiceInstance()) {
            int i4 = getWarnings;
            get = SVG$Unit$EnumUnboxingLocalUtility.m$1((i4 | 16) << 1, i4 ^ 16, 1, 128);
            z = false;
        } else {
            int i5 = getWarnings;
            int i6 = i5 & 19;
            get = SVG$Unit$EnumUnboxingLocalUtility.m$1(i6, ~((i5 ^ 19) | i6), 1, 128);
            z = true;
        }
        int i7 = getWarnings;
        int i8 = i7 ^ 43;
        int i9 = ((i7 & 43) | i8) << 1;
        int i10 = -i8;
        get = ((i9 & i10) + (i9 | i10)) % 128;
        return z;
    }

    public Set<String> get() {
        int i = get;
        Set<String> set = this.ThreeDS2Service;
        int i2 = i ^ 57;
        int i3 = (i & 57) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return set;
    }

    public static setBackgroundResource getWarnings(String... strArr) {
        return (setBackgroundResource) ThreeDS2ServiceInstance(new Object[]{strArr}, -447734576, 447734576, (int) System.currentTimeMillis());
    }

    public static setBackgroundResource initialize(Set<String> set) {
        return (setBackgroundResource) ThreeDS2ServiceInstance(new Object[]{set}, -1666386940, 1666386942, (int) System.currentTimeMillis());
    }

    public static setBackgroundResource initialize() {
        return (setBackgroundResource) ThreeDS2ServiceInstance(new Object[0], 1335949815, -1335949812, (int) System.currentTimeMillis());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    public boolean ThreeDS2ServiceInstance() {
        int i = get;
        getWarnings = ((i ^ 23) + ((i & 23) << 1)) % 128;
        boolean isEmpty = this.ThreeDS2Service.isEmpty();
        int i2 = getWarnings;
        get = (((i2 | 105) << 1) - (((~i2) & 105) | (i2 & (-106)))) % 128;
        return isEmpty;
    }
}
