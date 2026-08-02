package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Mh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2694Mh extends C2677Lh {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        C2575Fh c2575Fh = this.f26950n;
        if (c2575Fh.f25608v.compareAndSet(false, true)) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33151t1)).booleanValue()) {
                return false;
            }
            ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
            if (viewTreeObserverOnGlobalLayoutListenerC2592Gh.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC2592Gh.getParent()).removeView(viewTreeObserverOnGlobalLayoutListenerC2592Gh);
            }
            viewTreeObserverOnGlobalLayoutListenerC2592Gh.destroy();
            O3.a aVar = new O3.a(rendererPriorityAtExit, didCrash);
            C3091d9 c3091d9 = viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25841B0;
            c3091d9.a(aVar);
            c3091d9.b(10003);
        }
        return true;
    }
}
