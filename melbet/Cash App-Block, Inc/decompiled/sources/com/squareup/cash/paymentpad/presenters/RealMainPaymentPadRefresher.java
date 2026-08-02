package com.squareup.cash.paymentpad.presenters;

import androidx.lifecycle.Lifecycle;
import com.squareup.cash.crypto.backend.transaction.RealCryptoTransactionActionManager;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.pools.backend.real.RealPoolActionManager;
import com.squareup.cash.taptopay.backend.real.RealTapToPayActionManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class RealMainPaymentPadRefresher implements IoActivitySetupTeardown {
    public final RealCryptoTransactionActionManager cryptoTransactionActionManager;
    public final PaymentManager paymentManager;
    public final RealPoolActionManager poolActionManager;
    public final RealTapToPayActionManager tapToPayActionManager;
    public final LinkedHashSet transactionIdsCreated = new LinkedHashSet();
    public final StateFlowImpl shouldResetAmount = FlowKt.MutableStateFlow(Boolean.FALSE);

    public RealMainPaymentPadRefresher(PaymentManager paymentManager, RealCryptoTransactionActionManager realCryptoTransactionActionManager, RealPoolActionManager realPoolActionManager, RealTapToPayActionManager realTapToPayActionManager) {
        this.paymentManager = paymentManager;
        this.cryptoTransactionActionManager = realCryptoTransactionActionManager;
        this.poolActionManager = realPoolActionManager;
        this.tapToPayActionManager = realTapToPayActionManager;
    }

    public static final void access$onTransactionInitiated(RealMainPaymentPadRefresher realMainPaymentPadRefresher, String str) {
        if (realMainPaymentPadRefresher.transactionIdsCreated.remove(str)) {
            StateFlowImpl stateFlowImpl = realMainPaymentPadRefresher.shouldResetAmount;
            Boolean bool = Boolean.TRUE;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, bool);
        }
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new RealMainPaymentPadRefresher$setup$1$1(this, continuation, 0), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealMainPaymentPadRefresher$setup$1$1(this, continuation, 1), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealMainPaymentPadRefresher$setup$1$1(this, continuation, 2), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealMainPaymentPadRefresher$setup$1$1(this, continuation, 3), 3);
        return StateFlowKt.noOpTeardown;
    }
}
