package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.kG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2063kG extends AbstractC1112Mt {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{52, 54, 45, 51, 54, 45, 56, 61, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = C2063kG.class.getSimpleName();
    }

    public C2063kG(C1860gi c1860gi, VA va, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1860gi, va, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1112Mt
    public final EnumC1109Mq A0G(String str) {
        VC vc = VC.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, a.f22543z));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                vc = VC.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        this.A02.ABq(this.A03, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), vc);
        return EnumC1109Mq.A09;
    }
}
