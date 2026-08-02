package androidx.compose.runtime;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ProvidedValue {
    public boolean canOverride = true;
    public final ProvidableCompositionLocal compositionLocal;
    public final Function1 compute;
    public final boolean explicitNull;
    public final boolean isDynamic;
    public final SnapshotMutationPolicy mutationPolicy;
    public final Object providedValue;
    public final MutableState state;

    public ProvidedValue(ProvidableCompositionLocal providableCompositionLocal, Object obj, boolean z, SnapshotMutationPolicy snapshotMutationPolicy, MutableState mutableState, Function1 function1, boolean z2) {
        this.compositionLocal = providableCompositionLocal;
        this.explicitNull = z;
        this.mutationPolicy = snapshotMutationPolicy;
        this.state = mutableState;
        this.compute = function1;
        this.isDynamic = z2;
        this.providedValue = obj;
    }

    public final Object getEffectiveValue$runtime() {
        if (this.explicitNull) {
            return null;
        }
        MutableState mutableState = this.state;
        if (mutableState != null) {
            return mutableState.getValue();
        }
        Object obj = this.providedValue;
        if (obj != null) {
            return obj;
        }
        ComposerKt.composeRuntimeError("Unexpected form of a provided value");
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
        return null;
    }
}
