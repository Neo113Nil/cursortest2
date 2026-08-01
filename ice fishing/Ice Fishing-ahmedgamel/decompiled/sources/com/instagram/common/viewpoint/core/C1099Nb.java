package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1099Nb implements Serializable {
    public static byte[] A03 = null;
    public static final long serialVersionUID = 6010729991575063286L;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        A02();
    }

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 117);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{25, 22, 26, 24, 25, 37, 89, 86, 80, 2, -12, -17, -1, -13};
    }

    public C1099Nb(String str, int i, int i6) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i6;
    }

    public static C1099Nb A00(JSONObject jSONObject) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString(A01(6, 3, 111))) == null) {
            return null;
        }
        return new C1099Nb(optString, jSONObject.optInt(A01(9, 5, 22), 0), jSONObject.optInt(A01(0, 6, 60), 0));
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }
}
