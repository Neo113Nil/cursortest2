package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public class WrapRoundImageView extends RoundImageView {
    public WrapRoundImageView(Context context) {
        super(context);
    }

    public int[] setBitmapAndResize(Bitmap bitmap, int i, int i4) {
        if (bitmap == null) {
            return null;
        }
        setImageBitmap(bitmap);
        if (i > 0 && i4 > 0) {
            try {
                int[] a9 = am.a(i, i4, bitmap.getWidth() / bitmap.getHeight());
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = a9[0];
                    layoutParams.height = a9[1];
                    setLayoutParams(layoutParams);
                    return a9;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public WrapRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
