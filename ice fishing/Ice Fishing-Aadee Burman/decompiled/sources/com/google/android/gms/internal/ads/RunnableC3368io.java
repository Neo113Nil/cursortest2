package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.io, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3368io implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31117n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3315ho f31118u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f31119v;

    public /* synthetic */ RunnableC3368io(C3315ho c3315ho, String str, int i) {
        this.f31117n = i;
        this.f31118u = c3315ho;
        this.f31119v = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f31117n) {
            case 0:
                this.f31118u.f30943d.a(null, this.f31119v);
                break;
            default:
                this.f31118u.f30943d.a(null, this.f31119v);
                break;
        }
    }
}
