package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;

/* loaded from: classes.dex */
public interface ValueHolder {
    Object readValue(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap);

    ProvidedValue toProvided(ProvidableCompositionLocal providableCompositionLocal);
}
