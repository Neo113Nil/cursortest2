package app.cash.cdp.integration;

import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.gcl.RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class CdpConfigUpdateSetupTeardown implements IoSetupTeardown {
    public final /* synthetic */ int $r8$classId;
    public final Object cdpConfigurationProvider;
    public final Object featureFlagManager;

    public /* synthetic */ CdpConfigUpdateSetupTeardown(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.featureFlagManager = obj;
        this.cdpConfigurationProvider = obj2;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 1;
        Continuation continuation = null;
        coroutineScope.getClass();
        switch (i) {
            case 0:
                JobKt.launch$default(coroutineScope, null, null, new CdpConfigUpdateSetupTeardown$setup$1$1(this, continuation, 0), 3);
                JobKt.launch$default(coroutineScope, null, null, new CdpConfigUpdateSetupTeardown$setup$1$1(this, continuation, i3), 3);
                break;
            case 1:
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1(continuation, this, 8), 1);
                break;
            case 2:
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1(continuation, this, 19), 1);
                break;
            case 3:
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(continuation, this, i2), 1);
                break;
            default:
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealGcmRegistrar$unregister$2(continuation, this, 21), 1);
                break;
        }
        return StateFlowKt.noOpTeardown;
    }
}
