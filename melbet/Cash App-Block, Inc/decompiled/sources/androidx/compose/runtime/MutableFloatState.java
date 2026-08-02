package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface MutableFloatState extends MutableState, State {
    @Override // androidx.compose.runtime.State
    default Object getValue() {
        return Float.valueOf(((ParcelableSnapshotMutableFloatState) this).getFloatValue());
    }

    @Override // androidx.compose.runtime.MutableState
    default void setValue(Object obj) {
        ((ParcelableSnapshotMutableFloatState) this).setFloatValue(((Number) obj).floatValue());
    }
}
