package com.google.android.gms.internal.ads;

import w2.HandlerC5139A;

/* renamed from: com.google.android.gms.internal.ads.vg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4083vg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35469n;

    /* renamed from: u, reason: collision with root package name */
    public final C4137wg f35470u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35471v;

    public /* synthetic */ RunnableC4083vg(int i, C4137wg c4137wg, boolean z6) {
        this.f35469n = i;
        this.f35471v = z6;
        this.f35470u = c4137wg;
    }

    public void a() {
        this.f35471v = true;
        this.f35470u.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35469n) {
            case 0:
                this.f35470u.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f35471v));
                break;
            case 1:
                C4137wg c4137wg = this.f35470u;
                c4137wg.getClass();
                c4137wg.c("windowFocusChanged", "hasWindowFocus", String.valueOf(this.f35471v));
                break;
            default:
                if (!this.f35471v) {
                    this.f35470u.b();
                    HandlerC5139A handlerC5139A = w2.D.f41627l;
                    handlerC5139A.removeCallbacks(this);
                    handlerC5139A.postDelayed(this, 250L);
                    break;
                }
                break;
        }
    }

    public RunnableC4083vg(C4137wg c4137wg) {
        this.f35469n = 2;
        this.f35471v = false;
        this.f35470u = c4137wg;
    }
}
