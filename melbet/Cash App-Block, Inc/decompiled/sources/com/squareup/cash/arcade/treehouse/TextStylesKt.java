package com.squareup.cash.arcade.treehouse;

import app.cash.arcade.values.TextStyle;
import app.cash.mooncake.values.MooncakeTextStyles;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import designsystem.arcade.ArcadeTextStyles;

/* loaded from: classes5.dex */
public abstract class TextStylesKt {
    public static final Typography typography = new Typography();

    public static final TextThemeInfo toTextThemeInfo(TextStyle textStyle) {
        androidx.compose.ui.text.TextStyle fromID;
        TextThemeInfo textThemeInfo;
        textStyle.getClass();
        if (textStyle.equals(MooncakeTextStyles.bigMoney)) {
            textThemeInfo = TextStyles.bigMoney;
        } else if (textStyle.equals(MooncakeTextStyles.header1)) {
            textThemeInfo = TextStyles.header1;
        } else if (textStyle.equals(MooncakeTextStyles.header2)) {
            textThemeInfo = TextStyles.header2;
        } else if (textStyle.equals(MooncakeTextStyles.header3)) {
            textThemeInfo = TextStyles.header3;
        } else if (textStyle.equals(MooncakeTextStyles.header4)) {
            textThemeInfo = TextStyles.header4;
        } else if (textStyle.equals(MooncakeTextStyles.mainTitle)) {
            textThemeInfo = TextStyles.mainTitle;
        } else if (textStyle.equals(MooncakeTextStyles.mainBody)) {
            textThemeInfo = TextStyles.mainBody;
        } else if (textStyle.equals(MooncakeTextStyles.smallTitle)) {
            textThemeInfo = TextStyles.smallTitle;
        } else if (textStyle.equals(MooncakeTextStyles.smallBody)) {
            textThemeInfo = TextStyles.smallBody;
        } else if (textStyle.equals(MooncakeTextStyles.strongCaption)) {
            textThemeInfo = TextStyles.strongCaption;
        } else if (textStyle.equals(MooncakeTextStyles.caption)) {
            textThemeInfo = TextStyles.caption;
        } else if (textStyle.equals(MooncakeTextStyles.identifier)) {
            textThemeInfo = TextStyles.identifier;
        } else {
            boolean equals = textStyle.equals(ArcadeTextStyles.Body);
            Typography typography2 = typography;
            textThemeInfo = equals ? MooncakeTypographyKt.toTextThemeInfo(typography2.bodyMedium) : textStyle.equals(ArcadeTextStyles.BodyLink) ? MooncakeTypographyKt.toTextThemeInfo(typography2.linkMedium) : textStyle.equals(ArcadeTextStyles.CellBody) ? MooncakeTypographyKt.toTextThemeInfo(typography2.bodySmall) : textStyle.equals(ArcadeTextStyles.Disclaimer) ? MooncakeTypographyKt.toTextThemeInfo(typography2.bodyXSmall) : textStyle.equals(ArcadeTextStyles.DisclaimerLink) ? MooncakeTypographyKt.toTextThemeInfo(typography2.linkXSmall) : textStyle.equals(ArcadeTextStyles.HeroNumerics) ? MooncakeTypographyKt.toTextThemeInfo(typography2.numeralLarge) : textStyle.equals(ArcadeTextStyles.Label) ? MooncakeTypographyKt.toTextThemeInfo(typography2.labelMedium) : textStyle.equals(ArcadeTextStyles.LargeLabel) ? MooncakeTypographyKt.toTextThemeInfo(typography2.numeralSmall) : textStyle.equals(ArcadeTextStyles.MetaText) ? MooncakeTypographyKt.toTextThemeInfo(typography2.bodyXSmall) : (!(textStyle instanceof TextStyle.Token) || (fromID = typography2.fromID(((TextStyle.Token) textStyle).id)) == null) ? null : MooncakeTypographyKt.toTextThemeInfo(fromID);
        }
        return textThemeInfo == null ? TextStyles.smallBody : textThemeInfo;
    }
}
