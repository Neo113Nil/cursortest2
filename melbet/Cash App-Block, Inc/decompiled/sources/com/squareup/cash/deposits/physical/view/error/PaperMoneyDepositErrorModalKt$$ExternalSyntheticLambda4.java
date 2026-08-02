package com.squareup.cash.deposits.physical.view.error;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.deposits.physical.viewmodels.error.PhysicalDepositErrorViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ PhysicalDepositErrorViewModel f$1;

    public /* synthetic */ PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda4(PhysicalDepositErrorViewModel physicalDepositErrorViewModel, Function1 function1) {
        this.f$1 = physicalDepositErrorViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        PhysicalDepositErrorViewModel physicalDepositErrorViewModel = this.f$1;
        switch (i) {
            case 0:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(10, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(1900563199, new PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda2(physicalDepositErrorViewModel, 2), gapComposer), gapComposer, (57344 & (intValue << 12)) | 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    String str = physicalDepositErrorViewModel.actionNegativeText;
                    if (str == null) {
                        gapComposer2.startReplaceGroup(-1396189211);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1396189210);
                        boolean changed2 = gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda4(9, function1);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(2056877334, new SetPinViewKt$$ExternalSyntheticLambda7(str, 28), gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PaperMoneyDepositErrorModalKt$$ExternalSyntheticLambda4(Function1 function1, PhysicalDepositErrorViewModel physicalDepositErrorViewModel) {
        this.f$0 = function1;
        this.f$1 = physicalDepositErrorViewModel;
    }
}
