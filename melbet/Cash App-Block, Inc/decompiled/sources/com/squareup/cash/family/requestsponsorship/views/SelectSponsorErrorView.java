package com.squareup.cash.family.requestsponsorship.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorErrorViewModel;
import com.squareup.cash.formview.components.FormCashtag$8$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class SelectSponsorErrorView extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectSponsorErrorView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final SelectSponsorErrorViewModel selectSponsorErrorViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(261159015);
        int i3 = (gapComposer.changedInstance(selectSponsorErrorViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (selectSponsorErrorViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, selectSponsorErrorViewModel, function1, i, i4) { // from class: com.squareup.cash.family.requestsponsorship.views.SelectSponsorErrorView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ SelectSponsorErrorView f$0;
                        public final /* synthetic */ SelectSponsorErrorViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            SelectSponsorErrorViewModel selectSponsorErrorViewModel2 = this.f$1;
                            SelectSponsorErrorView selectSponsorErrorView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = SelectSponsorErrorView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    selectSponsorErrorView.Content(selectSponsorErrorViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    selectSponsorErrorView.Content(selectSponsorErrorViewModel2, function12, composer2, Updater.updateChangedFlags(1));
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
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1169486596, new FormCashtag$8$$ExternalSyntheticLambda0(7, selectSponsorErrorViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            final int i6 = i2;
            endRestartGroup2.block = new Function2(this, selectSponsorErrorViewModel, function1, i6, i5) { // from class: com.squareup.cash.family.requestsponsorship.views.SelectSponsorErrorView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ SelectSponsorErrorView f$0;
                public final /* synthetic */ SelectSponsorErrorViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    SelectSponsorErrorViewModel selectSponsorErrorViewModel2 = this.f$1;
                    SelectSponsorErrorView selectSponsorErrorView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = SelectSponsorErrorView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            selectSponsorErrorView.Content(selectSponsorErrorViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            selectSponsorErrorView.Content(selectSponsorErrorViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((SelectSponsorErrorViewModel) obj, function1, gapComposer, 0);
    }
}
