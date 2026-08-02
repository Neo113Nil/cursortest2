package androidx.glance.action;

import androidx.glance.GlanceModifier;

/* loaded from: classes3.dex */
public final class ActionModifier implements GlanceModifier.Element {
    public final Action action;

    public ActionModifier(Action action) {
        this.action = action;
    }

    public final String toString() {
        return "ActionModifier(action=" + this.action + ", rippleOverride=0)";
    }
}
