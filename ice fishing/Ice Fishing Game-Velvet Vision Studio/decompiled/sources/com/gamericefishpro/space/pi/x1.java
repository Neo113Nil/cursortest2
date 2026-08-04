package com.gamericefishpro.space.pi;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements ThreadFactory {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Thread thread = new Thread(runnable, this.b);
                thread.setDaemon(true);
                return thread;
            default:
                Thread thread2 = new Thread(runnable, this.b);
                thread2.setPriority(10);
                return thread2;
        }
    }
}
