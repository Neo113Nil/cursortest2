package com.instagram.common.viewpoint.core;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1516bT extends RelativeLayout {
    public static byte[] A0E;
    public static String[] A0F = {"ZXfERob4xoBH3IcU8XCjlL1hD69lrIyA", "mQeX6yhTUvQ4pK8ACBM6nUVZWHaQDR", "t18Mgh0fo46erZhvjKlVSbwf5heaPhmM", "S6rERx5ctFRQ2KVL", "3Fwf", "FlQfbFZAJ1ylax3KsERNgz88EmHf", "VMbmryNa1vDSool6GPHICtScLmJABdX", "KdX0dASRYEcEQR8bSkkNlsR1046Pig"};
    public static final int A0G;
    public AnimatorSet A00;
    public AnimatorSet A01;
    public AnimatorSet A02;
    public LinearLayout A03;
    public C1473am A04;
    public M3 A05;
    public final int A06;
    public final int A07;
    public final View A08;
    public final AbstractC1091Mt A09;
    public final C1141Os A0A;
    public final C1839gi A0B;
    public final InterfaceC1380Yh A0C;
    public final ViewOnClickListenerC1037Kr A0D;

    public static String A06(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{77};
    }

    static {
        A08();
        A0G = XV.A02;
    }

    public C1516bT(C1839gi c1839gi, InterfaceC1380Yh interfaceC1380Yh, int i, AbstractC1091Mt abstractC1091Mt, ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr, View view) {
        super(c1839gi);
        this.A0B = c1839gi;
        this.A0C = interfaceC1380Yh;
        this.A09 = abstractC1091Mt;
        this.A0D = viewOnClickListenerC1037Kr;
        this.A08 = view;
        if (getResources().getConfiguration().orientation == 1) {
            this.A02 = new AnimatorSet();
            this.A01 = new AnimatorSet();
            this.A00 = new AnimatorSet();
        }
        int i4 = (int) (i * XX.A02);
        this.A07 = i4;
        this.A06 = i4 - A0G;
        this.A0A = A02();
    }

    private LinearLayout A00() {
        M3 m32;
        this.A03 = new LinearLayout(this.A0B);
        this.A03.setOrientation(1);
        this.A03.addView(A01());
        C1039Kt c1039Kt = new C1039Kt(this);
        if (AbstractC1290Uq.A02(this.A0B) || this.A0B.A0E() == null) {
            m32 = new M3(this.A0B, c1039Kt);
        } else {
            m32 = new M3(this.A0B, this.A0B.A0E(), c1039Kt);
        }
        this.A05 = m32;
        this.A03.addView(this.A05, new LinearLayout.LayoutParams(-1, -1));
        this.A05.loadUrl(((AnonymousClass85) this.A09).A0M().toString());
        return this.A03;
    }

    private LinearLayout A01() {
        this.A04 = new C1473am(this.A0B);
        this.A04.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(XV.A0G, 0, XV.A0G, 0);
        this.A04.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(this.A0B);
        linearLayout.addView(this.A04);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(XV.A0U, XV.A0U, XV.A0U, XV.A0U);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }

    private C1141Os A02() {
        C1141Os c1141Os = new C1141Os(this.A0B);
        c1141Os.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        c1141Os.setRadius(40.0f);
        c1141Os.addView(A00());
        c1141Os.setTranslationY(getResources().getDisplayMetrics().heightPixels);
        View view = new View(this.A0B);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(0);
        view.setOnClickListener(new ViewOnClickListenerC1515bS(this));
        c1141Os.addView(view);
        return c1141Os;
    }

    private void A07() {
        if (this.A02 != null) {
            this.A02.cancel();
            this.A02 = null;
        }
        if (this.A01 != null) {
            this.A01.cancel();
            this.A01 = null;
        }
        if (this.A00 != null) {
            this.A00.cancel();
            this.A00 = null;
        }
    }

    private final void A09() {
        this.A08.setTranslationY(0.0f);
    }

    public final void A0A() {
        int i = getResources().getDisplayMetrics().heightPixels;
        C1141Os c1141Os = this.A0A;
        int screenHeight = this.A07;
        String A06 = A06(0, 1, 105);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1141Os, A06, i - screenHeight);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A08, A06, -this.A07);
        ofFloat2.setDuration(300L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A0A, A06, i - this.A06);
        ofFloat3.setDuration(300L);
        ObjectAnimator adDetailsViewDown = ObjectAnimator.ofFloat(this.A08, A06, -this.A06);
        adDetailsViewDown.setDuration(300L);
        if (this.A02 != null && this.A01 != null && this.A00 != null) {
            this.A02.setInterpolator(new AccelerateDecelerateInterpolator());
            this.A02.playTogether(ofFloat, ofFloat2);
            this.A01.playTogether(ofFloat3, adDetailsViewDown);
            this.A00.playSequentially(this.A02, this.A01);
            this.A00.start();
        }
    }

    public final void A0B() {
        A07();
        this.A05.destroy();
        this.A0A.setVisibility(8);
        A09();
    }

    public final void A0C() {
        if (this.A02 != null) {
            this.A02.pause();
        }
        if (this.A01 != null) {
            this.A01.pause();
        }
        if (this.A00 != null) {
            this.A00.pause();
        }
    }

    public final void A0D(int i) {
        if (i == 2) {
            this.A0A.setVisibility(8);
            this.A08.setTranslationY(0.0f);
            if (A0F[2].charAt(16) != 'j') {
                throw new RuntimeException();
            }
            A0F[3] = "0Dd01EimJB8SQQk0dQvdznLslJ";
            A07();
            A09();
            return;
        }
        if (i == 1) {
            int i4 = getResources().getDisplayMetrics().heightPixels;
            this.A0A.setVisibility(0);
            C1141Os c1141Os = this.A0A;
            int screenHeight = this.A06;
            c1141Os.setTranslationY(i4 - screenHeight);
            View view = this.A08;
            int screenHeight2 = this.A06;
            view.setTranslationY(-screenHeight2);
        }
    }

    public C1141Os getBrowserPeekView() {
        return this.A0A;
    }
}
