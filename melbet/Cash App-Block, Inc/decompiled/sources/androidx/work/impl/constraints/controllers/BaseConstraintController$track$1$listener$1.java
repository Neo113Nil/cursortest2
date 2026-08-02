package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintsState;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes3.dex */
public final class BaseConstraintController$track$1$listener$1 {
    public final /* synthetic */ ProducerScope $$this$callbackFlow;
    public final /* synthetic */ BatteryNotLowController this$0;

    public BaseConstraintController$track$1$listener$1(BatteryNotLowController batteryNotLowController, ProducerScope producerScope) {
        this.this$0 = batteryNotLowController;
        this.$$this$callbackFlow = producerScope;
    }

    public final void onConstraintChanged(Object obj) {
        boolean booleanValue;
        Object obj2;
        int i;
        BatteryNotLowController batteryNotLowController = this.this$0;
        switch (batteryNotLowController.$r8$classId) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        if (!booleanValue) {
            switch (batteryNotLowController.$r8$classId) {
                case 0:
                    i = batteryNotLowController.reason;
                    break;
                case 1:
                    i = batteryNotLowController.reason;
                    break;
                default:
                    i = batteryNotLowController.reason;
                    break;
            }
            obj2 = new ConstraintsState.ConstraintsNotMet(i);
        } else {
            obj2 = ConstraintsState.ConstraintsMet.INSTANCE;
        }
        ProducerCoroutine producerCoroutine = (ProducerCoroutine) this.$$this$callbackFlow;
        producerCoroutine.getClass();
        producerCoroutine.mo1159trySendJP2dKIU(obj2);
    }
}
