package com.squareup.cash.scrubbing;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.squareup.scannerview.TextSetter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes5.dex */
public final class PersistentMaskVisualTransformation implements VisualTransformation {
    public final MaskVisualTransformation delegate;
    public final String persistentMask;
    public final long persistentMaskColor;

    public PersistentMaskVisualTransformation(MaskVisualTransformation maskVisualTransformation, String str, long j) {
        str.getClass();
        this.delegate = maskVisualTransformation;
        this.persistentMask = str;
        this.persistentMaskColor = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersistentMaskVisualTransformation)) {
            return false;
        }
        PersistentMaskVisualTransformation persistentMaskVisualTransformation = (PersistentMaskVisualTransformation) obj;
        return this.delegate.equals(persistentMaskVisualTransformation.delegate) && Intrinsics.areEqual(this.persistentMask, persistentMaskVisualTransformation.persistentMask) && Color.m676equalsimpl0(this.persistentMaskColor, persistentMaskVisualTransformation.persistentMaskColor);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString) {
        annotatedString.getClass();
        TransformedText filter = this.delegate.filter(annotatedString);
        AnnotatedString.Builder builder = new AnnotatedString.Builder();
        AnnotatedString annotatedString2 = filter.text;
        builder.append(annotatedString2);
        int pushStyle = builder.pushStyle(new SpanStyle(this.persistentMaskColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
        try {
            builder.append(StringsKt___StringsKt.drop(annotatedString2.text.length(), this.persistentMask));
            builder.pop(pushStyle);
            return new TransformedText(builder.toAnnotatedString(), new TextSetter(filter, annotatedString));
        } catch (Throwable th) {
            builder.pop(pushStyle);
            throw th;
        }
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.delegate.hashCode() * 31, 31, this.persistentMask);
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.persistentMaskColor) + m;
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.persistentMaskColor);
        StringBuilder sb = new StringBuilder("PersistentMaskVisualTransformation(delegate=");
        sb.append(this.delegate);
        sb.append(", persistentMask=");
        sb.append(this.persistentMask);
        sb.append(", persistentMaskColor=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl, ")");
    }
}
