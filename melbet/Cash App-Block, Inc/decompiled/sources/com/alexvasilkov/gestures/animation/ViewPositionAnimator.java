package com.alexvasilkov.gestures.animation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.alexvasilkov.gestures.GestureControllerForPager;
import com.alexvasilkov.gestures.State;
import com.alexvasilkov.gestures.utils.FloatScroller;
import com.alexvasilkov.gestures.views.GestureImageView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ViewPositionAnimator {
    public final ViewPositionHolder fromPosHolder;
    public final State fromState;
    public boolean isAnimating;
    public final boolean isLeaving;
    public float position;
    public final FloatScroller positionScroller;
    public final GestureControllerForPager toController;
    public final ViewPositionHolder toPosHolder;
    public final State toState;

    static {
        new Matrix();
        new Point();
    }

    public ViewPositionAnimator(GestureImageView gestureImageView) {
        new ArrayList();
        new ArrayList();
        this.positionScroller = new FloatScroller();
        this.fromState = new State();
        this.toState = new State();
        Rect rect = new Rect();
        new RectF();
        new RectF();
        new RectF();
        new RectF();
        new RectF();
        this.position = RecyclerView.DECELERATION_RATE;
        this.isLeaving = true;
        this.isAnimating = false;
        this.fromPosHolder = new ViewPositionHolder();
        this.toPosHolder = new ViewPositionHolder();
        Context context = gestureImageView.getContext();
        for (Context context2 = context; context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof Activity) {
                WindowManager windowManager = ((Activity) context2).getWindowManager();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (Build.VERSION.SDK_INT >= 30) {
                    context.getDisplay().getRealMetrics(displayMetrics);
                } else {
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                }
                rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                GestureControllerForPager gestureControllerForPager = gestureImageView.controller;
                this.toController = gestureControllerForPager;
                int i = 2;
                gestureControllerForPager.stateListeners.add(new GestureImageView.AnonymousClass1(this, i));
                ViewPositionHolder viewPositionHolder = this.toPosHolder;
                ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 21);
                ViewPosition viewPosition = viewPositionHolder.pos;
                GestureImageView gestureImageView2 = viewPositionHolder.view;
                if (gestureImageView2 != null) {
                    gestureImageView2.removeOnAttachStateChangeListener(viewPositionHolder.attachListener);
                    viewPositionHolder.onViewAttached(viewPositionHolder.view, false);
                }
                viewPosition.view.setEmpty();
                viewPosition.viewport.setEmpty();
                viewPosition.image.setEmpty();
                viewPositionHolder.view = null;
                viewPositionHolder.attachListener = null;
                viewPositionHolder.listener = null;
                viewPositionHolder.isPaused = false;
                viewPositionHolder.view = gestureImageView;
                viewPositionHolder.listener = exoPlayerImplInternal$$ExternalSyntheticLambda2;
                StandardMenuPopup.AnonymousClass2 anonymousClass2 = new StandardMenuPopup.AnonymousClass2(viewPositionHolder, i);
                viewPositionHolder.attachListener = anonymousClass2;
                gestureImageView.addOnAttachStateChangeListener(anonymousClass2);
                viewPositionHolder.onViewAttached(gestureImageView, gestureImageView.isAttachedToWindow());
                if (gestureImageView.isLaidOut()) {
                    viewPositionHolder.update();
                }
                ViewPositionHolder viewPositionHolder2 = this.fromPosHolder;
                if (!viewPositionHolder2.isPaused) {
                    viewPositionHolder2.isPaused = true;
                    viewPositionHolder2.update();
                }
                ViewPositionHolder viewPositionHolder3 = this.toPosHolder;
                if (viewPositionHolder3.isPaused) {
                    return;
                }
                viewPositionHolder3.isPaused = true;
                viewPositionHolder3.update();
                return;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3("Illegal context");
        throw null;
    }

    public final void applyCurrentPosition() {
    }

    public final void setState(float f, boolean z, boolean z2) {
        throw new IllegalStateException("You should call enter(...) before calling setState(...)");
    }
}
