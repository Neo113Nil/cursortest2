package com.squareup.cash.family.familyhub.views;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.viewmodels.ControlErrorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ControlErrorDialogKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ControlErrorViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ControlErrorDialogKt$$ExternalSyntheticLambda2(ControlErrorViewModel controlErrorViewModel, Function1 function1) {
        this.f$0 = controlErrorViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        ControlErrorViewModel controlErrorViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ModalKt.Modal((Modifier) null, controlErrorViewModel.title, controlErrorViewModel.message, Expect_jvmKt.rememberComposableLambda(1106036778, new ControlErrorDialogKt$$ExternalSyntheticLambda2(function1, controlErrorViewModel), composer), (Function3) null, (Function3) null, composer, 27648, 33);
                break;
            default:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer2;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(1, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(-963222091, new ArcadeModal$$ExternalSyntheticLambda3(controlErrorViewModel, 13), gapComposer), gapComposer, ((intValue << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ControlErrorDialogKt$$ExternalSyntheticLambda2(Function1 function1, ControlErrorViewModel controlErrorViewModel) {
        this.f$1 = function1;
        this.f$0 = controlErrorViewModel;
    }
}
