package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import defpackage.lw31;
import defpackage.s2u0;
import defpackage.uwc0;
import defpackage.vc2;

/* loaded from: classes4.dex */
public class PlatformViewWrapper extends FrameLayout {
    private static final String TAG = "PlatformViewWrapper";
    private ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private int left;
    private int prevLeft;
    private int prevTop;
    private uwc0 renderTarget;
    private int top;
    private vc2 touchProcessor;

    public PlatformViewWrapper(Context context, uwc0 uwc0Var) {
        this(context);
        this.renderTarget = uwc0Var;
        Surface surface = uwc0Var.getSurface();
        if (surface != null) {
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            try {
                lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            } finally {
                surface.unlockCanvasAndPost(lockHardwareCanvas);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        uwc0 uwc0Var = this.renderTarget;
        if (uwc0Var == null) {
            super.draw(canvas);
            Log.e(TAG, "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = uwc0Var.getSurface();
        if (!surface.isValid()) {
            Log.e(TAG, "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.renderTarget.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.activeFocusListener;
    }

    public int getRenderTargetHeight() {
        uwc0 uwc0Var = this.renderTarget;
        if (uwc0Var != null) {
            return uwc0Var.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        uwc0 uwc0Var = this.renderTarget;
        if (uwc0Var != null) {
            return uwc0Var.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.touchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.left;
            this.prevLeft = i;
            int i2 = this.top;
            this.prevTop = i2;
            matrix.postTranslate(i, i2);
        } else if (action != 2) {
            matrix.postTranslate(this.left, this.top);
        } else {
            matrix.postTranslate(this.prevLeft, this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
        }
        this.touchProcessor.c(motionEvent, matrix);
        return true;
    }

    public void release() {
        uwc0 uwc0Var = this.renderTarget;
        if (uwc0Var != null) {
            uwc0Var.release();
            this.renderTarget = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void resizeRenderTarget(int i, int i2) {
        uwc0 uwc0Var = this.renderTarget;
        if (uwc0Var != null) {
            uwc0Var.a(i, i2);
        }
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.left = layoutParams.leftMargin;
        this.top = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewWrapper.1
                @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                public void onGlobalFocusChanged(View view, View view2) {
                    View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    PlatformViewWrapper platformViewWrapper = PlatformViewWrapper.this;
                    onFocusChangeListener2.onFocusChange(platformViewWrapper, lw31.c(platformViewWrapper, new s2u0(29)));
                }
            };
            this.activeFocusListener = onGlobalFocusChangeListener;
            viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void setTouchProcessor(vc2 vc2Var) {
        this.touchProcessor = vc2Var;
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.activeFocusListener) == null) {
            return;
        }
        this.activeFocusListener = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public PlatformViewWrapper(Context context) {
        super(context);
        setWillNotDraw(false);
    }
}
