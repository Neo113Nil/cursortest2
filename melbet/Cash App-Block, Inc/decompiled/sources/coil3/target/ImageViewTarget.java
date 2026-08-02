package coil3.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.transition.TransitionTarget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ImageViewTarget implements TransitionTarget, DefaultLifecycleObserver, Target {
    public boolean isStarted;
    public final ImageView view;

    public ImageViewTarget(ImageView imageView) {
        this.view = imageView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && Intrinsics.areEqual(this.view, ((ImageViewTarget) obj).view);
    }

    @Override // coil3.transition.TransitionTarget
    public final Drawable getDrawable() {
        return this.view.getDrawable();
    }

    @Override // coil3.transition.TransitionTarget
    public final View getView() {
        return this.view;
    }

    public final int hashCode() {
        return this.view.hashCode();
    }

    @Override // coil3.target.Target
    public final void onError(Image image) {
        updateImage(image);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.isStarted = true;
        updateAnimation();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.isStarted = false;
        updateAnimation();
    }

    @Override // coil3.target.Target
    public final void onSuccess(Image image) {
        updateImage(image);
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.view + ")";
    }

    public final void updateAnimation() {
        Object drawable = this.view.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void updateImage(Image image) {
        ImageView imageView = this.view;
        Drawable asDrawable = image != null ? Image_androidKt.asDrawable(image, imageView.getResources()) : null;
        Object drawable = imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(asDrawable);
        updateAnimation();
    }

    @Override // coil3.target.Target
    public final void onStart(Image image) {
        updateImage(image);
    }
}
