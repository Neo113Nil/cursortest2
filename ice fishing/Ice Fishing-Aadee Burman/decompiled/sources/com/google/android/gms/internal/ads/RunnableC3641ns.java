package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ns, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3641ns implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32791n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3695os f32792u;

    public /* synthetic */ RunnableC3641ns(C3695os c3695os, int i) {
        this.f32791n = i;
        this.f32792u = c3695os;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f32791n) {
            case 0:
                C3695os c3695os = this.f32792u;
                c3695os.f32955a.set(new C3587ms(c3695os.f32959e.c(), c3695os.f32960f, c3695os.f32957c));
                break;
            default:
                C3695os c3695os2 = this.f32792u;
                c3695os2.getClass();
                c3695os2.f32958d.execute(new RunnableC3641ns(c3695os2, 0));
                break;
        }
    }
}
