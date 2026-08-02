package androidx.work.impl.constraints.controllers;

import androidx.work.Constraints;
import androidx.work.impl.constraints.trackers.BatteryNotLowTracker;
import androidx.work.impl.model.WorkSpec;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class BatteryNotLowController implements ConstraintController {
    public final /* synthetic */ int $r8$classId;
    public final int reason;
    public final BatteryNotLowTracker tracker;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryNotLowController(BatteryNotLowTracker batteryNotLowTracker, int i) {
        this(batteryNotLowTracker, (byte) 0, false);
        this.$r8$classId = i;
        batteryNotLowTracker.getClass();
        switch (i) {
            case 2:
                this(batteryNotLowTracker, (byte) 0, false);
                this.reason = 9;
                break;
            default:
                this.reason = 6;
                break;
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean hasConstraint(WorkSpec workSpec) {
        switch (this.$r8$classId) {
            case 0:
                return workSpec.constraints.requiresBatteryNotLow;
            case 1:
                return workSpec.constraints.requiresCharging;
            default:
                return workSpec.constraints.requiresStorageNotLow;
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final CallbackFlowBuilder track(Constraints constraints) {
        constraints.getClass();
        return FlowKt.callbackFlow(new ZiplineLoader$ModuleJob$run$3(this, null, 3));
    }

    public BatteryNotLowController(BatteryNotLowTracker batteryNotLowTracker, byte b, boolean z) {
        batteryNotLowTracker.getClass();
        this.tracker = batteryNotLowTracker;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryNotLowController(BatteryNotLowTracker batteryNotLowTracker) {
        this(batteryNotLowTracker, (byte) 0, false);
        this.$r8$classId = 0;
        batteryNotLowTracker.getClass();
        this.reason = 5;
    }
}
