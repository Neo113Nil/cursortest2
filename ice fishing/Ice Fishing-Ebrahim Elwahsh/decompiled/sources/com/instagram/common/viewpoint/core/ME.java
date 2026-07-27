package com.instagram.common.viewpoint.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class ME extends AbstractC1402Zd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (XX.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C1129Og A01;
    public final C1839gi A02;

    public ME(C1839gi c1839gi, VA va, String str, C1109Nm c1109Nm, InterfaceC1381Yi interfaceC1381Yi, InterfaceC1380Yh interfaceC1380Yh) {
        super(c1839gi, va, str, c1109Nm, interfaceC1381Yi, interfaceC1380Yh);
        this.A02 = c1839gi;
        this.A01 = AbstractC1130Oh.A00(c1839gi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        YB.A0N(this.A00, -1728053248);
        if (C1289Up.A2b(c1839gi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ME.this.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z8) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z8 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1402Zd
    public final void A0O() {
        C1133Ok A0A = this.A01.A0A();
        C1417Zs c1417Zs = new C1417Zs(this.A02);
        c1417Zs.setInfo(YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c1417Zs.setOnClickListener(new ViewOnClickListenerC1408Zj(this));
        C1133Ok A0B = this.A01.A0B();
        C1417Zs c1417Zs2 = new C1417Zs(this.A02);
        c1417Zs2.setInfo(YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c1417Zs2.setOnClickListener(new ViewOnClickListenerC1409Zk(this));
        C1417Zs c1417Zs3 = new C1417Zs(this.A02);
        c1417Zs3.setInfo(YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c1417Zs3.setOnClickListener(new ViewOnClickListenerC1410Zl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        YB.A0N(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(c1417Zs, itemParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c1417Zs2, itemParams);
        }
        linearLayout.addView(c1417Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1402Zd
    public final void A0P() {
        this.A00.removeAllViews();
        YB.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1402Zd
    public final void A0Q(C1133Ok c1133Ok, EnumC1131Oi enumC1131Oi) {
        String A0E;
        int i;
        String str;
        if (enumC1131Oi == EnumC1131Oi.A05) {
            return;
        }
        boolean z8 = enumC1131Oi == EnumC1131Oi.A06;
        C1399Za c1399Za = new C1399Za(this.A02, this.A0D);
        if (z8) {
            C1129Og c1129Og = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            A0E = c1129Og.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        C1399Za A0D = c1399Za.A0H(A0E).A0G(this.A01.A0D()).A0E(c1133Ok.A04()).A0D(z8 ? YM.REPORT_AD : YM.HIDE_AD);
        if (z8) {
            i = -552389;
        } else {
            i = -13272859;
        }
        C1399Za A0C = A0D.A0C(i);
        if (this.A0C != null) {
            C1109Nm c1109Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                str = c1109Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                str = c1109Nm.A01();
            }
        } else {
            str = "";
        }
        C1400Zb adHiddenView = A0C.A0F(str).A0L();
        YB.A0N(adHiddenView, -1);
        YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c1133Ok, enumC1131Oi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1402Zd
    public final void A0R(C1133Ok c1133Ok, EnumC1131Oi enumC1131Oi) {
        String A0H;
        boolean z8 = enumC1131Oi == EnumC1131Oi.A06;
        C1839gi c1839gi = this.A02;
        InterfaceC1404Zf interfaceC1404Zf = this.A0D;
        if (z8) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        C1420Zv c1420Zv = new C1420Zv(c1839gi, c1133Ok, interfaceC1404Zf, A0H, z8 ? YM.REPORT_AD : YM.HIDE_AD);
        c1420Zv.setClickable(true);
        YB.A0N(c1420Zv, -1);
        c1420Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c1420Zv, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1402Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A54();
    }
}
