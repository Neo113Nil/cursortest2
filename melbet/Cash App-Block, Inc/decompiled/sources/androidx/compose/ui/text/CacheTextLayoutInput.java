package androidx.compose.ui.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CacheTextLayoutInput {
    public final TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        AnnotatedString annotatedString = textLayoutInput.text;
        TextLayoutInput textLayoutInput2 = ((CacheTextLayoutInput) obj).textLayoutInput;
        return Intrinsics.areEqual(annotatedString, textLayoutInput2.text) && textLayoutInput.style.hasSameLayoutAffectingAttributes(textLayoutInput2.style) && Intrinsics.areEqual(textLayoutInput.placeholders, textLayoutInput2.placeholders) && textLayoutInput.maxLines == textLayoutInput2.maxLines && textLayoutInput.softWrap == textLayoutInput2.softWrap && textLayoutInput.overflow == textLayoutInput2.overflow && Intrinsics.areEqual(textLayoutInput.density, textLayoutInput2.density) && textLayoutInput.layoutDirection == textLayoutInput2.layoutDirection && textLayoutInput.fontFamilyResolver == textLayoutInput2.fontFamilyResolver && Constraints.m1019equalsimpl0(textLayoutInput.constraints, textLayoutInput2.constraints);
    }

    public final int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        int hashCode = textLayoutInput.text.hashCode() * 31;
        TextStyle textStyle = textLayoutInput.style;
        SpanStyle spanStyle = textStyle.spanStyle;
        long j = spanStyle.fontSize;
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        int hashCode2 = Long.hashCode(j) * 31;
        FontWeight fontWeight = spanStyle.fontWeight;
        int i = (hashCode2 + (fontWeight != null ? fontWeight.weight : 0)) * 31;
        FontStyle fontStyle = spanStyle.fontStyle;
        int hashCode3 = (i + (fontStyle != null ? Integer.hashCode(fontStyle.value) : 0)) * 31;
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        int hashCode4 = (hashCode3 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.value) : 0)) * 31;
        FontFamily fontFamily = spanStyle.fontFamily;
        int hashCode5 = (hashCode4 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = spanStyle.fontFeatureSettings;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, spanStyle.letterSpacing);
        BaselineShift baselineShift = spanStyle.baselineShift;
        int hashCode6 = (m + (baselineShift != null ? Float.hashCode(baselineShift.multiplier) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        int hashCode7 = (hashCode6 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = spanStyle.localeList;
        int hashCode8 = (hashCode7 + (localeList != null ? localeList.localeList.hashCode() : 0)) * 31;
        long j2 = spanStyle.background;
        int i2 = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(hashCode8, 31, j2);
        PlatformSpanStyle platformSpanStyle = spanStyle.platformStyle;
        int hashCode9 = (textStyle.paragraphStyle.hashCode() + ((m2 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31)) * 31;
        PlatformTextStyle platformTextStyle = textStyle.platformStyle;
        return Long.hashCode(textLayoutInput.constraints) + ((textLayoutInput.fontFamilyResolver.hashCode() + ((textLayoutInput.layoutDirection.hashCode() + ((textLayoutInput.density.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(textLayoutInput.overflow, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (platformTextStyle != null ? platformTextStyle.hashCode() : 0) + hashCode) * 31, 31, textLayoutInput.placeholders) + textLayoutInput.maxLines) * 31, 31, textLayoutInput.softWrap), 31)) * 31)) * 31)) * 31);
    }
}
