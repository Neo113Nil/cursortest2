package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class setLayerPaint implements setDuplicateParentStateEnabled<ThreeDS2ServiceInstance> {
    private static int get = 1;
    private static int getWarnings;
    private final ThreeDS2ServiceInstance ThreeDS2Service;

    public setLayerPaint(ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        this.ThreeDS2Service = threeDS2ServiceInstance;
    }

    public static setLayerPaint get() {
        return (setLayerPaint) initialize(new Object[0], 472579362, -472579362, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-574)) + (i * (-574));
        int i5 = ~i;
        int i6 = ~i3;
        int i7 = ~(i5 | i6);
        int i8 = ~((~i2) | i3);
        int i9 = ((~(i2 | i6)) | i8) * (-575);
        int i10 = (((~(i | i6)) | (~(i3 | i5))) * 575) + i9 + ((i7 | i8) * 1150) + i4;
        if (i10 == 1) {
            setLayerPaint setlayerpaint = new setLayerPaint(new ThreeDS2ServiceInstance((String) objArr[0], (String) objArr[1]));
            getWarnings = (get + 23) % 128;
            return setlayerpaint;
        }
        String str = "";
        setLayerPaint setlayerpaint2 = new setLayerPaint(new ThreeDS2ServiceInstance(str, str));
        int i11 = get;
        int i12 = i11 & 43;
        int i13 = i11 | 43;
        getWarnings = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        return setlayerpaint2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    public boolean ThreeDS2Service() {
        int i = get;
        int i2 = i ^ 1;
        int i3 = (i & 1) << 1;
        getWarnings = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        boolean booleanValue = ((Boolean) ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{this.ThreeDS2Service}, 1458569496, -1458569496, (int) System.currentTimeMillis())).booleanValue();
        int i4 = getWarnings;
        get = ((i4 & 121) + (i4 | 121)) % 128;
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r7 = com.netcetera.threeds.sdk.infrastructure.setLayerPaint.getWarnings;
        r0 = r7 ^ 31;
        r7 = ((r7 & 31) | r0) << 1;
        r0 = -r0;
        com.netcetera.threeds.sdk.infrastructure.setLayerPaint.get = (((r7 | r0) << 1) - (r7 ^ r0)) % 128;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (((java.lang.Boolean) com.netcetera.threeds.sdk.infrastructure.setLayerPaint.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(r7, 1458569496, -1458569496, (int) r5)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (((java.lang.Boolean) com.netcetera.threeds.sdk.infrastructure.setLayerPaint.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(r7, 1458569496, -1458569496, (int) r5)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0053, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setLayerPaint.get = (com.netcetera.threeds.sdk.infrastructure.setLayerPaint.getWarnings + 49) % 128;
        r7 = false;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.setDuplicateParentStateEnabled
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ThreeDS2ServiceInstance() {
        boolean z;
        int i = get;
        int i2 = (i & 15) + (i | 15);
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.ThreeDS2Service};
        long currentTimeMillis = System.currentTimeMillis();
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = getWarnings;
        int i6 = i5 & 99;
        int i7 = (i5 | 99) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i7 | i8);
        get = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 22 / 0;
        }
        return z;
    }

    public ThreeDS2ServiceInstance getWarnings() {
        int i = getWarnings;
        int i2 = (i & (-114)) | ((~i) & 113);
        int i3 = (i & 113) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        get = i5;
        int i6 = i4 % 2;
        ThreeDS2ServiceInstance threeDS2ServiceInstance = this.ThreeDS2Service;
        if (i6 == 0) {
            int i7 = 73 / 0;
        }
        int i8 = i5 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i9 = (i5 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i8;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        getWarnings = i10 % 128;
        if (i10 % 2 == 0) {
            return threeDS2ServiceInstance;
        }
        throw null;
    }

    public static setLayerPaint ThreeDS2Service(String str, String str2) {
        return (setLayerPaint) initialize(new Object[]{str, str2}, 2144845291, -2144845290, (int) System.currentTimeMillis());
    }

    public static class ThreeDS2ServiceInstance {
        private static int ThreeDS2Service = 1;
        private static int ThreeDS2ServiceInstance;
        private final String get;
        private final String getWarnings;

        private ThreeDS2ServiceInstance(String str, String str2) {
            this.getWarnings = str;
            this.get = str2;
        }

        public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
            int i4 = (i2 * 949) + (i * (-947));
            int i5 = ~i;
            int i6 = ~i2;
            if (((i | i6) * 948) + ((~((~i3) | i5 | i6)) * (-948)) + (((~(i6 | i3)) | i5) * (-948)) + i4 == 1) {
                return ThreeDS2ServiceInstance(objArr);
            }
            ThreeDS2ServiceInstance threeDS2ServiceInstance = (ThreeDS2ServiceInstance) objArr[0];
            int i7 = ThreeDS2ServiceInstance + 74;
            ThreeDS2Service = ((i7 ^ (-1)) + (i7 << 1)) % 128;
            Boolean bool = (Boolean) ThreeDS2ServiceInstance(new Object[]{threeDS2ServiceInstance}, 1487200285, -1487200284, System.identityHashCode(threeDS2ServiceInstance));
            bool.booleanValue();
            int i8 = ThreeDS2ServiceInstance;
            int i9 = ((i8 | 32) << 1) - (i8 ^ 32);
            ThreeDS2Service = ((i9 ^ (-1)) + (i9 << 1)) % 128;
            return bool;
        }

        public String ThreeDS2Service() {
            int i = (ThreeDS2Service + 49) % 128;
            ThreeDS2ServiceInstance = i;
            String str = this.getWarnings;
            int i2 = ((i | 55) << 1) - (i ^ 55);
            ThreeDS2Service = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 77 / 0;
            }
            return str;
        }

        public String get() {
            int i = ThreeDS2ServiceInstance;
            int i2 = i & 95;
            int i3 = (i ^ 95) | i2;
            int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            ThreeDS2Service = i4;
            String str = this.get;
            int i5 = (i4 & 17) + (i4 | 17);
            ThreeDS2ServiceInstance = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
            ThreeDS2ServiceInstance threeDS2ServiceInstance = (ThreeDS2ServiceInstance) objArr[0];
            int i = ThreeDS2Service + 41;
            ThreeDS2ServiceInstance = i % 128;
            int i2 = i % 2;
            String str = threeDS2ServiceInstance.getWarnings;
            if (i2 == 0) {
                return Boolean.valueOf(oj.initialize(str));
            }
            oj.initialize(str);
            throw null;
        }
    }
}
