package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DynamicValueHolder implements ValueHolder {
    public final MutableState state;

    public DynamicValueHolder(MutableState mutableState) {
        this.state = mutableState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicValueHolder) && Intrinsics.areEqual(this.state, ((DynamicValueHolder) obj).state);
    }

    public final int hashCode() {
        return this.state.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final Object readValue(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
        return this.state.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final ProvidedValue toProvided(ProvidableCompositionLocal providableCompositionLocal) {
        return new ProvidedValue(providableCompositionLocal, null, false, null, this.state, null, true);
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.state + ')';
    }
}
