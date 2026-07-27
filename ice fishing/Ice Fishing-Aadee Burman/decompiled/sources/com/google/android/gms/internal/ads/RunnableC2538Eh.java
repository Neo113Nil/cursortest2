package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Eh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2538Eh implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24643n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2572Gh f24644u;

    public /* synthetic */ RunnableC2538Eh(ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh, int i) {
        this.f24643n = i;
        this.f24644u = viewTreeObserverOnGlobalLayoutListenerC2572Gh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24643n) {
            case 0:
                this.f24644u.destroy();
                break;
            case 1:
                this.f24644u.destroy();
                break;
            case 2:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                this.f24644u.A();
                break;
        }
    }

    public RunnableC2538Eh(ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh) {
        this.f24643n = 2;
        Objects.requireNonNull(viewTreeObserverOnGlobalLayoutListenerC2572Gh);
        this.f24644u = viewTreeObserverOnGlobalLayoutListenerC2572Gh;
    }
}
