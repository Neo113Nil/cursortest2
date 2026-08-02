package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class H2 {
    public static byte[] A04;
    public static String[] A05 = {"uP2VmRjmPrkQ", "gRGWgf4lLYF9Rif8PQPDNbGokb9BUMtV", "bSjOyzwe8Lqn79dPeHIi8kfJVgfNJaEZ", "7R1XMZQjg8S2TiXm1wE8kLqT1leJFKD3", "sD", "qKJRf3b", "Q40N8hoONMcQBFaHNU", "iAP6W7CwppN1UlUQVXHbR"};
    public C0960Gw A00;
    public final int A01;
    public final C2218n0 A02;
    public final H1 A03;

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 45, 47, 61, 43};
    }

    static {
        A03();
    }

    public H2(InterfaceC0961Gx interfaceC0961Gx, H1 h12, long j6, long j9, long j10, long j11, long j12, long j13, int i) {
        this.A03 = h12;
        this.A01 = i;
        this.A02 = new C2218n0(interfaceC0961Gx, j6, j9, j10, j11, j12, j13);
    }

    private final int A00(InterfaceC2211ms interfaceC2211ms, long j6, HV hv) {
        if (j6 != interfaceC2211ms.A8n()) {
            hv.A00 = j6;
            return 1;
        }
        if (A05[5].length() != 7) {
            throw new RuntimeException();
        }
        A05[4] = "eb0wJDSKJb6zWnRAqReB9UTGfXv";
        return 0;
    }

    private final C0960Gw A01(long j6) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long A052 = this.A02.A05(j6);
        j9 = this.A02.A05;
        j10 = this.A02.A02;
        j11 = this.A02.A04;
        j12 = this.A02.A01;
        j13 = this.A02.A00;
        return new C0960Gw(j6, A052, j9, j10, j11, j12, j13);
    }

    private final void A04(boolean z6, long j6) {
        this.A00 = null;
        this.A03.AFs();
    }

    private final boolean A05(InterfaceC2211ms interfaceC2211ms, long j6) throws IOException {
        long A8n = j6 - interfaceC2211ms.A8n();
        if (A8n >= 0 && A8n <= 262144) {
            interfaceC2211ms.AK3((int) A8n);
            return true;
        }
        return false;
    }

    public final int A06(InterfaceC2211ms interfaceC2211ms, HV hv) throws IOException {
        long A01;
        long A00;
        long A02;
        long A042;
        int i;
        long j6;
        long j9;
        long j10;
        long floorPosition;
        long j11;
        long j12;
        long j13;
        while (true) {
            C0960Gw c0960Gw = (C0960Gw) AbstractC06443y.A02(this.A00);
            A01 = c0960Gw.A01();
            A00 = c0960Gw.A00();
            A02 = c0960Gw.A02();
            if (A00 - A01 <= this.A01) {
                A04(false, A01);
                String[] strArr = A05;
                if (strArr[3].charAt(1) != strArr[1].charAt(1)) {
                    throw new RuntimeException();
                }
                A05[5] = "cjf3Phs";
                return A00(interfaceC2211ms, A01, hv);
            }
            if (!A05(interfaceC2211ms, A02)) {
                return A00(interfaceC2211ms, A02, hv);
            }
            interfaceC2211ms.AIl();
            H1 h12 = this.A03;
            A042 = c0960Gw.A04();
            C0963Gz AIw = h12.AIw(interfaceC2211ms, A042);
            i = AIw.A00;
            switch (i) {
                case -3:
                    A04(false, A02);
                    return A00(interfaceC2211ms, A02, hv);
                case -2:
                    j12 = AIw.A02;
                    j13 = AIw.A01;
                    c0960Gw.A0D(j12, j13);
                    break;
                case -1:
                    j6 = AIw.A02;
                    j9 = AIw.A01;
                    c0960Gw.A0C(j6, j9);
                    break;
                case 0:
                    j10 = AIw.A01;
                    A05(interfaceC2211ms, j10);
                    floorPosition = AIw.A01;
                    A04(true, floorPosition);
                    j11 = AIw.A01;
                    return A00(interfaceC2211ms, j11, hv);
                default:
                    throw new IllegalStateException(A02(0, 12, a.f22543z));
            }
        }
    }

    public final C2218n0 A07() {
        return this.A02;
    }

    public final void A08(long j6) {
        long A03;
        if (this.A00 != null) {
            A03 = this.A00.A03();
            if (A03 == j6) {
                return;
            }
        }
        this.A00 = A01(j6);
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}
