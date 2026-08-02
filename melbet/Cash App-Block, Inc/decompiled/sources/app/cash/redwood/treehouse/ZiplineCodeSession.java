package app.cash.redwood.treehouse;

import app.cash.arcade.protocol.host.ArcadeHostProtocol;
import app.cash.redwood.leaks.NoOpLeakDetector;
import app.cash.zipline.Zipline;
import app.cash.zipline.ZiplineScope;
import coil3.Extras;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.treehouse.ui.PathRoutableAppService$Companion$Adapter$GeneratedOutboundService;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public final class ZiplineCodeSession {
    public volatile String _guestProtocolVersion;
    public final PathRoutableAppService$Companion$Adapter$GeneratedOutboundService appService;
    public final AndroidTreehouseDispatchers dispatchers;
    public final SVG eventPublisher;
    public final Extras.Key frameClockFactory;
    public final ArcadeHostProtocol hostProtocol;
    public final NoOpLeakDetector leakDetector;
    public final ArrayList listeners;
    public final ContextScope scope;
    public boolean stopped;
    public final Zipline zipline;
    public final ZiplineScope ziplineScope;

    public ZiplineCodeSession(AndroidTreehouseDispatchers androidTreehouseDispatchers, SVG svg, ContextScope contextScope, PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, Extras.Key key, Zipline zipline, NoOpLeakDetector noOpLeakDetector, ArcadeHostProtocol arcadeHostProtocol) {
        zipline.getClass();
        this.dispatchers = androidTreehouseDispatchers;
        this.eventPublisher = svg;
        this.appService = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService;
        this.listeners = new ArrayList();
        this.scope = JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(new SupervisorJobImpl(JobKt.getJob(contextScope.coroutineContext)), new CoroutineExceptionHandler() { // from class: app.cash.redwood.treehouse.CodeSession$scope$1$coroutineExceptionHandler$1
            @Override // kotlin.coroutines.CoroutineContext
            public final Object fold(Object obj, Function2 function2) {
                return function2.invoke(obj, this);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final CoroutineContext.Element get(CoroutineContext.Key key2) {
                return CoroutineContext.Element.DefaultImpls.get(this, key2);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public final CoroutineContext.Key getKey() {
                return CoroutineExceptionHandler.Key.$$INSTANCE;
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public final void handleException(CoroutineContext coroutineContext, Throwable th) {
                coroutineContext.getClass();
                th.getClass();
                ZiplineCodeSession.this.handleUncaughtException(th);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final CoroutineContext minusKey(CoroutineContext.Key key2) {
                return CoroutineContext.Element.DefaultImpls.minusKey(this, key2);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final CoroutineContext plus(CoroutineContext coroutineContext) {
                return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
            }
        }));
        this.frameClockFactory = key;
        this.zipline = zipline;
        this.leakDetector = noOpLeakDetector;
        this.hostProtocol = arcadeHostProtocol;
        this.ziplineScope = new ZiplineScope();
    }

    public final void handleUncaughtException(Throwable th) {
        th.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(this.scope, MainDispatcherLoader.dispatcher, null, new EventBridge$sendEvent$1(this, th, null, 20), 2);
        EventListener eventListener = (EventListener) this.eventPublisher.rootElement;
        eventListener.getClass();
        eventListener.uncaughtException(th);
    }

    public final void removeListener(CodeSession$Listener codeSession$Listener) {
        codeSession$Listener.getClass();
        AndroidTreehouseDispatchers.checkUi();
        this.listeners.remove(codeSession$Listener);
    }

    public final void stop() {
        AndroidTreehouseDispatchers.checkUi();
        if (this.stopped) {
            return;
        }
        this.stopped = true;
        int i = 0;
        for (CodeSession$Listener codeSession$Listener : (CodeSession$Listener[]) this.listeners.toArray(new CodeSession$Listener[0])) {
            codeSession$Listener.onStop(this);
        }
        JobKt.launch(this.scope, this.dispatchers.zipline, CoroutineStart.ATOMIC, new CodeSession$stop$1(this, null, i));
    }
}
