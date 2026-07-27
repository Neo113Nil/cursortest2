package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Dv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24603n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ev f24604u;

    public /* synthetic */ Dv(Ev ev, int i) {
        this.f24603n = i;
        this.f24604u = ev;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24603n) {
            case 0:
                this.f24604u.l();
                break;
            case 1:
                this.f24604u.l();
                break;
            case 2:
                this.f24604u.l();
                break;
            case 3:
                this.f24604u.l();
                break;
            default:
                Ev ev = this.f24604u;
                ev.f24849b.set(false);
                ev.l();
                break;
        }
    }
}
