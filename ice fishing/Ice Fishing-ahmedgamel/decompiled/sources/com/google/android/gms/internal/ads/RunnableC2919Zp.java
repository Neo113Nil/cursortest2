package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2919Zp implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29739n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uv f29740u;

    public /* synthetic */ RunnableC2919Zp(Uv uv, int i) {
        this.f29739n = i;
        this.f29740u = uv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29739n) {
            case 0:
                this.f29740u.a();
                break;
            default:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33046h6)).booleanValue() && MA.f27044E.f27915u) {
                    this.f29740u.c();
                    break;
                }
                break;
        }
    }
}
