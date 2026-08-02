package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Si, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2797Si implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28327n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2814Ti f28328u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f28329v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28330w;

    public /* synthetic */ RunnableC2797Si(C2814Ti c2814Ti, int i, int i4, int i6) {
        this.f28327n = i6;
        this.f28328u = c2814Ti;
        this.f28329v = i;
        this.f28330w = i4;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f28327n) {
            case 0:
                C2814Ti c2814Ti = this.f28328u;
                c2814Ti.getClass();
                c2814Ti.f28565u.execute(new RunnableC2797Si(c2814Ti, this.f28329v, this.f28330w, 1));
                break;
            default:
                this.f28328u.b(this.f28329v - 1, this.f28330w);
                break;
        }
    }
}
