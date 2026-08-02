package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes5.dex */
public class setIndeterminateDrawableTiled implements setMinHeight {
    private static int get = 1;
    private static int getWarnings;
    private final setMinHeight ThreeDS2Service;
    private final setWeightSum ThreeDS2ServiceInstance;
    private final setMinHeight initialize;

    public setIndeterminateDrawableTiled(setWeightSum setweightsum, setMinHeight setminheight, setMinHeight setminheight2) {
        this.ThreeDS2ServiceInstance = setweightsum;
        this.ThreeDS2Service = setminheight;
        this.initialize = setminheight2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        r1 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.getWarnings;
        r5 = r1 ^ 103;
        r1 = ((r1 & 103) | r5) << 1;
        r5 = -r5;
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get = ((r1 ^ r5) + ((r1 & r5) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r2.ThreeDS2ServiceInstance().booleanValue() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        r1 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.getWarnings;
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get = ((r1 ^ 17) + ((r1 & 17) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        if (((java.lang.Boolean) ThreeDS2ServiceInstance(new java.lang.Object[]{r7, r4}, -574754779, 574754779, java.lang.System.identityHashCode(r7))).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        r7 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get;
        r1 = r7 & 73;
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.getWarnings = (r1 + ((r7 ^ 73) | r1)) % 128;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r1.cleanup() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r1.cleanup() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x009f, code lost:
    
        r7 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get;
        r1 = r7 & 35;
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.getWarnings = (r1 + ((r7 ^ 35) | r1)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        setIndeterminateDrawable initialize;
        Long ThreeDS2Service;
        setIndeterminateDrawableTiled setindeterminatedrawabletiled = (setIndeterminateDrawableTiled) objArr[0];
        int i = get;
        int i2 = (i & (-30)) | ((~i) & 29);
        boolean z = true;
        int i3 = (i & 29) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            setDividerHeight ThreeDS2ServiceInstance = setindeterminatedrawabletiled.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance();
            initialize = ThreeDS2ServiceInstance.initialize();
            ThreeDS2Service = setindeterminatedrawabletiled.ThreeDS2ServiceInstance.ThreeDS2Service();
            int i5 = 47 / 0;
        } else {
            setDividerHeight ThreeDS2ServiceInstance2 = setindeterminatedrawabletiled.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance();
            initialize = ThreeDS2ServiceInstance2.initialize();
            ThreeDS2Service = setindeterminatedrawabletiled.ThreeDS2ServiceInstance.ThreeDS2Service();
        }
        int i6 = get;
        int i7 = i6 & 49;
        int i8 = (i6 ^ 49) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        getWarnings = i9 % 128;
        if (i9 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        int i10 = 6 / 0;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (java.util.Objects.equals(r7, com.netcetera.threeds.sdk.infrastructure.om.ThreeDS2Service) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (java.util.Objects.equals(r7, com.netcetera.threeds.sdk.infrastructure.om.ThreeDS2Service) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        r7 = new java.util.Date().after(new java.util.Date(r7.longValue() + 2592000000L));
        r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get;
        r2 = r0 & 21;
        r0 = (r0 | 21) & (~r2);
        r2 = r2 << 1;
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.getWarnings = (((r0 | r2) << 1) - (r0 ^ r2)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0075, code lost:
    
        return java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r7 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get;
        r0 = r7 ^ 55;
        r7 = -(-((r7 & 55) << 1));
        r1 = (r0 & r7) + (r7 | r0);
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.getWarnings = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object get(Object[] objArr) {
        Long l = (Long) objArr[1];
        int i = getWarnings;
        int i2 = ((i & 76) + (i | 76)) - 1;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r6.ThreeDS2Service.initialize(r7, r8);
        r6 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.getWarnings;
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get = ((r6 & 9) + (r6 | 9)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (((java.lang.Boolean) ThreeDS2ServiceInstance(new java.lang.Object[]{r6}, -530987193, 530987194, java.lang.System.identityHashCode(r6))).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (((java.lang.Boolean) ThreeDS2ServiceInstance(new java.lang.Object[]{r6}, -530987193, 530987194, java.lang.System.identityHashCode(r6))).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006a, code lost:
    
        if (((java.lang.Boolean) ThreeDS2ServiceInstance(new java.lang.Object[]{r6}, -261052792, 261052794, java.lang.System.identityHashCode(r6))).booleanValue() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006c, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.getWarnings;
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m$1((r0 | 10) << 1, r0 ^ 10, 1, 128);
        r6.initialize.initialize(r7, r8);
        r6 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get;
        r7 = r6 & 19;
        r6 = (r6 | 19) & (~r7);
        r7 = -(-(r7 << 1));
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.getWarnings = ((r6 ^ r7) + ((r6 & r7) << 1)) % 128;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.setMinHeight
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initialize(setOnItemClickListener setonitemclicklistener, String str) {
        int i = get + 99;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 61 / 0;
        }
        int i3 = getWarnings;
        int i4 = i3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i5 = (i3 | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i4);
        int i6 = -(-(i4 << 1));
        get = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setIndeterminateDrawableTiled setindeterminatedrawabletiled = (setIndeterminateDrawableTiled) objArr[0];
        int i = get;
        int i2 = ((i ^ 24) + ((i & 24) << 1)) - 1;
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            setDividerHeight ThreeDS2ServiceInstance = setindeterminatedrawabletiled.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance();
            Long ThreeDS2Service = setindeterminatedrawabletiled.ThreeDS2ServiceInstance.ThreeDS2Service();
            if (Objects.equals(ThreeDS2Service, om.ThreeDS2Service)) {
                int i3 = get;
                int i4 = (i3 & 111) + (i3 | 111);
                getWarnings = i4 % 128;
                if (i4 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
            boolean after = new Date().after(new Date(ThreeDS2Service.longValue() + (ThreeDS2ServiceInstance.get().getWarnings() * 86400000)));
            getWarnings = (get + 27) % 128;
            return Boolean.valueOf(after);
        }
        setindeterminatedrawabletiled.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance();
        Objects.equals(setindeterminatedrawabletiled.ThreeDS2ServiceInstance.ThreeDS2Service(), om.ThreeDS2Service);
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ((~(i4 | i5)) * EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (i2 * (-209)) + (i * (-209));
        int i7 = ~i3;
        int i8 = (((~(i | i5 | i3)) | (~(i2 | i4 | i7))) * EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i5 | i7)) | (~(i4 | i3))) * EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + i6;
        return i8 != 1 ? i8 != 2 ? get(objArr) : initialize(objArr) : ThreeDS2ServiceInstance(objArr);
    }
}
