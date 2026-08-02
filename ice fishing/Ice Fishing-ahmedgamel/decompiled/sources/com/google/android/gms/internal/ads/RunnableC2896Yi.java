package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2896Yi implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29485n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4084vh f29486u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ JSONObject f29487v;

    public /* synthetic */ RunnableC2896Yi(InterfaceC4084vh interfaceC4084vh, JSONObject jSONObject) {
        this.f29486u = interfaceC4084vh;
        this.f29487v = jSONObject;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        InterfaceC4084vh interfaceC4084vh = this.f29486u;
        JSONObject jSONObject = this.f29487v;
        switch (this.f29485n) {
            case 0:
                String obj = jSONObject.toString();
                String p9 = D.x.p(new StringBuilder(obj.length() + 31), "Calling AFMA_updateActiveView(", obj, ")");
                int i = w2.z.f41712b;
                x2.i.a(p9);
                interfaceC4084vh.a("AFMA_updateActiveView", jSONObject);
                break;
            default:
                C3523lC c3523lC = C3873rm.J;
                interfaceC4084vh.e("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ RunnableC2896Yi(JSONObject jSONObject, InterfaceC4084vh interfaceC4084vh) {
        this.f29487v = jSONObject;
        this.f29486u = interfaceC4084vh;
    }
}
