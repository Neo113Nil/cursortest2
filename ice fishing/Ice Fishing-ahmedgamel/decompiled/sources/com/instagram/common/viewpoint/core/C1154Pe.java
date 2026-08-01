package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1154Pe extends AbstractC1375Yb {
    public static byte[] A08;
    public static String[] A09 = {"fERBvMHNNnzy3nk4ZNYWfuNmaphricqR", "36dIUinCjWD1st1oFa", "LXwDs8sQ22ml4TxQk7X9Yy2PND6TLebQ", "XXrP48rjLtmBZR3EppDVWeHK64Oiflqr", "lJVaLdSDUZo8CZ4Z9dOQvPM3HMB2ksyr", "0Ja0eNtF0Cq6bAhyEs6lkKXZN09pMEMJ", "OH638NDLRGGNEgbxKp", "sf1pLwcEB21wXoeUmJKgsuWxlp0ZYlJT"};
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final Integer A0D;
    public static final Integer A0E;
    public int A00;
    public InterfaceC1379Yf A01;
    public float A02;
    public InterfaceC1374Ya A03;
    public boolean A04;
    public final C1840gi A05;
    public final C1378Ye A06;
    public final EnumC1380Yg A07;

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{110, 65, 66, 94, 72, 13, 108, 73};
        String[] strArr = A09;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[6] = "7Gx7HJtPRSPh20N7Kw";
        strArr2[1] = "xYim5uVBO0YQkaepUH";
    }

    static {
        A07();
        A0A = XV.A0C;
        A0C = XV.A0H;
        A0B = (int) (A0C / 2.0d);
        A0D = 855638016;
        A0E = null;
    }

    public C1154Pe(C1840gi c1840gi, EnumC1380Yg enumC1380Yg, AbstractC2005jd abstractC2005jd, int i, InterfaceC1379Yf interfaceC1379Yf) {
        super(c1840gi);
        this.A00 = 0;
        this.A04 = true;
        this.A05 = c1840gi;
        this.A07 = enumC1380Yg;
        this.A01 = interfaceC1379Yf;
        A04();
        this.A06 = new C1378Ye(this.A05, abstractC2005jd, this.A07, i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        this.A06.setContentDescription(A03(0, 8, 81));
        this.A06.setOnClickListener(new ViewOnClickListenerC1377Yd(this));
        addView(this.A06, layoutParams);
        A06();
    }

    private void A04() {
        View view = new View(this.A05);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    private void A05() {
        Rect requestedMargins = getRequestedMargins();
        if (this.A01 != null && requestedMargins != null) {
            this.A01.AEZ(getToolbarHeight());
        }
    }

    private void A06() {
        if (Build.VERSION.SDK_INT >= 28) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.Yc
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return C1154Pe.this.A0F(view, windowInsets);
                }
            });
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public final void A0A() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public final void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public final void A0C(float f3, int i) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public final void A0D(C1098Na c1098Na, boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public final boolean A0E() {
        return false;
    }

    public final /* synthetic */ WindowInsets A0F(View view, WindowInsets windowInsets) {
        int cutoutInsetTop;
        DisplayCutout cutout = windowInsets.getDisplayCutout();
        if (cutout != null && (cutoutInsetTop = cutout.getSafeInsetTop()) != this.A00) {
            this.A00 = cutoutInsetTop;
            A05();
        }
        return windowInsets;
    }

    public final void A0G() {
        if (this.A03 != null && this.A04) {
            InterfaceC1374Ya interfaceC1374Ya = this.A03;
            if (A09[4].charAt(19) != 'Q') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[7] = "Nz9FTwNSu9sKseNM42ZlibQZooapJX2m";
            strArr[0] = "gMFqMi1vQ9rk8jIPSWsyy3tPRxgAiTUd";
            interfaceC1374Ya.ACl(this);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public Rect getRequestedMargins() {
        if (getResources().getConfiguration().orientation == 1) {
            int i = XV.A0u;
            int i6 = XV.A0c;
            int orientation = this.A00;
            return new Rect(i, i6 + orientation, 0, 0);
        }
        return new Rect(XV.A0u, XV.A0v, 0, 0);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public int getToolbarActionMode() {
        return this.A06.A09();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public int getToolbarHeight() {
        if (this.A07 == EnumC1380Yg.A08) {
            if (getResources().getConfiguration().orientation == 1) {
                int i = this.A00;
                int orientation = A0C;
                int i6 = i + orientation;
                int orientation2 = XV.A0c;
                return i6 + (orientation2 * 2);
            }
            int i9 = A0C;
            int orientation3 = XV.A0v;
            return i9 + (orientation3 * 2);
        }
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public InterfaceC1374Ya getToolbarListener() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A05();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A05();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setAdReportingVisible(boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setCTAClickListener(ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr) {
    }

    private void setClickable(float f3) {
        boolean z3;
        if (f3 > 0.0f) {
            boolean A19 = C1290Up.A19(this.A05);
            if (A09[4].charAt(19) != 'Q') {
                throw new RuntimeException();
            }
            A09[5] = "CynGSFEo4busEIaNEzQQTo6NoR2HzSp3";
            if (!A19) {
                z3 = false;
                this.A04 = z3;
            }
        }
        z3 = true;
        this.A04 = z3;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setFullscreen(boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setPageDetails(C1110Nm c1110Nm, String str, int i, C1116Ns c1116Ns) {
        this.A02 = i * 1000;
        setClickable(this.A02);
        this.A06.A0A(this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setPageDetailsVisible(boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setProgress(float f3) {
        float f9 = (f3 / 100.0f) * this.A02;
        float remainingMs = 0.0f;
        if (this.A02 - f9 > 0.0f) {
            float remainingMs2 = this.A02;
            remainingMs = remainingMs2 - f9;
        }
        this.A06.A0B(remainingMs);
        setClickable(remainingMs);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setProgressImmediate(float f3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setProgressSpinnerInvisible(boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setToolbarActionMode(int i) {
        this.A06.A0C(i);
        if (i == 0) {
            setProgress(100.0f);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setToolbarListener(InterfaceC1374Ya interfaceC1374Ya) {
        this.A03 = interfaceC1374Ya;
    }
}
