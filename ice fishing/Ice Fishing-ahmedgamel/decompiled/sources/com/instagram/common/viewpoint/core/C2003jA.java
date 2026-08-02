package com.instagram.common.viewpoint.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2003jA implements InterfaceC1258Sp {
    public final C1132No A00;
    public final O3 A01;
    public final C1266Sx A02;
    public final C1860gi A03;
    public final boolean A04;

    public C2003jA(C1860gi c1860gi, O3 o32, C1266Sx c1266Sx, C1132No c1132No, boolean z6) {
        this.A03 = c1860gi;
        this.A01 = o32;
        this.A02 = c1266Sx;
        this.A00 = c1132No;
        this.A04 = z6;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        O4 playableWebViewClient = new O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z6) {
        if (this.A00.A0G() == EnumC1133Np.A05) {
            A00();
            return;
        }
        String A0L = this.A00.A0L();
        if (z6) {
            C1266Sx c1266Sx = this.A02;
            String markupUrlResult = this.A00.A0L();
            A0L = c1266Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(A0L);
        this.A01.AFG();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1258Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1258Sp
    public final void ADT() {
        A01(true);
    }
}
