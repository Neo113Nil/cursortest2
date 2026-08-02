package com.alexvasilkov.gestures.animation;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.animation.ImageViewHelper;
import com.alexvasilkov.gestures.utils.MathUtils;
import com.alexvasilkov.gestures.views.GestureImageView;

/* loaded from: classes3.dex */
public final class ViewPositionHolder implements ViewTreeObserver.OnPreDrawListener {
    public StandardMenuPopup.AnonymousClass2 attachListener;
    public boolean isPaused;
    public ExoPlayerImplInternal$$ExternalSyntheticLambda2 listener;
    public final ViewPosition pos = new ViewPosition();
    public GestureImageView view;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        update();
        return true;
    }

    public final void onViewAttached(View view, boolean z) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        if (z) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    public final void update() {
        float f;
        float f2;
        GestureImageView gestureImageView = this.view;
        if (gestureImageView == null || this.listener == null || this.isPaused) {
            return;
        }
        ViewPosition viewPosition = this.pos;
        Rect rect = viewPosition.visible;
        Rect rect2 = viewPosition.image;
        Rect rect3 = viewPosition.viewport;
        Rect rect4 = viewPosition.view;
        boolean z = false;
        if (gestureImageView.getWindowToken() != null) {
            Matrix matrix = ViewPosition.tmpMatrix;
            float totalScaleX = ViewPosition.getTotalScaleX(gestureImageView);
            float totalScaleY = ViewPosition.getTotalScaleY(gestureImageView);
            float f3 = RecyclerView.DECELERATION_RATE;
            matrix.setScale(totalScaleX, totalScaleY, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            Rect rect5 = ViewPosition.tmpViewRect;
            rect5.set(rect4);
            int[] iArr = ViewPosition.tmpLocation;
            gestureImageView.getLocationInWindow(iArr);
            rect4.set(0, 0, gestureImageView.getWidth(), gestureImageView.getHeight());
            MathUtils.mapIntRect(matrix, rect4);
            rect4.offset(iArr[0], iArr[1]);
            rect3.set(gestureImageView.getPaddingLeft(), gestureImageView.getPaddingTop(), gestureImageView.getWidth() - gestureImageView.getPaddingRight(), gestureImageView.getHeight() - gestureImageView.getPaddingBottom());
            MathUtils.mapIntRect(matrix, rect3);
            rect3.offset(iArr[0], iArr[1]);
            if (!gestureImageView.getGlobalVisibleRect(rect)) {
                rect.set(rect4.centerX(), rect4.centerY(), rect4.centerX() + 1, rect4.centerY() + 1);
            }
            Drawable drawable = gestureImageView.getDrawable();
            if (drawable == null) {
                rect2.set(rect3);
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                ImageView.ScaleType scaleType = gestureImageView.getScaleType();
                int width = rect3.width();
                int height = rect3.height();
                Matrix imageMatrix = gestureImageView.getImageMatrix();
                RectF rectF = ImageViewHelper.tmpSrc;
                if (ImageView.ScaleType.CENTER == scaleType) {
                    matrix.setTranslate((width - intrinsicWidth) * 0.5f, (height - intrinsicHeight) * 0.5f);
                } else if (ImageView.ScaleType.CENTER_CROP == scaleType) {
                    if (intrinsicWidth * height > width * intrinsicHeight) {
                        f = height / intrinsicHeight;
                        f2 = 0.0f;
                        f3 = (width - (intrinsicWidth * f)) * 0.5f;
                    } else {
                        f = width / intrinsicWidth;
                        f2 = (height - (intrinsicHeight * f)) * 0.5f;
                    }
                    matrix.setScale(f, f);
                    matrix.postTranslate(f3, f2);
                } else if (ImageView.ScaleType.CENTER_INSIDE == scaleType) {
                    float min = (intrinsicWidth > width || intrinsicHeight > height) ? Math.min(width / intrinsicWidth, height / intrinsicHeight) : 1.0f;
                    matrix.setScale(min, min);
                    matrix.postTranslate((width - (intrinsicWidth * min)) * 0.5f, (height - (intrinsicHeight * min)) * 0.5f);
                } else {
                    int i = ImageViewHelper.AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType[scaleType.ordinal()];
                    Matrix.ScaleToFit scaleToFit = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : Matrix.ScaleToFit.END : Matrix.ScaleToFit.CENTER : Matrix.ScaleToFit.START : Matrix.ScaleToFit.FILL;
                    if (scaleToFit == null) {
                        matrix.set(imageMatrix);
                    } else {
                        RectF rectF2 = ImageViewHelper.tmpSrc;
                        rectF2.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, intrinsicWidth, intrinsicHeight);
                        RectF rectF3 = ImageViewHelper.tmpDst;
                        rectF3.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, width, height);
                        matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                        rect2.set(0, 0, intrinsicWidth, intrinsicHeight);
                        MathUtils.mapIntRect(matrix, rect2);
                        rect2.offset(rect3.left, rect3.top);
                    }
                }
                rect2.set(0, 0, intrinsicWidth, intrinsicHeight);
                MathUtils.mapIntRect(matrix, rect2);
                rect2.offset(rect3.left, rect3.top);
            }
            z = !rect5.equals(rect4);
        }
        if (z) {
            Object obj = this.listener.f$0;
        }
    }
}
