package defpackage;

import com.yandex.messaging.domain.folders.GetFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3;
import com.yandex.messaging.ui.calllist.CallListViewModel$callHistoryWithDisplayNames$lambda$3$$inlined$combine$1$3;
import com.yandex.plus.webview.internal.contract.impl.loading.ContractsReadyStrategyDelegate$getReadyFlow$$inlined$combine$1$3;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;
import ru.yandex.logistics.sdk.cargo_form.core.impl.FormCoreSectionsMapper$compositeWidgetModelFlow$$inlined$combine$1$3;
import ru.yandex.logistics.sdk.cargo_form.core.impl.FormCoreSectionsMapper$sectionModelFlow$$inlined$combine$1$3;
import ru.yandex.logistics.sdk.cargo_form.core.impl.FormCoreSectionsMapper$sectionsModelFlow$$inlined$combine$1$3;
import ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.CombinedInputStateSource$createGroupStatesFlow$$inlined$combine$1$3;
import ru.yandex.taxi.logistics.sdk.management.DeliveriesManagerImpl$getPerformerRoutesStateFlow$lambda$1$$inlined$combine$1$3;

/* loaded from: classes5.dex */
public final class ui7 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr[] b;

    public /* synthetic */ ui7(tpr[] tprVarArr, int i) {
        this.a = i;
        this.b = tprVarArr;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tpr[] tprVarArr = this.b;
        switch (i) {
            case 0:
                Object a = j.a(vprVar, new v10(tprVarArr, 7), new CallListViewModel$callHistoryWithDisplayNames$lambda$3$$inlined$combine$1$3(3, null), continuation, tprVarArr);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
            case 1:
                Object a2 = j.a(vprVar, new v10(tprVarArr, 13), new CombinedInputStateSource$createGroupStatesFlow$$inlined$combine$1$3(3, null), continuation, tprVarArr);
                return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : zy11Var;
            case 2:
                Object a3 = j.a(vprVar, new v10(tprVarArr, 14), new ContractsReadyStrategyDelegate$getReadyFlow$$inlined$combine$1$3(3, null), continuation, tprVarArr);
                return a3 == CoroutineSingletons.COROUTINE_SUSPENDED ? a3 : zy11Var;
            case 3:
                Object a4 = j.a(vprVar, new v10(tprVarArr, 15), new DeliveriesManagerImpl$getPerformerRoutesStateFlow$lambda$1$$inlined$combine$1$3(3, null), continuation, tprVarArr);
                return a4 == CoroutineSingletons.COROUTINE_SUSPENDED ? a4 : zy11Var;
            case 4:
                Object a5 = j.a(vprVar, new v10(tprVarArr, 17), new FormCoreSectionsMapper$compositeWidgetModelFlow$$inlined$combine$1$3(3, null), continuation, tprVarArr);
                return a5 == CoroutineSingletons.COROUTINE_SUSPENDED ? a5 : zy11Var;
            case 5:
                Object a6 = j.a(vprVar, new v10(tprVarArr, 18), new FormCoreSectionsMapper$sectionModelFlow$$inlined$combine$1$3(3, null), continuation, tprVarArr);
                return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : zy11Var;
            case 6:
                Object a7 = j.a(vprVar, new v10(tprVarArr, 19), new FormCoreSectionsMapper$sectionsModelFlow$$inlined$combine$1$3(3, null), continuation, tprVarArr);
                return a7 == CoroutineSingletons.COROUTINE_SUSPENDED ? a7 : zy11Var;
            default:
                Object a8 = j.a(vprVar, new v10(tprVarArr, 23), new GetFolderChatsDisplayDataUseCase$run$lambda$1$$inlined$combine$1$3(3, null), continuation, tprVarArr);
                return a8 == CoroutineSingletons.COROUTINE_SUSPENDED ? a8 : zy11Var;
        }
    }
}
