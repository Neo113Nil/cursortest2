package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06584m {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-13, -21, -14, -15, -24};
    }

    public static void A02(Context context, C06614p c06614p) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) AbstractC06443y.A01((TelephonyManager) context.getSystemService(A00(0, 5, 11)));
            C06574l callback = new C06574l(c06614p);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), callback);
            telephonyManager.unregisterTelephonyCallback(callback);
        } catch (RuntimeException unused) {
            c06614p.A07(5);
        }
    }
}
