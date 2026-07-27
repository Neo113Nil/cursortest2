package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC1375Yb {
    public static byte[] A03;
    public C1840gi A00;
    public InterfaceC1374Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public PU(C1840gi c1840gi, AbstractC2005jd abstractC2005jd, int i) {
        super(c1840gi);
        this.A00 = c1840gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC2005jd, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC1391Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
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

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public int getToolbarHeight() {
        return AbstractC1375Yb.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public InterfaceC1374Ya getToolbarListener() {
        return null;
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

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setFullscreen(boolean z3) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setPageDetails(C1110Nm c1110Nm, String str, int i, C1116Ns c1116Ns) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setPageDetailsVisible(boolean z3) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setProgress(float f3) {
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
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1375Yb
    public void setToolbarListener(InterfaceC1374Ya interfaceC1374Ya) {
        this.A01 = interfaceC1374Ya;
    }
}
