package androidx.compose.runtime;

import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class DynamicProvidableCompositionLocal extends ProvidableCompositionLocal {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object policy;

    public DynamicProvidableCompositionLocal(Function1 function1) {
        super(new InvalidationTracker$$ExternalSyntheticLambda0(14));
        this.policy = new ComputedValueHolder(function1);
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final ProvidedValue defaultProvidedValue$runtime(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return new ProvidedValue(this, obj, obj == null, (SnapshotMutationPolicy) this.policy, null, null, true);
            default:
                return new ProvidedValue(this, obj, obj == null, null, null, null, true);
        }
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public ValueHolder getDefaultValueHolder$runtime() {
        switch (this.$r8$classId) {
            case 1:
                return (ComputedValueHolder) this.policy;
            default:
                return super.getDefaultValueHolder$runtime();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicProvidableCompositionLocal(Function0 function0) {
        super(function0);
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE$3;
        this.policy = neverEqualPolicy;
    }
}
