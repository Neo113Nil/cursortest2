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
    public final C2030ji A01;
    public final AbstractC2025jd A02;
    public final C1860gi A03;
    public final VA A04;
    public final VI A05;
    public final Y2 A06;
    public final C1166Ow A07;
    public final AbstractC1160Oq A08;
    public final AbstractC1804fo A09;
    public final C1805fp A0A;
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
    public Z2(C1860gi c1860gi, VA va, C1266Sx c1266Sx, WeakReference<Z1> weakReference, int i, int i4, int i6, int i9, C2030ji c2030ji, String str) {
        super(c1860gi);
        this.A06 = new Y2();
        this.A03 = c1860gi;
        this.A04 = va;
        this.A01 = c2030ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC2025jd A0F2 = this.A01.A0F();
        if (A0F2 == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        YB.A0N(this, -1);
        this.A05 = new VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i, i9, i4, i6);
        LinearLayout linearLayout = new LinearLayout(c1860gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c1266Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(A0F2);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            byte b9 = (byte) ((copyOfRange[i9] - i6) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            copyOfRange[i9] = b9;
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, c.f17104b, 62, -1, 55, 50, 52, 54, 51, c.f17104b, c.f17104b, 60, -1, 50, 53, 68, -1, 51, 50, c.f17105c, c.f17105c, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (XX.A02 * 40.0f);
    }

    private C1166Ow A02(AbstractC2025jd abstractC2025jd) {
        C1118Na A00;
        NR A29 = abstractC2025jd.A29();
        PW pw = new PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i, int i4, int i6) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
                int i9 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i9 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 4);
                    i9++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC1401Yh
            public final void A4j(String str) {
                String str2;
                C1860gi c1860gi;
                StringBuilder append = new StringBuilder().append(str).append(A00(0, 1, 92));
                str2 = Z2.this.A0B;
                Intent intent = new Intent(append.append(str2).toString());
                c1860gi = Z2.this.A03;
                P2.A00(c1860gi).A07(intent);
            }
        };
        if (getOrientation() == 1) {
            A00 = abstractC2025jd.A28().A01();
        } else {
            NN A28 = abstractC2025jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            A00 = A28.A00();
        }
        C1166Ow c1166Ow = new C1166Ow(this.A03, A0F, A00, A29.A0J().A06(), A09(32, 31, 110), this.A04, pw, this.A0A, this.A06, abstractC2025jd.A2A());
        c1166Ow.setInfo(A29.A0I(), A29.A0J(), this.A01.A7O(), abstractC2025jd.A2C().A01(), null, null);
        if (C1310Up.A1N(this.A03)) {
            c1166Ow.A0k();
        }
        return c1166Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC1160Oq A04(C1266Sx c1266Sx) {
        final ViewOnClickListenerC1419Yz viewOnClickListenerC1419Yz = new ViewOnClickListenerC1419Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c1266Sx, this.A01) && videoUrl != null) {
            C07046g videoView = new C07046g(this.A03, this.A04, c1266Sx, this.A05, viewOnClickListenerC1419Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C1310Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C1322Vb A0H = this.A01.A0H();
        if (A0H == null) {
            return null;
        }
        final C1860gi c1860gi = this.A03;
        final VI vi = this.A05;
        final AbstractC2025jd abstractC2025jd = this.A02;
        C07146q A0I = new AbstractC1160Oq(c1860gi, viewOnClickListenerC1419Yz, vi, abstractC2025jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C1513b5 A00;

            {
                super(c1860gi, viewOnClickListenerC1419Yz, vi, abstractC2025jd);
                this.A00 = new C1513b5(c1860gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1160Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1160Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC1160Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C07146q A0I(String str) {
                new LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C1161Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1160Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(A0H.getUrl());
        if (C1310Up.A1P(this.A03)) {
            setViewAsCTA(A0I);
        }
        return A0I;
    }

    private C1145Ob A06() {
        return new C1145Ob(this);
    }

    private C1805fp A07(int i, int i4, int i6, int i9) {
        C1805fp c1805fp = new C1805fp(this, i, i4, true, new WeakReference(this.A09), this.A03);
        c1805fp.A0W(i6);
        c1805fp.A0X(i9);
        return c1805fp;
    }

    private void A0C() {
        String A0M = this.A01.A0M();
        if (!TextUtils.isEmpty(A0M)) {
            X6 x62 = new X6();
            C1860gi c1860gi = this.A03;
            Uri A00 = XB.A00(A0M);
            String adChoicesLinkUrl = this.A01.A7O();
            X6.A0O(x62, c1860gi, A00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(VH.A0A, null);
        if (!AbstractC1151Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC1423Zd A01 = AbstractC1424Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
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

    public static boolean A0H(C1266Sx c1266Sx, C2030ji c2030ji) {
        String A0e = c2030ji.A0e();
        if (TextUtils.isEmpty(A0e)) {
            return false;
        }
        String videoUrl = c1266Sx.A0T(A0e);
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
            AbstractC1160Oq abstractC1160Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC1160Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C1805fp getViewabilityChecker() {
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
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new Z0(this));
    }
}
