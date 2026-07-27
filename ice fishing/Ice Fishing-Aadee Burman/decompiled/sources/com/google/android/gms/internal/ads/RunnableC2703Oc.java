package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2703Oc implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26625n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2720Pc f26626u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f26627v;

    public /* synthetic */ RunnableC2703Oc(C2720Pc c2720Pc, String str, int i) {
        this.f26625n = i;
        this.f26626u = c2720Pc;
        this.f26627v = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f26625n) {
            case 0:
                InterfaceC4061vh interfaceC4061vh = this.f26626u.f26837n;
                if (interfaceC4061vh != null) {
                    interfaceC4061vh.loadData(this.f26627v, "text/html", "UTF-8");
                    break;
                }
                break;
            case 1:
                InterfaceC4061vh interfaceC4061vh2 = this.f26626u.f26837n;
                if (interfaceC4061vh2 != null) {
                    interfaceC4061vh2.loadData(this.f26627v, "text/html", "UTF-8");
                    break;
                }
                break;
            case 2:
                InterfaceC4061vh interfaceC4061vh3 = this.f26626u.f26837n;
                if (interfaceC4061vh3 != null) {
                    interfaceC4061vh3.loadUrl(this.f26627v);
                    break;
                }
                break;
            default:
                InterfaceC4061vh interfaceC4061vh4 = this.f26626u.f26837n;
                if (interfaceC4061vh4 != null) {
                    interfaceC4061vh4.b(this.f26627v);
                    break;
                }
                break;
        }
    }
}
