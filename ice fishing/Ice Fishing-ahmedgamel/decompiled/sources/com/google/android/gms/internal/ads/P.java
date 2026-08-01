package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class P implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26704n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S0.c f26705u;

    public /* synthetic */ P(S0.c cVar, int i) {
        this.f26704n = i;
        this.f26705u = cVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f26704n) {
            case 0:
                ((Q) this.f26705u.f2776v).i.f();
                break;
            case 1:
                ((Q) this.f26705u.f2776v).i.i();
                break;
            default:
                ((Q) this.f26705u.f2776v).i.getClass();
                break;
        }
    }

    public /* synthetic */ P(S0.c cVar, C3035cd c3035cd) {
        this.f26704n = 2;
        this.f26705u = cVar;
    }
}
