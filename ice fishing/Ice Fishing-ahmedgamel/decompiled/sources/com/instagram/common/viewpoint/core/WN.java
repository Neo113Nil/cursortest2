package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class WN {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-1, -5, -6, 29, 9, 43, 30, 31, 44};
    }

    public static SharedPreferences A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 9, 67), context), 0);
    }
}
