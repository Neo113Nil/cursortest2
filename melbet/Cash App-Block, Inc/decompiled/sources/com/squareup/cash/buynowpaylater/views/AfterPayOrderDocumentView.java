package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDocumentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class AfterPayOrderDocumentView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderDocumentView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final AfterPayOrderDocumentViewModel afterPayOrderDocumentViewModel, final Function1 function1, Composer composer, final int i) {
        AfterPayOrderDocumentView afterPayOrderDocumentView;
        AfterPayOrderDocumentViewModel afterPayOrderDocumentViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-145690221);
        int i3 = (gapComposer.changedInstance(afterPayOrderDocumentViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            afterPayOrderDocumentView = this;
            afterPayOrderDocumentViewModel2 = afterPayOrderDocumentViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (afterPayOrderDocumentViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, afterPayOrderDocumentViewModel, function1, i, i4) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDocumentView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ AfterPayOrderDocumentView f$0;
                        public final /* synthetic */ AfterPayOrderDocumentViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            AfterPayOrderDocumentViewModel afterPayOrderDocumentViewModel3 = this.f$1;
                            AfterPayOrderDocumentView afterPayOrderDocumentView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = AfterPayOrderDocumentView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    afterPayOrderDocumentView2.Content(afterPayOrderDocumentViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    afterPayOrderDocumentView2.Content(afterPayOrderDocumentViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            afterPayOrderDocumentView = this;
            afterPayOrderDocumentViewModel2 = afterPayOrderDocumentViewModel;
            function12 = function1;
            i2 = i;
            ImageUtilsKt.DocumentView(afterPayOrderDocumentViewModel2, function12, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final AfterPayOrderDocumentViewModel afterPayOrderDocumentViewModel3 = afterPayOrderDocumentViewModel2;
            final AfterPayOrderDocumentView afterPayOrderDocumentView2 = afterPayOrderDocumentView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(afterPayOrderDocumentView2, afterPayOrderDocumentViewModel3, function13, i5, i6) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDocumentView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ AfterPayOrderDocumentView f$0;
                public final /* synthetic */ AfterPayOrderDocumentViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = afterPayOrderDocumentView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    AfterPayOrderDocumentViewModel afterPayOrderDocumentViewModel32 = this.f$1;
                    AfterPayOrderDocumentView afterPayOrderDocumentView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = AfterPayOrderDocumentView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            afterPayOrderDocumentView22.Content(afterPayOrderDocumentViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            afterPayOrderDocumentView22.Content(afterPayOrderDocumentViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AfterPayOrderDocumentViewModel) obj, function1, gapComposer, 0);
    }
}
