package com.instagram.common.viewpoint.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class ME extends AbstractC1423Zd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (XX.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C1150Og A01;
    public final C1860gi A02;

    public ME(C1860gi c1860gi, VA va, String str, C1130Nm c1130Nm, InterfaceC1402Yi interfaceC1402Yi, InterfaceC1401Yh interfaceC1401Yh) {
        super(c1860gi, va, str, c1130Nm, interfaceC1402Yi, interfaceC1401Yh);
        this.A02 = c1860gi;
        this.A01 = AbstractC1151Oh.A00(c1860gi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        YB.A0N(this.A00, -1728053248);
        if (C1310Up.A2b(c1860gi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ME.this.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z6) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z6 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1423Zd
    public final void A0O() {
        C1154Ok A0A = this.A01.A0A();
        C1438Zs c1438Zs = new C1438Zs(this.A02);
        c1438Zs.setInfo(YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c1438Zs.setOnClickListener(new ViewOnClickListenerC1429Zj(this));
        C1154Ok A0B = this.A01.A0B();
        C1438Zs c1438Zs2 = new C1438Zs(this.A02);
        c1438Zs2.setInfo(YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c1438Zs2.setOnClickListener(new ViewOnClickListenerC1430Zk(this));
        C1438Zs c1438Zs3 = new C1438Zs(this.A02);
        c1438Zs3.setInfo(YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c1438Zs3.setOnClickListener(new ViewOnClickListenerC1431Zl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        YB.A0N(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(c1438Zs, itemParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c1438Zs2, itemParams);
        }
        linearLayout.addView(c1438Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1423Zd
    public final void A0P() {
        this.A00.removeAllViews();
        YB.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1423Zd
    public final void A0Q(C1154Ok c1154Ok, EnumC1152Oi enumC1152Oi) {
        String A0E;
        int i;
        String str;
        if (enumC1152Oi == EnumC1152Oi.A05) {
            return;
        }
        boolean z6 = enumC1152Oi == EnumC1152Oi.A06;
        C1420Za c1420Za = new C1420Za(this.A02, this.A0D);
        if (z6) {
            C1150Og c1150Og = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            A0E = c1150Og.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        C1420Za A0D = c1420Za.A0H(A0E).A0G(this.A01.A0D()).A0E(c1154Ok.A04()).A0D(z6 ? YM.REPORT_AD : YM.HIDE_AD);
        if (z6) {
            i = -552389;
        } else {
            i = -13272859;
        }
        C1420Za A0C = A0D.A0C(i);
        if (this.A0C != null) {
            C1130Nm c1130Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                str = c1130Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                str = c1130Nm.A01();
            }
        } else {
            str = "";
        }
        C1421Zb adHiddenView = A0C.A0F(str).A0L();
        YB.A0N(adHiddenView, -1);
        YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c1154Ok, enumC1152Oi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1423Zd
    public final void A0R(C1154Ok c1154Ok, EnumC1152Oi enumC1152Oi) {
        String A0H;
        boolean z6 = enumC1152Oi == EnumC1152Oi.A06;
        C1860gi c1860gi = this.A02;
        InterfaceC1425Zf interfaceC1425Zf = this.A0D;
        if (z6) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        C1441Zv c1441Zv = new C1441Zv(c1860gi, c1154Ok, interfaceC1425Zf, A0H, z6 ? YM.REPORT_AD : YM.HIDE_AD);
        c1441Zv.setClickable(true);
        YB.A0N(c1441Zv, -1);
        c1441Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c1441Zv, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1423Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A54();
    }
}
