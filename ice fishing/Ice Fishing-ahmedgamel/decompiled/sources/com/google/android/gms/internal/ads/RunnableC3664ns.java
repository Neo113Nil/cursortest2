package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ns, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3664ns implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33578n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3718os f33579u;

    public /* synthetic */ RunnableC3664ns(C3718os c3718os, int i) {
        this.f33578n = i;
        this.f33579u = c3718os;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f33578n) {
            case 0:
                C3718os c3718os = this.f33579u;
                c3718os.f33741a.set(new C3610ms(c3718os.f33745e.c(), c3718os.f33746f, c3718os.f33743c));
                break;
            default:
                C3718os c3718os2 = this.f33579u;
                c3718os2.getClass();
                c3718os2.f33744d.execute(new RunnableC3664ns(c3718os2, 0));
                break;
        }
    }
}
