package com.gamericefishpro.space.a9;

import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int d;
    public final Runnable e;

    public /* synthetic */ c(Runnable runnable, int i) {
        this.d = i;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Process.setThreadPriority(0);
                this.e.run();
                break;
            case 1:
                try {
                    this.e.run();
                } catch (Exception e) {
                    com.gamericefishpro.space.wa.b.s("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            default:
                this.e.run();
                break;
        }
    }

    public String toString() {
        switch (this.d) {
            case 2:
                return this.e.toString();
            default:
                return super.toString();
        }
    }
}
