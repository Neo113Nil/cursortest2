package m;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f3912a;

    public C0244b(ActionBarContainer actionBarContainer) {
        this.f3912a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3912a;
        if (actionBarContainer.f1775g) {
            Drawable drawable = actionBarContainer.f1774f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1773d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.e;
        if (drawable3 == null || !actionBarContainer.f1776h) {
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
        ActionBarContainer actionBarContainer = this.f3912a;
        if (actionBarContainer.f1775g) {
            if (actionBarContainer.f1774f != null) {
                actionBarContainer.f1773d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1773d;
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
