package coil3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* loaded from: classes3.dex */
public final class ImageDrawable extends Drawable {
    public final /* synthetic */ int $r8$classId;
    public final Object image;

    public /* synthetic */ ImageDrawable(Object obj, int i) {
        this.$r8$classId = i;
        this.image = obj;
    }

    private final void setAlpha$androidx$appcompat$widget$ActionBarBackgroundDrawable(int i) {
    }

    private final void setAlpha$coil3$ImageDrawable(int i) {
    }

    private final void setColorFilter$androidx$appcompat$widget$ActionBarBackgroundDrawable(ColorFilter colorFilter) {
    }

    private final void setColorFilter$coil3$ImageDrawable(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.$r8$classId;
        Object obj = this.image;
        switch (i) {
            case 0:
                ((Image) obj).draw(canvas);
                return;
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) obj;
                if (actionBarContainer.mIsSplit) {
                    Drawable drawable = actionBarContainer.mSplitBackground;
                    if (drawable != null) {
                        drawable.draw(canvas);
                        return;
                    }
                    return;
                }
                Drawable drawable2 = actionBarContainer.mBackground;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                Drawable drawable3 = actionBarContainer.mStackedBackground;
                if (drawable3 == null || !actionBarContainer.mIsStacked) {
                    return;
                }
                drawable3.draw(canvas);
                return;
            default:
                canvas.getClass();
                Drawable drawable4 = (Drawable) obj;
                float intrinsicWidth = drawable4.getIntrinsicWidth();
                float intrinsicHeight = drawable4.getIntrinsicHeight();
                float max = Math.max(getBounds().width() / intrinsicWidth, getBounds().height() / intrinsicHeight);
                drawable4.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
                Rect bounds = getBounds();
                bounds.getClass();
                int save = canvas.save();
                canvas.clipRect(bounds);
                try {
                    drawable4.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(save);
                }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.$r8$classId) {
            case 0:
                return 0;
            case 1:
                return 0;
            default:
                return ((Drawable) this.image).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.$r8$classId) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.image;
                if (!actionBarContainer.mIsSplit) {
                    Drawable drawable = actionBarContainer.mBackground;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        break;
                    }
                } else if (actionBarContainer.mSplitBackground != null) {
                    actionBarContainer.mBackground.getOutline(outline);
                    break;
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.$r8$classId) {
            case 0:
            case 1:
                break;
            default:
                ((Drawable) this.image).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.$r8$classId) {
            case 0:
            case 1:
                break;
            default:
                ((Drawable) this.image).setColorFilter(colorFilter);
                break;
        }
    }
}
