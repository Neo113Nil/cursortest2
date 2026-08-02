package com.instagram.common.viewpoint.core;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1705eC extends AbstractRunnableC1347Wc {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ AudienceNetworkAds.InitResult A01;

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
        A02 = new byte[]{81, 80, 80, 82, 6, 1, 85, 83, 16, 7, 8, 99, 42, 45, 42, 55, 42, 34, 47, 42, 57, 34, 55, 42, 44, 45, 99, 32, 44, 46, 51, 47, 38, 55, 38, 17, 22, 13, 48, 2, 5, 6};
    }

    public C1705eC(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        AbstractC1343Vy.A05(A00(35, 7, 46), A00(8, 27, 14), A00(0, 8, 40));
        this.A00.onInitialized(this.A01);
    }
}
