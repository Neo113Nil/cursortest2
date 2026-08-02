package com.alexvasilkov.gestures.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.GestureControllerForPager;
import com.alexvasilkov.gestures.R$styleable;
import com.alexvasilkov.gestures.Settings;
import com.alexvasilkov.gestures.State;
import com.alexvasilkov.gestures.animation.ViewPositionAnimator;
import com.fillr.m1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class GestureImageView extends ImageView {
    public final m1 clipBoundsHelper;
    public final m1 clipViewHelper;
    public GestureControllerForPager controller;
    public final Matrix imageMatrix;
    public ViewPositionAnimator positionAnimator;

    /* renamed from: com.alexvasilkov.gestures.views.GestureImageView$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void onStateReset$com$alexvasilkov$gestures$animation$ViewPositionAnimator$2(State state) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GestureImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean isTerminated;
        boolean isTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.clipViewHelper = new m1(this);
        this.clipBoundsHelper = new m1(this);
        this.imageMatrix = new Matrix();
        if (this.controller == null) {
            GestureControllerForPager gestureControllerForPager = new GestureControllerForPager(this);
            ViewConfiguration.get(getContext()).getScaledTouchSlop();
            this.controller = gestureControllerForPager;
        }
        Settings settings = this.controller.settings;
        settings.getClass();
        int i2 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GestureView);
            try {
                settings.movementAreaW = obtainStyledAttributes.getDimensionPixelSize(14, settings.movementAreaW);
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(13, settings.movementAreaH);
                settings.movementAreaH = dimensionPixelSize;
                settings.isMovementAreaSpecified = settings.movementAreaW > 0 && dimensionPixelSize > 0;
                settings.minZoom = obtainStyledAttributes.getFloat(12, settings.minZoom);
                settings.maxZoom = obtainStyledAttributes.getFloat(11, settings.maxZoom);
                settings.doubleTapZoom = obtainStyledAttributes.getFloat(5, settings.doubleTapZoom);
                settings.overzoomFactor = obtainStyledAttributes.getFloat(17, settings.overzoomFactor);
                settings.overscrollDistanceX = obtainStyledAttributes.getDimension(15, settings.overscrollDistanceX);
                settings.overscrollDistanceY = obtainStyledAttributes.getDimension(16, settings.overscrollDistanceY);
                settings.isFillViewport = obtainStyledAttributes.getBoolean(7, settings.isFillViewport);
                settings.gravity = obtainStyledAttributes.getInt(10, settings.gravity);
                settings.fitMethod = CameraSelector$$ExternalSyntheticOutline0.values(5)[obtainStyledAttributes.getInteger(8, CameraSelector$$ExternalSyntheticOutline0.ordinal(settings.fitMethod))];
                settings.boundsType = CameraSelector$$ExternalSyntheticOutline0.values(5)[obtainStyledAttributes.getInteger(1, CameraSelector$$ExternalSyntheticOutline0.ordinal(settings.boundsType))];
                settings.isPanEnabled = obtainStyledAttributes.getBoolean(18, settings.isPanEnabled);
                settings.isFlingEnabled = obtainStyledAttributes.getBoolean(9, settings.isFlingEnabled);
                settings.isZoomEnabled = obtainStyledAttributes.getBoolean(21, settings.isZoomEnabled);
                settings.isRotationEnabled = obtainStyledAttributes.getBoolean(20, settings.isRotationEnabled);
                settings.isRestrictRotation = obtainStyledAttributes.getBoolean(19, settings.isRestrictRotation);
                settings.isDoubleTapEnabled = obtainStyledAttributes.getBoolean(4, settings.isDoubleTapEnabled);
                settings.exitType = obtainStyledAttributes.getBoolean(6, true) ? settings.exitType : 4;
                settings.animationsDuration = obtainStyledAttributes.getInt(0, (int) settings.animationsDuration);
                if (obtainStyledAttributes.getBoolean(3, false)) {
                    settings.gesturesDisableCount++;
                }
                if (obtainStyledAttributes.getBoolean(2, false)) {
                    settings.boundsDisableCount++;
                }
                if (obtainStyledAttributes instanceof AutoCloseable) {
                    obtainStyledAttributes.close();
                } else if (obtainStyledAttributes instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) obtainStyledAttributes;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated2 = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    obtainStyledAttributes.recycle();
                }
            } catch (Throwable th) {
                if (obtainStyledAttributes != 0) {
                    try {
                        if (obtainStyledAttributes instanceof AutoCloseable) {
                            obtainStyledAttributes.close();
                        } else if (obtainStyledAttributes instanceof ExecutorService) {
                            ExecutorService executorService2 = (ExecutorService) obtainStyledAttributes;
                            if (executorService2 != ForkJoinPool.commonPool() && !(isTerminated = executorService2.isTerminated())) {
                                executorService2.shutdown();
                                while (!isTerminated) {
                                    try {
                                        isTerminated = executorService2.awaitTermination(1L, timeUnit);
                                    } catch (InterruptedException unused2) {
                                        if (i2 == 0) {
                                            executorService2.shutdownNow();
                                            i2 = 1;
                                        }
                                    }
                                }
                                if (i2 != 0) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        } else {
                            obtainStyledAttributes.recycle();
                        }
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
        this.controller.stateListeners.add(new AnonymousClass1(this, i2));
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.clipBoundsHelper.onPreDraw(canvas);
        this.clipViewHelper.onPreDraw(canvas);
        super.draw(canvas);
    }

    public final ViewPositionAnimator getPositionAnimator() {
        if (this.positionAnimator == null) {
            this.positionAnimator = new ViewPositionAnimator(this);
        }
        return this.positionAnimator;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Settings settings = this.controller.settings;
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
        settings.viewportW = paddingLeft;
        settings.viewportH = paddingTop;
        this.controller.resetState();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.controller.onTouch(this, motionEvent);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.controller == null) {
            GestureControllerForPager gestureControllerForPager = new GestureControllerForPager(this);
            ViewConfiguration.get(getContext()).getScaledTouchSlop();
            this.controller = gestureControllerForPager;
        }
        Settings settings = this.controller.settings;
        float f = settings.imageW;
        float f2 = settings.imageH;
        if (drawable == null) {
            settings.imageW = 0;
            settings.imageH = 0;
        } else if (drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            boolean z = settings.isMovementAreaSpecified;
            int i = z ? settings.movementAreaW : settings.viewportW;
            int i2 = z ? settings.movementAreaH : settings.viewportH;
            settings.imageW = i;
            settings.imageH = i2;
        } else {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            settings.imageW = intrinsicWidth;
            settings.imageH = intrinsicHeight;
        }
        float f3 = settings.imageW;
        float f4 = settings.imageH;
        if (f3 <= RecyclerView.DECELERATION_RATE || f4 <= RecyclerView.DECELERATION_RATE || f <= RecyclerView.DECELERATION_RATE || f2 <= RecyclerView.DECELERATION_RATE) {
            this.controller.resetState();
            return;
        }
        float min = Math.min(f / f3, f2 / f4);
        GestureControllerForPager gestureControllerForPager2 = this.controller;
        gestureControllerForPager2.stateController.zoomPatch = min;
        gestureControllerForPager2.updateState();
        this.controller.stateController.zoomPatch = RecyclerView.DECELERATION_RATE;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(getContext().getDrawable(i));
    }

    public GestureImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureImageView(Context context) {
        this(context, null, 0);
    }
}
