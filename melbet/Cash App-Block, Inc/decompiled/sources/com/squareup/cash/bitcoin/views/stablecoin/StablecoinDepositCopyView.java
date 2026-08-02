package com.squareup.cash.bitcoin.views.stablecoin;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositCopyViewModel;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class StablecoinDepositCopyView extends ComposeUiView implements OutsideTapCloses, BottomSheetConfig {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StablecoinDepositCopyView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final StablecoinDepositCopyViewModel stablecoinDepositCopyViewModel, final Function1 function1, Composer composer, final int i) {
        StablecoinDepositCopyView stablecoinDepositCopyView;
        StablecoinDepositCopyViewModel stablecoinDepositCopyViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-456768675);
        int i3 = (gapComposer.changedInstance(stablecoinDepositCopyViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            stablecoinDepositCopyView = this;
            stablecoinDepositCopyViewModel2 = stablecoinDepositCopyViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (stablecoinDepositCopyViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, stablecoinDepositCopyViewModel, function1, i, i4) { // from class: com.squareup.cash.bitcoin.views.stablecoin.StablecoinDepositCopyView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ StablecoinDepositCopyView f$0;
                        public final /* synthetic */ StablecoinDepositCopyViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            StablecoinDepositCopyViewModel stablecoinDepositCopyViewModel3 = this.f$1;
                            StablecoinDepositCopyView stablecoinDepositCopyView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = StablecoinDepositCopyView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    stablecoinDepositCopyView2.Content(stablecoinDepositCopyViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    stablecoinDepositCopyView2.Content(stablecoinDepositCopyViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            stablecoinDepositCopyView = this;
            stablecoinDepositCopyViewModel2 = stablecoinDepositCopyViewModel;
            function12 = function1;
            i2 = i;
            SendStablecoinViewKt.StablecoinDepositCopyView(stablecoinDepositCopyViewModel2, function12, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final StablecoinDepositCopyViewModel stablecoinDepositCopyViewModel3 = stablecoinDepositCopyViewModel2;
            final StablecoinDepositCopyView stablecoinDepositCopyView2 = stablecoinDepositCopyView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(stablecoinDepositCopyView2, stablecoinDepositCopyViewModel3, function13, i5, i6) { // from class: com.squareup.cash.bitcoin.views.stablecoin.StablecoinDepositCopyView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ StablecoinDepositCopyView f$0;
                public final /* synthetic */ StablecoinDepositCopyViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = stablecoinDepositCopyView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    StablecoinDepositCopyViewModel stablecoinDepositCopyViewModel32 = this.f$1;
                    StablecoinDepositCopyView stablecoinDepositCopyView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = StablecoinDepositCopyView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            stablecoinDepositCopyView22.Content(stablecoinDepositCopyViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            stablecoinDepositCopyView22.Content(stablecoinDepositCopyViewModel32, function132, composer2, Updater.updateChangedFlags(1));
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
        Content((StablecoinDepositCopyViewModel) obj, function1, gapComposer, 0);
    }
}
