package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Mh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2674Mh extends C2657Lh {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        C2555Fh c2555Fh = this.f26152n;
        if (c2555Fh.f24819v.compareAndSet(false, true)) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32372t1)).booleanValue()) {
                return false;
            }
            ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
            if (viewTreeObserverOnGlobalLayoutListenerC2572Gh.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC2572Gh.getParent()).removeView(viewTreeObserverOnGlobalLayoutListenerC2572Gh);
            }
            viewTreeObserverOnGlobalLayoutListenerC2572Gh.destroy();
            M3.a aVar = new M3.a(rendererPriorityAtExit, didCrash);
            C3068d9 c3068d9 = viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25062G0;
            c3068d9.a(aVar);
            c3068d9.b(10003);
        }
        return true;
    }
}
