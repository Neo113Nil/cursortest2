package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class NetworkRequestConstraintController implements ConstraintController {
    public final ConnectivityManager connManager;

    public NetworkRequestConstraintController(ConnectivityManager connectivityManager) {
        this.connManager = connectivityManager;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean hasConstraint(WorkSpec workSpec) {
        return (workSpec.constraints.getRequiredNetworkRequest() == null && workSpec.constraints.requiredNetworkType == NetworkType.NOT_REQUIRED) ? false : true;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final CallbackFlowBuilder track(Constraints constraints) {
        constraints.getClass();
        return FlowKt.callbackFlow(new DataStoreImpl$data$1(constraints, this, (Continuation) null, 13));
    }
}
