package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormElementViewBuilder$$ExternalSyntheticLambda18;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.api.FormBlocker;
import squareup.cash.ui.arcade.elements.HorizontalAlignment;

/* loaded from: classes6.dex */
public abstract class ArcadeFormHeroNumericsKt {

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HorizontalAlignment.values().length];
            try {
                iArr[HorizontalAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalAlignment.TRAILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HorizontalAlignment.HORIZONTALLY_CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ArcadeFormHeroNumerics(FormBlocker.Element.HeroNumericsHeaderElement heroNumericsHeaderElement, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(308262063);
        int i2 = (gapComposer.changedInstance(heroNumericsHeaderElement) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1716741892, new FormElementViewBuilder$$ExternalSyntheticLambda18(heroNumericsHeaderElement, 1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(heroNumericsHeaderElement, modifier, i, 8);
        }
    }
}
