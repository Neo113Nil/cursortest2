package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.85, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass85 extends AbstractC2064kH {
    public static byte[] A02;
    public Map<String, String> A00;
    public final Uri A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 33, 38, 35};
    }

    public AnonymousClass85(C1860gi c1860gi, VA va, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1860gi, va, str, null, true, true);
        this.A01 = uri;
        this.A00 = mExtraData;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2064kH
    public final EnumC1109Mq A0H() {
        A0J(this.A00, null);
        return EnumC1109Mq.A09;
    }

    public final Uri A0M() {
        String uri = this.A01.getQueryParameter(A00(0, 4, 5));
        if (uri == null) {
            uri = A00(0, 0, 121);
        }
        return XB.A00(uri);
    }
}
