package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1265Sw implements Callable<Boolean> {
    public static byte[] A02;
    public final C1264Sv A00;
    public final /* synthetic */ C1266Sx A01;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-35, -31, -43, -37, -39};
    }

    public CallableC1265Sw(C1266Sx c1266Sx, C1264Sv c1264Sv) {
        this.A01 = c1266Sx;
        this.A00 = c1264Sv;
    }

    private final Boolean A00() {
        T8 t82;
        boolean z6;
        C1267Sy c1267Sy;
        boolean z9;
        boolean z10;
        T8 t83;
        LR A03;
        Map map;
        if (WU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            LX lx = new LX(this.A00.A08, this.A00.A07, this.A00.A06, A01(0, 5, 114), this.A00.A02, this.A00.A03);
            lx.A01 = this.A00.A05;
            lx.A00 = this.A00.A04;
            t82 = this.A01.A04;
            if (T0.A06(t82)) {
                map = C1266Sx.A0F;
                map.put(this.A00.A08, lx);
            }
            z6 = this.A01.A08;
            boolean precacheResult = false;
            if (!z6) {
                c1267Sy = this.A01.A03;
                if (c1267Sy.A0F(this.A00) != null) {
                    precacheResult = true;
                }
            } else {
                t83 = this.A01.A04;
                A03 = C1266Sx.A03(t83.A02());
                precacheResult = A03.AIe(lx, false).A01();
            }
            T3 t32 = this.A00.A01;
            if (t32 != null && t32.A02()) {
                int A00 = t32.A00();
                int A01 = t32.A01();
                if (A00 <= 0 || A01 <= 0) {
                    z9 = this.A01.A08;
                    if (z9) {
                        A04(this.A00.A08, lx);
                    } else {
                        A03(this.A00.A04, this.A00.A05);
                    }
                } else {
                    z10 = this.A01.A08;
                    if (z10) {
                        lx.A00 = A00;
                        lx.A01 = A01;
                        A04(this.A00.A08, lx);
                    } else {
                        A03(A00, A01);
                    }
                }
            }
            return Boolean.valueOf(precacheResult);
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    private void A03(int i, int i4) {
        C1267Sy c1267Sy;
        T8 t82;
        Map map;
        c1267Sy = this.A01.A03;
        t82 = this.A01.A04;
        Bitmap A0G = c1267Sy.A0G(t82, this.A00.A08, i, i4, this.A00.A02);
        if (A0G == null) {
            return;
        }
        map = this.A01.A07;
        map.put(this.A00.A08, A0G);
    }

    private void A04(String str, LX lx) {
        T8 t82;
        LR A03;
        Map map;
        t82 = this.A01.A04;
        A03 = C1266Sx.A03(t82.A02());
        Bitmap A00 = A03.AIe(lx, true).A00();
        if (A00 == null) {
            return;
        }
        map = this.A01.A07;
        map.put(str, A00);
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
