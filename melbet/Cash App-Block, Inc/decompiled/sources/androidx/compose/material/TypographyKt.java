package androidx.compose.material;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.LineHeightStyle;

/* loaded from: classes3.dex */
public abstract class TypographyKt {
    public static final TextStyle DefaultTextStyle = TextStyle.m994copyp1EtxEg$default(TextStyle.Default, 0, 0, null, null, 0, null, 0, null, null, null, 0, 0, DefaultPlatformTextStyle_androidKt.DefaultPlatformTextStyle, new LineHeightStyle(LineHeightStyle.Alignment.Center, 0, 0), 0, 15204351);
    public static final StaticProvidableCompositionLocal LocalTypography = new StaticProvidableCompositionLocal(new TextKt$$ExternalSyntheticLambda0(7));

    public static final TextStyle access$withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        return textStyle.spanStyle.fontFamily != null ? textStyle : TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, fontFamily, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183);
    }
}
