package com.gamericefishpro.space.cb;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements h {
    public final /* synthetic */ int d;
    public final /* synthetic */ g e;
    public final /* synthetic */ Runnable i;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ TimeUnit y;

    public /* synthetic */ d(g gVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.d = i;
        this.e = gVar;
        this.i = runnable;
        this.v = j;
        this.w = j2;
        this.y = timeUnit;
    }

    @Override // com.gamericefishpro.space.cb.h
    public final ScheduledFuture a(com.gamericefishpro.space.vb.c cVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = this.e;
                return gVar.e.scheduleAtFixedRate(new e(gVar, this.i, cVar, 0), this.v, this.w, this.y);
            default:
                g gVar2 = this.e;
                return gVar2.e.scheduleWithFixedDelay(new e(gVar2, this.i, cVar, 2), this.v, this.w, this.y);
        }
    }
}
