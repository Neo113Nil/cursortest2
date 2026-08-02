package com.squareup.cash.bitcoin.views.paidinbitcoin;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinCardUpsellViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class PainInBitcoinUpsellView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainInBitcoinUpsellView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel, final Function1 function1, Composer composer, final int i) {
        PainInBitcoinUpsellView painInBitcoinUpsellView;
        PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2103043577);
        int i3 = (gapComposer.changedInstance(paidInBitcoinCardUpsellViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            painInBitcoinUpsellView = this;
            paidInBitcoinCardUpsellViewModel2 = paidInBitcoinCardUpsellViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (paidInBitcoinCardUpsellViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, paidInBitcoinCardUpsellViewModel, function1, i, i4) { // from class: com.squareup.cash.bitcoin.views.paidinbitcoin.PainInBitcoinUpsellView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ PainInBitcoinUpsellView f$0;
                        public final /* synthetic */ PaidInBitcoinCardUpsellViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel3 = this.f$1;
                            PainInBitcoinUpsellView painInBitcoinUpsellView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = PainInBitcoinUpsellView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    painInBitcoinUpsellView2.Content(paidInBitcoinCardUpsellViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    painInBitcoinUpsellView2.Content(paidInBitcoinCardUpsellViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            painInBitcoinUpsellView = this;
            paidInBitcoinCardUpsellViewModel2 = paidInBitcoinCardUpsellViewModel;
            function12 = function1;
            i2 = i;
            PainInBitcoinUpsellViewKt.PaidInBitcoinUpsell(paidInBitcoinCardUpsellViewModel2, function12, null, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel3 = paidInBitcoinCardUpsellViewModel2;
            final PainInBitcoinUpsellView painInBitcoinUpsellView2 = painInBitcoinUpsellView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(painInBitcoinUpsellView2, paidInBitcoinCardUpsellViewModel3, function13, i5, i6) { // from class: com.squareup.cash.bitcoin.views.paidinbitcoin.PainInBitcoinUpsellView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ PainInBitcoinUpsellView f$0;
                public final /* synthetic */ PaidInBitcoinCardUpsellViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = painInBitcoinUpsellView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel32 = this.f$1;
                    PainInBitcoinUpsellView painInBitcoinUpsellView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = PainInBitcoinUpsellView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            painInBitcoinUpsellView22.Content(paidInBitcoinCardUpsellViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            painInBitcoinUpsellView22.Content(paidInBitcoinCardUpsellViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((PaidInBitcoinCardUpsellViewModel) obj, function1, gapComposer, 0);
    }
}
