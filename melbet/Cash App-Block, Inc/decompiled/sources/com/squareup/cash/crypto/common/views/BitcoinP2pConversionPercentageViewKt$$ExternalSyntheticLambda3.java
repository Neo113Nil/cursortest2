package com.squareup.cash.crypto.common.views;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ BitcoinP2pConversionPercentageViewModel.Content.AlertModel f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda3(BitcoinP2pConversionPercentageViewModel.Content.AlertModel alertModel, Function0 function0) {
        this.f$0 = alertModel;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        BitcoinP2pConversionPercentageViewModel.Content.AlertModel alertModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, alertModel.title, alertModel.detail, Expect_jvmKt.rememberComposableLambda(1775289738, new BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda3(this.f$1, alertModel), gapComposer), (Function3) null, (Function3) null, gapComposer, 3072, 49);
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
                    modalButtonScope.PrimaryModalButton(this.f$1, null, false, Expect_jvmKt.rememberComposableLambda(-1461856427, new CheckDepositAmountKt$$ExternalSyntheticLambda8(alertModel, 29), gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda3(Function0 function0, BitcoinP2pConversionPercentageViewModel.Content.AlertModel alertModel) {
        this.f$1 = function0;
        this.f$0 = alertModel;
    }
}
