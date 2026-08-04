package com.gamericefishpro.space.c8;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.n9.p1;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.t2;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Executor {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ p(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Executor) this.e).execute(new com.gamericefishpro.space.a9.c(runnable, 1));
                return;
            case 1:
                p1 p1Var = ((r1) ((t2) this.e).d).z;
                r1.l(p1Var);
                p1Var.A(runnable);
                return;
            case 2:
                ((com.gamericefishpro.space.f9.e) this.e).post(runnable);
                return;
            case 3:
                ((Handler) ((com.gamericefishpro.space.r5.b) this.e).i).post(runnable);
                return;
            default:
                Handler handler = (Handler) this.e;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public p() {
        this.d = 2;
        com.gamericefishpro.space.f9.e eVar = new com.gamericefishpro.space.f9.e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.e = eVar;
    }
}
