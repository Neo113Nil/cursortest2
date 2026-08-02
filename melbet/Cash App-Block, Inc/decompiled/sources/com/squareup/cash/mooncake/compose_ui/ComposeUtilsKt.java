package com.squareup.cash.mooncake.compose_ui;

import android.content.Context;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest$Action$Disable;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest$Action$Enable;
import com.squareup.protos.cash.ui.Image;
import kotlin.math.MathKt__MathJVMKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public abstract class ComposeUtilsKt {
    public static ToggleOverdraftRequest ToggleOverdraftRequest$default(ToggleOverdraftRequest.Enable enable, ToggleOverdraftRequest.Disable disable, int i) {
        if ((i & 1) != 0) {
            enable = null;
        }
        if ((i & 2) != 0) {
            disable = null;
        }
        return new ToggleOverdraftRequest(enable != null ? new ToggleOverdraftRequest$Action$Enable(enable) : disable != null ? new ToggleOverdraftRequest$Action$Disable(disable) : null, null, ByteString.EMPTY);
    }

    public static final long currentAbsoluteScrollOffset(PagerState pagerState) {
        return MathKt__MathJVMKt.roundToLong(((ParcelableSnapshotMutableFloatState) pagerState.scrollPosition.fieldSortOrder).getFloatValue() * pagerState.getPageSizeWithSpacing$foundation()) + (((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() * pagerState.getPageSizeWithSpacing$foundation());
    }

    public static final String getThemedUrl(Image image, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        if (image == null) {
            gapComposer.startReplaceGroup(1624487118);
            gapComposer.end(false);
            return null;
        }
        gapComposer.startReplaceGroup(883686803);
        String urlForTheme = ThemablesKt.urlForTheme(image, ThemeHelpersKt.themeInfo((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)));
        gapComposer.end(false);
        return urlForTheme;
    }

    public static final Color toComposeColor(com.squareup.protos.cash.ui.Color color, Composer composer) {
        Integer forTheme;
        GapComposer gapComposer = (GapComposer) composer;
        if (color == null) {
            gapComposer.startReplaceGroup(119159030);
            gapComposer.end(false);
            forTheme = null;
        } else {
            gapComposer.startReplaceGroup(-688892821);
            gapComposer.startReplaceGroup(-1321081756);
            forTheme = ThemablesKt.forTheme(color, ThemeHelpersKt.themeInfo((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)));
            gapComposer.end(false);
            gapComposer.end(false);
        }
        if (forTheme != null) {
            return new Color(ColorKt.Color(forTheme.intValue()));
        }
        return null;
    }
}
