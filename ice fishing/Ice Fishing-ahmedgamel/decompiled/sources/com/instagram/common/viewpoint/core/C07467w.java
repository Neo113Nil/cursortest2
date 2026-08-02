package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07467w extends AbstractC2029jh {
    public static C1266Sx A0D;
    public static byte[] A0E;
    public static String[] A0F = {"g9SdUg6XNSnvVCS02jX19aczyGq48qDV", "lGSQ9LsgX83H3UqklEPZgAjaPEKabNT0", "y0oXMo4BXc2on8MNFvJxgBv", "Ulfd9L14l0ScyK0QB689zsPu0EZ5wfqr", "W3xKKEfUMxBXJmvfztSkCM8j4ls7Vw3H", "lNYBpqeQZYlfeCveDiVEAZh", "rx8", "elj"};
    public long A00;
    public NJ A01;
    public NK A02;
    public NQ A03;
    public C1860gi A04;
    public WK A05;
    public C1644dC A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A05(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0E = new byte[]{-98, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, 1, -2, 3, -16, 3, -8, -2, -3, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, 1, 6, -1, 7, 12, 3, 2, -33, 2, -30, -1, 18, -1, -32, 19, 12, 2, 10, 3, 29, 21, 20, 25, 17, 36, 25, 31, 30, -12, 17, 36, 17, 16, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -68, -66, -79, -80, -79, -78, -75, -70, -79, -80, -101, -66, -75, -79, -70, -64, -83, -64, -75, -69, -70, -105, -79, -59, -17, -30, -18, -14, -30, -16, -15, -47, -26, -22, -30, -2, -15, 3, -19, -2, -16, -33, -15, -2, 2, -15, -2, -31, -34, -40, -13, -26, -8, -30, -13, -27, -26, -27, -41, -22, -27, -26, -16, -62, -27, -59, -30, -11, -30, -61, -10, -17, -27, -19, -26, 28, 15, 33, 11, 28, 14, 15, 14, 9, 32, 19, 14, 15, 25, -61, -68, -73, -65, -61, -77, -105, -78, -4, -17, -21, -3, -38, -1, -10, -21};
    }

    static {
        A09();
    }

    private void A07() {
        P2.A00(this.A04).A06(this.A02, this.A02.A00());
    }

    private void A08() {
        if (this.A02 != null) {
            try {
                P2.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A0A(Intent intent) {
        int i = super.A00;
        String A05 = A05(77, 24, 25);
        if (i != -1 && Settings.System.getInt(this.A04.getContentResolver(), A05(1, 22, 92), 0) != 1) {
            int i4 = super.A00;
            String[] strArr = A0F;
            if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "RWC7frN5DjKRH0uo4BJmLzj";
            strArr2[2] = "FPcb0UYEDF6wwONX6Ty9E2F";
            intent.putExtra(A05, i4);
            return;
        }
        C1860gi c1860gi = this.A04;
        String[] strArr3 = A0F;
        if (strArr3[7].length() == strArr3[6].length()) {
            String[] strArr4 = A0F;
            strArr4[5] = "O4w3do1khQsKhsE3USwlJ7C";
            strArr4[2] = "rALKIAVwphrvKmHx0hqaLzY";
            if (C1310Up.A0h(c1860gi)) {
                return;
            }
        } else if (C1310Up.A0h(c1860gi)) {
            return;
        }
        intent.putExtra(A05, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(final C1860gi c1860gi, final C2019jT c2019jT, final int i) {
        if (i >= c2019jT.A23()) {
            return;
        }
        final C07357l c07357l = (C07357l) c2019jT.A27(i);
        A0D = new C1266Sx(c1860gi);
        A0D.A0e(new VI(c07357l.A2E(), c1860gi.A0A()));
        O6.A02(c1860gi, A0D, c07357l);
        final boolean z6 = i == 0;
        A0D.A0X(new AbstractC1999j4(z6) { // from class: com.facebook.ads.redexgen.X.7x
            @Override // com.instagram.common.viewpoint.core.AbstractC1999j4
            public final void A00() {
                NJ nj;
                nj = C07467w.this.A01;
                nj.AFp(C07467w.this, AdError.CACHE_ERROR);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1999j4
            public final void A01(boolean z9) {
                AtomicBoolean atomicBoolean;
                NJ nj;
                C07467w.A0D = null;
                if (z9) {
                    c1860gi.A01().AJE(c07357l.A2E(), c2019jT.A28());
                }
                if (i == c2019jT.A25()) {
                    atomicBoolean = C07467w.this.A0C;
                    atomicBoolean.set(true);
                    nj = C07467w.this.A01;
                    nj.AFm(C07467w.this);
                }
                C07467w.this.A0C(c1860gi, c2019jT, i + 1);
            }
        }, new C1259Sq(c07357l.A1D(), A05(152, 14, 119), i));
    }

    private void A0D(boolean z6) {
        if (this.A05 == WK.A0G) {
            A0F(z6);
            return;
        }
        if (this.A05 == WK.A0I) {
            A0G(z6);
        } else if (this.A05 == WK.A0H) {
            A0E(z6);
        } else {
            A0G(z6);
        }
    }

    private void A0E(boolean z6) {
        C1266Sx c1266Sx = new C1266Sx(this.A04);
        boolean z9 = C1310Up.A2H(this.A04) && SN.A0A(this.A03.A1H());
        if (z9) {
            SN unifiedAssetsLoader = new SN(c1266Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z9, new C2037jp(this));
            c1266Sx.A0e(new VI(((AbstractC2025jd) this.A03).A2E(), this.A04.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(this.A04, (AbstractC2025jd) this.A03, z6, new C2036jo(this));
    }

    private void A0F(boolean z6) {
        C1266Sx c1266Sx = new C1266Sx(this.A04);
        c1266Sx.A0e(new VI(((AbstractC2025jd) this.A03).A2E(), this.A04.A0A()));
        O6.A03(this.A04, c1266Sx, (C07357l) this.A03);
        c1266Sx.A0X(new C2041jt(this), new C1259Sq(this.A03.A1D(), A05(152, 14, 119)));
    }

    private void A0G(boolean z6) {
        boolean z9 = false;
        if (this.A03.A1b()) {
            C2019jT c2019jT = (C2019jT) this.A03;
            for (int i = 0; i < c2019jT.A23(); i++) {
                if (TextUtils.isEmpty(c2019jT.A27(i).A29().A0H().A09())) {
                    this.A01.AFp(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0C(this.A04, c2019jT, 0);
            return;
        }
        C1266Sx c1266Sx = new C1266Sx(this.A04);
        c1266Sx.A0e(new VI(((AbstractC2025jd) this.A03).A2E(), this.A04.A0A()));
        if (C1310Up.A2H(this.A04) && SN.A0A(this.A03.A1H())) {
            z9 = true;
        }
        boolean A1g = this.A03.A1g();
        if (z9) {
            SN unifiedAssetsLoader = new SN(c1266Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z9, new C2039jr(this, A1g));
            unifiedAssetsLoader.A0B();
            return;
        }
        C07357l c07357l = (C07357l) this.A03;
        if (TextUtils.isEmpty(c07357l.A29().A0H().A09())) {
            if (this.A05 == WK.A0J) {
                this.A04.A0F().AEQ();
            }
            this.A01.AFp(this, AdError.INTERNAL_ERROR);
        } else {
            O6.A02(this.A04, c1266Sx, c07357l);
            c1266Sx.A0X(new C07487y(this, z6, A1g, c07357l, this), new C1259Sq(c07357l.A1D(), A05(152, 14, 119)));
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2029jh
    public final int A0H() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A03.A0p();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2029jh
    public final NQ A0I() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2029jh
    public final boolean A0J() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A1J(super.A01);
        String A04 = C1728ea.A04(super.A02, this.A0B, this.A07);
        this.A03.A1K(super.A02);
        this.A03.A1O(A04);
        AdActivityIntent A05 = C1364Wu.A05(this.A04);
        A05.putExtra(A05(174, 8, 83), this.A05);
        A05.putExtra(A05(a.f22515R, 25, 78), this.A03);
        A05.putExtra(A05(34, 19, 107), this.A03);
        A05.putExtra(A05(166, 8, 27), this.A0B);
        if (A04 != null) {
            A05.putExtra(A05(112, 15, 89), A04);
        }
        A05.putExtra(A05(66, 11, a.f22543z), this.A0A);
        A05.putExtra(A05(101, 11, 74), this.A00);
        if (this.A09 != null) {
            A05.putExtra(A05(53, 13, 125), this.A09);
        }
        A0A(A05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            A05.setFlags(A05.getFlags() | 268435456);
        }
        ActivityUtils.A03(this.A04);
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C1364Wu.A0I(this.A04, A05)) {
                    this.A04.A0F().AIC();
                    if (this.A01 != null) {
                        this.A01.AFp(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C1364Wu.A0B(this.A04, A05);
            return true;
        } catch (C1362Ws e9) {
            String[] strArr = A0F;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[7] = "zr3";
            strArr2[6] = "zCM";
            Throwable cause = e9.getCause();
            Throwable th = e9;
            if (cause != null) {
                th = e9.getCause();
            }
            this.A04.A08().ABC(A05(23, 11, 50), AbstractC1272Td.A01, new C1273Te(th));
            return true;
        }
    }

    public final void A0K(C1860gi c1860gi, NJ nj, O8 o82, boolean z6, String str, String str2) {
        String A05;
        this.A0C.set(false);
        this.A04 = c1860gi;
        this.A01 = nj;
        this.A0A = o82.A02();
        this.A00 = o82.A00();
        this.A09 = str2;
        if (this.A0A != null) {
            String str3 = this.A0A;
            String A052 = A05(0, 1, 12);
            String[] strArr = A0F;
            if (strArr[7].length() == strArr[6].length()) {
                String[] strArr2 = A0F;
                strArr2[7] = "x5W";
                strArr2[6] = "dMK";
                A05 = str3.split(A052)[0];
            }
            throw new RuntimeException();
        }
        A05 = A05(0, 0, 100);
        this.A07 = A05;
        this.A03 = NQ.A03(o82.A03(), this.A04);
        this.A03.A1M(str);
        this.A03.A1I(o82.A01().A06());
        if (this.A03.A1b()) {
            this.A08 = ((C2019jT) this.A03).A2A();
        } else {
            this.A08 = ((AbstractC2025jd) this.A03).A2E();
        }
        if (this.A03.A1g()) {
            this.A05 = WK.A08;
            if (this.A03.A1U()) {
                this.A04.A0F().AJt(M5.A08);
            } else {
                this.A04.A0F().AJt(M5.A0A);
            }
        } else {
            switch (this.A03.A0o()) {
                case 0:
                    this.A05 = WK.A0I;
                    this.A04.A0F().AJt(M5.A0D);
                    break;
                case 1:
                    this.A05 = WK.A0H;
                    this.A04.A0F().AJt(M5.A0C);
                    break;
                case 2:
                    this.A05 = WK.A05;
                    this.A04.A0F().AJt(M5.A05);
                    break;
                case 3:
                    this.A05 = WK.A0G;
                    this.A04.A0F().AJt(M5.A04);
                    break;
                case 4:
                    this.A05 = WK.A0J;
                    this.A04.A0F().AJt(M5.A0E);
                    break;
            }
        }
        if (C1310Up.A0v(c1860gi)) {
            NQ nq = this.A03;
            String[] strArr3 = A0F;
            if (strArr3[4].charAt(19) != strArr3[0].charAt(19)) {
                String[] strArr4 = A0F;
                strArr4[4] = "c2SjyVfNFMTSQhwflPzyjFy3Fjr2snH4";
                strArr4[0] = "k4vT1WhZbJ1Mlr1eks5fTJscMmdnfo8D";
                if (nq.A1b()) {
                    C2019jT c2019jT = (C2019jT) this.A03;
                    for (int A23 = c2019jT.A23() - 1; A23 >= 0; A23--) {
                        AbstractC2025jd A27 = c2019jT.A27(A23);
                        if (AbstractC1116Mx.A06(this.A04, AbstractC1116Mx.A01(c1860gi, A27.A1H(), A27.A2E()), c1860gi.A0A())) {
                            this.A04.A0F().A52();
                            c2019jT.A2C(A23);
                            return;
                        }
                    }
                    if (c2019jT.A23() == 0) {
                        this.A01.AFp(this, AdError.NO_FILL);
                        return;
                    }
                } else if (AbstractC1116Mx.A06(this.A04, AbstractC1116Mx.A01(c1860gi, o82.A03(), ((AbstractC2025jd) this.A03).A2E()), c1860gi.A0A())) {
                    this.A04.A0F().A52();
                    this.A01.AFp(this, AdError.NO_FILL);
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A02 = new NK(this.A0B, this, nj);
        A07();
        A0D(z6);
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final String A7O() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final boolean AKL() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final void onDestroy() {
        A08();
    }
}
