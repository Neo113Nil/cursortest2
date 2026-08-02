package androidx.compose.foundation.text;

import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import defpackage.Size$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public abstract class AutofillHighlightKt {
    public static final DynamicProvidableCompositionLocal LocalAutofillHighlightBrush = new DynamicProvidableCompositionLocal(new Size$$ExternalSyntheticLambda0(23));
    public static final DynamicProvidableCompositionLocal LocalAutofillHighlightColor = new DynamicProvidableCompositionLocal(AutofillHighlightKt$LocalAutofillHighlightColor$1.INSTANCE);

    public static final DynamicProvidableCompositionLocal getLocalAutofillHighlightBrush() {
        return LocalAutofillHighlightBrush;
    }

    public static final DynamicProvidableCompositionLocal getLocalAutofillHighlightColor() {
        return LocalAutofillHighlightColor;
    }

    /* renamed from: resolveAutofillHighlight-WkMS-hQ, reason: not valid java name */
    public static final Brush m344resolveAutofillHighlightWkMShQ(Brush brush, long j, long j2) {
        return !Color.m676equalsimpl0(j, j2) ? new SolidColor(j) : brush;
    }
}
