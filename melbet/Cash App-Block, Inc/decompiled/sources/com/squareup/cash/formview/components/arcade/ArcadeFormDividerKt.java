package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormElementViewBuilder$$ExternalSyntheticLambda25;
import com.squareup.protos.franklin.api.FormBlocker;

/* loaded from: classes6.dex */
public abstract class ArcadeFormDividerKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.Element.DividerElement.DividerStyle.values().length];
            try {
                iArr[FormBlocker.Element.DividerElement.DividerStyle.HAIRLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.DividerElement.DividerStyle.ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.DividerElement.DividerStyle.SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ArcadeFormDivider(FormBlocker.Element.DividerElement dividerElement, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(695066592);
        int i2 = (gapComposer.changedInstance(dividerElement) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(232776949, new FormElementViewBuilder$$ExternalSyntheticLambda25(dividerElement, 1, (byte) 0), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormElementViewBuilder$$ExternalSyntheticLambda25(dividerElement, i);
        }
    }
}
