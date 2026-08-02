package com.squareup.cash.agents.applets.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AgentsHomeViewModel {
    public final AgentsHomeContentState contentState;
    public final String createButtonText;
    public final String title;

    public AgentsHomeViewModel(String str, String str2, AgentsHomeContentState agentsHomeContentState) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.createButtonText = str2;
        this.contentState = agentsHomeContentState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentsHomeViewModel)) {
            return false;
        }
        AgentsHomeViewModel agentsHomeViewModel = (AgentsHomeViewModel) obj;
        return Intrinsics.areEqual(this.title, agentsHomeViewModel.title) && Intrinsics.areEqual(this.createButtonText, agentsHomeViewModel.createButtonText) && this.contentState.equals(agentsHomeViewModel.contentState);
    }

    public final int hashCode() {
        return this.contentState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.createButtonText);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AgentsHomeViewModel(title=", this.title, ", createButtonText=", this.createButtonText, ", contentState=");
        m.append(this.contentState);
        m.append(")");
        return m.toString();
    }
}
