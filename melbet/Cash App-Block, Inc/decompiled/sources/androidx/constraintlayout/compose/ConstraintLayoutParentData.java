package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdParentData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ConstraintLayoutParentData implements LayoutIdParentData {
    public final Function1 constrain;
    public final Object layoutId;
    public final ConstrainedLayoutReference ref;

    public ConstraintLayoutParentData(ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
        this.ref = constrainedLayoutReference;
        this.constrain = function1;
        this.layoutId = constrainedLayoutReference.id;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConstraintLayoutParentData)) {
            return false;
        }
        ConstraintLayoutParentData constraintLayoutParentData = (ConstraintLayoutParentData) obj;
        return Intrinsics.areEqual(this.ref.id, constraintLayoutParentData.ref.id) && this.constrain == constraintLayoutParentData.constrain;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public final Object getLayoutId() {
        return this.layoutId;
    }

    public final int hashCode() {
        return this.constrain.hashCode() + (this.ref.id.hashCode() * 31);
    }
}
