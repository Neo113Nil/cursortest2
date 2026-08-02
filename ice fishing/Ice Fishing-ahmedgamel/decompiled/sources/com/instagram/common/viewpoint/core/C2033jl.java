package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2033jl extends N3 {
    public static byte[] A06;
    public static final String A07;
    public C2035jn A00;
    public EnumC1334Vp A01;
    public boolean A02;
    public final C1860gi A03;
    public final VA A04;
    public final AbstractC1506ay A05;

    public static String A04(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C2033jl.class.getSimpleName();
    }

    public C2033jl(C1860gi c1860gi, VA va, AbstractC1506ay abstractC1506ay, C1805fp c1805fp, N4 n42, EnumC1334Vp enumC1334Vp) {
        super(c1860gi, n42, c1805fp);
        this.A04 = va;
        this.A05 = abstractC1506ay;
        this.A03 = c1860gi;
        this.A01 = enumC1334Vp;
    }

    @Override // com.instagram.common.viewpoint.core.N3
    public final void A08(Map<String, String> map) {
        String adPlacementType;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            AbstractC1144Oa.A02(this.A00.A05(), AbstractC1380Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (C1310Up.A1A(this.A03)) {
                if (this.A01 == EnumC1334Vp.A09) {
                    adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    adPlacementType = AdPlacementType.BANNER.toString();
                }
                C1356Wl A00 = C1356Wl.A00(this.A03);
                String placementType = this.A00.A7O();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                Y4.A00(new C2034jm(this));
            }
        }
    }

    public final void A0A(C2035jn c2035jn) {
        this.A00 = c2035jn;
    }
}
