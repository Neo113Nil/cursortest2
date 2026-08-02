package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Eh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2558Eh implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25396n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2592Gh f25397u;

    public /* synthetic */ RunnableC2558Eh(ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh, int i) {
        this.f25396n = i;
        this.f25397u = viewTreeObserverOnGlobalLayoutListenerC2592Gh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25396n) {
            case 0:
                this.f25397u.destroy();
                break;
            case 1:
                this.f25397u.destroy();
                break;
            case 2:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                this.f25397u.A();
                break;
        }
    }

    public RunnableC2558Eh(ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh) {
        this.f25396n = 2;
        Objects.requireNonNull(viewTreeObserverOnGlobalLayoutListenerC2592Gh);
        this.f25397u = viewTreeObserverOnGlobalLayoutListenerC2592Gh;
    }
}
