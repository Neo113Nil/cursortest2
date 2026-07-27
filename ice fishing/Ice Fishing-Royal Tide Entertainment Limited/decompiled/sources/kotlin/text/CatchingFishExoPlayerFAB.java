package kotlin.text;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerFAB extends Drawable {
    public final ActionBarContainer CatchingFishParcelableFAB;

    public CatchingFishExoPlayerFAB(ActionBarContainer actionBarContainer) {
        this.CatchingFishParcelableFAB = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.CatchingFishParcelableFAB;
        if (actionBarContainer.CatchingFishFragmentHandler) {
            Drawable drawable = actionBarContainer.CatchingFishLayout;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.CatchingFishViewModelScope;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.CatchingFishViewModelFAB;
        if (drawable3 == null || !actionBarContainer.CatchingFishCloudMessaging) {
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
        ActionBarContainer actionBarContainer = this.CatchingFishParcelableFAB;
        if (actionBarContainer.CatchingFishFragmentHandler) {
            if (actionBarContainer.CatchingFishLayout != null) {
                actionBarContainer.CatchingFishViewModelScope.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.CatchingFishViewModelScope;
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
