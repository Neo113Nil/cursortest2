package com.squareup.cash.bitcoin.views.deposits.copy;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class BitcoinAddressCopySheetView extends ComposeUiView implements OutsideTapCloses, BottomSheetConfig {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinAddressCopySheetView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final WalletAddressOptionsViewModel walletAddressOptionsViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(133454477);
        int i3 = (gapComposer.changedInstance(walletAddressOptionsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 18;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (walletAddressOptionsViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2(this, walletAddressOptionsViewModel, function1, i, i5) { // from class: com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ BitcoinAddressCopySheetView f$0;
                        public final /* synthetic */ WalletAddressOptionsViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i5;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            WalletAddressOptionsViewModel walletAddressOptionsViewModel2 = this.f$1;
                            BitcoinAddressCopySheetView bitcoinAddressCopySheetView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i7 = BitcoinAddressCopySheetView.$r8$clinit;
                            switch (i6) {
                                case 0:
                                    bitcoinAddressCopySheetView.Content(walletAddressOptionsViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    bitcoinAddressCopySheetView.Content(walletAddressOptionsViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i2 = i;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(-47248862, new BitcoinUiFactory$$ExternalSyntheticLambda12(i4, (Object) walletAddressOptionsViewModel, (Object) function1), gapComposer), gapComposer, 3072, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i6 = 1;
            final int i7 = i2;
            endRestartGroup2.block = new Function2(this, walletAddressOptionsViewModel, function1, i7, i6) { // from class: com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ BitcoinAddressCopySheetView f$0;
                public final /* synthetic */ WalletAddressOptionsViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    WalletAddressOptionsViewModel walletAddressOptionsViewModel2 = this.f$1;
                    BitcoinAddressCopySheetView bitcoinAddressCopySheetView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i72 = BitcoinAddressCopySheetView.$r8$clinit;
                    switch (i62) {
                        case 0:
                            bitcoinAddressCopySheetView.Content(walletAddressOptionsViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            bitcoinAddressCopySheetView.Content(walletAddressOptionsViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
        Content((WalletAddressOptionsViewModel) obj, function1, gapComposer, 0);
    }
}
