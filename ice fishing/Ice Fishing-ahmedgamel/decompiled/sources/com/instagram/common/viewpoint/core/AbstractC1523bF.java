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
public abstract class AbstractC1523bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1860gi A07;
    public final ViewOnClickListenerC1058Kr A08;
    public final C1554bk A09;

    public static String A0h(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 11);
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

    public AbstractC1523bF(C1860gi c1860gi, ViewOnClickListenerC1058Kr viewOnClickListenerC1058Kr, int i, C1118Na c1118Na, boolean z6, String str, VA va, InterfaceC1401Yh interfaceC1401Yh, C1805fp c1805fp, Y2 y22, C1124Ng c1124Ng, boolean z9, String str2) {
        super(c1860gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c1860gi;
        this.A04 = i;
        this.A03 = z9;
        this.A02 = str2;
        this.A09 = new C1554bk(c1860gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z9) {
            this.A00 = new LinearLayout(c1860gi);
            this.A01 = new TextView(c1860gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC1058Kr == null) {
            this.A08 = new ViewOnClickListenerC1058Kr(c1860gi, str, c1118Na, z6, va, interfaceC1401Yh, c1805fp, y22, c1124Ng);
        } else {
            this.A08 = viewOnClickListenerC1058Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1564bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c1860gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z6) {
    }

    public final ViewOnClickListenerC1058Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C1120Nc c1120Nc, String str, String str2, InterfaceC1375Xh interfaceC1375Xh, InterfaceC1538bU interfaceC1538bU) {
        this.A08.setCta(c1120Nc, str, new HashMap(), interfaceC1375Xh, interfaceC1538bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
