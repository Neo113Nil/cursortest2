package com.instagram.common.viewpoint.core;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class DB implements InterfaceC1753fK {
    public static byte[] A06;
    public ValueAnimator A00;
    public EnumC1752fJ A01 = EnumC1752fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{49, 32, 61, 49, 6, 42, 41, 42, 55};
    }

    public DB(View view, int i, int i4, int i9) {
        this.A02 = i;
        this.A05 = view;
        this.A04 = i4;
        this.A03 = i9;
    }

    private void A06(int i, int i4) {
        this.A01 = i == this.A04 ? EnumC1752fJ.A03 : EnumC1752fJ.A05;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 85), i, i4);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C1759fQ(this, i, i4));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, int i4, boolean z8) {
        if (z8) {
            A06(i, i4);
        } else {
            ((TextView) this.A05).setTextColor(i4);
            this.A01 = i4 == this.A03 ? EnumC1752fJ.A02 : EnumC1752fJ.A04;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1753fK
    public final void A4A(boolean z8, boolean z9) {
        int endColor = z9 ? this.A03 : this.A04;
        int startColor = z9 ? this.A04 : this.A03;
        A07(endColor, startColor, z8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1753fK
    public final EnumC1752fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1753fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
