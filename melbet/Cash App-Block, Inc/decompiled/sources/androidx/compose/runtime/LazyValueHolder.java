package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LazyValueHolder implements ValueHolder {
    public final Lazy current$delegate;

    public LazyValueHolder(Function0 function0) {
        this.current$delegate = LazyKt.lazy(function0);
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final Object readValue(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
        return this.current$delegate.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final ProvidedValue toProvided(ProvidableCompositionLocal providableCompositionLocal) {
        ComposerKt.composeRuntimeError("Cannot produce a provider from a lazy value holder");
        throw new KotlinNothingValueException();
    }
}
