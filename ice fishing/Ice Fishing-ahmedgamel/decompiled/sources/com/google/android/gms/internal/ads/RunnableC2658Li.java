package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Li, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2658Li implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26160n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2692Ni f26161u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Throwable f26162v;

    public /* synthetic */ RunnableC2658Li(C2692Ni c2692Ni, Throwable th, int i) {
        this.f26160n = i;
        this.f26161u = c2692Ni;
        this.f26162v = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26160n) {
            case 0:
                C2692Ni c2692Ni = this.f26161u;
                c2692Ni.getClass();
                boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Jb)).booleanValue();
                Context context = c2692Ni.f26511a;
                Throwable th = this.f26162v;
                if (!booleanValue) {
                    C2501Ce.a(context).e("AttributionReportingSampled", th);
                    break;
                } else {
                    C2501Ce.c(context).e("AttributionReporting", th);
                    break;
                }
            default:
                C2692Ni c2692Ni2 = this.f26161u;
                c2692Ni2.getClass();
                boolean booleanValue2 = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Jb)).booleanValue();
                Context context2 = c2692Ni2.f26511a;
                Throwable th2 = this.f26162v;
                if (!booleanValue2) {
                    C2501Ce.a(context2).e("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th2);
                    break;
                } else {
                    C2501Ce.c(context2).e("AttributionReporting.getUpdatedUrlAndRegisterSource", th2);
                    break;
                }
        }
    }
}
