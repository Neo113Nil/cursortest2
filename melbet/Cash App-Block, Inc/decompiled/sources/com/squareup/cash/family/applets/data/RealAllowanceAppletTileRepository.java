package com.squareup.cash.family.applets.data;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.backend.real.RealDependentAllowanceManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.recurringpayments.backend.RecurringPayments;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes6.dex */
public final class RealAllowanceAppletTileRepository {
    public final ReadonlyStateFlow allowancePayments;
    public final DerivedStateFlow availabilityState;
    public final RealDependentAllowanceManager dependentAllowanceManager;
    public final SessionManager sessionManager;

    public RealAllowanceAppletTileRepository(RealFamilyProfileManager realFamilyProfileManager, RealFamilyAccountsManager realFamilyAccountsManager, RealDependentAllowanceManager realDependentAllowanceManager, SessionManager sessionManager, CoroutineScope coroutineScope) {
        this.dependentAllowanceManager = realDependentAllowanceManager;
        this.sessionManager = sessionManager;
        this.allowancePayments = FlowKt.stateIn(FlowKt.transformLatest(StateFlowKt.mapState(StateFlowKt.mapState(realFamilyAccountsManager.sponsorsFlow(), new FamilyActivityFixtures$$ExternalSyntheticLambda0(1)), new StoryQueries$$ExternalSyntheticLambda0(19)), new AnchoredDraggableNode$drag$2(null, this, 15)), coroutineScope, SharingStarted.Companion.Lazily, RecurringPayments.NotLoaded.INSTANCE);
        this.availabilityState = StateFlowKt.mapState(realFamilyProfileManager.familyProfile, new StoryQueries$$ExternalSyntheticLambda0(20));
    }
}
