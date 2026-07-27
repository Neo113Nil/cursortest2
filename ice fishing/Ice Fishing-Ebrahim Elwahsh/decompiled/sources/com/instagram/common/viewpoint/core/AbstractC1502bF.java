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
public abstract class AbstractC1502bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1839gi A07;
    public final ViewOnClickListenerC1037Kr A08;
    public final C1533bk A09;

    public static String A0h(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i4);
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

    public AbstractC1502bF(C1839gi c1839gi, ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr, int i, C1097Na c1097Na, boolean z8, String str, VA va, InterfaceC1380Yh interfaceC1380Yh, C1784fp c1784fp, Y2 y22, C1103Ng c1103Ng, boolean z9, String str2) {
        super(c1839gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c1839gi;
        this.A04 = i;
        this.A03 = z9;
        this.A02 = str2;
        this.A09 = new C1533bk(c1839gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z9) {
            this.A00 = new LinearLayout(c1839gi);
            this.A01 = new TextView(c1839gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC1037Kr == null) {
            this.A08 = new ViewOnClickListenerC1037Kr(c1839gi, str, c1097Na, z8, va, interfaceC1380Yh, c1784fp, y22, c1103Ng);
        } else {
            this.A08 = viewOnClickListenerC1037Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1543bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c1839gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z8) {
    }

    public final ViewOnClickListenerC1037Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C1099Nc c1099Nc, String str, String str2, InterfaceC1354Xh interfaceC1354Xh, InterfaceC1517bU interfaceC1517bU) {
        this.A08.setCta(c1099Nc, str, new HashMap(), interfaceC1354Xh, interfaceC1517bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
