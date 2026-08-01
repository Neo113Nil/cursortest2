package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1503bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1840gi A07;
    public final ViewOnClickListenerC1038Kr A08;
    public final C1534bk A09;

    public static String A0h(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1503bF(C1840gi c1840gi, ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr, int i, C1098Na c1098Na, boolean z3, String str, VA va, InterfaceC1381Yh interfaceC1381Yh, C1785fp c1785fp, Y2 y22, C1104Ng c1104Ng, boolean z6, String str2) {
        super(c1840gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c1840gi;
        this.A04 = i;
        this.A03 = z6;
        this.A02 = str2;
        this.A09 = new C1534bk(c1840gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z6) {
            this.A00 = new LinearLayout(c1840gi);
            this.A01 = new TextView(c1840gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC1038Kr == null) {
            this.A08 = new ViewOnClickListenerC1038Kr(c1840gi, str, c1098Na, z3, va, interfaceC1381Yh, c1785fp, y22, c1104Ng);
        } else {
            this.A08 = viewOnClickListenerC1038Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1544bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c1840gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z3) {
    }

    public final ViewOnClickListenerC1038Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C1100Nc c1100Nc, String str, String str2, InterfaceC1355Xh interfaceC1355Xh, InterfaceC1518bU interfaceC1518bU) {
        this.A08.setCta(c1100Nc, str, new HashMap(), interfaceC1355Xh, interfaceC1518bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
