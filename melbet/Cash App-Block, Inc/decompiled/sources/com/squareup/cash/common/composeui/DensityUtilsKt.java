package com.squareup.cash.common.composeui;

import android.os.Build;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape;
import androidx.compose.foundation.shape.DpCornerSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.squareup.cash.core.navigationcontainer.UiContainer;

/* loaded from: classes6.dex */
public abstract class DensityUtilsKt {
    public static final AbsoluteRoundedCornerShape displayRoundedCornerShapeOrNull(UiContainer uiContainer, Composer composer) {
        uiContainer.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1292746071);
        if (Build.VERSION.SDK_INT < 31) {
            gapComposer.end(false);
            return null;
        }
        WindowInsets rootWindowInsets = uiContainer.getRootWindowInsets();
        if (rootWindowInsets == null) {
            gapComposer.end(false);
            return null;
        }
        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
        int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
        RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        int radius2 = roundedCorner2 != null ? roundedCorner2.getRadius() : 0;
        RoundedCorner roundedCorner3 = rootWindowInsets.getRoundedCorner(2);
        int radius3 = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
        RoundedCorner roundedCorner4 = rootWindowInsets.getRoundedCorner(3);
        int radius4 = roundedCorner4 != null ? roundedCorner4.getRadius() : 0;
        if (radius == 0 && radius2 == 0 && radius3 == 0 && radius4 == 0) {
            gapComposer.end(false);
            return null;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = new AbsoluteRoundedCornerShape(new DpCornerSize(density.mo233toDpu2uoSUM(radius)), new DpCornerSize(density.mo233toDpu2uoSUM(radius2)), new DpCornerSize(density.mo233toDpu2uoSUM(radius3)), new DpCornerSize(density.mo233toDpu2uoSUM(radius4)));
        gapComposer.end(false);
        return absoluteRoundedCornerShape;
    }

    /* renamed from: toPx-8Feqmps, reason: not valid java name */
    public static final float m3477toPx8Feqmps(float f, Composer composer) {
        return ((Density) ((GapComposer) composer).consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f);
    }
}
