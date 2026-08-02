package com.squareup.cash.attribution;

import androidx.compose.runtime.Recomposer$recompositionRunner$2;
import androidx.lifecycle.Lifecycle;
import app.cash.molecule.GatedFrameClock;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SetupTeardownRunner$run$2;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class ActivityTransitionsSideEffectsPerformer implements IoActivitySetupTeardown {
    public final /* synthetic */ int $r8$classId;
    public final Object activity;
    public final Object activityEvents;
    public final Object appsFlyerClient;

    public /* synthetic */ ActivityTransitionsSideEffectsPerformer(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.activityEvents = obj;
        this.appsFlyerClient = obj2;
        this.activity = obj3;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new GatedFrameClock.AnonymousClass1(continuation, this, 27), 1);
                break;
            case 1:
                Lifecycle lifecycle = (Lifecycle) obj;
                coroutineScope.getClass();
                lifecycle.getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new Recomposer$recompositionRunner$2((Continuation) null, (SessionManager) this.activityEvents, (RealTabProvider.MetroFactory) this.appsFlyerClient, lifecycle, (BreadcrumbListener.MetroFactory) this.activity), 1);
                break;
            default:
                Lifecycle lifecycle2 = (Lifecycle) obj;
                coroutineScope.getClass();
                lifecycle2.getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new SetupTeardownRunner$run$2(lifecycle2, this, (Continuation) null), 1);
                break;
        }
        return StateFlowKt.noOpTeardown;
    }
}
