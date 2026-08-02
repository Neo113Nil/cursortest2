package ru.yandex.taxi.widget.background;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\"R\u001a\u0010'\u001a\u00020&8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006;"}, d2 = {"Lru/yandex/taxi/widget/background/PathFillDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Lzy11;", "invalidateBitmapIfNeeded", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "clearBitmap", "freeResources", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "onDraw", "", "layoutDirection", "", "onLayoutDirectionChanged", "(I)Z", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "getAlpha", "()I", "getColorFilter", "()Landroid/graphics/ColorFilter;", "getOpacity", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap;", "bitmapCanvas", "Landroid/graphics/Canvas;", "currentLayoutDirection", CA20Status.STATUS_USER_I, "getNeedMirroring", "()Z", "needMirroring", "isRtl", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class PathFillDrawable extends Drawable {
    public static final int $stable = 8;
    private Bitmap bitmap;
    private final Canvas bitmapCanvas;
    private int currentLayoutDirection;
    private final Paint paint;
    private final Path path = new Path();

    public PathFillDrawable() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.paint = paint;
        this.bitmapCanvas = new Canvas();
    }

    private final boolean getNeedMirroring() {
        return isRtl() && isAutoMirrored();
    }

    private final void invalidateBitmapIfNeeded() {
        if (this.bitmap != null || getBounds().isEmpty()) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        this.bitmap = createBitmap;
        this.bitmapCanvas.setBitmap(createBitmap);
        onDraw(this.bitmapCanvas);
    }

    public final void clearBitmap() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            this.bitmapCanvas.setBitmap(null);
            bitmap.recycle();
        }
        this.bitmap = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        invalidateBitmapIfNeeded();
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().left, getBounds().top, (Paint) null);
        }
    }

    public void freeResources() {
        clearBitmap();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.paint.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final Path getPath() {
        return this.path;
    }

    public final boolean isRtl() {
        return this.currentLayoutDirection == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            if (bitmap.getWidth() == bounds.width() && bitmap.getHeight() == bounds.height()) {
                return;
            }
            clearBitmap();
        }
    }

    public void onDraw(Canvas canvas) {
        if (getNeedMirroring()) {
            canvas.save();
            canvas.translate(getBounds().width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        canvas.drawPath(this.path, this.paint);
        if (getNeedMirroring()) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int layoutDirection) {
        boolean z = this.currentLayoutDirection != layoutDirection;
        this.currentLayoutDirection = layoutDirection;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        PorterDuffColorFilter porterDuffColorFilter = tint != null ? new PorterDuffColorFilter(tint.getDefaultColor(), PorterDuff.Mode.SRC_ATOP) : null;
        if (jl40.l(getColorFilter(), porterDuffColorFilter)) {
            return;
        }
        setColorFilter(porterDuffColorFilter);
    }
}
