package androidx.constraintlayout.core.state;

import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public class HelperReference extends ConstraintReference implements Facade {
    public final State mHelperState;
    public final ArrayList mReferences;
    public final int mType;

    public HelperReference(State state, int i) {
        super(state);
        this.mReferences = new ArrayList();
        this.mHelperState = state;
        this.mType = i;
    }

    public final void add(Object... objArr) {
        Collections.addAll(this.mReferences, objArr);
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
    }

    public final void applyBase() {
        super.apply();
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final ConstraintWidget getConstraintWidget() {
        return getHelperWidget();
    }

    public HelperWidget getHelperWidget() {
        return null;
    }
}
