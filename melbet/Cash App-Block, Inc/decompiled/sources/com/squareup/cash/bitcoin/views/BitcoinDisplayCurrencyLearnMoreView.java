package com.squareup.cash.bitcoin.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class BitcoinDisplayCurrencyLearnMoreView extends ComposeUiView implements OutsideTapCloses, BottomSheetConfig {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinDisplayCurrencyLearnMoreView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final Unit unit, final Function1 function1, Composer composer, final int i) {
        BitcoinDisplayCurrencyLearnMoreView bitcoinDisplayCurrencyLearnMoreView;
        Unit unit2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1304829808);
        int i3 = (gapComposer.changed(unit) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            bitcoinDisplayCurrencyLearnMoreView = this;
            unit2 = unit;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (unit == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, unit, function1, i, i4) { // from class: com.squareup.cash.bitcoin.views.BitcoinDisplayCurrencyLearnMoreView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ BitcoinDisplayCurrencyLearnMoreView f$0;
                        public final /* synthetic */ Unit f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            Unit unit3 = this.f$1;
                            BitcoinDisplayCurrencyLearnMoreView bitcoinDisplayCurrencyLearnMoreView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = BitcoinDisplayCurrencyLearnMoreView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    bitcoinDisplayCurrencyLearnMoreView2.Content(unit3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    bitcoinDisplayCurrencyLearnMoreView2.Content(unit3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            bitcoinDisplayCurrencyLearnMoreView = this;
            unit2 = unit;
            function12 = function1;
            i2 = i;
            BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencyInfoView(function12, gapComposer, (i3 >> 3) & 14);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final Unit unit3 = unit2;
            final BitcoinDisplayCurrencyLearnMoreView bitcoinDisplayCurrencyLearnMoreView2 = bitcoinDisplayCurrencyLearnMoreView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(bitcoinDisplayCurrencyLearnMoreView2, unit3, function13, i5, i6) { // from class: com.squareup.cash.bitcoin.views.BitcoinDisplayCurrencyLearnMoreView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ BitcoinDisplayCurrencyLearnMoreView f$0;
                public final /* synthetic */ Unit f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = bitcoinDisplayCurrencyLearnMoreView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    Unit unit32 = this.f$1;
                    BitcoinDisplayCurrencyLearnMoreView bitcoinDisplayCurrencyLearnMoreView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = BitcoinDisplayCurrencyLearnMoreView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            bitcoinDisplayCurrencyLearnMoreView22.Content(unit32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            bitcoinDisplayCurrencyLearnMoreView22.Content(unit32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return new ArcadeBottomSheetStyle(ThemeHelpersKt.themeInfo(this).arcadeColors);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((Unit) obj, function1, gapComposer, 0);
    }
}
