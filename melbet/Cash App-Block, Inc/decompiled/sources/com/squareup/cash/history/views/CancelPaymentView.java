package com.squareup.cash.history.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.history.viewmodels.CancelPaymentViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class CancelPaymentView extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelPaymentView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final CancelPaymentViewModel cancelPaymentViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(697178546);
        int i3 = (gapComposer.changedInstance(cancelPaymentViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (cancelPaymentViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, cancelPaymentViewModel, function1, i, i4) { // from class: com.squareup.cash.history.views.CancelPaymentView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ CancelPaymentView f$0;
                        public final /* synthetic */ CancelPaymentViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            CancelPaymentViewModel cancelPaymentViewModel2 = this.f$1;
                            CancelPaymentView cancelPaymentView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = CancelPaymentView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    cancelPaymentView.Content(cancelPaymentViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    cancelPaymentView.Content(cancelPaymentViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1699908221, new ErrorView$$ExternalSyntheticLambda1(28, cancelPaymentViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            final int i6 = i2;
            endRestartGroup2.block = new Function2(this, cancelPaymentViewModel, function1, i6, i5) { // from class: com.squareup.cash.history.views.CancelPaymentView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ CancelPaymentView f$0;
                public final /* synthetic */ CancelPaymentViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    CancelPaymentViewModel cancelPaymentViewModel2 = this.f$1;
                    CancelPaymentView cancelPaymentView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = CancelPaymentView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            cancelPaymentView.Content(cancelPaymentViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            cancelPaymentView.Content(cancelPaymentViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((CancelPaymentViewModel) obj, function1, gapComposer, 0);
    }
}
