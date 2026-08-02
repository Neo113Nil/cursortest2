package com.instagram.common.viewpoint.core;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1376Xi {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{62, 50, 48, 115, 59, 60, 62, 56, c.f17105c, 50, 50, 54, 115, 54, 60, 41, 60, 51, 60};
    }

    public static PackageInfo A00(T8 t82) {
        return A01(t82, A02(0, 19, 49));
    }

    public static PackageInfo A01(T8 t82, String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str) || (packageManager = t82.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(T8 t82, String str) {
        PackageInfo packageInfo = A01(t82, str);
        return packageInfo != null;
    }
}
