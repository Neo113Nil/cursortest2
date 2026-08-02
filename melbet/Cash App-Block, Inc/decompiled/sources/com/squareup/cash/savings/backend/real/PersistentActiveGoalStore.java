package com.squareup.cash.savings.backend.real;

import androidx.room.util.DBUtil;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.savings.db.SavingsGoalLocalStatusQueries$getGoalStatus$2;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class PersistentActiveGoalStore {
    public final CoroutineScope coroutineScope;
    public final CoroutineContext dispatcher;
    public final ErrorReporter errorReporter;
    public final GpsConfigQueries goalLocalStatus;
    public final StateFlow savingsFolders;

    public PersistentActiveGoalStore(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CashAccountDatabaseImpl cashAccountDatabaseImpl, ErrorReporter errorReporter, StateFlow stateFlow) {
        stateFlow.getClass();
        this.coroutineScope = coroutineScope;
        this.dispatcher = coroutineContext;
        this.errorReporter = errorReporter;
        this.savingsFolders = stateFlow;
        this.goalLocalStatus = cashAccountDatabaseImpl.savingsGoalLocalStatusQueries;
    }

    public static final Flow access$buildProviderFlowFromLocalStatus(PersistentActiveGoalStore persistentActiveGoalStore, SavingsFolder.GoalFolder goalFolder) {
        if (goalFolder == null) {
            return new AppLockMonitor$special$$inlined$map$2(null, 19);
        }
        String str = goalFolder.token;
        OpenSourceKt$$ExternalSyntheticLambda11 openSourceKt$$ExternalSyntheticLambda11 = new OpenSourceKt$$ExternalSyntheticLambda11(26, persistentActiveGoalStore, goalFolder);
        GpsConfigQueries gpsConfigQueries = persistentActiveGoalStore.goalLocalStatus;
        gpsConfigQueries.getClass();
        str.getClass();
        SavingsGoalLocalStatusQueries$getGoalStatus$2 savingsGoalLocalStatusQueries$getGoalStatus$2 = SavingsGoalLocalStatusQueries$getGoalStatus$2.INSTANCE;
        return new FlowExtensionsKt$combine$$inlined$combine$1(5, DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(gpsConfigQueries, str, new RealSandboxer$$ExternalSyntheticLambda0(gpsConfigQueries))), persistentActiveGoalStore.dispatcher), openSourceKt$$ExternalSyntheticLambda11);
    }
}
