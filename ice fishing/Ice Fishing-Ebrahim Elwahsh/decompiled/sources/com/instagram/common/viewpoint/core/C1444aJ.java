package com.instagram.common.viewpoint.core;

import android.animation.LayoutTransition;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.aJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1444aJ extends LinearLayout {
    public static String[] A0I = {"Jjhv1QqAIW86EmEZitDWSXUy5KAygWmD", "Knznf5NxnzMSGuCyCavmDPpLrbg6IGSX", "ILZruYKannRuDYsFiZYXNynBpyms", "eZKheB7115JCtr5xxUXw9oXkLPe4M5DC", "o2TLnhgUMatQJZ63WkSJRDhfBnbI", "vZrVQG4SvGUnBHUUGdfxrKmAlJmFc80m", "RT8BtEaKHOdmDtB2bzxk3zMCIxucDNYE", "yGiX4fEKWzcCLDIcRuEbwAcVWGPLZUB"};
    public ImageView A00;
    public ImageView A01;
    public InterfaceC1445aK A02;
    public Runnable A03;
    public boolean A04;
    public final int A05;
    public final Bitmap A06;
    public final Bitmap A07;
    public final Bitmap A08;
    public final Bitmap A09;
    public final Bitmap A0A;
    public final Bitmap A0B;
    public final AbstractC2004jd A0C;
    public final C1839gi A0D;
    public final VI A0E;
    public final InterfaceC1380Yh A0F;
    public final EnumC1447aM A0G;
    public final EnumC1450aP A0H;

    public C1444aJ(C1839gi c1839gi, boolean z8, AbstractC2004jd abstractC2004jd, VI vi, InterfaceC1380Yh interfaceC1380Yh, EnumC1447aM enumC1447aM, InterfaceC1445aK interfaceC1445aK, EnumC1450aP enumC1450aP) {
        this(c1839gi, z8, abstractC2004jd, vi, interfaceC1380Yh, enumC1447aM, enumC1450aP);
        this.A02 = interfaceC1445aK;
    }

    public C1444aJ(C1839gi c1839gi, boolean z8, AbstractC2004jd abstractC2004jd, VI vi, InterfaceC1380Yh interfaceC1380Yh, EnumC1447aM enumC1447aM, EnumC1450aP enumC1450aP) {
        super(c1839gi);
        this.A07 = YN.A01(YM.CREDIT_LINE_INFO_ICON);
        this.A06 = YN.A01(YM.CREDIT_LINE_DETAIL_ICON);
        this.A04 = false;
        this.A08 = YN.A01(YM.AD_CHOICE_ICON);
        this.A09 = YN.A01(YM.AD_CHOICE_TEXT);
        this.A0A = YN.A01(YM.AD_CREDIT_LINE_COLLAPSE_TEXT);
        this.A0B = YN.A01(YM.CREDIT_LINE_TEXT);
        this.A05 = abstractC2004jd.A27();
        this.A0E = vi;
        this.A0F = interfaceC1380Yh;
        this.A0G = enumC1447aM;
        this.A0D = c1839gi;
        this.A0C = abstractC2004jd;
        this.A0H = enumC1450aP;
        A05();
        A0K(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        YB.A0M(this.A00, 1.0f, 0.0f, 100);
        A0E(3, 300, new InterfaceC1431a6() { // from class: com.facebook.ads.redexgen.X.MA
            @Override // com.instagram.common.viewpoint.core.InterfaceC1431a6
            public final void AK7(Object obj, long j9) {
                C1444aJ.this.A0U(obj, j9);
            }
        }, new C1440aF(this));
        postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.aA
            @Override // java.lang.Runnable
            public final void run() {
                C1444aJ.this.A0R();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        A0E(2, 300, new InterfaceC1431a6() { // from class: com.facebook.ads.redexgen.X.MB
            @Override // com.instagram.common.viewpoint.core.InterfaceC1431a6
            public final void AK7(Object obj, long j9) {
                C1444aJ.this.A0V(obj, j9);
            }
        }, new C1438aD(this));
        YB.A0M(this.A00, 0.0f, 1.0f, 0);
        YB.A0O(this.A00, 0);
    }

    private void A04() {
        if (this.A04 && this.A03 != null) {
            A06();
            A02();
        }
    }

    private void A05() {
        switch (this.A0H) {
            case A03:
                AbstractC1446aL.A02(this.A0D, this.A0G);
                break;
            case A02:
                AbstractC1446aL.A01(this.A0D, this.A0G);
                break;
        }
    }

    private void A06() {
        if (this.A04 && this.A03 != null) {
            removeCallbacks(this.A03);
            this.A03 = null;
        }
        String[] strArr = A0I;
        if (strArr[4].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A0I[6] = "PZwK6paCNaN1NNUi7D9zVsXgJs4CpRYo";
        this.A04 = false;
    }

    private void A07() {
        switch (this.A0H) {
            case A02:
                YB.A0N(this, -859190839);
                return;
            default:
                if (A0I[7].length() == 20) {
                    throw new RuntimeException();
                }
                A0I[6] = "J4Bl2paDruPebaLnqzXafrD0wXfUXyp3";
                YB.A0N(this, -870569165);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        switch (this.A0H) {
            case A02:
                ImageView imageView = this.A01;
                int i = XV.A0S;
                if (A0I[7].length() != 20) {
                    String[] strArr = A0I;
                    strArr[4] = "IwvL04OrKqzmIeLShS8Q4SIdnVqi";
                    strArr[2] = "Ml3LYYHXQPQgDXepFoLqaPfqy73Y";
                    imageView.setPadding(i, XV.A00, XV.A0A, XV.A00);
                    return;
                }
                throw new RuntimeException();
            case A04:
                this.A01.setPadding(XV.A0S, XV.A00, XV.A0S, XV.A00);
                this.A01.setVisibility(8);
                return;
            default:
                this.A01.setPadding(XV.A0I, XV.A00, XV.A0A, XV.A00);
                return;
        }
    }

    private void A09() {
        switch (this.A0H) {
            case A02:
                A0F(this.A00, this.A09, XV.A00, XV.A01, XV.A0S, XV.A01, XV.A0U);
                break;
            case A04:
                A0F(this.A00, this.A0B, XV.A02, XV.A00, XV.A02, XV.A00, -2);
                break;
            default:
                A0F(this.A00, this.A06, XV.A00, XV.A0A, XV.A0S, XV.A0A, -2);
                break;
        }
    }

    private void A0A() {
        switch (this.A0H) {
            case A02:
                A0F(this.A01, this.A08, XV.A0I, XV.A00, XV.A0I, XV.A00, XV.A0U);
                return;
            case A04:
                ImageView imageView = this.A01;
                Bitmap bitmap = this.A0A;
                int i = XV.A0S;
                int i4 = XV.A00;
                int i9 = XV.A0S;
                int i10 = XV.A00;
                String[] strArr = A0I;
                if (strArr[4].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[0] = "BqxrFQJIBIExT1rCMndHo1bmHb8U1dtr";
                strArr2[3] = "4mbJeCFNsEoBSiTcA819Z9qBG38wKlHe";
                A0F(imageView, bitmap, i, i4, i9, i10, -2);
                return;
            default:
                A0F(this.A01, this.A07, XV.A0I, XV.A00, XV.A0I, XV.A00, -2);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A03 = new Runnable() { // from class: com.facebook.ads.redexgen.X.a9
            @Override // java.lang.Runnable
            public final void run() {
                C1444aJ.this.A02();
            }
        };
        postDelayed(this.A03, this.A05);
    }

    private void A0C() {
        this.A04 = true;
        YB.A0O(this.A00, 0);
        A0B();
    }

    private final void A0D() {
        YB.A0O(this.A00, 8);
        YB.A0O(this.A01, 0);
        if (this.A0H == EnumC1450aP.A04) {
            this.A01.setPadding(XV.A0S, XV.A00, XV.A0S, XV.A00);
        } else {
            this.A01.setPadding(XV.A0I, XV.A00, XV.A0I, XV.A00);
        }
    }

    private void A0E(int i, int i4, InterfaceC1431a6 interfaceC1431a6, LayoutTransition.TransitionListener transitionListener) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimator(i, new C1442aH(this, i4, interfaceC1431a6));
        layoutTransition.addTransitionListener(transitionListener);
        setLayoutTransition(layoutTransition);
    }

    private void A0F(ImageView imageView, Bitmap bitmap, int i, int i4, int i9, int i10, int i11) {
        YB.A0K(imageView);
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i11);
        imageView.setPadding(i, i4, i9, i10);
        imageView.setLayoutParams(layoutParams);
    }

    private void A0K(boolean z8) {
        setOrientation(0);
        setPadding(XV.A00, XV.A0I, XV.A00, XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        A07();
        setCornerRadius(XV.A0C);
        this.A01 = new ImageView(getContext());
        A0A();
        addView(this.A01);
        if (this.A0H == EnumC1450aP.A04) {
            this.A01.setVisibility(8);
        }
        this.A00 = new ImageView(getContext());
        A09();
        addView(this.A00);
        A0L(z8);
        setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.a8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1444aJ.this.A0T(view);
            }
        });
    }

    private void A0L(boolean z8) {
        if (z8 && (this.A0H == EnumC1450aP.A03 || this.A0H == EnumC1450aP.A04)) {
            A0C();
        } else {
            YB.A0O(this.A00, 8);
            YB.A0O(this.A01, 0);
        }
    }

    public final void A0O() {
        A06();
    }

    public final void A0P() {
        A06();
        A0D();
    }

    public final void A0Q() {
        this.A04 = true;
        post(new Runnable() { // from class: com.facebook.ads.redexgen.X.aB
            @Override // java.lang.Runnable
            public final void run() {
                C1444aJ.this.A0S();
            }
        });
    }

    public final /* synthetic */ void A0R() {
        YB.A0O(this.A00, 8);
    }

    public final /* synthetic */ void A0S() {
        postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.a7
            @Override // java.lang.Runnable
            public final void run() {
                C1444aJ.this.A03();
            }
        }, 300L);
    }

    public final /* synthetic */ void A0T(View view) {
        if (this.A04) {
            if (this.A0H == EnumC1450aP.A04) {
                return;
            }
            A04();
            if (this.A02 != null) {
                this.A02.ADW(view);
                return;
            } else {
                AbstractC1446aL.A07(this.A0E, this.A0D, this.A0F, this.A0C, this.A0G);
                return;
            }
        }
        A0Q();
    }

    public final /* synthetic */ void A0U(Object obj, long j9) {
        ((View) obj).animate().translationX(getWidth()).setDuration(j9).setInterpolator(new X7(1.5f)).setListener(new C1441aG(this)).start();
    }

    public final /* synthetic */ void A0V(Object obj, long j9) {
        View view = (View) obj;
        view.setTranslationX(getWidth());
        view.animate().translationX(0.0f).setDuration(j9).setListener(new C1439aE(this)).setInterpolator(new X8(1.5f)).start();
    }

    private void setCornerRadius(float f6) {
        setOutlineProvider(new C1437aC(this, f6));
        setClipToOutline(true);
    }
}
