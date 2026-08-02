package androidx.compose.runtime;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class StaticValueHolder implements ValueHolder {
    public final Object value;

    public StaticValueHolder(Object obj) {
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && Intrinsics.areEqual(this.value, ((StaticValueHolder) obj).value);
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final Object readValue(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
        return this.value;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final ProvidedValue toProvided(ProvidableCompositionLocal providableCompositionLocal) {
        Object obj = this.value;
        return new ProvidedValue(providableCompositionLocal, obj, obj == null, null, null, null, false);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("StaticValueHolder(value="), this.value, ')');
    }
}
