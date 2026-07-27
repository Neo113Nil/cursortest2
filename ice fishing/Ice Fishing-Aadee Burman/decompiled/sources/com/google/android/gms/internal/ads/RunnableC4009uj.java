package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4009uj implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34562n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4061vh f34563u;

    public /* synthetic */ RunnableC4009uj(InterfaceC4061vh interfaceC4061vh, int i) {
        this.f34562n = i;
        this.f34563u = interfaceC4061vh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34562n) {
            case 0:
                this.f34563u.onPause();
                break;
            case 1:
                this.f34563u.onResume();
                break;
            case 2:
                this.f34563u.destroy();
                break;
            case 3:
                this.f34563u.d("onSdkImpression", new s.b());
                break;
            case 4:
                this.f34563u.destroy();
                break;
            default:
                this.f34563u.B0();
                break;
        }
    }
}
