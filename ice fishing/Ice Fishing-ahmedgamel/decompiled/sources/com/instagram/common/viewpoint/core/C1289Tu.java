package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Tu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1289Tu {
    public static byte[] A04;
    public final String A00;
    public final String A01;
    public final Map<EnumC1293Ty, List<String>> A02 = new HashMap();
    public final JSONObject A03;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{81, 92, 85, c.f17104b, 113, 118, 104};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1289Tu(String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        List<String> list;
        this.A00 = str;
        this.A01 = str2;
        this.A03 = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (EnumC1293Ty enumC1293Ty : EnumC1293Ty.values()) {
            this.A02.put(enumC1293Ty, new LinkedList());
        }
        for (int i = 0; i < i; i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String trackerUrl = jSONObject2.getString(A00(0, 4, 35));
                String trackerTypeStr = jSONObject2.getString(A00(4, 3, 2));
                EnumC1293Ty valueOf = EnumC1293Ty.valueOf(trackerUrl.toUpperCase(Locale.US));
                if (!TextUtils.isEmpty(trackerTypeStr) && (list = this.A02.get(valueOf)) != null) {
                    list.add(trackerTypeStr);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String A02() {
        return this.A00;
    }

    public final List<String> A03(EnumC1293Ty enumC1293Ty) {
        return this.A02.get(enumC1293Ty);
    }

    public final JSONObject A04() {
        return this.A03;
    }
}
