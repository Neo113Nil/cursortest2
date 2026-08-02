package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.LetterSpacing$Companion$Em;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;

/* loaded from: classes6.dex */
public final class MooncakeSmallText extends MooncakeBaseText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeSmallText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // com.squareup.cash.mooncake.components.MooncakeBaseText
    public final TextThemeInfo providerThemeInfo() {
        Context context = getContext();
        context.getClass();
        ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(context);
        TextThemeInfo textThemeInfo = TextStyles.caption;
        Theme theme = findThemeInfo.theme;
        Theme theme2 = Theme.MooncakeLight;
        ColorPalette colorPalette = findThemeInfo.colorPalette;
        return TextThemeInfo.copy$default(textThemeInfo, Integer.valueOf(theme == theme2 ? colorPalette.tertiaryLabel : colorPalette.label), null, new LetterSpacing$Companion$Em(RecyclerView.DECELERATION_RATE), 14);
    }
}
