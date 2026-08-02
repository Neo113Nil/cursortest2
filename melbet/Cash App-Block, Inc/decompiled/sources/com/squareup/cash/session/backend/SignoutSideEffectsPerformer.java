package com.squareup.cash.session.backend;

import androidx.lifecycle.Lifecycle;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.eligibility.backend.api.EligibilityRefresher;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class SignoutSideEffectsPerformer implements UiActivitySetupTeardown {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object flowStarter;
    public final Object navigator;
    public final Object navigatorSwitcher;
    public final Object signOut;

    public SignoutSideEffectsPerformer(Flow flow, FlowStarter flowStarter, MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1, Navigator navigator) {
        navigator.getClass();
        this.signOut = flow;
        this.flowStarter = flowStarter;
        this.navigatorSwitcher = mainActivity$navigatorSwitcher$1;
        this.navigator = navigator;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new PreferenceFlow$flow$1(continuation, this, 3), 1);
                break;
            default:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1(continuation, this, 11), 1);
                break;
        }
        return StateFlowKt.noOpTeardown;
    }

    public SignoutSideEffectsPerformer(EligibilityRefresher eligibilityRefresher, SyncValueReader syncValueReader, ErrorReporter errorReporter, KeyValue keyValue) {
        this.signOut = eligibilityRefresher;
        this.flowStarter = syncValueReader;
        this.navigatorSwitcher = errorReporter;
        this.navigator = keyValue;
    }
}
