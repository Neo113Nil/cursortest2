package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1166Ow extends AbstractC1523bF {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (XX.A02 * 36.0f);
    public static final int A05 = (int) (XX.A02 * 4.0f);
    public static final int A03 = (int) (XX.A02 * 8.0f);
    public static final int A04 = (int) (XX.A02 * 4.0f);

    public C1166Ow(C1860gi c1860gi, int i, C1118Na c1118Na, boolean z6, String str, VA va, InterfaceC1401Yh interfaceC1401Yh, C1805fp c1805fp, Y2 y22, C1124Ng c1124Ng) {
        super(c1860gi, null, i, c1118Na, z6, str, va, interfaceC1401Yh, c1805fp, y22, c1124Ng, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC1523bF.A0B);
        linearLayout.addView(this.A00, AbstractC1523bF.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i, int i4, boolean z6) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        YB.A0a(textView, z6, i4);
        return textView;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1523bF
    public final void A0k() {
        super.A0k();
        setOnClickListener(this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1523bF
    public final void A0l(int i) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1523bF
    public void setInfo(NY ny, C1120Nc c1120Nc, String str, String str2, InterfaceC1375Xh interfaceC1375Xh, InterfaceC1538bU interfaceC1538bU) {
        super.setInfo(ny, c1120Nc, str, str2, interfaceC1375Xh, interfaceC1538bU);
        this.A01.setText(ny.A0G());
        this.A00.setText(ny.A0F());
        if (TextUtils.isEmpty(c1120Nc.A04())) {
            YB.A0H(this.A08);
        }
    }
}
