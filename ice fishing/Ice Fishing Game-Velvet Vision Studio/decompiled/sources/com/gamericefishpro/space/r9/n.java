package com.gamericefishpro.space.r9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Executor {
    public static final /* synthetic */ n e = new n(2);
    public final /* synthetic */ int d;

    public /* synthetic */ n(int i) {
        this.d = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
