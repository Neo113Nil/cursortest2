package com.squareup.cash.bitcoin.graph.real;

import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.Lifecycle;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.gcl.RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class BitcoinGraphPrefetch implements IoActivitySetupTeardown {
    public final /* synthetic */ int $r8$classId;
    public final Object bitcoinActivityProvider;
    public final Object graphModelProvider;

    public /* synthetic */ BitcoinGraphPrefetch(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.bitcoinActivityProvider = obj;
        this.graphModelProvider = obj2;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(continuation, this, 2), 1);
                break;
            default:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                if (PlatformKt.activeAccountTokenOrNull((SessionManager) this.graphModelProvider) != null) {
                    JobKt.launch$default(coroutineScope, null, null, new BlockRunner$cancel$1(this, (Continuation) null, 29), 3);
                }
                break;
        }
        return StateFlowKt.noOpTeardown;
    }
}
