package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1502bE implements InterfaceC1067Lu {
    public static byte[] A01;
    public final T8 A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70, -58, -43, -50, -50, -59, -52, -65, -52, -49, -57, -57, -55, -50, -57, -65, -51, -49, -60, -59};
    }

    public C1502bE(T8 t82) {
        this.A00 = t82;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z3, int i6) {
        C1253Te c1253Te = new C1253Te(A00(4, 6, 44));
        c1253Te.A07(jSONObject);
        c1253Te.A05(1);
        c1253Te.A09(z3);
        c1253Te.A04(i6);
        try {
            jSONObject.put(A00(33, 13, 62), TX.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 72), i6);
        } catch (JSONException unused2) {
        }
        this.A00.A08().ABD(A00(27, 6, 13), i + 4000, c1253Te);
        if (this.A00.A05().AAO()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i + A00(1, 3, 118) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC1069Lw enumC1069Lw) {
        for (EnumC1069Lw enumC1069Lw2 : ZJ.A06) {
            if (enumC1069Lw2.equals(enumC1069Lw)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1067Lu
    public final void ABE(EnumC1069Lw enumC1069Lw, JSONObject jSONObject, int i) {
        A02(enumC1069Lw.A03(), enumC1069Lw.toString(), jSONObject, A03(enumC1069Lw), i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1067Lu
    public final void ABs(int i, JSONObject jSONObject, int i6) {
        A02(i, A00(18, 9, 111) + i, jSONObject, false, i6);
    }
}
