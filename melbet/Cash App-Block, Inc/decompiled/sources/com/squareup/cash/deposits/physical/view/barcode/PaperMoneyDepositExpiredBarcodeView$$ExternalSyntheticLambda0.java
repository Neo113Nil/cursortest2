package com.squareup.cash.deposits.physical.view.barcode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeExpiredViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaperMoneyDepositExpiredBarcodeView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ PaperMoneyDepositBarcodeExpiredViewModel f$1;
    public final /* synthetic */ PaperMoneyDepositExpiredBarcodeView f$2;

    public /* synthetic */ PaperMoneyDepositExpiredBarcodeView$$ExternalSyntheticLambda0(PaperMoneyDepositExpiredBarcodeView paperMoneyDepositExpiredBarcodeView, PaperMoneyDepositBarcodeExpiredViewModel paperMoneyDepositBarcodeExpiredViewModel, Function1 function1, int i) {
        this.f$2 = paperMoneyDepositExpiredBarcodeView;
        this.f$1 = paperMoneyDepositBarcodeExpiredViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        PaperMoneyDepositExpiredBarcodeView paperMoneyDepositExpiredBarcodeView = this.f$2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(4, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                    PaperMoneyDepositBarcodeExpiredViewModel paperMoneyDepositBarcodeExpiredViewModel = this.f$1;
                    Strings.LoadableFullScreenContent(paperMoneyDepositBarcodeExpiredViewModel, paperMoneyDepositBarcodeExpiredViewModel == null || (paperMoneyDepositBarcodeExpiredViewModel instanceof PaperMoneyDepositBarcodeExpiredViewModel.Loading), null, null, null, Expect_jvmKt.rememberComposableLambda(-1165019906, new ScoreUiFactory$$ExternalSyntheticLambda0(paperMoneyDepositExpiredBarcodeView, 10), gapComposer), gapComposer, 196608, 28);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                paperMoneyDepositExpiredBarcodeView.Content(this.f$1, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PaperMoneyDepositExpiredBarcodeView$$ExternalSyntheticLambda0(Function1 function1, PaperMoneyDepositBarcodeExpiredViewModel paperMoneyDepositBarcodeExpiredViewModel, PaperMoneyDepositExpiredBarcodeView paperMoneyDepositExpiredBarcodeView) {
        this.f$0 = function1;
        this.f$1 = paperMoneyDepositBarcodeExpiredViewModel;
        this.f$2 = paperMoneyDepositExpiredBarcodeView;
    }
}
