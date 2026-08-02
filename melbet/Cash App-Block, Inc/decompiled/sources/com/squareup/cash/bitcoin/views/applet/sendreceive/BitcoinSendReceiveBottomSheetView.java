package com.squareup.cash.bitcoin.views.applet.sendreceive;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendReceiveBottomSheetViewModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class BitcoinSendReceiveBottomSheetView extends ComposeUiView implements OutsideTapCloses, BottomSheetConfig {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinSendReceiveBottomSheetView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final BitcoinSendReceiveBottomSheetViewModel bitcoinSendReceiveBottomSheetViewModel, final Function1 function1, Composer composer, final int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1116973944);
        int i2 = (gapComposer.changed(bitcoinSendReceiveBottomSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (bitcoinSendReceiveBottomSheetViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    endRestartGroup.block = new Function2(this, bitcoinSendReceiveBottomSheetViewModel, function1, i, i3) { // from class: com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendReceiveBottomSheetView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ BitcoinSendReceiveBottomSheetView f$0;
                        public final /* synthetic */ BitcoinSendReceiveBottomSheetViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            BitcoinSendReceiveBottomSheetViewModel bitcoinSendReceiveBottomSheetViewModel2 = this.f$1;
                            BitcoinSendReceiveBottomSheetView bitcoinSendReceiveBottomSheetView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i5 = BitcoinSendReceiveBottomSheetView.$r8$clinit;
                            switch (i4) {
                                case 0:
                                    bitcoinSendReceiveBottomSheetView.Content(bitcoinSendReceiveBottomSheetViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    bitcoinSendReceiveBottomSheetView.Content(bitcoinSendReceiveBottomSheetViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
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
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(80282589, new BitcoinUiFactory$$ExternalSyntheticLambda12(13, (Object) bitcoinSendReceiveBottomSheetViewModel, (Object) function1), gapComposer), gapComposer, 3072, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i4 = 1;
            endRestartGroup2.block = new Function2(this, bitcoinSendReceiveBottomSheetViewModel, function1, i, i4) { // from class: com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendReceiveBottomSheetView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ BitcoinSendReceiveBottomSheetView f$0;
                public final /* synthetic */ BitcoinSendReceiveBottomSheetViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    BitcoinSendReceiveBottomSheetViewModel bitcoinSendReceiveBottomSheetViewModel2 = this.f$1;
                    BitcoinSendReceiveBottomSheetView bitcoinSendReceiveBottomSheetView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i5 = BitcoinSendReceiveBottomSheetView.$r8$clinit;
                    switch (i42) {
                        case 0:
                            bitcoinSendReceiveBottomSheetView.Content(bitcoinSendReceiveBottomSheetViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            bitcoinSendReceiveBottomSheetView.Content(bitcoinSendReceiveBottomSheetViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
        Content((BitcoinSendReceiveBottomSheetViewModel) obj, function1, gapComposer, 0);
    }
}
