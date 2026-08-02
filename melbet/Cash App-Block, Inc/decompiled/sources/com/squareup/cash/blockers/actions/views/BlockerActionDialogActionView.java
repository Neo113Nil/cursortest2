package com.squareup.cash.blockers.actions.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionDialogActionViewModel;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class BlockerActionDialogActionView extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockerActionDialogActionView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final BlockerActionDialogActionViewModel blockerActionDialogActionViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1256823148);
        int i3 = (gapComposer.changedInstance(blockerActionDialogActionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (blockerActionDialogActionViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, blockerActionDialogActionViewModel, function1, i, i4) { // from class: com.squareup.cash.blockers.actions.views.BlockerActionDialogActionView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ BlockerActionDialogActionView f$0;
                        public final /* synthetic */ BlockerActionDialogActionViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            BlockerActionDialogActionViewModel blockerActionDialogActionViewModel2 = this.f$1;
                            BlockerActionDialogActionView blockerActionDialogActionView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = BlockerActionDialogActionView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    blockerActionDialogActionView.Content(blockerActionDialogActionViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    blockerActionDialogActionView.Content(blockerActionDialogActionViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(664093609, new SetPinViewKt$$ExternalSyntheticLambda2(6, (Object) blockerActionDialogActionViewModel, (Object) function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            final int i6 = i2;
            endRestartGroup2.block = new Function2(this, blockerActionDialogActionViewModel, function1, i6, i5) { // from class: com.squareup.cash.blockers.actions.views.BlockerActionDialogActionView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ BlockerActionDialogActionView f$0;
                public final /* synthetic */ BlockerActionDialogActionViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    BlockerActionDialogActionViewModel blockerActionDialogActionViewModel2 = this.f$1;
                    BlockerActionDialogActionView blockerActionDialogActionView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = BlockerActionDialogActionView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            blockerActionDialogActionView.Content(blockerActionDialogActionViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            blockerActionDialogActionView.Content(blockerActionDialogActionViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BlockerActionDialogActionViewModel) obj, function1, gapComposer, 0);
    }
}
