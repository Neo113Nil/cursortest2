package m;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4677b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f39120a;

    public C4677b(ActionBarContainer actionBarContainer) {
        this.f39120a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f39120a;
        if (actionBarContainer.f4509z) {
            Drawable drawable = actionBarContainer.f4508y;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4506w;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f4507x;
        if (drawable3 == null || !actionBarContainer.f4501A) {
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
        ActionBarContainer actionBarContainer = this.f39120a;
        if (actionBarContainer.f4509z) {
            if (actionBarContainer.f4508y != null) {
                actionBarContainer.f4506w.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f4506w;
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
