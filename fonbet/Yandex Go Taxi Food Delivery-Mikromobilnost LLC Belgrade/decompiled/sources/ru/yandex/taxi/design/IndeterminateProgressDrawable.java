package ru.yandex.taxi.design;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(¨\u0006-"}, d2 = {"Lru/yandex/taxi/design/IndeterminateProgressDrawable;", "Landroidx/appcompat/graphics/drawable/DrawableWrapperCompat;", "Landroid/graphics/drawable/Animatable;", "Ljava/lang/Runnable;", "Landroid/graphics/drawable/Drawable;", "drawableToAnimate", "", "delta", "", "frequency", "<init>", "(Landroid/graphics/drawable/Drawable;FJ)V", "Lzy11;", "pause", "()V", "resume", "", "isRunning", "()Z", "delay", "startWithDelay", "(J)V", "start", "stop", "run", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "visible", "restart", "setVisible", "(ZZ)Z", "", "tint", "setTint", "(I)V", "mutate", "()Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "F", "J", "Z", "isPaused", "currentRotation", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IndeterminateProgressDrawable extends DrawableWrapperCompat implements Animatable, Runnable {
    private float currentRotation;
    private final float delta;
    private final Drawable drawableToAnimate;
    private final long frequency;
    private boolean isPaused;
    private boolean isRunning;

    public IndeterminateProgressDrawable(Drawable drawable, float f, long j) {
        super(drawable);
        this.drawableToAnimate = drawable;
        this.delta = f;
        this.frequency = j;
    }

    private final void pause() {
        this.isPaused = true;
        unscheduleSelf(this);
    }

    private final void resume() {
        this.isPaused = false;
        run();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.isRunning) {
            canvas.save();
            canvas.rotate(this.currentRotation, getBounds().exactCenterX(), getBounds().exactCenterY());
            this.drawableToAnimate.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.drawableToAnimate.mutate();
        return super.mutate();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.isRunning = true;
        if (this.isPaused) {
            return;
        }
        this.currentRotation += this.delta;
        invalidateSelf();
        scheduleSelf(this, AnimationUtils.currentAnimationTimeMillis() + this.frequency);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void setTint(int tint) {
        this.drawableToAnimate.mutate();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        boolean visible2 = this.drawableToAnimate.setVisible(visible, restart);
        if (visible2 && this.isRunning) {
            if (!visible) {
                pause();
                return visible2;
            }
            if (this.isPaused) {
                resume();
            }
        }
        return visible2;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isPaused = !isVisible();
        this.currentRotation = 0.0f;
        unscheduleSelf(this);
        run();
    }

    public final void startWithDelay(long delay) {
        if (delay <= 0) {
            start();
        } else {
            if (this.isRunning) {
                return;
            }
            this.isPaused = !isVisible();
            this.currentRotation = 0.0f;
            invalidateSelf();
            scheduleSelf(this, AnimationUtils.currentAnimationTimeMillis() + delay);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.isRunning) {
            this.isRunning = false;
            this.isPaused = false;
            unscheduleSelf(this);
        }
    }
}
