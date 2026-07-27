package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2040kC extends AbstractRunnableC1327Wc {
    public static byte[] A02;
    public final /* synthetic */ N8 A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C2040kC(N8 n82, JSONObject jSONObject) {
        this.A00 = n82;
        this.A01 = jSONObject;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        T8 t82;
        T8 t83;
        CountDownLatch countDownLatch;
        N7 n72;
        N7 n73;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            n72 = this.A00.A02;
            synchronized (n72) {
                n73 = this.A00.A02;
                n73.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e9) {
            t83 = this.A00.A03;
            t83.A08().ABC(A00(0, 17, 25), AbstractC1252Td.A1B, new C1253Te(e9));
        } catch (JSONException e10) {
            this.A00.A0M();
            t82 = this.A00.A03;
            t82.A08().ABC(A00(0, 17, 25), AbstractC1252Td.A1A, new C1253Te(e10));
        }
    }
}
