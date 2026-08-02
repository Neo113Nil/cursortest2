package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.instagram.common.viewpoint.core.AbstractC1395Yb;
import com.instagram.common.viewpoint.core.AbstractC1564bu;
import com.instagram.common.viewpoint.core.C1118Na;
import com.instagram.common.viewpoint.core.C1130Nm;
import com.instagram.common.viewpoint.core.C1136Ns;
import com.instagram.common.viewpoint.core.C1697e4;
import com.instagram.common.viewpoint.core.C1860gi;
import com.instagram.common.viewpoint.core.InterfaceC1394Ya;
import com.instagram.common.viewpoint.core.InterfaceC1401Yh;
import com.instagram.common.viewpoint.core.VI;
import com.instagram.common.viewpoint.core.ViewOnClickListenerC1058Kr;
import com.instagram.common.viewpoint.core.ViewOnClickListenerC1410Yq;
import com.instagram.common.viewpoint.core.XX;
import com.instagram.common.viewpoint.core.YB;
import com.instagram.common.viewpoint.core.YM;
import com.instagram.common.viewpoint.core.YZ;
import com.instagram.common.viewpoint.core.ZC;
import com.instagram.common.viewpoint.core.ZK;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class FullScreenAdToolbar extends AbstractC1395Yb {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public YZ A00;
    public InterfaceC1394Ya A01;
    public InterfaceC1394Ya A02;
    public ZC A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final VI A07;
    public final InterfaceC1401Yh A08;
    public final ZK A09;
    public final C1697e4 A0A;

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 22);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (XX.A02 * 10.0f);
        A0H = (int) (XX.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (XX.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C1860gi c1860gi, InterfaceC1401Yh interfaceC1401Yh, VI vi, int i, int i4, boolean z6) {
        super(c1860gi);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z6;
        this.A08 = interfaceC1401Yh;
        this.A07 = vi;
        setGravity(16);
        this.A09 = new ZK(c1860gi, i, z6);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new ViewOnClickListenerC1410Yq(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c1860gi);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C1697e4(c1860gi);
            YB.A0G(1006, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i4 != -1) {
                A0G(c1860gi, i4);
                return;
            }
            return;
        }
        if (i4 != -1) {
            A0G(c1860gi, i4);
        }
        this.A06 = new RelativeLayout(c1860gi);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C1697e4(c1860gi);
        YB.A0G(1006, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z6) {
        if (view == null) {
            return;
        }
        view.setVisibility(z6 ? 0 : 8);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A08() {
        super.A08();
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        if (this.A03 != null) {
            this.A03.setVisibility(8);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A09() {
        this.A09.A02();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A0A() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A0B() {
        this.A01 = getToolbarListener();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A0C(float f2, int i) {
        this.A09.A03(f2, i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A0D(C1118Na c1118Na, boolean z6) {
        boolean z9 = this.A04;
        int A05 = c1118Na.A05(z9);
        this.A0A.A02(c1118Na.A0B(z9), A05);
        boolean z10 = this.A05;
        String A02 = A02(8, 9, 52);
        if (!z10) {
            if (this.A00 != null) {
                this.A00.setIconColors(A05);
                this.A00.setContentDescription(A02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(A05);
            this.A03.setContentDescription(A02);
        }
        this.A09.A04(c1118Na, z9, z6);
        if (z9) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            YB.A0V(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        YB.A0N(this, 0);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final boolean A0E() {
        return this.A09.A05();
    }

    public final void A0F(C1130Nm c1130Nm, String str, int i) {
        this.A09.setInitialUnskippableSeconds(i);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c1130Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c1130Nm, str, this.A07, this.A08);
        }
    }

    public final void A0G(C1860gi c1860gi, int i) {
        if (this.A00 != null) {
            YB.A0J(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new YZ(c1860gi, i);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
        } else {
            this.A03 = new ZC(c1860gi);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A03, layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public int getToolbarHeight() {
        return AbstractC1395Yb.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public InterfaceC1394Ya getToolbarListener() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setAdReportingVisible(boolean z6) {
        A04(!this.A05 ? this.A00 : this.A03, z6);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setCTAClickListener(ViewOnClickListenerC1058Kr viewOnClickListenerC1058Kr) {
        this.A0A.setOnClickListener(AbstractC1564bu.A03(viewOnClickListenerC1058Kr, A02(17, 7, 47)));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setFullscreen(boolean z6) {
        this.A04 = z6;
    }

    public void setOnlyPageDetails(C1130Nm c1130Nm) {
        if (c1130Nm != null) {
            this.A0A.setPageDetails(c1130Nm);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setPageDetails(C1130Nm c1130Nm, String str, int i, C1136Ns c1136Ns) {
        this.A09.setInitialUnskippableSeconds(i);
        this.A0A.setPageDetails(c1130Nm);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c1130Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c1130Nm, str, this.A07, this.A08);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setPageDetailsVisible(boolean z6) {
        this.A06.removeAllViews();
        if (z6) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z6);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgress(float f2) {
        this.A09.setProgress(f2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgressImage(YM ym) {
        this.A09.setProgressImage(ym);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgressImmediate(float f2) {
        this.A09.setProgressImmediate(f2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgressSpinnerInvisible(boolean z6) {
        this.A09.setProgressSpinnerInvisible(z6);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            YB.A0S(view, 0, -16777216, A0E);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setToolbarActionMode(int i) {
        this.A09.setToolbarActionMode(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setToolbarListener(InterfaceC1394Ya interfaceC1394Ya) {
        this.A02 = interfaceC1394Ya;
    }
}
