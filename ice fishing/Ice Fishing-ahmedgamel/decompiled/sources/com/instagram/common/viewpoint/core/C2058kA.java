package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.kA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2058kA extends AbstractRunnableC1347Wc {
    public static byte[] A02;
    public final /* synthetic */ N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, 29, 33, 35, 50, 50, 43, 44, 37};
    }

    public C2058kA(N8 n82, String str) {
        this.A00 = n82;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        T8 t82;
        T8 t83;
        CountDownLatch countDownLatch;
        boolean A0J;
        N7 n72;
        N7 n73;
        N7 n74;
        String A00 = A00(0, 17, 81);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                n72 = this.A00.A02;
                ((C1123Nf) n72.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                n73 = this.A00.A02;
                n73.A07(this.A01);
                n74 = this.A00.A02;
                n74.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e9) {
            t83 = this.A00.A03;
            t83.A08().ABC(A00, AbstractC1272Td.A1B, new C1273Te(e9));
        } catch (JSONException e10) {
            this.A00.A0M();
            t82 = this.A00.A03;
            t82.A08().ABC(A00, AbstractC1272Td.A1A, new C1273Te(e10));
        }
    }
}
