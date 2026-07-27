package com.instagram.common.viewpoint.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.o8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2267o8 implements BY {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{13, 27, 29, 11, 12, 27, 83, 14, 18, 31, 7, 28, 31, 29, 21, 10, 21, 24, 25, 19, 83, 29, 10, 31};
    }

    public C2267o8() {
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final int A7P() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final MediaCodecInfo A7Q(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final boolean AAR(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final boolean AAS(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, 117).equals(str) && A00(15, 9, 119).equals(str2);
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final boolean AJ4() {
        return false;
    }
}
