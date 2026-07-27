package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1104Ng implements Serializable {
    public static byte[] A05 = null;
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1104Ng A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A04(0, 6, 78));
        String optString2 = jSONObject.optString(A04(36, 8, 81));
        String optString3 = jSONObject.optString(A04(24, 12, 84));
        int optInt = jSONObject.optInt(A04(44, 14, 5), -1);
        boolean optBoolean = jSONObject.optBoolean(A04(6, 18, 35), false);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3) || optInt == -1) {
            return null;
        }
        return new C1104Ng(optString, optString2, optString3, optInt, optBoolean);
    }

    public static String A04(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{46, 61, 61, 44, 54, 49, 8, 3, 14, 14, 4, 3, 5, 13, 1, 11, 16, 21, 22, 3, 9, 20, 3, 15, 67, 52, 54, 62, 52, 58, 56, 50, 65, 52, c.f16317b, 56, 66, 53, 54, 53, 66, 66, 53, 66, -10, -23, -12, -13, -10, -8, -19, -14, -21, -29, -15, -13, -24, -23};
    }

    public C1104Ng(String str, String str2, String str3, int i, boolean z3) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
        this.A04 = z3;
    }

    private final String A01() {
        return this.A01;
    }

    private final String A02() {
        return this.A02;
    }

    private final String A03() {
        return this.A03;
    }

    public static void A06(C1104Ng c1104Ng, C1840gi c1840gi) {
        if (c1104Ng != null && c1104Ng.A09()) {
            new W6(c1840gi).A04(true, c1104Ng.A01(), c1104Ng.A03(), c1104Ng.A02(), System.currentTimeMillis(), c1104Ng.A08());
        }
    }

    public static void A07(C1104Ng c1104Ng, C1840gi c1840gi) {
        if (c1104Ng != null && c1104Ng.A0A()) {
            new W6(c1840gi).A04(false, c1104Ng.A01(), c1104Ng.A03(), c1104Ng.A02(), System.currentTimeMillis(), c1104Ng.A08());
        }
    }

    private final boolean A08() {
        return this.A04;
    }

    private final boolean A09() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A0A() {
        return (this.A00 & 1) != 0;
    }
}
