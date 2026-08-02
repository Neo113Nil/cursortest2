package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: assets/audience_network/classes2.dex */
public final class M3 extends AbstractC1506ay {
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static String[] A0C = {"r5lFqG0C0bBGIxytTEblkmz8pOWiln6U", "Y5tMFhpuLobi6U3v3neZGAzEpbrZh2e0", "35iZKMkwZFt7WP5rciHAZ1WswbletKXm", "1wdh7bxI31pnh6pFTaTypUqx", "X0GEkrMG66X1N8QG", "HQ8AmQiqT9dTkfwWyhZ7u2ZNdQoS7Fbv", "yjHJSxajRdLfdjSgilcNPSPFyTq4dELg", "ut8cBtSHXrZx3QiSKTpc7NoA9ie10da9"};
    public static final Set<String> A0D;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C1860gi A04;
    public C1493al A05;
    public InterfaceC1498aq A06;
    public C1501at A07;

    public static String A03(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0B = new byte[]{43, 55, 55, 51, 100, 120, 120, 124, Byte.MAX_VALUE};
    }

    static {
        A06();
        A0D = new HashSet(2);
        A09 = false;
        A0A = false;
        A0D.add(A03(0, 4, 113));
        A0D.add(A03(4, 5, 62));
    }

    public M3(C1860gi c1860gi, Activity activity, InterfaceC1498aq interfaceC1498aq) {
        super(activity, c1860gi);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A08(c1860gi, interfaceC1498aq);
    }

    public M3(C1860gi c1860gi, InterfaceC1498aq interfaceC1498aq) {
        super(c1860gi);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A08(c1860gi, interfaceC1498aq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1506ay
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C1501at A0H() {
        return new C1501at(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A05() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A07(int i, int i4, Intent intent) {
        if (A08 != null && i == 1001) {
            A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i4, intent));
            A08 = null;
        }
    }

    private void A08(C1860gi c1860gi, InterfaceC1498aq interfaceC1498aq) {
        this.A04 = c1860gi;
        this.A06 = interfaceC1498aq;
        this.A05 = new C1493al(this);
        A09 = AbstractC1311Uq.A03(this.A04);
        A0A = AbstractC1311Uq.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0G());
        this.A07 = A0H();
        setWebViewClient(this.A07);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1506ay
    public final WebChromeClient A0G() {
        return new C1500as(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0K(long j6) {
        if (this.A00 < 0) {
            this.A00 = j6;
        }
        A05();
        String[] strArr = A0C;
        if (strArr[6].charAt(18) == strArr[0].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "TnIn5PelVgDBsDwa";
        strArr2[3] = "kaGwwHcDVWZGOuagxs1W4ZQa";
    }

    public final void A0L(long j6) {
        if (this.A01 < 0) {
            this.A01 = j6;
        }
        A05();
    }

    public final void A0M(long j6) {
        if (this.A02 < 0) {
            this.A02 = j6;
        }
        A05();
        String[] strArr = A0C;
        if (strArr[5].charAt(4) == strArr[7].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[6] = "DwC46XxC2zY9iA5O924mXxlTXzY8IGhb";
        strArr2[0] = "1LscF1ZcfF08U7LpSibJFf3LFm8iDmJu";
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1506ay, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        AbstractC1512b4.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        if (copyBackForwardList.getSize() > 0) {
            return copyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(InterfaceC1499ar interfaceC1499ar) {
        this.A07.A05(new WeakReference<>(interfaceC1499ar));
    }
}
