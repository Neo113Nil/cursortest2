package com.instagram.common.viewpoint.core;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class DB implements InterfaceC1754fK {
    public static byte[] A06;
    public ValueAnimator A00;
    public EnumC1753fJ A01 = EnumC1753fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{49, 32, 61, 49, 6, 42, 41, 42, 55};
    }

    public DB(View view, int i, int i6, int i9) {
        this.A02 = i;
        this.A05 = view;
        this.A04 = i6;
        this.A03 = i9;
    }

    private void A06(int i, int i6) {
        this.A01 = i == this.A04 ? EnumC1753fJ.A03 : EnumC1753fJ.A05;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 85), i, i6);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C1760fQ(this, i, i6));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, int i6, boolean z3) {
        if (z3) {
            A06(i, i6);
        } else {
            ((TextView) this.A05).setTextColor(i6);
            this.A01 = i6 == this.A03 ? EnumC1753fJ.A02 : EnumC1753fJ.A04;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fK
    public final void A4A(boolean z3, boolean z6) {
        int endColor = z6 ? this.A03 : this.A04;
        int startColor = z6 ? this.A04 : this.A03;
        A07(endColor, startColor, z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fK
    public final EnumC1753fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
