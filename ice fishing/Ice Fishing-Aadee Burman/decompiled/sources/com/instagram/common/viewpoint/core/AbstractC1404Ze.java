package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1404Ze {
    public static String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (XX.A02 * 200.0f);
    public static final int A03 = (int) (XX.A02 * 200.0f);
    public static final int A02 = (int) (XX.A02 * 50.0f);

    public static NF A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return NF.A04;
        }
        if (A03(nativeAdLayout)) {
            return NF.A05;
        }
        return NF.A03;
    }

    public static AbstractC1403Zd A01(C1840gi c1840gi, VA va, String str, View view) {
        if (view == null) {
            return null;
        }
        int w6 = view.getWidth();
        int height = view.getHeight();
        if (w6 >= A01 && height >= A01) {
            return new MC(c1840gi, va, str);
        }
        if (w6 >= A03) {
            int i = A02;
            String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i) {
                return new MD(c1840gi, va, str);
            }
        }
        return null;
    }

    public static ME A02(C1840gi c1840gi, VA va, String str, C1110Nm c1110Nm, InterfaceC1382Yi interfaceC1382Yi, InterfaceC1381Yh interfaceC1381Yh) {
        return new ME(c1840gi, va, str, c1110Nm, interfaceC1382Yi, interfaceC1381Yh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r4 < r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w6 = A01;
        if (width >= w6) {
            int w9 = A01;
        }
        int i = A03;
        String[] strArr = A00;
        String str = strArr[1];
        String str2 = strArr[0];
        int h9 = str.length();
        int w10 = str2.length();
        if (h9 != w10) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[1] = "e";
        strArr2[0] = "I";
        if (width >= i) {
            int w11 = A02;
            if (height >= w11) {
                return false;
            }
        }
        return true;
    }
}
