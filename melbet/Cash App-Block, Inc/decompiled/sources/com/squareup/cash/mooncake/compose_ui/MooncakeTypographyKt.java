package com.squareup.cash.mooncake.compose_ui;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.mooncake.themes.Dimen$Sp;
import com.squareup.cash.mooncake.themes.LetterSpacing;
import com.squareup.cash.mooncake.themes.LetterSpacing$Companion$Em;
import com.squareup.cash.mooncake.themes.LetterSpacing$Companion$Sp;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes.dex */
public abstract class MooncakeTypographyKt {
    public static final MooncakeTypography ArcadeCompatMooncakeTypography;
    public static final MooncakeTypography DefaultTypography;
    public static final StaticProvidableCompositionLocal LocalTypography = new StaticProvidableCompositionLocal(new Moneys$$ExternalSyntheticLambda0(16));

    static {
        TextThemeInfo textThemeInfo = TextStyles.badge;
        DefaultTypography = new MooncakeTypography(m3638toComposeTextStylePOD2ecY$default(textThemeInfo), m3638toComposeTextStylePOD2ecY$default(TextStyles.bigMoney), m3638toComposeTextStylePOD2ecY$default(TextStyles.caption), m3638toComposeTextStylePOD2ecY$default(TextStyles.header1), m3638toComposeTextStylePOD2ecY$default(TextStyles.header2), m3638toComposeTextStylePOD2ecY$default(TextStyles.header3), m3638toComposeTextStylePOD2ecY$default(TextStyles.header4), m3638toComposeTextStylePOD2ecY$default(TextStyles.identifier), m3638toComposeTextStylePOD2ecY$default(TextStyles.input), m3638toComposeTextStylePOD2ecY$default(TextStyles.mainTitle), m3638toComposeTextStylePOD2ecY$default(TextStyles.mainBody), m3638toComposeTextStylePOD2ecY$default(TextStyles.smallTitle), m3638toComposeTextStylePOD2ecY$default(TextStyles.smallBody), m3638toComposeTextStylePOD2ecY$default(TextStyles.strongCaption));
        new Typography.Base();
        new TextStyle(0L, Room.getSp(11), new FontWeight(400), Fonts.getCashSans(), Room.getSp(0.5d), 0L, 0, 0, Room.getSp(16), null, 16645977);
        new TextStyle(0L, Room.getSp(14), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        new TextStyle(0L, Room.getSp(16), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-0.08d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        new TextStyle(0L, Room.getSp(16), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16641817);
        TextStyle textStyle = new TextStyle(0L, Room.getSp(16), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-0.08d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        new TextStyle(0L, Room.getSp(14), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        FontListFontFamily fontListFontFamily = Fonts.CashSansMono;
        new TextStyle(0L, Room.getSp(10), new FontWeight(400), fontListFontFamily, Room.getSp(0.3d), 0L, 0, 0, Room.getSp(16), null, 16645977);
        new TextStyle(0L, Room.getSp(16), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16645977);
        new TextStyle(0L, Room.getSp(14), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0.035d), 0L, 0, 0, Room.getSp(16), null, 16645977);
        new TextStyle(0L, Room.getSp(14), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0.035d), 0L, 0, 0, Room.getSp(16), null, 16641817);
        new TextStyle(0L, Room.getSp(16), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16641817);
        new TextStyle(0L, Room.getSp(14), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        new TextStyle(0L, Room.getSp(16), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(16), null, 16645977);
        new TextStyle(0L, Room.getSp(14), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        new TextStyle(0L, Room.getSp(14), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0.035d), 0L, 0, 0, Room.getSp(20), null, 16641817);
        TextStyle textStyle2 = new TextStyle(0L, Room.getSp(28), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(32), null, 16645977);
        new TextStyle(0L, Room.getSp(44), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-1.43d), 0L, 0, 0, Room.getSp(44), null, 16645977);
        new TextStyle(0L, Room.getSp(32), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-0.8d), 0L, 0, 0, Room.getSp(32), null, 16645977);
        new TextStyle(0L, Room.getSp(14), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        TextStyle textStyle3 = new TextStyle(0L, Room.getSp(56), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-2.24d), 0L, 0, 0, Room.getSp(56), null, 16645977);
        new TextStyle(0L, Room.getSp(48), new FontWeight(600), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(52), null, 16645977);
        TextStyle textStyle4 = new TextStyle(0L, Room.getSp(16), new FontWeight(400), Fonts.getCashSans(), Room.getSp(-0.08d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        new TextStyle(0L, Room.getSp(24), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(28), null, 16645977);
        new TextStyle(0L, Room.getSp(96), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(96), null, 16645977);
        new TextStyle(0L, Room.getSp(16), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16645977);
        TextStyle textStyle5 = new TextStyle(0L, Room.getSp(16), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16645977);
        new TextStyle(0L, Room.getSp(14), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        new TextStyle(0L, Room.getSp(10), new FontWeight(500), fontListFontFamily, Room.getSp(0.6d), 0L, 0, 0, Room.getSp(16), null, 16645977);
        new TextStyle(0L, Room.getSp(32), new FontWeight(600), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(36), null, 16645977);
        new TextStyle(0L, Room.getSp(16), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16641817);
        new TextStyle(0L, Room.getSp(14), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0.035d), 0L, 0, 0, Room.getSp(20), null, 16641817);
        new TextStyle(0L, Room.getSp(10), new FontWeight(500), fontListFontFamily, Room.getSp(0.4d), 0L, 0, 0, Room.getSp(16), null, 16641817);
        new TextStyle(0L, Room.getSp(14), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0.035d), 0L, 0, 0, Room.getSp(20), null, 16645977);
        new TextStyle(0L, Room.getSp(24), new FontWeight(500), Fonts.getCashSans(), Room.getSp(-0.18d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        new TextStyle(0L, Room.getSp(16), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(16), null, 16645977);
        new TextStyle(0L, Room.getSp(12), new FontWeight(400), Fonts.getCashSans(), Room.getSp(1), 0L, 0, 0, Room.getSp(16), null, 16645977);
        TextStyle textStyle6 = new TextStyle(0L, Room.getSp(56), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(56), null, 16645977);
        new TextStyle(0L, Room.getSp(32), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(32), null, 16645977);
        new TextStyle(0L, Room.getSp(32), new FontWeight(500), Fonts.getCashSans(), Room.getSp(-0.48d), 0L, 0, 0, Room.getSp(32), null, 16645977);
        TextStyle textStyle7 = new TextStyle(0L, Room.getSp(24), new FontWeight(500), Fonts.getCashSans(), Room.getSp(-0.18d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        new TextStyle(0L, Room.getSp(24), new FontWeight(500), Fonts.getCashSans(), Room.getSp(-0.18d), 0L, 0, 0, Room.getSp(24), null, 16645977);
        new TextStyle(0L, Room.getSp(16), new FontWeight(500), Fonts.getCashSans(), Room.getSp(0), 0L, 0, 0, Room.getSp(24), null, 16645977);
        ArcadeCompatMooncakeTypography = new MooncakeTypography(m3638toComposeTextStylePOD2ecY$default(textThemeInfo), textStyle6, textStyle, textStyle3, textStyle2, textStyle2, textStyle2, textStyle7, textStyle4, textStyle7, textStyle, textStyle5, textStyle, textStyle5);
    }

    /* renamed from: toComposeTextStyle-POD2ecY$default, reason: not valid java name */
    public static TextStyle m3638toComposeTextStylePOD2ecY$default(TextThemeInfo textThemeInfo) {
        long pack;
        long j = Color.Unspecified;
        textThemeInfo.getClass();
        FontListFontFamily fontListFontFamily = Fonts.CashSans;
        long sp = Room.getSp(textThemeInfo.textSize.value);
        int i = textThemeInfo.font;
        FontWeight fontWeight = (i == R.font.cashsans_medium || i == R.font.cashsansmono_medium) ? FontWeight.Medium : i == R.font.cashsans_bold ? FontWeight.Bold : FontWeight.Normal;
        long sp2 = Room.getSp(textThemeInfo.lineHeight.value);
        LetterSpacing letterSpacing = textThemeInfo.letterSpacing;
        if (letterSpacing instanceof LetterSpacing$Companion$Sp) {
            pack = Room.pack(4294967296L, ((LetterSpacing$Companion$Sp) letterSpacing).value);
        } else {
            if (!(letterSpacing instanceof LetterSpacing$Companion$Em)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            pack = Room.pack(8589934592L, ((LetterSpacing$Companion$Em) letterSpacing).value);
        }
        return new TextStyle(j, sp, fontWeight, fontListFontFamily, pack, 0L, 0, 0, sp2, null, 16613208);
    }

    public static final TextThemeInfo toTextThemeInfo(TextStyle textStyle) {
        int i;
        textStyle.getClass();
        SpanStyle spanStyle = textStyle.spanStyle;
        ParagraphStyle paragraphStyle = textStyle.paragraphStyle;
        if (!TextUnit.m1060isSpimpl(spanStyle.fontSize)) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        if (!TextUnit.m1060isSpimpl(paragraphStyle.lineHeight)) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        long j = spanStyle.fontSize;
        long j2 = spanStyle.letterSpacing;
        Dimen$Sp dimen$Sp = new Dimen$Sp(MathKt__MathJVMKt.roundToInt(TextUnit.m1059getValueimpl(j)));
        FontWeight fontWeight = spanStyle.fontWeight;
        if (fontWeight == null) {
            fontWeight = FontWeight.Normal;
        }
        if (Intrinsics.areEqual(spanStyle.fontFamily, Fonts.CashSansMono)) {
            FontWeight fontWeight2 = FontWeight.Medium;
            FontWeight fontWeight3 = FontWeight.SemiBold;
            fontWeight.getClass();
            i = (fontWeight.compareTo(fontWeight3) > 0 || fontWeight.compareTo(fontWeight2) < 0) ? R.font.cashsansmono_regular : R.font.cashsansmono_medium;
        } else {
            FontWeight fontWeight4 = FontWeight.Medium;
            FontWeight fontWeight5 = FontWeight.SemiBold;
            fontWeight.getClass();
            if (fontWeight.compareTo(fontWeight5) > 0 || fontWeight.compareTo(fontWeight4) < 0) {
                i = (fontWeight.compareTo(FontWeight.Black) > 0 || fontWeight.compareTo(FontWeight.Bold) < 0) ? R.font.cashsans_regular : R.font.cashsans_bold;
            } else {
                i = R.font.cashsans_medium;
            }
        }
        return new TextThemeInfo(null, dimen$Sp, i, new Dimen$Sp(MathKt__MathJVMKt.roundToInt(TextUnit.m1059getValueimpl(paragraphStyle.lineHeight))), TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j2), 4294967296L) ? new LetterSpacing$Companion$Sp(TextUnit.m1059getValueimpl(j2)) : new LetterSpacing$Companion$Em(TextUnit.m1059getValueimpl(j2)));
    }
}
