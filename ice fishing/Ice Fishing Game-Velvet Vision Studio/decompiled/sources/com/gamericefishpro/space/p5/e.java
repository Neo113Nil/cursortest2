package com.gamericefishpro.space.p5;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Choreographer.FrameCallback {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f((Context) this.e, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) this.e).run();
                break;
        }
    }
}
