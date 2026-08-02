package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class zvk0 {
    public static void a(TextView textView, Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, s3i0.plaque_sdk_RobotoTextView, i, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(s3i0.plaque_sdk_RobotoTextView_plaque_sdk_strikeThrough, false);
            int paintFlags = textView.getPaintFlags();
            textView.setPaintFlags(z ? paintFlags | 16 : paintFlags & (-17));
            Drawable drawable = obtainStyledAttributes.getDrawable(s3i0.plaque_sdk_RobotoTextView_plaque_sdk_foreground);
            if (drawable != null) {
                textView.setForeground(drawable);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
