package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1256Ti {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 52, 60, 60, 50, 53, 60, 123, 21, 62, 47, 44, 52, 41, 48, 123, 30, 45, 62, 53, 47, 34, 51, 52, 39, 50, 47, 41, 40, 96, 119, 119, 106, 119, 32, 60, 60, 56, 23, 59, 60, 41, 60, 61, 59, 23, 43, 39, 44, 45, 98, 105, 120, 123, 99, 126, 103, 41, 56, 32, 53, 54, 56, 61, 6, 42, 48, 35, 60, 55, 48, 37, 54, 48, 27, 48, 45, 41, 33, 40, 45, 49, 50, 60, 57, 2, 46, 52, 39, 56};
    }

    public static JSONObject A01(T8 t82, long j9, long j10, long j11, long j12, int i, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 52), j9);
                try {
                    jSONObject.put(A00(21, 8, 54), j10 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 41), j11);
                        try {
                            jSONObject.put(A00(79, 11, 45), j12);
                        } catch (JSONException e6) {
                            e = e6;
                        }
                    } catch (JSONException e9) {
                        e = e9;
                    }
                } catch (JSONException e10) {
                    e = e10;
                }
            } catch (JSONException e11) {
                e = e11;
            }
        } catch (JSONException e12) {
            e = e12;
        }
        try {
            jSONObject.put(A00(34, 16, 56), i);
            if (exc != null) {
                jSONObject.put(A00(29, 5, 117), exc.getMessage());
            }
        } catch (JSONException e13) {
            e = e13;
            t82.A08().A4I(e);
            return jSONObject;
        }
        return jSONObject;
    }

    public static void A03(T8 t82, long j9, long j10, long j11, long j12, int i, Exception exc) {
        C1252Te c1252Te = new C1252Te(A00(0, 21, 43));
        c1252Te.A05(1);
        c1252Te.A07(A01(t82, j9, j10, j11, j12, i, exc));
        t82.A08().ACA(A00(50, 7, 124), AbstractC1251Td.A20, c1252Te);
    }
}
