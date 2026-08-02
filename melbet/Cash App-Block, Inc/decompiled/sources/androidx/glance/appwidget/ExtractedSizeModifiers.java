package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ExtractedSizeModifiers {
    public final GlanceModifier nonSizeModifiers;
    public final GlanceModifier sizeModifiers;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ExtractedSizeModifiers(GlanceModifier glanceModifier, int i) {
        this(r0, r3 != 0 ? r0 : glanceModifier);
        int i2 = i & 2;
        GlanceModifier.Companion companion = GlanceModifier.Companion.$$INSTANCE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtractedSizeModifiers)) {
            return false;
        }
        ExtractedSizeModifiers extractedSizeModifiers = (ExtractedSizeModifiers) obj;
        return Intrinsics.areEqual(this.sizeModifiers, extractedSizeModifiers.sizeModifiers) && Intrinsics.areEqual(this.nonSizeModifiers, extractedSizeModifiers.nonSizeModifiers);
    }

    public final int hashCode() {
        return this.nonSizeModifiers.hashCode() + (this.sizeModifiers.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.sizeModifiers + ", nonSizeModifiers=" + this.nonSizeModifiers + ')';
    }

    public ExtractedSizeModifiers(GlanceModifier glanceModifier, GlanceModifier glanceModifier2) {
        this.sizeModifiers = glanceModifier;
        this.nonSizeModifiers = glanceModifier2;
    }
}
