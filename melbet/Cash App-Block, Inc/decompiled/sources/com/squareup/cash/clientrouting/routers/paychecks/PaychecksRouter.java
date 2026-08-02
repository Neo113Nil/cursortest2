package com.squareup.cash.clientrouting.routers.paychecks;

import androidx.compose.ui.platform.ShapeContainingUtilKt;
import androidx.compose.ui.platform.WindowInfoImpl;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$OtpInfo$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.paychecks.backend.api.GeneralPaychecksException;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.screens.DistributePaycheckScreen;
import com.squareup.cash.paychecks.screens.PaychecksHomeScreen;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.paychecks.UiConfiguration;
import squareup.cash.paychecks.UiState;

/* loaded from: classes6.dex */
public final class PaychecksRouter implements HasObservability {
    public final ErrorReporter errorReporter;
    public final Navigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final Lazy router$delegate;
    public final SyncValueReader syncValueReader;

    public PaychecksRouter(ErrorReporter errorReporter, SampleStrategy sampleStrategy, SyncValueReader syncValueReader, Navigator navigator, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        navigator.getClass();
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.syncValueReader = syncValueReader;
        this.navigator = navigator;
        this.router$delegate = LazyKt.lazy(new ArcadeModal2Kt$$ExternalSyntheticLambda2(2, realRouter$Factory$Impl, this));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    public final void route(ClientRoute.ViewPaychecksHome viewPaychecksHome) {
        viewPaychecksHome.getClass();
        this.navigator.goTo(PaychecksHomeScreen.INSTANCE);
        AndroidSyncValueSpecs$OtpInfo$1 androidSyncValueSpecs$OtpInfo$1 = AndroidSyncValueSpecs.PaychecksUiConfiguration;
        SyncValueReader syncValueReader = this.syncValueReader;
        UiConfiguration uiConfiguration = (UiConfiguration) syncValueReader.getSingleValue(androidSyncValueSpecs$OtpInfo$1).getValue();
        PaychecksUiConfiguration paychecksUiConfiguration = uiConfiguration != null ? ShapeContainingUtilKt.toPaychecksUiConfiguration(this, uiConfiguration) : null;
        UiState uiState = (UiState) syncValueReader.getSingleValue(AndroidSyncValueSpecs.PaychecksUiState).getValue();
        PaychecksUiState paychecksUiState = uiState != null ? WindowInfoImpl.Companion.toPaychecksUiState(this, uiState) : null;
        if (paychecksUiState != null ? Intrinsics.areEqual(paychecksUiState.shouldDisplayBenefitsBooklet, Boolean.TRUE) : false) {
            if ((paychecksUiConfiguration != null ? paychecksUiConfiguration.home.bankingBenefitsBookletClientRoute : null) == null) {
                this.errorReporter.report(new GeneralPaychecksException("Benefits booklet client route is null but shouldDisplayBooklet is true"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            }
            ((RealRouter) this.router$delegate.getValue()).route(new RoutingParams(null, null, null, null, null, null, 511), paychecksUiConfiguration != null ? paychecksUiConfiguration.home.bankingBenefitsBookletClientRoute : null);
        }
    }

    public final void route(ClientRoute.ViewPaychecksDistributionSummary viewPaychecksDistributionSummary) {
        viewPaychecksDistributionSummary.getClass();
        this.navigator.goTo(DistributePaycheckScreen.INSTANCE);
    }
}
