package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SkippableUpdater {
    public final Composer composer;

    public final boolean equals(Object obj) {
        if (obj instanceof SkippableUpdater) {
            return Intrinsics.areEqual(this.composer, ((SkippableUpdater) obj).composer);
        }
        return false;
    }

    public final int hashCode() {
        return this.composer.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.composer + ')';
    }
}
