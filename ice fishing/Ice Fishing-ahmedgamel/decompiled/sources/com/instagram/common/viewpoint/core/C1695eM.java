package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1695eM {
    public ViewOnClickListenerC1038Kr A00;
    public final NN A01;
    public final NY A02;
    public final C1101Nd A03;
    public final C1110Nm A04;
    public final C1840gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C1695eM(C1840gi c1840gi, VA va, AbstractC2005jd abstractC2005jd) {
        this.A05 = c1840gi;
        this.A06 = new VI(abstractC2005jd.A2E(), va);
        this.A01 = abstractC2005jd.A28();
        this.A02 = abstractC2005jd.A29().A0I();
        this.A04 = abstractC2005jd.A2C();
        this.A03 = abstractC2005jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr) {
        C1540bq c1540bq = new C1540bq(this.A05, this.A01.A01(), true, false, false);
        c1540bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c1540bq.setAlignment(17);
        C1534bk c1534bk = new C1534bk(this.A05);
        YB.A0N(c1534bk, 0);
        c1534bk.setRadius(50);
        new LM(c1534bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1534bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1540bq, layoutParams);
        if (viewOnClickListenerC1038Kr != null) {
            YB.A0J(viewOnClickListenerC1038Kr);
            linearLayout.addView(viewOnClickListenerC1038Kr, layoutParams);
            viewOnClickListenerC1038Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC1038Kr.getText())) {
                YB.A0H(viewOnClickListenerC1038Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C1910hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC1694eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1694eL.A03;
        }
        return EnumC1694eL.A02;
    }

    public final Pair<EnumC1694eL, View> A03(ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr) {
        View A01;
        this.A00 = viewOnClickListenerC1038Kr;
        EnumC1694eL A02 = A02();
        switch (A02) {
            case A03:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        VK.A04(A01, this.A06, VH.A0S);
        return new Pair<>(A02, A01);
    }
}
