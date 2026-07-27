package com.adjust.sdk;

import com.adjust.sdk.AdjustLinkResolution;
import java.net.URL;

/* loaded from: classes.dex */
public final class CatchingFishEspressoTesting implements Runnable {
    public final /* synthetic */ AdjustLinkResolution.AdjustLinkResolutionCallback CatchingFishDaggerWebsocket;
    public final /* synthetic */ URL CatchingFishReduxKtor;

    public CatchingFishEspressoTesting(URL url, AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        this.CatchingFishReduxKtor = url;
        this.CatchingFishDaggerWebsocket = adjustLinkResolutionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustLinkResolution.requestAndResolve(this.CatchingFishReduxKtor, 0, this.CatchingFishDaggerWebsocket);
    }
}
