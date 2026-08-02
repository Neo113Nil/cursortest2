package androidx.compose.ui.text;

import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;

/* loaded from: classes.dex */
public abstract class ParagraphStyleKt {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long DefaultLineHeight;

    static {
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        DefaultLineHeight = TextUnit.Unspecified;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0033, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m1057equalsimpl0(r3, r17.lineHeight) != false) goto L12;
     */
    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ParagraphStyle m969fastMergej5T8yCg(ParagraphStyle paragraphStyle, int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        int i7 = i3;
        int i8 = i4;
        TextMotion textMotion2 = textMotion;
        if (i5 == 0 || i5 == paragraphStyle.textAlign) {
            TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
            }
            if ((textIndent2 == null || textIndent2.equals(paragraphStyle.textIndent)) && ((i6 == 0 || i6 == paragraphStyle.textDirection) && ((platformParagraphStyle2 == null || platformParagraphStyle2.equals(paragraphStyle.platformStyle)) && (lineHeightStyle2 == null || lineHeightStyle2.equals(paragraphStyle.lineHeightStyle))))) {
                int i9 = LineBreak.Simple;
                if ((i7 == 0 || i7 == paragraphStyle.lineBreak) && ((i8 == 0 || i8 == paragraphStyle.hyphens) && (textMotion2 == null || textMotion2.equals(paragraphStyle.textMotion)))) {
                    return paragraphStyle;
                }
            }
        } else {
            j2 = 0;
        }
        TextUnitType[] textUnitTypeArr2 = TextUnit.TextUnitTypes;
        if ((j3 & 1095216660480L) == j2) {
            j3 = paragraphStyle.lineHeight;
        }
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.textIndent;
        }
        if (i5 == 0) {
            i5 = paragraphStyle.textAlign;
        }
        if (i6 == 0) {
            i6 = paragraphStyle.textDirection;
        }
        PlatformParagraphStyle platformParagraphStyle3 = paragraphStyle.platformStyle;
        if (platformParagraphStyle3 != null && platformParagraphStyle2 == null) {
            platformParagraphStyle2 = platformParagraphStyle3;
        }
        if (lineHeightStyle2 == null) {
            lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        }
        int i10 = LineBreak.Simple;
        if (i7 == 0) {
            i7 = paragraphStyle.lineBreak;
        }
        if (i8 == 0) {
            i8 = paragraphStyle.hyphens;
        }
        if (textMotion2 == null) {
            textMotion2 = paragraphStyle.textMotion;
        }
        return new ParagraphStyle(i5, i6, j3, textIndent2, platformParagraphStyle2, lineHeightStyle2, i7, i8, textMotion2);
    }
}
