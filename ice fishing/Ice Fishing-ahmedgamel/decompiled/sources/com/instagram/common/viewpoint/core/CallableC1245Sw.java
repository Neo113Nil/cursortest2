package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1245Sw implements Callable<Boolean> {
    public static byte[] A02;
    public final C1244Sv A00;
    public final /* synthetic */ C1246Sx A01;

    static {
        A02();
    }

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-35, -31, -43, -37, -39};
    }

    public CallableC1245Sw(C1246Sx c1246Sx, C1244Sv c1244Sv) {
        this.A01 = c1246Sx;
        this.A00 = c1244Sv;
    }

    private final Boolean A00() {
        T8 t82;
        boolean z3;
        C1247Sy c1247Sy;
        boolean z6;
        boolean z9;
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
                map = C1246Sx.A0F;
                map.put(this.A00.A08, lx);
            }
            z3 = this.A01.A08;
            boolean precacheResult = false;
            if (!z3) {
                c1247Sy = this.A01.A03;
                if (c1247Sy.A0F(this.A00) != null) {
                    precacheResult = true;
                }
            } else {
                t83 = this.A01.A04;
                A03 = C1246Sx.A03(t83.A02());
                precacheResult = A03.AIe(lx, false).A01();
            }
            T3 t32 = this.A00.A01;
            if (t32 != null && t32.A02()) {
                int A00 = t32.A00();
                int A01 = t32.A01();
                if (A00 <= 0 || A01 <= 0) {
                    z6 = this.A01.A08;
                    if (z6) {
                        A04(this.A00.A08, lx);
                    } else {
                        A03(this.A00.A04, this.A00.A05);
                    }
                } else {
                    z9 = this.A01.A08;
                    if (z9) {
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

    private void A03(int i, int i6) {
        C1247Sy c1247Sy;
        T8 t82;
        Map map;
        c1247Sy = this.A01.A03;
        t82 = this.A01.A04;
        Bitmap A0G = c1247Sy.A0G(t82, this.A00.A08, i, i6, this.A00.A02);
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
        A03 = C1246Sx.A03(t82.A02());
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
