package com.squareup.cash.bitcoin.views.paidinbitcoin;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinLandingViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class PaidInBitcoinLandingView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidInBitcoinLandingView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel, final Function1 function1, Composer composer, final int i) {
        PaidInBitcoinLandingView paidInBitcoinLandingView;
        final PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel2;
        final Function1 function12;
        final int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1476352123);
        int i3 = (gapComposer.changed(paidInBitcoinLandingViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            paidInBitcoinLandingView = this;
            paidInBitcoinLandingViewModel2 = paidInBitcoinLandingViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (paidInBitcoinLandingViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, paidInBitcoinLandingViewModel, function1, i, i4) { // from class: com.squareup.cash.bitcoin.views.paidinbitcoin.PaidInBitcoinLandingView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ PaidInBitcoinLandingView f$0;
                        public final /* synthetic */ PaidInBitcoinLandingViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel3 = this.f$1;
                            PaidInBitcoinLandingView paidInBitcoinLandingView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = PaidInBitcoinLandingView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    paidInBitcoinLandingView2.Content(paidInBitcoinLandingViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    paidInBitcoinLandingView2.Content(paidInBitcoinLandingViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            paidInBitcoinLandingView = this;
            paidInBitcoinLandingViewModel2 = paidInBitcoinLandingViewModel;
            function12 = function1;
            i2 = i;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(6, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            PainInBitcoinUpsellViewKt.PaidInBitcoinLanding(paidInBitcoinLandingViewModel2, function12, null, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final PaidInBitcoinLandingView paidInBitcoinLandingView2 = paidInBitcoinLandingView;
            final int i5 = 1;
            endRestartGroup2.block = new Function2(paidInBitcoinLandingView2, paidInBitcoinLandingViewModel2, function12, i2, i5) { // from class: com.squareup.cash.bitcoin.views.paidinbitcoin.PaidInBitcoinLandingView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ PaidInBitcoinLandingView f$0;
                public final /* synthetic */ PaidInBitcoinLandingViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = paidInBitcoinLandingView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function13 = this.f$2;
                    PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel3 = this.f$1;
                    PaidInBitcoinLandingView paidInBitcoinLandingView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i6 = PaidInBitcoinLandingView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            paidInBitcoinLandingView22.Content(paidInBitcoinLandingViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            paidInBitcoinLandingView22.Content(paidInBitcoinLandingViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((PaidInBitcoinLandingViewModel) obj, function1, gapComposer, 0);
    }
}
