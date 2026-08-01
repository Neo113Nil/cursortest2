package com.instagram.common.viewpoint.core;

import android.os.PowerManager;
import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class YV {
    public static byte[] A00;
    public static String[] A01 = {"CRKlMdJj7sWkVQXvhxP2gtYMKrwrdBdz", "MDVslC7yGiRJk7iB8DE8e8h4fEVrC5ER", "lH08WA", "RxIchMFZh", "vNyd6Jid8bvsA1cw15Ve5Ic9LBA7HcUI", "txgfdNfKSs8Co5f2ObGoVq", "d8ndlqqx7tIKNJdyWXTDq8r8sQB5dgXc", "5RbatCjsfF363SonahZsted9lIdQCMHb"};
    public static final String A02;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            int i11 = copyOfRange[i10] - i9;
            String[] strArr = A01;
            if (strArr[4].charAt(3) != strArr[6].charAt(3)) {
                throw new RuntimeException();
            }
            A01[2] = "R3kMyn";
            copyOfRange[i10] = (byte) (i11 - 20);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{109, -96, -117, -115, -104, -100, -111, -105, -106, 72, -111, -106, 72, -101, -117, -102, -115, -115, -106, 72, -111, -106, -100, -115, -102, -119, -117, -100, -111, -98, -115, 72, -117, -112, -115, -117, -109, 84, 72, -119, -101, -101, -99, -107, -111, -106, -113, 72, -111, -106, -100, -115, -102, -119, -117, -100, -111, -98, -115, 86, -33, -34, -26, -44, -31, -69, -78, -68, -76, -62};
    }

    static {
        A01();
        A02 = YV.class.getSimpleName();
    }

    public static boolean A02(C1840gi c1840gi) {
        return A03(c1840gi) && YW.A03(c1840gi);
    }

    public static boolean A03(C1840gi c1840gi) {
        if (c1840gi == null) {
            return true;
        }
        try {
            return ((PowerManager) c1840gi.getSystemService(A00(60, 5, 91))).isInteractive();
        } catch (Exception e9) {
            Log.e(A02, A00(0, 60, 20), e9);
            c1840gi.A08().ABC(A00(65, 5, 53), AbstractC1252Td.A2S, new C1253Te(e9));
            return true;
        }
    }
}
