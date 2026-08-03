package androidx.compose.ui.text.font;

import android.os.Build;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FontSynthesis.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"synthesizeTypeface", "", "Landroidx/compose/ui/text/font/FontSynthesis;", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "requestedWeight", "Landroidx/compose/ui/text/font/FontWeight;", "requestedStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class FontSynthesis_androidKt {
    /* renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    public static final Object m9301synthesizeTypefaceFxwP2eA(int i, Object obj, Font font, FontWeight fontWeight, int i2) {
        int weight;
        boolean m9279equalsimpl0;
        if (obj instanceof android.graphics.Typeface) {
            boolean z = FontSynthesis.m9293isWeightOnimpl$ui_text(i) && !Intrinsics.areEqual(font.getWeight(), fontWeight) && fontWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.INSTANCE)) >= 0 && font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.INSTANCE)) < 0;
            boolean z2 = FontSynthesis.m9292isStyleOnimpl$ui_text(i) && !FontStyle.m9279equalsimpl0(i2, font.getStyle());
            if (z2 || z) {
                if (Build.VERSION.SDK_INT < 28) {
                    return android.graphics.Typeface.create((android.graphics.Typeface) obj, AndroidFontUtils_androidKt.getAndroidTypefaceStyle(z, z2 && FontStyle.m9279equalsimpl0(i2, FontStyle.INSTANCE.m9285getItalic_LCdwA())));
                }
                if (z) {
                    weight = fontWeight.getWeight();
                } else {
                    weight = font.getWeight().getWeight();
                }
                if (z2) {
                    m9279equalsimpl0 = FontStyle.m9279equalsimpl0(i2, FontStyle.INSTANCE.m9285getItalic_LCdwA());
                } else {
                    m9279equalsimpl0 = FontStyle.m9279equalsimpl0(font.getStyle(), FontStyle.INSTANCE.m9285getItalic_LCdwA());
                }
                return TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) obj, weight, m9279equalsimpl0);
            }
        }
        return obj;
    }
}
