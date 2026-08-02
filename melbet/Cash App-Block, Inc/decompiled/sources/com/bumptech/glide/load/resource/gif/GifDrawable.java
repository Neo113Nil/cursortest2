package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.bumptech.glide.util.Util;
import com.google.android.material.floatingactionbutton.BorderDrawable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class GifDrawable extends Drawable implements Animatable {
    public boolean applyGravity;
    public Rect destRect;
    public boolean isRecycled;
    public boolean isRunning;
    public boolean isStarted;
    public int loopCount;
    public Paint paint;
    public final GifState state;
    public boolean isVisible = true;
    public final int maxLoopCount = -1;

    public GifDrawable(GifState gifState) {
        this.state = gifState;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.isRecycled) {
            return;
        }
        if (this.applyGravity) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.destRect == null) {
                this.destRect = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.destRect);
            this.applyGravity = false;
        }
        GifFrameLoader gifFrameLoader = (GifFrameLoader) this.state.frameLoader;
        GifFrameLoader.DelayTarget delayTarget = gifFrameLoader.current;
        Bitmap bitmap = delayTarget != null ? delayTarget.resource : gifFrameLoader.firstFrame;
        if (this.destRect == null) {
            this.destRect = new Rect();
        }
        Rect rect = this.destRect;
        if (this.paint == null) {
            this.paint = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.state;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((GifFrameLoader) this.state.frameLoader).height;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((GifFrameLoader) this.state.frameLoader).width;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.isRunning;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyGravity = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.paint == null) {
            this.paint = new Paint(2);
        }
        this.paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.paint == null) {
            this.paint = new Paint(2);
        }
        this.paint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Util.checkArgument("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.isRecycled);
        this.isVisible = z;
        if (!z) {
            this.isRunning = false;
            GifFrameLoader gifFrameLoader = (GifFrameLoader) this.state.frameLoader;
            ArrayList arrayList = gifFrameLoader.callbacks;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gifFrameLoader.isRunning = false;
            }
        } else if (this.isStarted) {
            startRunning();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.isStarted = true;
        this.loopCount = 0;
        if (this.isVisible) {
            startRunning();
        }
    }

    public final void startRunning() {
        Util.checkArgument("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.isRecycled);
        GifFrameLoader gifFrameLoader = (GifFrameLoader) this.state.frameLoader;
        if (gifFrameLoader.gifDecoder.header.frameCount == 1) {
            invalidateSelf();
            return;
        }
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        ArrayList arrayList = gifFrameLoader.callbacks;
        if (gifFrameLoader.isCleared) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot subscribe twice in a row");
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !gifFrameLoader.isRunning) {
            gifFrameLoader.isRunning = true;
            gifFrameLoader.isCleared = false;
            gifFrameLoader.loadNextFrame();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.isStarted = false;
        this.isRunning = false;
        GifFrameLoader gifFrameLoader = (GifFrameLoader) this.state.frameLoader;
        ArrayList arrayList = gifFrameLoader.callbacks;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gifFrameLoader.isRunning = false;
        }
    }

    public final class GifState extends Drawable.ConstantState {
        public final /* synthetic */ int $r8$classId;
        public final Object frameLoader;

        public GifState(BorderDrawable borderDrawable) {
            this.$r8$classId = 2;
            this.frameLoader = borderDrawable;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            switch (this.$r8$classId) {
                case 1:
                    return ((Drawable.ConstantState) this.frameLoader).canApplyTheme();
                default:
                    return super.canApplyTheme();
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            switch (this.$r8$classId) {
                case 0:
                    return 0;
                case 1:
                    return ((Drawable.ConstantState) this.frameLoader).getChangingConfigurations();
                default:
                    return 0;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            switch (this.$r8$classId) {
                case 0:
                    return new GifDrawable(this);
                case 1:
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
                    Drawable newDrawable = ((Drawable.ConstantState) this.frameLoader).newDrawable(resources);
                    animatedVectorDrawableCompat.mDelegateDrawable = newDrawable;
                    newDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
                    return animatedVectorDrawableCompat;
                default:
                    return super.newDrawable(resources);
            }
        }

        public /* synthetic */ GifState(Object obj, int i) {
            this.$r8$classId = i;
            this.frameLoader = obj;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            int i = this.$r8$classId;
            Object obj = this.frameLoader;
            switch (i) {
                case 0:
                    return new GifDrawable(this);
                case 1:
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
                    Drawable newDrawable = ((Drawable.ConstantState) obj).newDrawable();
                    animatedVectorDrawableCompat.mDelegateDrawable = newDrawable;
                    newDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
                    return animatedVectorDrawableCompat;
                default:
                    return (BorderDrawable) obj;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            switch (this.$r8$classId) {
                case 1:
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
                    Drawable newDrawable = ((Drawable.ConstantState) this.frameLoader).newDrawable(resources, theme);
                    animatedVectorDrawableCompat.mDelegateDrawable = newDrawable;
                    newDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
                    return animatedVectorDrawableCompat;
                default:
                    return super.newDrawable(resources, theme);
            }
        }
    }
}
