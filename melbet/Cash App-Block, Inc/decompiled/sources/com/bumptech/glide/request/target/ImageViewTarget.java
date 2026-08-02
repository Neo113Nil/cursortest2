package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Util;
import com.squareup.cash.R;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class ImageViewTarget implements Target {
    public Animatable animatable;
    public final ViewTarget$SizeDeterminer sizeDeterminer;
    public final ImageView view;

    public ImageViewTarget(ImageView imageView) {
        Util.checkNotNull(imageView, "Argument must not be null");
        this.view = imageView;
        this.sizeDeterminer = new ViewTarget$SizeDeterminer(imageView);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final Request getRequest() {
        Object tag = this.view.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof Request) {
                return (Request) tag;
            }
            a$$ExternalSyntheticBUOutline0.m$3("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(SingleRequest singleRequest) {
        ViewTarget$SizeDeterminer viewTarget$SizeDeterminer = this.sizeDeterminer;
        ArrayList arrayList = viewTarget$SizeDeterminer.cbs;
        View view = viewTarget$SizeDeterminer.view;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int targetDimen = viewTarget$SizeDeterminer.getTargetDimen(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int targetDimen2 = viewTarget$SizeDeterminer.getTargetDimen(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((targetDimen > 0 || targetDimen == Integer.MIN_VALUE) && (targetDimen2 > 0 || targetDimen2 == Integer.MIN_VALUE)) {
            singleRequest.onSizeReady(targetDimen, targetDimen2);
            return;
        }
        if (!arrayList.contains(singleRequest)) {
            arrayList.add(singleRequest);
        }
        if (viewTarget$SizeDeterminer.layoutListener == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            CoordinatorLayout.OnPreDrawListener onPreDrawListener = new CoordinatorLayout.OnPreDrawListener(viewTarget$SizeDeterminer);
            viewTarget$SizeDeterminer.layoutListener = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(Drawable drawable) {
        ViewTarget$SizeDeterminer viewTarget$SizeDeterminer = this.sizeDeterminer;
        ViewTreeObserver viewTreeObserver = viewTarget$SizeDeterminer.view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(viewTarget$SizeDeterminer.layoutListener);
        }
        viewTarget$SizeDeterminer.layoutListener = null;
        viewTarget$SizeDeterminer.cbs.clear();
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
        setResource(null);
        this.animatable = null;
        this.view.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadFailed(Drawable drawable) {
        setResource(null);
        this.animatable = null;
        this.view.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadStarted(Drawable drawable) {
        setResource(null);
        this.animatable = null;
        this.view.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj) {
        setResource(obj);
        if (!(obj instanceof Animatable)) {
            this.animatable = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.animatable = animatable;
        animatable.start();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(SingleRequest singleRequest) {
        this.sizeDeterminer.cbs.remove(singleRequest);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(Request request) {
        this.view.setTag(R.id.glide_custom_view_target_tag, request);
    }

    public abstract void setResource(Object obj);

    public final String toString() {
        return "Target for: " + this.view;
    }
}
