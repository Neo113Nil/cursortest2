package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class ew implements ep, Serializable {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;
    private HashMap<String, Serializable> ThreeDS2ServiceInstance = new HashMap<>();

    private static /* synthetic */ Object get(Object[] objArr) {
        ew ewVar = (ew) objArr[0];
        String str = (String) objArr[1];
        Serializable serializable = (Serializable) objArr[2];
        int i = getWarnings + 29;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Serializable serializable2 = (Serializable) og.ThreeDS2Service(ewVar.ThreeDS2ServiceInstance.get(str), serializable);
        int i2 = getWarnings;
        int i3 = (i2 & 57) + (i2 | 57);
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            return serializable2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.er
    public Integer ThreeDS2Service(String str, int i) {
        int i2 = getWarnings + 75;
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, str, Integer.valueOf(i)};
        int identityHashCode = System.identityHashCode(this);
        if (i3 != 0) {
            return (Integer) ((Serializable) get(objArr, 732918368, -732918368, identityHashCode));
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.er
    public List<String> ThreeDS2ServiceInstance(String str, List<String> list) {
        List<String> list2 = (List) ((Serializable) get(new Object[]{this, str, new ArrayList(list)}, 732918368, -732918368, System.identityHashCode(this)));
        int i = getWarnings;
        ThreeDS2Service = ((i & 29) + (i | 29)) % 128;
        return list2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.er
    public Boolean getWarnings(String str, boolean z) {
        int i = getWarnings;
        int i2 = i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m$1(i2, ~((i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i2), 1, 128);
        Boolean bool = (Boolean) ((Serializable) get(new Object[]{this, str, Boolean.valueOf(z)}, 732918368, -732918368, System.identityHashCode(this)));
        int i3 = ThreeDS2Service;
        int i4 = i3 & 1;
        int i5 = (i3 | 1) & (~i4);
        int i6 = -(-(i4 << 1));
        getWarnings = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
        return bool;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.er
    public String initialize(String str, String str2) {
        int i = ThreeDS2Service;
        int i2 = i ^ 35;
        int i3 = -(-((i & 35) << 1));
        getWarnings = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        String str3 = (String) ((Serializable) get(new Object[]{this, str, str2}, 732918368, -732918368, System.identityHashCode(this)));
        int i4 = getWarnings + 21;
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            return str3;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.eq
    public void ThreeDS2Service(String str, List<String> list) {
        this.ThreeDS2ServiceInstance.put(str, new ArrayList(list));
        int i = getWarnings;
        int i2 = ((i ^ 28) + ((i & 28) << 1)) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.eq
    public void ThreeDS2Service(String str, String str2) {
        int i = getWarnings;
        int i2 = ((i | 49) << 1) - (i ^ 49);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, Serializable> hashMap = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            hashMap.put(str, str2);
            ThreeDS2Service = (getWarnings + 43) % 128;
        } else {
            hashMap.put(str, str2);
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.eq
    public void get(String str, int i) {
        int i2 = getWarnings;
        int i3 = (i2 & 65) + (i2 | 65);
        ThreeDS2Service = i3 % 128;
        int i4 = i3 % 2;
        HashMap<String, Serializable> hashMap = this.ThreeDS2ServiceInstance;
        if (i4 == 0) {
            hashMap.put(str, Integer.valueOf(i));
            int i5 = 16 / 0;
        } else {
            hashMap.put(str, Integer.valueOf(i));
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.eq
    public void get(String str, boolean z) {
        int i = ThreeDS2Service;
        int i2 = i & 119;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i ^ 119) | i2) << 1, ~(-((i | 119) & (~i2))), 1, 128);
        this.ThreeDS2ServiceInstance.put(str, Boolean.valueOf(z));
        int i3 = getWarnings;
        int i4 = i3 | 121;
        ThreeDS2Service = ((i4 << 1) - ((~(i3 & 121)) & i4)) % 128;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }
}
