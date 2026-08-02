package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.protos.franklin.api.FormBlocker;

/* loaded from: classes6.dex */
public final class ArcadeFormCaptionedTile extends AbstractComposeView {
    public final FormBlocker.Element.CaptionedTileElement element;
    public final RealImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormCaptionedTile(Context context, FormBlocker.Element.CaptionedTileElement captionedTileElement, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        context.getClass();
        this.element = captionedTileElement;
        this.imageLoader = realImageLoader;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(575049748);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(194551209, new ArcadeFormCaptionedTile$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormCaptionedTile$$ExternalSyntheticLambda0(this, i);
        }
    }
}
