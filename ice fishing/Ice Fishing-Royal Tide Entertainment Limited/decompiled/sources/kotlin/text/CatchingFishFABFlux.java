package kotlin.text;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class CatchingFishFABFlux implements CatchingFishMVIGoogleMaps {
    public static CatchingFishFABFlux CatchingFishDaggerWebsocket;
    public Object CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFABFlux(Object obj) {
        this.CatchingFishReduxKtor = obj;
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public Object get() {
        return this.CatchingFishReduxKtor;
    }

    public CatchingFishFABFlux() {
        this.CatchingFishReduxKtor = new Object();
        new Handler(Looper.getMainLooper(), new CatchingFishToolbarRetrofit(0, this));
    }
}
