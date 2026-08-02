package com.squareup.cash.account.types;

import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class SignedInStateManager {
    public final StateFlowImpl _state;
    public final StateFlowImpl _versionedState;
    public final DerivedStateFlow state;
    public final StateFlowImpl versionedState;

    public SignedInStateManager(SignedInState signedInState) {
        this._state = FlowKt.MutableStateFlow(signedInState);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(new Versioned(signedInState, 0));
        this._versionedState = MutableStateFlow;
        this.state = StateFlowKt.mapState(MutableStateFlow, new SvgDecoder$$ExternalSyntheticLambda0(6));
        this.versionedState = MutableStateFlow;
    }

    public final void update(SignedInState signedInState) {
        StateFlowImpl stateFlowImpl = this._state;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, signedInState);
        StateFlowImpl stateFlowImpl2 = this._versionedState;
        Versioned update = VersionedKt.update((Versioned) stateFlowImpl2.getValue(), signedInState);
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, update);
    }
}
