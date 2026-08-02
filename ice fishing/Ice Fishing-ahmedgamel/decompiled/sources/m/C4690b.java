package m;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4690b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f39177a;

    public C4690b(ActionBarContainer actionBarContainer) {
        this.f39177a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f39177a;
        if (actionBarContainer.f4477z) {
            Drawable drawable = actionBarContainer.f4476y;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4474w;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f4475x;
        if (drawable3 == null || !actionBarContainer.f4469A) {
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
        ActionBarContainer actionBarContainer = this.f39177a;
        if (actionBarContainer.f4477z) {
            if (actionBarContainer.f4476y != null) {
                actionBarContainer.f4474w.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f4474w;
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
