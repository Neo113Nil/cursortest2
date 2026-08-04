package com.gamericefishpro.space.r8;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {
    public static final /* synthetic */ h e = new h(0);
    public static final /* synthetic */ h i = new h(1);
    public final /* synthetic */ int d;

    public /* synthetic */ h(int i2) {
        this.d = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
