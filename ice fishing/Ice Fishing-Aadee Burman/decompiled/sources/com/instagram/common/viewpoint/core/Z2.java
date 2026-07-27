package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.s.a.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C2010ji A01;
    public final AbstractC2005jd A02;
    public final C1840gi A03;
    public final VA A04;
    public final VI A05;
    public final Y2 A06;
    public final C1146Ow A07;
    public final AbstractC1140Oq A08;
    public final AbstractC1784fo A09;
    public final C1785fp A0A;
    public final String A0B;
    public final WeakReference<Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public Z2(C1840gi c1840gi, VA va, C1246Sx c1246Sx, WeakReference<Z1> weakReference, int i, int i6, int i9, int i10, C2010ji c2010ji, String str) {
        super(c1840gi);
        this.A06 = new Y2();
        this.A03 = c1840gi;
        this.A04 = va;
        this.A01 = c2010ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC2005jd A0F2 = this.A01.A0F();
        if (A0F2 == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        YB.A0N(this, -1);
        this.A05 = new VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i, i10, i6, i9);
        LinearLayout linearLayout = new LinearLayout(c1840gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c1246Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(A0F2);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            byte b9 = (byte) ((copyOfRange[i10] - i9) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            copyOfRange[i10] = b9;
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, c.f16317b, 62, -1, 55, 50, 52, 54, 51, c.f16317b, c.f16317b, 60, -1, 50, 53, 68, -1, 51, 50, c.f16318c, c.f16318c, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (XX.A02 * 40.0f);
    }

    private C1146Ow A02(AbstractC2005jd abstractC2005jd) {
        C1098Na A00;
        NR A29 = abstractC2005jd.A29();
        PW pw = new PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i, int i6, int i9) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
                int i10 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i10 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 4);
                    i10++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC1381Yh
            public final void A4j(String str) {
                String str2;
                C1840gi c1840gi;
                StringBuilder append = new StringBuilder().append(str).append(A00(0, 1, 92));
                str2 = Z2.this.A0B;
                Intent intent = new Intent(append.append(str2).toString());
                c1840gi = Z2.this.A03;
                P2.A00(c1840gi).A07(intent);
            }
        };
        if (getOrientation() == 1) {
            A00 = abstractC2005jd.A28().A01();
        } else {
            NN A28 = abstractC2005jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            A00 = A28.A00();
        }
        C1146Ow c1146Ow = new C1146Ow(this.A03, A0F, A00, A29.A0J().A06(), A09(32, 31, 110), this.A04, pw, this.A0A, this.A06, abstractC2005jd.A2A());
        c1146Ow.setInfo(A29.A0I(), A29.A0J(), this.A01.A7O(), abstractC2005jd.A2C().A01(), null, null);
        if (C1290Up.A1N(this.A03)) {
            c1146Ow.A0k();
        }
        return c1146Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC1140Oq A04(C1246Sx c1246Sx) {
        final ViewOnClickListenerC1399Yz viewOnClickListenerC1399Yz = new ViewOnClickListenerC1399Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c1246Sx, this.A01) && videoUrl != null) {
            C06846g videoView = new C06846g(this.A03, this.A04, c1246Sx, this.A05, viewOnClickListenerC1399Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C1290Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C1302Vb A0H = this.A01.A0H();
        if (A0H == null) {
            return null;
        }
        final C1840gi c1840gi = this.A03;
        final VI vi = this.A05;
        final AbstractC2005jd abstractC2005jd = this.A02;
        C06946q A0I = new AbstractC1140Oq(c1840gi, viewOnClickListenerC1399Yz, vi, abstractC2005jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C1493b5 A00;

            {
                super(c1840gi, viewOnClickListenerC1399Yz, vi, abstractC2005jd);
                this.A00 = new C1493b5(c1840gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1140Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1140Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC1140Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C06946q A0I(String str) {
                new LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C1141Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1140Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(A0H.getUrl());
        if (C1290Up.A1P(this.A03)) {
            setViewAsCTA(A0I);
        }
        return A0I;
    }

    private C1125Ob A06() {
        return new C1125Ob(this);
    }

    private C1785fp A07(int i, int i6, int i9, int i10) {
        C1785fp c1785fp = new C1785fp(this, i, i6, true, new WeakReference(this.A09), this.A03);
        c1785fp.A0W(i9);
        c1785fp.A0X(i10);
        return c1785fp;
    }

    private void A0C() {
        String A0M = this.A01.A0M();
        if (!TextUtils.isEmpty(A0M)) {
            X6 x62 = new X6();
            C1840gi c1840gi = this.A03;
            Uri A00 = XB.A00(A0M);
            String adChoicesLinkUrl = this.A01.A7O();
            X6.A0O(x62, c1840gi, A00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(VH.A0A, null);
        if (!AbstractC1131Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC1403Zd A01 = AbstractC1404Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (A01 == null) {
            A0C();
            return;
        }
        YB.A0W(this);
        addView(A01, new FrameLayout.LayoutParams(-1, -1));
        A01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C1246Sx c1246Sx, C2010ji c2010ji) {
        String A0e = c2010ji.A0e();
        if (TextUtils.isEmpty(A0e)) {
            return false;
        }
        String videoUrl = c1246Sx.A0T(A0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC1140Oq abstractC1140Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC1140Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C1785fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new Z0(this));
    }
}
