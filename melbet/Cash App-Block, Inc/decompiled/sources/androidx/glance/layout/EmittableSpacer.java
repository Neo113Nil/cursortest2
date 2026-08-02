package androidx.glance.layout;

import androidx.glance.Emittable;
import androidx.glance.GlanceModifier;

/* loaded from: classes3.dex */
public final class EmittableSpacer implements Emittable {
    public GlanceModifier modifier = GlanceModifier.Companion.$$INSTANCE;

    @Override // androidx.glance.Emittable
    public final Emittable copy() {
        EmittableSpacer emittableSpacer = new EmittableSpacer();
        emittableSpacer.modifier = this.modifier;
        return emittableSpacer;
    }

    @Override // androidx.glance.Emittable
    public final GlanceModifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.glance.Emittable
    public final void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.modifier + ')';
    }
}
