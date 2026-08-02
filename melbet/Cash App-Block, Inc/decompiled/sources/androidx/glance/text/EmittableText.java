package androidx.glance.text;

import androidx.glance.Emittable;
import androidx.glance.GlanceModifier;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class EmittableText implements Emittable {
    public TextStyle style;
    public String text = "";
    public int maxLines = Integer.MAX_VALUE;
    public GlanceModifier modifier = GlanceModifier.Companion.$$INSTANCE;

    @Override // androidx.glance.Emittable
    public final Emittable copy() {
        EmittableText emittableText = new EmittableText();
        emittableText.modifier = this.modifier;
        emittableText.text = this.text;
        emittableText.style = this.style;
        emittableText.maxLines = this.maxLines;
        return emittableText;
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
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.text);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", modifier=");
        sb.append(this.modifier);
        sb.append(", maxLines=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.maxLines, ')');
    }
}
