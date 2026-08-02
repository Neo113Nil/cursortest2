package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class yvk0 {
    public static void a(TextView textView, int i) {
        Boolean bool = tp11.a;
        Typeface typeface = textView.getTypeface();
        int i2 = 0;
        if (typeface != null) {
            if (typeface.isBold() && typeface.isItalic()) {
                i2 = 3;
            } else if (typeface.isBold()) {
                i2 = 1;
            } else if (typeface.isItalic()) {
                i2 = 2;
            }
        }
        tp11.a(i, i2, textView);
    }

    public static void b(TextView textView, Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.RobotoTextView, i, 0);
        try {
            a(textView, obtainStyledAttributes.getInt(c4i0.RobotoTextView_robotoFontStyle, 0));
            boolean z = obtainStyledAttributes.getBoolean(c4i0.RobotoTextView_strikeThrough, false);
            Rect rect = xw31.a;
            int paintFlags = textView.getPaintFlags();
            textView.setPaintFlags(z ? paintFlags | 16 : paintFlags & (-17));
            Drawable drawable = obtainStyledAttributes.getDrawable(c4i0.RobotoTextView_foreground);
            if (drawable != null) {
                textView.setForeground(drawable);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
