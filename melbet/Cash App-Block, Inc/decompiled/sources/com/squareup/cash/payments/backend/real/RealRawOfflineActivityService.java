package com.squareup.cash.payments.backend.real;

import androidx.room.util.DBUtil;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.OfflineQueries$PendingQuery;
import com.squareup.cash.db2.payment.OfflineQueries$pending$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.treehouse.activity.RawOfflineActivityService;
import com.squareup.moshi.Moshi;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class RealRawOfflineActivityService implements RawOfflineActivityService {
    public final CashAccountDatabaseImpl cashDatabase;
    public final CoroutineContext ioDispatcher;
    public final OfflineManager offlineManager;
    public final CoroutineScope scope;

    public RealRawOfflineActivityService(CashAccountDatabaseImpl cashAccountDatabaseImpl, OfflineManager offlineManager, CoroutineContext coroutineContext, Moshi moshi, CoroutineScope coroutineScope) {
        this.cashDatabase = cashAccountDatabaseImpl;
        this.offlineManager = offlineManager;
        this.ioDispatcher = coroutineContext;
        this.scope = coroutineScope;
    }

    @Override // com.squareup.cash.treehouse.activity.RawOfflineActivityService
    public final Flow offlineActivityItems() {
        return new AppLockMonitor$special$$inlined$map$2(EmptyList.INSTANCE, 19);
    }

    @Override // com.squareup.cash.treehouse.activity.RawOfflineActivityService
    public final Flow offlinePendingItems() {
        RewardSlotQueries rewardSlotQueries = this.cashDatabase.offlineQueries;
        rewardSlotQueries.getClass();
        OfflineQueries$pending$2 offlineQueries$pending$2 = OfflineQueries$pending$2.INSTANCE;
        return FlowKt.distinctUntilChanged(FlowKt.mapLatest(new MainPaymentView$Content$2$1(this, (Continuation) null, 10), DBUtil.mapToList(DBUtil.toFlow(new OfflineQueries$PendingQuery(rewardSlotQueries, new OfflineQueries$$ExternalSyntheticLambda0(rewardSlotQueries, (byte) 0))), this.ioDispatcher)));
    }

    @Override // com.squareup.cash.treehouse.activity.RawOfflineActivityService
    public final void retryPendingItems() {
        JobKt.launch$default(this.scope, null, null, new MusicPresenter$models$3$1(this, null, 18), 3);
    }
}
