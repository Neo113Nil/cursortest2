package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.bq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2995bq implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29332n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uv f29333u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f29334v;

    public /* synthetic */ RunnableC2995bq(Uv uv, View view, int i) {
        this.f29332n = i;
        this.f29333u = uv;
        this.f29334v = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29332n) {
            case 0:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32266h6)).booleanValue() && MA.f26253E.f27159u) {
                    Wv wv = Wv.f28443n;
                    Uv uv = this.f29333u;
                    if (!uv.f28041f) {
                        uv.f28037b.a(this.f29334v, wv);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32266h6)).booleanValue() && MA.f26253E.f27159u) {
                    this.f29333u.b(this.f29334v);
                    break;
                }
                break;
        }
    }
}
