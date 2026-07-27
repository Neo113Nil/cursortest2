package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2617Jc implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25778n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2634Kc f25779u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f25780v;

    public /* synthetic */ RunnableC2617Jc(C2634Kc c2634Kc, String str, int i) {
        this.f25778n = i;
        this.f25779u = c2634Kc;
        this.f25780v = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f25778n) {
            case 0:
                InterfaceC3858rh interfaceC3858rh = this.f25779u.f25993n;
                if (interfaceC3858rh != null) {
                    interfaceC3858rh.loadData(this.f25780v, "text/html", "UTF-8");
                    break;
                }
                break;
            case 1:
                InterfaceC3858rh interfaceC3858rh2 = this.f25779u.f25993n;
                if (interfaceC3858rh2 != null) {
                    interfaceC3858rh2.loadData(this.f25780v, "text/html", "UTF-8");
                    break;
                }
                break;
            case 2:
                InterfaceC3858rh interfaceC3858rh3 = this.f25779u.f25993n;
                if (interfaceC3858rh3 != null) {
                    interfaceC3858rh3.loadUrl(this.f25780v);
                    break;
                }
                break;
            default:
                InterfaceC3858rh interfaceC3858rh4 = this.f25779u.f25993n;
                if (interfaceC3858rh4 != null) {
                    interfaceC3858rh4.d(this.f25780v);
                    break;
                }
                break;
        }
    }
}
