package com.gamericefishpro.space.r9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements m, e, d, c {
    public final /* synthetic */ int d;
    public final Executor e;
    public final a i;
    public final o v;

    public /* synthetic */ j(Executor executor, a aVar, o oVar, int i) {
        this.d = i;
        this.e = executor;
        this.i = aVar;
        this.v = oVar;
    }

    @Override // com.gamericefishpro.space.r9.c
    public void a() {
        this.v.n();
    }

    @Override // com.gamericefishpro.space.r9.m
    public final void b(Task task) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.execute(new com.gamericefishpro.space.va.a(26, this, task, false));
                break;
            default:
                this.e.execute(new com.gamericefishpro.space.va.a(27, this, task, false));
                break;
        }
    }

    @Override // com.gamericefishpro.space.r9.e
    public void c(Object obj) {
        this.v.m(obj);
    }

    @Override // com.gamericefishpro.space.r9.d
    public void d(Exception exc) {
        this.v.l(exc);
    }
}
