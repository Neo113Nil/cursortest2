package kotlin.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMotionLayoutFAB implements Choreographer.FrameCallback {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 1;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Runnable) this.CatchingFishDaggerWebsocket).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new CatchingFishDagger((Context) this.CatchingFishDaggerWebsocket, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ CatchingFishMotionLayoutFAB(Runnable runnable) {
        this.CatchingFishDaggerWebsocket = runnable;
    }
}
