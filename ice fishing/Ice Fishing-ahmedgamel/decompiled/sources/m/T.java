package m;

import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class T {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i, int i4, int i6, int i9) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i6, i9);
    }

    public static void c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
