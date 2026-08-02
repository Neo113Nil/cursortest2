package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ViewTarget$SizeDeterminer {
    public static Integer maxDisplayLength;
    public final ArrayList cbs = new ArrayList();
    public CoordinatorLayout.OnPreDrawListener layoutListener;
    public final View view;

    public ViewTarget$SizeDeterminer(ImageView imageView) {
        this.view = imageView;
    }

    public final int getTargetDimen(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = this.view;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (maxDisplayLength == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Util.checkNotNull(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            maxDisplayLength = Integer.valueOf(Math.max(point.x, point.y));
        }
        return maxDisplayLength.intValue();
    }
}
