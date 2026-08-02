package com.squareup.cash.family.applets.data;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes6.dex */
public final class RealApprovedContactsAppletTileRepository {
    public final ReadonlyStateFlow availabilityState;
    public final BlocklyService blocklyService;
    public final SessionManager sessionManager;

    public RealApprovedContactsAppletTileRepository(RealFamilyProfileManager realFamilyProfileManager, BlocklyService blocklyService, SessionManager sessionManager, CoroutineScope coroutineScope) {
        this.blocklyService = blocklyService;
        this.sessionManager = sessionManager;
        this.availabilityState = FlowKt.stateIn(FlowKt.transformLatest(realFamilyProfileManager.familyProfile, new AnchoredDraggableNode$drag$2(null, this, 16)), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), AppletAvailabilityState.LOADING);
    }
}
