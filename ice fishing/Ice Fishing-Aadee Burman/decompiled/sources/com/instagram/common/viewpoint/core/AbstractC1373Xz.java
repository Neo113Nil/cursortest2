package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1373Xz {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -6, -16, -2, -5, -11, -16, -70, -4, -15, -2, -7, -11, -1, -1, -11, -5, -6, -70, -51, -49, -49, -47, -33, -33, -21, -38, -47, -32, -29, -37, -34, -41, -21, -33, -32, -51, -32, -47, 5, 17, 16, 16, 7, 5, 22, 11, 24, 11, 22, 27};
    }

    public static EnumC1372Xy A00(Context context) {
        int result = context.checkCallingOrSelfPermission(A01(0, 39, 51));
        if (result != 0) {
            return EnumC1372Xy.A08;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(A01(39, 12, 73))).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return EnumC1372Xy.A07;
        }
        int result2 = activeNetworkInfo.getType();
        if (result2 == 0) {
            int result3 = activeNetworkInfo.getSubtype();
            switch (result3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return EnumC1372Xy.A03;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return EnumC1372Xy.A04;
                case 13:
                    return EnumC1372Xy.A05;
                default:
                    return EnumC1372Xy.A08;
            }
        }
        return EnumC1372Xy.A06;
    }
}
