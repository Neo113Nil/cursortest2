package com.instagram.common.viewpoint.core;

import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1953ib extends N2 {
    public static byte[] A01;
    public final /* synthetic */ C1951iZ A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C1953ib(C1951iZ c1951iZ) {
        this.A00 = c1951iZ;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j6;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A02;
            SJ sj = (SJ) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j6 = this.A00.A01;
            sj.A02(currentTimeMillis - j6);
            rewardedVideoAd3 = this.A00.A02;
            rewardedVideoAd3.show(sj.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1935iI c1935iI;
        this.A00.A06.A0F().A3K();
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1935iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c1935iI.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1935iI c1935iI;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1935iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c1935iI.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C07047a c07047a;
        C1935iI c1935iI;
        C1935iI c1935iI2;
        C07047a c07047a2;
        NQ nq;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1935iI c1935iI3;
        NQ nq2;
        RewardedVideoAd rewardedVideoAd2;
        NQ nq3;
        C1935iI c1935iI4;
        RewardedVideoAd rewardedVideoAd3;
        NQ nq4;
        C1935iI c1935iI5;
        C1935iI c1935iI6;
        C1935iI c1935iI7;
        NQ nq5;
        C1935iI c1935iI8;
        c07047a = this.A00.A04;
        if (c07047a == null) {
            this.A00.A06.A08().ABC(A00(0, 3, 67), AbstractC1252Td.A0N, new C1253Te(A00(3, 18, 108)));
            return;
        }
        AbstractC2009jh abstractC2009jh = (AbstractC2009jh) n1;
        c1935iI = this.A00.A08;
        if (c1935iI.A03 != null) {
            c1935iI8 = this.A00.A08;
            abstractC2009jh.A02(c1935iI8.A03);
        }
        c1935iI2 = this.A00.A08;
        c1935iI2.A00 = abstractC2009jh.A0H();
        this.A00.A05 = true;
        C1951iZ c1951iZ = this.A00;
        c07047a2 = this.A00.A04;
        c1951iZ.A03 = c07047a2.A0I();
        nq = this.A00.A03;
        if (nq != null) {
            int i = 0;
            nq4 = this.A00.A03;
            if (!nq4.A1b()) {
                nq5 = this.A00.A03;
                i = ((AbstractC2005jd) nq5).A26();
            }
            if (i > 0) {
                XC xc = new XC();
                C1840gi c1840gi = this.A00.A06;
                c1935iI5 = this.A00.A08;
                if (xc.A09(c1840gi, c1935iI5.A06, i)) {
                    xc.A08(this.A00.A06, true);
                    C1951iZ c1951iZ2 = this.A00;
                    C1840gi c1840gi2 = this.A00.A06;
                    c1935iI6 = this.A00.A08;
                    String str = c1935iI6.A0D;
                    c1935iI7 = this.A00.A08;
                    c1951iZ2.A02 = xc.A07(c1840gi2, str, c1935iI7.A06);
                } else {
                    xc.A08(this.A00.A06, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            c1935iI3 = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c1935iI3.A6k());
            return;
        }
        nq2 = this.A00.A03;
        ((AbstractC2005jd) nq2).A2J(true);
        rewardedVideoAd2 = this.A00.A02;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        nq3 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(nq3.A0s());
        c1935iI4 = this.A00.A08;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c1935iI4.A02).withAdListener(new OI(this)).build();
        rewardedVideoAd3 = this.A00.A02;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C1312Vm c1312Vm) {
        C1935iI c1935iI;
        long j6;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1935iI c1935iI2;
        this.A00.A0D(true);
        c1935iI = this.A00.A08;
        InterfaceC1066Lt A0F = c1935iI.A0B.A0F();
        j6 = this.A00.A00;
        A0F.A3N(Y1.A01(j6), c1312Vm.A03().getErrorCode(), c1312Vm.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1935iI2 = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onError(c1935iI2.A6k(), XE.A00(c1312Vm));
    }
}
