package app.cash.redwood.treehouse;

import androidx.room.Room;
import androidx.work.impl.StartStopTokensImpl;
import app.cash.redwood.leaks.NoOpLeakDetector;
import app.cash.zipline.loader.LoaderEventListener$None;
import app.cash.zipline.loader.ManifestVerifier;
import app.cash.zipline.loader.ZiplineCache;
import app.cash.zipline.loader.ZiplineHttpClient;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.util.AndroidSystemCallbacks;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.internal.dag.ContextModule;
import com.squareup.cash.treehouse.platform.CashTreehouseAppFactory;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.internal.ContextScope;
import okio.Path;
import okio.assetfilesystem.AssetFileSystem;

/* loaded from: classes.dex */
public final class RealTreehouseApp implements AutoCloseable {
    public final ContextScope appScope;
    public final RealTreehouseApp$codeHost$1 codeHost;
    public final AndroidTreehouseDispatchers dispatchers;
    public CashTreehouseAppFactory.LauncherEventListenerFactory eventListenerFactory;
    public final Factory factory;
    public final NoOpLeakDetector leakDetector;
    public final String name;
    public AndroidSystemCallbacks spec;

    public final class Factory implements AutoCloseable {
        public final Lazy cache;
        public final String cacheName;
        public final Path embeddedDir;
        public final AssetFileSystem embeddedFileSystem;
        public final Extras.Key frameClockFactory;
        public final ZiplineHttpClient httpClient;
        public final NoOpLeakDetector leakDetector;
        public final LoaderEventListener$None loaderEventListener;
        public final ManifestVerifier manifestVerifier;
        public final ContextModule platform;
        public final StartStopTokensImpl stateStore;
        public final CoroutineDispatcher ziplineLoaderDispatcher;

        public Factory(ContextModule contextModule, ZiplineHttpClient ziplineHttpClient, Extras.Key key, ManifestVerifier manifestVerifier, AssetFileSystem assetFileSystem, Path path, String str, CoroutineDispatcher coroutineDispatcher, LoaderEventListener$None loaderEventListener$None, StartStopTokensImpl startStopTokensImpl, NoOpLeakDetector noOpLeakDetector) {
            coroutineDispatcher.getClass();
            this.platform = contextModule;
            this.httpClient = ziplineHttpClient;
            this.frameClockFactory = key;
            this.manifestVerifier = manifestVerifier;
            this.embeddedFileSystem = assetFileSystem;
            this.embeddedDir = path;
            this.cacheName = str;
            this.ziplineLoaderDispatcher = coroutineDispatcher;
            this.loaderEventListener = loaderEventListener$None;
            this.stateStore = startStopTokensImpl;
            this.leakDetector = noOpLeakDetector;
            this.cache = LazyKt.lazy(new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 23));
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            Lazy lazy = this.cache;
            if (lazy.isInitialized()) {
                ((ZiplineCache) lazy.getValue()).close();
            }
        }
    }

    public RealTreehouseApp(Factory factory, ContextScope contextScope, AndroidSystemCallbacks androidSystemCallbacks, AndroidTreehouseDispatchers androidTreehouseDispatchers, CashTreehouseAppFactory.LauncherEventListenerFactory launcherEventListenerFactory, NoOpLeakDetector noOpLeakDetector) {
        this.factory = factory;
        this.appScope = contextScope;
        this.dispatchers = androidTreehouseDispatchers;
        this.leakDetector = noOpLeakDetector;
        this.eventListenerFactory = launcherEventListenerFactory;
        this.codeHost = new RealTreehouseApp$codeHost$1(launcherEventListenerFactory, this, androidTreehouseDispatchers, contextScope, factory.stateStore);
        this.spec = androidSystemCallbacks;
        this.name = (String) androidSystemCallbacks.activityCallbacks;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AndroidTreehouseDispatchers.checkUi();
        this.spec = null;
        this.codeHost.eventListenerFactory = null;
        CashTreehouseAppFactory.LauncherEventListenerFactory launcherEventListenerFactory = this.eventListenerFactory;
        if (launcherEventListenerFactory != null) {
            Request$Priority$EnumUnboxingLocalUtility.m(launcherEventListenerFactory);
        }
        this.eventListenerFactory = null;
        stop();
        this.dispatchers.close();
    }

    public final void start() {
        RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = this.codeHost;
        CashTreehouseAppFactory.LauncherEventListenerFactory launcherEventListenerFactory = realTreehouseApp$codeHost$1.eventListenerFactory;
        if (launcherEventListenerFactory == null) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return;
        }
        AndroidTreehouseDispatchers.checkUi();
        Room room = realTreehouseApp$codeHost$1.state;
        if ((room instanceof CodeHost$State$Starting) || (room instanceof CodeHost$State$Running)) {
            return;
        }
        CoroutineScope codeUpdatesScope = room.getCodeUpdatesScope();
        Continuation continuation = null;
        if (codeUpdatesScope != null) {
            JobKt.cancel(codeUpdatesScope, (CancellationException) null);
        }
        ContextScope CoroutineScope = JobKt.CoroutineScope(new SupervisorJobImpl(JobKt.getJob(realTreehouseApp$codeHost$1.appScope.coroutineContext)));
        realTreehouseApp$codeHost$1.state = new CodeHost$State$Starting(CoroutineScope);
        JobKt.launch$default(CoroutineScope, realTreehouseApp$codeHost$1.dispatchers.zipline, null, new ZiplineLoader$ModuleJob$run$3(realTreehouseApp$codeHost$1, launcherEventListenerFactory, continuation, 24), 2);
    }

    public final void stop() {
        RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = this.codeHost;
        AndroidTreehouseDispatchers androidTreehouseDispatchers = realTreehouseApp$codeHost$1.dispatchers;
        AndroidTreehouseDispatchers.checkUi();
        Room room = realTreehouseApp$codeHost$1.state;
        CoroutineScope codeUpdatesScope = room.getCodeUpdatesScope();
        if (codeUpdatesScope != null) {
            JobKt.cancel(codeUpdatesScope, (CancellationException) null);
        }
        ZiplineCodeSession codeSession = room.getCodeSession();
        if (codeSession != null) {
            codeSession.removeListener(realTreehouseApp$codeHost$1.codeSessionListener);
        }
        ZiplineCodeSession codeSession2 = room.getCodeSession();
        if (codeSession2 != null) {
            codeSession2.stop();
        }
        realTreehouseApp$codeHost$1.state = new CodeHost$State$Idle();
        realTreehouseApp$codeHost$1.mutableZipline.setValue(null);
    }
}
