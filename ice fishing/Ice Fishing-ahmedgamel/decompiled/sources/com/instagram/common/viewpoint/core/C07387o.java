package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07387o extends AbstractC2025jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{c.f17105c, 60, 51, 51, 56, 47};
    }

    public C07387o(List<NR> list) {
        super(list);
    }

    public static C07387o A00(JSONObject jSONObject, C1860gi c1860gi) {
        C07387o c07387o = new C07387o(AbstractC2025jd.A08(jSONObject, c1860gi, new C2023jb()));
        c07387o.A2I(jSONObject);
        c07387o.A1N(A01(0, 6, 6));
        return c07387o;
    }

    @Override // com.instagram.common.viewpoint.core.NQ
    public final int A0o() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.NQ
    public final int A0p() {
        return 0;
    }
}
