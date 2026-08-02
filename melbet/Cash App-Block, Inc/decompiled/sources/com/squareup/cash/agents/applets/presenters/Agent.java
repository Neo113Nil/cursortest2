package com.squareup.cash.agents.applets.presenters;

import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class Agent {
    public final StackedAvatarViewModel.Avatar avatar;
    public final String id;
    public final String subtitle;
    public final String title;

    public Agent(String str, String str2, String str3, StackedAvatarViewModel.Avatar avatar) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.avatar = avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Agent)) {
            return false;
        }
        Agent agent = (Agent) obj;
        return this.id.equals(agent.id) && this.title.equals(agent.title) && this.subtitle.equals(agent.subtitle) && this.avatar.equals(agent.avatar);
    }

    public final int hashCode() {
        return this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Agent(id=", this.id, ", title=", this.title, ", subtitle=");
        m.append(this.subtitle);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(")");
        return m.toString();
    }
}
