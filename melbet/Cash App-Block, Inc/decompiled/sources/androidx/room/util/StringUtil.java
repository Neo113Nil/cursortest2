package androidx.room.util;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.ui.R$styleable;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class StringUtil {
    public static final void appendPlaceholders(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static void applyFromAttributes(TextView textView, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.LineSpacingHelper);
        obtainStyledAttributes.getClass();
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        boolean hasValue2 = obtainStyledAttributes.hasValue(2);
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes2 = textView.getContext().obtainStyledAttributes(resourceId, R$styleable.LineSpacingAppearance);
            obtainStyledAttributes2.getClass();
            textView.setLineSpacing(hasValue ? textView.getLineSpacingExtra() : obtainStyledAttributes2.getDimensionPixelSize(0, (int) textView.getLineSpacingExtra()), hasValue2 ? textView.getLineSpacingMultiplier() : obtainStyledAttributes2.getFloat(1, textView.getLineSpacingMultiplier()));
            obtainStyledAttributes2.recycle();
        }
        obtainStyledAttributes.recycle();
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoinSell.deepLinkSpecs;
    }
}
