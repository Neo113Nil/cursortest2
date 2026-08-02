package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Li, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2678Li implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26957n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2712Ni f26958u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Throwable f26959v;

    public /* synthetic */ RunnableC2678Li(C2712Ni c2712Ni, Throwable th, int i) {
        this.f26957n = i;
        this.f26958u = c2712Ni;
        this.f26959v = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26957n) {
            case 0:
                C2712Ni c2712Ni = this.f26958u;
                c2712Ni.getClass();
                boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Jb)).booleanValue();
                Context context = c2712Ni.f27294a;
                Throwable th = this.f26959v;
                if (!booleanValue) {
                    C2521Ce.a(context).e("AttributionReportingSampled", th);
                    break;
                } else {
                    C2521Ce.c(context).e("AttributionReporting", th);
                    break;
                }
            default:
                C2712Ni c2712Ni2 = this.f26958u;
                c2712Ni2.getClass();
                boolean booleanValue2 = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Jb)).booleanValue();
                Context context2 = c2712Ni2.f27294a;
                Throwable th2 = this.f26959v;
                if (!booleanValue2) {
                    C2521Ce.a(context2).e("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th2);
                    break;
                } else {
                    C2521Ce.c(context2).e("AttributionReporting.getUpdatedUrlAndRegisterSource", th2);
                    break;
                }
        }
    }
}
