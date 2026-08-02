package app.cash.redwood.treehouse;

import app.cash.redwood.leaks.NoOpLeakDetector;
import app.cash.redwood.treehouse.CodeState;
import app.cash.redwood.treehouse.ViewState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import com.fillr.m1;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class TreehouseAppContent implements CodeSession$Listener {
    public final RealTreehouseApp$codeHost$1 codeHost;
    public final AndroidTreehouseDispatchers dispatchers;
    public final StateFlowImpl externalStateFlow;
    public final StateFlowImpl internalStateFlow;
    public final NoOpLeakDetector leakDetector;
    public final CashTreehouseLayout$$ExternalSyntheticLambda3 source;

    public TreehouseAppContent(RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1, AndroidTreehouseDispatchers androidTreehouseDispatchers, CashTreehouseLayout$$ExternalSyntheticLambda3 cashTreehouseLayout$$ExternalSyntheticLambda3, NoOpLeakDetector noOpLeakDetector) {
        realTreehouseApp$codeHost$1.getClass();
        this.codeHost = realTreehouseApp$codeHost$1;
        this.dispatchers = androidTreehouseDispatchers;
        this.source = cashTreehouseLayout$$ExternalSyntheticLambda3;
        this.leakDetector = noOpLeakDetector;
        this.internalStateFlow = FlowKt.MutableStateFlow(new InternalState(ViewState.None.INSTANCE, new CodeState.Idle(null, 0)));
        this.externalStateFlow = FlowKt.MutableStateFlow(new Content$State(0, 0, null, false));
    }

    public final void bind(TreehouseLayout treehouseLayout) {
        treehouseLayout.getClass();
        AndroidTreehouseDispatchers.checkUi();
        StateFlowImpl stateFlowImpl = this.internalStateFlow;
        if (((InternalState) stateFlowImpl.getValue()).viewState.equals(new ViewState.Bound(treehouseLayout))) {
            return;
        }
        m1 m1Var = treehouseLayout.onBackPressedDispatcher;
        StateFlowImpl stateFlowImpl2 = treehouseLayout.mutableUiConfiguration;
        m1Var.getClass();
        stateFlowImpl2.getClass();
        AndroidTreehouseDispatchers.checkUi();
        InternalState internalState = (InternalState) stateFlowImpl.getValue();
        boolean equals = internalState.viewState.equals(new ViewState.Preloading(m1Var, stateFlowImpl2));
        StateFlowImpl stateFlowImpl3 = this.externalStateFlow;
        if (!equals) {
            if (!(internalState.viewState instanceof ViewState.None)) {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return;
            }
            ViewState.Preloading preloading = new ViewState.Preloading(m1Var, stateFlowImpl2);
            RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = this.codeHost;
            ZiplineCodeSession codeSession = realTreehouseApp$codeHost$1.state.getCodeSession();
            CodeState codeState = internalState.codeState;
            if ((codeState instanceof CodeState.Idle) && codeSession != null) {
                CodeState.Idle idle = (CodeState.Idle) codeState;
                codeState = new CodeState.Running(idle.loadCount + 1, idle.lastUncaughtException, startViewCodeContentBinding(codeSession, m1Var, stateFlowImpl2), 0);
            }
            AndroidTreehouseDispatchers.checkUi();
            realTreehouseApp$codeHost$1.listeners.add(this);
            stateFlowImpl.updateState(null, new InternalState(preloading, codeState));
            Content$State asState = codeState.asState();
            stateFlowImpl3.getClass();
            stateFlowImpl3.updateState(null, asState);
        }
        InternalState internalState2 = (InternalState) stateFlowImpl.getValue();
        ViewState viewState = internalState2.viewState;
        CodeState codeState2 = internalState2.codeState;
        if (!(viewState instanceof ViewState.Preloading)) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        ViewState.Bound bound = new ViewState.Bound(treehouseLayout);
        if (codeState2 instanceof CodeState.Idle) {
            TreehouseAppContentKt.access$showLoading(treehouseLayout);
        } else {
            if (!(codeState2 instanceof CodeState.Running)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            ((CodeState.Running) codeState2).viewContentCodeBinding.initView(treehouseLayout, true);
        }
        CodeState codeState3 = ((InternalState) stateFlowImpl.getValue()).codeState;
        InternalState internalState3 = new InternalState(bound, codeState3);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, internalState3);
        Content$State asState2 = codeState3.asState();
        stateFlowImpl3.getClass();
        stateFlowImpl3.updateState(null, asState2);
    }

    public final void codeSessionStopped(Throwable th) {
        AndroidTreehouseDispatchers.checkUi();
        StateFlowImpl stateFlowImpl = this.internalStateFlow;
        InternalState internalState = (InternalState) stateFlowImpl.getValue();
        ViewState viewState = internalState.viewState;
        CodeState codeState = internalState.codeState;
        if (!(codeState instanceof CodeState.Running)) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        CodeState.Running running = (CodeState.Running) codeState;
        ViewContentCodeBinding viewContentCodeBinding = running.viewContentCodeBinding;
        viewContentCodeBinding.cancel(th);
        viewContentCodeBinding.codeSession.removeListener(this);
        CodeState.Idle idle = new CodeState.Idle(th, running.loadCount);
        InternalState internalState2 = new InternalState(viewState, idle);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, internalState2);
        Content$State asState = idle.asState();
        StateFlowImpl stateFlowImpl2 = this.externalStateFlow;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, asState);
    }

    @Override // app.cash.redwood.treehouse.CodeSession$Listener
    public final void onStop(ZiplineCodeSession ziplineCodeSession) {
        codeSessionStopped(null);
    }

    @Override // app.cash.redwood.treehouse.CodeSession$Listener
    public final void onUncaughtException(ZiplineCodeSession ziplineCodeSession, Throwable th) {
        th.getClass();
        codeSessionStopped(th);
    }

    public final ViewContentCodeBinding startViewCodeContentBinding(ZiplineCodeSession ziplineCodeSession, m1 m1Var, StateFlow stateFlow) {
        AndroidTreehouseDispatchers.checkUi();
        ziplineCodeSession.getClass();
        AndroidTreehouseDispatchers.checkUi();
        ziplineCodeSession.listeners.add(this);
        StateFlowImpl stateFlowImpl = this.externalStateFlow;
        NoOpLeakDetector noOpLeakDetector = this.leakDetector;
        RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = this.codeHost;
        AndroidTreehouseDispatchers androidTreehouseDispatchers = this.dispatchers;
        ViewContentCodeBinding viewContentCodeBinding = new ViewContentCodeBinding(realTreehouseApp$codeHost$1, androidTreehouseDispatchers, this.source, this.internalStateFlow, stateFlowImpl, ziplineCodeSession, m1Var, stateFlow, noOpLeakDetector);
        JobKt.launch$default(viewContentCodeBinding.bindingScope, androidTreehouseDispatchers.zipline, null, new RealImageLoader$execute$2(viewContentCodeBinding, null), 2);
        return viewContentCodeBinding;
    }

    public final void unbind() {
        AndroidTreehouseDispatchers.checkUi();
        StateFlowImpl stateFlowImpl = this.internalStateFlow;
        InternalState internalState = (InternalState) stateFlowImpl.getValue();
        ViewState viewState = internalState.viewState;
        CodeState codeState = internalState.codeState;
        if (viewState instanceof ViewState.None) {
            return;
        }
        CodeState.Idle idle = new CodeState.Idle(codeState.getLastUncaughtException(), codeState.getLoadCount());
        RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = this.codeHost;
        realTreehouseApp$codeHost$1.getClass();
        AndroidTreehouseDispatchers.checkUi();
        realTreehouseApp$codeHost$1.listeners.remove(this);
        if (codeState instanceof CodeState.Running) {
            ViewContentCodeBinding viewContentCodeBinding = ((CodeState.Running) codeState).viewContentCodeBinding;
            viewContentCodeBinding.cancel(null);
            viewContentCodeBinding.codeSession.removeListener(this);
        }
        InternalState internalState2 = new InternalState(ViewState.None.INSTANCE, idle);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, internalState2);
        Content$State asState = idle.asState();
        StateFlowImpl stateFlowImpl2 = this.externalStateFlow;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, asState);
    }
}
