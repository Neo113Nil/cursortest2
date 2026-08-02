package app.cash.redwood.treehouse;

import androidx.room.Room;
import androidx.work.impl.StartStopTokensImpl;
import com.squareup.cash.treehouse.platform.CashTreehouseAppFactory;
import java.io.Closeable;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class RealTreehouseApp$codeHost$1 implements Closeable {
    public final ContextScope appScope;
    public final AndroidTreehouseDispatchers dispatchers;
    public CashTreehouseAppFactory.LauncherEventListenerFactory eventListenerFactory;
    public final StartStopTokensImpl stateStore;
    public final /* synthetic */ RealTreehouseApp this$0;
    public final ArrayList listeners = new ArrayList();
    public Room state = new CodeHost$State$Idle();
    public final StateFlowImpl mutableZipline = FlowKt.MutableStateFlow(null);
    public final CodeHost$codeSessionListener$1 codeSessionListener = new CodeSession$Listener() { // from class: app.cash.redwood.treehouse.CodeHost$codeSessionListener$1
        @Override // app.cash.redwood.treehouse.CodeSession$Listener
        public final void onStop(ZiplineCodeSession ziplineCodeSession) {
            AndroidTreehouseDispatchers.checkUi();
            ziplineCodeSession.removeListener(this);
            RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = RealTreehouseApp$codeHost$1.this;
            Room room = realTreehouseApp$codeHost$1.state;
            if (room instanceof CodeHost$State$Running) {
                final CoroutineScope codeUpdatesScope = ((CodeHost$State$Running) room).getCodeUpdatesScope();
                realTreehouseApp$codeHost$1.state = new Room(codeUpdatesScope) { // from class: app.cash.redwood.treehouse.CodeHost$State$Crashed
                    public final CoroutineScope codeUpdatesScope;

                    {
                        codeUpdatesScope.getClass();
                        this.codeUpdatesScope = codeUpdatesScope;
                    }

                    @Override // androidx.room.Room
                    public final CoroutineScope getCodeUpdatesScope() {
                        return this.codeUpdatesScope;
                    }
                };
                realTreehouseApp$codeHost$1.mutableZipline.setValue(null);
            }
        }

        @Override // app.cash.redwood.treehouse.CodeSession$Listener
        public final void onUncaughtException(ZiplineCodeSession ziplineCodeSession, Throwable th) {
            th.getClass();
        }
    };

    /* JADX WARN: Type inference failed for: r2v5, types: [app.cash.redwood.treehouse.CodeHost$codeSessionListener$1] */
    public RealTreehouseApp$codeHost$1(CashTreehouseAppFactory.LauncherEventListenerFactory launcherEventListenerFactory, RealTreehouseApp realTreehouseApp, AndroidTreehouseDispatchers androidTreehouseDispatchers, ContextScope contextScope, StartStopTokensImpl startStopTokensImpl) {
        this.this$0 = realTreehouseApp;
        this.dispatchers = androidTreehouseDispatchers;
        this.appScope = contextScope;
        this.stateStore = startStopTokensImpl;
        this.eventListenerFactory = launcherEventListenerFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.eventListenerFactory = null;
    }
}
