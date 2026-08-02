package com.squareup.cash.history.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.history.viewmodels.CancelPendingSupPaymentViewModel;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class CancelPendingSupPaymentBottomSheet extends ComposeUiView implements BottomSheetConfig, OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelPendingSupPaymentBottomSheet(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel, final Function1 function1, Composer composer, final int i) {
        CancelPendingSupPaymentBottomSheet cancelPendingSupPaymentBottomSheet;
        CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1665913099);
        int i3 = (gapComposer.changedInstance(cancelPendingSupPaymentViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            cancelPendingSupPaymentBottomSheet = this;
            cancelPendingSupPaymentViewModel2 = cancelPendingSupPaymentViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (cancelPendingSupPaymentViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, cancelPendingSupPaymentViewModel, function1, i, i4) { // from class: com.squareup.cash.history.views.CancelPendingSupPaymentBottomSheet$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ CancelPendingSupPaymentBottomSheet f$0;
                        public final /* synthetic */ CancelPendingSupPaymentViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel3 = this.f$1;
                            CancelPendingSupPaymentBottomSheet cancelPendingSupPaymentBottomSheet2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = CancelPendingSupPaymentBottomSheet.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    cancelPendingSupPaymentBottomSheet2.Content(cancelPendingSupPaymentViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    cancelPendingSupPaymentBottomSheet2.Content(cancelPendingSupPaymentViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            cancelPendingSupPaymentBottomSheet = this;
            cancelPendingSupPaymentViewModel2 = cancelPendingSupPaymentViewModel;
            function12 = function1;
            i2 = i;
            ReportAbuseViewKt.CancelPendingSupPaymentBottomSheet(cancelPendingSupPaymentViewModel2, function12, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel3 = cancelPendingSupPaymentViewModel2;
            final CancelPendingSupPaymentBottomSheet cancelPendingSupPaymentBottomSheet2 = cancelPendingSupPaymentBottomSheet;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(cancelPendingSupPaymentBottomSheet2, cancelPendingSupPaymentViewModel3, function13, i5, i6) { // from class: com.squareup.cash.history.views.CancelPendingSupPaymentBottomSheet$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ CancelPendingSupPaymentBottomSheet f$0;
                public final /* synthetic */ CancelPendingSupPaymentViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = cancelPendingSupPaymentBottomSheet2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel32 = this.f$1;
                    CancelPendingSupPaymentBottomSheet cancelPendingSupPaymentBottomSheet22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = CancelPendingSupPaymentBottomSheet.$r8$clinit;
                    switch (i52) {
                        case 0:
                            cancelPendingSupPaymentBottomSheet22.Content(cancelPendingSupPaymentViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            cancelPendingSupPaymentBottomSheet22.Content(cancelPendingSupPaymentViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((CancelPendingSupPaymentViewModel) obj, function1, gapComposer, 0);
    }
}
