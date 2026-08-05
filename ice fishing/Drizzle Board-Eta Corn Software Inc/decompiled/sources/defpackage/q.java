package defpackage;

import android.widget.TextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class q {
    public static void MdtA4re8(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static void NCTxEWno(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static int qoPGr6Ce(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static boolean wxUZMvaN(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
