package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1564bu {
    public static float A00(NR nr) {
        int height = nr.A0H().A01();
        int width = nr.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d9) {
        int availableWidth = (int) ((XW.A00().widthPixels - (AbstractC1573c3.A08 * 2)) / d9);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = YB.A01(16);
        int ctaTextHeight = AbstractC1545bb.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC1573c3.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = XW.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC1563bt A03(ViewOnClickListenerC1058Kr viewOnClickListenerC1058Kr, String str) {
        return new ViewOnClickListenerC1563bt(viewOnClickListenerC1058Kr, str);
    }

    public static boolean A04(double d9) {
        return d9 < 0.9d;
    }

    public static boolean A05(double d9, int i) {
        return A02(i) < A01(d9);
    }

    public static boolean A06(int i, int i4, double d9) {
        return i == 2 || A05(d9, i4);
    }
}
