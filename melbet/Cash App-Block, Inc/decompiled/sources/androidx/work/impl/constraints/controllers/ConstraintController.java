package androidx.work.impl.constraints.controllers;

import androidx.work.Constraints;
import androidx.work.impl.model.WorkSpec;
import kotlinx.coroutines.flow.CallbackFlowBuilder;

/* loaded from: classes.dex */
public interface ConstraintController {
    boolean hasConstraint(WorkSpec workSpec);

    CallbackFlowBuilder track(Constraints constraints);
}
