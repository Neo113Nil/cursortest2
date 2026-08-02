package com.squareup.cash.savings.backend.real;

import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class PersistentActiveGoalStore$andSaveGoalMet$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $completionToken;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $token;
    public final /* synthetic */ PersistentActiveGoalStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PersistentActiveGoalStore$andSaveGoalMet$1$1(PersistentActiveGoalStore persistentActiveGoalStore, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = persistentActiveGoalStore;
        this.$token = str;
        this.$completionToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new PersistentActiveGoalStore$andSaveGoalMet$1$1(this.this$0, this.$token, this.$completionToken, continuation, 0);
            default:
                return new PersistentActiveGoalStore$andSaveGoalMet$1$1(this.this$0, this.$token, this.$completionToken, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PersistentActiveGoalStore$andSaveGoalMet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$completionToken;
        String str2 = this.$token;
        PersistentActiveGoalStore persistentActiveGoalStore = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries = persistentActiveGoalStore.goalLocalStatus;
                gpsConfigQueries.getClass();
                str2.getClass();
                gpsConfigQueries.driver.execute(1560074075, "INSERT OR REPLACE INTO savingsGoalLocalStatus(\n  token,\n  completion_token,\n  met,\n  celebration_shown,\n  last_seen_balance,\n  last_seen_remaining_balance,\n  last_seen_progress_bps\n)\nVALUES (\n  ?,\n  ?,\n  ?,\n  ?,\n  (SELECT last_seen_balance FROM savingsGoalLocalStatus WHERE token = ?),\n  (SELECT last_seen_remaining_balance FROM savingsGoalLocalStatus WHERE token = ?),\n  (SELECT last_seen_progress_bps FROM savingsGoalLocalStatus WHERE token = ?)\n)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str2, str, 27));
                gpsConfigQueries.notifyQueries(1560074075, new CelebrationKt$$ExternalSyntheticLambda1(19));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries2 = persistentActiveGoalStore.goalLocalStatus;
                gpsConfigQueries2.getClass();
                str2.getClass();
                gpsConfigQueries2.driver.execute(-1340048448, "INSERT OR REPLACE INTO savingsGoalLocalStatus(\n  token,\n  completion_token,\n  met,\n  celebration_shown,\n  last_seen_balance,\n  last_seen_remaining_balance,\n  last_seen_progress_bps\n)\nVALUES (\n  ?,\n  ?,\n  0,\n  0,\n  (SELECT last_seen_balance FROM savingsGoalLocalStatus WHERE token = ?),\n  (SELECT last_seen_remaining_balance FROM savingsGoalLocalStatus WHERE token = ?),\n  (SELECT last_seen_progress_bps FROM savingsGoalLocalStatus WHERE token = ?)\n)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str2, str, 28));
                gpsConfigQueries2.notifyQueries(-1340048448, new CelebrationKt$$ExternalSyntheticLambda1(20));
                break;
        }
        return Unit.INSTANCE;
    }
}
