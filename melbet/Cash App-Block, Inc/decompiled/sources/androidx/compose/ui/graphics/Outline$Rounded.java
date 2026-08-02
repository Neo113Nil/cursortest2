package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import com.squareup.util.Strings;

/* loaded from: classes.dex */
public final class Outline$Rounded extends ColorKt {
    public final RoundRect roundRect;
    public final AndroidPath roundRectPath;

    public Outline$Rounded(RoundRect roundRect) {
        AndroidPath androidPath;
        this.roundRect = roundRect;
        if (Strings.isSimple(roundRect)) {
            androidPath = null;
        } else {
            androidPath = AndroidPath_androidKt.Path();
            AndroidPath.addRoundRect$default(androidPath, roundRect);
        }
        this.roundRectPath = androidPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Outline$Rounded) {
            return this.roundRect.equals(((Outline$Rounded) obj).roundRect);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.ColorKt
    public final Rect getBounds() {
        RoundRect roundRect = this.roundRect;
        return new Rect(roundRect.left, roundRect.top, roundRect.right, roundRect.bottom);
    }

    public final int hashCode() {
        return this.roundRect.hashCode();
    }
}
