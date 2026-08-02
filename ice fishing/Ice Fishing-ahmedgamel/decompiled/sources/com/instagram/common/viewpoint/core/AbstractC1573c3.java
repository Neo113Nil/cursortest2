package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.c3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1573c3 extends RelativeLayout {
    public static final int A08 = XV.A0b;
    public static final int A09 = (int) (XX.A02 * 28.0f);
    public static final int A0A = (int) (XX.A02 * 32.0f);
    public C1118Na A00;
    public boolean A01;
    public C1465aJ A02;
    public final C1860gi A03;
    public final VA A04;
    public final ViewOnClickListenerC1058Kr A05;
    public final C1560bq A06;
    public final C1577c7 A07;

    public abstract boolean A1O();

    public AbstractC1573c3(C1577c7 c1577c7, boolean z6) {
        super(c1577c7.A06());
        C1118Na A00;
        this.A07 = c1577c7;
        this.A03 = c1577c7.A06();
        this.A04 = c1577c7.A07();
        if (c1577c7.A00() == 1) {
            A00 = c1577c7.A05().A28().A01();
        } else {
            A00 = c1577c7.A05().A28().A00();
        }
        this.A00 = A00;
        this.A01 = z6;
        this.A05 = new ViewOnClickListenerC1058Kr(c1577c7.A06(), c1577c7.A05(), this.A00, c1577c7.A07(), c1577c7.A0C(), c1577c7.A0F(), c1577c7.A0A(), c1577c7.A09());
        this.A05.setRoundedCornersEnabled(A02());
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setV2Design(A04());
        YB.A0G(1001, this.A05);
        this.A06 = new C1560bq(this.A03, this.A00, this.A01, A03(), A0B());
        YB.A0K(this.A06);
    }

    public final C1465aJ A00(C1860gi c1860gi, AbstractC2025jd abstractC2025jd, VI vi, EnumC1468aM enumC1468aM, InterfaceC1401Yh interfaceC1401Yh) {
        this.A02 = AbstractC1470aO.A01(c1860gi, true, abstractC2025jd, vi, interfaceC1401Yh, enumC1468aM, AbstractC1467aL.A00(abstractC2025jd));
        YB.A0K(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (abstractC2025jd.A2U()) {
            layoutParams.setMargins(XV.A0b, XV.A0r, 0, 0);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else {
            layoutParams.setMargins(XV.A0b, 0, 0, XV.A0b);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
        this.A02.setLayoutParams(layoutParams);
        return this.A02;
    }

    public final C1469aN A01(C1860gi c1860gi, EnumC1468aM enumC1468aM) {
        C1469aN A02 = AbstractC1470aO.A02(c1860gi, enumC1468aM, this.A07.A05());
        YB.A0K(A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(XV.A0b, 0, 0, XV.A0b);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        A02.setLayoutParams(layoutParams);
        return A02;
    }

    public boolean A02() {
        return true;
    }

    public boolean A03() {
        return true;
    }

    public final boolean A04() {
        if (this.A07.A05().A29().A0H().A07() == null) {
            return this.A07.A05().A1w() || this.A07.A05().A1y();
        }
        return this.A07.A05().A1n();
    }

    public boolean A0A() {
        return true;
    }

    public boolean A0B() {
        return true;
    }

    public EnumC1109Mq A1B(String str) {
        return getCtaButton().A0E(str);
    }

    public void A1C() {
        if (this.A02 != null) {
            this.A02.A0O();
        }
    }

    public void A1D() {
    }

    public void A1E() {
    }

    public void A1F() {
    }

    public void A1G() {
    }

    public void A1H(NR nr, String str, double d9, Bundle bundle) {
        this.A06.A04(nr.A0I().A0F(), nr.A0I().A04(), null, false, !A1O() && d9 > 0.0d && d9 < 1.0d);
        this.A05.setCta(nr.A0J(), str, new HashMap());
    }

    public void A1I(C4K c4k) {
    }

    public void A1J(E1 e12) {
    }

    public void A1K(C4A c4a, int i) {
    }

    public void A1L(boolean z6) {
        if (!z6 && this.A02 != null) {
            this.A02.A0P();
        }
    }

    public boolean A1M() {
        return false;
    }

    public boolean A1N() {
        return true;
    }

    public boolean A1P(boolean z6) {
        return false;
    }

    public C1860gi getAdContextWrapper() {
        return this.A03;
    }

    public VA getAdEventManager() {
        return this.A04;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C1118Na getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC1058Kr getCtaButton() {
        return this.A05;
    }

    public C1560bq getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1118Na A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A07.A05().A28().A01();
        } else {
            A00 = this.A07.A05().A28().A00();
        }
        this.A00 = A00;
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A03(this.A00, this.A01);
    }

    public void setAccidentalClickCappingListener(InterfaceC1110Mr interfaceC1110Mr) {
        getCtaButton().getCtaActionHelper().A07(interfaceC1110Mr);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z6) {
    }
}
