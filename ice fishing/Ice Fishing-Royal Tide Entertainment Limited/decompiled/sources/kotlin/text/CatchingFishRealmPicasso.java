package kotlin.text;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class CatchingFishRealmPicasso {
    public static final int[] CatchingFishParcelableFAB = {R.attr.state_checked};
    public static final int[] CatchingFishSnackbar = new int[0];

    static {
        new Rect();
    }

    public static void CatchingFishParcelableFAB(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CatchingFishParcelableFAB);
        } else {
            drawable.setState(CatchingFishSnackbar);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode CatchingFishSnackbar(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
