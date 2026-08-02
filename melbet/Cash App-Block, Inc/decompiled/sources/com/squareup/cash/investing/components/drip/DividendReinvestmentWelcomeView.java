package com.squareup.cash.investing.components.drip;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentWelcomeViewModel;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class DividendReinvestmentWelcomeView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividendReinvestmentWelcomeView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel, final Function1 function1, Composer composer, final int i) {
        DividendReinvestmentWelcomeView dividendReinvestmentWelcomeView;
        DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-102399285);
        int i3 = (gapComposer.changed(dividendReinvestmentWelcomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            dividendReinvestmentWelcomeView = this;
            dividendReinvestmentWelcomeViewModel2 = dividendReinvestmentWelcomeViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (dividendReinvestmentWelcomeViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, dividendReinvestmentWelcomeViewModel, function1, i, i4) { // from class: com.squareup.cash.investing.components.drip.DividendReinvestmentWelcomeView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ DividendReinvestmentWelcomeView f$0;
                        public final /* synthetic */ DividendReinvestmentWelcomeViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel3 = this.f$1;
                            DividendReinvestmentWelcomeView dividendReinvestmentWelcomeView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = DividendReinvestmentWelcomeView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    dividendReinvestmentWelcomeView2.Content(dividendReinvestmentWelcomeViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    dividendReinvestmentWelcomeView2.Content(dividendReinvestmentWelcomeViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            dividendReinvestmentWelcomeView = this;
            dividendReinvestmentWelcomeViewModel2 = dividendReinvestmentWelcomeViewModel;
            function12 = function1;
            i2 = i;
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-336804240, new SkipPaymentView$$ExternalSyntheticLambda1(28, dividendReinvestmentWelcomeViewModel2, function12), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel3 = dividendReinvestmentWelcomeViewModel2;
            final DividendReinvestmentWelcomeView dividendReinvestmentWelcomeView2 = dividendReinvestmentWelcomeView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(dividendReinvestmentWelcomeView2, dividendReinvestmentWelcomeViewModel3, function13, i5, i6) { // from class: com.squareup.cash.investing.components.drip.DividendReinvestmentWelcomeView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ DividendReinvestmentWelcomeView f$0;
                public final /* synthetic */ DividendReinvestmentWelcomeViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = dividendReinvestmentWelcomeView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel32 = this.f$1;
                    DividendReinvestmentWelcomeView dividendReinvestmentWelcomeView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = DividendReinvestmentWelcomeView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            dividendReinvestmentWelcomeView22.Content(dividendReinvestmentWelcomeViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            dividendReinvestmentWelcomeView22.Content(dividendReinvestmentWelcomeViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((DividendReinvestmentWelcomeViewModel) obj, function1, gapComposer, 0);
    }
}
