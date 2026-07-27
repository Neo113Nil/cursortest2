package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2873Yi implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28710n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4061vh f28711u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ JSONObject f28712v;

    public /* synthetic */ RunnableC2873Yi(InterfaceC4061vh interfaceC4061vh, JSONObject jSONObject) {
        this.f28711u = interfaceC4061vh;
        this.f28712v = jSONObject;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        InterfaceC4061vh interfaceC4061vh = this.f28711u;
        JSONObject jSONObject = this.f28712v;
        switch (this.f28710n) {
            case 0:
                String obj = jSONObject.toString();
                String s9 = D.y.s(new StringBuilder(obj.length() + 31), "Calling AFMA_updateActiveView(", obj, ")");
                int i = u2.z.f41319b;
                v2.i.a(s9);
                interfaceC4061vh.a("AFMA_updateActiveView", jSONObject);
                break;
            default:
                C3500lC c3500lC = C3797qm.J;
                interfaceC4061vh.e("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ RunnableC2873Yi(JSONObject jSONObject, InterfaceC4061vh interfaceC4061vh) {
        this.f28712v = jSONObject;
        this.f28711u = interfaceC4061vh;
    }
}
