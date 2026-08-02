package androidx.compose.ui.text.font;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AsyncTypefaceCache$AsyncTypefaceResult {
    public final Object result;

    public final boolean equals(Object obj) {
        if (obj instanceof AsyncTypefaceCache$AsyncTypefaceResult) {
            return Intrinsics.areEqual(this.result, ((AsyncTypefaceCache$AsyncTypefaceResult) obj).result);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.result;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.result + ')';
    }
}
