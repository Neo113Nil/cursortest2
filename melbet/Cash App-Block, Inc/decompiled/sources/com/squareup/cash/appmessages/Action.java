package com.squareup.cash.appmessages;

import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Action {
    public final Color color;
    public final AppMessageViewEvent eventToTrigger;
    public final String text;

    public Action(String str, Color color, AppMessageViewEvent appMessageViewEvent) {
        str.getClass();
        this.text = str;
        this.color = color;
        this.eventToTrigger = appMessageViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Intrinsics.areEqual(this.text, action.text) && Intrinsics.areEqual(this.color, action.color) && this.eventToTrigger.equals(action.eventToTrigger);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Color color = this.color;
        return this.eventToTrigger.hashCode() + ((hashCode + (color == null ? 0 : color.hashCode())) * 31);
    }

    public final String toString() {
        return "Action(text=" + this.text + ", color=" + this.color + ", eventToTrigger=" + this.eventToTrigger + ")";
    }
}
