package com.squareup.cash.history.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.history.viewmodels.PaymentReceiptDialogViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class PaymentReceiptDialogView extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentReceiptDialogView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final PaymentReceiptDialogViewModel paymentReceiptDialogViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(238046804);
        int i3 = (gapComposer.changedInstance(paymentReceiptDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 1;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (paymentReceiptDialogViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2(this, paymentReceiptDialogViewModel, function1, i, i5) { // from class: com.squareup.cash.history.views.PaymentReceiptDialogView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ PaymentReceiptDialogView f$0;
                        public final /* synthetic */ PaymentReceiptDialogViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i5;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            PaymentReceiptDialogViewModel paymentReceiptDialogViewModel2 = this.f$1;
                            PaymentReceiptDialogView paymentReceiptDialogView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i7 = PaymentReceiptDialogView.$r8$clinit;
                            switch (i6) {
                                case 0:
                                    paymentReceiptDialogView.Content(paymentReceiptDialogViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    paymentReceiptDialogView.Content(paymentReceiptDialogViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1029907863, new SkipPaymentView$$ExternalSyntheticLambda1(i4, paymentReceiptDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i6 = 1;
            final int i7 = i2;
            endRestartGroup2.block = new Function2(this, paymentReceiptDialogViewModel, function1, i7, i6) { // from class: com.squareup.cash.history.views.PaymentReceiptDialogView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ PaymentReceiptDialogView f$0;
                public final /* synthetic */ PaymentReceiptDialogViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    PaymentReceiptDialogViewModel paymentReceiptDialogViewModel2 = this.f$1;
                    PaymentReceiptDialogView paymentReceiptDialogView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i72 = PaymentReceiptDialogView.$r8$clinit;
                    switch (i62) {
                        case 0:
                            paymentReceiptDialogView.Content(paymentReceiptDialogViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            paymentReceiptDialogView.Content(paymentReceiptDialogViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((PaymentReceiptDialogViewModel) obj, function1, gapComposer, 0);
    }
}
