package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
abstract class ku {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;

    public interface initialize<O, C extends jp> {
        O ThreeDS2ServiceInstance(C c);
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        jp jpVar = (jp) objArr[0];
        jp jpVar2 = (jp) objArr[1];
        initialize initializeVar = (initialize) objArr[2];
        int i = ThreeDS2ServiceInstance;
        int i2 = (i ^ 95) + ((i & 95) << 1);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            og.ThreeDS2Service(initializeVar.ThreeDS2ServiceInstance((jp) og.ThreeDS2Service(jpVar, jpVar2)), initializeVar.ThreeDS2ServiceInstance(jpVar2));
            throw null;
        }
        Object ThreeDS2Service2 = og.ThreeDS2Service(initializeVar.ThreeDS2ServiceInstance((jp) og.ThreeDS2Service(jpVar, jpVar2)), initializeVar.ThreeDS2ServiceInstance(jpVar2));
        ThreeDS2Service = (ThreeDS2ServiceInstance + 77) % 128;
        return ThreeDS2Service2;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = ((~(i | i3)) * EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + (i2 * (-215)) + (i * EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE);
        int i5 = (~i2) | i;
        int i6 = ~i3;
        return (((~(i | i6)) | i2) * EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + (((i5 | i6) * (-216)) + i4) != 1 ? initialize(objArr) : ThreeDS2Service(objArr);
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        jp jpVar = (jp) objArr[0];
        jp jpVar2 = (jp) objArr[1];
        initialize initializeVar = (initialize) objArr[2];
        int i = ThreeDS2ServiceInstance;
        ThreeDS2Service = ((i & 45) + (i | 45)) % 128;
        Integer num = (Integer) ThreeDS2ServiceInstance(new Object[]{jpVar, jpVar2, initializeVar}, -1774358813, 1774358814, (int) System.currentTimeMillis());
        if (num.intValue() > 0) {
            int i2 = ThreeDS2ServiceInstance;
            int i3 = i2 & 85;
            ThreeDS2Service = (((i2 | 85) & (~i3)) + (i3 << 1)) % 128;
        } else {
            num = (Integer) initializeVar.ThreeDS2ServiceInstance(jpVar2);
            int i4 = ThreeDS2ServiceInstance;
            int i5 = ((i4 ^ 73) | (i4 & 73)) << 1;
            int i6 = -(((~i4) & 73) | (i4 & (-74)));
            ThreeDS2Service = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        }
        int i7 = ThreeDS2Service;
        int i8 = ((i7 | 1) << 1) - (i7 ^ 1);
        ThreeDS2ServiceInstance = i8 % 128;
        if (i8 % 2 != 0) {
            return num;
        }
        throw null;
    }
}
