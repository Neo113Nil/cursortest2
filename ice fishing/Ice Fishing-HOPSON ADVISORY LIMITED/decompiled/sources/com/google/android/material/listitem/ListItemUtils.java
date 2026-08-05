package com.google.android.material.listitem;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;

/* loaded from: classes.dex */
class ListItemUtils {
    private ListItemUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean isRightAligned(View view) {
        int i;
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.gravity != -1) {
                i = layoutParams.gravity;
                return (GravityCompat.getAbsoluteGravity(i, view.getLayoutDirection()) & 7) != 5;
            }
        }
        i = GravityCompat.END;
        if ((GravityCompat.getAbsoluteGravity(i, view.getLayoutDirection()) & 7) != 5) {
        }
    }
}
