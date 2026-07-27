package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.fX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1767fX {
    public static byte[] A02;
    public final AA A00;
    public final C2208nA A01 = new C2208nA();

    static {
        A02();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C1767fX(C1840gi c1840gi) {
        InterfaceC0879Em trackSelectionFactory = new C2225nR(this.A01);
        C07579h c07579h = new C07579h(trackSelectionFactory);
        AnonymousClass74 loadControl = new C2318ox();
        this.A00 = AbstractC06796b.A00(new C2315ou(c1840gi), c07579h, loadControl, this.A01);
    }

    public static String A01(C2381pz c2381pz) {
        boolean z3 = c2381pz instanceof AD;
        String A00 = A00(36, 2, 118);
        String A002 = A00(0, 14, 108);
        if (z3) {
            AD ad = (AD) c2381pz;
            return A00(55, 11, 8) + ad.A03 + A00(14, 22, 98) + ad.A02 + A002 + ad.getCause() + A00;
        }
        return A00(41, 14, 99) + c2381pz.getMessage() + A002 + c2381pz.getCause() + A00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C1765fV A08() {
        C2400qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C1765fV(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f3) {
        this.A00.A0M(f3);
    }

    public final void A0D(long j6) {
        this.A00.A04(j6);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C1836ge c1836ge, Uri uri) {
        if (C1290Up.A2z(c1836ge, A03())) {
            C1771fb cacheManager = C1771fb.A06(c1836ge);
            C5Y cachedDataSourceFactory = cacheManager.A0H(c1836ge);
            this.A00.A0Q(new C07629o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC0838Cx mediaSource = new C07629o(new C2335pE(c1836ge, C5C.A0j(c1836ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC1764fU interfaceC1764fU) {
        this.A00.A0O(new D6(this, interfaceC1764fU));
    }

    public final void A0H(final InterfaceC1766fW interfaceC1766fW) {
        this.A00.A0P(new InterfaceC2306ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.instagram.common.viewpoint.core.C5L
            public final void AGa(int i, int i6, int i9, float f3) {
                interfaceC1766fW.AGa(i, i6, i9, f3);
            }
        });
    }

    public final void A0I(boolean z3) {
        this.A00.A0S(z3);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
