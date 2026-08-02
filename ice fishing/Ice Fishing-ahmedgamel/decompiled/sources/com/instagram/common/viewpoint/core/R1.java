package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class R1 implements InterfaceC1353Wi {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-100, -104, -105, -53, -70, -65, -69, -60, -71, -69, -92, -69, -54, -51, -59, -56, -63, -48, -23, -26, -23, -22, -14, -23, -101, -32, -13, -34, -32, -21, -17, -28, -22, -23, -87};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1353Wi
    public final void AAx(int i, Throwable th) {
        Log.e(A00(0, 17, 58), A00(17, 18, 95), th);
    }
}
