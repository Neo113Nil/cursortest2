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
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MooncakeMediumText extends MooncakeBaseText implements WeightedLeftInBlockers {
    public /* synthetic */ MooncakeMediumText(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // com.squareup.cash.mooncake.components.MooncakeBaseText
    public final TextThemeInfo providerThemeInfo() {
        Context context = getContext();
        context.getClass();
        ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(context);
        TextThemeInfo textThemeInfo = TextStyles.mainBody;
        Theme theme = findThemeInfo.theme;
        Theme theme2 = Theme.MooncakeLight;
        ColorPalette colorPalette = findThemeInfo.colorPalette;
        return TextThemeInfo.copy$default(textThemeInfo, Integer.valueOf(theme == theme2 ? colorPalette.secondaryLabel : colorPalette.label), null, new LetterSpacing$Companion$Em(RecyclerView.DECELERATION_RATE), 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeMediumText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
