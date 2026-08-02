package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CompositionLocalContext {
    public final PersistentCompositionLocalHashMap compositionLocals;

    public CompositionLocalContext(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
        this.compositionLocals = persistentCompositionLocalHashMap;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CompositionLocalContext) && Intrinsics.areEqual(((CompositionLocalContext) obj).compositionLocals, this.compositionLocals);
    }

    public final PersistentCompositionLocalHashMap getCompositionLocals$runtime() {
        return this.compositionLocals;
    }

    public final int hashCode() {
        return this.compositionLocals.hashCode();
    }
}
