package com.squareup.cash.p2pblocking.presenters;

import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesDependentAllowlistExperience;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.fiatly.syncvalues.P2PControl;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RealAllowlistRepository {
    public final StateFlow allowlistCustomerTokens;
    public final StateFlow p2pControl;
    public final CoroutineScope scope;
    public final boolean showAllowlistDependentExperience;

    public RealAllowlistRepository(SyncValueReader syncValueReader, FeatureFlagManager featureFlagManager, CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
        this.allowlistCustomerTokens = syncValueReader.getAllValues(AndroidSyncValueSpecs.P2pAllowlistCustomer, new OffersStyledTextKt$$ExternalSyntheticLambda0(23));
        this.showAllowlistDependentExperience = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesDependentAllowlistExperience.INSTANCE)).enabled();
        this.p2pControl = syncValueReader.getSingleValue(AndroidSyncValueSpecs.P2pControl);
    }

    public final StateFlow getAllowlistedTokensIfActive() {
        if (!this.showAllowlistDependentExperience) {
            return new StateFlowKt$stateFlowOf$1(EmptySet.INSTANCE);
        }
        return FlowKt.stateIn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.p2pControl, this.allowlistCustomerTokens, new CardModelView.AnonymousClass1.AnonymousClass4(3, (Continuation) null, 14), 0), this.scope, SharingStarted.Companion.Eagerly, EmptySet.INSTANCE);
    }

    public final boolean isAllowlistOn() {
        P2PControl p2PControl = (P2PControl) this.p2pControl.getValue();
        if (p2PControl != null) {
            return Intrinsics.areEqual(p2PControl.enabled, Boolean.FALSE);
        }
        return false;
    }
}
