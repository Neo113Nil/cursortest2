package androidx.constraintlayout.compose;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class DslConstraintSet implements ConstraintSet {
    public final Function1 description;
    public final ConstraintSetScope scope;

    public DslConstraintSet(Function1 function1) {
        this.description = function1;
        ConstraintSetScope constraintSetScope = new ConstraintSetScope(null);
        function1.invoke(constraintSetScope);
        this.scope = constraintSetScope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final void applyTo(State state, List list) {
        this.scope.applyTo(state);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DslConstraintSet)) {
            return false;
        }
        return Intrinsics.areEqual(this.scope, ((DslConstraintSet) obj).scope);
    }

    public final int hashCode() {
        return this.scope.containerObject.hashCode();
    }
}
