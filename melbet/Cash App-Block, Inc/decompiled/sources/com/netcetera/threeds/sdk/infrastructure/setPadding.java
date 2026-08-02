package com.netcetera.threeds.sdk.infrastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class setPadding {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final Map<String, String> getWarnings = new HashMap();

    public String ThreeDS2Service(String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 67;
        int i3 = (i & 67) << 1;
        get = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        if (this.getWarnings.containsKey(str)) {
            String str2 = this.getWarnings.get(str);
            int i4 = get;
            int i5 = ((i4 & 32) + (i4 | 32)) - 1;
            ThreeDS2ServiceInstance = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 65 / 0;
            }
            return str2;
        }
        int i7 = get;
        int i8 = (i7 & 121) + (i7 | 121);
        ThreeDS2ServiceInstance = i8 % 128;
        if (i8 % 2 != 0) {
            throw setTextAlignment.getType.initialize(str);
        }
        setTextAlignment settextalignment = setTextAlignment.getType;
        Object[] objArr = new Object[0];
        objArr[0] = str;
        throw settextalignment.initialize(objArr);
    }

    public void getWarnings(Set<String> set, String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 41;
        int i3 = ((i ^ 41) | i2) << 1;
        int i4 = -((i | 41) & (~i2));
        get = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        int i5 = get;
        int i6 = i5 & 15;
        int i7 = (i5 | 15) & (~i6);
        int i8 = i6 << 1;
        ThreeDS2ServiceInstance = (((i7 | i8) << 1) - (i7 ^ i8)) % 128;
        for (String str2 : set) {
            ThreeDS2ServiceInstance = (get + 19) % 128;
            if (this.getWarnings.containsKey(str2)) {
                int i9 = ThreeDS2ServiceInstance;
                get = ((-2) - (((i9 ^ 20) + ((i9 & 20) << 1)) ^ (-1))) % 128;
                if (!oj.get(str, this.getWarnings.get(str2))) {
                    int i10 = get;
                    ThreeDS2ServiceInstance = ((-2) - ((((i10 | 40) << 1) - (i10 ^ 40)) ^ (-1))) % 128;
                    throw setTextAlignment.restrictedParameters.initialize(str2);
                }
            }
            this.getWarnings.put(str2, str);
            int i11 = ThreeDS2ServiceInstance;
            get = ((i11 & 59) + (i11 | 59)) % 128;
        }
        int i12 = ThreeDS2ServiceInstance;
        int i13 = ((i12 ^ 13) - (~(-(-((i12 & 13) << 1))))) - 1;
        get = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }
}
