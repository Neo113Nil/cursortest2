package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.e8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1681e8 extends FrameLayout {
    public static final int A08 = XV.A0b;
    public C06826e A00;
    public C0887Eu A01;
    public C4L A02;
    public C0846Df A03;
    public C3S A04;
    public AnonymousClass34 A05;
    public final C1840gi A06;
    public final VI A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(VA va, String str, Map<String, String> map) {
        A02();
        this.A02 = new C4L(this.A06, va, this.A00, str, null, map);
        if (C1290Up.A20(this.A06)) {
            this.A01 = new C0887Eu(this.A06, va, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C1681e8(C1840gi c1840gi, VI vi) {
        super(c1840gi);
        this.A07 = vi;
        this.A06 = c1840gi;
        setUpView(c1840gi);
    }

    public final void A01() {
        A0i(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(UN un) {
        getEventBus().A05(un);
    }

    public final void A05(EnumC1727et enumC1727et) {
        A0e(enumC1727et, 13);
    }

    public final boolean A06() {
        return A0p();
    }

    public C0877Ek getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1840gi c1840gi) {
        A0Y();
        this.A04 = new C3S(c1840gi);
        A0f(this.A04);
        this.A03 = new C0846Df(c1840gi, this.A07);
        A0f(new C06163q(c1840gi));
        A0f(this.A03);
        this.A05 = new AnonymousClass34(c1840gi, true, this.A07);
        A0f(this.A05);
        A0f(new C0848Dh(this.A05, EnumC1743f9.A02, true, true));
        if (!A0k()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6e] */
    private void setUpVideo(final C1840gi c1840gi) {
        this.A00 = new C0877Ek(c1840gi) { // from class: com.facebook.ads.redexgen.X.6e
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i, int i6) {
                int newWidthSpec = View.MeasureSpec.getMode(i);
                if (newWidthSpec == 1073741824) {
                    i6 = i;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i6);
                    if (newWidthSpec2 == 1073741824) {
                        i = i6;
                    }
                }
                super.onMeasure(i, i6);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        YB.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC1680e7(this));
    }

    private void setUpView(C1840gi c1840gi) {
        setUpVideo(c1840gi);
        setUpPlugins(c1840gi);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f3) {
        setVolume(f3);
        this.A03.A09();
    }
}
