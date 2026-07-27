package kotlin.text;

import com.adjust.sdk.ActivityHandler;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineFlow implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ boolean CatchingFishReduxKtor;

    public CatchingFishCoroutineFlow(ActivityHandler activityHandler, boolean z) {
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishReduxKtor = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.CatchingFishDaggerWebsocket.setAskingAttributionI(this.CatchingFishReduxKtor);
    }
}
