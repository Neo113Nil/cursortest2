package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;

/* loaded from: classes.dex */
public interface TextForegroundStyle {

    public final class Unspecified implements TextForegroundStyle {
        public static final Unspecified INSTANCE = new Unspecified();

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: getColor-0d7_KjU */
        public final long mo1007getColor0d7_KjU() {
            int i = Color.$r8$clinit;
            return Color.Unspecified;
        }
    }

    float getAlpha();

    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo1007getColor0d7_KjU();
}
