package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1374Xg {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-16, -7, -3, 49, -85, -83, -83, 1, -2, -9};
    }

    public static String A01(long j6) {
        String sb;
        String A002 = A00(0, 0, 78);
        if (j6 < 1000) {
            sb = j6 + A002;
        } else {
            String A003 = A00(0, 4, 79);
            if (j6 < 1000000) {
                StringBuilder sb2 = new StringBuilder();
                String formattedNumber = String.format(Locale.US, A003, Double.valueOf(j6 / 1000.0d));
                StringBuilder append = sb2.append(formattedNumber);
                String formattedNumber2 = A00(8, 1, 55);
                sb = append.append(formattedNumber2).toString();
            } else if (j6 < b.f7174h) {
                StringBuilder sb3 = new StringBuilder();
                String formattedNumber3 = String.format(Locale.US, A003, Double.valueOf(j6 / 1000000.0d));
                StringBuilder append2 = sb3.append(formattedNumber3);
                String formattedNumber4 = A00(9, 1, 46);
                sb = append2.append(formattedNumber4).toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                String formattedNumber5 = String.format(Locale.US, A003, Double.valueOf(j6 / 1.0E9d));
                StringBuilder append3 = sb4.append(formattedNumber5);
                String formattedNumber6 = A00(7, 1, 67);
                sb = append3.append(formattedNumber6).toString();
            }
        }
        String A004 = A00(4, 3, 1);
        if (sb.contains(A004)) {
            return sb.replace(A004, A002);
        }
        return sb;
    }
}
