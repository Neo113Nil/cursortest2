package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1119Nb implements Serializable {
    public static byte[] A03 = null;
    public static final long serialVersionUID = 6010729991575063286L;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 117);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{25, 22, 26, 24, 25, 37, 89, 86, 80, 2, -12, -17, -1, -13};
    }

    public C1119Nb(String str, int i, int i4) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i4;
    }

    public static C1119Nb A00(JSONObject jSONObject) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString(A01(6, 3, 111))) == null) {
            return null;
        }
        return new C1119Nb(optString, jSONObject.optInt(A01(9, 5, 22), 0), jSONObject.optInt(A01(0, 6, 60), 0));
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
