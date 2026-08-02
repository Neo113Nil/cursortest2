package androidx.paging;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class GenerationalViewportHint {
    public final int generationId;
    public final ViewportHint hint;

    public GenerationalViewportHint(int i, ViewportHint viewportHint) {
        viewportHint.getClass();
        this.generationId = i;
        this.hint = viewportHint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerationalViewportHint)) {
            return false;
        }
        GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) obj;
        return this.generationId == generationalViewportHint.generationId && Intrinsics.areEqual(this.hint, generationalViewportHint.hint);
    }

    public final int hashCode() {
        return this.hint.hashCode() + (Integer.hashCode(this.generationId) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.generationId + ", hint=" + this.hint + ')';
    }
}
