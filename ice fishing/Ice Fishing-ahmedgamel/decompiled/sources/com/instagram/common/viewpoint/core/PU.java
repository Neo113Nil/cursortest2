package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC1395Yb {
    public static byte[] A03;
    public C1860gi A00;
    public InterfaceC1394Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public PU(C1860gi c1860gi, AbstractC2025jd abstractC2025jd, int i) {
        super(c1860gi);
        this.A00 = c1860gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC2025jd, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC1411Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A0A() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A0C(float f2, int i) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final void A0D(C1118Na c1118Na, boolean z6) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public int getToolbarHeight() {
        return AbstractC1395Yb.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public InterfaceC1394Ya getToolbarListener() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setAdReportingVisible(boolean z6) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setCTAClickListener(ViewOnClickListenerC1058Kr viewOnClickListenerC1058Kr) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setFullscreen(boolean z6) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setPageDetails(C1130Nm c1130Nm, String str, int i, C1136Ns c1136Ns) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setPageDetailsVisible(boolean z6) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgress(float f2) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgressImmediate(float f2) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setProgressSpinnerInvisible(boolean z6) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1395Yb
    public void setToolbarListener(InterfaceC1394Ya interfaceC1394Ya) {
        this.A01 = interfaceC1394Ya;
    }
}
