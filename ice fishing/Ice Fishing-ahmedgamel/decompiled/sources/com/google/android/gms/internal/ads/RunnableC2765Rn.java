package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2765Rn implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27327n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2782Sn f27328u;

    public /* synthetic */ RunnableC2765Rn(C2782Sn c2782Sn, int i) {
        this.f27327n = i;
        this.f27328u = c2782Sn;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f27327n) {
            case 0:
                C2782Sn c2782Sn = this.f27328u;
                c2782Sn.getClass();
                c2782Sn.f27551c.execute(new RunnableC2765Rn(c2782Sn, 1));
                break;
            case 1:
                this.f27328u.a();
                break;
            default:
                this.f27328u.a();
                break;
        }
    }
}
