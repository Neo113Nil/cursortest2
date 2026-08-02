package com.squareup.cash.afterpayapplet.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.navigation.Navigation;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletInfoSheetViewModel;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class AfterpayAppletInfoSheetView extends ComposeUiView implements BottomSheetConfig, OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ArcadeBottomSheetStyle bottomSheetStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletInfoSheetView(Context context) {
        super(context);
        context.getClass();
        this.bottomSheetStyle = Navigation.ArcadeBottomSheetStyle(this);
    }

    public final void Content(final AfterpayAppletInfoSheetViewModel afterpayAppletInfoSheetViewModel, final Function1 function1, Composer composer, final int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1528079227);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(afterpayAppletInfoSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (afterpayAppletInfoSheetViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, afterpayAppletInfoSheetViewModel, function1, i, i4) { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletInfoSheetView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ AfterpayAppletInfoSheetView f$0;
                        public final /* synthetic */ AfterpayAppletInfoSheetViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            AfterpayAppletInfoSheetViewModel afterpayAppletInfoSheetViewModel2 = this.f$1;
                            AfterpayAppletInfoSheetView afterpayAppletInfoSheetView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = AfterpayAppletInfoSheetView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    afterpayAppletInfoSheetView.Content(afterpayAppletInfoSheetViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    afterpayAppletInfoSheetView.Content(afterpayAppletInfoSheetViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(afterpayAppletInfoSheetViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(i2, function1, afterpayAppletInfoSheetViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(987260304, new AtmPickerGridKt$$ExternalSyntheticLambda4(8, afterpayAppletInfoSheetViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            endRestartGroup2.block = new Function2(this, afterpayAppletInfoSheetViewModel, function1, i, i5) { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletInfoSheetView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ AfterpayAppletInfoSheetView f$0;
                public final /* synthetic */ AfterpayAppletInfoSheetViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    AfterpayAppletInfoSheetViewModel afterpayAppletInfoSheetViewModel2 = this.f$1;
                    AfterpayAppletInfoSheetView afterpayAppletInfoSheetView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i6 = AfterpayAppletInfoSheetView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            afterpayAppletInfoSheetView.Content(afterpayAppletInfoSheetViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            afterpayAppletInfoSheetView.Content(afterpayAppletInfoSheetViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return this.bottomSheetStyle;
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AfterpayAppletInfoSheetViewModel) obj, function1, gapComposer, 0);
    }
}
