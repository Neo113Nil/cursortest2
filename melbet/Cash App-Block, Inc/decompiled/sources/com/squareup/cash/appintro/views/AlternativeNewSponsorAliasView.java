package com.squareup.cash.appintro.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.appintro.viewmodels.AlternativeNewSponsorAliasViewModel;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class AlternativeNewSponsorAliasView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlternativeNewSponsorAliasView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(AlternativeNewSponsorAliasViewModel alternativeNewSponsorAliasViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1262555318);
        int i2 = (gapComposer.changedInstance(alternativeNewSponsorAliasViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (alternativeNewSponsorAliasViewModel == null) {
                gapComposer.startReplaceGroup(-1756727376);
            } else {
                gapComposer.startReplaceGroup(-1756727375);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1786142811, new AlternativeNewSponsorAliasView$$ExternalSyntheticLambda0(alternativeNewSponsorAliasViewModel, function1), gapComposer), gapComposer, 6);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8((Object) this, (Object) alternativeNewSponsorAliasViewModel, function1, i, 20);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AlternativeNewSponsorAliasViewModel) obj, function1, gapComposer, 0);
    }
}
