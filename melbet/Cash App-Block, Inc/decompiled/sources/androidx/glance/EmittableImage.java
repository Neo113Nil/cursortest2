package androidx.glance;

import androidx.glance.GlanceModifier;
import androidx.glance.layout.ContentScale;

/* loaded from: classes3.dex */
public final class EmittableImage implements Emittable {
    public ImageProvider provider;
    public GlanceModifier modifier = GlanceModifier.Companion.$$INSTANCE;
    public int contentScale = 1;

    @Override // androidx.glance.Emittable
    public final Emittable copy() {
        EmittableImage emittableImage = new EmittableImage();
        emittableImage.modifier = this.modifier;
        emittableImage.provider = this.provider;
        emittableImage.contentScale = this.contentScale;
        return emittableImage;
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
        return "EmittableImage(modifier=" + this.modifier + ", provider=" + this.provider + ", colorFilterParams=null, contentScale=" + ((Object) ContentScale.m1127toStringimpl(this.contentScale)) + ')';
    }
}
