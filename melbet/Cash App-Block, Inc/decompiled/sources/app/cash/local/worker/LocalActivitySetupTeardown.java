package app.cash.local.worker;

import androidx.lifecycle.Lifecycle;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.navigation.api.RealCashLocalShortlinkHandler;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.task.RepeatTaskAggregator$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import dev.zacsweers.metro.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class LocalActivitySetupTeardown implements UiActivitySetupTeardown {
    public final AppForegroundStateProvider appForegroundStateProvider;
    public final CoroutineContext ioDispatcher;
    public final Navigator navigator;
    public final SessionManager sessionManager;
    public final RealCashLocalShortlinkHandler shortlinkHandler;
    public final SyncValueReader syncValueReader;

    public final class MetroFactory {
        public final Provider appForegroundStateProvider;
        public final Provider ioDispatcher;
        public final Provider sessionManager;
        public final Provider shortlinkHandler;
        public final Provider syncValueReader;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
            this.appForegroundStateProvider = provider;
            this.sessionManager = provider2;
            this.syncValueReader = provider3;
            this.shortlinkHandler = provider4;
            this.ioDispatcher = provider5;
        }
    }

    public LocalActivitySetupTeardown(AppForegroundStateProvider appForegroundStateProvider, SessionManager sessionManager, SyncValueReader syncValueReader, RealCashLocalShortlinkHandler realCashLocalShortlinkHandler, CoroutineContext coroutineContext, Navigator navigator) {
        navigator.getClass();
        this.appForegroundStateProvider = appForegroundStateProvider;
        this.sessionManager = sessionManager;
        this.syncValueReader = syncValueReader;
        this.shortlinkHandler = realCashLocalShortlinkHandler;
        this.ioDispatcher = coroutineContext;
        this.navigator = navigator;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        return new RepeatTaskAggregator$$ExternalSyntheticLambda0(JobKt.launch$default(coroutineScope, this.ioDispatcher, null, new CashApp$onCreate$4$1$1(this, null, 10), 2), 2);
    }
}
