package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.viewmodels.UnselectableOptionViewModel;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class UnselectableOptionView extends ComposeUiView {
    public final boolean hideKeyboard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnselectableOptionView(Context context) {
        super(context);
        context.getClass();
        this.hideKeyboard = true;
    }

    public final void Content(final UnselectableOptionViewModel unselectableOptionViewModel, final Function1 function1, Composer composer, final int i) {
        UnselectableOptionView unselectableOptionView;
        final UnselectableOptionViewModel unselectableOptionViewModel2;
        final Function1 function12;
        final int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(150910689);
        int i3 = (gapComposer.changedInstance(unselectableOptionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            unselectableOptionView = this;
            unselectableOptionViewModel2 = unselectableOptionViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (unselectableOptionViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, unselectableOptionViewModel, function1, i, i4) { // from class: com.squareup.cash.blockers.views.UnselectableOptionView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ UnselectableOptionView f$0;
                        public final /* synthetic */ UnselectableOptionViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            UnselectableOptionViewModel unselectableOptionViewModel3 = this.f$1;
                            UnselectableOptionView unselectableOptionView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    unselectableOptionView2.Content(unselectableOptionViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    unselectableOptionView2.Content(unselectableOptionViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            unselectableOptionView = this;
            unselectableOptionViewModel2 = unselectableOptionViewModel;
            boolean z = true;
            function12 = function1;
            i2 = i;
            if (unselectableOptionView.hideKeyboard) {
                gapComposer.startReplaceGroup(-1050256441);
                Unit unit = Unit.INSTANCE;
                if ((i3 & 896) != 256) {
                    z = false;
                }
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TemporaryStorage$getDir$2(unselectableOptionView, null, 7);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1050169951);
                gapComposer.end(false);
            }
            SsnViewKt.UnselectableOptionDialogView(unselectableOptionViewModel2, function12, null, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final UnselectableOptionView unselectableOptionView2 = unselectableOptionView;
            final int i5 = 1;
            endRestartGroup2.block = new Function2(unselectableOptionView2, unselectableOptionViewModel2, function12, i2, i5) { // from class: com.squareup.cash.blockers.views.UnselectableOptionView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ UnselectableOptionView f$0;
                public final /* synthetic */ UnselectableOptionViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = unselectableOptionView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function13 = this.f$2;
                    UnselectableOptionViewModel unselectableOptionViewModel3 = this.f$1;
                    UnselectableOptionView unselectableOptionView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            unselectableOptionView22.Content(unselectableOptionViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            unselectableOptionView22.Content(unselectableOptionViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((UnselectableOptionViewModel) obj, function1, gapComposer, 0);
    }
}
