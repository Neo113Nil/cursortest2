package com.instagram.common.viewpoint.core;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.Su, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1263Su implements Callable<Boolean> {
    public static byte[] A02;
    public final C1262St A00;
    public final /* synthetic */ C1266Sx A01;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC1263Su(C1266Sx c1266Sx, C1262St c1262St) {
        this.A01 = c1266Sx;
        this.A00 = c1262St;
    }

    private final Boolean A00() {
        String A01;
        T8 t82;
        T8 t83;
        LR A03;
        Map map;
        if (WU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                A01 = A01(0, 6, 72);
            } else {
                A01 = A01(6, 5, 72);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            LX lx = new LX(str, creativeType, this.A00.A06, A01, this.A00.A02, this.A00.A05);
            lx.A04 = this.A00.A03;
            lx.A02 = this.A00.A01;
            lx.A05 = this.A00.A04;
            t82 = this.A01.A04;
            if (T0.A06(t82)) {
                map = C1266Sx.A0F;
                map.put(this.A00.A08, lx);
            }
            t83 = this.A01.A04;
            A03 = C1266Sx.A03(t83.A02());
            return Boolean.valueOf(A03.AIg(lx) != null);
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }
}
