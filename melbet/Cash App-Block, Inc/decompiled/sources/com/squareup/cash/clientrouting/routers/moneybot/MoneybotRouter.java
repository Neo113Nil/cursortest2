package com.squareup.cash.clientrouting.routers.moneybot;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.observability.types.SampleStrategy$Companion$SampleAll;
import com.squareup.moshi.Moshi;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final class MoneybotRouter implements HasObservability {
    public final ErrorReporter errorReporter;
    public final MoneybotFlagsHelper moneybotFlagsHelper;
    public final Moshi moshi;
    public final Navigator navigator;
    public final CoroutineScope scope;

    public MoneybotRouter(ErrorReporter errorReporter, MoneybotFlagsHelper moneybotFlagsHelper, Navigator navigator, Moshi moshi, CoroutineScope coroutineScope) {
        navigator.getClass();
        this.errorReporter = errorReporter;
        this.moneybotFlagsHelper = moneybotFlagsHelper;
        this.navigator = navigator;
        this.moshi = moshi;
        this.scope = coroutineScope;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return SampleStrategy$Companion$SampleAll.INSTANCE;
    }

    public final void route(ClientRoute.ViewMoneybotResumeChat viewMoneybotResumeChat, RoutingParams routingParams) {
        viewMoneybotResumeChat.getClass();
        routingParams.getClass();
        JobKt.launch$default(this.scope, null, null, new RealProfileManager$setPhoto$2(this, routingParams, new SsnViewKt$$ExternalSyntheticLambda4(viewMoneybotResumeChat, 23), null, 4), 3);
    }

    public final void route(ClientRoute.ViewMoneybotChat viewMoneybotChat, RoutingParams routingParams) {
        viewMoneybotChat.getClass();
        routingParams.getClass();
        JobKt.launch$default(this.scope, null, null, new RealProfileManager$setPhoto$2(this, routingParams, new ArcadeModal2Kt$$ExternalSyntheticLambda2(1, viewMoneybotChat, this), null, 4), 3);
    }
}
