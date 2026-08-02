package androidx.glance.appwidget;

import androidx.glance.Emittable;
import androidx.glance.GlanceModifier;

/* loaded from: classes3.dex */
public final class EmittableIgnoreResult implements Emittable {
    public GlanceModifier modifier = GlanceModifier.Companion.$$INSTANCE;

    @Override // androidx.glance.Emittable
    public final Emittable copy() {
        EmittableIgnoreResult emittableIgnoreResult = new EmittableIgnoreResult();
        emittableIgnoreResult.modifier = this.modifier;
        return emittableIgnoreResult;
    }

    @Override // androidx.glance.Emittable
    public final GlanceModifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.glance.Emittable
    public final void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }
}
