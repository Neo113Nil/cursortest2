package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BrushStyle;
import androidx.compose.ui.text.style.ColorStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class SpanStyleKt {
    public static final TextForegroundStyle DefaultColorForegroundStyle;
    public static final long DefaultFontSize = Room.getSp(14);
    public static final long DefaultLetterSpacing = Room.getSp(0);
    public static final long DefaultBackgroundColor = Color.Transparent;

    static {
        long j = Color.Black;
        DefaultColorForegroundStyle = j != 16 ? new ColorStyle(j) : TextForegroundStyle.Unspecified.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x00b6, code lost:
    
        if (r15.equals(r24.baselineShift) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00c5, code lost:
    
        if (r39.equals(r24.textGeometricTransform) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00d4, code lost:
    
        if (r40.equals(r24.localeList) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpanStyle m974fastMergedSHsh3o(SpanStyle spanStyle, long j, Brush brush, float f, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        BaselineShift baselineShift2;
        PlatformSpanStyle platformSpanStyle2;
        DrawStyle drawStyle2;
        TextForegroundStyle colorStyle;
        TextForegroundStyle textForegroundStyle;
        boolean z;
        long j5;
        long j6;
        PlatformSpanStyle platformSpanStyle3;
        FontSynthesis fontSynthesis2 = fontSynthesis;
        FontFamily fontFamily2 = fontFamily;
        String str2 = str;
        long j7 = j3;
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        long j8 = j2 & 1095216660480L;
        if ((j8 == 0 || TextUnit.m1057equalsimpl0(j2, spanStyle.fontSize)) && ((brush != null || j == 16 || Color.m676equalsimpl0(j, spanStyle.textForegroundStyle.mo1007getColor0d7_KjU())) && ((fontStyle == null || fontStyle.equals(spanStyle.fontStyle)) && ((fontWeight == null || fontWeight.equals(spanStyle.fontWeight)) && ((fontFamily2 == null || fontFamily2 == spanStyle.fontFamily) && (((j7 & 1095216660480L) == 0 || TextUnit.m1057equalsimpl0(j7, spanStyle.letterSpacing)) && ((textDecoration == null || textDecoration.equals(spanStyle.textDecoration)) && Intrinsics.areEqual(brush, spanStyle.textForegroundStyle.getBrush()) && ((brush == null || f == spanStyle.textForegroundStyle.getAlpha()) && ((fontSynthesis2 == null || fontSynthesis2.equals(spanStyle.fontSynthesis)) && (str2 == null || str2.equals(spanStyle.fontFeatureSettings))))))))))) {
            if (baselineShift != null) {
                baselineShift2 = baselineShift;
            } else {
                baselineShift2 = baselineShift;
            }
            if (textGeometricTransform == null) {
            }
            if (localeList == null) {
            }
            if (j4 == 16 || Color.m676equalsimpl0(j4, spanStyle.background)) {
                if (shadow == null || shadow.equals(spanStyle.shadow)) {
                    platformSpanStyle2 = platformSpanStyle;
                    if (platformSpanStyle2 == null || platformSpanStyle2.equals(spanStyle.platformStyle)) {
                        drawStyle2 = drawStyle;
                        if (drawStyle2 == null || drawStyle2.equals(spanStyle.drawStyle)) {
                            return spanStyle;
                        }
                        TextForegroundStyle.Unspecified unspecified = TextForegroundStyle.Unspecified.INSTANCE;
                        if (brush != null) {
                            if (j != 16) {
                                colorStyle = new ColorStyle(j);
                            }
                            colorStyle = unspecified;
                        } else if (brush instanceof SolidColor) {
                            long m1015modulateDxMtmZc = TextDrawStyleKt.m1015modulateDxMtmZc(((SolidColor) brush).value, f);
                            if (m1015modulateDxMtmZc != 16) {
                                colorStyle = new ColorStyle(m1015modulateDxMtmZc);
                            }
                            colorStyle = unspecified;
                        } else {
                            if (!(brush instanceof ShaderBrush)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            colorStyle = new BrushStyle((ShaderBrush) brush, f);
                        }
                        textForegroundStyle = spanStyle.textForegroundStyle;
                        textForegroundStyle.getClass();
                        z = colorStyle instanceof BrushStyle;
                        if (!z && (textForegroundStyle instanceof BrushStyle)) {
                            BrushStyle brushStyle = (BrushStyle) colorStyle;
                            colorStyle = new BrushStyle(brushStyle.getValue(), TextDrawStyleKt.access$takeOrElse(brushStyle.getAlpha(), new Worker$$ExternalSyntheticLambda0(textForegroundStyle, 9)));
                        } else if ((z || (textForegroundStyle instanceof BrushStyle)) && ((!z && (textForegroundStyle instanceof BrushStyle)) || colorStyle.equals(unspecified))) {
                            colorStyle = textForegroundStyle;
                        }
                        if (fontFamily2 == null) {
                            fontFamily2 = spanStyle.fontFamily;
                        }
                        long j9 = j8 != 0 ? spanStyle.fontSize : j2;
                        FontWeight fontWeight2 = fontWeight != null ? spanStyle.fontWeight : fontWeight;
                        FontStyle fontStyle2 = fontStyle != null ? spanStyle.fontStyle : fontStyle;
                        if (fontSynthesis2 == null) {
                            fontSynthesis2 = spanStyle.fontSynthesis;
                        }
                        if (str2 == null) {
                            str2 = spanStyle.fontFeatureSettings;
                        }
                        if ((j7 & 1095216660480L) == 0) {
                            j7 = spanStyle.letterSpacing;
                        }
                        if (baselineShift2 == null) {
                            baselineShift2 = spanStyle.baselineShift;
                        }
                        TextGeometricTransform textGeometricTransform2 = textGeometricTransform != null ? spanStyle.textGeometricTransform : textGeometricTransform;
                        LocaleList localeList2 = localeList != null ? spanStyle.localeList : localeList;
                        if (j4 == 16) {
                            j5 = j9;
                            j6 = j4;
                        } else {
                            j5 = j9;
                            j6 = spanStyle.background;
                        }
                        long j10 = j6;
                        TextDecoration textDecoration2 = textDecoration != null ? spanStyle.textDecoration : textDecoration;
                        Shadow shadow2 = shadow != null ? spanStyle.shadow : shadow;
                        TextDecoration textDecoration3 = textDecoration2;
                        platformSpanStyle3 = spanStyle.platformStyle;
                        if (platformSpanStyle3 == null) {
                            platformSpanStyle3 = platformSpanStyle2;
                        }
                        if (drawStyle2 == null) {
                            drawStyle2 = spanStyle.drawStyle;
                        }
                        return new SpanStyle(colorStyle, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j10, textDecoration3, shadow2, platformSpanStyle3, drawStyle2);
                    }
                    drawStyle2 = drawStyle;
                    TextForegroundStyle.Unspecified unspecified2 = TextForegroundStyle.Unspecified.INSTANCE;
                    if (brush != null) {
                    }
                    textForegroundStyle = spanStyle.textForegroundStyle;
                    textForegroundStyle.getClass();
                    z = colorStyle instanceof BrushStyle;
                    if (!z) {
                    }
                    if (z) {
                    }
                    colorStyle = textForegroundStyle;
                    if (fontFamily2 == null) {
                    }
                    if (j8 != 0) {
                    }
                    if (fontWeight != null) {
                    }
                    if (fontStyle != null) {
                    }
                    if (fontSynthesis2 == null) {
                    }
                    if (str2 == null) {
                    }
                    if ((j7 & 1095216660480L) == 0) {
                    }
                    if (baselineShift2 == null) {
                    }
                    if (textGeometricTransform != null) {
                    }
                    if (localeList != null) {
                    }
                    if (j4 == 16) {
                    }
                    long j102 = j6;
                    if (textDecoration != null) {
                    }
                    if (shadow != null) {
                    }
                    TextDecoration textDecoration32 = textDecoration2;
                    platformSpanStyle3 = spanStyle.platformStyle;
                    if (platformSpanStyle3 == null) {
                    }
                    if (drawStyle2 == null) {
                    }
                    return new SpanStyle(colorStyle, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j102, textDecoration32, shadow2, platformSpanStyle3, drawStyle2);
                }
                platformSpanStyle2 = platformSpanStyle;
                drawStyle2 = drawStyle;
                TextForegroundStyle.Unspecified unspecified22 = TextForegroundStyle.Unspecified.INSTANCE;
                if (brush != null) {
                }
                textForegroundStyle = spanStyle.textForegroundStyle;
                textForegroundStyle.getClass();
                z = colorStyle instanceof BrushStyle;
                if (!z) {
                }
                if (z) {
                }
                colorStyle = textForegroundStyle;
                if (fontFamily2 == null) {
                }
                if (j8 != 0) {
                }
                if (fontWeight != null) {
                }
                if (fontStyle != null) {
                }
                if (fontSynthesis2 == null) {
                }
                if (str2 == null) {
                }
                if ((j7 & 1095216660480L) == 0) {
                }
                if (baselineShift2 == null) {
                }
                if (textGeometricTransform != null) {
                }
                if (localeList != null) {
                }
                if (j4 == 16) {
                }
                long j1022 = j6;
                if (textDecoration != null) {
                }
                if (shadow != null) {
                }
                TextDecoration textDecoration322 = textDecoration2;
                platformSpanStyle3 = spanStyle.platformStyle;
                if (platformSpanStyle3 == null) {
                }
                if (drawStyle2 == null) {
                }
                return new SpanStyle(colorStyle, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j1022, textDecoration322, shadow2, platformSpanStyle3, drawStyle2);
            }
        } else {
            baselineShift2 = baselineShift;
        }
        platformSpanStyle2 = platformSpanStyle;
        drawStyle2 = drawStyle;
        TextForegroundStyle.Unspecified unspecified222 = TextForegroundStyle.Unspecified.INSTANCE;
        if (brush != null) {
        }
        textForegroundStyle = spanStyle.textForegroundStyle;
        textForegroundStyle.getClass();
        z = colorStyle instanceof BrushStyle;
        if (!z) {
        }
        if (z) {
        }
        colorStyle = textForegroundStyle;
        if (fontFamily2 == null) {
        }
        if (j8 != 0) {
        }
        if (fontWeight != null) {
        }
        if (fontStyle != null) {
        }
        if (fontSynthesis2 == null) {
        }
        if (str2 == null) {
        }
        if ((j7 & 1095216660480L) == 0) {
        }
        if (baselineShift2 == null) {
        }
        if (textGeometricTransform != null) {
        }
        if (localeList != null) {
        }
        if (j4 == 16) {
        }
        long j10222 = j6;
        if (textDecoration != null) {
        }
        if (shadow != null) {
        }
        TextDecoration textDecoration3222 = textDecoration2;
        platformSpanStyle3 = spanStyle.platformStyle;
        if (platformSpanStyle3 == null) {
        }
        if (drawStyle2 == null) {
        }
        return new SpanStyle(colorStyle, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift2, textGeometricTransform2, localeList2, j10222, textDecoration3222, shadow2, platformSpanStyle3, drawStyle2);
    }

    public static final Object lerpDiscrete(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m975lerpTextUnitInheritableC3pnCVY(float f, long j, long j2) {
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        long j3 = j & 1095216660480L;
        if (j3 == 0 || (1095216660480L & j2) == 0) {
            return ((TextUnit) lerpDiscrete(new TextUnit(j), new TextUnit(j2), f)).packedValue;
        }
        Room.m1168checkArithmeticNB67dxo(j, j2);
        return Room.pack(j3, TransactorKt.lerp(TextUnit.m1059getValueimpl(j), TextUnit.m1059getValueimpl(j2), f));
    }
}
