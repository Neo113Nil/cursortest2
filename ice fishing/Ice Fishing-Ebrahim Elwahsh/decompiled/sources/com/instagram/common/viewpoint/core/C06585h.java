package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.5h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06585h extends AbstractC0978Ij {
    public static String[] A09 = {"48gXxVXafINQx", "X9eHMFtmNxkudREV2ga0mL63IUwpVFyn", "fDHVKSg", "BJ3S", "6p1nQLD", "GwvdfXoW7Tkcgx6xI32", "XjSW5yJHqMwpzXQP1hTrWYHuzeodWOV3", "mLwcnNPCnn6Mi"};
    public static final RelativeLayout.LayoutParams A0A = new RelativeLayout.LayoutParams(-1, -1);
    public XO A00;
    public AbstractC1552c3 A01;
    public DZ A02;
    public final int A03;
    public final ImageView A04;
    public final VI A05;
    public final AbstractC1374Yb A06;
    public final InterfaceC1659dm A07;
    public final AtomicBoolean A08;

    public C06585h(C1839gi c1839gi, ZU zu, int i, VA va, AbstractC2004jd abstractC2004jd, InterfaceC1380Yh interfaceC1380Yh, AbstractC1374Yb abstractC1374Yb, VI vi, boolean z8, boolean z9, InterfaceC1659dm interfaceC1659dm, int i4, int i9) {
        super(c1839gi, zu, va, abstractC2004jd, i, z8, z9, interfaceC1380Yh, i9);
        this.A08 = new AtomicBoolean(false);
        this.A03 = i4;
        this.A07 = interfaceC1659dm;
        this.A04 = new ImageView(getContext());
        this.A06 = abstractC1374Yb;
        this.A05 = vi;
        if (abstractC2004jd.A1c()) {
            this.A02 = new DZ(c1839gi, this.A03);
        }
        this.A04.setScaleType(ImageView.ScaleType.CENTER);
        this.A04.setAdjustViewBounds(true);
        new LM(this.A04, c1839gi).A05(abstractC2004jd.A29().A0H().A00(), abstractC2004jd.A29().A0H().A01()).A06(new C0976Ih(this)).A07(abstractC2004jd.A29().A0H().A08());
        A08(c1839gi.getResources().getConfiguration().orientation);
    }

    private AbstractC1552c3 A02(int i) {
        if (this.A04.getParent() != null) {
            YB.A0J(this.A04);
        }
        boolean z8 = i != 2;
        C1555c6 c1555c6 = new C1555c6(super.A07, super.A08, this.A0B, super.A06, this.A04, this.A0D, this.A0A);
        C1555c6 interstitialLayoutParamsBuilder = c1555c6.A0J(this.A06.getToolbarHeight());
        interstitialLayoutParamsBuilder.A0P(this.A06).A0I(i).A0T(z8).A0S(super.A00).A0M(this.A05);
        if (this.A02 != null) {
            c1555c6.A0R(this.A02);
        }
        c1555c6.A0L(C1092Mu.A00(super.A07, super.A08, "", XB.A00(super.A06.A29().A0J().A05()), new HashMap(), super.A06.A2A()));
        c1555c6.A0Q(this.A07);
        return AbstractC1553c4.A00(c1555c6.A0U(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A08.get()) {
            A1F();
        }
    }

    private void A08(int i) {
        YB.A0J(this.A01);
        this.A01 = A02(i);
        if (this.A01 instanceof KE) {
            ((KE) this.A01).setChildChainedAd(true);
        } else if (this.A01 instanceof C1002Ji) {
            AbstractC1552c3 abstractC1552c3 = this.A01;
            String[] strArr = A09;
            if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A09[5] = "Sp2NSSouatJBlog5Q54";
            ((C1002Ji) abstractC1552c3).setChildChainedAd(true);
        }
        addView(this.A01, 0, A0A);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final EnumC1088Mq A1D(String str) {
        return this.A01.A1B(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final void A1E() {
        if (C1289Up.A1z(super.A07)) {
            super.A07.A0B().AKU(this.A04);
        }
        if (this.A01 != null) {
            this.A01.A1C();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final void A1G() {
        if (this.A01 instanceof C1022Kc) {
            AbstractC1552c3 abstractC1552c3 = this.A01;
            String[] strArr = A09;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A09[3] = "fHRV";
            ((C1022Kc) abstractC1552c3).A1Q();
            return;
        }
        if (this.A01 instanceof C1002Ji) {
            ((C1002Ji) this.A01).A1Q(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final void A1H() {
        int A02 = super.A06.A29().A0H().A02();
        int secondsForNextCta = this.A03;
        if (secondsForNextCta > 0) {
            this.A00 = new XO(this.A03, 100.0f, 100L, new Handler(Looper.getMainLooper()), new C0974If(this));
            this.A00.A07();
            if (A02 >= 0) {
                this.A06.setProgressSpinnerInvisible(true);
            }
            if (A02 != 0) {
                int secondsForNextCta2 = this.A03;
                if (A02 < secondsForNextCta2) {
                    if (A02 <= 0) {
                        return;
                    }
                    new XO(A02, new C0972Id(this)).A07();
                    return;
                }
            }
            this.A06.setToolbarActionMode(8);
            return;
        }
        this.A07.AFw(false);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final void A1I(boolean z8) {
        this.A01.setChainedWatchAndBrowseSkippableStatus(z8);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final void A1J(boolean z8) {
        if (this.A00 != null && this.A00.A05()) {
            this.A00.A06();
        }
        if (this.A01 != null) {
            this.A01.A1L(z8);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final void A1K(boolean z8) {
        if (this.A00 != null && !this.A00.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final boolean A1L() {
        if (this.A01.A1M()) {
            if (!(this.A01 instanceof C1022Kc) || ((C1022Kc) this.A01).A1R()) {
                return (this.A01 instanceof C1002Ji) && !((C1002Ji) this.A01).A1S();
            }
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final boolean A1M() {
        if (this.A01 instanceof C1022Kc) {
            return ((C1022Kc) this.A01).A1R();
        }
        boolean z8 = this.A01 instanceof C1002Ji;
        String[] strArr = A09;
        if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[2] = "VUX6Wbk";
        strArr2[4] = "Kq1l7t9";
        if (z8) {
            return ((C1002Ji) this.A01).A1S();
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public final boolean A1N() {
        if (this.A01 instanceof C1022Kc) {
            return ((C1022Kc) this.A01).A1S();
        }
        if (this.A01 instanceof C1002Ji) {
            return ((C1002Ji) this.A01).A1T();
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij
    public C1657dk getFullScreenAdStyle() {
        C1097Na colors = this.A01.getColors();
        return new C1657dk(this.A01.A1O(), C1657dk.A07, colors, ViewOnClickListenerC1037Kr.A05(super.A06), colors.A08(this.A01.A1O() || (this.A01 instanceof AbstractC1020Ka)), null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0978Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 instanceof C1022Kc) {
            this.A01.onConfigurationChanged(configuration);
        } else if (!super.A06.A29().A0T()) {
            A08(configuration.orientation);
        }
    }
}
