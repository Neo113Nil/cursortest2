package com.squareup.cash.moneybot.views.feedback;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotFeedbackViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MoneybotFeedbackViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ MoneybotFeedbackViewKt$$ExternalSyntheticLambda0(MoneybotFeedbackViewModel moneybotFeedbackViewModel, Function1 function1) {
        this.f$0 = moneybotFeedbackViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        MoneybotFeedbackViewModel moneybotFeedbackViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    ChromeConfigKt.ChromeConfig(null, ChromeSystemIconColor.ALWAYS_LIGHT, null, null, null, null, null, gapComposer, 48, 125);
                    zzacn.MoneybotFeedbackContent(moneybotFeedbackViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(2118860737, new MoneybotFeedbackViewKt$$ExternalSyntheticLambda11(function1, moneybotFeedbackViewModel), gapComposer2), gapComposer2, 24576, 15);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneybotFeedbackViewKt$$ExternalSyntheticLambda0(Function1 function1, MoneybotFeedbackViewModel moneybotFeedbackViewModel) {
        this.f$1 = function1;
        this.f$0 = moneybotFeedbackViewModel;
    }
}
