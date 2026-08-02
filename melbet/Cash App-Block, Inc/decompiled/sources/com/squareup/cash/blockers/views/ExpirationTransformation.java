package com.squareup.cash.blockers.views;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.squareup.cash.scrubbing.MaskVisualTransformation;
import com.squareup.cropview.Edge;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes7.dex */
public final class ExpirationTransformation implements VisualTransformation {
    public static final ExpirationTransformation INSTANCE = new ExpirationTransformation();
    public static final MaskVisualTransformation paddedTransformation = new MaskVisualTransformation("0X/XX", new Edge.Companion(9));
    public static final MaskVisualTransformation unpaddedTransformation = new MaskVisualTransformation("XX/XX", new Edge.Companion(9));

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString) {
        annotatedString.getClass();
        CharRange charRange = new CharRange('2', '9');
        Character firstOrNull = StringsKt___StringsKt.firstOrNull(annotatedString.text);
        return (firstOrNull == null || !charRange.contains(firstOrNull.charValue())) ? unpaddedTransformation.filter(annotatedString) : paddedTransformation.filter(annotatedString);
    }
}
