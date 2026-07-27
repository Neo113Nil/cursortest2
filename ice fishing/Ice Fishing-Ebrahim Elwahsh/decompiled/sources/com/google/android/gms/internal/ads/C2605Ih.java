package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Ih, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2605Ih extends C2588Hh {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        C2486Bh c2486Bh = this.f25405n;
        if (c2486Bh.f24061v.compareAndSet(false, true)) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31789t1)).booleanValue()) {
                return false;
            }
            ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
            if (viewTreeObserverOnGlobalLayoutListenerC2520Dh.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC2520Dh.getParent()).removeView(viewTreeObserverOnGlobalLayoutListenerC2520Dh);
            }
            viewTreeObserverOnGlobalLayoutListenerC2520Dh.destroy();
            I3.a aVar = new I3.a(rendererPriorityAtExit, didCrash);
            C2914a9 c2914a9 = viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24473G0;
            c2914a9.a(aVar);
            c2914a9.b(10003);
        }
        return true;
    }
}
