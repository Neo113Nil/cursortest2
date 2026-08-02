package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class ArcadeFormTextKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[FormBlocker.Element.TextElement.Size.values().length];
            try {
                iArr[FormBlocker.Element.TextElement.Size.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.TextElement.Size.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.TextElement.Size.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FormBlocker.Element.TextElement.Size.EXTRA_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FormBlocker.Element.TextElement.TextColor.values().length];
            try {
                iArr2[FormBlocker.Element.TextElement.TextColor.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FormBlocker.Element.TextElement.TextColor.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FormBlocker.Element.TextElement.TextColor.BRAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FormBlocker.Element.TextElement.TextColor.TERTIARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FormBlocker.Element.TextElement.HorizontalAlignment.values().length];
            try {
                iArr3[FormBlocker.Element.TextElement.HorizontalAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[FormBlocker.Element.TextElement.HorizontalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[FormBlocker.Element.TextElement.HorizontalAlignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void ArcadeFormText(FormBlocker.Element.TextElement textElement, boolean z, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(686854680);
        int i2 = i | (gapComposer.changedInstance(textElement) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-943367187, new TabContentViewKt$$ExternalSyntheticLambda26(textElement, z, function1), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(textElement, z, function1, modifier2, i, 19);
        }
    }
}
