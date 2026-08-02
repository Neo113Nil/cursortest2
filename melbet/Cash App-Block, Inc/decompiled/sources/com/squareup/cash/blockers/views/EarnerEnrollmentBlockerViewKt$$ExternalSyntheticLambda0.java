package com.squareup.cash.blockers.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ EarnerEnrollmentBlockerViewModel f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda0(EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel, Function1 function1, boolean z, int i) {
        this.f$0 = earnerEnrollmentBlockerViewModel;
        this.f$2 = function1;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        Function1 function1 = this.f$2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LabelValueView$$ExternalSyntheticLambda0(11);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function12 = (Function1) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LabelValueView$$ExternalSyntheticLambda0(12);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    AnimatedContentKt.AnimatedContent(this.f$0, fillMaxSize, function12, null, "EarnerEnrollmentBlocker", (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(-258341805, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda4(z, function1, 0), gapComposer), gapComposer, 1794480, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                EarnerEnrollmentBlockerViewKt.EarnerEnrollmentBlocker(this.f$0, function1, z, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda0(EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel, boolean z, Function1 function1) {
        this.f$0 = earnerEnrollmentBlockerViewModel;
        this.f$1 = z;
        this.f$2 = function1;
    }
}
