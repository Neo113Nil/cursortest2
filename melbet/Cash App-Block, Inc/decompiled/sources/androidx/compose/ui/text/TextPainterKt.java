package androidx.compose.ui.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.work.impl.WorkLauncherImpl;
import coil3.Extras;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class TextPainterKt {
    public static final WorkLauncherImpl LineBreakSaver;
    public static final WorkLauncherImpl PlatformParagraphStyleSaver;
    public static final Html_androidKt$TagHandler$1 TagHandler = new Html_androidKt$TagHandler$1();
    public static final WorkLauncherImpl TextMotionLinearitySaver;
    public static final WorkLauncherImpl TextMotionSaver;
    public static final WorkLauncherImpl emojiSupportMatchSaver;

    static {
        int i = 8;
        PlatformParagraphStyleSaver = new WorkLauncherImpl(i, new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 0), new Navigation$$ExternalSyntheticLambda1(6));
        emojiSupportMatchSaver = new WorkLauncherImpl(i, new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 3), new Navigation$$ExternalSyntheticLambda1(7));
        LineBreakSaver = new WorkLauncherImpl(i, new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 4), new Navigation$$ExternalSyntheticLambda1(8));
        TextMotionSaver = new WorkLauncherImpl(i, new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 5), new Navigation$$ExternalSyntheticLambda1(9));
        TextMotionLinearitySaver = new WorkLauncherImpl(i, new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 6), new Navigation$$ExternalSyntheticLambda1(10));
    }

    public static final void clip(Extras.Key key, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || textLayoutResult.layoutInput.overflow == 3) {
            return;
        }
        long j = textLayoutResult.size;
        Extras.Key.m1433clipRectN_I0leg$default(key, (int) (j >> 32), (int) (j & BodyPartID.bodyIdMax), 16);
    }

    public static final PlatformTextStyle createPlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m981equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: equals-impl0$1, reason: not valid java name */
    public static final boolean m982equalsimpl0$1(int i, int i2) {
        return i == i2;
    }

    public static final PlatformParagraphStyle lerp(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        boolean z = platformParagraphStyle.includeFontPadding;
        boolean z2 = platformParagraphStyle2.includeFontPadding;
        return z == z2 ? platformParagraphStyle : new PlatformParagraphStyle(((EmojiSupportMatch) SpanStyleKt.lerpDiscrete(new EmojiSupportMatch(platformParagraphStyle.emojiSupportMatch), new EmojiSupportMatch(platformParagraphStyle2.emojiSupportMatch), f)).value, ((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(z), Boolean.valueOf(z2), f)).booleanValue());
    }

    public static final TextMeasurer rememberTextMeasurer(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) gapComposer.consume(CompositionLocalsKt.LocalFontFamilyResolver);
        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
        boolean changed = gapComposer.changed(fontFamilyResolverImpl) | gapComposer.changed(density) | gapComposer.changed(layoutDirection.ordinal()) | gapComposer.changed(8);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new TextMeasurer(fontFamilyResolverImpl, density, layoutDirection, 8);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (TextMeasurer) rememberedValue;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m983toStringimpl(int i) {
        return i == 1 ? "AboveBaseline" : i == 2 ? "Top" : i == 3 ? "Bottom" : i == 4 ? "Center" : i == 5 ? "TextTop" : i == 6 ? "TextBottom" : i == 7 ? "TextCenter" : "Invalid";
    }

    public static final AnnotatedString.Range unbox(AnnotatedString.Range range) {
        Object obj = range.item;
        obj.getClass();
        return new AnnotatedString.Range(((StringAnnotation) obj).value, range.start, range.end, range.tag);
    }
}
