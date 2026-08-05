package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class LfKQckgD extends Drawable {
    public final ActionBarContainer qoPGr6Ce;

    public LfKQckgD(ActionBarContainer actionBarContainer) {
        this.qoPGr6Ce = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.qoPGr6Ce;
        if (actionBarContainer.Qr9iLBAD) {
            Drawable drawable = actionBarContainer.b2ZJblxo;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.VgvYg0wo;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.P7K7Inc8;
        if (drawable3 == null || !actionBarContainer.jb9XjC4I) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.qoPGr6Ce;
        if (actionBarContainer.Qr9iLBAD) {
            if (actionBarContainer.b2ZJblxo != null) {
                actionBarContainer.VgvYg0wo.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.VgvYg0wo;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
