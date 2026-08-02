package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: assets/audience_network/classes2.dex */
public final class N6 {
    public static N1 A00;

    public final N1 A00(final C1860gi c1860gi, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new AnonymousClass81();
            case 2:
                if (C1310Up.A1O(c1860gi)) {
                    return new AnonymousClass80();
                }
                return new AnonymousClass81();
            case 3:
                return new C2047jz();
            case 4:
                return new C2042ju(c1860gi);
            case 5:
                return new C2042ju(c1860gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.instagram.common.viewpoint.core.C2042ju, com.instagram.common.viewpoint.core.N1
                    public final AdPlacementType A8k() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C07467w();
            default:
                return null;
        }
    }
}
