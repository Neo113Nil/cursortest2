package com.squareup.cash.family.familyhub.views;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.viewmodels.SetDependentCustomLimitErrorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class SetDependentCustomLimitErrorViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SetDependentCustomLimitErrorViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SetDependentCustomLimitErrorViewKt$$ExternalSyntheticLambda3(SetDependentCustomLimitErrorViewModel setDependentCustomLimitErrorViewModel, Function1 function1) {
        this.f$0 = setDependentCustomLimitErrorViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 16;
        SetDependentCustomLimitErrorViewModel setDependentCustomLimitErrorViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, setDependentCustomLimitErrorViewModel.title, setDependentCustomLimitErrorViewModel.message, Expect_jvmKt.rememberComposableLambda(576326503, new SetDependentCustomLimitErrorViewKt$$ExternalSyntheticLambda3(function1, setDependentCustomLimitErrorViewModel), gapComposer), (Function3) null, (Function3) null, gapComposer, 3072, 49);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(28, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(1113033532, new ArcadeModal$$ExternalSyntheticLambda3(setDependentCustomLimitErrorViewModel, i2), gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SetDependentCustomLimitErrorViewKt$$ExternalSyntheticLambda3(Function1 function1, SetDependentCustomLimitErrorViewModel setDependentCustomLimitErrorViewModel) {
        this.f$1 = function1;
        this.f$0 = setDependentCustomLimitErrorViewModel;
    }
}
