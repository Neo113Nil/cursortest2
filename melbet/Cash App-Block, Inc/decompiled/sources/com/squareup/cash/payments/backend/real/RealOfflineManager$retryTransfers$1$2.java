package com.squareup.cash.payments.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.data.transfers.TransferManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealOfflineManager$retryTransfers$1$2 implements FlowCollector {
    public static final RealOfflineManager$retryTransfers$1$2 INSTANCE = new RealOfflineManager$retryTransfers$1$2();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        TransferManager.TransferFundsResult transferFundsResult = (TransferManager.TransferFundsResult) obj;
        if (transferFundsResult instanceof TransferManager.TransferFundsResult.Success) {
            Timber.Forest.d("Transfer retry succeeded: ".concat(((TransferManager.TransferFundsResult.Success) transferFundsResult).externalId), new Object[0]);
        } else {
            if (!(transferFundsResult instanceof TransferManager.TransferFundsResult.Error)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Transfer retry failed: ", ((TransferManager.TransferFundsResult.Error) transferFundsResult).externalId), new Object[0]);
        }
        return Unit.INSTANCE;
    }
}
