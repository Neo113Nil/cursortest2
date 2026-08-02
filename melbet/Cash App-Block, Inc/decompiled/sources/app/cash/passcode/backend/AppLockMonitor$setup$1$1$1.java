package app.cash.passcode.backend;

import app.cash.broadway.ui.Ui;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.Navigation;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final /* synthetic */ class AppLockMonitor$setup$1$1$1 implements FlowCollector, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $tmp0;

    public /* synthetic */ AppLockMonitor$setup$1$1$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$tmp0 = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$tmp0;
        switch (i) {
            case 0:
                ((RealAppLockState) obj2).sendEvent((RealAppLockState.AppLockEvent) obj);
                Unit unit = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit;
            case 1:
                ((Ui) obj2).setModel(obj);
                Unit unit2 = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit2;
            default:
                ((BetterNavigator) obj2).goToFromQueue((Navigation) obj);
                Unit unit3 = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit3;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        int i = this.$r8$classId;
        Object obj = this.$tmp0;
        switch (i) {
            case 0:
                return new AdaptedFunctionReference(2, 4, RealAppLockState.class, (RealAppLockState) obj, "sendEvent", "sendEvent(Lapp/cash/passcode/backend/RealAppLockState$AppLockEvent;)V");
            case 1:
                return new AdaptedFunctionReference(2, 4, Ui.class, (Ui) obj, "setModel", "setModel(Ljava/lang/Object;)V");
            default:
                return new AdaptedFunctionReference(2, 4, BetterNavigator.class, (BetterNavigator) obj, "goToFromQueue", "goToFromQueue(Lcom/squareup/cash/core/navigationcontainer/navigator/Navigation;)V");
        }
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }
}
