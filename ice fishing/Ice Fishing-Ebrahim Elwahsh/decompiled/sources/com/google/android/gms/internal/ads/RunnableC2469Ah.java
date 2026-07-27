package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Ah, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2469Ah implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23882n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2520Dh f23883u;

    public /* synthetic */ RunnableC2469Ah(ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh, int i) {
        this.f23882n = i;
        this.f23883u = viewTreeObserverOnGlobalLayoutListenerC2520Dh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23882n) {
            case 0:
                this.f23883u.destroy();
                break;
            case 1:
                this.f23883u.destroy();
                break;
            case 2:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                this.f23883u.D();
                break;
        }
    }

    public RunnableC2469Ah(ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh) {
        this.f23882n = 2;
        Objects.requireNonNull(viewTreeObserverOnGlobalLayoutListenerC2520Dh);
        this.f23883u = viewTreeObserverOnGlobalLayoutListenerC2520Dh;
    }
}
