package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ConstrainedLayoutReference {
    public final ConstraintLayoutBaseScope.HorizontalAnchor bottom;
    public final ConstraintLayoutBaseScope.VerticalAnchor end;
    public final Object id;
    public final Object id$1;
    public final ConstraintLayoutBaseScope.VerticalAnchor start;
    public final ConstraintLayoutBaseScope.HorizontalAnchor top;

    public ConstrainedLayoutReference(Object obj) {
        this.id$1 = obj;
        new LinkedHashMap();
        this.id = obj;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -2, this);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 0, this);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -1, this);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 1, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConstrainedLayoutReference) {
            return Intrinsics.areEqual(this.id, ((ConstrainedLayoutReference) obj).id);
        }
        return false;
    }

    public final int hashCode() {
        return this.id.hashCode();
    }
}
