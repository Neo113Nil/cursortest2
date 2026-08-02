package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2723Oc implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27401n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2740Pc f27402u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f27403v;

    public /* synthetic */ RunnableC2723Oc(C2740Pc c2740Pc, String str, int i) {
        this.f27401n = i;
        this.f27402u = c2740Pc;
        this.f27403v = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f27401n) {
            case 0:
                InterfaceC4084vh interfaceC4084vh = this.f27402u.f27625n;
                if (interfaceC4084vh != null) {
                    interfaceC4084vh.loadData(this.f27403v, "text/html", "UTF-8");
                    break;
                }
                break;
            case 1:
                InterfaceC4084vh interfaceC4084vh2 = this.f27402u.f27625n;
                if (interfaceC4084vh2 != null) {
                    interfaceC4084vh2.loadData(this.f27403v, "text/html", "UTF-8");
                    break;
                }
                break;
            case 2:
                InterfaceC4084vh interfaceC4084vh3 = this.f27402u.f27625n;
                if (interfaceC4084vh3 != null) {
                    interfaceC4084vh3.loadUrl(this.f27403v);
                    break;
                }
                break;
            default:
                InterfaceC4084vh interfaceC4084vh4 = this.f27402u.f27625n;
                if (interfaceC4084vh4 != null) {
                    interfaceC4084vh4.b(this.f27403v);
                    break;
                }
                break;
        }
    }
}
