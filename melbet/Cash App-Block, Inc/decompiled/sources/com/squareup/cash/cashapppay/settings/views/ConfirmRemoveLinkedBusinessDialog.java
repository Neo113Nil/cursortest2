package com.squareup.cash.cashapppay.settings.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ConfirmRemoveLinkedBusinessDialog extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmRemoveLinkedBusinessDialog(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel, final Function1 function1, Composer composer, final int i) {
        ConfirmRemoveLinkedBusinessDialog confirmRemoveLinkedBusinessDialog;
        RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1133950304);
        int i3 = (gapComposer.changedInstance(removeLinkedBusinessViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            confirmRemoveLinkedBusinessDialog = this;
            removeLinkedBusinessViewModel2 = removeLinkedBusinessViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (removeLinkedBusinessViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, removeLinkedBusinessViewModel, function1, i, i4) { // from class: com.squareup.cash.cashapppay.settings.views.ConfirmRemoveLinkedBusinessDialog$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ConfirmRemoveLinkedBusinessDialog f$0;
                        public final /* synthetic */ RemoveLinkedBusinessViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel3 = this.f$1;
                            ConfirmRemoveLinkedBusinessDialog confirmRemoveLinkedBusinessDialog2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = ConfirmRemoveLinkedBusinessDialog.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    confirmRemoveLinkedBusinessDialog2.Content(removeLinkedBusinessViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    confirmRemoveLinkedBusinessDialog2.Content(removeLinkedBusinessViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            confirmRemoveLinkedBusinessDialog = this;
            removeLinkedBusinessViewModel2 = removeLinkedBusinessViewModel;
            function12 = function1;
            i2 = i;
            UnlinkResultViewKt.ConfirmRemoveLinkedBusinessContent(removeLinkedBusinessViewModel2, function12, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel3 = removeLinkedBusinessViewModel2;
            final ConfirmRemoveLinkedBusinessDialog confirmRemoveLinkedBusinessDialog2 = confirmRemoveLinkedBusinessDialog;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(confirmRemoveLinkedBusinessDialog2, removeLinkedBusinessViewModel3, function13, i5, i6) { // from class: com.squareup.cash.cashapppay.settings.views.ConfirmRemoveLinkedBusinessDialog$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ConfirmRemoveLinkedBusinessDialog f$0;
                public final /* synthetic */ RemoveLinkedBusinessViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = confirmRemoveLinkedBusinessDialog2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel32 = this.f$1;
                    ConfirmRemoveLinkedBusinessDialog confirmRemoveLinkedBusinessDialog22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = ConfirmRemoveLinkedBusinessDialog.$r8$clinit;
                    switch (i52) {
                        case 0:
                            confirmRemoveLinkedBusinessDialog22.Content(removeLinkedBusinessViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            confirmRemoveLinkedBusinessDialog22.Content(removeLinkedBusinessViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((RemoveLinkedBusinessViewModel) obj, function1, gapComposer, 0);
    }
}
