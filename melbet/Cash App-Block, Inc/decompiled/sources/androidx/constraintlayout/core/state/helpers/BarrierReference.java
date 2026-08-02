package androidx.constraintlayout.core.state.helpers;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* loaded from: classes3.dex */
public final class BarrierReference extends HelperReference {
    public Barrier mBarrierWidget;
    public int mDirection;
    public int mMargin;

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        getHelperWidget();
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mDirection);
        int i = 1;
        if (ordinal != 1 && ordinal != 3) {
            i = ordinal != 4 ? ordinal != 5 ? 0 : 3 : 2;
        }
        Barrier barrier = this.mBarrierWidget;
        barrier.mBarrierType = i;
        barrier.mMargin = this.mMargin;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public final HelperWidget getHelperWidget() {
        if (this.mBarrierWidget == null) {
            this.mBarrierWidget = new Barrier();
        }
        return this.mBarrierWidget;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public final ConstraintReference margin(Float f) {
        this.mMargin = this.mHelperState.convertDimension(f);
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public final ConstraintReference margin(int i) {
        this.mMargin = i;
        return this;
    }
}
