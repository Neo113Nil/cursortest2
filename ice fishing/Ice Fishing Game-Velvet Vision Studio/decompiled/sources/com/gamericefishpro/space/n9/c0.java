package com.gamericefishpro.space.n9;

import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public static final /* synthetic */ c0 e = new c0(0);
    public final /* synthetic */ int d;

    public /* synthetic */ c0(int i) {
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.i9.k4.i.incrementAndGet();
                return;
            default:
                try {
                    int i = com.gamericefishpro.space.y3.d.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (com.gamericefishpro.space.s4.k.c()) {
                        com.gamericefishpro.space.s4.k.a().d();
                        break;
                    }
                    return;
                } finally {
                    int i2 = com.gamericefishpro.space.y3.d.a;
                    Trace.endSection();
                }
        }
    }
}
