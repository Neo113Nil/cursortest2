package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.gk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1862gk implements InterfaceC1790fa {
    public static byte[] A04;
    public static String[] A05 = {"5xwnqBcSwQdKZIKpCxhEhIB1ehz5rbXz", "SVnny4sMHrVxDT0mCWgznsGyNwA0K29Q", "WSedDxIDZVsWQqxlis9Ww20KqcWIyEnI", "k4ruqDXMLqmQWww9EukWiXBxmglEjOwQ", "qeuUn3ZO1g9cCLbTYKy8rfCeNqsjP", "lwrAvEwGJvKZaAaN19YZU8UxJCWRUSKU", "KAMWqSOuX5oAD", "9nA6fjXGqk7Q6o3drz3rA7fb0omaCvC"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CallableC1261Ss A02;
    public final /* synthetic */ C1262St A03;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 48);
            if (A05[5].charAt(12) == 'F') {
                throw new RuntimeException();
            }
            A05[5] = "k7DX94ZUmS6mjbqg2Uqpnt5MM6ksEeAZ";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A05[5].charAt(12) == 'F') {
            throw new RuntimeException();
        }
        A05[4] = "84A19LE3N5skcLW3UxwckiEcHwoNq";
        A04 = new byte[]{18, 11, 8, 11, 12, 20, 11, -9, -22, -27, -26, -16};
    }

    static {
        A01();
    }

    public C1862gk(CallableC1261Ss callableC1261Ss, C1262St c1262St, long j6, long j9) {
        this.A02 = callableC1261Ss;
        this.A03 = c1262St;
        this.A00 = j6;
        this.A01 = j9;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1790fa
    public final void ADj(boolean z6) {
        T8 t82;
        BlockingQueue blockingQueue;
        T8 t83;
        T8 t84;
        t82 = this.A02.A01.A04;
        if (T0.A06(t82)) {
            C1268Sz c1268Sz = new C1268Sz(this.A03.A06, this.A03.A07, A00(7, 5, 81), this.A03.A02, this.A03.A08);
            t83 = this.A02.A01.A04;
            T0.A04(t83, c1268Sz, z6);
            if (!z6) {
                t84 = this.A02.A01.A04;
                T0.A05(t84, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            C1266Sx.A0A().put(c1268Sz.A04, c1268Sz);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1790fa
    public final void ADr(Throwable th) {
        T8 t82;
        BlockingQueue blockingQueue;
        T8 t83;
        t82 = this.A02.A01.A04;
        if (T0.A06(t82)) {
            t83 = this.A02.A01.A04;
            T0.A05(t83, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2119, th != null ? th.toString() : A00(0, 7, a.f22543z), null, Long.valueOf(System.currentTimeMillis() - this.A01), null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
