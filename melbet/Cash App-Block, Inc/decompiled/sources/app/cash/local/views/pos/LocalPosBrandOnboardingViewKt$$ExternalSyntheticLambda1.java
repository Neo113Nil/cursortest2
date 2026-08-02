package app.cash.local.views.pos;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ LocalPosBrandOnboardingViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda1(Modifier modifier, LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel, Function1 function1) {
        this.f$0 = modifier;
        this.f$1 = localPosBrandOnboardingViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel = this.f$1;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                LocalPosCheckInViewKt.LocalPosBrandOnboardingView(modifier, localPosBrandOnboardingViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LocalPosCheckInViewKt.LocalPosBrandOnboardingView(modifier, localPosBrandOnboardingViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda1(Modifier modifier, LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel, Function1 function1, int i) {
        this.f$0 = modifier;
        this.f$1 = localPosBrandOnboardingViewModel;
        this.f$2 = function1;
    }
}
