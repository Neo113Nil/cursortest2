package com.squareup.cash.investing.components.ordertype.autoinvest;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.navigation.Navigation;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.DependentAutoInvestInfoViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class DependentAutoInvestInfoBottomSheetView extends ComposeUiView implements BottomSheetConfig, OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ArcadeBottomSheetStyle bottomSheetStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DependentAutoInvestInfoBottomSheetView(Context context) {
        super(context);
        context.getClass();
        this.bottomSheetStyle = Navigation.ArcadeBottomSheetStyle(this);
    }

    public final void Content(final DependentAutoInvestInfoViewModel dependentAutoInvestInfoViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1514356114);
        int i3 = (gapComposer.changed(dependentAutoInvestInfoViewModel) ? 4 : 2) | i;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (dependentAutoInvestInfoViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, dependentAutoInvestInfoViewModel, function1, i, i4) { // from class: com.squareup.cash.investing.components.ordertype.autoinvest.DependentAutoInvestInfoBottomSheetView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ DependentAutoInvestInfoBottomSheetView f$0;
                        public final /* synthetic */ DependentAutoInvestInfoViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            DependentAutoInvestInfoViewModel dependentAutoInvestInfoViewModel2 = this.f$1;
                            DependentAutoInvestInfoBottomSheetView dependentAutoInvestInfoBottomSheetView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = DependentAutoInvestInfoBottomSheetView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    dependentAutoInvestInfoBottomSheetView.Content(dependentAutoInvestInfoViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    dependentAutoInvestInfoBottomSheetView.Content(dependentAutoInvestInfoViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2082545571, new CashMapViewKt$$ExternalSyntheticLambda5(dependentAutoInvestInfoViewModel, 9), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            final int i6 = i2;
            endRestartGroup2.block = new Function2(this, dependentAutoInvestInfoViewModel, function1, i6, i5) { // from class: com.squareup.cash.investing.components.ordertype.autoinvest.DependentAutoInvestInfoBottomSheetView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ DependentAutoInvestInfoBottomSheetView f$0;
                public final /* synthetic */ DependentAutoInvestInfoViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    DependentAutoInvestInfoViewModel dependentAutoInvestInfoViewModel2 = this.f$1;
                    DependentAutoInvestInfoBottomSheetView dependentAutoInvestInfoBottomSheetView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = DependentAutoInvestInfoBottomSheetView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            dependentAutoInvestInfoBottomSheetView.Content(dependentAutoInvestInfoViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            dependentAutoInvestInfoBottomSheetView.Content(dependentAutoInvestInfoViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
        Content((DependentAutoInvestInfoViewModel) obj, function1, gapComposer, 0);
    }
}
