package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.Navigation;
import androidx.room.util.DBUtil;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CardPreviewViewKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.values().length];
            try {
                iArr[CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.UNKNOWN_LOCAL_THEME_UPSELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.BRAT_THEME_UPSELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.PINK_THEME_UPSELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.GLITTER_THEME_UPSELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.TORTOISE_THEME_UPSELL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        new CardTheme("_glow123", "#ff000000", "#ffccff00", null, null, CardTheme.Gradient.DIAGONAL_DARK, null, "#ff000000", "#ffd2d2d2", null, null, null, null, 16750366);
        EmptyList.INSTANCE.getClass();
        CardPresentationStyle.PSEUDO_3D.getClass();
    }

    public static final void CardPreview(Modifier modifier, CardPreviewViewModel cardPreviewViewModel, Function1 function1, TextureViewFpsTracker textureViewFpsTracker, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1026000083);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(cardPreviewViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer.changed(textureViewFpsTracker) : gapComposer.changedInstance(textureViewFpsTracker) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            if (textureViewFpsTracker != null) {
                gapComposer.startReplaceGroup(1713973303);
                boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && gapComposer.changedInstance(textureViewFpsTracker)));
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CardPreviewViewKt$$ExternalSyntheticLambda0(function1, textureViewFpsTracker, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1714032885);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1531887298, new BulletinTileKt$$ExternalSyntheticLambda9(cardPreviewViewModel, function1, textureViewFpsTracker), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(i, 22, modifier2, cardPreviewViewModel, function1, textureViewFpsTracker, false);
        }
    }

    public static final void ThemeInfoBottomSheet(CardPreviewSheet cardPreviewSheet, Function0 function0, Composer composer, int i) {
        CardPreviewSheet cardPreviewSheet2;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-581114160);
        int i2 = (gapComposer.changedInstance(cardPreviewSheet) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            cardPreviewSheet2 = cardPreviewSheet;
            function02 = function0;
            ComposeBottomSheetKt.BottomSheet(null, cardPreviewSheet2, function02, false, false, 0, null, Navigation.ArcadeBottomSheetStyle(gapComposer), CanvasKt.lambda$1081811144, gapComposer, ((i2 << 3) & 112) | 117440896, 121);
        } else {
            cardPreviewSheet2 = cardPreviewSheet;
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(cardPreviewSheet2, function02, i, 20);
        }
    }

    public static final void ThemeInfoSheet(CardPreviewSheet cardPreviewSheet, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(885047047);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(cardPreviewSheet) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(600448220, new BulletinTileKt$$ExternalSyntheticLambda6(cardPreviewSheet, 12), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(cardPreviewSheet, i, 11);
        }
    }
}
