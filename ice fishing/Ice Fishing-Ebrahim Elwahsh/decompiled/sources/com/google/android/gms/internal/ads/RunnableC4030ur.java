package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ur, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4030ur implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34669n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4084vr f34670u;

    public /* synthetic */ RunnableC4030ur(C4084vr c4084vr, int i) {
        this.f34669n = i;
        this.f34670u = c4084vr;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f34669n) {
            case 0:
                this.f34670u.c();
                break;
            case 1:
                this.f34670u.c();
                break;
            default:
                C4084vr c4084vr = this.f34670u;
                c4084vr.getClass();
                c4084vr.f34879f.execute(new RunnableC4030ur(c4084vr, 1));
                break;
        }
    }
}
