package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.jk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2032jk extends N3 {
    public static byte[] A02;

    @Nullable
    public final C2030ji A00;
    public final VA A01;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C2032jk(C1860gi c1860gi, N4 n42, C1805fp c1805fp, VA va, C2030ji c2030ji) {
        super(c1860gi, n42, c1805fp);
        this.A01 = va;
        this.A00 = c2030ji;
    }

    @Override // com.instagram.common.viewpoint.core.N3
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A02.A0F().A3L();
            AbstractC1144Oa.A02(this.A00.A0a(), AbstractC1380Xm.A00(A01(0, 6, 62)));
            this.A01.ABJ(this.A00.A7O(), map);
            if (C1310Up.A1A(this.A02)) {
                String adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                C1356Wl A00 = C1356Wl.A00(this.A02);
                String placementType = this.A00.A7O();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }
}
