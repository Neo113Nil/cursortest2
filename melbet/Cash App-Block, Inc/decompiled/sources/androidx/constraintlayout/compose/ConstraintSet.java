package androidx.constraintlayout.compose;

import java.util.List;

/* loaded from: classes3.dex */
public interface ConstraintSet {
    void applyTo(State state, List list);

    default boolean isDirty(List list) {
        return true;
    }
}
