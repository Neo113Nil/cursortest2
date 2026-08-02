package androidx.compose.ui.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BrushStyle;
import androidx.compose.ui.text.style.ColorStyle;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class TextStyle {
    public static final TextStyle Default = new TextStyle(0, 0, null, null, 0, 0, 0, 0, 0, null, 16777215);
    public final ParagraphStyle paragraphStyle;
    public final PlatformTextStyle platformStyle;
    public final SpanStyle spanStyle;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextStyle(long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, long j4, int i, int i2, long j5, LineHeightStyle lineHeightStyle, int i3) {
        this(new SpanStyle(r4, r6, r8, (FontStyle) null, (FontSynthesis) null, r11, r12, r13, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, r18, r20, (Shadow) null, (PlatformSpanStyle) null), new ParagraphStyle(r1, r2, r23, null, null, r0, 0, 0, null), null);
        long j6 = (i3 & 1) != 0 ? Color.Unspecified : j;
        long j7 = (i3 & 2) != 0 ? TextUnit.Unspecified : j2;
        FontWeight fontWeight2 = (i3 & 4) != 0 ? null : fontWeight;
        FontFamily fontFamily2 = (i3 & 32) != 0 ? null : fontFamily;
        String str = (i3 & 64) != 0 ? null : "calt 0";
        long j8 = (i3 & 128) != 0 ? TextUnit.Unspecified : j3;
        long j9 = (i3 & 2048) != 0 ? Color.Unspecified : j4;
        TextDecoration textDecoration = (i3 & 4096) != 0 ? null : TextDecoration.Underline;
        int i4 = (32768 & i3) != 0 ? 0 : i;
        int i5 = (65536 & i3) == 0 ? i2 : 0;
        long j10 = (131072 & i3) != 0 ? TextUnit.Unspecified : j5;
        LineHeightStyle lineHeightStyle2 = (i3 & PKIFailureInfo.badCertTemplate) != 0 ? null : lineHeightStyle;
        int i6 = LineBreak.Simple;
    }

    /* renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static TextStyle m993copyNs73l9s$default(TextStyle textStyle, Brush brush, LineHeightStyle lineHeightStyle, int i) {
        int i2;
        SpanStyle spanStyle = textStyle.spanStyle;
        float alpha = spanStyle.textForegroundStyle.getAlpha();
        long j = spanStyle.fontSize;
        FontWeight fontWeight = spanStyle.fontWeight;
        FontStyle fontStyle = spanStyle.fontStyle;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        FontFamily fontFamily = spanStyle.fontFamily;
        String str = spanStyle.fontFeatureSettings;
        long j2 = spanStyle.letterSpacing;
        BaselineShift baselineShift = spanStyle.baselineShift;
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        LocaleList localeList = spanStyle.localeList;
        long j3 = spanStyle.background;
        TextDecoration textDecoration = spanStyle.textDecoration;
        Shadow shadow = spanStyle.shadow;
        DrawStyle drawStyle = spanStyle.drawStyle;
        ParagraphStyle paragraphStyle = textStyle.paragraphStyle;
        int i3 = paragraphStyle.textAlign;
        int i4 = paragraphStyle.textDirection;
        long j4 = paragraphStyle.lineHeight;
        TextIndent textIndent = paragraphStyle.textIndent;
        PlatformTextStyle platformTextStyle = textStyle.platformStyle;
        LineHeightStyle lineHeightStyle2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? paragraphStyle.lineHeightStyle : lineHeightStyle;
        int i5 = paragraphStyle.lineBreak;
        int i6 = paragraphStyle.hyphens;
        TextMotion textMotion = paragraphStyle.textMotion;
        PlatformSpanStyle platformSpanStyle = platformTextStyle != null ? platformTextStyle.spanStyle : null;
        TextForegroundStyle textForegroundStyle = TextForegroundStyle.Unspecified.INSTANCE;
        if (brush == null) {
            i2 = i5;
        } else if (brush instanceof SolidColor) {
            i2 = i5;
            long m1015modulateDxMtmZc = TextDrawStyleKt.m1015modulateDxMtmZc(((SolidColor) brush).value, alpha);
            textForegroundStyle = m1015modulateDxMtmZc != 16 ? new ColorStyle(m1015modulateDxMtmZc) : textForegroundStyle;
        } else {
            i2 = i5;
            if (!(brush instanceof ShaderBrush)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            textForegroundStyle = new BrushStyle((ShaderBrush) brush, alpha);
        }
        SpanStyle spanStyle2 = new SpanStyle(textForegroundStyle, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle);
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.paragraphStyle;
        }
        return new TextStyle(spanStyle2, new ParagraphStyle(i3, i4, j4, textIndent, platformParagraphStyle, lineHeightStyle2, i2, i6, textMotion), platformTextStyle);
    }

    /* renamed from: copy-p1EtxEg$default, reason: not valid java name */
    public static TextStyle m994copyp1EtxEg$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, BaselineShift baselineShift, long j4, TextDecoration textDecoration, Shadow shadow, Stroke stroke, int i, long j5, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i2, int i3) {
        int i4;
        Shadow shadow2;
        long j6;
        TextIndent textIndent;
        long mo1007getColor0d7_KjU = (i3 & 1) != 0 ? textStyle.spanStyle.textForegroundStyle.mo1007getColor0d7_KjU() : j;
        long j7 = (i3 & 2) != 0 ? textStyle.spanStyle.fontSize : j2;
        FontWeight fontWeight2 = (i3 & 4) != 0 ? textStyle.spanStyle.fontWeight : fontWeight;
        SpanStyle spanStyle = textStyle.spanStyle;
        FontStyle fontStyle = spanStyle.fontStyle;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        FontFamily fontFamily2 = (i3 & 32) != 0 ? spanStyle.fontFamily : fontFamily;
        String str = spanStyle.fontFeatureSettings;
        long j8 = (i3 & 128) != 0 ? spanStyle.letterSpacing : j3;
        BaselineShift baselineShift2 = (i3 & 256) != 0 ? spanStyle.baselineShift : baselineShift;
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        long j9 = j7;
        LocaleList localeList = spanStyle.localeList;
        long j10 = (i3 & 2048) != 0 ? spanStyle.background : j4;
        TextDecoration textDecoration2 = (i3 & 4096) != 0 ? spanStyle.textDecoration : textDecoration;
        Shadow shadow3 = (i3 & PKIFailureInfo.certRevoked) != 0 ? spanStyle.shadow : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle = (i3 & 16384) != 0 ? spanStyle.drawStyle : stroke;
        int i5 = (i3 & 32768) != 0 ? textStyle.paragraphStyle.textAlign : i;
        ParagraphStyle paragraphStyle = textStyle.paragraphStyle;
        DrawStyle drawStyle2 = drawStyle;
        int i6 = paragraphStyle.textDirection;
        if ((i3 & PKIFailureInfo.unsupportedVersion) != 0) {
            i4 = i6;
            shadow2 = shadow3;
            j6 = paragraphStyle.lineHeight;
        } else {
            i4 = i6;
            shadow2 = shadow3;
            j6 = j5;
        }
        TextIndent textIndent2 = paragraphStyle.textIndent;
        PlatformTextStyle platformTextStyle2 = (i3 & PKIFailureInfo.signerNotTrusted) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i3 & PKIFailureInfo.badCertTemplate) != 0 ? paragraphStyle.lineHeightStyle : lineHeightStyle;
        if ((i3 & PKIFailureInfo.badSenderNonce) != 0) {
            textIndent = textIndent2;
            i2 = paragraphStyle.lineBreak;
        } else {
            textIndent = textIndent2;
        }
        return new TextStyle(new SpanStyle(Color.m676equalsimpl0(mo1007getColor0d7_KjU, spanStyle.textForegroundStyle.mo1007getColor0d7_KjU()) ? spanStyle.textForegroundStyle : mo1007getColor0d7_KjU != 16 ? new ColorStyle(mo1007getColor0d7_KjU) : TextForegroundStyle.Unspecified.INSTANCE, j9, fontWeight2, fontStyle, fontSynthesis, fontFamily2, str, j8, baselineShift2, textGeometricTransform, localeList, j10, textDecoration3, shadow2, platformTextStyle2 != null ? platformTextStyle2.spanStyle : null, drawStyle2), new ParagraphStyle(i5, i4, j6, textIndent, platformTextStyle2 != null ? platformTextStyle2.paragraphStyle : null, lineHeightStyle2, i2, paragraphStyle.hyphens, (i3 & 8388608) != 0 ? paragraphStyle.textMotion : TextMotion.Animated), platformTextStyle2);
    }

    /* renamed from: merge-dA7vx0o$default, reason: not valid java name */
    public static TextStyle m995mergedA7vx0o$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? Color.Unspecified : j;
        long j6 = (i2 & 2) != 0 ? TextUnit.Unspecified : j2;
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        long j7 = (i2 & 128) != 0 ? TextUnit.Unspecified : j3;
        long j8 = Color.Unspecified;
        TextDecoration textDecoration2 = (i2 & 4096) != 0 ? null : textDecoration;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (i2 & PKIFailureInfo.unsupportedVersion) != 0 ? TextUnit.Unspecified : j4;
        int i4 = LineBreak.Simple;
        SpanStyle m974fastMergedSHsh3o = SpanStyleKt.m974fastMergedSHsh3o(textStyle.spanStyle, j5, null, Float.NaN, j6, fontWeight2, null, null, fontFamily2, null, j7, null, null, null, j8, textDecoration2, null, null, null);
        ParagraphStyle m969fastMergej5T8yCg = ParagraphStyleKt.m969fastMergej5T8yCg(textStyle.paragraphStyle, i3, 0, j9, null, null, null, 0, 0, null);
        return (textStyle.spanStyle == m974fastMergedSHsh3o && textStyle.paragraphStyle == m969fastMergej5T8yCg) ? textStyle : new TextStyle(m974fastMergedSHsh3o, m969fastMergej5T8yCg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return Intrinsics.areEqual(this.spanStyle, textStyle.spanStyle) && Intrinsics.areEqual(this.paragraphStyle, textStyle.paragraphStyle) && Intrinsics.areEqual(this.platformStyle, textStyle.platformStyle);
    }

    public final Brush getBrush() {
        return this.spanStyle.textForegroundStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m996getColor0d7_KjU() {
        return this.spanStyle.textForegroundStyle.mo1007getColor0d7_KjU();
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        if (this != textStyle) {
            return Intrinsics.areEqual(this.paragraphStyle, textStyle.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text(textStyle.spanStyle);
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.paragraphStyle.hashCode() + (this.spanStyle.hashCode() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return hashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || textStyle.equals(Default)) ? this : new TextStyle(this.spanStyle.merge(textStyle.spanStyle), this.paragraphStyle.merge(textStyle.paragraphStyle));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) Color.m682toStringimpl(m996getColor0d7_KjU()));
        sb.append(", brush=");
        sb.append(getBrush());
        sb.append(", alpha=");
        SpanStyle spanStyle = this.spanStyle;
        sb.append(spanStyle.textForegroundStyle.getAlpha());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.m1061toStringimpl(spanStyle.fontSize));
        sb.append(", fontWeight=");
        sb.append(spanStyle.fontWeight);
        sb.append(", fontStyle=");
        sb.append(spanStyle.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(spanStyle.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(spanStyle.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(spanStyle.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.m1061toStringimpl(spanStyle.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(spanStyle.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(spanStyle.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(spanStyle.localeList);
        sb.append(", background=");
        Recorder$$ExternalSyntheticOutline1.m(spanStyle.background, ", textDecoration=", sb);
        sb.append(spanStyle.textDecoration);
        sb.append(", shadow=");
        sb.append(spanStyle.shadow);
        sb.append(", drawStyle=");
        sb.append(spanStyle.drawStyle);
        sb.append(", textAlign=");
        ParagraphStyle paragraphStyle = this.paragraphStyle;
        sb.append((Object) TextAlign.m1013toStringimpl(paragraphStyle.textAlign));
        sb.append(", textDirection=");
        sb.append((Object) TextDirection.m1014toStringimpl(paragraphStyle.textDirection));
        sb.append(", lineHeight=");
        sb.append((Object) TextUnit.m1061toStringimpl(paragraphStyle.lineHeight));
        sb.append(", textIndent=");
        sb.append(paragraphStyle.textIndent);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", lineHeightStyle=");
        sb.append(paragraphStyle.lineHeightStyle);
        sb.append(", lineBreak=");
        sb.append((Object) LineBreak.m1010toStringimpl(paragraphStyle.lineBreak));
        sb.append(", hyphens=");
        sb.append((Object) Hyphens.m1008toStringimpl(paragraphStyle.hyphens));
        sb.append(", textMotion=");
        sb.append(paragraphStyle.textMotion);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, (r0 == null && r1 == null) ? null : TextPainterKt.createPlatformTextStyle(r0, r1));
        PlatformSpanStyle platformSpanStyle = spanStyle.platformStyle;
        PlatformParagraphStyle platformParagraphStyle = paragraphStyle.platformStyle;
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }
}
