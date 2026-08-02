package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class na {
    private static int get = 1;
    private static int initialize;

    private static /* synthetic */ Object get(Object[] objArr) {
        int i = 0;
        byte[] bArr = (byte[]) objArr[0];
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i2 = get;
        int i3 = i2 & 17;
        int i4 = ((i2 ^ 17) | i3) << 1;
        int i5 = -((i2 | 17) & (~i3));
        initialize = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        while (i < length) {
            int i6 = get + 57;
            initialize = i6 % 128;
            if (i6 % 2 != 0) {
                byte b = bArr[i];
                sb.append(Character.forDigit(((b ^ (-3)) + ((b & (-3)) << 1)) & 25, 55));
                sb.append(Character.forDigit(b & 33, 6));
                int i7 = (-2) - ((i - 120) ^ (-1));
                int i8 = i7 & EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
                i = (i8 - (~((i7 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) | i8))) - 1;
            } else {
                byte b2 = bArr[i];
                sb.append(Character.forDigit((b2 >> 4) & 15, 16));
                sb.append(Character.forDigit(b2 & 15, 16));
                int i9 = i & 1;
                int i10 = -(-((i ^ 1) | i9));
                i = (i9 ^ i10) + ((i10 & i9) << 1);
            }
            int i11 = initialize;
            int i12 = i11 & 27;
            get = SVG$Unit$EnumUnboxingLocalUtility.m$1(i12, ~(-(-((i11 ^ 27) | i12))), 1, 128);
        }
        String sb2 = sb.toString();
        int i13 = initialize;
        int i14 = i13 & 117;
        int i15 = (i14 - (~((i13 ^ 117) | i14))) - 1;
        get = i15 % 128;
        if (i15 % 2 != 0) {
            return sb2;
        }
        throw null;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    public static String initialize(byte[] bArr) {
        return (String) getWarnings(new Object[]{bArr}, -484336132, 484336132, (int) System.currentTimeMillis());
    }
}
