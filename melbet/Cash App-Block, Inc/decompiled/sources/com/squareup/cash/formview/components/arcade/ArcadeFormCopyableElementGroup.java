package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.protos.franklin.api.FormBlocker;

/* loaded from: classes6.dex */
public final class ArcadeFormCopyableElementGroup extends AbstractComposeView {
    public final FormBlocker.Element.CopyableElementGroup elementGroup;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormCopyableElementGroup(Context context, FormBlocker.Element.CopyableElementGroup copyableElementGroup) {
        super(context, null, 6, 0);
        context.getClass();
        this.elementGroup = copyableElementGroup;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(196677412);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1364904967, new ArcadeFormCopyableElementGroup$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormCopyableElementGroup$$ExternalSyntheticLambda0(this, i);
        }
    }
}
