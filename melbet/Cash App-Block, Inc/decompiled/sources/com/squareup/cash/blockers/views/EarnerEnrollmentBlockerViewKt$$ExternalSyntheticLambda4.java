package com.squareup.cash.blockers.views;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.CanvasUtils;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetTopCornerBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda4 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda4(boolean z, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$r8$classId) {
            case 0:
                EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel = (EarnerEnrollmentBlockerViewModel) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                earnerEnrollmentBlockerViewModel.getClass();
                boolean z = this.f$0;
                Function1 function1 = this.f$1;
                if (!z || (earnerEnrollmentBlockerViewModel instanceof EarnerEnrollmentBlockerViewModel.CategorySelection)) {
                    GapComposer gapComposer = (GapComposer) composer;
                    gapComposer.startReplaceGroup(321142711);
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentBlockerContent(earnerEnrollmentBlockerViewModel, function1, false, null, gapComposer, (intValue >> 3) & 14, 12);
                    gapComposer.end(false);
                } else {
                    GapComposer gapComposer2 = (GapComposer) composer;
                    gapComposer2.startReplaceGroup(320765968);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(13, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, SheetTopCornerBehavior.AlwaysRounded, Expect_jvmKt.rememberComposableLambda(-404016841, new BorrowHomeKt$$ExternalSyntheticLambda0(18, earnerEnrollmentBlockerViewModel, function1), gapComposer2), gapComposer2, 113246208, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    gapComposer2.end(false);
                }
                break;
            default:
                BitcoinAmountViewModel bitcoinAmountViewModel = (BitcoinAmountViewModel) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                bitcoinAmountViewModel.getClass();
                int i = (intValue2 >> 3) & 14;
                CanvasUtils.BitcoinAmountPickerContent(bitcoinAmountViewModel, this.f$0, this.f$1, null, (Composer) obj3, i);
                break;
        }
        return Unit.INSTANCE;
    }
}
