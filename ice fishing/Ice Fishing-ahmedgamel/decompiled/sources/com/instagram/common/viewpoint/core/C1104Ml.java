package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1104Ml {
    public static byte[] A02;
    public static String[] A03 = {"TCwFA", "n8MKtp9dwzEQhpBe6BR2lxKd", "DvIgkYTRPnnTPXJJnoSR1kudzHpByEo2", "", "ukKEwC6XKRrkT9sIUNjxPleVuSFlcA27", "xINsVOhHX0SgxNuz70RgaHOI4yPeG", "tcBEB0UiUFi9btMnbz6doT8G4EON6", ""};
    public final Map<String, Object> A01 = new HashMap();
    public final List<String> A00 = new ArrayList();

    public static String A06(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        byte[] bArr = {79, 82, 69, 117, 70, 79, 68, 43, 54, 33, 17, 60, 43, 42, 39, 60};
        if (A03[2].charAt(26) == 'i') {
            throw new RuntimeException();
        }
        A03[4] = "OztgjXBJYpDAKFMtRJu6AzmPW9OlK9cP";
        A02 = bArr;
    }

    static {
        A07();
    }

    public static C1104Ml A00(C1104Ml c1104Ml, long j6) {
        return c1104Ml.A03(A06(0, 7, 94), j6);
    }

    public static C1104Ml A01(C1104Ml c1104Ml, Uri uri) {
        String A06 = A06(7, 9, 58);
        if (uri == null) {
            return c1104Ml.A02(A06);
        }
        return c1104Ml.A05(A06, uri.toString());
    }

    private final C1104Ml A02(String str) {
        this.A00.add(str);
        this.A01.remove(str);
        return this;
    }

    private final C1104Ml A03(String str, long j6) {
        return A04(str, Long.valueOf(j6));
    }

    private C1104Ml A04(String str, Object obj) {
        this.A01.put((String) AbstractC06443y.A01(str), AbstractC06443y.A01(obj));
        this.A00.remove(str);
        return this;
    }

    private final C1104Ml A05(String str, String str2) {
        return A04(str, str2);
    }

    public final List<String> A08() {
        return Collections.unmodifiableList(new ArrayList(this.A00));
    }

    public final Map<String, Object> A09() {
        HashMap hashMap = new HashMap(this.A01);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            boolean z6 = value instanceof byte[];
            if (A03[2].charAt(26) == 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "";
            strArr[3] = "";
            if (z6) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
