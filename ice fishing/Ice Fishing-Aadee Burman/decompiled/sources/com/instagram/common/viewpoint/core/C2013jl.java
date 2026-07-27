package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2013jl extends N3 {
    public static byte[] A06;
    public static final String A07;
    public C2015jn A00;
    public EnumC1314Vp A01;
    public boolean A02;
    public final C1840gi A03;
    public final VA A04;
    public final AbstractC1486ay A05;

    public static String A04(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C2013jl.class.getSimpleName();
    }

    public C2013jl(C1840gi c1840gi, VA va, AbstractC1486ay abstractC1486ay, C1785fp c1785fp, N4 n42, EnumC1314Vp enumC1314Vp) {
        super(c1840gi, n42, c1785fp);
        this.A04 = va;
        this.A05 = abstractC1486ay;
        this.A03 = c1840gi;
        this.A01 = enumC1314Vp;
    }

    @Override // com.instagram.common.viewpoint.core.N3
    public final void A08(Map<String, String> map) {
        String adPlacementType;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            AbstractC1124Oa.A02(this.A00.A05(), AbstractC1360Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (C1290Up.A1A(this.A03)) {
                if (this.A01 == EnumC1314Vp.A09) {
                    adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    adPlacementType = AdPlacementType.BANNER.toString();
                }
                C1336Wl A00 = C1336Wl.A00(this.A03);
                String placementType = this.A00.A7O();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                Y4.A00(new C2014jm(this));
            }
        }
    }

    public final void A0A(C2015jn c2015jn) {
        this.A00 = c2015jn;
    }
}
