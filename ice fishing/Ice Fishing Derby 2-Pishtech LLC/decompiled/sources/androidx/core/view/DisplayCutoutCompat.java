package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public final class DisplayCutoutCompat {
    private final Object mDisplayCutout;

    public DisplayCutoutCompat(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? MenuCompat$$ExternalSyntheticApiModelOutline0.m(rect, list) : null);
    }

    private DisplayCutoutCompat(Object obj) {
        this.mDisplayCutout = obj;
    }

    public int getSafeInsetTop() {
        int safeInsetTop;
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        safeInsetTop = MenuCompat$$ExternalSyntheticApiModelOutline0.m(this.mDisplayCutout).getSafeInsetTop();
        return safeInsetTop;
    }

    public int getSafeInsetBottom() {
        int safeInsetBottom;
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        safeInsetBottom = MenuCompat$$ExternalSyntheticApiModelOutline0.m(this.mDisplayCutout).getSafeInsetBottom();
        return safeInsetBottom;
    }

    public int getSafeInsetLeft() {
        int safeInsetLeft;
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        safeInsetLeft = MenuCompat$$ExternalSyntheticApiModelOutline0.m(this.mDisplayCutout).getSafeInsetLeft();
        return safeInsetLeft;
    }

    public int getSafeInsetRight() {
        int safeInsetRight;
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        safeInsetRight = MenuCompat$$ExternalSyntheticApiModelOutline0.m(this.mDisplayCutout).getSafeInsetRight();
        return safeInsetRight;
    }

    public List<Rect> getBoundingRects() {
        List<Rect> boundingRects;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        boundingRects = MenuCompat$$ExternalSyntheticApiModelOutline0.m(this.mDisplayCutout).getBoundingRects();
        return boundingRects;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object obj2 = this.mDisplayCutout;
        Object obj3 = ((DisplayCutoutCompat) obj).mDisplayCutout;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.mDisplayCutout;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    static DisplayCutoutCompat wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        return new DisplayCutoutCompat(obj);
    }
}
