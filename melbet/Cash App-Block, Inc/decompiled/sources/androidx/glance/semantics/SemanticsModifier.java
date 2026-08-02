package androidx.glance.semantics;

import androidx.glance.GlanceModifier;

/* loaded from: classes3.dex */
public final class SemanticsModifier implements GlanceModifier.Element {
    public final SemanticsConfiguration configuration;

    public SemanticsModifier(SemanticsConfiguration semanticsConfiguration) {
        this.configuration = semanticsConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SemanticsModifier) && this.configuration == ((SemanticsModifier) obj).configuration;
    }

    public final int hashCode() {
        return this.configuration.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.configuration + ')';
    }
}
