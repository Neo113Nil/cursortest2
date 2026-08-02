package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.blockers.viewmodels.ConfirmableOptionViewModel;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class ConfirmableOptionView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmableOptionView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final ConfirmableOptionViewModel confirmableOptionViewModel, final Function1 function1, Composer composer, final int i) {
        ConfirmableOptionViewModel confirmableOptionViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1553662146);
        int i3 = (gapComposer.changedInstance(confirmableOptionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            confirmableOptionViewModel2 = confirmableOptionViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (confirmableOptionViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, confirmableOptionViewModel, function1, i, i4) { // from class: com.squareup.cash.blockers.views.ConfirmableOptionView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ConfirmableOptionView f$0;
                        public final /* synthetic */ ConfirmableOptionViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            ConfirmableOptionViewModel confirmableOptionViewModel3 = this.f$1;
                            ConfirmableOptionView confirmableOptionView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = ConfirmableOptionView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    confirmableOptionView.Content(confirmableOptionViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    confirmableOptionView.Content(confirmableOptionViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            confirmableOptionViewModel2 = confirmableOptionViewModel;
            function12 = function1;
            i2 = i;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(4, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeModal2Kt.Modal(null, confirmableOptionViewModel2, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(1464264433, new BookletGridKt$$ExternalSyntheticLambda1(5, function12), gapComposer), gapComposer, ((i3 << 3) & 112) | 1572864, 57);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final ConfirmableOptionViewModel confirmableOptionViewModel3 = confirmableOptionViewModel2;
            final int i5 = 1;
            final Function1 function13 = function12;
            final int i6 = i2;
            endRestartGroup2.block = new Function2(this, confirmableOptionViewModel3, function13, i6, i5) { // from class: com.squareup.cash.blockers.views.ConfirmableOptionView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ConfirmableOptionView f$0;
                public final /* synthetic */ ConfirmableOptionViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    ConfirmableOptionViewModel confirmableOptionViewModel32 = this.f$1;
                    ConfirmableOptionView confirmableOptionView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = ConfirmableOptionView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            confirmableOptionView.Content(confirmableOptionViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            confirmableOptionView.Content(confirmableOptionViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ConfirmableOptionViewModel) obj, function1, gapComposer, 0);
    }
}
