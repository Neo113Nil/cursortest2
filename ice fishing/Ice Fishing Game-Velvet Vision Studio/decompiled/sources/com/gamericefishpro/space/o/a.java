package com.gamericefishpro.space.o;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {
    public final /* synthetic */ int d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b.M().c.d.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
