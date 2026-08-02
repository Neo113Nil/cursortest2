package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal {
    public final LazyValueHolder defaultValueHolder;

    public ProvidableCompositionLocal(Function0 function0) {
        this.defaultValueHolder = new LazyValueHolder(function0);
    }

    public abstract ProvidedValue defaultProvidedValue$runtime(Object obj);

    public ValueHolder getDefaultValueHolder$runtime() {
        return this.defaultValueHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        if (r2 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0034, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0040, code lost:
    
        if (r2 == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ValueHolder updatedStateOf$runtime(ProvidedValue providedValue, ValueHolder valueHolder) {
        DynamicValueHolder dynamicValueHolder;
        DynamicValueHolder dynamicValueHolder2 = null;
        if (valueHolder instanceof DynamicValueHolder) {
            if (providedValue.isDynamic) {
                dynamicValueHolder2 = (DynamicValueHolder) valueHolder;
                dynamicValueHolder2.state.setValue(providedValue.getEffectiveValue$runtime());
            }
        } else if (valueHolder instanceof StaticValueHolder) {
            if ((providedValue.explicitNull || providedValue.providedValue != null) && !providedValue.isDynamic) {
                StaticValueHolder staticValueHolder = (StaticValueHolder) valueHolder;
                boolean areEqual = Intrinsics.areEqual(providedValue.getEffectiveValue$runtime(), staticValueHolder.value);
                dynamicValueHolder = staticValueHolder;
            }
        } else if (valueHolder instanceof ComputedValueHolder) {
            Function1 function1 = providedValue.compute;
            ComputedValueHolder computedValueHolder = (ComputedValueHolder) valueHolder;
            Function1 function12 = computedValueHolder.compute;
            dynamicValueHolder = computedValueHolder;
        }
        if (dynamicValueHolder2 != null) {
            return dynamicValueHolder2;
        }
        boolean z = providedValue.isDynamic;
        MutableState mutableState = providedValue.state;
        if (!z) {
            Function1 function13 = providedValue.compute;
            return function13 != null ? new ComputedValueHolder(function13) : mutableState != null ? new DynamicValueHolder(mutableState) : new StaticValueHolder(providedValue.getEffectiveValue$runtime());
        }
        if (mutableState == null) {
            Object obj = providedValue.providedValue;
            SnapshotMutationPolicy snapshotMutationPolicy = providedValue.mutationPolicy;
            if (snapshotMutationPolicy == null) {
                snapshotMutationPolicy = NeverEqualPolicy.INSTANCE$3;
            }
            mutableState = new ParcelableSnapshotMutableState(obj, snapshotMutationPolicy);
        }
        return new DynamicValueHolder(mutableState);
    }
}
