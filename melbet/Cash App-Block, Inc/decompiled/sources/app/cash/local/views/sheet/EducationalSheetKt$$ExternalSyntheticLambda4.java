package app.cash.local.views.sheet;

import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionMapViewEvent;
import app.cash.local.views.map.BrandCollectionSheetViewKt;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class EducationalSheetKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ CoroutineScope f$1;
    public final /* synthetic */ RealSheetState f$2;

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda4(RealSheetState realSheetState, CoroutineScope coroutineScope, Function1 function1) {
        this.f$2 = realSheetState;
        this.f$1 = coroutineScope;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        CoroutineScope coroutineScope = this.f$1;
        RealSheetState realSheetState = this.f$2;
        switch (i) {
            case 0:
                function1.invoke(new EducationalSheetEvent.SwipeToSeeMoreTap());
                JobKt.launch$default(coroutineScope, null, null, new RealSheetState$peek$3(realSheetState, null, 8), 3);
                break;
            default:
                if (BrandCollectionSheetViewKt.WhenMappings.$EnumSwitchMapping$0[realSheetState.getSettledPosition().ordinal()] == 1) {
                    JobKt.launch$default(coroutineScope, null, null, new RealSheetState$peek$3(realSheetState, null, 6), 3);
                } else {
                    function1.invoke(BrandCollectionMapViewEvent.BackClicked.INSTANCE);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda4(Function1 function1, CoroutineScope coroutineScope, RealSheetState realSheetState) {
        this.f$0 = function1;
        this.f$1 = coroutineScope;
        this.f$2 = realSheetState;
    }
}
