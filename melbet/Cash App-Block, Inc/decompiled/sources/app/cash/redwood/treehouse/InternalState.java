package app.cash.redwood.treehouse;

import app.cash.redwood.treehouse.CodeState;
import app.cash.redwood.treehouse.ViewState;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class InternalState {
    public final CodeState codeState;
    public final ViewState viewState;

    public InternalState(ViewState viewState, CodeState codeState) {
        codeState.getClass();
        this.viewState = viewState;
        this.codeState = codeState;
        if (viewState.equals(ViewState.None.INSTANCE) && (codeState instanceof CodeState.Running)) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
    }
}
