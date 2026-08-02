package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4032uj implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35334n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4084vh f35335u;

    public /* synthetic */ RunnableC4032uj(InterfaceC4084vh interfaceC4084vh, int i) {
        this.f35334n = i;
        this.f35335u = interfaceC4084vh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35334n) {
            case 0:
                this.f35335u.onPause();
                break;
            case 1:
                this.f35335u.onResume();
                break;
            case 2:
                this.f35335u.destroy();
                break;
            case 3:
                this.f35335u.d("onSdkImpression", new s.b());
                break;
            case 4:
                this.f35335u.destroy();
                break;
            default:
                this.f35335u.A0();
                break;
        }
    }
}
