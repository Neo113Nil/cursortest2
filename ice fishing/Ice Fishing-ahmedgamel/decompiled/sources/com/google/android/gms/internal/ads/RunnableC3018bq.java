package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.bq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3018bq implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30120n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uv f30121u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f30122v;

    public /* synthetic */ RunnableC3018bq(Uv uv, View view, int i) {
        this.f30120n = i;
        this.f30121u = uv;
        this.f30122v = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30120n) {
            case 0:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33046h6)).booleanValue() && MA.f27044E.f27915u) {
                    Xv xv = Xv.f29380n;
                    Uv uv = this.f30121u;
                    if (!uv.f28838f) {
                        uv.f28834b.a(this.f30122v, xv);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33046h6)).booleanValue() && MA.f27044E.f27915u) {
                    this.f30121u.b(this.f30122v);
                    break;
                }
                break;
        }
    }
}
