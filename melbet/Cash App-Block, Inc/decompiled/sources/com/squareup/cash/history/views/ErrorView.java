package com.squareup.cash.history.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.history.viewmodels.ErrorViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ErrorView extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final ErrorViewModel errorViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(549322766);
        int i3 = (gapComposer.changedInstance(errorViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 0;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (errorViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2(this, errorViewModel, function1, i, i5) { // from class: com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ErrorView f$0;
                        public final /* synthetic */ ErrorViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i5;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            ErrorViewModel errorViewModel2 = this.f$1;
                            ErrorView errorView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i7 = ErrorView.$r8$clinit;
                            switch (i6) {
                                case 0:
                                    errorView.Content(errorViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    errorView.Content(errorViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-83336743, new ErrorView$$ExternalSyntheticLambda1(i4, errorViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i6 = 1;
            final int i7 = i2;
            endRestartGroup2.block = new Function2(this, errorViewModel, function1, i7, i6) { // from class: com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ErrorView f$0;
                public final /* synthetic */ ErrorViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    ErrorViewModel errorViewModel2 = this.f$1;
                    ErrorView errorView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i72 = ErrorView.$r8$clinit;
                    switch (i62) {
                        case 0:
                            errorView.Content(errorViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            errorView.Content(errorViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ErrorViewModel) obj, function1, gapComposer, 0);
    }
}
