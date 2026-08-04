package com.gamericefishpro.space.r9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements m, e, d, c {
    public final /* synthetic */ int d;
    public final Executor e;
    public final Object i;
    public final Object v;

    public k(Executor executor, c cVar) {
        this.d = 0;
        this.i = new Object();
        this.e = executor;
        this.v = cVar;
    }

    @Override // com.gamericefishpro.space.r9.c
    public void a() {
        ((o) this.v).n();
    }

    @Override // com.gamericefishpro.space.r9.m
    public final void b(Task task) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (task.i()) {
                    synchronized (this.i) {
                        break;
                    }
                    this.e.execute(new com.gamericefishpro.space.h4.b(20, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.i) {
                    try {
                        if (((OnCompleteListener) this.v) == null) {
                            return;
                        }
                        this.e.execute(new com.gamericefishpro.space.va.a(28, this, task, false));
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                if (task.isSuccessful() || task.i()) {
                    return;
                }
                synchronized (this.i) {
                    break;
                }
                this.e.execute(new com.gamericefishpro.space.va.a(29, this, task, false));
                return;
            case 3:
                if (task.isSuccessful()) {
                    synchronized (this.i) {
                        break;
                    }
                    this.e.execute(new l(0, this, task));
                    return;
                }
                return;
            default:
                this.e.execute(new l(1, this, task));
                return;
        }
    }

    @Override // com.gamericefishpro.space.r9.e
    public void c(Object obj) {
        ((o) this.v).m(obj);
    }

    @Override // com.gamericefishpro.space.r9.d
    public void d(Exception exc) {
        ((o) this.v).l(exc);
    }

    public k(Executor executor, d dVar) {
        this.d = 2;
        this.i = new Object();
        this.e = executor;
        this.v = dVar;
    }

    public k(Executor executor, e eVar) {
        this.d = 3;
        this.i = new Object();
        this.e = executor;
        this.v = eVar;
    }

    public k(Executor executor, g gVar, o oVar) {
        this.d = 4;
        this.e = executor;
        this.i = gVar;
        this.v = oVar;
    }

    public k(Executor executor, OnCompleteListener onCompleteListener) {
        this.d = 1;
        this.i = new Object();
        this.e = executor;
        this.v = onCompleteListener;
    }
}
