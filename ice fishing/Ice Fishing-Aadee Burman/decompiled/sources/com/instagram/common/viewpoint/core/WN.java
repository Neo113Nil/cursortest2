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

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 118);
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
