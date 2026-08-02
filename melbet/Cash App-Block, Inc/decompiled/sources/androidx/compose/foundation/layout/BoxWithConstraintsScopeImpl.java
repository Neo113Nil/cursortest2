package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BoxWithConstraintsScopeImpl implements BoxScope {
    public final long constraints;
    public final Density density;

    public BoxWithConstraintsScopeImpl(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        this.density = subcomposeMeasureScope;
        this.constraints = j;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier align(Modifier modifier, Alignment alignment) {
        return modifier.then(new BoxChildDataElement(alignment, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return Intrinsics.areEqual(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m1019equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m257getConstraintsmsEJaDk() {
        return this.constraints;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m258getMaxHeightD9Ej5fM() {
        long j = this.constraints;
        if (!Constraints.m1020getHasBoundedHeightimpl(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.density.mo233toDpu2uoSUM(Constraints.m1024getMaxHeightimpl(j));
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m259getMaxWidthD9Ej5fM() {
        long j = this.constraints;
        if (!Constraints.m1021getHasBoundedWidthimpl(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.density.mo233toDpu2uoSUM(Constraints.m1025getMaxWidthimpl(j));
    }

    public final int hashCode() {
        return Long.hashCode(this.constraints) + (this.density.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier matchParentSize() {
        return new BoxChildDataElement(Alignment.Companion.Center, true);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m1029toStringimpl(this.constraints)) + ')';
    }
}
