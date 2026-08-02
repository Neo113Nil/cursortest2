package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class setContentInsetsRelative {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        int i;
        boolean z = false;
        setScroller setscroller = (setScroller) objArr[0];
        int i2 = ThreeDS2ServiceInstance;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i2 ^ 117, ~(-(-((i2 & 117) << 1))), 1, 128);
        if (((Boolean) get(new Object[]{setscroller.getSDKInfo()}, -1837035991, 1837035991, (int) System.currentTimeMillis())).booleanValue()) {
            ThreeDS2ServiceInstance = (getWarnings + 65) % 128;
            if (put.get.equals(setscroller.initialize())) {
                int i3 = (ThreeDS2ServiceInstance + 63) % 128;
                getWarnings = i3;
                int i4 = (i3 & (-108)) | ((~i3) & 107);
                int i5 = (i3 & 107) << 1;
                ThreeDS2ServiceInstance = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
                z = true;
                int i6 = ThreeDS2ServiceInstance;
                int i7 = i6 & 111;
                int i8 = i6 | 111;
                i = ((i7 | i8) << 1) - (i8 ^ i7);
                getWarnings = i % 128;
                if (i % 2 != 0) {
                    return Boolean.valueOf(z);
                }
                throw null;
            }
        }
        int i9 = ThreeDS2ServiceInstance + 120;
        getWarnings = ((i9 ^ (-1)) + (i9 << 1)) % 128;
        int i62 = ThreeDS2ServiceInstance;
        int i72 = i62 & 111;
        int i82 = i62 | 111;
        i = ((i72 | i82) << 1) - (i82 ^ i72);
        getWarnings = i % 128;
        if (i % 2 != 0) {
        }
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        List list = (List) objArr[0];
        int i = getWarnings;
        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 82) << 1, i ^ 82, 1, 128);
        if (list != null) {
            ThreeDS2ServiceInstance = (i + 5) % 128;
            Iterator it = list.iterator();
            int i2 = getWarnings;
            int i3 = i2 & 65;
            ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i3, ~(-(-((i2 ^ 65) | i3))), 1, 128);
            while (it.hasNext()) {
                int i4 = getWarnings;
                int i5 = i4 & 95;
                int i6 = (i4 ^ 95) | i5;
                ThreeDS2ServiceInstance = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
                if (((setMarqueeRepeatLimit) it.next()) instanceof setTitleMarginStart) {
                    int i7 = getWarnings;
                    int i8 = (i7 & (-2)) | ((~i7) & 1);
                    int i9 = (i7 & 1) << 1;
                    int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                    ThreeDS2ServiceInstance = i10 % 128;
                    if (i10 % 2 != 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
                int i11 = getWarnings;
                int i12 = i11 & 33;
                int i13 = i11 | 33;
                ThreeDS2ServiceInstance = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
            }
        }
        int i14 = ThreeDS2ServiceInstance;
        getWarnings = ((i14 & 7) + (i14 | 7)) % 128;
        return Boolean.FALSE;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        boolean z = false;
        setScroller setscroller = (setScroller) objArr[0];
        int i = getWarnings;
        int i2 = i & 117;
        int i3 = (i ^ 117) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            ((Boolean) get(new Object[]{setscroller}, 1573956416, -1573956414, (int) System.currentTimeMillis())).booleanValue();
            throw null;
        }
        if (((Boolean) get(new Object[]{setscroller}, 1573956416, -1573956414, (int) System.currentTimeMillis())).booleanValue() && oj.ThreeDS2Service(setscroller.cbConfiguration())) {
            int i5 = getWarnings;
            int i6 = (i5 & (-102)) | ((~i5) & 101);
            int i7 = (i5 & 101) << 1;
            ThreeDS2ServiceInstance = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            if (oj.ThreeDS2Service(setscroller.mastercardSchemeConfiguration())) {
                int i8 = getWarnings;
                ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i8 ^ 65) | (i8 & 65)) << 1, ~(-(((~i8) & 65) | (i8 & (-66)))), 1, 128);
                z = true;
                int i9 = ThreeDS2ServiceInstance;
                getWarnings = (((i9 | 53) << 1) - (i9 ^ 53)) % 128;
                return Boolean.valueOf(z);
            }
        }
        int i10 = ThreeDS2ServiceInstance;
        int i11 = (i10 & 98) + (i10 | 98);
        getWarnings = ((i11 ^ (-1)) + (i11 << 1)) % 128;
        int i92 = ThreeDS2ServiceInstance;
        getWarnings = (((i92 | 53) << 1) - (i92 ^ 53)) % 128;
        return Boolean.valueOf(z);
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        boolean z = false;
        setScroller setscroller = (setScroller) objArr[0];
        int i = (-2) - ((getWarnings + 112) ^ (-1));
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            ((Boolean) get(new Object[]{setscroller}, 1573956416, -1573956414, (int) System.currentTimeMillis())).booleanValue();
            throw null;
        }
        if (((Boolean) get(new Object[]{setscroller}, 1573956416, -1573956414, (int) System.currentTimeMillis())).booleanValue() && setscroller.getParamValue() != null) {
            int i2 = getWarnings;
            int i3 = i2 & 77;
            int i4 = (i2 | 77) & (~i3);
            int i5 = -(-(i3 << 1));
            ThreeDS2ServiceInstance = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
            if (printStackTrace.get.equals(setscroller.getParamValue())) {
                int i6 = getWarnings;
                int i7 = i6 & 103;
                int i8 = ((i6 ^ 103) | i7) << 1;
                int i9 = -((i6 | 103) & (~i7));
                ThreeDS2ServiceInstance = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                z = true;
                int i10 = ThreeDS2ServiceInstance;
                int i11 = i10 & 101;
                int i12 = -(-((i10 ^ 101) | i11));
                getWarnings = ((i11 & i12) + (i12 | i11)) % 128;
                return Boolean.valueOf(z);
            }
        }
        int i13 = getWarnings;
        ThreeDS2ServiceInstance = ((i13 & 117) + (i13 | 117)) % 128;
        int i102 = ThreeDS2ServiceInstance;
        int i112 = i102 & 101;
        int i122 = -(-((i102 ^ 101) | i112));
        getWarnings = ((i112 & i122) + (i122 | i112)) % 128;
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * 471) + (i * EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
        int i5 = ~i;
        int i6 = (((~(i | (~i2))) | (~(i2 | i5 | i3))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (((~(i5 | i3)) | i2) * (-470)) + (((~((~i3) | i5)) | i2) * (-235)) + i4;
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? get(objArr) : getWarnings(objArr) : ThreeDS2Service(objArr) : initialize(objArr);
    }

    public static boolean get(setScroller setscroller) {
        return ((Boolean) get(new Object[]{setscroller}, -1604622809, 1604622812, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean getWarnings(setScroller setscroller) {
        return ((Boolean) get(new Object[]{setscroller}, 2090782263, -2090782262, (int) System.currentTimeMillis())).booleanValue();
    }
}
