package com.squareup.cash.data;

import com.squareup.cash.session.backend.OnSignOutAction;
import com.squareup.cash.session.backend.RealOnSessionChangeActionsExecutor$executeSignOut$1;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.values.MoneyTabCardIntroState;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class SandboxedDataModule$Companion$provideMoneyTabStateOnSignOutAction$1 implements OnSignOutAction {
    public final /* synthetic */ KeyValue $moneyTabCardIntroState;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SandboxedDataModule$Companion$provideMoneyTabStateOnSignOutAction$1(KeyValue keyValue, int i) {
        this.$r8$classId = i;
        this.$moneyTabCardIntroState = keyValue;
    }

    @Override // com.squareup.cash.session.backend.OnSignOutAction
    public final Object clearData(SessionManager.DeletionMode deletionMode, RealOnSessionChangeActionsExecutor$executeSignOut$1 realOnSessionChangeActionsExecutor$executeSignOut$1) {
        int i = this.$r8$classId;
        KeyValue keyValue = this.$moneyTabCardIntroState;
        switch (i) {
            case 0:
                Object obj = keyValue.set(new MoneyTabCardIntroState(false, 1, null), realOnSessionChangeActionsExecutor$executeSignOut$1);
                if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object obj2 = keyValue.set(Boolean.FALSE, realOnSessionChangeActionsExecutor$executeSignOut$1);
                if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object delete = keyValue.delete(realOnSessionChangeActionsExecutor$executeSignOut$1);
                if (delete != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
