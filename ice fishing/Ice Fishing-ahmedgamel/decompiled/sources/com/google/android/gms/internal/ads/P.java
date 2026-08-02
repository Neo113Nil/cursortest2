package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class P implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27487n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S0.c f27488u;

    public /* synthetic */ P(S0.c cVar, int i) {
        this.f27487n = i;
        this.f27488u = cVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f27487n) {
            case 0:
                ((Q) this.f27488u.f2903v).i.f();
                break;
            case 1:
                ((Q) this.f27488u.f2903v).i.i();
                break;
            default:
                ((Q) this.f27488u.f2903v).i.getClass();
                break;
        }
    }

    public /* synthetic */ P(S0.c cVar, C3058cd c3058cd) {
        this.f27487n = 2;
        this.f27488u = cVar;
    }
}
