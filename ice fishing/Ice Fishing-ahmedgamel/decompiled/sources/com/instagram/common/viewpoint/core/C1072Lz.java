package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Lz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1072Lz {
    public static byte[] A02;
    public final M0 A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{55, 36, c.f16318c, c.f16318c, 52, 61, 14};
    }

    public C1072Lz(M0 m0, String str) {
        this.A00 = m0;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 99) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}
