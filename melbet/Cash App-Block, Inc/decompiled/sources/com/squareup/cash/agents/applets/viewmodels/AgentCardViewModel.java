package com.squareup.cash.agents.applets.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AgentCardViewModel {
    public final String id;
    public final String subtitle;
    public final String title;

    public AgentCardViewModel(String str, String str2, String str3) {
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentCardViewModel)) {
            return false;
        }
        AgentCardViewModel agentCardViewModel = (AgentCardViewModel) obj;
        return this.id.equals(agentCardViewModel.id) && Intrinsics.areEqual(this.title, agentCardViewModel.title) && this.subtitle.equals(agentCardViewModel.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AgentCardViewModel(id=", this.id, ", title=", this.title, ", subtitle="), this.subtitle, ")");
    }
}
