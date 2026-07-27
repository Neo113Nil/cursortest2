package com.google.android.gms.internal.ads;

import u2.HandlerC5068A;

/* renamed from: com.google.android.gms.internal.ads.vg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4060vg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34712n;

    /* renamed from: u, reason: collision with root package name */
    public final C4114wg f34713u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34714v;

    public /* synthetic */ RunnableC4060vg(int i, C4114wg c4114wg, boolean z3) {
        this.f34712n = i;
        this.f34714v = z3;
        this.f34713u = c4114wg;
    }

    public void a() {
        this.f34714v = true;
        this.f34713u.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34712n) {
            case 0:
                this.f34713u.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f34714v));
                break;
            case 1:
                C4114wg c4114wg = this.f34713u;
                c4114wg.getClass();
                c4114wg.c("windowFocusChanged", "hasWindowFocus", String.valueOf(this.f34714v));
                break;
            default:
                if (!this.f34714v) {
                    this.f34713u.b();
                    HandlerC5068A handlerC5068A = u2.D.f41234l;
                    handlerC5068A.removeCallbacks(this);
                    handlerC5068A.postDelayed(this, 250L);
                    break;
                }
                break;
        }
    }

    public RunnableC4060vg(C4114wg c4114wg) {
        this.f34712n = 2;
        this.f34714v = false;
        this.f34713u = c4114wg;
    }
}
