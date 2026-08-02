package com.squareup.cash.attribution;

import com.squareup.cash.attribution.deeplink.DeepLink;
import com.squareup.util.coroutines.StateFlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes.dex */
public final /* synthetic */ class DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 {
    public final /* synthetic */ MutableSharedFlow f$0;

    public final void defer(DeepLink deepLink) {
        StateFlowKt.emitOrThrow(this.f$0, deepLink);
    }
}
