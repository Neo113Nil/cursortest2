package com.instagram.common.viewpoint.core;

import android.view.View;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class Cif extends N2 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C1954id A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, c.f16318c, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public Cif(C1954id c1954id) {
        this.A00 = c1954id;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C07137j c07137j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1950iY c1950iY;
        C07137j c07137j2;
        C07137j c07137j3;
        C07137j c07137j4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c07137j = this.A00.A03;
        if (c07137j != null && C1290Up.A2D(this.A00.A06)) {
            c07137j2 = this.A00.A03;
            c07137j2.A0S(new C1956ig(this));
            c07137j3 = this.A00.A03;
            c07137j3.A0N();
            c07137j4 = this.A00.A03;
            c07137j4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c1950iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1950iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1950iY c1950iY;
        interstitialAdExtendedListener = this.A00.A07;
        c1950iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c1950iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1950iY c1950iY;
        this.A00.A06.A0F().A3K();
        interstitialAdExtendedListener = this.A00.A07;
        c1950iY = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c1950iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1950iY c1950iY;
        interstitialAdExtendedListener = this.A00.A07;
        c1950iY = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c1950iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0E(View view) {
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C07137j c07137j;
        C07137j c07137j2;
        NQ nq;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1950iY c1950iY;
        NQ nq2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C1950iY c1950iY2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C1950iY c1950iY3;
        InterstitialAd interstitialAd2;
        C1950iY c1950iY4;
        C1950iY c1950iY5;
        InterstitialAd interstitialAd3;
        C1950iY c1950iY6;
        C1950iY c1950iY7;
        C1950iY c1950iY8;
        c07137j = this.A00.A03;
        if (c07137j != null) {
            this.A00.A05 = true;
            C1954id c1954id = this.A00;
            c07137j2 = this.A00.A03;
            c1954id.A02 = c07137j2.A0I();
            nq = this.A00.A02;
            if (!(nq instanceof AbstractC2005jd)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c1950iY = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c1950iY.A6k());
                    return;
                }
            } else {
                nq2 = this.A00.A02;
                AbstractC2005jd abstractC2005jd = (AbstractC2005jd) nq2;
                if (abstractC2005jd.A26() > 0) {
                    XC xc = new XC();
                    C1840gi c1840gi = this.A00.A06;
                    c1950iY6 = this.A00.A08;
                    if (xc.A09(c1840gi, c1950iY6.A08(), abstractC2005jd.A26())) {
                        xc.A08(this.A00.A06, true);
                        C1954id c1954id2 = this.A00;
                        C1840gi c1840gi2 = this.A00.A06;
                        c1950iY7 = this.A00.A08;
                        String A0A = c1950iY7.A0A();
                        c1950iY8 = this.A00.A08;
                        c1954id2.A01 = xc.A06(c1840gi2, A0A, c1950iY8.A08());
                    } else {
                        C1954id c1954id3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            xc.A08(c1954id3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            xc.A08(c1954id3.A06, false);
                        }
                    }
                }
                C1954id c1954id4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c1954id4.A01;
                    if (interstitialAd != null) {
                        abstractC2005jd.A2J(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new OH(this, abstractC2005jd));
                        c1950iY4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c1950iY4.A0B());
                        c1950iY5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c1950iY5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C1954id c1954id5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c1954id5.A07;
                        c1950iY3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c1950iY3.A6k());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c1954id5.A07;
                        c1950iY2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c1950iY2.A6k());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().ABC(A00(0, 3, 98), AbstractC1252Td.A0N, new C1253Te(A00(3, 18, 46)));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C1312Vm c1312Vm) {
        long j6;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1950iY c1950iY;
        InterfaceC1066Lt A0F = this.A00.A06.A0F();
        j6 = this.A00.A00;
        A0F.A3N(Y1.A01(j6), c1312Vm.A03().getErrorCode(), c1312Vm.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c1950iY = this.A00.A08;
        interstitialAdExtendedListener.onError(c1950iY.A6k(), XE.A00(c1312Vm));
    }
}
