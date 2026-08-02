package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class KZ extends AbstractC1573c3 implements XQ {
    public static byte[] A03;
    public static String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final AbstractC2025jd A00;
    public final XS A01;
    public final InterfaceC1401Yh A02;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 78);
            i9++;
        }
    }

    public static void A01() {
        A03 = new byte[]{c.f17104b, 68, 72, 78, 76};
    }

    static {
        A01();
    }

    public KZ(C1577c7 c1577c7, boolean z6) {
        super(c1577c7, true);
        FrameLayout.LayoutParams layoutParams;
        this.A02 = c1577c7.A0C();
        this.A00 = c1577c7.A05();
        RelativeLayout relativeLayout = new RelativeLayout(c1577c7.A06());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        YB.A0U(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c1577c7.A06());
        linearLayout.setOrientation(!z6 ? 1 : 0);
        linearLayout.setGravity(80);
        YB.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC1573c3.A08, 0, AbstractC1573c3.A08, AbstractC1573c3.A08);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z6 ? -2 : -1, -2);
        layoutParams4.setMargins(z6 ? AbstractC1573c3.A08 : 0, z6 ? 0 : AbstractC1573c3.A08, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z6 ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        this.A01 = XS.A00(c1577c7.A06(), this.A00, this);
        XR A02 = this.A01.A02(this.A00);
        c1577c7.A06().A0H().A00(A02.A01);
        if (c1577c7.A0H() && !z6) {
            C1697e4 c1697e4 = new C1697e4(c1577c7.A06());
            c1697e4.setPageDetails(c1577c7.A05().A2C());
            int A05 = this.A07.A05().A28().A00().A05(true);
            c1697e4.A02(A05, A05);
            YB.A0G(1007, c1697e4);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, AbstractC1573c3.A08, 0, 0);
            linearLayout.addView(c1697e4, layoutParams6);
            if (C1310Up.A18(c1577c7.A06())) {
                c1697e4.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0F(c1577c7.A05(), c1577c7.A0B());
        View A022 = c1577c7.A02();
        if (A022 != null && (A02.A00 || C1310Up.A1J(getAdContextWrapper()))) {
            if (z6) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c1577c7.A06());
            frameLayout.addView(A022, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (A02.A00) {
                A022.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.bz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        KZ.this.A1Q(view);
                    }
                });
            } else {
                AbstractC1520bC.A00(A022, C1310Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC1570c0(this));
            }
        } else if (A022 != null) {
            addView(A022, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (C1310Up.A17(c1577c7.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c1577c7.A0B() != null) {
                c1577c7.A0B().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1573c3
    public final void A1C() {
        super.A1C();
        this.A01.A03();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1573c3
    public final void A1H(NR nr, String str, double d9, Bundle bundle) {
        super.A1H(nr, str, d9, bundle);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1573c3
    public final boolean A1O() {
        return true;
    }

    public final /* synthetic */ void A1Q(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
