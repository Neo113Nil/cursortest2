package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public enum VW {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, c.f16474a, c.f16474a, -123, -122, -123, 124};
    }

    static {
        A02();
    }

    VW(long j9, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j9;
        this.A01 = mediaCacheFlag;
    }

    @Nullable
    public static VW A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (VW vw : values()) {
            if (vw.A01 == mediaCacheFlag) {
                return vw;
            }
        }
        return null;
    }
}
