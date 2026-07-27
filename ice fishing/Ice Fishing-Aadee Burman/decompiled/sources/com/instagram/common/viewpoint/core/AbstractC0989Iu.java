package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.Iu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0989Iu {
    public static byte[] A01;

    @MetaExoPlayerCustomization("Adding TYPE_xml")
    public static final int A02;
    public final int A00;

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-26, -37, -38, -114};
    }

    static {
        A04();
        A02 = C5C.A0D(A03(0, 4, 3));
    }

    public AbstractC0989Iu(int i) {
        this.A00 = i;
    }

    public static int A00(int i) {
        return 16777215 & i;
    }

    public static int A01(int i) {
        return (i >> 24) & p.f8473b;
    }

    public static String A02(int i) {
        return A03(0, 0, 9) + ((char) ((i >> 24) & p.f8473b)) + ((char) ((i >> 16) & p.f8473b)) + ((char) ((i >> 8) & p.f8473b)) + ((char) (i & p.f8473b));
    }

    public String toString() {
        return A02(this.A00);
    }
}
