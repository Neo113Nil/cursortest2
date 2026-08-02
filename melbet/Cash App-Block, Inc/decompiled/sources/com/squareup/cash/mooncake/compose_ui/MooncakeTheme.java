package com.squareup.cash.mooncake.compose_ui;

import android.content.Context;
import android.view.textclassifier.TextClassification;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.R;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.presenters.DemandDepositAccountFormatter;
import com.squareup.cash.banking.viewmodels.AccountDetailsContent;
import com.squareup.cash.mooncake.themes.AppThemePalettesKt;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class MooncakeTheme {
    public static final AccountDetailsContent accountDetailsContent(DirectDepositAccount directDepositAccount, DemandDepositAccountFormatter demandDepositAccountFormatter, AndroidStringManager androidStringManager) {
        String m$1;
        directDepositAccount.getClass();
        String str = directDepositAccount.account_number;
        if (str == null || (m$1 = DemandDepositAccountFormatter.formatAccount(str)) == null) {
            m$1 = Recorder$$ExternalSyntheticOutline2.m$1(directDepositAccount.account_number_prefix, " •••• ••••");
        }
        String str2 = m$1;
        String str3 = directDepositAccount.routing_number;
        str3.getClass();
        return new AccountDetailsContent(DemandDepositAccountFormatter.formatRouting(str3), androidStringManager.get(R.string.routing_number_label), str2, androidStringManager.get(R.string.account_number_label), str != null && Intrinsics.areEqual(directDepositAccount.is_placeholder, Boolean.FALSE));
    }

    public static ComposeColorPalette getColors(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        ComposeColorPalette composeColorPalette = (ComposeColorPalette) gapComposer.consume(ComposeColorPaletteKt.LocalColorPalette);
        if (composeColorPalette != null) {
            return composeColorPalette;
        }
        ThemeInfo currentTheme = ComposeMooncakeThemeKt.currentTheme((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext));
        if (!((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue()) {
            gapComposer.startReplaceGroup(-248607453);
            gapComposer.end(false);
            return ComposeColorPaletteKt.toComposeColorPalette(currentTheme.colorPalette, currentTheme.theme == Theme.MooncakeLight);
        }
        gapComposer.startReplaceGroup(-248673390);
        currentTheme.getClass();
        ComposeColorPalette composeColorPalette2 = currentTheme.theme == Theme.MooncakeDark ? ComposeColorPaletteKt.toComposeColorPalette(AppThemePalettesKt.withArcadeValues(AppThemePalettesKt.darkThemePalette, ColorsDarkKt.colorsDark), false) : ComposeColorPaletteKt.toComposeColorPalette(AppThemePalettesKt.withArcadeValues(AppThemePalettesKt.lightThemePalette, ColorsLightKt.colorsLight), true);
        gapComposer.end(false);
        return composeColorPalette2;
    }

    public static TextStyle getCurrentTextStyle(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        TextStyle textStyle = (TextStyle) gapComposer.consume(ComposeMooncakeThemeKt.LocalTextStyle);
        if (textStyle == null) {
            gapComposer.startReplaceGroup(406938327);
            textStyle = getTypography(gapComposer).mainBody;
        } else {
            gapComposer.startReplaceGroup(406937180);
        }
        gapComposer.end(false);
        return textStyle;
    }

    public static MooncakeTypography getTypography(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
        return mooncakeTypography == null ? ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography : mooncakeTypography;
    }

    public static final void item(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, String str, int i, Function1 function1) {
        textContextMenuBuilderScope.components.add(new TextContextMenuItem(i, obj, str, function1));
    }

    public static final void textClassificationItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, TextClassification textClassification, int i) {
        textContextMenuBuilderScope.components.add(new TextContextMenuTextClassificationItem(obj, textClassification, i));
    }
}
